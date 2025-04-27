import java.util.Scanner;
public class CountLetter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str=sc.nextLine();
        System.out.print("Enter a letter to count:");
        char target =sc.next().charAt(0);
        int count=0;
        for(char c:str.toCharArray()){
        if(c==target){
         count++;
 }
}
System.out.println("Letter '"+target+"'appers"+count+"time(s).");
    }
}
