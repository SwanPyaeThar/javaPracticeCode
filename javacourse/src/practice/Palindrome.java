package practice;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit,first_digtit,second_digit,third_digit,fourth_digit;
        System.out.println("Enter  four digits: ");
        digit = sc.nextInt();
        first_digtit =  digit/1000;
        second_digit = (digit%1000)/100;
        third_digit = (digit%100)/10;
        fourth_digit = digit%10;
        if (first_digtit == fourth_digit && second_digit == third_digit) {
            System.out.println("This is a palindrome");
        }else {
            System.out.println("This is not a palindrome");
        }

    }
}
