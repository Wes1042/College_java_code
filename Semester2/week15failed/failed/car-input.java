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
    

// setting object configuration 
public void setMake(String make_given){ // setting make object
    make = make_given;
}
public void setSpeed(int Speed_given){ // setting speed object 
    speed = Speed_given;
}
public void setSpeed(String Speed_given){ // converting int to string so we can use to display 
    speed = Integer.parseInt(Speed_given);
}
public void setCarYearModel(int car_year_given){ // setting cary year object
    yearModel = car_year_given;
}
public void setCarYearModel(String car_year_given){ // converting int to string so we can use to display 
    yearModel = Integer.parseInt(car_year_given);
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
public car(int carYearModdel , String carMake){ // starting object after user input
     yearModel = carYearModdel;
     make = carMake;
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