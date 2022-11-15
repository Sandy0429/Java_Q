import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double denom = 0;
        for(int i =0; i<n ;i++)
        {
            double m = sc.nextInt();
            denom += (double)(1/m);
           // System.out.println(denom);
        }
        denom = 1/denom;
        System.out.print((int)Math.floor(denom));
    }
}

// 1/10 =
// 1/30 =
