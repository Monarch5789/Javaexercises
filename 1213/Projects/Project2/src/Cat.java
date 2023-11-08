/**
 *
 * @author Adam Whaley and Aidan Perkins
 */
public class Cat extends Pet {
    
    private String breed;

    public Cat(String name, String breed, String sex, int age, double weight, int ID, double price) {
        super(name, sex, age, weight, ID, price);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }



    
}
