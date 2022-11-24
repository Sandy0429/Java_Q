import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int [][] grid = new int[2][2];

        for(int i=0; i<2 ;i++){
            for(int j=0; j<2 ; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        if(grid[0][0] == 0 && grid[0][1] == 0 && grid[1][0] == 0 && grid[1][1] == 0)
            System.out.print("0");
        else if(grid[0][0] == 1 && grid[0][1] == 1 && grid[1][0] == 1 && grid[1][1] == 1)
            System.out.print("2");
        else
                 System.out.print("1");
    }
}
