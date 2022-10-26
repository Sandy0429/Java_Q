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
            */

            for(int i=1;i<=n;i++)
            {
                
                for(int s=0; s<n-i;s++)
                {
                    System.out.print("  ");
                }
                
                for(int j=i;j>=1;j--)
                {
                    System.out.print(j+" ");
                }

                for(int j=2;j<=i;j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
            }

    }
}
