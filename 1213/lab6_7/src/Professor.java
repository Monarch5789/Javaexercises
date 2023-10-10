import java.util.ArrayList;

public class Professor extends Person {
    private String department;
    private double salary;
    private ArrayList<Student> advisees;

    public Professor(String firstName, String lastName, int id, String department, double salary){
        super(firstName, lastName, id);
        this.department = department;
        this.salary = salary;
        this.advisees = new ArrayList<Student>();

    }

    
    /** 
     * @return String
     */
    public String getDepartment(){
        return department;
    }
    
    /** 
     * @return double
     */
    public double getSalary(){
        return salary;
    }
    
    /** 
     * @return ArrayList<Student>
     */
    public ArrayList<Student> getAdvisees(){
        return advisees;
    }
    
    /** 
     * @param d
     */
    public void setDepartment(String d){
        department = d;
    }
    
    /** 
     * @param s
     */
    public void setSalary(double s){
        salary = s;
    }
    
    /** 
     * @param s
     */
    public void addAdvisee(Student s){
        advisees.add(s);
    }
    
    /** 
     * @param i
     * @return boolean
     */
    public boolean removeAdvisee(int i){
        for(Student student : advisees){
            if(student.getId() == i){
                advisees.remove(student);
                return true;
            }
        }
        return false;
    }

    public void display(){
        super.display();
            System.out.println("Department: " + department + "\tSalary:" + salary);
            System.out.println("Advisees: ");
            for(Student s : advisees){
                System.out.println("\t "  + s.getFirstName() +  " " + s.getLastName());
            }
        }
        public String toString(){
            return "Professor - " + this.getFirstName() + " " + this.getLastName();
        }
    }

