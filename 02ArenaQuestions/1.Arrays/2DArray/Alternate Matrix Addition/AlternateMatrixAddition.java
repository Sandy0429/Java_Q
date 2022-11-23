import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        // Scanner sc = new Scanner (System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // int n = sc.nextInt();
        int n = Integer.parseInt(in.readLine());

        int black_sum =0;
        int white_sum =0;

        for(int i=0 ; i<n ; i++){
            String [] elements = in.readLine().trim().split(" ");
            for(int j=0 ; j< n ; j++){
                
                if((i+j)%2 == 0){
                    black_sum += Integer.parseInt(elements[j]);//sc.nextInt();
                }
                else{
                    white_sum += Integer.parseInt(elements[j]);// sc.nextInt();
                }

            }
        }
        System.out.print(black_sum+"\n"+white_sum);
    }
}
