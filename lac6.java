import java.util.Arrays;

public class lac6 {
    public static void main(String[] args) {
         int[] arr = {1,3,5,3,7,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
        int last = arr.length-1-i;
        int maximum = getmax(arr,0,last);
        swap(arr,maximum,last);
        }
    }
    static int getmax(int[] arr, int start, int last){
        int max = start;
        for(int i= start;i<last+1;i++){
            if(arr[max]<arr[i]){
               max = i;
            }
        }
        System.err.println(max);
        return max; 
    }
    static void swap(int[] arr,int maximum,int last){
        int temp = arr[maximum];
        arr[maximum] = arr[last];
        arr[last]= temp;
    }
    
}
