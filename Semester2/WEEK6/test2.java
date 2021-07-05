

import java.util.Scanner;



class test2{

 public static void main(String[] args) {

  double packageA = 39.99;
  double A_minutes = 450 ;
  double per_minA = .45;
  double packageB = 59.99;
  double B_minutes = 900 ;
  double per_minB = .40;
  double packageC = 69.99;
  double extra_minutes;
  double minutes_pay;
  double total_bill;
  
  
    Scanner input = new Scanner(System.in);
  System.out.println("Please select one of the following option:\n1. Package A\n2. Package B\n3. Package C\nEnter choice: ");
    
  String user_package = input.nextLine();
  System.out.println("How many minutes did you uses this month?: ");
  double user_minutes = input.nextDouble();


    if ( user_package.equals("1")){
      System.out.println("You selected package A");
        if (user_minutes >= 450) {
           extra_minutes = user_minutes - A_minutes;
           minutes_pay = per_minA * extra_minutes;
            total_bill = minutes_pay + packageA;
          System.out.println("Your total bill this month is $" + total_bill);   
          }
          else {
            System.out.println("Your total for this month is $" + packageA);
          }
        }
     else if (user_package.equals("2")){
      System.out.println("You selected package B");
      if (user_minutes >= 900) {
         extra_minutes = user_minutes - B_minutes;
         minutes_pay = per_minB * extra_minutes;
          total_bill = minutes_pay + packageB;
        System.out.println("Your total bill this month is $" + total_bill);   
        }
        else {
          System.out.println("Your total for this month is $" + packageA);
          
        }
      }
     else if (user_package.equals("3")){
     
      System.out.println("You selected package C");
      System.out.println("Your total for this month is $" + packageC );
    
    
    }
    
      
    
 
      
      



  
  
 
   
    
     
 }
}

// calculate monthly bill.
//package A : 39.99 | 450 minutes are provided | .45 per extra miniutes 
//package B : 59.99 | 900 minutes are provided | .45 per extra miniutes 
//package C : 69.99 | Unlimited | 
