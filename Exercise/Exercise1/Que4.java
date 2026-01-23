// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;

public class Que4 {
    public static void circumference(int radius) {
        int c = 0;

        System.out.println(2*3.14*radius);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius and calculate the circumference of a circle : ");
        int radius = sc.nextInt();

        circumference(radius);
    }
}
