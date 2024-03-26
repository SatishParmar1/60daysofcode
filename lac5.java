import java.util.Arrays;
import java.util.Scanner;

public class lac5 {
     public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter Your Array Size :");
        int N = in.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter Your Array Value: size("+N+")");
        for(int i=0;i<N;i++){
           arr[i] = in.nextInt();  
        }
        bubble(arr);
       System.out.println(Arrays.toString(arr));
     }
     static void bubble(int[] arr){
          for(int i=0;i<arr.length;i++){
            for( int j = 1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                }
            }
           }

     }
}
