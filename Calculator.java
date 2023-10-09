import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Hello this is your personal calculator created by Patryk, press 1 to start or 0 to quit");
        Integer number = scanner.nextInt();
        calculator.start(number);
        System.out.println("Goodbye");     
    
    }
    
    public void start(int number) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        
       while(number == 1){
        
        calculator.getOperationFromUser(); 
        
       }
       }
     public void quit(int number) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        
       while(number == 0){
        
        break;
       }
       }
    
  
  private String getOperationFromUser() {
      Scanner se = new Scanner(System.in);
      System.out.println("Write what do you want to do: Sum, Subtract, Multiply, Divide");
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
        } else {
            System.out.println("Wrong command try again"); 
          
        
         
    }
     return "What do you want to do now? Press 1 to continue or write quit.";
       
    
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



