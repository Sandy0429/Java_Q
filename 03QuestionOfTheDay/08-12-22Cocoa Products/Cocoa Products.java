import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        if((a>=15 && b>=8 )|| ((a+b)>=15 && b>=8) ){
            System.out.print(1);
        }
        else if(a>=10 && b>=3|| ((a+b)>=10 && b>=3) ){
            System.out.print(2);
        }
        else if(a>=3 || (a+b)>=3){
            System.out.print(3);
        }
        else{
            System.out.print(4);
        }

    }
}
