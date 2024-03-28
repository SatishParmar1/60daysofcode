import java.util.*;
import java.io.*;



class lac9{
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                 if(x>= -2147483647  && x<=2147483647 || x<= -2147483647  && x>=2147483647){
                     System.out.println("* long");
                if(x>= -2147483647  && x<=2147483647){
                     System.out.println("* int");
               if(x>=-32768 && x<= 32767){
                     System.out.println("* short");
                if(x>=-128 && x<=127){
                    System.out.println("* byte");
                }
               }}
                }   
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");  
            
        }
    }
}


}
