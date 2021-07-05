class Main{
public static void main(String[] args) {
    Die user_die = new Die(6);
    Die computer_die = new Die(6);
    int userWins = 0, computerWins = 0;

for(int current_roll = 1 ;current_roll <=10; current_roll++  ){

    user_die.roll();
    computer_die.roll();

    System.out.println("Score:\tComputer Wins: " + computerWins + "\tUser Wins: " + userWins);
    
    if(user_die.get_die_value() > computer_die.get_die_value()){
        userWins +=1;
        System.out.println("This round user Wins!");
    }
    else if (user_die.get_die_value() < computer_die.get_die_value()){
        computerWins+=1;
        System.out.println("This round Computer Wins!");
    }
    else {
        System.out.println("This round it was a tie! ");
    }
System.out.println("---------------------------------------------------------");
    
}   
if(userWins > computerWins){
        System.out.println("The Grand winner of this 10 round game is the User!!!!!");
    }
    else if(computerWins > userWins){
        System.out.println("The Grand winner of this 10 round game is the Computer!!!!!");
    }
    else if( computerWins == userWins){
        System.out.println("It is a draw!!!");
    }
    }
}