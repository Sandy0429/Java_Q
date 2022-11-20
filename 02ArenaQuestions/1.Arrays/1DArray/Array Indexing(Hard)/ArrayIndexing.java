import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String [] elements = in.readLine().trim().split(" ");
        long [] arr = new long[n];
        long total = 0;
        for(int i=0 ; i<n ; i++ ){
                arr[i]= Long.parseLong(elements[i]);
                total += arr[i];
        }

        long left = total - arr[n-1];
        long right = 0;
        long center = arr[n-1];
        long count=0;
       
        for(int i=n-1; i>=0 ; i--){
            if(right <= left){
                count++;
            }
            right += arr[i];
            
            if(i !=0){
                left -= arr[i-1]; 
            }      
            
        }

        System.out.print(count);
    }
}
