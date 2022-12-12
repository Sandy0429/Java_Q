import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {


    public static int numberOfSweets(int s, int b){
        b=(b-2);
        b= (int)Math.floor(b/2);

        int sweetFit =(b*(b+1)/2);

        if(sweetFit<=s){
            return sweetFit;
        } 

        return s;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        
        int sweets = sc.nextInt();
        int base = sc.nextInt();

        System.out.print(numberOfSweets(sweets,base));
    }
}
