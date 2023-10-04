import java.util.*;


public class Average3Numbers {
    public static void main(String[] args){
        Scanner olek = new Scanner(System.in);
        System.out.println("Hello type three numbers: ");
        Integer number = olek.nextInt();
        Integer numberOne = olek.nextInt();
        Integer numberTwo = olek.nextInt();
        Average3Numbers average = new Average3Numbers();
        average.averageFunction(number, numberOne, numberTwo);
    }
        
 
    public String averageFunction(int number, int numberOne, int numberTwo){
        double averagenum = (number+numberOne+numberTwo)/3;
        if ( number >=0 && numberOne>=0 && numberTwo>=0){
        System.out.println("Average number is: "+ averagenum);
        }else{
        System.out.println("One of the number is below 0");
        }
        return "";
       }
}
