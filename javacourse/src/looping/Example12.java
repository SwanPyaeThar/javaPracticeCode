package looping;
import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        int reverse_number = 0;
        int length = String.valueOf(number).length();
        for (int i = 0; i<length; i++) {
            reverse_number = reverse_number * 10 + number%10;
            number = number/10;
        }
        System.out.println("Reverse number is "+reverse_number);
        sc.close();


    }
}
