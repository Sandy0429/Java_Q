public static int  OccurenceOfX(int N,int X){
    //Enter your code here
    // if(N*N == X){
    //     return 1;
    // }
    // if( N*N <X || N <= 0 || X <= 0){
    //     return 0;
    // }
    // int count = 0;
    // for(int i=1;i<=N;i++){
    //     for(int j=i*i ; j<=N-i+1; j+=i){
    //         // System.out.println(j);
    //         if(j == X)
    //             count+=2;
    //     }
    // }
    // return count; 
    int ans = 0;
    for (int i = 1; i <= N; i++)
        if (X % i == 0 && X / i <= N)
            ans++;
 
    return ans;       
}
