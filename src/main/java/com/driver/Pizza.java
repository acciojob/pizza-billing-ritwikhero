package com.driver;

public class Pizza {

    private int price;
    private int total;
    private boolean isVeg = false;
    private boolean takeaway;
    protected boolean hasExtraToppings;

    protected boolean hasExtraCheese;
    private String bill;
    private static int vegBasePrice = 300;
    private static int nonVegBasePrice = 400;
    public static int cheesePrice = 80;
    public static int vegTopping = 70;
    public static  int nonVegTopping = 120;
    public static int takeawayPrice = 20;
    public static int myToppingPrice = 0;
    public static int basePrice = 0;

    public Pizza(boolean isVeg){
        this.isVeg = isVeg;
        this.basePrice = isVeg ? vegBasePrice : nonVegBasePrice;
        this.price = basePrice;
        // your code goes here
        this.bill = "Base Price Of The Pizza: " + this.price +"\n";
        this.hasExtraToppings = false;
        this.hasExtraCheese = false;
        this.takeaway = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!hasExtraCheese){
            hasExtraCheese = true;
            this.price += cheesePrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!hasExtraToppings){
            hasExtraToppings = true;
            myToppingPrice = this.isVeg ? vegTopping : nonVegTopping;
            this.price += myToppingPrice;

        }
    }
    public boolean isVeg(){
        return isVeg;
    }

    public void addTakeaway(){
        // your code goes here

        if(!takeaway){
            takeaway = true;
            this.price += takeawayPrice;
        }
    }

    public String getBill(){
        // your code goes here
//        int total = price;
//        if(takeaway){
//            total += 20;
//        StringBuilder bill = new StringBuilder();
//        bill.append("Base Price Of The Pizza: ").append(price).append("\n");
//        if(hasExtraCheese){
//            bill.append("Extra Cheese Added: 80\n");
//        }
//        if(hasExtraToppings){
//            int extraToppingPrice = this.isVeg ? 70 : 120;
//            bill.append("Extra Toppings Added: ").append(extraToppingPrice).append("\n");
//        }
//        if(takeaway){
//            bill.append("Paperbag Added: 20\n");
//        }
//        bill.append("Total Price: ").append(price).append("\n");
//        return bill.toString();
        String bill = this.bill;
        if(hasExtraCheese){
            bill += "Extra Cheese Added: " + cheesePrice + "\n";
        }
        if(hasExtraToppings){
            bill += "Extra Toppings Added: " + myToppingPrice +"\n";
        }
        if(takeaway){
            bill += "Paperbag Added: " + takeawayPrice +"\n";
        }
        bill += "Total Price: " + this.price + "\n";
        return this.bill;
    }
}
