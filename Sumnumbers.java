import java.util.*;

public class Sumnumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number");
        String num = scanner.nextLine();
        Integer number = Integer.parseInt(num);
        int sum = 0;
        for(int i=0; i<=number; i++){
            sum = sum+i;
//            System.out.println("Sum is: "+sum); printing value after each loop
        }
        System.out.println("Sum is: "+sum);
    }
}
