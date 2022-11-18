import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int row = Integer.parseInt(in.readLine());
        

        int [][]array = new int [row][row];

        for(int i=0 ; i<row ; i++){
            String[] elements = in.readLine().trim().split(" ");
            for(int j=0 ; j<row ; j++){
                array[i][j] = Integer.parseInt(elements[j]);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
