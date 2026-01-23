import java.util.Scanner;
public class factorial {
    public static void fact(int num) {
        if (num < 0) {
            System.out.println("Invalid input");
            return;
        }
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial is: " + fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        fact(num);
        
    }
}
