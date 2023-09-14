import java.util.*;

public class Module3Test {
    public static void main(String[] args){
        FastFoodKitchen kitchen = new FastFoodKitchen();

        // Part A
        kitchen.addOrder(2, 2, 1, 4, true);
        kitchen.addOrder(2, 3, 6, 0, true);
        kitchen.addOrder(1, 4, 5, 2, false);
        int orderPosition = kitchen.findOrderSeq(4);
        System.out.println("Using sequential search >> order position is " + orderPosition);
        // b
        kitchen.selectionSort();
        ArrayList<Order> sortedOrders = kitchen.getOrderList();
        int orderSize = 0;
        for(Order order : sortedOrders){
            orderSize = order.getNumCheeseburgers() + order.getNumHamburgers() + order.getNumVeggieburgers();
            System.out.println(order.getOrderNum() + " has " + orderSize + " burgers.");
        }
        System.out.println(" ========================================== ");
        System.out.println("Using Insertion sort: ");
        // part c
        kitchen.insertionSort();
        for(Order order2 : sortedOrders){
         orderSize = order2.getNumCheeseburgers() + order2.getNumHamburgers() + order2.getNumVeggieburgers();
            System.out.println(order2.getOrderNum() + " has " + orderSize + " burgers.");
        }
        // Part D
        System.out.println(" ========================================== ");
        orderPosition = kitchen.findOrderBin(2);
        System.out.println("Using binary search >> order position is: " + orderPosition);
    }
}
