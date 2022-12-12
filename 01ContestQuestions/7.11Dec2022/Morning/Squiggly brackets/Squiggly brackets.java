import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static int ans=0;

    public static int helper(int n1, int n2){
        if(n1==0 && n2==0){
            ans++;
        }
        if(n1>n2){
            return 0;
        }
        if(n1>0){
            helper(n1-1,n2);
        }
        if(n2>0){
            helper(n1, n2-1);
        }
        return ans;
    }

    public static int count(int n){
        if((n&1)!=0){
            return 0;
        }

        return helper(n/2,n/2);
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        System.out.print(count(n*2));
    }
}
