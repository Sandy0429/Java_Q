import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    // public static long findelem(long n){
    //     for(long i=2; i*i<=n;i++){
    //         if(n%i == 0)
    //             return n/i;
    //     }
    //     return 1;
    // }

    // public static long reduceToOne(long n){
    //     if(n<0){
    //         return -1;
    //     }

    //     long count =0;
    //     while(n>0){
    //         long divis = findelem(n);
    //         n-=divis;
    //         count++;
    //     }
    //     return --count;
    // }//same tc1 fails
    
    public static long reduceToOne(long n){

        long count =0;

        // if(n==1)
        //     return 1;

        if(n < 0)
            return 0;
        // if(n ==0)
        //     return 1;

        for(long i=n-1; i>0; i--){
            // System.out.println(i);
            if(n%i == 0){
                // System.out.println(i);
                count++;
                n -= i;
                count += reduceToOne(n);
                break;
            }
        }
               
        return count;
    } //tc1-- fails;
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        // long n= sc.nextLong();
        // if(n<=0){
        //    n= Math.abs(n);
        // }
        // if(n<=0 || n>1000){
        //     System.out.print("0");
        //     System.exit(0);
        // }

        // System.out.println(reduceToOne(n));

        System.out.print(reduceToOneUsingDynamicProgramming(n));
        // for(int i=0;i<=1000; i++){
        //     System.out.println(i+" = "+reduceToOne(i));
        // }
    }

    public static int reduceToOneUsingDynamicProgramming(int n){
        int [] arr = new int[n+1];
        Arrays.fill(arr,1000);

        arr[0]=0;
        arr[1]=0;
        for(int i=2 ;i<=n ;i++){
            for(int j=2; j*j <=i ; j++){
                if(i%j ==0){
                    arr[i] = Math.min(arr[i],arr[i-j]+1);
                    arr[i] = Math.min(arr[i],arr[i-(i/j)]+1);
                }
            }
            arr[i] = Math.min(arr[i],arr[i-1]+1);
        }
        return arr[n];
    }
}
