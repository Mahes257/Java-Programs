import java.util.*;

class code{
    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
        
    }
    static void function(int n,int m){
        for(int i=n;i<=m;i++){
            int result=fact(i);
            System.out.printf("Factorial of %d is %d \n",i,result);
        }
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       function(n,m);
    }
}