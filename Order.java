public class Order {
    // initiallize all our variables
    private int numHamburgers = 0;
    private int numCheeseburgers = 0;
    private int numVeggieburgers = 0;
    private int numSodas = 0;
    private boolean orderToGo = false;
    private int orderNum = 1;
    
    //constructor
    public Order(int hamburgers, int cheeseburgers, int veggieburgers, int sodas, boolean togo, int number){
        setNumHamburgers(hamburgers);
        setNumCheeseburgers(cheeseburgers);
        setNumVeggieburgers(veggieburgers);
        setNumSodas(sodas);
        setOrderToGo(togo);
        setOrderNum(number);

    }

    
    /** 
     * @param k
     * @param h (number items)
     * @return int
     */
    // Getters and setters for all!

    public int getNumHamburgers(){ // Getter Hamburgers
        return numHamburgers;
    }

    
    /** 
     * @param h)if(h<0)System.out.println("Error
     * @param hamburgers"
     */
    public void setNumHamburgers(int h){ // Setter hamburgers
        if(h<0){ // H cannot be less than 0
            System.out.println("Error, there must be at least 0 hamburgers");
        }
        else{
            this.numHamburgers = h;
        }
    }
    
    /** 
     * @param h)if(h<0
     * @return int
     */
    public int getNumCheeseburgers(){ // Getter Cheeseburgers            Cheeseburger Supremacy
        return numCheeseburgers;
    }

    public void setNumCheeseburgers(int h){ // Setter Cheeseburgers      Cheeseburger Supremacy
        if(h<0){
            System.out.println("Error, there must be at least 0 cheeseburgers");
        }
        else{
            this.numCheeseburgers = h;
        }
    }

    public int getNumVeggieburgers(){ // Getter Veggieburgers 
        return numVeggieburgers;
    }

    public void setNumVeggieburgers(int h){ // setter veggieburgers
        if(h<0){
            System.out.println("Error, there must be at least 0 veggieburgers");
        }
        else{
            this.numVeggieburgers = h;
        }
    }

    public int getNumSodas(){ // Getter sodas
        return numSodas;
    }

    public void setNumSodas(int h){ // Setter sodas
        if(h<0){
            System.out.println("Error, there must be at least 0 sodas");
        }
        else{
            this.numSodas = h;
        }
    }

    public boolean isOrderToGo(){ // getter to go
        return orderToGo;
    }

    public void setOrderToGo(boolean h){ // setter to go?
        this.orderToGo = h;

    }

    public int getOrderNum(){ // getter order number
        return orderNum;
    }

    public void setOrderNum(int h){
        if(h<0){
            System.out.println("Error, order number must be a positive integer");
        }
        else{
            this.orderNum = h;
        }
    }

}
