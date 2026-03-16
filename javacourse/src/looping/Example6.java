package looping;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        for (int i = 1; i <= 12; i++) {
            int ans=num*i;
            System.out.println(num+" * "+i+" = "+ans);
        }
        sc.close();
    }
}
