public class Person {
    private String firstName;
    private String lastName;
    private int id;

    public Person(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    
    /** 
     * @return String
     */
    public String getFirstName(){
        return firstName;
    }

    
    /** 
     * @return String
     */
    public String getLastName(){
        return lastName;
    }

    
    /** 
     * @return int
     */
    public int getId(){
        return id;
    }

    public void display(){
        System.out.println("First Name: " + firstName + " Last Name: " + lastName + " \nID: " + id);
    }
}
