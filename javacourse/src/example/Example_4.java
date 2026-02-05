package example;
//Bitwise Test
public class Example_4 {
    public static void main(String[] args) {
        byte a =1,b=3,c=0;
        c = (byte)(a&b);
        System.out.println("a & b = "+c);
        c = (byte)(a|b);
        System.out.println("a | b = "+c);
        c = (byte)(a^b);
        System.out.println("a ^ b = "+c);
        c = (byte)~a;
        System.out.println("~a = "+c);
        c = (byte)(a>>2);
        System.out.println("a >> 2 = "+c);
        c = (byte)(a<<2);
        System.out.println("a >> 2 = "+c);
    }
}
