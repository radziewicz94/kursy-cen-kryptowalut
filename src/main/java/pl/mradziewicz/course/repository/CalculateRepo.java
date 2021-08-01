package pl.mradziewicz.course.repository;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface CalculateRepo {
    BigDecimal multiply(BigDecimal a, BigDecimal b);
}
