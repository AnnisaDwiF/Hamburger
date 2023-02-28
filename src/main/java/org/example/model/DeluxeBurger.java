package org.example.model;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("fries + chips + drink", "beef", 23000.0D, "Ciabatta Bun");
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, Double addition1Price) {
        System.out.println("no additional items can be added");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, Double addition2Price) {
        System.out.println("no additional items can be added");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, Double addition3Price) {
        System.out.println("no additional items can be added");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, Double addition4Price) {
        System.out.println("no additional items can be added");
    }
}
