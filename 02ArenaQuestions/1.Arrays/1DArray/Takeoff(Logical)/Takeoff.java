import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        

        for(int j=0;j<n;j++){
             String [] Npqr = in.readLine().trim().split(" "); 
             int N = Integer.parseInt(Npqr[0]);
             int p = Integer.parseInt(Npqr[1]);
             int q = Integer.parseInt(Npqr[2]);
             int r = Integer.parseInt(Npqr[3]);
            int [] arr = new int [N];
                Arrays.fill(arr,0);
                for(int i=0 ; i< N ; i++){
                    if( (i+1)%p == 0){
                        arr[i]++;
                    }
                    if( (i+1)%q == 0){
                        arr[i]++;
                    }
                    if( (i+1)%r == 0){
                        arr[i]++;
                    }
                } 
             int count =0;   
            for(int i=0 ; i<N; i++){
                if(arr[i]==1){
                    count++;
                }
            }  
            System.out.println(count);            
            
        }
    }
}
