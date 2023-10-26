import java.util.ArrayList;

class Professor extends Person {

    private String department;
    private double salary;
    private ArrayList<Student> advisees;

    public Professor(String firstName, String lastName, int id, String dept, double salary) {
        super(firstName, lastName, id);
        department = dept;
        this.salary = salary;
        advisees = new ArrayList<Student>();

    }
    
    public String getDepartment(){
        return department;
    }
    
    public ArrayList<Student> getAdvisees(){
        return advisees;
    }

    void addAdvisee(Student student) {
        advisees.add(student);
    }

    boolean removeAdvisee(int id) {
        boolean remove = false;
        for (Student advisee : advisees) {
            if (advisee.getId() == id) {
                advisees.remove(advisee);
                return true;
            }
        }
        return remove;
    }

    @Override
    public void display() {
        //super.display();
        System.out.println("Name: " + this.getFirstName());
        System.out.println("Department: " + department + "\tSalary: " + salary);
        System.out.println("Advisees:");
        for (Student s : advisees) {
            System.out.println("\t"+s.getFirstName() + " " + s.getLastName());
        }
    }
    
    @Override
    public String toString(){
        return "Professor - "+ this.getFirstName() + " "+ this.getLastName();
    }
}
