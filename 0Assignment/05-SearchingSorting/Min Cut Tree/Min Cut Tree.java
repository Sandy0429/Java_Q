import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int woodCollected(int[] height,int n, int m)
    {
        int sum = 0;
        for (int i = n - 1; i >= 0; i--)
        {
            if (height[i] - m <= 0)
                break;
            sum += (height[i] - m);
        }
        return sum;
    } 
  

    public static int minCutTree(int [] height, int n,int k){
        Arrays.sort(height);
 
        int low = 0;
        // int high = height[n - 1];// n-1;
        int high = n-1;
 
        while (low <= high)
        {
            int mid = low + ((high - low) / 2);
 
            int collected = woodCollected(height,n, mid);
 
            if (collected == k)
                return mid;

            if (collected > k)
                low = mid + 1;
 
            
            else
                high = mid - 1;
        }
        // return -1;
        return low;
    }

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        System.out.print(minCutTree(arr,n,k));
    }
}
