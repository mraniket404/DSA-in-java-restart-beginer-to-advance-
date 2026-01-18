

public class butterfly {
    public static void main(String[] args) { 
        int n = 5;
        //  frist half 
        for (int i = 1;i<=n;i++){
            for (int j = 1;j <= i;j++){
                System.out.print("*");
            }

            //space
            for (int j = 1;j<=n-i;j++){
                System.out.print("  ");
            }

            //second half
          
            
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //down half
        for (int i = n;i>=1;i--){
            for (int j = 1;j <= i;j++){
                System.out.print("*");
            }

            //space
            for (int j = 1;j<=n-i;j++){
                System.out.print("  ");
            }

            //second half
          
            
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
