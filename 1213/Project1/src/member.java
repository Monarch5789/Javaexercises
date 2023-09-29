import java.util.Scanner;
public class member {
    
    private int id = 0;
    private boolean isPremium;
    private int booksPurchased;
    private int compactDisksPurchased;
    private int DVDsPurchased;
    private double totalSpent;
    private boolean feeDue;
    private boolean payMethod;
    //private int nextID = id + 1;


    public member(int id, boolean isPremium, int booksPurchased, int compactDisksPurchased, int DVDsPurchased, double totalSpent, boolean feeDue, boolean payment){
        setID(id);
        setPremium(isPremium);
        setBooksPurchased(0);
        setCDsPurchased(0);
        setDVDsPurchased(0);
        setTotalSpent(0.00);
        setFeeDue(feeDue);
        setPayMethod(payment);
    }
    // public member(int id, double totalSpent){
        
    // }
    

    public void setID(int h){ // setID
        if(h<0){
            System.out.println("Number must be 0 or greater");
        }
        else{
            this.id = h;
        }
    }

    
    /** 
     * @param h)if(h<0
     * @return int
     */
    public int getID(){ // getID
        return id;
    }

    
    /** 
     * @param h)if(h<0
     */
    public void setPremium(boolean t){ // set premium
        this.isPremium = t;
    }

    public boolean getPremium(){ // get premium
        return isPremium;
    }

    public void setBooksPurchased(int h){ // set books purchased
        if(h<0){
            System.out.println("Number must be 0 or greater");
        }
        else{
            this.booksPurchased = h;
        }
    }

    public int getBooksPurchased(){ // get books purchased
        return booksPurchased;
    }
    public void setCDsPurchased(int h){ // set CDs purchased
        if(h<0){
            System.out.println("Number must be 0 or greater");
        }
        else{
            this.compactDisksPurchased = h;
        }
    }

    public int getCompactDisksPurchased(){ // get CDs purchased
        return compactDisksPurchased;
    }

    public void setDVDsPurchased(int h){ // set DVDs purchased
        if(h<0){
            System.out.println("Number must be 0 or greater");
        }
        else{
            this.DVDsPurchased = h;
        }
    }

    public int getDVDsPurchased(){ // get DVDs purchased
        return DVDsPurchased;
    }

    public void setFeeDue(boolean h){ // set Fee is due
        this.feeDue = h;
    }

    public boolean getFeeDue(){ // get fee is due
        return feeDue;
    }

    public void setTotalSpent(double h){ // set total spent
        if(h<0){
            System.out.println("Number must be 0 or greater");
        }
        else{
            this.totalSpent = h;
        }
    }

    public double getTotalSpent(){ // get total spent
        return totalSpent;
    }

    public void setPayMethod(boolean h){ // set pay method
        this.payMethod = h;
    }

    public boolean getPayMethod(){ // get pay method
        return payMethod;
    }
    
}
