package looping;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int count = 0;
        for (int i = n;i>=1;i--){
            System.out.print(i+"\t");
            count++;
            if (count == 10){
                System.out.println("\n");
                count = 0;
            }
        }
    }
}
