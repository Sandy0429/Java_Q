import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        if (n>0)
            n=1;
        else if (n<0)
            n= -1;
        else 
            n=0;

        switch(n){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Positive");
                break;
            case -1:
                System.out.println("Negative");
                break;
        }
    }
}
