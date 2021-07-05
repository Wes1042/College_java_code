import java.util.Random;
public class Die {
    private int number_of_sides , die_value;

    public void roll(){
        Random random = new Random();

        die_value = random.nextInt(number_of_sides);

    }
    public int get_die_value(){
        return die_value;

    }
    public Die (int number_of_sides_Given){
        number_of_sides = number_of_sides_Given;
        roll();
    }



}
