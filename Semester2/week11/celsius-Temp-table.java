import java.util.Scanner;

class Main{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("This program is to convert fahrenheit to Celcius.\nI will give you a table");
    System.out.println("Please input your fahrenheit: ");
    double F = input.nextInt();

    System.out.println(celsius(F));


System.out.println("Fahrenheit temperature\t\tCelsius temperature\n----------------------\t\t-------------------");
    
    table(celsius(F));
}

public static double celsius(double F){
    double c = (F -32) * 5/9 ;

    return c;
}

public static int table( double celsius){
    for (double fahrenheit_table = 0 ; fahrenheit_table <=20 ; fahrenheit_table++){
        double equal_celsius = celsius(fahrenheit_table);
        ///System.out.println(fahrenheit_table + "\t\t\t\t" + equal_celsius);
        System.out.printf("%.1f\t\t\t\t%.2f\n", fahrenheit_table , equal_celsius);
    }
    return table(celsius);


}
}/*
public static int table(double celcius, double F){
for (int i = 0 ; i <=  20; i++){

    System.out.println(celcius);
    for ( int celcius_table = 0 ; celcius_table < 20;){
        System.out.println((celcius*9/5)+32 +"\t");
    }
    for ( int fahrenheit_table = 0 ; fahrenheit_table <20;){
        System.out.println((F-32) * 5/9 + "\t");
    }
}
return 0;






}














}
/*
ask the user for farneheit input 
create another funtion
calculate celcius 
c = 55/9(F - 32)
create another funtion and create a loop
for i =1, i<20 , i =i+1 do the following 




for i in range of [20] do the following:
   i =  i++ 

*/