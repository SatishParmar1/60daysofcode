import java.util.Arrays;
import java.util.Scanner;

public class lac7 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter Your Array Size :");
        int N = in.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter Your Array Value: size("+N+")");
        for(int i=0;i<N;i++){
           arr[i] = in.nextInt();  
        }
    System.err.println(Arrays.toString(arr));
    }

    static void Insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j = i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int j){
        int temp;
        temp = arr[j];
        arr[j]= arr[j-1];
        arr[j-1]= temp;
    }
    
}
 