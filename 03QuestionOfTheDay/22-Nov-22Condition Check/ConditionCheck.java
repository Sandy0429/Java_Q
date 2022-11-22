import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];
        int [] b = new int [n];
        for(int i=0; i<n ; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n ; i++){
            b[i] = sc.nextInt();
        }

        long sum=0;
        for(int i=0; i<n ; i++){
            sum += (a[i]*b[i]); 
        }
        // System.out.println(sum);
        if(sum == 0)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
