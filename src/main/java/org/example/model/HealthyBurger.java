package org.example.model;

import java.security.PublicKey;

public class HealthyBurger extends Hamburger{

    public String healthyExtra1Name;
    public Double healtyExtra1Price = 0.0D;
    public String healthyExtra2Name;
    public Double healtyExtra2Price = 0.0D;

    public HealthyBurger(String name, String meat, Double price, String breadRollType) {
        super("Fish Burger",meat,price,"Kaiser Roll");
    }

    public void addHealthyAddition1(String healthyExtra1Name, Double healtyExtra1Price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healtyExtra1Price = healtyExtra1Price;
    }
    public void addHealthyAddition2(String healthyExtra2Name, Double healtyExtra2Price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healtyExtra2Price = healtyExtra2Price;
    }

    @Override
    public Double itemizeHamburger() {
        return super.itemizeHamburger() + this.healtyExtra1Price + this.healtyExtra2Price;
    }
}
