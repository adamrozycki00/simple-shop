package pl.adaroz.springboot2.homework2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import pl.adaroz.springboot2.homework2.config.Rates;
import pl.adaroz.springboot2.homework2.service.CartService;

@Controller
@Profile("PLUS")
public class PlusController {

    @Autowired
    private CartService cartService;

    @Autowired
    private Rates rates;

    @EventListener(ApplicationReadyEvent.class)
    public void doShopping() {
        cartService.initProducts();
        cartService.addVat(rates.getVat());
        cartService.printTotalPrice();
    }

}
