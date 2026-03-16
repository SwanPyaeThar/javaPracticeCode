package looping;
import java.util.Scanner;
public class Example13 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        int original_number = number;
        int reverse_number = 0;
        while(number!=0){
            reverse_number = reverse_number * 10 + number%10;
            number = number/10;
        }
        if(reverse_number==original_number){
            System.out.println("This number is Palindrome");
        }else{
            System.out.println("This number is not Palindrome");
        }
    }
}
