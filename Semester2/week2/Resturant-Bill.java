import java.util.Scanner;

class Main{

    public static void main(String[] args ) {

        // input 

        Scanner meal = new Scanner(System.in);
        System.out.println("How much was your meal?");
        double meals = meal.nextDouble();
        System.out.println(meals);
//output 

        double Taxed_meal = meals * 0.0675 ;
        double tax_meal = meals + Taxed_meal ;
        System.out.println(tax_meal);
        // tax 6.75 %   or .0675
        double tip_meal = tax_meal * .20;
        double total = tax_meal + tip_meal;
        System.out.println(total);
        // tip 20%  or .20


        
        //MY MATH
        // Meal cost x tax = taxed meal 
        // meal + taxed meal = tax meal
        // tax meal x tip = tip meal 
        // tax meal x tip meal = total
        //output total


    }



}



