import java.util.*;
public class Main{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

            /*
                pattern:
                         1
                        212
                       32123
                      4321234
                     543212345
                      4321234
                       32123
                        212
                         1
            */

            for(int i=1; i<=n*2 ;i++)
            {
                int column = i>n ? 2*n-i : i ; 
                
                for(int s=0; s<n-column;s++)
                {
                    System.out.print("  ");
                }
                
                for(int j=column;j>=1;j--)
                {
                    System.out.print(j+" ");
                }

                for(int j=2;j<=column;j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
            }

    }
}
