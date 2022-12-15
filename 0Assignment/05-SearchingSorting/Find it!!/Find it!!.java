import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static long findIt(long k){
        
        long left =0;
        long right = (long)Math.sqrt(k);

        while(left <right){
            long mid = left +(right-left)/2;

            long ans = ((mid*mid)+ (3*mid));
            if(ans == k){
                return mid;
            }
            else if(ans < k){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.print(findIt(n));

        // boolean found = false;

        // for(int i=1; i<= n/2 ; i++){

        //     if(((i*i)+ (3*i)) == n ){
        //         System.out.print(i);
        //         found = true;
        //         break;
        //     }
        // }

        // if(!found){
        //    System.out.print("-1"); 
        // } //--TLE
    }
}
