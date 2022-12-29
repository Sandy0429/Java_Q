import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            long i= sc.nextLong(); // getting error when taking int
            if(findPerfectSquare(i) == -1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }

    public static long findPerfectSquare(long n){
        long start =0;
        long end = n;

        while(start <= end){
            long mid = (long)(start+(end-start)/2);
            
            if(mid*mid == n){
                return (long)mid;
            }

            if(mid*mid < n){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return (long)-1;
    }
}
