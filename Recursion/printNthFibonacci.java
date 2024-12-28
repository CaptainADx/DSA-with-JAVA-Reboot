public class printNthFibonacci {
    
    public static int fibonacciSum(int n){  
        if(n==0 || n==1){
            return n;
        }
        int term = fibonacciSum(n-1) + fibonacciSum(n-2);
        return term;
    }

    public static void main(String[] args){
        int num = 26;
        System.out.println(fibonacciSum(num));
    }
}
