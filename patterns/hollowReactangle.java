import java.util.*;
public class HollowReactangle {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of rows: ");
        // int rows = sc.nextInt();
        // System.out.print("Enter the number of columns: ");
        // int columns = sc.nextInt();
        int n = 5;
        int m = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (j == 3 || i==2 && j==4 || i==3 && j==4 || i==4 && j==4 || i==3 && j==5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= n-2; i++) {
            for (int j = 1; j <= m; j++) {
                if (j == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
          
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // Inner loop to print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
                
            // Move to the next line after each row
            System.out.println();
        }
            for (int i = 1; i <=n;i++){
                for(int j = 1;j<=m;j++){
                    if(i==1 || i==n || j==1 || j==m || i+j==6){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
                }
            }

            
        }
        
    
    

