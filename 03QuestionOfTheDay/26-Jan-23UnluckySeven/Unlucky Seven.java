import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printNumbers(n,7));
    }
  
    public static boolean isDigitPresentDecimal(int x, int d)
    {        
        while (x > 0)
        {
            if (x % 10 == d)
                break;
 
            x = x / 10;
        }
        return (x > 0);
    }

    public static boolean isDigitPresentOctal(int x, int d)
    {        
        boolean oct = DecimalToOctal(x);

        return oct;
        
    }
  
    public static boolean DecimalToOctal(int n){

        while(n>0){
            if(n%8 == 7){
                return true;
            }            
            n /=8;
        }

        return false;
    }
 
 
    public static int printNumbers(int n, int d)
    {       
        int count=0;
        for (int i = 1; i <= n; i++){
            // System.out.println(isDigitPresentDecimal(i, d)+"  "+i);
          if ( !isDigitPresentDecimal(i, d))
            {
                // System.out.println(isDigitPresentOctal(i, d)+"  "+i);
                if(!isDigitPresentOctal(i,d))
                    count++;
            }
        }

        return count;
    }
}
