import java.util.*;


public class Main {
    
    /** 
     * @param args
     */
    public static void main(String[] args){
        // Order order01 = new Order(3, 5, 4, 10, true, 1);
        // Order order02 = new Order(0,0,3,3,false,2);
        // Order order03 = new Order(1,1,0,2,false,3);

        // order01.setNumSodas(12);
        // System.out.println( // long line moment
        //     "Order{" + "numHamburgers=" + order01.getNumHamburgers() + ", numCheeseburgers=" + order01.getNumCheeseburgers() + ", numVeggieburgers=" + order01.getNumVeggieburgers() + ", numSodas=" + order01.getNumSodas() + ", orderToGo=" + order01.isOrderToGo() + ", orderNum=" + order01.getOrderNum() + "}"
        // );
        // System.out.println(
        //     "Order{" + "numHamburgers=" + order02.getNumHamburgers() + ", numCheeseburgers=" + order02.getNumCheeseburgers() + ", numVeggieburgers=" + order02.getNumVeggieburgers() + ", numSodas=" + order02.getNumSodas() + ", orderToGo=" + order02.isOrderToGo() + ", orderNum=" + order02.getOrderNum() + "}"
        // );
        // System.out.println(
        //     "Order{" + "numHamburgers=" + order03.getNumHamburgers() + ", numCheeseburgers=" + order03.getNumCheeseburgers() + ", numVeggieburgers=" + order03.getNumVeggieburgers() + ", numSodas=" + order03.getNumSodas() + ", orderToGo=" + order03.isOrderToGo() + ", orderNum=" + order03.getOrderNum() + "}"
        // );
        FastFoodKitchen kitchen = new FastFoodKitchen();
Scanner console = new Scanner(System.in);

while (kitchen.getNumOrdersPending() != 0) {
    // see what the user wants to do
    System.out.println("Please select from the following menu of options, by typing a number:");
    System.out.println("\t 1. Order food");
    System.out.println("\t 2. Cancel last order");
    System.out.println("\t 3. Show number of orders currently pending.");
    System.out.println("\t 4. Exit");
    System.out.println("\t 5. Check on an order");
    System.out.println("\t 6. Cancel an Order");

    int num = console.nextInt();
    switch (num) {

        case 1:
            System.out.println("How many hamburgers do you want?");
            int ham = console.nextInt();
            System.out.println("How many cheeseburgers do you want?");
            int cheese = console.nextInt();
            System.out.println("How many veggieburgers do you want?");
            int veggie = console.nextInt();
            System.out.println("How many sodas do you want?");
            int sodas = console.nextInt();
            System.out.println("Is your order to go? (Y/N)");
            char letter = console.next().charAt(0);
            boolean TOGO = false;
            if (letter == 'Y' || letter == 'y') {
                TOGO = true;
            }
            int orderNum = kitchen.addOrder(ham, cheese, veggie, sodas, TOGO);
            System.out.println("Thank-you. Your order number is " + (orderNum+1));
            System.out.println();
            break;
        case 2:
            boolean ready = kitchen.cancelLastOrder();
            if (ready) {
                System.out.println("Thank you. The last order has been canceled");
            } else {
                System.out.println("Sorry. There are no orders to cancel.");
            }
            System.out.println();
            break;
        case 3:
            System.out.println("There are " + kitchen.getNumOrdersPending() + " pending orders");
            break;
        case 4:
            System.exit(0);
            break;
        case 5:
            System.out.println("Please input the order number");
            int inOrderNum = console.nextInt();
            boolean orderIsDone = kitchen.isOrderDone(inOrderNum);
            if (orderIsDone){
                System.out.println("No order found");
            } 
            else{
                System.out.println("Your order is being prepared");
            }
            break;
        case 6:
            System.out.println("Please input the order number");
            int cancelNumber = console.nextInt();
            boolean iconsoleancelled = kitchen.cancelOrder(cancelNumber);
            if(iconsoleancelled){
                System.out.println("Your order has been successfully cancelled");
            }
            else{
                System.out.println("Sorry, we can't find your order number in the system.");
            }
            break;
        default:
            System.out.println("Sorry, but you need to enter a 1, 2, 3 or a 4");

    } // end switch statements

} // end while loop
console.close();
    }
}
