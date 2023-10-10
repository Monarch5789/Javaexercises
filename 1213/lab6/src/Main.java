import java.util.ArrayList;

public class Main {
    
    /** 
     * @param args
     */
    public static void main(String[] args){
        System.out.println("*** Part A ***");

        Person p = new Person("Ai", "Perkins", 801315813);
        p.display();


        System.out.println("*** Part B ***");
        Student s1 = new Student("Xavier", "Cato", 900111222, "CS", 3.5, 75);
        System.out.println(s1);
        s1.setTransfer(true);
        s1.setBalance(100);
        s1.addCourse("Java programming");
        s1.addCourse("Calculus");

        s1.display();
        if(s1.dropCourse("Spanish")){
            System.out.println("The class has been dropped");
        }
        else{
            System.out.println("You are not enrolled in this course. No courses have been dropped.");
        }

        ArrayList<String> enrolledCourses = s1.getEnrolledCourses();
        System.out.println("You are enrolled in the following courses: ");
        for( String course : enrolledCourses){
            System.out.println(course);
        }

        System.out.println("*** Part C ***");

        Student s2 = new Student("Katherine", "Johnson", 900, "CS", 4.0, 100);
        Student s3 = new Student("Roy", "Clay", 901, "Biology", 3.2, 85);
        Student s4 = new Student("Kimberly", "Bryant", 902, "EE", 3.0, 80);

        Professor prof1 = new Professor("Mary", "Castro", 300, "CS", 80000);
        System.out.println(prof1);
        prof1.addAdvisee(s2);
        prof1.addAdvisee(s3);
        prof1.addAdvisee(s4);

        prof1.display();

        if(prof1.removeAdvisee(902)){
            System.out.println("The advisee has been removed");
        }else{
            System.out.println("This student is not an advisee of Professor " + prof1.getFirstName() + " " + prof1.getLastName());
        }

        ArrayList<Student> myAdvisees = prof1.getAdvisees();
        System.out.println("Professor " + prof1.getFirstName() + " " + prof1.getLastName() + " advisees: ");
        for(Student s : myAdvisees){
            System.out.println(s.getFirstName() + " " + s.getLastName());
        }
        System.out.println(s1.equals(s4));
        Student s5 = new Student("Xanvier", "Cato", 900111222, "CS", 3.5, 75);
        System.out.println(s1.equals(s5));

        System.out.println(s1.equals(prof1));
        Person[] personArray = {s1, s2, prof1};
        ArrayList<Person> personList = new ArrayList();
        personList.add(s1);
        personList.add(s2);
        personList.add(prof1);
        System.out.println("Content of personList: ");
        for(Person person : personList){
            System.out.println(person);
        }
        
    }
}
