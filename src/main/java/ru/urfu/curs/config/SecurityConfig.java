package ru.urfu.curs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    @Bean
    public static PasswordEncoder passwordEncoder() { return new BCryptPasswordEncoder(); }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable).authorizeHttpRequests(a -> {
            a.requestMatchers("/index").permitAll();
            a.requestMatchers("/register/**").permitAll();
            a.requestMatchers("/users").hasRole("ADMIN");
            a.requestMatchers("/actuator/**").hasRole("ADMIN");
            a.requestMatchers("/product/create").not().hasRole("READ_ONLY");
            a.requestMatchers("/product/edit/**").not().hasRole("READ_ONLY");
            a.requestMatchers("/product/save/**").not().hasRole("READ_ONLY");
            a.requestMatchers("/product/delete/**").not().hasRole("READ_ONLY");
            a.requestMatchers("/product/shop/create").not().hasRole("READ_ONLY");
            a.requestMatchers("/product/shop/edit/**").not().hasRole("READ_ONLY");
            a.requestMatchers("/product/shop/save/**").not().hasRole("READ_ONLY");
            a.requestMatchers("/shop/create").not().hasRole("READ_ONLY");
            a.requestMatchers("/shop/edit/**").not().hasRole("READ_ONLY");
            a.requestMatchers("/shop/save/**").not().hasRole("READ_ONLY");
            a.requestMatchers("/shop/delete/**").not().hasRole("READ_ONLY");
            a.requestMatchers("/list/create").not().hasRole("READ_ONLY");
            a.requestMatchers("/list/add/**").not().hasRole("READ_ONLY");
            a.requestMatchers("/list/delete/**").not().hasRole("READ_ONLY");
            a.requestMatchers("/list/add/save").not().hasRole("READ_ONLY");
            a.anyRequest().authenticated();
        }).formLogin(form -> {
            form.loginPage("/login");
            form.loginProcessingUrl("/login");
            form.defaultSuccessUrl("/index");
            form.permitAll();
        }).logout(l -> l.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).permitAll());
        return http.build();
    }
}
