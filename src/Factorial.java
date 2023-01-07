public class Factorial {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorialRecursion(5));
        System.out.println(factorial.factorialRecursionV2(5));
    }

    public int factorialRecursion(int n){
        if(n>0){
            return  n * factorialRecursion(n-1);
        }else
        {
            return 1;
        }
    }

    public int factorialRecursionV2(int n){
        return n>1? n * factorialRecursionV2(n-1):1;
    }

}
