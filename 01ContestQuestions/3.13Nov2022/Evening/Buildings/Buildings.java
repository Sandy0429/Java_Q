import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here

        Scanner sc = new Scanner(System.in);
        int building = sc.nextInt();
        int a[]= new int[building];
        for(int i=0;i<building;i++){
            a[i]=sc.nextInt();
        }
        int count =1;
        int max= a[0];
        for(int i=1;i<building;i++){
            if(max<a[i]){
                count++;
                max=a[i];
            }
        }
        System.out.print(count);
    }
}
