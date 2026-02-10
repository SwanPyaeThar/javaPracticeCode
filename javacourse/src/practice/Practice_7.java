package practice;
import java.util.Scanner;
public class Practice_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String salePerson;
        double totalSale;
        System.out.println("Enter your sale person");
        salePerson = sc.nextLine();
        System.out.println("Enter total sale for a month");
        totalSale = sc.nextDouble();
        if(totalSale >100 && totalSale <=1000){
            totalSale = totalSale*2/100;
        }else if(totalSale <= 5000){
            totalSale = totalSale*5/100;
        }else{
            totalSale = totalSale * 10/100;
        }
        System.out.println("Your sale person's commission is "+totalSale);

    }
}
