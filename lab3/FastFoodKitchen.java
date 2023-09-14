import java.util.*;

public class FastFoodKitchen {
   private ArrayList<Order> orderList = new ArrayList<Order>();
   private static int nextOrderNum = 0; 

   
   /** 
    * @return int
    */
   public int getNextOrderNum(){
    return nextOrderNum;
   }

   private static void incrementNextOrderNum(){
    nextOrderNum += 1;
    return;
   }
   public FastFoodKitchen(){
    Order theOrder = new Order(3,15,4,10,false, nextOrderNum);
    incrementNextOrderNum();
    orderList.add(theOrder);
   }
   
   /** 
    * @param ham
    * @param cheese
    * @param veggie
    * @param soda
    * @param togo
    * @return int
    */
   public int addOrder(int ham, int cheese, int veggie, int soda, boolean togo){
    Order curOrder = new Order(ham,cheese,veggie,soda,togo,nextOrderNum);
    orderList.add(curOrder);
    nextOrderNum += 1;
    return curOrder.getOrderNum();
   }

   public boolean cancelLastOrder(){
    if(orderList.size()>0){
        orderList.remove(orderList.size()-1);
        nextOrderNum -= 1;
        return true;
    }
    else{
        return false;
    }
   }

   public int getNumOrdersPending(){
    return orderList.size();
   }

   // Part C??

   public boolean isOrderDone(int orderID){ // is it done
    for(int i = 0; i<orderList.size();i++){
        if(nextOrderNum==orderID){
            return false;
        }
    }
    return true;
   }

   public boolean cancelOrder(int orderID){ // cancel it
    for(int i=0;i<orderList.size();i++){
        if(nextOrderNum == orderID){
            return true;
        }
    }
    return false;
   }

   public int findOrderSeq(int orderID){
    int count = 0;
    for(int i=0; i<orderList.size(); i++){
        if(orderList.get(i).getOrderNum()==orderID){
            count += 1;
            return i;
        }
    }
    return count;
   }


   public void selectionSort(){
    for(int j=0; j<orderList.size(); j++){
        int minimumIndex = j;

        for(int k=j+1; k<orderList.size();k++){
            Order order1 = orderList.get(k);
            Order order2 = orderList.get(minimumIndex);

            int burgersInOrder1 = order1.getNumHamburgers() + order1.getNumCheeseburgers() + order1.getNumVeggieburgers();
            int burgersInOrder2 = order2.getNumHamburgers() + order2.getNumCheeseburgers() + order2.getNumVeggieburgers();


            if(burgersInOrder1 < burgersInOrder2){
                minimumIndex = k;
            }
        }
        Order swap = orderList.get(j);
        orderList.set(j, orderList.get(minimumIndex));
        orderList.set(minimumIndex,swap);

    }

    
   }
   public ArrayList<Order> getOrderList(){
    return orderList;
   }

   public void insertionSort(){
    int i;
    int j;
    for(i = 1; i<orderList.size();i++){
        Order tmp = orderList.get(i);
        j=i;
        while((j>0)&& tmp.getOrderNum() < orderList.get(j-1).getOrderNum()) {
            orderList.set(j, orderList.get(j-1));
            j--;
        }
        orderList.set(j,tmp);
    }
    }

    public int findOrderBin(int orderID){
        int left = 0;
        int right = orderList.size() - 1;
        while(left<=right){
            int mid = left + (right - left) /2;
            Order midOrder = orderList.get(mid);

            if(midOrder.getOrderNum() == orderID){
                return mid;
            }
            else if(midOrder.getOrderNum()< orderID){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        } 
        return -1;
    }
}
