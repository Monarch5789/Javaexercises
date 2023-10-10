import java.util.ArrayList;

public class Student extends Person{
    private String major;
    private double gpa;
    private int credits;
    private double balance;
    private boolean transfer;
    private ArrayList<String> enrolledCourses;


    public Student(String firstName, String lastName, int id, String major, double gpa, int credits){
        super(firstName, lastName, id);
        this.major = major;
        this.gpa = gpa;
        this.credits = credits;
        balance = 0;
        enrolledCourses = new ArrayList<String>();
    }

    
    /** 
     * @return String
     */
    public String getMajor(){
        return major;
    }

    
    /** 
     * @return double
     */
    public double getGPA(){
        return gpa;
    }

    
    /** 
     * @return int
     */
    public int getCredits(){
        return credits;
    }

    
    /** 
     * @return boolean
     */
    public boolean isTransfer(){
        return transfer;
    }

    
    /** 
     * @return double
     */
    public double getBalance(){
        return balance;
    }

    
    /** 
     * @return ArrayList<String>
     */
    public ArrayList<String> getEnrolledCourses(){
        return enrolledCourses;
    }

    
    /** 
     * @param m
     */
    public void setMajor(String m){
        major = m;
    }

    
    /** 
     * @param g
     */
    public void setGPA(double g){
        gpa = g;
    }

    
    /** 
     * @param c
     */
    public void setCredits(int c){
        credits = c;
    }

    
    /** 
     * @param t
     */
    public void setTransfer(boolean t){
        transfer = t;
    }

    
    /** 
     * @param b
     */
    public void setBalance(double b){
        balance = b;
    }
    
    /** 
     * @param c
     */
    public void addCourse(String c){
        enrolledCourses.add(c);
    }

    
    /** 
     * @param c
     * @return boolean
     */
    public boolean dropCourse(String c){
        if(enrolledCourses.contains(c)){
            enrolledCourses.remove(c);
            return true;
        }
        return false;
    }

// Module 7 - Part A
    public void display(){
        System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
        System.out.println("ID: " + this.getId() + "\tMajor: " + major);
        System.out.println("GPA: " + gpa + "\tCredits Applied: " + credits);
        System.out.println("Enrolled Courses:");
        
        for(int i = 0; i< enrolledCourses.size();i++){
            System.out.println("\t" + enrolledCourses.get(i));
        }
    }

    public String toString(){
        return "Student - " + this.getFirstName() + " " + this.getLastName();
    }
    
}
