import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        long [][] arr = new long[n][n];

        for(int i =0; i<n ; i++){
            String [] elements = in.readLine().trim().split(" ");
            for(int j =0 ; j<n ;j++){
                arr[i][j] = Long.parseLong(elements[j]);
            }
        }
        long upp_sum=0;
        //Upper Triangular
        for(int i=0; i<n;i++){
            for(int j=i ; j<n ;j++){
                upp_sum += arr[i][j];
            }
        }
        System.out.print(upp_sum+" ");
        //Lower Triangular
        long low_sum =0;
        for(int i=0; i<n;i++){
            for(int j=0 ; j<=i ;j++){
                low_sum += arr[i][j];
            }
        }
        System.out.print(low_sum+" ");

    }
}
