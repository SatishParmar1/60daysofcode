import java.util.Scanner;

public class lac3 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,6,7,9,12,14,15,18};
        System.out.println("Enter Your Element");
        int target = in.nextInt();
        int ans = binarySearch(arr,target);
        if(ans == -1){
        System.out.println(" Element Not Found");
        }else{
        System.out.println("Your element Index is: "+ans);
        }
    }

     static int binarySearch(int[] arr, int target){
          
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }else  if(target >arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }            
        }
        return -1;
    }
}
   