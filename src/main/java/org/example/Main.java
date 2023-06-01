package org.example;

public class Main {
    public static void main(String[] args) {
        HotDrink Tea = new GreenTea("Чай зеленый", 130, 200, 95);
        HotDrink BlackTea = new BlackTea("Чай черный", 250, 250, 90);
        HotDrink Coffee = new Coffee("Кофе", 80, 60, 85);
        HotDrink Cappuccino = new Cappuccino("Капучино", 110, 200, 85);

        VendingMachine DrinksVending = new HotDrinksVendingMachine();

        DrinksVending.addDrink(Tea);
        DrinksVending.addDrink(BlackTea);
        DrinksVending.addDrink(Coffee);
        DrinksVending.addDrink(Cappuccino);

        System.out.println(DrinksVending.getDrink("Чай зеленый"));
        System.out.println(DrinksVending.getDrink("Чай черный", 250, 90));
        System.out.println(DrinksVending.getDrink("Кофе", 60, 85));
        System.out.println(DrinksVending.getDrink("Капучино", 200, 85));
    }
}