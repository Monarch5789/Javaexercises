public class Professor {

    private String firstName;
    private String lastName;
    private int id;
    private String department;
    private double salary;

    public Professor(String fName, String lName, int id, String dept, double salary) {
        this.firstName = fName;
        this.lastName = lName;
        this.id = id;
        department = dept;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void display() {
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("ID: " + this.id);
        System.out.println("Department: " + department + "\tSalary: " + salary);
    }

    @Override
    public String toString() {
        return "Professor - " + this.firstName + " " + this.lastName;
    }
}