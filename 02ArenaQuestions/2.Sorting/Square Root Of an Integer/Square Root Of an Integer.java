import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long squareRootOfInteger(long x){
        if(x ==0 || x==1){
            return x;
        }
        long left =1; 
        long right = x/2;
        while(left <= right){
            long mid = left+(right-left)/2;

            if(mid*mid == x){
                return mid;
            }
            if(mid*mid < x){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return right;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            long n = sc.nextLong();
            System.out.println(squareRootOfInteger(n));
        }
    }
}
