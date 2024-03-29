import java.util.Scanner;

public class lac11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N1 = in.nextInt();
        fabonacci(N1);
    }
    static void fabonacci(int N1){
        int h = Integer.MAX_VALUE;
        if(N1 < h){
        int a = 0;
        int b = 1;
        int temp ;
        for(int i = 0;i<N1-1;i++){
            temp = b;
            b = b+a;
            a = temp;
            
        }
        System.out.println(b);
    }
}
}
