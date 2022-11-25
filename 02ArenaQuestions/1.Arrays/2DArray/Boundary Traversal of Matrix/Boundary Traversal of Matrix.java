import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(in.readLine());
        for(int z=0;z<T;z++){
            String [] rowCol = in.readLine().trim().split(" ");
            int n =Integer.parseInt(rowCol[0]);
            int m =Integer.parseInt(rowCol[1]);
            String [] elements = in.readLine().trim().split(" ");
            int [] [] arr = new int [n][m];
            int q=0;
            for(int r=0;r<n;r++){
                for(int c=0;c<m;c++){
                    arr[r][c]=Integer.parseInt(elements[q]);
                    q++;
                }
            }
            
        if(n==1){
            for(int i=0;i<m;i++){
                System.out.print(arr[0][i]+" ");
            }
            System.out.println();
            continue;
        }
        if(m==1){
            for(int i=0;i<n;i++){
                System.out.print(arr[i][0]+" ");
            }
            System.out.println();
            continue;
        }
            for (int k = 0; k < m; k++) {
                    System.out.print(arr[0][k]+" ");
            }
            for(int k=1;k<n;k++){
                System.out.print(arr[k][m-1]+" ");
            }
            for (int k = m-2; k >=0 ; k--) {
                    System.out.print(arr[n-1][k]+" ");
            }
            for(int k=n-2;k>0;k--){
                System.out.print(arr[k][0]+" ");
            }
            System.out.println();
                       
        }
    }
}
