import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner (System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        if(n%m == 0){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
