import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i=0; i<n ; i++){
                arr[i] = sc.nextInt();
            }
            int commonDiff = (arr[n-1]-arr[0])/(n-1);
            // System.out.print(commonDiff);
            System.out.println(findMissingTerm(arr,commonDiff,0,arr.length-1));
        }
    }

    public static int findMissingTerm(int[] arr, int diff,int start,int end){
        // int start = 0;
        // int end = arr.length-1;        
        if(start < end){
            int mid = start+(end-start)/2;

            if((mid < end) && (arr[mid+1]-arr[mid])!= diff ){
                return arr[mid]+diff;
            }
            if((mid >start) && (arr[mid]-arr[mid-1]) != diff){
                return arr[mid]-diff;
            }

            int found = findMissingTerm(arr,diff,start,mid-1);
            if( found == -1){
               found = findMissingTerm(arr,diff,mid+1,end);
               if(found != -1){
                   return found;
               }
            }else{
                return found;
            }     
        }
        return -1;
    }
}
