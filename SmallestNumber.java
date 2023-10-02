import java.util.*;


public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 5 numbers: ");
        String num = scanner.nextLine();
        Integer number = Integer.parseInt(num);
        Integer number1 = scanner.nextInt();
        Integer number2 = scanner.nextInt();
        Integer number3 = scanner.nextInt();
        Integer number4 = scanner.nextInt();
        
//        for ( int i=0; i<5; i++){
            if (number<=number1 && number<=number2 && number<=number3 && number<=number4){
         System.out.println("The smallest number is: "+number);
//         break;
        } else if (number1<=number && number1<=number2 && number1<=number3 && number1<=number4){
         System.out.println("The smallest number is: "+number1);       
//         break;
        } else if (number2<=number && number2<=number1 && number2<=number3 && number2<=number4){
         System.out.println("The smallest number is: "+number2);       
//         break;
        } else if (number3<=number && number3<=number1 && number3<=number2 && number3<=number4){
         System.out.println("The smallest number is: "+number3);       
//         break; 
        } else {
          System.out.println("The smallest number is: "+number4);       
                }
}
}
