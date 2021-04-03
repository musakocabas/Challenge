package com.mek04;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public HealthyBurger( String meat, double price) {
        super("Healthy", meat, price, "Brown rye roll");
    }

    public void addHealthyAddition1(String addition1Name, double addition1Price) {
        this.healthyExtra1Name = addition1Name;
        this.healthyExtra1Price = addition1Price;
        System.out.println("Added " + this.healthyExtra1Name + " for an extra " + healthyExtra1Price);
    }


    public void addHealthyAddition2(String addition2Name, double addition2Price) {
        this.healthyExtra2Name = addition2Name;
        this.healthyExtra2Price = addition2Price;
        System.out.println("Added " + this.healthyExtra2Name + " for an extra " + healthyExtra2Price);
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger()+this.healthyExtra2Price+this.healthyExtra1Price;
    }
}
