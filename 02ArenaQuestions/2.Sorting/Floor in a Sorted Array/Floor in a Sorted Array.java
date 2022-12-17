import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    /*
        Ip: 7 15
            2 3 5 9 14 16 18
        Op: 14
    */

    public static int floorOfANumber(long arr[], int low, int high,int x){
       
        // if (low > high)
        //     return -1;
 
       
        // if (x >= arr[high])
        //     return high;
 
       
        // int mid = (low + high) / 2;
 
       
        // if (arr[mid] == x)
        //     return mid;
 
        
        // if (mid > 0 && arr[mid - 1] <= x && x < arr[mid])
        //     return mid - 1;
 
        // if (x < arr[mid])
        //     return floorOfANumber(arr, low, mid - 1, x);

        // return floorOfANumber(arr, mid + 1, high, x);

        int left =low;
        int right = high;
        while(left <= right){
            int mid = left+(right-left)/2;

            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] < x){
                left = mid+1;
            }
            else{
                right = mid -1;
            }
        }
        return right;

    }
    

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            int n = sc.nextInt();
            int target = sc.nextInt();
            long [] arr = new long[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextLong();

            System.out.println(floorOfANumber(arr,0,n-1,target));
        }
        
    }
}
