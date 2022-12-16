import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static int countOnesInBinaryArray(int [] arr){
        int left =0;
        int right = arr.length-1;

        while(left <= right){
            int mid = left+(right-left)/2;

            if((mid == right || arr[mid + 1] == 0) && (arr[mid] == 1)){
                return mid+1;
               
            }
            else if(arr[mid] == 1){
                left = mid+1;
            }
            else{
                right = mid -1;
            }
        }
        return left;

    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            int n = sc.nextInt();
            int []arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            System.out.println(countOnesInBinaryArray(arr));
        }
    }
}
