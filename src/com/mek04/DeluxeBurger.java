package com.mek04;

public class DeluxeBurger extends Hamburger  {

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon ", 14.54, "White");
        System.out.println("Cannot not add additional items to a deluxe burger");
        addHamburgerAddition1("Chips",2.75);
        addHamburgerAddition2("Drink",1.81);
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}
