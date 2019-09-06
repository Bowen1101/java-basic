package algorithm;

public class Factorial {
    int factorial(int n){
        if(n<=1){
            return 1;
        } else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Factorial a = new Factorial();
        System.out.println(a.factorial(5));
    }
}
