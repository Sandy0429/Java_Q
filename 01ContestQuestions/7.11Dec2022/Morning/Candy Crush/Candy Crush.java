import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static long helper(long q, long ans){
        // System.out.println("helper q: "+q);
        if(q<0)
            return 0;
        if(q<=3){
            return q;
        }
        if(q == 4){
            // System.out.println("yes here at q: "+q);
            return 6;
        }

        long group = q/3;
        // group +=(q%3);
        long remaining_candy = q%3;

        if(remaining_candy != 0)
            group ++;

            ans += group*group;
        

        // System.out.println("helper ans= "+ans);
        
        return ans+ helper(q-group,0);
    }


    public static long divideCost(long q){
        long ans=0;

        return helper(q,ans);
                
    }
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            long q = sc.nextLong();

            System.out.println(divideCost(q));
        }
    }
}
