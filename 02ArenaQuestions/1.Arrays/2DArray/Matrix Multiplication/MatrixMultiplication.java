import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException {
                      // Your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String [] mnp = in.readLine().trim().split(" ");
        int m = Integer.parseInt(mnp[0]);
        int n = Integer.parseInt(mnp[1]);
        int p = Integer.parseInt(mnp[2]);

        int [][]a = new int [m][n];
        int [][]b = new int [n][p];
        int [][]c = new int [m][p];


        for(int i=0; i<m; i++){
            String [] element = in.readLine().trim().split(" ");
            for(int j=0; j<n ; j++){
                a[i][j] = Integer.parseInt(element[j]);
            }
        }
        for(int i=0; i<n; i++){
            String [] element = in.readLine().trim().split(" ");
            for(int j=0; j<p ; j++){
                b[i][j] = Integer.parseInt(element[j]);
            }
        }

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<p ; j++){
                for(int k =0; k<n ; k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }

        for(int i=0; i<m ; i++){
            for(int j=0 ; j<p ; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}
/*
Custom input:
4 3 4
1 1 1
2 2 2
3 3 3
4 4 4
1 1 1 1
2 2 2 2
3 3 3 3
Output:
6 6 6 6 
12 12 12 12 
18 18 18 18 
24 24 24 24 

*/
