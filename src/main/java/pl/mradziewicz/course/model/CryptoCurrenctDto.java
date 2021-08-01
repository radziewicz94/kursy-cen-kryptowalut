package pl.mradziewicz.course.model;

import org.springframework.stereotype.Controller;

import java.math.BigDecimal;

@Controller
public class CryptoCurrenctDto {
    private String symbol;
    private BigDecimal price;

    CryptoCurrenctDto() {
    }

    CryptoCurrenctDto(final String symbol, final BigDecimal price) {
        this.symbol = symbol;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    void setSymbol(final String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getPrice() {
        return price;
    }

    void setPrice(final BigDecimal price) {
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
