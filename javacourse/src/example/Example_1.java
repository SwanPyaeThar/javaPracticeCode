package example;
//digit တစ်လုံးချင်းစီခွဲမယ်
//ပြီးရင်reversenumberတွက်မယ်။
public class Example_1 {
    static void main(String[] args) {
        int n = 23456;
        int first_digit,second_digit,third_digit,fourth_digit,fifth_digit,reverse_number;
        first_digit=n/10000;
        second_digit=(n%10000)/1000;
        third_digit=(n%1000)/100;
        fourth_digit=(n%100)/10;
        fifth_digit=n%10;
        reverse_number = (fifth_digit*10000)+(fourth_digit*1000)+(third_digit*100)+(second_digit*10)+first_digit;
        System.out.println("Original Number: "+ n);
        System.out.println("Reverse Number: "+reverse_number);

    }

}
