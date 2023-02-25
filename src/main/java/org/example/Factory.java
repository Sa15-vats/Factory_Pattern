package org.example;

import org.example.currency.Currency;
import org.example.method.FactoryMethod;

import java.util.Scanner;

public class Factory {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String country = in.nextLine();
        Currency curr = FactoryMethod.createCurrency(country);
        System.out.println(curr.getSymbol());
        System.out.println("Hello world!");
    }
}