

import java.util.Random;
import java.util.*;


public class SimpleGame {
    public static void main(String[] args) {
        int computerNumber = new Random().nextInt(100)-1;
        SimpleGame game = new SimpleGame();
        game.helloFunction();
        game.guessNumber();
   
        
    }
    
    public void helloFunction(){
        System.out.println("Welcome!. This game has been created by Patryk :). You have to guess the number from 0 to 100 ");
    }
    
    public void guessNumber(){
        Scanner olek = new Scanner(System.in);
        int computerNumber = new Random().nextInt(100)-1;
        int userNumber = -1; 
            while (userNumber != computerNumber){   
            System.out.println("Write your number");
            userNumber = olek.nextInt();
        if(userNumber < computerNumber){
            System.out.println("Your number: "+userNumber+ " is to low, try again");
        } else if ( userNumber > computerNumber){
                System.out.println("Your number: "+userNumber+ " is to high, try again");
            } else if ( userNumber == computerNumber){
                System.out.println("Congratz you won!");  
            } else {
                System.out.println("Type numbers not words");
            }
        }        
    }
}    
        
        
        
        
    

