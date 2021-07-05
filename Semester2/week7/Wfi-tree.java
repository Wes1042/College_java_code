import java.util.Scanner;

class Main {

public static void main(String[] args) {
  
        System.out.println("Welcome to your Wifi Diagnostic\n We will ask a few question and you will respond.\n READY?");
        Scanner input  = new Scanner(System.in);
        System.out.println("Reboot the computer and try to connect.");
        System.out.println("Did that fix the problem?");
        String user_repsonse = input.nextLine();


        if (user_repsonse.equals("no")){
            
            if (user_repsonse.equals("no")){
                System.out.println("Reboot the router and try again");
                System.out.println("Did that fix the problem?");
                user_repsonse = input.nextLine();

                if (user_repsonse.equals("no")){
                    System.out.println("Make sure the cables between the router and modem are plugged in firmly.");
                    System.out.println("Did that fix the problem?");
                    user_repsonse = input.nextLine();
                    
                        if (user_repsonse.equals("no")){
                            System.out.println("Move the router to a new location.");
                            System.out.println("Did that fix the problem?");
                            user_repsonse = input.nextLine();
                                if (user_repsonse.equals("no")){

                                    System.out.println("Get a new router.");
                                }else if (user_repsonse.equals("yes"))
                                System.exit(0);

                        }else if (user_repsonse.equals("yes"))
                        System.exit(0);



                }else if (user_repsonse.equals("yes"))
                System.exit(0);

            }else if (user_repsonse.equals("yes"))
            System.exit(0);

            

        }else if (user_repsonse.equals("yes"))
            System.exit(0);




    





}



}