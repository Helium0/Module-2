

public class Fibonacciseq {
    public static void main(String[] args) {
	System.out.println(fibonacci(7));
	}
	
	public static int fibonacci(int number) {
            for (int i=0; i<number; i++)
		if(number == 0) {
			return 0;
		}else if(number== 1){
			return 1;
		}else {
			return fibonacci(number-1) + fibonacci(number-2);
		}
            return 0;
	} 
        
}
