import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int number;
        int i = 1;
        System.out.println("This program helps you find the sum of a whole number");
        System.out.println("Please enter a postive number: ");
        number = input.nextInt();

        if (number <= 0 ){
            System.out.println("Please enter a positive number..");
            number = input.nextInt();
        }
        while (i <= number ){
            sum += i;
            i++;
        }
        System.out.println("The sum is: " + sum);

        //MATH
        // while the index is less that the user number 
        // DO the followwing :
        //the sum of the number is added and equal to index number
        // continue by adding one number to the index
        // Continue loop until 
        // index is greater to number 








    }


}