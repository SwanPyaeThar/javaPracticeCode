package example;
import java.util.Scanner;
//varialbes and functions တွေကို static and instance ဆိုပြီး နှစ်မျိုူးခွဲလို့ရပါတယ်။
//static ဆိုတဲ့စကားလုံးတွေ့ရင် static လို့မှတ် မပါရင် instance
//static ဆိုရင် classကပိုင် class name.နဲ့ခေါ်သုံးလို့ရတယ်။object တွေအာားလုံက share လုပ်သုုံးတယ်
//instance ဆိုရင် object ကပိုင် object name.နဲ့ခေါ်သုံးရပါတယ်။
//java ရဲ့input method ဖြစ်တဲ့scannerကို ယူသုံးဖို့အတွက်java.util package ကို importလုပ်ရပါမယ်.Scanner က instanceဖြစ်တဲ့အတွက်objectဆောက်ရပါမယ်။




public class Input_Scanner_Example {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0 ;
        System.out.println("Enter an integer: ");
        a= scanner.nextInt();
        System.out.println("Your integer: "+a);
    }


}
