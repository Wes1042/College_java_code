

class Main{
public static void main(String[] args) {
car car = new car(2002,"toyota", 0);

for (int i = 1 ; i <= 5; i++){
    car.accelerate();
    System.out.println("The " + car.make + " year model " + car.yearModel +" has accelerated... " + car.speed);

}
for (int i = 1 ; i <= 5; i++){
    car.brake();
    System.out.println("The " + car.make + " year model " + car.yearModel +" has decelerated... " + car.speed);

}
}}