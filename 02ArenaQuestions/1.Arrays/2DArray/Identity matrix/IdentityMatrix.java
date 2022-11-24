import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            for(int j=0;j<n ;j++){
                int elem = sc.nextInt();
                if(i == j){
                    if(elem != 1){
                        System.out.print("No");
                        System.exit(0);
                    }
                }
                else{
                    if(elem != 0){
                        System.out.print("No");
                        System.exit(0);
                    }
                }
            }
        }
        System.out.print("Yes");
    }
}
