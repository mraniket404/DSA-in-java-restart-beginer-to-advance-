package basic;
import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println(num1+" and "+num2+" are equal.");
        }else if (num1 > num2){
            System.out.println(num1 + " is greater ");
        }else{
            System.out.println(num2+" is greater ");
        }
    }
}
