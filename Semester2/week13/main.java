import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will tell you if you loss money or gained money.\nPlease follow the instructions....");
        System.out.println("How many stocks will you be inserting? : ");
        int stocks = input.nextInt();
        

for (int i = 0 ; i <=  stocks; i++){
        double Profit =+ user_input();
        System.out.println(Profit); 
   // System.out.println(user_input());
   // double profit =+ user_input();
}
    }

    public static double user_input(){
        Scanner input = new Scanner(System.in);
        double NS , PP ,PC, SP , SC , Profit;
        System.out.println("Please enter out the number of shares: ");
        NS = input.nextDouble();
        System.out.println("Please enter the pruchase price per share: ");
        PP = input.nextDouble();
        System.out.println("Please enter the purchased commision paid: ");
        PC = input.nextDouble();
        System.out.println("Please enter sale price per share: ");
        SP = input.nextDouble();
        System.out.println("Please enter sale commision paid: ");
        SC = input.nextDouble();


        Profit = (( NS * SP) - SC) - ((NS * PP) + PC);
        if (Profit < 0 ){
            System.out.println("You have lost money...");
        }
        else{
            System.out.println("You have gained profit!!");
        }
        System.out.println("You have made: " + Profit );

        return Profit;
    }
}



/*
NS = number of shares
PP = purchase price per share 
PC = purchased commision paid
SP = sale price per share
SC = sale commision paid

If calculation is positive ,
the use has gained money , if negative , they lost

method user input() :
user inputs : number of shares 
user inputs : price per share 
user input : purchase commision paid 
user input : sale price per share 
user input : sale commision paid 


in main method use the following calculations 
Profit = (( NS * SP) - SC) - ((NS * PP) + PC)


ASk the user how many shares they will be buying 
based on the number , make a loop that will add based on the shares
*/