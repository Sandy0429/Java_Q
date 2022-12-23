import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long n = sc.nextLong();

        System.out.print(gcd(m,n));
    }

    public static long gcd(long m, long n){
        if(m%n != 0){
            return gcd(n, m%n);
        }

        return n;
    }
}
