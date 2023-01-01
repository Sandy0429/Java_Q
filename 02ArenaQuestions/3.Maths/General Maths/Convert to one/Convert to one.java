import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();

        int n2 = 0, n3 = 0;
    
        while (N % 2 == 0) {
            N = N / 2;
            n2++;
        }
    
        while (N % 3 == 0) {
            N = N / 3;
            n3++;
        }
    
        if (N == 1 && (n2 <= n3)) {
            System.out.print((2 * n3) - n2);
        }
        else{
            System.out.println(-1);
        }
    }
}
