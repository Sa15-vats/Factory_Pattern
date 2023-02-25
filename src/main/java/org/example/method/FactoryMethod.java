package org.example.method;

import org.example.currency.Currency;
import org.example.currency.impl.Rupee;
import org.example.currency.impl.Thai;
import org.example.currency.impl.USD;


/**
 * Factory : As name suggest it is factory where we can create objects.
 * Since it creates object that's why it comes under the creational design pattern
 * Factory pattern has  two important element in its design.
 *
 * 1. Interface/Abstract class : This is base element for which we are making factory .
 *
 * 2. Factory : This will have nothing but Object creation logic. Let's say as a library you introduce one more subtype that is
 * China . Now your caller is automatically extended this facility of fourth type , also we have taken responsibility of
 * creating of object.
 *
 * In java this pattern is heavily used:
 * 1. Calendar.getInstance : Calendar is abstract class amd based on Locale and Timezone we provided it is giving calendar instance.
 * Note in this case we really don't know what type of calendar we got.
 * 2. In reflection Class.forname : the type of class you pass it gets loaded.
 *
 */
public class FactoryMethod {

    private FactoryMethod(){

    }

    public static Currency createCurrency(String country) {
        Currency currency = null;
        if(country.equalsIgnoreCase("India")){
            currency = new Rupee();
        } else if (country.equalsIgnoreCase("US")) {
            currency = new USD();
        }
        else if(country.equalsIgnoreCase("Thailand")){
            currency =new Thai();
        }
        else {
            System.out.println("Invalid Currency");
        }
        return currency;


    }
}
