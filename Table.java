

public class Table implements Comparable<Table> {
     
        String name;
        int height;
        double weight;
        String material;
        
        public Table(String name,int height, double weight,String material){
            this.name = name;
            this.height = height;
            this.weight = weight;
            this.material = material;
        }
   
        public int getHeight(){
            return this.height;
        }
        
         @Override
    public int compareTo(Table otherTable) {
        return Integer.compare( getHeight(),  otherTable.getHeight());
    }
    
    }
