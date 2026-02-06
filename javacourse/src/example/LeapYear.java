package example;
import java.util.Scanner;
//leap year တွက်နည်း 4 နှင့်ပြတ်ရင်100နဲ့မပြန်ရဘူး or 400နဲ့ပြတ်ရင် leapyear

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int years = sc.nextInt();
        if(years%4==0 && years%100!=0 || years%400==0){
            System.out.println("This is a leap year");
        }else {
            System.out.println("This is not a leap year");
        }
    }
}
