class Main{


public static void main(String[] args) {
    //Last months share code
    int amount_buy_share;
    double price_buy_share;
    double total_buy_commision;
    double total_stock;

    
    amount_buy_share = 1000;
    price_buy_share = 32.87;
    total_stock = price_buy_share * amount_buy_share;
    total_buy_commision = total_stock * .02;
    
    // 2 weeks later code
    double amount_sold_share;
    double price_sold_share;
    double total_sold_commision;
    double total_sold_stock;

    
    amount_sold_share = 1000;
    price_sold_share = 33.92;
    total_sold_stock = amount_sold_share * price_sold_share;
    total_sold_commision = total_sold_stock * .02;

    double total_profit;
    total_profit = (total_sold_stock - total_sold_commision) - (total_stock - total_buy_commision);

    System.out.println("Last Month : ");
    System.out.println("Amount of money joe paid for the stock : $" + total_stock);
    System.out.println("Amount of commision Joe paid for the stock : $" + total_buy_commision);

    System.out.println("2 weeks later : ");
    System.out.println("Amount of money recieved from sold stock : $" + total_sold_stock);
    System.out.println("Amount of commision Joe paid for sold stock: $" + total_sold_commision);
    
    System.out.println("Amount of profit Joe made in total : $" + total_profit);



    


    
    
}
}
//How much was paid for the stock 
//How much commision (2%) was paid per bought stock
//How much did he sell the stock for (no commision involved)
//How much commision (2%) was paid per sold stock
//The amount of revenue they gained 