
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    

    
}
