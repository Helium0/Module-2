import java.util.*;


public class TablesSorter  {
    public static void main(String[] args) {
        ArrayList<Table> houseTables = new ArrayList();
        Table tableOne = new Table("Bodzio", 5, 7.00,"Wood");
        Table tableTwo = new Table("Agata", 3, 6.60,"Plastic");
        Table tableThree = new Table("VOX", 4, 5.40,"Metal");
        
        houseTables.add(tableOne);
        houseTables.add(tableTwo);
        houseTables.add(tableThree);
        
        for(Table i : houseTables)
        System.out.println(i);
        
        Collections.sort(houseTables);
        System.out.println("Siema: "+houseTables);
    }     
}

