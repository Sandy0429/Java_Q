import java.io.*;
import java.util.*;

public class Main{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        
        //SANDGLASS JAVA STAR PATTERN PROGRAM

        /*
                * * * * *
                 * * * *
                  * * *
                   * *
                    *
                    *
                   * *
                  * * *
                 * * * *
                * * * * *
        */

        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
           
            for(int s=1;s<=i;s++)
                System.out.print(" ");
            for(int j=n;j>=i;j--)
                System.out.print("* ");

                System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int s=i;s<=n;s++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");

                System.out.println();

        }
        
    }

}
