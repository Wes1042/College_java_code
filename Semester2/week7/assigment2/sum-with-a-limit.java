import java.util.Scanner;

class sum{
    public static void main(String[] args) {

    Scanner input = new Scanner (System.in);
        int number;
        int sum = 0 ;
        
        System.out.println("This program will write the sum of all number entered\nTo stop the program enter -99");
        System.out.println("Please enter a integer: ");
        number = input.nextInt();
        
        while (number != -99){
            sum += number ;
            
            System.out.println("Please enter a integer: ");
            number = input.nextInt();
            
        }

        System.out.println("Your sum is: " + sum);




    }
}


//WHile 