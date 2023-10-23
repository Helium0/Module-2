import java.util.*;

public class Investment {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        Investment invest = new Investment();
        invest.helloMethod();
        invest.calculateMethod();
  
    }
    
    public String helloMethod(){
        Scanner data = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("This is your personal compound interest calculator");
        return "";
    }
    
    public void calculateMethod(){
        Scanner data = new Scanner(System.in);
        System.out.println("How much do you want to invest?");
        double capital = data.nextDouble();
        System.out.println("For how many years?");
        int yearsInvestment = data.nextInt();
        System.out.println("Country fee? for example 5 is 5%");
        double feePercentage = data.nextDouble();
        double result = (capital *Math.pow(1+(feePercentage/100), yearsInvestment))-capital;
        System.out.println("Yours profit: "+String.format("%.2f", result));
    }
    
}
