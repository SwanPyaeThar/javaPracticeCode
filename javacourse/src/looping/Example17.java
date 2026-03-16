package looping;
import java.util.Scanner;
public class Example17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        int div = 1;
        System.out.print("Factors of "+ num + " are : ");
        while (div<=num){
            if (num%div==0){
                System.out.print(div+"\t");
            }
            div++;
        }
        input.close();

    }
}
