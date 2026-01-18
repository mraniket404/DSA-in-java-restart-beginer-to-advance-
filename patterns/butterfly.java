
import java.util.*;

public class butterfly {
    public static void main(String[] args) { 
        int n = 5;
        //  frist half 
        for (int i = 1;i<=n;i++){
            for (int j = 1;j <= i;j++){
                System.out.print("*");
            }

            //space
            for (int j = 1;j<=2*n-1;j++){
                System.out.print("  ");
            }

            //second half
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
