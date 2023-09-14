public class StoreProduct{

    public String label;
    public int price;
    public String category;
    public boolean hasExpiration;
    public int stock;

    public StoreProduct(String aLabel, int aPrice, String aCategory, boolean isExpired, int numStock){
        this.label = aLabel;
        this.price = aPrice;
        this.category = aCategory;
        this.hasExpiration = isExpired;
        this.stock = numStock;

    }

    public StoreProduct(String aLabel, int aPrice, int numStock){ // secondary 1
        this.label = aLabel;
        this.price = aPrice;
        this.stock = numStock;
        this.category = "Misc";
        this.hasExpiration = false;
    }

    public StoreProduct(String aLabel, int aPrice){ // secondary 2
        this.label = aLabel;
        this.price = aPrice;
        this.category = "Misc";
        this.hasExpiration = false;
        this.stock = 0;
    }

    public StoreProduct(String aLabel, int aPrice, String aCategory, boolean isExpired){ // secondary 3
        this.label = aLabel;
        this.price = aPrice;
        this.category = aCategory;
        this.hasExpiration = isExpired;
        this.stock = 0;
    }

    
    /** 
     * @param hasExpired
     */
    public void expired(boolean hasExpired){ // has expired? set stock to 0
        if(hasExpiration && hasExpired){
            this.stock = 0;
        }
        else{

        }
    }

    public boolean sale(int quantity){ // check if we can sell
        if(quantity<=this.stock){
            stock -= quantity;
            return true;
        }
        else{
            return false;
        }
    }

    public double getDiscountedPrice(double discount){ // get price discounts
        return(price*(1-discount));
    }

}