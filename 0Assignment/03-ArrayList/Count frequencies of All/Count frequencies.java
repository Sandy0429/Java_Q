import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            list.add(sc.nextInt());
        }

        Set<Integer> distinctElementOfList = new HashSet<>(list);
        for(int i : distinctElementOfList){
            System.out.println(i+" "+Collections.frequency(list,i));
        }

    }
}
