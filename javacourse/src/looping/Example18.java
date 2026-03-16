package looping;
import java.util.Scanner;
//Check perfect number or not
public class Example18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        int div = 1;
        int sum = 0;
        while(div < num){
            if (num%div==0){
                sum+=div;
            }
            div++;
        }
        if (sum==num){
            System.out.println("This number is perfect number");
        }else{
            System.out.println("This number is not perfect number");
        }
        input.close();

    }
}
