import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        mergeSort(arr,0,arr.length-1);
        System.out.print(counter);
    }

    static long counter =0;
    public static void mergeSort(int [] arr,int left,int right){
        
        if(left < right){
            int mid = left+(right-left)/2;

            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            mergeArray(arr,left,mid,right);

        }
    }

    public static void mergeArray(int[] arr, int left,int mid, int right ){
        int n1 = mid-left+1;
        int n2 = right-mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for(int i=0; i<n1 ;i++) leftArray[i] = arr[left+i];
        for(int i=0; i<n2 ;i++) rightArray[i] = arr[mid+1+i];

        int i=0,j=0;
        int k = left;
        while(i<n1 && j<n2){
            if(leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }
            else{
                arr[k] = rightArray[j];
                j++;
                counter += n1-i;
            }
            k++;
        }

        while(i<n1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
