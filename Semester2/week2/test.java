import java.util.Scanner;

class Test{

    public static void main(String[] args ) {

        // input 

        Scanner input = new Scanner(System.in);
        System.out.println("How much was your meal?: ");
        //output 
        double meal = input.nextDouble();

        // tax 6.75 %   or .0675
        double tax = meal * 0.0675;
        double total_cost = tax + meal;



        // tip 20%  or .20
        double tip = 0.2 * total_cost;
        double total = total_cost + tip;


        //User Friendly 
        System.out.println("Meal cost: $" + meal); 
        System.out.println("Tax amount : 6.75%");
        System.out.println("Tip amount : 20%");
        System.out.println("Your Total amount is: $" + total);

        //MY MATH
        // Meal cost x tax = taxed meal 
        // meal + taxed meal = tax meal
        // tax meal x tip = tip meal 
        // tax meal x tip meal = total
        //output total


    }



}



