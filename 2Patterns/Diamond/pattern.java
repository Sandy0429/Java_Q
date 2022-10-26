import java.util.*;
public class Main{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

            /*
                pattern:
                     *
                    * *
                   * * *
                  * * * *
                 * * * * *
                  * * * *
                   * * *
                    * *
                     *
            */

            for(int i=0;i<n*2;i++)
            {
                int totalColsInRow = i>n ? 2*n-i : i; 

                int  spaces = n-totalColsInRow;
                for(int s=0; s<spaces;s++)
                {
                    System.out.print(" ");
                }
                
                for(int j=0;j< totalColsInRow;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }

    }
}
