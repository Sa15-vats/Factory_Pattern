package org.example.currency.impl;

import org.example.currency.Currency;

public class USD implements Currency {

    @Override
    public String getSymbol() {
        return "USD Dollars";
    }
}
