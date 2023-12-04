import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner fileScanner;
        ArrayList<Student> allStudents = new ArrayList<Student>();
        ArrayList<Professor> allProfessors = new ArrayList<Professor>();
        try{
            fileScanner = new Scanner(new File("C:\\TNGRP\\Javaexercises\\1213\\lab12\\src\\inputData.txt"));
        
            String line;
            while(fileScanner.hasNext()){
                line = fileScanner.nextLine();
                String[] allValues = line.split(",");
            try{
            if(allValues[0].equalsIgnoreCase("Student")){
                Student newStudent = new Student(allValues[1], allValues[2], Integer.parseInt(allValues[3]), allValues[4], Double.parseDouble(allValues[5]), Integer.parseInt(allValues[6]));
                allStudents.add(newStudent);
            }
            else if(allValues[0].equalsIgnoreCase("Professor")){
                Professor newProfessor = new Professor(allValues[1], allValues[2], Integer.parseInt(allValues[3]), allValues[4], Double.parseDouble(allValues[5]));
                allProfessors.add(newProfessor);
            }
            }
            catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Caught ArrayIndexOutOfBoundsException when closing output stream, try again.");
            }
        }
        fileScanner.close();
        }
            catch(FileNotFoundException ex){
            System.out.println(" Caught FileNotFoundException for inputData.txt. Try again making sure the file name and path are correct.");
        }
        Collections.sort(allStudents);
        Collections.reverse(allStudents);

        //System.out.println(allStudents);
        //System.out.println(allProfessors);

    try{
        FileOutputStream fs = new FileOutputStream("ScholarshipCandidates.txt");
        PrintWriter outFS = new PrintWriter(fs);
        outFS.println("Our top candidates for the scholarship are: ");
        System.out.println("Our top candidates for the scholarship have been dumped into ScholarshipCandidates.txt");
    
        for(Student s : allStudents){
            if(s.getGPA() < 3.2){
                //System.out.println(s + " is ineligible");
                outFS.println(s + " is ineligible");
            }
            else if(s.getGPA() < 3.5 && s.getGPA() >= 3.2){
                //System.out.println(s + " is a middle candidate!");
                outFS.println(s + "is a middle candidate!");
            }
            else{
                //System.out.println(s + " is a top candidate!");
                outFS.println(s + " is a top candidate!");
            }
        }
        //fileScanner.close();
        outFS.close();
        fs.close();
        }
    catch(FileNotFoundException ex){
        System.out.println("Caught FileNotFoundException for ScholarshipCandidates.txt. Try again making sure the file name and path are correct.");
    }
    catch(IOException ex){
        System.out.println("Caught IOException when closing output stream. Try again.");
    }
    }
}