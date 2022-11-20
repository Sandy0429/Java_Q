import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
        String [] NK = in.readLine().trim().split(" ");
        long n = Integer.parseInt(NK[0]);
        int k = Integer.parseInt(NK[1]);
        
        for(int i=0 ; i<k ; i++){
            if(n%200 != 0){
                n = (n*1000)+200;
            }
            else{
                n /=200;
            }
        }
        System.out.print(n);
    }
}
