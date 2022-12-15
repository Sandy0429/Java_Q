import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static float medianOfArray(int [] arr){

        int len = arr.length-1;
        int mid = len/2;
        float median = 0;
        if(len%2 == 0){//checking even
            
            median = (arr[mid]+arr[mid+1])/2;
        }
        else{
            median = arr[mid];
        }

        return median;
    } //-- find median of 1 Array

     static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        int t=n+m;
        int[] arr=new int[t];

        for(int i=0;i<n;i++)
        arr[i]=a[i];
        
        for(int i=0;i<m;i++)
        arr[n+i]=b[i];
        
        Arrays.sort(arr);
        
        if(t%2!=0)
        return arr[t/2];
        return (double)(arr[t/2]+arr[t/2-1])/2;
        
        
    } //-- find median of 2 Array

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [] a = new int[n];
        int [] b = new int[m];

        for(int i=0;i<n;i++)  a[i] = sc.nextInt();
        for(int i=0;i<m;i++)  b[i] = sc.nextInt();

        // float medianA = medianOfArray(a);
        // float medianB = medianOfArray(b);
        // System.out.printf("%.2f",((medianA+medianB)/2));
        System.out.printf("%.2f",medianOfArrays(n,m,a,b));

    }
}
