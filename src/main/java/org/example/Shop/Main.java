package org.example.Shop;

import org.example.Shop.exception.ProductNotFoundException;
import org.example.Shop.exception.QuantityIsNegativeException;
import org.example.Shop.exception.UserNotFoundException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Marcket marcket = new Marcket();
        List<User> users= marcket.getUsers();
        int orderId1 = 0;
        int orderId2 = 0;
        try {
            orderId1 = marcket.createOrder(users.get(1));
//            orderId2 = marcket.createOrder(new User("Alex",22, "234422"));
            marcket.addProductToOrder(orderId1, marcket.getProducts().get(0),5);
            System.out.println(marcket.getOrders());
        } catch (UserNotFoundException | QuantityIsNegativeException | ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("=================================");

        try {
            orderId2 = marcket.createOrder(new User("Alex",Gender.Man, 22, "234422"));
            marcket.addProductToOrder(orderId1, marcket.getProducts().get(0),5);
        } catch (UserNotFoundException | ProductNotFoundException | QuantityIsNegativeException e) {
            System.out.println(e.getMessage());;
        }
        System.out.println(Holiday.MARCH_8.getCode());



    }


}
