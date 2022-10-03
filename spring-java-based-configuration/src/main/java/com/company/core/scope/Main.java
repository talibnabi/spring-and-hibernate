package com.company.core.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class);
        Cart cart1 = context.getBean(Cart.class);
        Product laptop = context.getBean("laptop", Product.class);
        cart1.addProduct(laptop);

        System.out.println(cart1.getProductList());

        Cart cart2 = context.getBean(Cart.class);
        Product mobile = context.getBean("mobile", Product.class);
        cart2.addProduct(mobile);
        System.out.println(cart2.getProductList());
    }
}
