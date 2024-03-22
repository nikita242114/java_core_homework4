package org.example.Shop.exception;

public class QuantityIsNegativeException extends Exception{
    public QuantityIsNegativeException(String message) {
        super(message);
    }
}