package example;
import java.util.Scanner;
public class EvanOrOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check even or odd");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("This numbe is even!");
        }else {
            System.out.println("This numbe is odd!");
        }
        sc.close();
    }
}
