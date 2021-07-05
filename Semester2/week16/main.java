class Main{
 public static void main(String[] args) {

    RetailItem retailItem = new RetailItem("jacket", 12 , 59.95);
    RetailItem retailItem1 = new RetailItem("Designer Jeans", 40 , 34.95);
    RetailItem retailItem2 = new RetailItem("Shirt", 20 , 24.95);

System.out.println("\t\tDescription\t\tUnit on Hand\t\tPrice");
System.out.println("--------------------------------------------------------------------------");
System.out.println("Item #1\t\t" + retailItem.description+ "\t\t\t\t" + retailItem.unitOnHand + "\t\t" + retailItem.price);
System.out.println("Item #2\t\t" + retailItem1.description+ "\t\t\t" + retailItem1.unitOnHand + "\t\t" + retailItem1.price);
System.out.println("Item #3\t\t" + retailItem2.description+ "\t\t\t\t" + retailItem2.unitOnHand + "\t\t" + retailItem2.price);





}








}