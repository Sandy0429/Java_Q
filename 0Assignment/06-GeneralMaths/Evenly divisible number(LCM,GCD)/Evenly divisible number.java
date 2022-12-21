import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        //A smallest positive number that is evenly divisible by all numbers between 1 to n.
        // evenly divisible group of few numbers means finding LCM of the number

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(calculateLCM(n));

    }

    public static long calculateLCM(int n){
        long lcm = 1;

        for(int i=1; i<=n;i++){
            lcm = (lcm*i)/calculateGCD(lcm,i);
        }
        return lcm;
    }

    public static long calculateGCD(long n1, long n2){
        if(n1%n2 != 0){
            return calculateGCD(n2, n1%n2);
        }
        
        return n2;
    }
}
