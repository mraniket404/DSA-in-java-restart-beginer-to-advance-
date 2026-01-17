import java.util.Scanner;

public class forLoop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            System.out.print(i+" ");
            sum += i;
        }
        System.out.println("\n" + "The sum is: " + sum );
        
    }
}
