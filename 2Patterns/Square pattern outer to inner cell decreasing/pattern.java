import java.util.*;
public class Main{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

            /*
                pattern:
                5 4 4 4 4 4 4 4 4 4 5 
                5 4 3 3 3 3 3 3 3 4 5 
                5 4 3 2 2 2 2 2 3 4 5 
                5 4 3 2 1 1 1 2 3 4 5 
                5 4 3 2 1 0 1 2 3 4 5 
                5 4 3 2 1 1 1 2 3 4 5 
                5 4 3 2 2 2 2 2 3 4 5 
                5 4 3 3 3 3 3 3 3 4 5 
                5 4 4 4 4 4 4 4 4 4 5 
                5 5 5 5 5 5 5 5 5 5 5 
                                        
            */
            int originalN=n;
            n=n*2;
            for(int i=1; i<=n;i++)
            {
                
                for(int j=0;j<=n;j++)
                {
                    int valueOfElement =originalN- Math.min(Math.min(i,j),Math.min(n-i,n-j));
                    System.out.print(valueOfElement+" ");
                }

                System.out.println();
            }

    }
}
