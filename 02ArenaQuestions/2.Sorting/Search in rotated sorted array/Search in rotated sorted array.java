import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();            
        }
        int target = sc.nextInt();

        if(search(arr,target) == -1){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }

    public static int search(int []arr, int target){
        int pivot = findPivot(arr);
        if(pivot == -1){
            //array is not rotated do normal sorting
            return binarySearch(arr,target,0,arr.length-1);
        }

        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        else{
            return binarySearch(arr,target,pivot+1,arr.length-1);
        }
    }
    public static int findPivot(int[] arr){
        int start =0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid;
            }

            if(arr[mid] <= arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target,int start,int end){
        
        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(target < arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
