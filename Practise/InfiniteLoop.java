      
import java.io.*;
import java.util.Scanner;

public class InfiniteLoop {
    public static void main(String[] args) throws IOException {
        InfiniteLoop loop = new InfiniteLoop();
        loop.loopMethod();
       
        
    }
    
    
    public  void loopMethod() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;  
        System.out.println("Hello !");
        for(;;){
            System.out.println("Type your number or write Quit");
            String command = reader.readLine();
            if(command.equalsIgnoreCase("Quit"))
                break;
            int num = Integer.parseInt(command);
            number += num;
            System.out.println("Sum numbers loop: "+number);    
        }
        System.out.println("Bye bye =)");       
    }   
}
