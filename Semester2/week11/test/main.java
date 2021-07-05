package test;
import java.util.Scanner;

class Main{
public static void main(String[] args) {
    
System.out.println("This will convert your temperature from Fahrenheit to Celsius...\nYou will also recive a table");
System.out.println("Please enter your number :");
    Scanner input = new Scanner(System.in);
    double F = input.nextInt();
    System.out.println("Your conversion from fahrenheit to celcius is :\n------> " + celsius(F) + "\n\n\n\n");
    

System.out.println("Fahrenheit\t\t\tCelcius\n------------------------------------------");

table();


}

public static double celsius(double F){
    double C = (F - 32) * 5/9;
    return C;

}

public static double table(){
    double fahrenheit_table, celcius_table;

    for (fahrenheit_table= 0 ; fahrenheit_table <= 20; fahrenheit_table++){
        
        celcius_table = (fahrenheit_table-32)* 5/9; 
        //System.out.println(celcius_table);
        ///this is supposed to be celsius
        System.out.printf("%.1f\t\t\t\t%.2f\n", fahrenheit_table , celcius_table);
        
        /*celcius_table = (fahrenheit_table*9/5)+32 ;
        System.out.println(celcius_table);*/
        ///this is supposed to be farenheit 


    }
  return fahrenheit_table;


}

}