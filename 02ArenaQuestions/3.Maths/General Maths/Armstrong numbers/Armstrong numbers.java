import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        // int count =0;
        for(int i=1; i<=n ; i++){
            // System.out.println(isArmstrong(i));
            if(isArmstrong(i)){
                // count++;
                System.out.print(i+" ");
            }
        }
        // System.out.println(count);
    }

    public static boolean isArmstrong(int s){

        int n=s;
        int sum =0;
        while(n != 0){
            int d = n%10;
            sum += Math.pow(d,3);
            n /=10 ;
        }
        // System.out.println(sum+"--");
        if(sum == s){
            return true;
        }
        return false;
    }
}
