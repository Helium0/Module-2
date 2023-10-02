import java.util.*;


public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hej jak masz na imie: ");
        String name = scanner.nextLine();
        Integer age = Integer.parseInt(name);
        System.out.println("Witaj: "+age);
    }
}



