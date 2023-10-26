import java.util.*;

public class NextTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NextTask nextTask = new NextTask();
        nextTask.wordFunction("scanner");
        nextTask.startFunction();
    
    }
    
    
    public void startFunction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello write a word and let see if it is a palindrome");
        String word1 = scanner.nextLine(); 
        boolean palindrom = wordFunction(word1.toLowerCase());
        System.out.println("It is a palindrome? "+ palindrom);
    }
    
    
    
    public  boolean wordFunction(String str){
        char [] signs = str.toCharArray();
        int lenght = signs.length;
        for (int i =0; i<lenght/2; i++){
            if (signs[i] != signs[lenght -i - 1]){
                return false;
                
            }   
        }
        return true;
    }
  
}

    



    


        
    
    

