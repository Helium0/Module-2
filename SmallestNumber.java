import java.util.*;


public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 5 numbers: ");
        Integer number = scanner.nextInt();
        Integer numberOne = scanner.nextInt();
        Integer numberTwo = scanner.nextInt();
        Integer numberThree = scanner.nextInt();
        Integer numberFour = scanner.nextInt();
        SmallestNumber smallNum = new SmallestNumber();
        smallNum.smFunction(number,numberOne,numberTwo,numberThree,numberFour);
    }
        
        
        public String smFunction (int number, int numberOne, int numberTwo, int numberThree, int numberFour){
            if (number<=numberOne && number<=numberTwo && number<=numberThree && number<=numberFour){
         System.out.println("The smallest number is: "+number);

        } else if (numberOne<=number && numberOne<=numberTwo && numberOne<=numberThree && numberOne<=numberFour){
         System.out.println("The smallest number is: "+numberOne);       

        } else if (numberTwo<=number && numberTwo<=numberOne && numberTwo<=numberThree && numberTwo<=numberFour){
         System.out.println("The smallest number is: "+numberTwo);       

        } else if (numberThree<=number && numberThree<=numberOne && numberThree<=numberTwo && numberThree<=numberFour){
         System.out.println("The smallest number is: "+numberThree);       

        } else {
          System.out.println("The smallest number is: "+numberFour);       
                }
            return "";
}
}
