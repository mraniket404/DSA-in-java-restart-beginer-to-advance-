import java.util.*;
public class printName {
    public static void printName(String name) 
    {
        System.out.println("Hello " + name);
        System.out.println("Have a nice day!");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        printName(name);
    }
}


