static int SillyNumber(int N){
//Enter your code here
      
    int temp = 0;
    int result = 0;

        for(int i=1; i<=N ; i++){
            temp = temp+ i*i;
            if(temp> N){
                if(temp - N < N-result){
                    return temp;
                }                    
               else{
                        return result;
                }
            }
            result = temp;
        }
    return result;
}

/*
    1*1 = 1 - 1
    2*2= 4  - 5
    3*3 = 9 - 14
    4*4 = 16 - 30
    5*5 = 25 - 55
    6*6 = 36 - 91
    7*7 = 49 - 140

*/
