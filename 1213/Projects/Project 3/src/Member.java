
import java.util.ArrayList;


/**
 *
 * @author Adam Whaley and Aidan Perkins
 */
public class Member {
    
    private String name;
    private int memberID;
    private boolean newsletterSubscribed;
    private ArrayList<Dog> dogsOwned = new ArrayList<Dog>();
    private ArrayList<Cat> catsOwned = new ArrayList<Cat>();
    private ArrayList<ExoticPet> exoticPetsOwned = new ArrayList<ExoticPet>();
     private double amountSpent = 0;

    public Member(String name, int memberID, boolean newsletterSubscribed) {
        this.name = name;
        this.memberID = memberID;
        this.newsletterSubscribed = newsletterSubscribed;
        
    }

    
    /** 
     * @return String
     */
    public String getName() {
        return name;
    }

    
    /** 
     * @return int
     */
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

    
    /** 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    
    /** 
     * @param memberID
     */
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

     public String toString(){
        String memString = this.getName() + ", " + this.getMemberID() + ", false";
        return memString;
    }
}
