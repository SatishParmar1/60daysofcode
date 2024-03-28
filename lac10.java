import java.util.Arrays;
import java.util.Scanner;

public class lac10 {
    public static void main(String[] args) {
    Scanner in =  new Scanner(System.in);
    System.out.println("give me length of array");
        int z = in.nextInt();
        System.out.println("enter your array input");
        int[] arr= new int[z];
       
        for(int i=0;i<arr.length-1;i++){
        arr[i] = in.nextInt();
        }
         int a= MissingNumber(arr,z);
    System.out.println("Missing value is "+a);
    } 

    static int MissingNumber(int[] arr,int z){
               int real=0;
               int sum=0;
             for(int i =0;i<z;i++){
                int  j = i+1;
                real = (j*(j+1)/2);
                sum = arr[i]+sum;
             }
             int N =real-sum; 
        return N;
    }
    
}
