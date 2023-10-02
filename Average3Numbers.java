import java.util.*;


public class Average3Numbers {
    public static void main(String[] args){
        Scanner olek = new Scanner(System.in);
        System.out.println("Hello type three numbers: ");
        String count = olek.nextLine();
        Integer number = Integer.parseInt(count);
        Integer number1 = olek.nextInt();
        Integer number2 = olek.nextInt();{
        double averagenum = (number+number1+number2)/3;
        if ( number >=0 && number1>=0 && number2>=0){
        System.out.println("Average number is: "+ averagenum);
        }else{
        System.out.println("One of the number is below 0");
        }
        
    }
  
    
//    public String AverageFunction(int number, int number1, int number2){
//        if ( number >0 && number1>0 && number2>0){
//        return ("Average number is: "+(number+number1+number2)/3);
//        }else{
//        return("One of the number is below 0");
//        }
    }
}

  
 
     

    

