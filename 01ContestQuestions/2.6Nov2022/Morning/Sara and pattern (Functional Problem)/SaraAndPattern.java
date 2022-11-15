static void Pattern(int N){
//Enter your code here

int x =0;
    for(int i=0; i<N;i++)
    {
        int c = x;
        for(int j=0; j<N;j++)
        {
            
            System.out.print(c+" ");
            c +=4;
        }
        System.out.println();
        x +=6 ;
    }
}
