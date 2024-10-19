package ru.mishin.MySecondSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.mishin.MySecondSpringBoot.model.Positions;

@Service
public interface AnnualBonusService {
    double calculate(Positions positions, double salary, double bonus, int workDays);
    double calculateQuarterlyPremium(Positions positions, double salary, double bonus, int workDays);

}
