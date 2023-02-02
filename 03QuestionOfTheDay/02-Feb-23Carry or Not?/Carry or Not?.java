import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        // String a = sc.next();
        // String b = sc.next();

        // if(a.length() > b.length()){
        //     long len = b.length()-1;
        //     while(len>=0){
        //         if((Integer.parseInt(String.valueOf(a.charAt(len)))+Integer.parseInt(String.valueOf(b.charAt(len)))) > 10){
        //             System.out.println("Hard");
        //             System.exit(0);
        //         }
        //         len--;
        //     }
        // }
        // else{
        //     long len = a.length()-1;
        //     while(len>=0){
        //         if((Integer.parseInt(String.valueOf(a.charAt(len)))+Integer.parseInt(String.valueOf(b.charAt(len)))) > 10){
        //             System.out.println("Hard");
        //             System.exit(0);
        //         }
        //         len--;
        //     }
        // }
        // System.out.println("Easy");//not work for long input

        //--------------------------------------------
long A = sc.nextLong();
long B = sc.nextLong();
    while (0 < A || 0 < B) {
      long a = A %10;
      long b = B %10;
      if (9 < a +b) {
        System.out.println("Hard");
        return;
      }
      A /= 10;
      B /= 10;
 
    }
 
    System.out.println("Easy");

    }
}
