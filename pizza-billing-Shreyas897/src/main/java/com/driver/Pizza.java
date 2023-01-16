package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg)
        {
            this.price=300;

        }
        else
            this.price=400;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here


    }

    public void addExtraToppings(){
        // your code goes here

    }

    public void addTakeaway(){
        // your code goes here

    }

    public String getBill(){
        // your code goes here
        StringBuilder sb= new StringBuilder();
        sb.append("Base Price Of The Pizza: "+price+"\n");





        return this.bill;
    }
}
