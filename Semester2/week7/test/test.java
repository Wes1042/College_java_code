package test;

import java.util.Scanner;

public class test // RestaurantSelector
{
  public static void main(String[] args)
  {
    String vegi;
    String vegan;
    String gluten;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Is anyone in your party a vegetarian?");
    vegi = keyboard.nextLine();
    
    System.out.println("Is anyone in your party a vegan?");
    vegan = keyboard.nextLine();
    
    System.out.println("Is anyone in your party gluten-free?");
    gluten = keyboard.nextLine();
    
    System.out.println("Here are you restaurant selections: ");
    
    if (vegi.equalsIgnoreCase("no") && vegan.equalsIgnoreCase("no") && gluten.equalsIgnoreCase("no"))
    {
      System.out.println("Joe's Gourmet Burgers");
      System.out.println("Main Street Pizza Company");
      System.out.println("Corner Cafe");
      System.out.println("Mama's Fine Italian");
      System.out.println("The Chef's Kitchen");
    }
    else if (vegi.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("no") && gluten.equalsIgnoreCase("no"))
    {
      System.out.println("Main Street Pizza Company");
      System.out.println("Corner Cafe");
      System.out.println("Mama's Fine Italian");
      System.out.println("The Chef's Kitchen");
    }
    else if (vegi.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("yes") && gluten.equalsIgnoreCase("no"))
    {
      System.out.println("Corner Cafe");
      System.out.println("The Chef's Kitchen");
    }
    else if (vegi.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("yes") && gluten.equalsIgnoreCase("yes"))
    {
      System.out.println("Corner Cafe");
      System.out.println("The Chef's Kitchen");
    }
    else if (vegi.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("no") && gluten.equalsIgnoreCase("yes"))
    {
      System.out.println("Main Street Pizza Company");
      System.out.println("Corner Cafe");
      System.out.println("The Chef's Kitchen");
    }
    else if (vegi.equalsIgnoreCase("no") && vegan.equalsIgnoreCase("no") && gluten.equalsIgnoreCase("yes"))
    {
      System.out.println("Main Street Pizza Company");
      System.out.println("Corner Cafe");
      System.out.println("The Chef's Kitchen");
    }
    else if (vegi.equalsIgnoreCase("no") && vegan.equalsIgnoreCase("yes") && gluten.equalsIgnoreCase("no"))
    {
      System.out.println("Corner Cafe");
      System.out.println("The Chef's Kitchen");
    }
    else if (vegi.equalsIgnoreCase("no") && vegan.equalsIgnoreCase("yes") && gluten.equalsIgnoreCase("yes"))
    {
      System.out.println("Corner Cafe");
      System.out.println("The Chef's Kitchen");
    }
    else
    {
      System.out.println("Incorrect entry, enter either yes or no.");
    }
  }
}  

















