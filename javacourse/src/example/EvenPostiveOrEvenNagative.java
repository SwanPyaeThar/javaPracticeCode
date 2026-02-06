package example;
import java.util.Scanner;
public class EvenPostiveOrEvenNagative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n%2==0){
            if(n>=0){
                System.out.println("This number is even postive.");
            }else {
                System.out.println("This number is event negative.");
            }
        }else {
            if (n>=0){
                System.out.println("This number is odd postive.");
            }else  {
                System.out.println("This number is odd negative.");
            }
        }
    }
}
