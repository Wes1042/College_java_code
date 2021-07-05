package cookie;

import java.util.Scanner;

class Main {
    public static void main(String[] args){

        Scanner cookie = new Scanner(System.in);
        System.out.println("How many cookies did you consume?");
        double cookies = cookie.nextDouble();


        
        double servings = (cookies /40) * 10; //calories 
        double calories = (servings /1) *300 ; // cookies x calories 
        System.out.println("You ate " + calories + " calories of " + servings + " servings.");


    }


}
// MY MATH 
        //box of cookie  = 40
        //calories per box  = 3000
        //servings per box = 10  
        //calories per serving = 300
        // 40 / 10 = 4 cookies per serving 
        // 3000 / 40 = 75 calories 
        // 1 cookie = 75 calories 
        // amount of cookies * calories = total calories 
        