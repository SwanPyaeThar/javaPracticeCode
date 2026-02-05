public class Example_3 {
    //Logical Bitwise
    public static void main(String[] args) {
        int a = 2, b= 0;
        if(a==2 | a/b!=0){ //note divisor is zero,thus "java.lang.ArithemeticException" error
            System.out.println("a is 2 and a/b!=0");
        }
    }
}
//ဘာလို့့ error တက်လဲဆိုတော့ bitwise သည် condition တစ်ခုကို အဆုံးထိကြည့်သောကြောင့်ဖြစ်ပါတယ်။
