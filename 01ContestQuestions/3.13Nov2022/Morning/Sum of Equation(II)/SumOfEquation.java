static  int equationSum(int N)
{
//Enter your code here
    int sum =0;
    for(int i=1;i<=N;i++){
       
    //    System.out.println(Math.pow((i-1),3));
    //    System.out.println(Math.pow((3*(i+1)),2));
        sum += (Math.pow((i-1),3) + 3*(Math.pow((i+1),2)) +2);

        // System.out.println(sum);
    }

    return sum;
}

/*
    (1-1)3 +3*(1+1)2+2 =0 +12+2 = 14

    (2-1)3 + 3*(2+1)2+2 = 1+ 27+2 = 30

    

*/
