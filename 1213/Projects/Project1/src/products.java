public class products {
    private int numberOfBooks = 500;
    private int numberOfCDs = 500;
    private int numberOfDVDs = 500;
    private double priceBook = 9.99;
    private double priceCD = 2.99;
    private double priceDVD = 14.99; 
    private double totalPurchaseCost;



    public products(int numBooks, int numCDs, int numDVDs, int id){ // constructor for buying all
        setNumberofBooks(getNumberOfBooks() - numBooks);
        setNumberCDs(getNumberCDs() - numCDs);
        setNumberDVDs(getNumberDVDs() - numDVDs);
        
        double totalPurchaseCost = ((numBooks * priceBook) + (numCDs * priceCD) + (numDVDs * priceDVD));
        System.out.println(" \t Your total is $" + totalPurchaseCost);
        
    }
        public products(int numBooks, int numCDs, int numDVDs){ // constructor for buying all
        setNumberofBooks(getNumberOfBooks() - numBooks);
        setNumberCDs(getNumberCDs() - numCDs);
        setNumberDVDs(getNumberDVDs() - numDVDs);
        
        double totalPurchaseCost = ((numBooks * priceBook) + (numCDs * priceCD) + (numDVDs * priceDVD));
        System.out.println(" \t Your total is $" + totalPurchaseCost);
        
    }
    
    /** 
     * @param 0
     */
    public void setNumberofBooks(int h){ // set books
        if(h < 0){
            System.out.println("Number must be 0 or greater");
        }
        else{
            this.numberOfBooks = h;
        }
    }
    
    /** 
     * @param h)if(h<0
     * @return int
     */
    public int getNumberOfBooks(){ // get books
        return numberOfBooks;
    }
    public void setNumberCDs(int h){ // Set CDs
        if(h<0){
            System.out.println("Number must be 0 or greater");
        }
        else{
            this.numberOfCDs = h;
        }
    }
    public int getNumberCDs(){ // Get CDs
        return numberOfCDs;
    }
    public void setNumberDVDs(int h){ // get DVDs
        if(h<0){
            System.out.println("Number must be 0 or greater");
        }
        else{
            this.numberOfDVDs = h;
        }    
    }
    public int getNumberDVDs(){ // get CDs
        return numberOfDVDs;
    }
    public void setTotalPurchaseCost(double h){
        this.totalPurchaseCost = h;
    }

    public double getTotalPurchaseCost(){
        return totalPurchaseCost;
    }
}
