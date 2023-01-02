import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if((n&1) == 1){
            int [] arr= new int[n+1];
            int x = -(n/2);
            for(int i=0;i<n+1;i++){
                arr[i] = x;
                x++;
            }
            for(int i=0; i<n; i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            int [] arr= new int[n];
            int x = -(n/2);
            for(int i=0;i<n;i++){
                if(x == 0){
                    x++;
                    i--;
                    continue;
                }
                // System.out.println(x+"   "+i);
                  arr[i] = x;
                x++;
            }
            for(int i=0; i<n; i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
