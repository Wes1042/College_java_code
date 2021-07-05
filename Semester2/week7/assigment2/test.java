import java.util.Scanner;

class Test{
    public static void test(String[] args) {
    
        int i = 0 ;
        int largets = 0;
        int smallest = 0;
        int user_number;
        int numbers;



        Scanner input = new Scanner(System.in);
        System.out.println("This program will output the largest and smallest number\nPlease input integers: ");
        System.out.println("How many numbers do you want to compare?: ");
        user_number = input.nextInt();
        System.out.println("Please enter another integer: ");
        numbers = input.nextInt();
        smallest = numbers;

        for (i=2 ;i < user_number;i++){
            System.out.println("Please enter another integer: ");
            numbers = input.nextInt();

            if (numbers > largets){
                largets =  numbers;

            }
            if(numbers < smallest){
                smallest = numbers;

            }



        }

        System.out.println("The Largest number is: " + largets);
        System.out.println("The Smallest number is: " + smallest);




    }
}