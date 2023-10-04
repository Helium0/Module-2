import java.util.*;

public class Sumnumbers {
    public static void main(String[] args){
        Scanner olek = new Scanner(System.in);
        System.out.println("Write number");
        Integer number = olek.nextInt();
        Sumnumbers method = new Sumnumbers();
        method.sumFunction(number);
    }
    
    public int sumFunction(int number){
        int sum = 0;
        for(int i=0; i<=number; i++){
            sum = sum+i;
        } System.out.println (sum); 
        return 0;
    }
}