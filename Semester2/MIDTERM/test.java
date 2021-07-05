import java.util.Scanner;

class Main{
    public static void main(String[] args) {

       /* int  a = 2 ,   c,   f = 17  ;

        c = a + 18 - 10 % (f - 10 );
    
        System.out.print(c); */
/////////////////////////////////
    /*int    d,   f = 17  ;
    d = f / 3 / 2;
    System.out.print(d);
    */
    /////////////////////////////////////////////
    /*int  a =2 ; 
    double e,   g = 9.5  ;
    e = g + 13 % 7 / a * (5 - a);
    System.out.print(e);*/
    //////////////////////////
    /*double  g = 9.5,    w ;   
    w= g / 2 * 3;
    System.out.println(w);*/
    //////////////////////////////////
    /*
    int true;
    int  a = 5 ,   b = 5 ,   c = 4,    d = 4,   e = 2 ,    f = 1 ;
     true = (( a > b  &&  c > d )   ||  e  >  f    );
     */
    ////////////////////////////////////
    /* int   a = 5 ,   b = 5 ,   c = 4,    d = 4,   e = 2 ,    f = 1 ; 
     true = (  !  (   a+1 > b   ||   ( c > d   &&   e  >  f  )   )   );
    System.out.println(true);*/
    ////////////////////////////////
    /*int num;

    String str = "555";
 
    num = Integer.parseInt( str ) + 5 ;
    System.out.println(num);*/
    /////////////////////////


int quantity, Average , T_shirt = 21;


Scanner input  = new Scanner(System.in);
System.out.println("This program will help you determine how much you will pay in total with discrounts");

quantity = input.nextInt();

double amount = quantity * T_shirt;
System.out.println(amount);

if (quantity <= 5 ){
    System.out.println("You have no discount");
    System.out.println(amount);
}
else if ( quantity < 23){
System.out.print("You have a discount of 30%");
double discountAmount = amount * .30 ;
double finalAmountPaid = amount - discountAmount;

System.out.println("Your discounted amount is: " + discountAmount) ;
System.out.println("You final amount will be: " + finalAmountPaid);





}
else if (quantity >= 24  ){
System.out.println("You have a discount of 50%");
double discountAmount = amount * .50 ;
double finalAmountPaid = amount - discountAmount;
System.out.println("Your discounted amount is: " + discountAmount) ;
System.out.println("You final amount will be: " + finalAmountPaid);
if (finalAmountPaid >= 600 ){
    discountAmount = discountAmount + 50 ;
    finalAmountPaid = amount - discountAmount;
}
}
}








/* 
MATH
if quantity range is between the ammount of user , apply the final amaount paid 

*/
















    }





    }