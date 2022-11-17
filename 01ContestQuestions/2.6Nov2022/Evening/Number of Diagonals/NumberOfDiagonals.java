static int numberOfDiagonal(int N){
//Enter your code here

    int x = N * (N - 3) / 2;
    if(x<0)
        x= 0;

     return x ;
    
}
