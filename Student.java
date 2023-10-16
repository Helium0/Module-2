

public class Student implements Comparable<Student> {
    
    private int age;
    private double height;
    private String name;
    private String lastName;
    
    
    
    public Student( int age, double height, String name, String lastName){
    this.age = age;
    this.height = height;
    this.name = name;
    this.lastName = lastName;
}
    
    public String getName(){
        return this.name;
    }
    
    public String getlastName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public void setName(String name){
        System.out.println(this.name);
    }
    
    public void setlastName(String lastName){
        System.out.println(this.lastName);
    }
    
    public void setAge(int age){
        System.out.println(this.age);
    }
    
    public void setHeight(double height){
        System.out.println(this.height+" cm");
    }
    
    
    public String toString(){
        return lastName + " "+age;
    }
    
    @Override
    public int compareTo(Student otherStudent) {
             if ( this.lastName.equals(otherStudent.lastName)){
                 return this.age;
             }else{
              return  Integer.compare(this.age, otherStudent.age);   
             }        
    }       
}