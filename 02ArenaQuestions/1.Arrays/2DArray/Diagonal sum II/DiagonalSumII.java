import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double main_diag  = (( (double)n/2 ) *(4+((n-1)*2))); //((n/2)*(2*a+(n-1)*d))
        double anti_diag=0;
        if(n%2 == 0){
             anti_diag = (( (double)n/2 ) *(2*(n+1)));
        }
        else{
              anti_diag = (( (double)(n-1)/2 ) *(2*(n+1)));
        }

        long ans = (long)main_diag+(long)anti_diag;
        
 

        // System.out.println(main_diag);
        // System.out.println(anti_diag);
        System.out.println(ans);
    }
}
//using Arithmetic progression to add diagonal elements
/*
    Main diag = 2 4 6 8 10 12 14 16
    AntiDiag =(n+1) -- ntimes
    ex:
        2 3 4
        3 4 5
        4 5 6
*/
