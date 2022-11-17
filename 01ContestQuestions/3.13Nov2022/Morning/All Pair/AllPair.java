static int AllPair(int N){
//Enter your code here
    // int count =0;

    // if (N==2){
    //     return 1;
    // }

    // for(int i=1 ; i<N-1 ; i++){
    //     for(int j= i ; j<N ; j++){            
    //         if((i+j) == N)
    //         {
    //             // System.out.println(i+" "+j+" "+(i+j));
    //             count++;
    //         }
    //     }
    // }
    // return count*2;

    //    for(int i=1 ; i<N ; i++){
    //        if((N-i)<N)
    //             count++;
    //      }
    // return count;

    // if(N%2 == 0){
    //     return (((int)(N/2)*2));
    // }
    
    //  return  ((((int)(N-1)/2)*2)+1);

    return N-1;
}
 
/* 5
    1 2 3 4
    1 4
    3 2  --4

    8
     1 2 3 4 5 6 7 8
     1 7
     2 6
     3 5
     4 4  ---8




*/
