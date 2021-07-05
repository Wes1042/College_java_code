
import javax.swing.JOptionPane;

class Main{
    public static void main(String[] args) {
        
        String value = JOptionPane.showInputDialog("How many cookies do you want?");
            double user_cookies = Integer.parseInt(value);

        
        // Original cups for recipe 
        double original_cups_of_sugar_per_batch = 1.5 ;
        double original_cups_of_butter_per_batch = 1;
        double original_cups_of_flour_per_batch = 2.75;
        int original_recipe_cookies_batch = 48;


        double user_cups_of_sugar = (user_cookies / original_recipe_cookies_batch) * original_cups_of_sugar_per_batch ;
        double user_cups_of_butter = (user_cookies/original_recipe_cookies_batch) *original_cups_of_butter_per_batch;
        double user_cups_of_flour = (user_cookies/original_recipe_cookies_batch) * original_cups_of_flour_per_batch ;

        JOptionPane.showMessageDialog(null,"For " + user_cookies + " cookies you will need " + user_cups_of_sugar + " cups of sugar, " + user_cups_of_butter + " cups of butter, " + user_cups_of_flour + " cups of flour.") ;

    }



}


// Ask user how many cookies they want to make 
// Display the amount of cups if ingreadients using Joptionspane

//MATH:
// 
//
//