package pl.adaroz.springboot2.homework2.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rates {

    @Value("${rates.vat}")
    private double vat;

    @Value("${rates.discount}")
    private double discount;

    public double getVat() {
        return vat;
    }

    public double getDiscount() {
        return discount;
    }
}
