package looping;
import java.util.Scanner;
public class Example15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum=0;
        while (num%10!=0){
            sum+=num%10;
            num=num/10;

        }
        System.out.println("The sum is "+sum);
        input.close();
    }
}
