import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
        // Your code here
        // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(in.readLine());
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] marks = new int[n];
        
        // String [] elements = in.readLine().trim();
        for(int i=0;i<n;i++){
            // marks[i] = Integer.parseInt(elements[0]);            
            marks[i] = sc.nextInt();
        }
        char ch = sc.next().charAt(0);
        int i;

        if (ch == 'b') {
            i=0;
        }
        else{
            i=1;
        }

        int count=0;
        while(i<n){
            count += marks[i];
            i+=2;
        }

        System.out.print(count);
    }
}
