import java.util.Scanner;



class Main1{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("type the day: ");
        String input_day = input.next(); 
        int day = Integer.parseInt(input_day);

        System.out.println("Type a month: ");
        String input_month = input.next();
        int month = Integer.parseInt(input_month);

        System.out.println("type a year (input 2 digits): ");
        String input_year = input.next();
        int year = Integer .parseInt(input_year);


        int magic_year = day * month ;

        System.out.println("Your date is " + day + "/" + month + "/" + year );
        if (magic_year != year){
            System.out.println("Date is not magic");
            }

        else{
            
            System.out.println("Date is magic");
        } 


        }



        //MATH:

        // Day *Month = year
        
        
        






    }



//Make an if statement
// if date is magic number print it is a magic number
//if not then print it is not a magic number

//math:
// day * month = year = magic number 
