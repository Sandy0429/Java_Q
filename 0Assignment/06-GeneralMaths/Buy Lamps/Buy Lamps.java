import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            long n = sc.nextLong();//total lamp he is going to buy
            long k = sc.nextLong(); //k red lamps he want to buy
            int x = sc.nextInt(); //cost of red lamp
            int y = sc.nextInt(); //cost of blue lamp

            long amount = k*x; //total cost of k red lamp
             
             n -=k;//lamp left

             amount += Math.min((n*x),(n*y)); //from remaining lamps that he has to buy calculating ki kisko lene se km cost aayega
             System.out.println(amount);
        }
    }
}
