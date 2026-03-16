package looping;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int n=input.nextInt();
        int i =1;
        while(i<=12){
            System.out.println(n+" * "+i+" = "+(n*i));
            i++;
        }
        input.close();
    }
}
