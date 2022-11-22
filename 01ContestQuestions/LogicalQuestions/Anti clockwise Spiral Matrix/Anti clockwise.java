import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
        // String [] rowCol = in.readLine().trim().split(" ");
        int row =Integer.parseInt(in.readLine());
        // int col = Integer.parseInt(rowCol[1]);

        int [][]arr = new int [row][row];


        for(int i=0 ; i< row ; i++){
            String [] elements = in.readLine().trim().split(" ");
            for(int j=0 ; j<row ;j++){
                arr[i][j]= Integer.parseInt(elements[j]);
            }
        }

        int row_start = 0, row_end=row-1;
        int col_start = 0, col_end=row-1;

        while(row_start<=row_end && col_start<=col_end){

            //left
            for(int j = row_start ; j<=row_end; j++ ){
                System.out.print(arr[j][col_start]+" ");
                //System.out.println("loop4 ");
            }            
            col_start++;

            //bottom
            for(int i= col_start ; i<=col_end; i++){
                System.out.print(arr[row_end][i]+" ");
               // System.out.println("loop3 ");
            }
            row_end--;

            
                if(row_start > row_end || col_start > col_end ){
                    break;
                }  

            //right
            for(int j= row_end ; j>=row_start ; j--){
                System.out.print(arr[j][col_end]+" ");
               // System.out.println("loop2 ");
            }
            col_end--;

            //top
            for(int i=col_end ; i>= col_start ; i--){
                System.out.print(arr[row_start][i]+" ");
                //System.out.println("loop1 ");
            }
            row_start++;    
    
        }

    }
}
