// Write a function that takes in age as input and returns if that person is eligible to vote or not.
//  A person of age > 18 is eligible to vote.

import java.util.Scanner;

public class Que5 {
    public static void vote(int age) {
        if(age>=18){
            System.out.println("you are eligible for vote");
        }else{
            System.out.println("you are not eligible for vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age and check the eligible to vote or not: ");
        int age = sc.nextInt();

        vote(age);
    }
}
