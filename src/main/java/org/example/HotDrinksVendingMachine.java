package org.example;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {

    private final List<HotDrink> list;

    public HotDrinksVendingMachine() {
        list = new ArrayList<>();
    }

    public void addDrink(Drink drink) {
        list.add((HotDrink) drink);
    }

    public Drink getDrink(String name) {
        for (Drink product : list) {
            if (name.equals(product.getName())) {
                return product;
            }
        }
        return null;
    }

    public HotDrink getDrink(String name, Integer volume, Integer temp) {
        for (HotDrink product : list) {
            if (name.equals(product.getName())
                    && volume.equals(product.getVolume())
                    && temp.equals(product.getTemp())) {
                return product;
            }
        }
        return null;
    }

    public HotDrink getDrink(String name, Integer volume) {
        for (HotDrink product : list) {
            if (name.equals(product.getName())
                    && volume.equals(product.getVolume())) {
                return product;
            }
        }
        return null;
    }

}