package pl.mradziewicz.course.service;

import org.springframework.stereotype.Service;
import pl.mradziewicz.course.repository.CalculateRepo;

import java.math.BigDecimal;

@Service
public class CalculateService implements CalculateRepo {

    @Override
    public BigDecimal multiply(final BigDecimal a, final BigDecimal b) {
        return BigDecimal.valueOf(0);
    }
}
