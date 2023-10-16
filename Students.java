import java.util.*;

public class Students {
    public static void main(String[] args) {
    ArrayList<Student> beginners = new ArrayList();
    Student marek = new Student(30,192.5,"Marek","Czapczyk");
    Student zosia = new Student(21, 163.3,"Zosia","Kowal");
    Student patryk = new Student(20, 181.0,"Patryk","Kowal");
    Student klaudia = new Student(28, 155.7,"Klaudia","Maj");
    Student asia = new Student(23, 160.9,"Asia","Bugaj");
    
    beginners.add(marek);
    beginners.add(zosia);
    beginners.add(patryk);
    beginners.add(klaudia);
    beginners.add(asia);
    
    System.out.println("Before sort: "+beginners); 
    Collections.sort(beginners);
    System.out.println("After sort: "+ beginners);
    
    
}
}