package org.example;

public interface VendingMachine {

    void addDrink(Drink drink);

    Drink getDrink(String name);

    Drink getDrink(String name, Integer volume, Integer temp);

    Drink getDrink(String name, Integer volume);

}