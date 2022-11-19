import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        for(int i=0; i<n ; i++){
            for(int j=0; j<n ; j++){
                System.out.print((i+j)+" ");
            }
            System.out.println();
        }

    }
}
