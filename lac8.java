import java.util.Arrays;

public class lac8 {
    public static void main(String[] args) {
        int[] arr = {1,4,3,5,2};
        sort(arr);
        System.out.println(Arrays.toString(arr) );
    }
    static void sort(int[] arr){
      int i = 0;
      while(i<arr.length){
           int current = arr[i]-1;
             if(arr[i] != arr[current]){
                swap(arr,i,current);
             }else{
                i++;
             } 
          
        }
       
    }

    static void swap(int[] arr, int i,int current){
        int temp;
        temp = arr[i];
        arr[i]= arr[current];
        arr[current]= temp;
    }
}
