
// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class Que2 {
    public static void odd(int num) {
        int sum = 0;
        for(int i=1;i<=num;i++){
            if(i% 2 != 0){
                sum+=i;
           
            }
         }
          System.out.println(sum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print  1 to which number: ");
        int num = sc.nextInt();
        
        odd(num);


    }

    }

