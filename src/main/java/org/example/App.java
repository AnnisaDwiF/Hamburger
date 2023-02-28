package org.example;

import org.example.model.DeluxeBurger;
import org.example.model.Hamburger;
import org.example.model.HealthyBurger;

public class App 
{
    public static void main( String[] args )
    {
        Hamburger hamburger = new Hamburger("Cheese Burger", "Chicken",20000.0D,"Bun Bread");
        hamburger.addHamburgerAddition1("Garden burger",25000.0D);
        System.out.println(hamburger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("Burger nasi",17000.0D);
        System.out.println(deluxeBurger.name);
        System.out.println(deluxeBurger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Burger kambing","kambing",50000.0D,"Brioche Bun");
        healthyBurger.addHamburgerAddition1("Chicke Burger",15000.0D);
        System.out.println(healthyBurger.itemizeHamburger());
    }

}
