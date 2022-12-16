import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static int tribonacci(int n){
        if(n<3){
            return 0;
        }
        else if(n == 3){
            return 1;
        }

        return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);

    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(tribonacci(n));
    }
}
