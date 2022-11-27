import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
        // Your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String num = in.readLine().trim();
        
        System.out.print(isDivisible7(num)?"1":"0");
        
    }
    public static boolean isDivisible7(String num)
    {
        int n = num.length();
        if (n == 0 && num.charAt(0) == '0')
            return true;
 
        // Append required 0s at the beginning.
        if (n % 3 == 1)
            num = "00" + num;
        if (n % 3 == 2)
            num = "0" + num;
        n = num.length();
 
        // add digits in group of three in gSum
        int gSum = 0, p = 1;
        for (int i = n - 1; i >= 0; i--) {
 
            // group saves 3-digit group
            int group = 0;
            group += num.charAt(i--) - '0';
            group += (num.charAt(i--) - '0') * 10;
            group += (num.charAt(i) - '0') * 100;
            gSum = gSum + group * p;
            // generate alternate series of plus and minus
            p = p * -1;
        }
 
        // calculate result till 3 digit sum
        return (gSum % 7 == 0);
    }
}
