import java.util.*;

public class Printnumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number");
        String typenum = scanner.next();
        Integer number = Integer.parseInt(typenum);{
        if ( number < 0)
            System.out.println("Wrong number: "+number);
        }
 	for(int i=0; i<=number; i++){ 
            System.out.println(i); 
        }
    }
}
