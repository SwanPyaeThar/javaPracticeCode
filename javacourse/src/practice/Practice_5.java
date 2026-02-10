package practice;
import java.util.Scanner;

public class Practice_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter String 1");
        s1 = sc.nextLine();
        System.out.println("Enter String 2");
        s2 = sc.nextLine();
        if(s1.compareTo(s2)==0){
            System.out.println("Great the same!");
        } else if (s1.compareToIgnoreCase(s2)==0) {
            System.out.println("Okay - almost the same!");
        }else if(s1.length()==s2.length()){
            System.out.println("At least the same length");
        }else{
            System.out.println("Not the same!");
        }
    }
}
