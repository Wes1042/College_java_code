import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int quantity, Average , T_shirt = 21;


Scanner input  = new Scanner(System.in);
System.out.println("This program will help you determine how much you will pay in total with discrounts");
System.out.print("Please insert the amount you are buying: ");

quantity = input.nextInt();

double amount = quantity * T_shirt;
System.out.println("You are buying: " + quantity + " T-Shirts" );

if (quantity <= 5 ){
    System.out.println("You have no discount");
    System.out.println("Your final amount will be: " + amount);
}
else if ( quantity < 23){
System.out.print("You have a discount of 30%");
double discountAmount = amount * .30 ;
double finalAmountPaid = amount - discountAmount;

System.out.println("Your discounted amount is: " + discountAmount) ;
System.out.println("You final amount will be: " + finalAmountPaid);





}
else if (quantity >= 24  ){
System.out.println("You have a discount of 50%");
double discountAmount = amount * .50 ;
double finalAmountPaid = amount - discountAmount;
 if (finalAmountPaid >= 600 ){
    discountAmount = discountAmount + 50 ;
    finalAmountPaid = amount - discountAmount;
}
System.out.println("Your discounted amount is: " + discountAmount) ;
System.out.println("You final amount will be: " + finalAmountPaid);

}
  }
}