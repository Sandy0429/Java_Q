import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
        // Your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String s1 = in.readLine().trim();
        String s2 = in.readLine().trim();

        StringBuilder ansString = new StringBuilder();

        for(int i=0; i<n ; i++){
            if(s1.charAt(i) == s2.charAt(i))
                ansString.append('0');
            else
                ansString.append('1');            
        }

        System.out.print(ansString);
    }
}
