import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long sumOfAllSubArray=0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            // sumOfAllSubArray += arr[i];
        }
        
        
        // for(int i=0;i<n;i++){
        //     // int sum=0;
        //     for(int j=i;j<n;j++){
                
        //         int sum = 0;
        //         for (int k = i; k <= j; k++) {
        //             sum += arr[k];
        //         }
        //           sumOfAllSubArray+= sum; // getting tle
        //     }
          
        // }

        for (int i = 0; i < n; i++) {
           
            int sum = 0;
            for (int j = i; j < n; j++) {
                
                sum += arr[j];
                sumOfAllSubArray += sum;
            }
        }

        System.out.print(sumOfAllSubArray);
    }
}
