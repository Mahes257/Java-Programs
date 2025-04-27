import java.util.Scanner;
public class Main {

    public static int sumOfAllRotations(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        int currVal = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
            currVal += i * arr[i];
        } 
        int sumOfRotations = currVal;
        for (int i = 1; i < n; i++) {
            currVal = currVal + totalSum - n * arr[n - i];
            sumOfRotations += currVal;
        }
        return sumOfRotations;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
        System.out.println("Sum of all rotation values: " + sumOfAllRotations(arr));
    }
}