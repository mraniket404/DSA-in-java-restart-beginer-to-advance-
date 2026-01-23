import java.util.*;
public class mul {
    public static int add(int a, int b) {
        int sum = a * b;
        return sum;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter 1st number: ");
       int a = sc.nextInt();
       System.out.print("Enter 2nd number: ");
       int b = sc.nextInt();

       System.out.println("The sum is: " + add(a, b));
    }
}
