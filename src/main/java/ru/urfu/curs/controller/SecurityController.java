package ru.urfu.curs.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.urfu.curs.dto.UserDto;
import ru.urfu.curs.dto.UserItemDto;
import ru.urfu.curs.dto.UserTableDto;
import ru.urfu.curs.entity.User;
import ru.urfu.curs.service.UserService;
import ru.urfu.curs.utility.RoleEnum;

import java.util.Objects;

@Controller
public class SecurityController {
    private UserService userService;
    public SecurityController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/about")
    public String about() { return "about"; }

    @GetMapping("/index")
    public String index() { return "index"; }

    @GetMapping("/login")
    public String login() { return "login"; }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        UserDto dto = new UserDto();
        model.addAttribute("user", dto);
        return "register";
    }

    @GetMapping("/users")
    public ModelAndView users() {
        var mav = new ModelAndView("users");
        mav.addObject("table", UserTableDto.builder()
                .currentId(userService.getUserId())
                .users(userService.findAllUsers().stream().map(u -> UserItemDto.builder()
                        .id(u.getId())
                        .name(u.getName())
                        .email(u.getEmail())
                        .isAdmin(u.getRoles().stream().anyMatch(r -> Objects.equals(r.getName(), RoleEnum.ADMIN.getRoleName())))
                        .isUser(u.getRoles().stream().anyMatch(r -> Objects.equals(r.getName(), RoleEnum.USER.getRoleName())))
                        .isReadOnly(u.getRoles().stream().anyMatch(r -> Objects.equals(r.getName(), RoleEnum.READ_ONLY.getRoleName())))
                        .build()
                ).toList())
                .build());
        return mav;
    }

    @PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("user") UserDto dto, BindingResult result, Model model) {
        User existingUser = userService.findUserByEmail(dto.getEmail());
        if (existingUser != null && existingUser.getEmail() != null && !existingUser.getEmail().isEmpty()) {
            result.rejectValue("email", "На этот адрес уже зарегистрирована учетная запись");
        }
        if (result.hasErrors()) {
            model.addAttribute("user", dto);
            return "/register";
        }

        userService.SaveUser(dto);
        return "redirect:/register?success";
    }

    @GetMapping("/users/role/grant")
    public String grant(@RequestParam Long id, @RequestParam String role) {
        userService.grant(id, RoleEnum.valueOf(role));
        return "redirect:/users";
    }
    @GetMapping("/users/role/revoke")
    public String revoke(@RequestParam Long id, @RequestParam String role) {
        userService.revoke(id, RoleEnum.valueOf(role));
        return "redirect:/users";
    }
}
