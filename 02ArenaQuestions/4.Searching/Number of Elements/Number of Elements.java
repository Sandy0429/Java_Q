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
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int t = sc.nextInt();
        while(t>0){
            t--;
            int d = sc.nextInt();
            System.out.println(foundElemGreaterThan(arr,d));
        }
    }
    public static int foundElemGreaterThan(int[] arr, int d){
        if(d<arr[0]){
            return arr.length;
        }
        if(d > arr[arr.length-1]){
            return 0;
        }

        int start =0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            // System.out.println("mid = "+mid+" midvalue="+arr[mid]);
            if(arr[mid] == d){
                // System.out.println(mid);
                return (arr.length-1-mid);
            }

            if(d > arr[mid] ){
                start = mid+1; 
            }
            else{
                end = mid-1;
            }
        }

        return arr.length-1-end;
    }
}
