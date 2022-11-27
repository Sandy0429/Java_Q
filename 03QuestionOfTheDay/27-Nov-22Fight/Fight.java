import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
        // Your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String [] hN = in.readLine().trim().split(" ");
        String [] elements = in.readLine().trim().split(" ");
        int h = Integer.parseInt(hN[0]);
        int n = Integer.parseInt(hN[1]);

        long sum =0;
        for(int i=0 ; i<n ; i++){
            sum += Long.parseLong(elements[i]);
        }
        if(sum>=h){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
