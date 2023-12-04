
/**
 *
 * @author Adam Whaley and Aidan Perkins
 */
 
public class ExoticPet extends Pet {
    
    private String species;
    
    public ExoticPet(String name, String species, String sex, int age, double weight, int ID, double price) {
        super(name, sex, age, weight, ID, price);
        this.species = species;
    }

    
    /** 
     * @return String
     */
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    

    public String toString(){
        String petString = this.getClass() + "," + this.getSpecies() + "," + this.getName() + "," + this.getID() + "," + this.getPrice() + "," + this.getSex() + "," + this.getAge() + "," + this.getWeight();
        return petString;
    }
}
