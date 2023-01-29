import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int index = -2;
        for(int i=0;i<str.length();i++){
            char ch =  str.charAt(i);
            if(ch == 'a'){
                index = i;
            }
        }
        System.out.println(index+1);
    }
}
