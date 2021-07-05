import java.util.Scanner;

class Main{

public static void main(String[] args) {
    System.out.println("This program is used to convert meters....");
    Scanner input = new Scanner(System.in);
    
    int leave = 4 ;
    System.out.println("Enter a distance in meters");
    double meters = input.nextDouble();
    
    while (meters < 0) {
        System.out.println("Please enter a positive number...: ");
        meters = input.nextDouble();
    }
    
    menu();
    int  user_input = input.nextInt();
    while ( user_input != leave){

    
    if( user_input == 1 ){
        showKilometers(meters);
    }
    else if( user_input == 2){
        showInches(meters);
    }
    else if(user_input == 3){
        showFeet(meters);
    }
    else {
        System.out.println("Please choose a valid option...");        
    }
    
    menu();
    user_input = input.nextInt();
}
System.out.println("You have left the program...");
      
}
public static void menu(){
    System.out.println("\nEnter your choice: ");
    System.out.println("1. Convert to kilometers\n2. Convert to inches\n3. Convert to feet\n4. Quit the program ");

    
}
public static void showKilometers(double meters){
    double kilometers = meters * 0.001;
    System.out.println( meters + " meters is " + kilometers + " kilometers.\n\n"); 

}
public static void showInches(double meters){
    double inches = meters * 39.37;
    System.out.println( meters + " meters is " + inches + " inches.\n\n");
    
}
public static void showFeet(double meters ){
    double feet = meters * 3.281;
    System.out.println( meters + " meters is " + feet + " feet.\n\n");
    
}

}