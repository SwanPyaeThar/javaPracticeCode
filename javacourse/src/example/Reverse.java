package example;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,first_digit,second_digit,third_digit,fourth_digit,fifth_digit,reverse_num;
        System.out.println("Enter a five digits: ");
        num = sc.nextInt();
        first_digit = num /10000;
        second_digit=(num%10000)/1000;
        third_digit=(num%1000)/100;
        fourth_digit=(num%100)/10;
        fifth_digit=num%10;
        reverse_num = (fifth_digit*10000)+(fourth_digit*1000)+(third_digit*100)+(second_digit*10)+first_digit;

        System.out.println("reverse_number : "+reverse_num);
    }
}
