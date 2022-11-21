import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        System.out.print((n-1)*n);
    }
}
