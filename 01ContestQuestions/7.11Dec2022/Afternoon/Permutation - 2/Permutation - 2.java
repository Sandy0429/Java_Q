import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static ArrayList<String> listAns = new ArrayList<>();
    public static void permutations(String s, String ans){
        if(s.length() == 0){
            // System.out.print(ans+" ");
            listAns.add(ans);
            return;
        }

        boolean alpha[] = new boolean[150];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            String restOfString = s.substring(0,i)+s.substring(i+1);

            if(alpha[ch] == false){
                permutations(restOfString, ans+ch);
                alpha[ch] = true;
            }
        }

    }
    public static void main (String[] args)throws IOException {
        // Your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String s = in.readLine().trim();

        permutations(s,"");
        Collections.sort(listAns);
        for(String str : listAns){
            System.out.print(str+" ");
        }
    }
}
