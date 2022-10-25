static int Phone(int N, int K, int M){
//Enter your code here 
int b;
    int sp = N*K;
    int sr = sp -M;
    if(sr >=0)
       { b = sr/K;
         return (N-b);
         }
    else 
        return (-1);
}
