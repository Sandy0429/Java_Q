import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int star=0;
        int end = n-1;
        short rf = 0;
        int max =0;
        while(star <= end){
            if(rf == 0){
                rf = 1;
                if(max <= arr[star]){
                    max = arr[star];
                }
                else{
                    System.out.println("NO");
                    System.exit(0);
                }
                star++;
            }
            if(rf == 1){
                rf = 0;
                if(max <= arr[end]){
                    max = arr[end];
                }
                else{
                    System.out.println("NO");
                    System.exit(0);
                }
                end --;
            }
        }
        System.out.println("YES");
    }
}
