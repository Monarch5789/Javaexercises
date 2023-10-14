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

        //System.out.println(s1.equals(prof1));
        //Person[] personArray = {s1, s2, prof1};
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(s1);
        personList.add(s2);
        personList.add(prof1);
        System.out.println("Content of personList: ");
        for(Person person : personList){
            System.out.println(person);
        }
        System.out.println(" ");
        System.out.println(" =============================== Module 8 ===============================");
        System.out.println(" ");
        ArrayList<Person> contactList = new ArrayList<Person>();
        contactList.add(p);
        contactList.add(s1);
        contactList.add(s2);
        contactList.add(s3);
        contactList.add(s4);
        contactList.add(prof1);
        Person p2 = new Person("Elle", "Kambol", 800);
        contactList.add(p2);

        Professor prof2 = new Professor("Frank", "Black", 801, "Math", 85000);
        contactList.add(prof2);

        Student s6 = new Student("Grace", "Maxeem", 903, "Psychology", 3.4, 95);
        contactList.add(s6);
        for(Person person : contactList){
            person.display();
        }
        System.out.println("================================ Module 8 Part B ================================");
        for(Person person : contactList){
            showProfile(person,903);
        }
        System.out.println("================================== Module 8 Part C ==================================");
        Person p3 = new Student("Maya", "Adams",700,"Music",3.5,105);
        System.out.println(((Student)p3).getGPA());
        // Person p4 = new Person("Bob","Lowe", 701); // left in for the sake of showing full lab completion
        // System.out.println(((Student) p4).getGPA());
        for(Person person : contactList){
            if(person instanceof Student && ((Student) person).getGPA() >= 3.5){
                System.out.println("Students eligible for scholarship: \n" + "\t" + person.toString());
            }
        }
        for(Person person : contactList){
            if(person instanceof Professor && ((Professor) person).getDepartment() == "CS"){
                System.out.println("Professors in Computer Science: \n" + "\t" + person.toString());
            }
        }
    }


    public static void showProfile(Person p, int id){
        if(p.getId() == id){
            p.display();
        }
    }
}
