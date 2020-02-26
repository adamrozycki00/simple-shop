package pl.adaroz.springboot2.homework2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import pl.adaroz.springboot2.homework2.service.CartService;

@Controller
public class CartController {

    @Autowired
    private CartService cartService;

    @EventListener(ApplicationReadyEvent.class)
    public void doShopping() {
        cartService.initProducts();
        cartService.printTotalPrice();
    }

}
