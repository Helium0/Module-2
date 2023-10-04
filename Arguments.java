import java.util.*;



public class Arguments {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number: ");
        Integer number = scanner.nextInt();
        Arguments argu = new Arguments();
        argu.argumentsFunction(number);
    }
        
        
        
        public String argumentsFunction(int number){
        if(number > 0){
            System.out.println("Your number is: "+number+' '+"and is higher than 0");
        }else{
            System.out.println("Your number is: "+number+' '+"and is below 0");
        }
        return "";
    }
}

 




