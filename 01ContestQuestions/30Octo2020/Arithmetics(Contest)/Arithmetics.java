import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int min = N-M;
        int max = N+M;
        for (int i = min; i<= max; i++){
            
            if(M-i <= i-N)
            {
                System.out.print(i);
                break;
            }
        }        
    }
}
