import java.util.*;



public class AnotherGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String game [] = new String []{"Paper","Scissors","Stone"};
        Random random = new Random ();
        
        
        int userPoints = 0;
        int compPoints = 0;
        System.out.println("Hello this is another game created by: Patryk");
        while(userPoints <3 && compPoints <3){
            System.out.println("Type: Scissors, Stone or Paper");
            String userMove = scanner.nextLine();
            int compNumber = random.nextInt(2);
            String compMove = game[compNumber];
            if( userMove.equals("Paper")&& compMove.equals("Scissors")){
                compPoints++;
            } else if ( userMove.equals("Paper")&& compMove.equals("Stone")){
                userPoints++;
            } else if ( userMove.equals("Stone")&& compMove.equals("Scissors")){    
                userPoints++;
            } else if ( userMove.equals("Stone")&& compMove.equals("Paper")){    
                compPoints++;    
            } else if ( userMove.equals("Scissors")&& compMove.equals("Paper")){    
                userPoints++; 
            } else if ( userMove.equals("Scissors")&& compMove.equals("Stone")){    
                compPoints++;
            } else {
                System.out.println("Draw round try again");
            } 
            System.out.println("Score: "+"\nComputer: "+compPoints+"\nUser: "+userPoints);
         
    }  
        if (userPoints == 3){
            System.out.println("You won!");
        } else {
            System.out.println("Computer won!");
        }
}
}
