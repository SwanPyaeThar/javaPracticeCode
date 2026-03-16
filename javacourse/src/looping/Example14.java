package looping;
import java.util.Scanner;
public class Example14 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num = sc.nextInt();
        int first_digit=0;
        int last_digit=0;
        int middle_digits=0;
        int div =10;
        int answer=0;
        last_digit=num%div;
        while (num/div > 9){
            div*=10;
        }
        first_digit = num/div;
        middle_digits = num%div-last_digit;;
        answer = last_digit*div + middle_digits + first_digit;
        System.out.println(answer);
        sc.close();
    }
}
