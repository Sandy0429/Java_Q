import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(decimalToBinary(n));
    }
    //decimal to binary but with the change that in this question
    // 0=0 but 1=2;
    
    public static String decimalToBinary(long num){
        StringBuilder sb = new StringBuilder();
        while(num>0){
            long x = num%2;
            if(x == 1)
                sb.append(2);
            else
                sb.append(0);
            num /= 2;
        }
        return sb.reverse().toString();
    }
}
