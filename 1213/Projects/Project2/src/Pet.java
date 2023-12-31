/**
 * @author Aidan Perkins
 */

public abstract class Pet implements Comparable<Pet>{
    private String name;
    private String sex;
    private int age;
    private double weight;
    private int ID;
    private double price;

    public Pet(String name, String sex, int age, double weight, int ID, double price){

        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.ID = ID;
        this.price = price;

    }

    
    /** 
     * @return double
     */
    public double getPrice() {
        return price;
    }
    
    /** 
     * @return int
     */
    public int getID() {
        return ID;
    }
    
    /** 
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }
    
    /** 
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    /** 
     * @return String
     */
    public String getName() {
        return name;
    }
    
    /** 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /** 
     * @return String
     */
    public String getSex() {
        return sex;
    }
    
    /** 
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    /** 
     * @return int
     */
    public int getAge() {
        return age;
    }
    
    /** 
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /** 
     * @return double
     */
    public double getWeight() {
        return weight;
    }
    
    /** 
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    /** 
     * @param o
     * @return int
     */
    public int compareTo(Pet o){
        double sPrice = o.getPrice();
        double iPrice = this.getPrice();
        //double iPrice = i.getPrice();
        
        if(sPrice > iPrice){
            System.out.println("The Second Pet is more expensive");
            return 1;
        }
        else{
            System.out.println("The first pet is more expensive");
            return 0;
        }
    }
    
    /** 
     * @return String
     */
    @Override
    public String toString(){
        String petString = "Name: " + this.getName() + " ID: " + this.getID() + " Price: $" + this.getPrice();
        return petString;
    }
}
