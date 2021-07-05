import java.util.Scanner;
class Main{


public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of packages purchased: ");
    double user_package = input.nextDouble();


    
    double value_package = 99;


if (user_package <= 9){
    System.out.println("There is no discount , pay full price");
}
if  (user_package >= 10 && user_package <= 19){ 
    double total_software_price = value_package * user_package; 
    double discount_software = total_software_price * .20 ;
    double software = total_software_price - discount_software;
    System.out.println("You have to pay: $ " + software);
} 

else if (user_package >= 20 && user_package <= 49){
    double total_software_price = value_package * user_package; 
    double discount_software = total_software_price * .20 ;
    double software = total_software_price - discount_software;
    System.out.println("You have to pay: $ " + software);
}
else if (user_package >= 50 && user_package <= 99){
    double total_software_price = value_package * user_package; 
    double discount_software = total_software_price * .20 ;
    double software = total_software_price - discount_software;
    System.out.println("You have to pay: $ " + software);;
}
else if (user_package <= 100){
    double total_software_price = value_package * user_package; 
    double discount_software = total_software_price * .20 ;
    double software = total_software_price - discount_software;
    System.out.println("You have to pay: $ " + software);
}


    }
}

//
//a package is $99 
// input the user package
// make a if statement based on the quantity 
// Discout based on its package range
//
//