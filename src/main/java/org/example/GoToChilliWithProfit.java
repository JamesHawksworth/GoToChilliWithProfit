package org.example;

import java.util.Scanner;

public class GoToChilliWithProfit {
    public static void main(String[] args) {
        Scanner adultQuantity, childQuantity;
        final double adultMealPrice = 7.00;
        final double childMealPrice = 4.00;
        final double costOfAdult = 4.35;
        final double costOfChild = 3.10;
        int adultMealsWanted;
        int childMealsWanted;
        double adultMealsWantedPrice;
        double childMealsWantedPrice;
        double total;
        double adultMealProfit;
        double childMealProfit;
        double totalProfit;

        System.out.println("The price of an adult's meal is £" + adultMealPrice + " and the cost of a child's meal is £" + childMealPrice);
        adultQuantity = new Scanner(System.in);
        System.out.println("Enter the number of adult meals you would like >>");
        adultMealsWanted = adultQuantity.nextInt();
        childQuantity = new Scanner(System.in);
        System.out.println("enter the number of Child meal you would like >>");
        childMealsWanted = childQuantity.nextInt();
        System.out.println("You would like " + adultMealsWanted + " adult meals and " + childMealsWanted + " Child meals");
        adultMealsWantedPrice = adultMealsWanted * adultMealPrice;
        childMealsWantedPrice = childMealsWanted * childMealPrice;
        total = adultMealsWantedPrice + childMealsWantedPrice;
        System.out.println("The price for the adult meals is £" + adultMealsWantedPrice + " and £" + childMealsWantedPrice + " for the child meals\nThis makes a total of £" + total);

        adultMealProfit = adultMealsWantedPrice - (adultMealsWanted * costOfAdult);
        childMealProfit = childMealsWantedPrice - (childMealsWanted * costOfChild);
        totalProfit = adultMealProfit + childMealProfit;

        System.out.println("The total profit from the sale is £" + totalProfit);


    }
}