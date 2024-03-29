class lac13{
    public static void main(String[] args) {
       
        int[] arr = {1,3,5,2,7,2};
       int n = maximum(arr);
        System.out.println(n);
    }

    static int maximum(int[] arr){
        int first = -1;
        int second = -1;

        for(int a :arr){
            if( a > first){
            second = first;
            first = a;
            }else if(a > second && a != first){
            second = a;
               

            }
        }
        System.out.println(second);
        if(second == -1){
            return -1; 
        }
        return second;
    }
}