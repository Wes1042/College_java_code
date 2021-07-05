package cookie;

import java.util.Scanner;

class test {
    public static void main(String[] args){

        Scanner cookie = new Scanner(System.in);
        System.out.println("How many cookies did you consume?");
        int cookies = cookie.nextInt();


        
        int oneCookie = 75; //calories 
        int calories = oneCookie * cookies ; // cookies x calories 
        System.out.println("You ate " + calories + " calories. ");


    }


}