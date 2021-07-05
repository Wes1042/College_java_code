import java.util.Scanner;

class Main{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
car car = new car();
System.out.println("This program will create a car and you will be able to control it\nPlease follow the instructions... ");
System.out.println("Please input your car name:  ");
car.setMake(input.nextLine());
System.out.println("Please input your car year model:  ");
car.setCarYearModel(input.nextLine());
System.out.println("----------------------------------------------------");
System.out.println(car.make);
System.out.println(car.yearModel);
System.out.println(car.speed);

System.out.println("Type accelerate to move 5 foward\ntype break to move back 5");
String  speed_input= input.nextLine();

//for (int i = 0 ; i <= 5; i++){
    if (speed_input == "accelerate"){

        car.accelerate();
        System.out.println(car.speed);
    }  
    else if( speed_input == "brake" ){
        car.brake();
        System.out.println(car.speed);
    }
    else {
    car.speed = car.speed;
    }
//}
System.out.print(car.speed);
}

}