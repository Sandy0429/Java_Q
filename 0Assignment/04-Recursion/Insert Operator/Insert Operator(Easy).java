import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static boolean insertOperator(long[] numbers, int pos, long cumSum, long K) {
        if (pos == numbers.length) {
            return cumSum == K;
        }

        return if (!insertOperator(numbers, pos + 1, cumSum + numbers[pos], K)) {
					return insertOperator(numbers, pos + 1, cumSum - numbers[pos], K);				
				} 
    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        long K = in.nextLong();

        long[] numbers = new long[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = in.nextLong();
        }

        if (insertOperator(numbers, 1, numbers[0], K))  {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
