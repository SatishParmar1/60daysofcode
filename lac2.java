import java.util.Arrays;
import java.util.Scanner;

class lac2{

public static void main(String[] args){
Scanner in = new Scanner(System.in);
    int [][]hello = new int[3][3];

    for(int i = 0;i<hello.length;i++){
          for(int j = 0;j<hello[i].length;j++){
         hello[i][j] = in.nextInt(); 
        }
    } 
    // Either use this
    for(int i = 0;i<hello.length;i++){
        for(int j = 0;j<hello[i].length;j++){
        System.out.print(hello[i][j]);
        }
        System.out.println();
    }
     // or this 
    for(int[] i:hello){
        System.err.println(Arrays.toString(i));
    }
}
}          