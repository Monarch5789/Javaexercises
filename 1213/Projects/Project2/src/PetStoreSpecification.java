import java.util.ArrayList;

public interface PetStoreSpecification {
    /**
     * Update inventory by adding the given pets
     * to the store's current inventory
     * 
     * @param pets
     * @return
     *  */
    public void adoptionDrive(ArrayList<Pet> pets);   

    /**
     * calculate and return the dollar armount for current inventory of pets
     * that are in stock
     * 
     * @return total in stock value
     */
    public double inventoryValue();
}
