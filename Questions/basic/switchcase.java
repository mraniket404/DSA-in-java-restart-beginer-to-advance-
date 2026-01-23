package basic;
import java.lang.classfile.instruction.SwitchCase;
import java.util.*;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 to 4 and cheak the season");
        System.out.println("Enter 1 for spring, 2 for summer, 3 for autumn and 4 for winter ");
        System.out.println("=====================================");
        System.out.print("Enter the number: ");
       int num = sc.nextInt();

       switch (num) {
        case 1:
            System.out.println("Spring");
            break;
        case 2:
            System.out.println("Summer");
            break;
        case 3:
            System.out.println("Autumn");
            break;
        case 4:
            System.out.println("Winter");
            
            break;
       
        default:
            System.out.println("Invalid number");

       }

    }
}
