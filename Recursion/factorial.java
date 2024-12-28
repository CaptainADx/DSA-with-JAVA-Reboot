public class factorial{

    public static long fact(long n){
        if( n==0 || n == 1){
            return 1;
        }
        return n * fact(n-1);
    }

    public static void main(String[] args){
        long num = 200;
        System.out.println("The factorial of " + num + " is : " + fact(num));
    }
}