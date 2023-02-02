import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt()-1;
        int r = sc.nextInt()-1;
        char [] arr = sc.next().toCharArray();

        for(int i=0;i< arr.length; i++){
            boolean swapped = false;
            if(i == l){
                i=r;
                while(l<r){
                    char ch = arr[l];
                    arr[l] = arr[r];
                    arr[r]= ch;
                    l++;
                    r--;
                }
                swapped =true;
            }
            if(swapped){
                break;
            }
        }
        System.out.println(String.valueOf(arr));
    }
}
