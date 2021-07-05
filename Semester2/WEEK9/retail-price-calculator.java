import java.util.Scanner;



class Main{

    public static void main(String[] args) {
        int wholesale;
        int percentage;
        Scanner input = new Scanner(System.in);

        System.out.println("PLease enter item's wholesale cost:");
        wholesale = input.nextInt();

        System.out.println("Please enter item's markup percetage: ");
        percentage = input.nextInt();
        double retail_cost = calculateRetail(wholesale,percentage);
        System.out.println("The retail price for this item is: " + retail_cost);
        
    }

    public static double calculateRetail(double wholesale , double percentage) {

        double percent = percentage/100;
        
        double percentage_cost = wholesale *percent;
        double retail_cost = percentage_cost + wholesale;
        return retail_cost;



    }
}
/* 
Main function :
ask user for item wholesale 
ask user for markup percentage 
print item retail price 

calculate retail : 
funtion where the math is happening 
whole sale cost x makrup percetage = percentage cost
percentage cost + wholesale cost = retail cost 
*/ 