import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        int noOfElements = Integer.parseInt(in.readLine());
        String [] elem = in.readLine().trim().split(" ");

        int [] elements = new int [noOfElements];
        for(int i=0 ; i< noOfElements; i++){
            elements[i] = Integer.parseInt(elem[i]);
        } 

        Arrays.sort(elements);
        int count =0;
        for(int i = 0 ; i < noOfElements-1 ; i++){
            if(elements[i] == elements[i+1]){
                    count ++;
            }
            else if(count != 0){
                System.out.print(elements[i]+" "+(count+1));
                count =0;
                System.out.println();
            }
            
        }
        if(count != 0)
            System.out.print(elements[noOfElements-1]+" "+(count+1));
    }
}
