public class sumOfNaturalNumbers {
    
    public static int printSum(int n){
        if(n==1) {
            return 1;
        }
        return n + printSum(n-1);
    }
    public static void main(String[] args){
        int num = 5;
        System.out.println(printSum(num));
    }
}