package example;
import java.util.Scanner;
public class ExamPassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark;
        System.out.print("Enter Mark: ");
        mark = sc.nextInt();
        if(mark >= 40) {
            System.out.println("You Passed!");
        }else{
            System.out.println("You Failed!");
        }
        sc.close();
    }
}
