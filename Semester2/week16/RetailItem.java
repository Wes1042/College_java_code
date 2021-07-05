

public class RetailItem{
String description ;
int unitOnHand;
double price; 


 public String getDescription(){
     return description;
 }
public int getUnitOnHand(){
    return unitOnHand;
}
public double getPrice(){
    return price;
}


public  RetailItem(){
    description = "";
    unitOnHand = 0;
    price = 0;


}
public RetailItem(String objectDescription, int objectUnit, double objectPrice) {
    description = objectDescription;
    unitOnHand = objectUnit;
    price = objectPrice;


}}