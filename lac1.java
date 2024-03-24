import java.util.Arrays;
import java.util.Scanner;

class lac1{
public static void main(String[] args) {
  
    Scanner in = new Scanner(System.in);
    int[] ham = {10,20,30,40};   // initilization
    int[] ham1 = new int[5];     // Declaration it create heap space for variable
     System.out.println(ham[0]);
     for(int i=0;i<ham.length;i++){
       // ham1[i] = in.nextInt();
        System.out.println(ham[i]);

     }

     for(int num: ham){           // Enhance For loop
        System.out.println(num +"  ");
     }

     System.out.println(Arrays.toString(ham));

      int[][] ham3={{1,2,3},{1,2,4}}; 

      
}
}   