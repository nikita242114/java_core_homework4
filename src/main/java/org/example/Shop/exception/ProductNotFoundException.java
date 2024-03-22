package org.example.Shop.exception;

public class ProductNotFoundException extends Exception{
    public ProductNotFoundException(String message) {
        super(message);
    }
}