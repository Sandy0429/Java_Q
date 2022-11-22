import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] grid = new String [n];

        for(int i=0 ; i<n ; i++){
            grid[i] = sc.next();
        }
        int res = Integer.MIN_VALUE;

        for(int i=0 ; i<n ; i++){
            int count =0;
            for(int j=0 ; j<n ; j++){
                if(grid[j].equals(grid[i]))
                count++;
            }
            res = Math.max(res,count);
        }
        System.out.print(res);

    }
}
