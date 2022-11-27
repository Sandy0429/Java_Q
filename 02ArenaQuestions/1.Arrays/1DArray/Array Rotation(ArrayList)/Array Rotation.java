import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
        // Your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String [] nr = in.readLine().trim().split(" ");
        String [] elements = in.readLine().trim().split(" ");
        int n = Integer.parseInt(nr[0]);
        int rotation = Integer.parseInt(nr[1]);
        ArrayList<Integer> list = new ArrayList<>(n);

        for(int i=0;i<n;i++) list.add(Integer.parseInt(elements[i]));

        for(int i=0; i<rotation; i++){
            
            list.add(list.get(0));
            list.remove(0);
        }

         for(int i=0;i<n;i++) System.out.print(list.get(i)+" ");
    }
}
