package ru.mishin.MySecondSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.mishin.MySecondSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
