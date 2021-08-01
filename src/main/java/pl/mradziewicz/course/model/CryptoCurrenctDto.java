package pl.mradziewicz.course.model;

import org.springframework.stereotype.Controller;

import java.math.BigDecimal;

@Controller
public class CryptoCurrenctDto {
    private String symbol;
    private String price;

    CryptoCurrenctDto() {
    }

    CryptoCurrenctDto(final String symbol, final String price) {
        this.symbol = symbol;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    void setSymbol(final String symbol) {
        this.symbol = symbol;
    }

    public String getPrice() {
        return price;
    }

    void setPrice(final String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CryptoCurrenctDto{" +
                "symbol='" + symbol + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
