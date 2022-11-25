import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int [][]arr = new int [n][n];

        int primaryDiagonal =0;
        int secondaryDiagonal=0;

        for(int i=0 ; i<n; i++){
            String [] elements= in.readLine().trim().split(" ");
            for(int j=0 ;j<n; j++){
                arr[i][j] = Integer.parseInt(elements[j]);

                if(i == j){
                    primaryDiagonal += arr[i][j];
                }

                if((i+j) == (n-1)){
                    secondaryDiagonal += arr[i][j];
                }
                
            }
        }

        System.out.print(primaryDiagonal+" "+secondaryDiagonal);


    }
}
