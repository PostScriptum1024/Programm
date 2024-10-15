package ru.mishin.MySecondSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.mishin.MySecondSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}
