import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;
 
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
 
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    } 

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        
        int m = sc.nextInt();
        int []b = new int[m];
        for(int i=0;i<m;i++) b[i]=sc.nextInt();

        Arrays.sort(b);

        for(int i=0 ; i<m ;i++){
            // int targer = a[i];

            if(binarySearch(a,0,n-1,b[i]) != -1 ){
                System.out.print(b[i]+" ");
            }
        }
    }
}
