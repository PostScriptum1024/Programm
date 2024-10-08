package ru.mishin.MySecondSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.mishin.MySecondSpringBoot.exception.ValidationFailedException;

import javax.naming.Binding;

@Service
public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailedException;
}
