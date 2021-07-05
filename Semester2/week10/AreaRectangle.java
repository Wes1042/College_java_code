import java.util.Scanner;



/**
   You must complete this program so it calculates
   and displays the area of a rectangle. 
*/

// Insert any necessary import statements here.

public class AreaRectangle
{
   public static void main(String[] args)
   {
      double length,    // The rectangle's length
             width,     // The rectangle's width
             area;      // The rectangle's area
   
      // Get the rectangle's length from the user.
      length = getLength();
   
      // Get the rectangle's width from the user.
      width = getWidth();

      // Get the rectangle's area.
      area = getArea(length, width);

      // Display the rectangle data.
      displayData(length, width, area);
   }
   public static double getLength(){
      Scanner input = new Scanner(System.in);
      System.out.println("Please insert the length of your rectangle: ");
      double lenght = input.nextDouble();
      return lenght;


   }

   public static double getWidth(){
      Scanner input = new Scanner(System.in);
      System.out.println("Please insert the width of your rectangle: ");
      double width = input.nextDouble();
      return width;

   }

   public static double getArea (double length, double width ){
     double area = length * width;
      return area;

   }
   public static int displayData(double length, double width, double area){
      System.out.println("The Length of your rectangle is : " + length);
      System.out.println("The width of your rectangle is : " + width);
      System.out.println("The Area of your rectangle is : " + area);
      return 0;
   }
}

/*
MATH
getLenght:
ask use for input for lenght and return value
getWidth:
ask user for input for width and return the value
getArea:
use both Lenght and Width to calculate are 
lenght x width 
DisplayData:
Display all data  
*/
