import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if ((n&1) != 0){
            int t=1;
            n++;
            while(t<=5){
                n+=2;
                System.out.print(n+" ");
                t++;
            }
        }
        else{
            int t=1;
            while(t<=5){
                n+=2;
                System.out.print(n+" ");
                t++;
            }
        }
    }
}
