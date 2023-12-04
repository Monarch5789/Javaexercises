/**
 *
 * @author Adam Whaley and Aidan Perkins
 */

import java.util. *;
//import java.io.*;


public class PetStore implements PetStoreSpecification{

    private String storeName;

    private ArrayList<Dog> availableDogs = new ArrayList<Dog>();
    private ArrayList<Cat> availableCats = new ArrayList<Cat>();
    private ArrayList<ExoticPet> availableExoticPets = new ArrayList<ExoticPet>();
    private ArrayList<Member> memberList = new ArrayList<Member>();
    private ArrayList<PremiumMember> premiumMemberList = new ArrayList<PremiumMember>();
    private static int nextPetID = 1;
    private static int nextMemberID = 1;


    public PetStore(String storeName) {
        this.storeName = storeName;
        // Dog dog1 = new Dog(
        //     "Waffle",
        //     "German Shepherd",
        //     "Female",
        //     12,
        //     85,
        //     getNextPetID(),
        //     500
        // );
        // Dog dog2 = new Dog("Poe", "Corgi", "Male", 3, 35, getNextPetID(), 450);
        // Cat cat1 = new Cat(
        //     "Karma",
        //     "Orange Tabby",
        //     "Female",
        //     6,
        //     15,
        //     getNextPetID(),
        //     200
        // );
        // Cat cat2 = new Cat("Kit", "Maine Coon", "Male", 6, 18, getNextPetID(), 150);
        // ExoticPet ep1 = new ExoticPet(
        //     "Pancake",
        //     "Bearded Dragon",
        //     "Male",
        //     6,
        //     0.8,
        //     getNextPetID(),
        //     75
        // );
        // ExoticPet ep2 = new ExoticPet(
        //     "Noodle",
        //     "Ball Python",
        //     "Male",
        //     4,
        //     2,
        //     getNextPetID(),
        //     95
        // );

        // availableDogs.add(dog1);
        // availableDogs.add(dog2);
        // availableCats.add(cat1);
        // availableCats.add(cat2);
        // availableExoticPets.add(ep1);
        // availableExoticPets.add(ep2);

        Member member1 = new Member("Jo", getNextMemberID(), true);
        member1.addCat(new Cat("Valjean", "White tabby", "Male", 1, 10, 0, 0));
        memberList.add(member1);

        PremiumMember member2 = new PremiumMember("Sage", getNextMemberID(), false, false);
        //PremiumMember member3 = new PremiumMember("Sage1", getNextMemberID(), false, false);
        //premiumMemberList.add(member3);
        premiumMemberList.add(member2);
        member2.addExoticPet(
            new ExoticPet("Smaug", "Bearded Dragon", "Male", 5, 1, 0, 0)
        );

    }

    
    /** 
     * @return int
     */
    public static int getNextPetID() {
        nextPetID++;
        return nextPetID - 1;
    }
    
    
    /** 
     * @return int
     */
    public static int getNextMemberID() {
        nextMemberID++;
        return nextMemberID - 1;
    }


    
    /** 
     * @return String
     */
    public String getStoreName() {
        return storeName;
    }

    
    /** 
     * @param storeName
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    
    /** 
     * @return ArrayList<Dog>
     */
    public ArrayList<Dog> getAvailableDogs() {
        return availableDogs;
    }

    
    /** 
     * @param availableDogs
     */
    public void setAvailableDogs(ArrayList<Dog> availableDogs) {
        this.availableDogs = availableDogs;
    }

    
    /** 
     * @return ArrayList<Cat>
     */
    public ArrayList<Cat> getAvailableCats() {
        return availableCats;
    }

    
    /** 
     * @param availableCats
     */
    public void setAvailableCats(ArrayList<Cat> availableCats) {
        this.availableCats = availableCats;
    }

    
    /** 
     * @return ArrayList<ExoticPet>
     */
    public ArrayList<ExoticPet> getAvailableExoticPets() {
        return availableExoticPets;
    }

    
    /** 
     * @param availableExoticPets
     */
    public void setAvailableExoticPets(ArrayList<ExoticPet> availableExoticPets) {
        this.availableExoticPets = availableExoticPets;
    }

    
    /** 
     * @return ArrayList<Member>
     */
    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    
    /** 
     * @param memberList
     */
    public void setMemberList(ArrayList<Member> memberList) {
        this.memberList = memberList;
    }

    
    /** 
     * @return ArrayList<PremiumMember>
     */
    public ArrayList<PremiumMember> getPremiumMemberList() {
        return premiumMemberList;
    }

    
    /** 
     * @param premiumMemberList
     */
    public void setPremiumMemberList(ArrayList<PremiumMember> premiumMemberList) {
        this.premiumMemberList = premiumMemberList;
    }

    
    /** 
     * @param type
     * @param index
     */
    public void removePet(String type, int index) {
        if (type.equals("dog")) 
            availableDogs.remove(index);
        else if (type.equals("cat")) 
            availableCats.remove(index);
        else if (type.equals("exoticPet")) 
            availableExoticPets.remove(index);

    }

     
     /** 
      * @param name
      * @param premium
      */
     public void addNewMember(String name, boolean premium) {
        if (premium) {
            premiumMemberList.add(new PremiumMember(name,getNextMemberID(),false,false));
        } else {
            memberList.add(new Member(name,getNextMemberID(), false));
        }
    }

    
    /** 
     * @param Pets
     */
    public void adoptionDrive(ArrayList<Pet> Pets){
        for(Pet x : Pets){
            if(x instanceof Cat){
                availableCats.add((Cat) x);

            }
            else if(x instanceof Dog){
                availableDogs.add((Dog) x);
            }
            else if(x instanceof ExoticPet){
                availableExoticPets.add((ExoticPet) x);
            }
        }
    }

    
    /** 
     * @return double
     */
    public double inventoryValue(){
         double value = 0.0;
         double valueDogs = 0;
         double valueCats = 0;
         double valueExoticPets = 0;

         ArrayList<Dog> availableDogs = getAvailableDogs();
         for(Dog dogs : availableDogs){
            double tempPrice = dogs.getPrice();
            valueDogs += tempPrice;

         }
         ArrayList<Cat> availableCats = getAvailableCats();
         for(Cat cats : availableCats){
            double tempPrice = cats.getPrice();
            valueCats += tempPrice;
         }
         ArrayList<ExoticPet> availableExoticPets = getAvailableExoticPets();
         for(ExoticPet exoticPets : availableExoticPets){
            double tempPrice = exoticPets.getPrice();
            valueExoticPets += tempPrice;
         }
         value = valueCats + valueDogs + valueExoticPets;
         System.out.println(value);
         // get available dogs, cats, exotic pets, then get the number of each available and multiply by appropriate prices, then add and return that value
        return value;
    }
}
