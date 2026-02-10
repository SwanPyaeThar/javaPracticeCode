package practice;
import java.util.Scanner;
//Months of the Year
//January (31 days)
//February (28 days, 29 in 2028 leap year)
//March (31 days)
//April (30 days)
//May (31 days)
//June (30 days)
//July (31 days)
//August (31 days)
//September (30 days)
//October (31 days)
//November (30 days)
//December (31 days)
public class Practice_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day,month and year");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        boolean isValid = true;
        if (year < 1 || month < 1 || day < 1 || month > 12 || day > 31) {
            isValid = false;
        } else if (month == 4 || month == 6 || month==9 || month==11) {
            if(day > 30) isValid = false;
        } else if (month==2) {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0);
            if(isLeapYear){
                if (day > 29) isValid = false;
            }else {
                if (day > 28) isValid = false;
            }

        }
        if (isValid) {
            System.out.println("Valid Date");
        }else {
            System.out.println("Invalid Date");
        }


    }
}
