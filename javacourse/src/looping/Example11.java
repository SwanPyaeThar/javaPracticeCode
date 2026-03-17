package looping;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int div = 2;
        int num = 0;
        System.out.println("Enter a number to check prime number or not : ");
        num = sc.nextInt();
        do {

             if(num <=1){
                 System.out.println("Please enter a number greater than 1: ");
                 num = sc.nextInt();
             }

        }while(num <= 1);

        while(num%div != 0){
              
            div++;
        }
        if (num == div){
            System.out.println("Prime number is "+num);
        }else {
            System.out.println("Not Prime number is "+num);
        }
        sc.close();
    }
}
