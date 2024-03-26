import java.util.Scanner;

public class lac4 {
    public static void main(String[] args) {
              Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,6,7,9,12,14,15,18};
        System.out.println("Enter Your Element");
        int target = in.nextInt();
        int ans = linearSearch(arr,target);
        if(ans == -1){
            System.out.println(" Element Not Found");
            }else{
            System.out.println("Your Element is: "+ans);
            }
    }

    static int linearSearch(int[] arr, int target){
         if(arr.length == 0){
            return -1;
         }
          for(int element : arr){
              if(element == target){
                return element;
              }
          }
        return -1;
    }
}
