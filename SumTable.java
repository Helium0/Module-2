
public class SumTable {
    public static void main(String[] args) {
        SumTable table = new SumTable();
        int[] tabloid = {1,4,12,15,33,19};
        table.sumArray(tabloid);
           
    }
        
    public int sumArray(int[] numbers){
        int sum =0 ;
        for( int i=0; i<numbers.length; i++){                  
            sum = numbers[i]+sum ;
        } System.out.println ("Table sum is: "+ sum); 
            return 0;
        }
        
    }
        