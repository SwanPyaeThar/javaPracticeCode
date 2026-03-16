package looping;
import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int ans=1;
        for (int i = num; i > 0; i--) {
            ans = ans * i;
        }
        System.out.println(num +"! is = "+ ans);
    }
}
