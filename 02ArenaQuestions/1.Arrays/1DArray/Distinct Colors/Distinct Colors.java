import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t>0){
            t--;
            int n =sc.nextInt();
            // int[] arr = new int[n];
            int max =0;
            for(int i=0;i<n;i++){
                max = Math.max(max, sc.nextInt());
            }
            System.out.println(max);
        }
    }
}
