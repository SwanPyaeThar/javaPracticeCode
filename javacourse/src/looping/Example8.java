package looping;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        do{
            System.out.println(num + " * " +  i + " = " + (num * i));
            i++;
        }while (i <=12);

    }
}
