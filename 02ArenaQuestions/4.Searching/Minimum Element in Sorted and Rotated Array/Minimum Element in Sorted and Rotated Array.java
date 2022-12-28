import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i=0; i<n ;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(findMinimunElem(arr));
        }
    }

    public static int findMinimunElem(int []arr){

        if(arr[0] < arr[arr.length-1]){
            return arr[0];
        }
        int start =0;
        int end = arr.length-1;
        while(start < end){
            int mid = start+(end-start)/2;

            if(arr[mid]> arr[end]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return arr[start];
    }
}
