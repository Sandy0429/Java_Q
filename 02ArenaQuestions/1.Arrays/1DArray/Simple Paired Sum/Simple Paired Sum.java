import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] arr = new long[n];

        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n ; i+=2){
            System.out.print((arr[i]+arr[i+1])+" ");
        }
    }
}
