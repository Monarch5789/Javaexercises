
import java.util.ArrayList;
/**
 *
 * @author Adam Whaley and Aidan Perkins
 */

public class PremiumMember extends Member{
    
    //private String name;
    private int memberID;
    private boolean newsletterSubscribed;
    private ArrayList<Dog> dogsOwned = new ArrayList<Dog>();
    private ArrayList<Cat> catsOwned = new ArrayList<Cat>();
    private ArrayList<ExoticPet> exoticPetsOwned = new ArrayList<ExoticPet>();
    private boolean duesPaid;
    private double amountSpent = 0;

    public PremiumMember(String name, int memberID, boolean newsletterSubscribed, boolean duesPaid) {
        super(name, memberID, newsletterSubscribed);
        this.duesPaid = duesPaid;
    }

    
    /** 
     * @return boolean
     */
    public boolean isDuesPaid() {
        return duesPaid;
    }

    
    /** 
     * @param duesPaid
     */
    public void setDuesPaid(boolean duesPaid) {
        this.duesPaid = duesPaid;
    }
    
    
    
    /** 
     * @return int
     */
    //  public String getName() {
    //     return this.name;
    // }

    public int getMemberID() {
        return memberID;
    }

    
    /** 
     * @return boolean
     */
    public boolean isNewsletterSubscribed() {
        return newsletterSubscribed;
    }

    
    /** 
     * @return ArrayList<Dog>
     */
    public ArrayList<Dog> getDogsOwned() {
        return dogsOwned;
    }

    
    /** 
     * @return ArrayList<Cat>
     */
    public ArrayList<Cat> getCatsOwned() {
        return catsOwned;
    }

    
    /** 
     * @return ArrayList<ExoticPet>
     */
    public ArrayList<ExoticPet> getExoticPetsOwned() {
        return exoticPetsOwned;
    }

    
    /** 
     * @return double
     */
    public double getAmountSpent() {
        return amountSpent;
    }

    // public void setName(String name) {
    //     this.name = name;
    // }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    
    /** 
     * @param newsletterSubscribed
     */
    public void setNewsletterSubscribed(boolean newsletterSubscribed) {
        this.newsletterSubscribed = newsletterSubscribed;
    }

    
    /** 
     * @param amountSpent
     */
    public void setAmountSpent(double amountSpent) {
        this.amountSpent = this.amountSpent + amountSpent;
    }     
     
     /** 
      * @param dog
      */
     public void addDog(Dog dog) {
         dogsOwned.add(dog);
     }
     
     /** 
      * @param cat
      */
     public void addCat(Cat cat) {
         catsOwned.add(cat);
     }
     
     /** 
      * @param exoticPet
      */
     public void addExoticPet(ExoticPet exoticPet) {
         exoticPetsOwned.add(exoticPet);
     }
}
