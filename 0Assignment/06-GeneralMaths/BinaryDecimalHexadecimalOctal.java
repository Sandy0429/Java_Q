import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int target = sc.nextInt();
        // int [] arr = new int[n];
        // for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println(DecimalToOctal(n));
        System.out.println(OctalToDecimal(13));
        System.out.println(hexadecimalToDecimal("394ff"));
        System.out.println(DecimalToHexadecimal(234751));

//
    }

    public static String DecimalToOctal(int n){

        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%8);
            n /=8;
        }

        return sb.reverse().toString();
    }

     public static int OctalToDecimal(int num) {

        int power = 0;
        int decimalNumber = 0;

        while(num > 0) {
            int remainder = num % 10;
            num = num/10;
            decimalNumber += remainder * Math.pow(8, power);
            power++;
        }

        return decimalNumber;

    }

    public static int hexadecimalToDecimal(String num){  
        String digits = "0123456789ABCDEF";  
             num = num.toUpperCase();  
             int decimalNumber = 0;  
             int pow =0;
             int i = num.length()-1 ;
             while( i >=0 )  
             {  
                 char c = num.charAt(i);  
                 int d = digits.indexOf(c);  
    
                decimalNumber += d * Math.pow(16,pow);

                 pow++;
                 i--;
             }  
             return decimalNumber;   
    }  

    public static String DecimalToHexadecimal(int num){
        String digits = "0123456789ABCDEF"; 
        StringBuilder sb = new StringBuilder();
        while(num >0){
            int rem = num%16;
            sb.append(digits.charAt(rem));
            num /=16 ;
        }
        return sb.reverse().toString();
    }

    public static String decimalToBinary(int num){
        StringBuilder sb = new StringBuilder();
        while(num>0){
            sb.append(num%2);
            num /= 2;
        }
        return sb.reverse().toString();
    }

    public static int binaryToDecimal(int num){
        int power =0;
        int decimalNumber =0;
        while(num>0){
            decimalNumber += (num%10)*Math.pow(2,power);
            power++;
            num /= 10;
        }
        return decimalNumber;
    }

}
