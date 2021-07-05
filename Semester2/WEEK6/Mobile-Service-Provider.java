
import java.util.Scanner;



class Main{

 public static void main(String[] args) {

    double user_minutes;
    double extra_minutes;
    double total_minutes_price;
    double total_bill;



    Scanner input = new Scanner(System.in);
    System.out.println("Please select one of the following option:\n1. Package A\n2. Package B\n3. Package C\n4.Exit\nEnter choice: ");
    String user_input ;
    user_input = input.nextLine();
    System.out.println("How many minutes do you have?: ");
    user_minutes = input.nextInt();



        if (user_input.equals("1")){
            if (user_minutes <= 450 ){
                System.out.println("You will pay $39.99 for your montly bill");
            }
            else if (user_minutes >=450 ){
                extra_minutes = user_minutes -450 ;
                System.out.println("You have used " + extra_minutes + "more minutes than your package intended to have,\n You will pay $0.40 per minute.");
                total_minutes_price =  extra_minutes * .45;
                total_bill = total_minutes_price + 39.99;

        }
    }

    

  
 
   
    
     
 }
}

// calculate monthly bill.
//package A : 39.99 | 450 minutes are provided | .45 per extra miniutes 
//package B : 59.99 | 900 minutes are provided | .45 per extra miniutes 
//package C : 69.99 | Unlimited | 
