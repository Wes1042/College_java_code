import java.util.Scanner;

class Resturant {
 public static void main(String[] args) {
    String Vegetarian;
    String Vegan;
    String Glutten_free;

    Scanner input = new Scanner(System.in);
    System.out.println("Is anyone in your party a a vegetarian?");
        Vegetarian = input.nextLine();
    System.out.println("Is anyone in your party a vegan?");
        Vegan = input.nextLine();
    System.out.println("Is anyone in your party gluten-free?");
        Glutten_free = input.nextLine();






    if (Vegetarian.equals("yes") && Vegan.equals("yes") && Glutten_free.equals("yes"))
    {
        System.out.println("Corner Cafe");
        System.out.println("The Chef's  Kitchen");

    }
    else if (Vegetarian.equals("yes") && Vegan.equals("no") && Glutten_free.equals("yes"))
    {
        System.out.println("Main Street Pizza Company");

    }
    else if (Vegetarian.equals("no") && Vegan.equals("no") && Glutten_free.equals("no"))
    {
        System.out.println("Joe's Gourment Burgers");

    }
    else if (Vegetarian.equals("yes") && Vegan.equals("no") && Glutten_free.equals("no"))
    {
        System.out.println("Mama's Fine Italian");

    }
    else 
    {
        System.out.println("type yes or no");
    }






}
}