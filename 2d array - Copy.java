import java.util.*;
public class Main{
    public static void printArray(int[][]ar){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
               transpose[i][j]=ar[j][i];
            }
            System.out.println();
        }
    }
    for (int[] x:transpose){
        Arrays.sort(x);
    
    }
    for(int i=0;i<ar.length;i++){
        for(int j=0;j<ar[0].length;j++){
           System.out.print(transpose[j][i]+ " ")
        }
        System.out.println();
    }

    public static int[][]takenInput(Scanner sc){
        System.out.println("Enter a row Size :");
        int rows =sc.nextInt();
        System.out.println("Enter a column Size :");
        int columns =sc.nextInt();
    }
    return ar;

    public static void main(String args){
        Scanner sc=new Scanner(System.in);
        int[][] ar=takenInput(sc);
        int transpose=new int[ar.length][ar[0].length];
        printArray(ar); 

    }
}