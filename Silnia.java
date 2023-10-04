

public class Silnia {
    public static void main(String[] args) {
        
        	System.out.println(silniaFunction(3));
	}
	
	public static int silniaFunction(int n) {
            int sum = 1;
            if (n == 0)
                return 0;
		 for(int i=1; i<=n; i++){
                    sum = sum*i;
                }
                        
			return sum;
		}
	}


        
        
        
        
        
        
        
        
    
//        System.out.println(silniaFunction(5));
//    
//}
//    
//    public static int silniaf(int number){
//        if(number < 0){
//            return 0; 
//        } else {
//            return  silniaf*(number+1);
//        } 
//        
//    }
//    
//}
