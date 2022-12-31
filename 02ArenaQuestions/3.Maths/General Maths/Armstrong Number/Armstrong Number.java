static boolean isArmstrong(int N)
    {
        // your code here
        int s = N;
        int sum =0;
        while(s != 0){
            int d = s%10;
            sum += Math.pow(d,3);
            s /= 10;
        }
        if(sum == N)
            return true;
        return false;
    }
