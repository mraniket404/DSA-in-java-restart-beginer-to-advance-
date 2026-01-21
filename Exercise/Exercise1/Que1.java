// Enter 3 numbers from the user & make a function to print their average.

import java.util.*;

public class Que1 {
    public static void avrage (int a , int b ,int c ) {
        int sum = a+b+c;
        int avrage = sum/3;
        System.out.println(avrage);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st number ");
        int a = sc.nextInt();
        System.out.print("Enter 2st number ");
        int b = sc.nextInt();
        System.out.print("Enter 3st number ");
        int c = sc.nextInt();
         
       avrage(a,b,c);
    }
}
