package looping;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0;i<=n;i+=5){
            System.out.print(i+"  ");
            count++;
            if (count == 5){
                System.out.println("\n");
                count = 0;
            }
        }

    }
}
