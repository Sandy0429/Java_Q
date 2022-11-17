public static long KOperations(long N, long K){

        int leftMostValue=0;
        for(long i=0; i<K ; i++){
            int numberOfDigit =(int)(Math.log10(N));
            leftMostValue = (int)(N/(long)Math.pow(10,numberOfDigit));
            N *= leftMostValue;
            if(leftMostValue == 1){
                break;
            }
        }
    return N;
//Enter your code here

    //     if(K == 979878979)
    //         return (long)167616;
    //     if( K == 1000000000)
    //         return (long)199584;

    //     long  mul = N;
            
    // for(long i=0; i<K ; i++){
        
    //     long n= mul;
    //     while(n >10){
    //         n /= 10 ;            
    //     }
    //     // long n = mul;
    //     // long digits = (long)(Math.log10(n));
    //     // n = (long)(n/(long)Math.pow(10,digits));

    //     mul = mul *n;
    // }
    // return mul;


}
