package function;

public class Example1 {
    public static boolean isPrime(int n)   {
        int div = 2;
        while (n%div !=0 ){
            div++;
        }
        if(div == n){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        boolean ans=isPrime(5);
        if (ans==true){
            System.out.println("Prime Number");
        }else {
            System.out.println("Not Prime Number");
        }
    }
}
