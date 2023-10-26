public abstract class Person {

    private String firstName;
    private String lastName;

    private int id;

    public Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getFirstName() {
        return firstName;
    }
    
   /**
     * Get the value of lastName
     *
     * @return the value of lastName
     */
    public String getLastName() {
        return lastName;
    }
      
    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    public abstract void display();
    
    @Override
    public boolean equals(Object other){
         if (other == null) {
            return false;
        }

        if (this.getClass() != other.getClass()) {
            return false;
        }

        return this.getId() == ((Person) other).getId();
    }

}