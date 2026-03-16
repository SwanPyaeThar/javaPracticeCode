package looping;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a number2: ");
        int num2 = sc.nextInt();
        int ans = 0;
        if(num1 > num2){
            for (int i=1;i<=num2;i++){
                if(num2%i==0 && num1%i==0){
                    ans = i;
                    if(i>ans){
                        ans = i;
                    }
                }
            }
        }else{
            for (int i=1;i<=num1;i++){
                if(num1%i==0 && num2%i==0){
                    ans = i;
                    if(i>ans){
                        ans = i;
                    }
                }
            }
        }
        System.out.println("GCD number is = "+ ans);
    }
}
