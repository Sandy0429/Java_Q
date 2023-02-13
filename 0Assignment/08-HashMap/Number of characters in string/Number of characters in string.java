import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        Map<Character,Integer> alphabet = new HashMap<>();
        for(int i=0;i<n;i++){
            if(alphabet.containsKey(str.charAt(i))){
                alphabet.put(str.charAt(i), alphabet.get(str.charAt(i)) + 1);
            }
            else{
                alphabet.put(str.charAt(i),1);
            }
        }
        System.out.println(alphabet.size());
    }
}
