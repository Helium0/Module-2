import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        calculator.start();
        String operations = calculator.getOperationFromUser();
        System.out.println(operations);
        String operation = scanner.nextLine();
        int continueNumber = calculator.getNumberFromUser();
        System.out.println(continueNumber);
        
         
    
    }
    
    public void start() {
    System.out.println("Hello this is your personal calculator created by Patryk");
    System.out.println("Write what do you want to do: Sum, Subtract, Multiply, Divide");
  }
  
  private String getOperationFromUser() {
      Scanner se = new Scanner(System.in);
      String operation = se.nextLine();
      Calculator calculator = new Calculator();
      
      if (operation.equals("Sum")){
        int addfunction = calculator.add();
        System.out.println("Sum result is: "+addfunction);
        
        } else if (operation.equals("Subtract")){
            int subtractFunction = calculator.subtract();
            System.out.println("Subtract result is: "+subtractFunction);
            
        } else if (operation.equals("Multiply")) {
            int multiplyFunction = calculator.multiply();
            System.out.println("Multiply result is: "+ multiplyFunction);
           
        } else if (operation.equals("Divide")) {
            String divideFunction = calculator.divide();
            System.out.println(divideFunction);
            
    }
     return "What do you want to do now? Type 1 to continue or 0 to quit.";
   
  }
  
  
  private int getNumberFromUser() {
      Scanner se = new Scanner(System.in);
      Calculator calculator = new Calculator();
      Integer number = se.nextInt();
       while(number > 0){
        String operations = calculator.getOperationFromUser();
        System.out.println(operations);
        if (number == 0){
            break;
        }
  
  }
       return 0;
  }
  
  private boolean isMoreThan0(int number) {
//      Scanner se = new Scanner(System.in);
//      String operation = se.nextLine();
      while(number > 0){
          
          return true;
    
  }
      return false;
  }
  private int add() {
      Scanner se = new Scanner(System.in);
      System.out.println("Type first number: ");
      Integer number = se.nextInt();
      System.out.println("Type second number: ");
      Integer numberTwo = se.nextInt();
    return  number + numberTwo;
    
  }
  
  private int subtract() {
      Scanner se = new Scanner(System.in);
      System.out.println("Type first number: ");
      Integer number = se.nextInt();
      System.out.println("Type second number: ");
      Integer numberTwo = se.nextInt();
    return number - numberTwo;
  }
  
  private String divide() {
      Scanner se = new Scanner(System.in);
      System.out.println("Type first number: ");
      Integer number = se.nextInt();
      System.out.println("Type second number: ");
      Integer numberTwo = se.nextInt();
      if (number == 0 || numberTwo == 0){
          return "You can`t divide with 0";
      } else
    return "Divide result is: "+number / numberTwo;
  }
  
  private int multiply() {
    Scanner se = new Scanner(System.in);
      System.out.println("Type first number: ");
      Integer number = se.nextInt();
      System.out.println("Type second number: ");
      Integer numberTwo = se.nextInt();
    return number * numberTwo;
  }
  
}



