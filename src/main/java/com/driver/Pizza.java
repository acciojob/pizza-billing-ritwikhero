package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;

    private boolean hasExtraToppings;

    private boolean hasExtraCheese;
    private String bill;

    public Pizza(int price,boolean isVeg){
        this.price = price;
        this.isVeg = isVeg;
        // your code goes here
        this.hasExtraToppings = false;
        this.hasExtraCheese = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!hasExtraCheese){
            this.price += 80;
            hasExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!hasExtraToppings){
            int extraTopping = this.isVeg ? 70 : 120;
            this.price += extraTopping;
            hasExtraToppings = true;
        }
    }
    public boolean isVeg(){
        return isVeg;
    }

    public void addTakeaway(){
        // your code goes here

    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
