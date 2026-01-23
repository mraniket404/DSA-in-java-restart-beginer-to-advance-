// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;

public class Que3 {
    public static void greater(int num1,int num2) {
        if(num1<num2){
            System.out.println(num2 + " is greater");
        }else if (num1>num2){
            System.out.println(num1 + " is greater");
        }else {
            System.out.println(" both are equal");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2st number: ");
        int num2 = sc.nextInt();

        greater(num1,num2);

    }   
}
