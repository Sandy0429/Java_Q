import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.util.stream.*;
import java.util.stream.Collectors.*;

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        //Scanner sc = new Scanner(System.in);

        // BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
        // String [] element = in.readLine().trim().split(" ");
        // long A = Long.parseLong(element[0]);
        // long N = Long.parseLong(element[1]);
        // // long A = sc.nextLong();
        // // long N = sc.nextLong();

        // for(int i=0;i<N;i++){ 
        // int mx = 0;
        // int mn = 9;       
        //     long n=A;

        //     // String s1 = String.valueOf(n);
        //     // List<Character> s = s1.chars().mapToObj(c->(char)c).collect(Collectors.toList());
        //     // Comparator<Character> comparator = Comparator.comparing(Character :: valueOf);
        //     // Character mins = s.stream().min(comparator).get();
        //     // Character max = s.stream().max(comparator).get();

        //     // mx = Integer.parseInt(String.valueOf(max));
        //     // mn = Integer.parseInt(String.valueOf(mins));
        //     //---MLE
            
        //     // System.out.println("n="+n);
        //     while(n!=0){
        //         int temp =(int) n%10;
        //         mx = Math.max(mx, temp);
        //         mn = Math.min(mn,temp);
        //         // System.out.println("mx="+mx+" mn="+mn);
        //         n /= 10;
        //     }
        //     //---tle
        //     A = A+(mx*mn);        
        // }
        // System.out.print(A);


        Scanner sc =new Scanner(System.in);
        long a =sc.nextLong();
        long times = sc.nextLong();

        long temp, min,max;
        for(long j=0; j<times;j++){
            min = 9;
            max=0;
            temp =a;
            while(temp>0){
                min = Math.min(min,(temp%10));
                max = Math.max(max,(temp%10));
                temp /=10;
            }

            if(min*max ==0){
                break;
            }
            a = a+(min)*(max);

        }
               System.out.print(a); 
    }
}
