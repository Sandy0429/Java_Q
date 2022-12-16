import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    static boolean b1=false;
    public static void insertOperation(long[]arr, int i, long k, long a){

        if(i == arr.length){
            if(a==k){
                b1= true;
            }
            return;
        }

        a += arr[i];
        insertOperation(arr,i+1,k,a);
        if(b1 == true){
            return;
        }
        a -= 2*arr[i];
        insertOperation(arr, i+1, k,a);
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();

        long []arr = new long[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
            
        }

            insertOperation(arr,1,k,arr[0]);

        if(b1){ //if b1 is true
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
        
    }
}
