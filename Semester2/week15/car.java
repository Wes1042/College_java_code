public class car {
    int yearModel,speed;
    String make ;
    // getting inputs from user to use 
    public int getYearModel(){
        return yearModel;
    } 
    public int getSpeed(){
        return speed;
    }
    public String getMake(){
        return make;
    }
    


// movement methods
public void accelerate(){
    speed += 5;
}
public void brake(){
    speed -= 5;
}

// creating objects 
public car(){ // starting object 
    yearModel = 0;
    make = "";
    speed = 0 ;

}

public car(int carYearModdel, String carMake, int carSpeed){ // object in motion 
    yearModel = carYearModdel;
    make = carMake;
    speed = carSpeed;


}
}


/*
Crete a program that 
main()
ask the user for car model 
console will display the current speed
user will type accelerate for +5 speed
user will type brake for -5 speed

car()
make object oriented that updates the values 

*/