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

    @GetMapping("/")
    public String getCostCrypto(){
        double value = Double.parseDouble(String.valueOf(getPriceCrypto.calculatePrice())) * 5_129_320.138_197_20;
        return "Cena kupna ShibuIno " + getPriceCrypto.calculatePrice()
        + "\n" + " Cena ogólna za ilość waluty " + value;
    }
    //5129320.13819720
}
