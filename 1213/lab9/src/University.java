import java.util.*;
public class University implements UniversitySpecification
{
    private ArrayList<Person> personnel;
    private String name;
    
    public University(String name)
    {
        personnel= new ArrayList<>();
        this.name = name;
    }
    
    public ArrayList<Person> getPersonnel()
    {
        return personnel;
    }

    public void display()
    {
    }

    public void setUp(ArrayList<Person> personnel)
    {
        this.personnel = personnel;
    }

    public ArrayList<Student> getStudents()
    {
        ArrayList<Student> students = new ArrayList<Student>();
        for(Person test: personnel) //TNL 
        {
            if(test instanceof Student)
            {
                students.add((Student)test);
            }
        }
        
        return students;
    }

    public void newStudent(Student s)
    {
      personnel.add(s);   
    }

    public void newProfessor(Professor p){
        personnel.add(p);
    }

    public ArrayList<Professor> getProfessors()
    {
        ArrayList<Professor> profs = new ArrayList<Professor>();
        for(Person test : personnel)
        {
            if(test instanceof Professor)
            {
                profs.add((Professor)test);
            }
        }
        return profs;   
    }
    
}