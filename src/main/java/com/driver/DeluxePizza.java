package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
//        this.hasExtraCheese = true;
//        this.hasExtraToppings = true;
        super.addExtraCheese();
        super.addExtraToppings();
    }
}
