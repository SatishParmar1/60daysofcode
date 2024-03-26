import java.util.Arrays;

public class lac7 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,3,7,2};
        Insertion(arr);
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
 