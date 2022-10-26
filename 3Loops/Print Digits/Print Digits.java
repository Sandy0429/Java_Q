static void Print_Digits(int N){
//Enter your code here
int q = N;
String name = " ";

    while(q!=0){
        int r = q%10;
        switch(r){
            case 0:
               
                name = "zero " + name;
                break;
            case 1:
               
                name ="one " + name;
                break;
            case 2:
               
                name = "two "+ name;
                break;
            case 3:
                
                name = "three "+ name;
                break;
            case 4:
               
                name ="four "+ name;
                break;
            case 5:
               
                name = "five "+ name;
                break;
            case 6:
              
                name ="six "+ name;
                break;
            case 7:
               
                name = "seven "+ name;
                break;
            case 8:
               
                name = "eight "+ name;
                break;
            case 9:
                name = "nine "+ name;
                break;    
        }
        q = q/10;
    }
    System.out.println(name);
}
