package pl.mradziewicz.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.mradziewicz.course.service.GetPriceCrypto;

import java.math.BigDecimal;

@RestController
public class CryptoCurrency {

    @Autowired
    private GetPriceCrypto getPriceCrypto;

    @GetMapping("/price")
    public String getCostCrypto(){
        return getPriceCrypto.calculatePrice();
    }
}
