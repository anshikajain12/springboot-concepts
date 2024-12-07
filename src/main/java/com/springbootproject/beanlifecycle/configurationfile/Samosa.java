package com.springbootproject.beanlifecycle.configurationfile;

public class Samosa {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Samosa() {
    }

    @Override
    public String toString() {
        return "Samsosa{" +
                "price=" + price +
                '}';
    }
    public void init(){
        System.out.println("Inside Samosa class");
    }
    public void destroy(){
        System.out.println("Inside destroy");
    }
}
