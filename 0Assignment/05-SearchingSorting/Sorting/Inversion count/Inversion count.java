import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
   
    ///-----------------------------------main------------------------
    public static void main (String[] args) {
        // Your code here
         Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

       System.out.println( mergeSort(arr, 0, arr.length -1));//either this or below one both will give the same output
       
       
/*      
      mergeSort(arr, 0, arr.length -1);
      System.out.println(counter);
  */  }

///-----------------------------------mergeSort------------------------
 static long counter = 0;
      public static long mergeSort(int[] arr, int left, int right) {
//        base condition

        long count = 0;
        if(left < right) {

           int mid = left + (right - left) /2;
            count+= mergeSort(arr, left, mid);
            count+= mergeSort(arr, mid + 1, right);
            count+= mergeArray(arr, left, mid, right);

            // inversion+= mergeSort(arr, left, mid);
            // inversion+= mergeSort(arr, mid + 1, right);
            // inversion+= mergeArray(arr, left, mid, right);
            
        }

        return count;       

    }

///-----------------------------------mergeArray------------------------
    public static int mergeArray(int[] arr, int left, int mid, int right) {
        int p1 = left;
        int p2 = mid + 1;
        int[] ansArr = new int[right - left + 1];
        int iter = 0, swaps = 0;

        while(p1 <= mid && p2 <= right) {
//            compare
            if(arr[p1] <= arr[p2]) {
                ansArr[iter] = arr[p1];
                iter++;
                p1++;
            } else {
//                case for only arr[p1] > arr[p2]
                // counter += (mid - left + 1) - p1 + left;
                swaps += (mid - left + 1) - p1 + left;
                ansArr[iter] = arr[p2];
                iter++;
                p2++;
            }
        }

        while(p1 <=mid) {
            ansArr[iter] = arr[p1];
            iter++;
            p1++;
        }

        while(p2 <= right) {
            ansArr[iter] = arr[p2];
            iter++;
            p2++;
        }


//        change original array

        for (int i = left; i <= right; i++) {
            arr[i] = ansArr[i - left];
        }

        return swaps;
    }
}
