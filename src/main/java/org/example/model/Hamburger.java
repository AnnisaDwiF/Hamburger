package org.example.model;

public class Hamburger {
    public String name;
    public String meat;
    public Double price;
    public String breadRollType;

    public String addition1Name;
    public Double addition1Price = 0.0D;
    public String addition2Name;
    public Double addition2Price = 0.0D;
    public String addition3Name;
    public Double addition3Price = 0.0D;
    public String addition4Name;
    public Double addition4Price = 0.0D;


    public Hamburger(String name, String meat, Double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String addition1Name, Double addition1Price){
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }
    public void addHamburgerAddition2(String addition2Name, Double addition2Price){
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }
    public void addHamburgerAddition3(String addition3Name, Double addition3Price){
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }
    public void addHamburgerAddition4(String addition4Name, Double addition4Price){
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }
    public Double itemizeHamburger(){
        return price + addition1Price + addition2Price + addition3Price + addition4Price;
    }
}
