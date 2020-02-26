package pl.adaroz.springboot2.homework2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.adaroz.springboot2.homework2.domain.Cart;
import pl.adaroz.springboot2.homework2.domain.Product;

import java.util.List;
import java.util.Random;

@Service
public class CartService {

    @Autowired
    private Cart cart;

    public void initProducts() {
        List<Product> products = cart.getProducts();
        Random random = new Random();
        products.add(new Product("apples", random.nextInt(251) + 50));
        products.add(new Product("oranges", random.nextInt(251) + 50));
        products.add(new Product("bread", random.nextInt(251) + 50));
        products.add(new Product("chicken", random.nextInt(251) + 50));
        products.add(new Product("cookies", random.nextInt(251) + 50));
    }

    public void printTotalPrice() {
        List<Product> products = cart.getProducts();
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        System.out.println("Total price: " + total);
    }

}
