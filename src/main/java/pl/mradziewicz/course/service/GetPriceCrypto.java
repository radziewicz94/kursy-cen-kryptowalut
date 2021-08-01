package pl.mradziewicz.course.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.mradziewicz.course.controller.CryptoCurrency;
import pl.mradziewicz.course.model.CryptoCurrenctDto;

import java.math.BigDecimal;

@Service
public class GetPriceCrypto {
    private CalculateService calculate = new CalculateService();
    public static final String uri = "https://api.binance.com/api/v3/ticker/price?symbol=SHIBEUR";

    public BigDecimal calculatePrice(){
        return getValueCrypto().getPrice();
    }
    private CryptoCurrenctDto getValueCrypto(){
        RestTemplate restTemplate = new RestTemplate();
        CryptoCurrenctDto getValue = restTemplate.getForObject(uri, CryptoCurrenctDto.class);

        return getValue;
    }
}
