import java.util.*;
class Main{
public static Bitoperation(int[]){
 Scanner sc = new Scanner(System.in);
 int n= sc.nextInt();
 int count =0;
 while(n !=0){
    n=n&(n-1);
    count++;
 }
}
 public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a Number:");
int num =sc.nextInt();
int result = Bitoperation(num);
System.out.println("Number of sets in num "+ result);
 }
