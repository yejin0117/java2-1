/**
 * InnerEx4_11
 */
class Calc {
    int foo;
    static int bar;

    public static int abs(int a){ return a>0?a:-a;}
    public static int max(int a, int b){ return (a>b)?a:b;}
    public static int min(int a, int b){ return (a>b)?b:a;}
}

public class Ex4_11 {
    public static void main(String[] args) {
        System.out.println(Calc.abs(-5));
        System.out.println(Calc.max(10, 8));
        System.out.println(Calc.min(-3, -8));
        Calc a = new Calc();
        a.foo = 100;
        //a.bar = 80; //오류 p.174 b1.n b1.g
        Calc.bar=50; //static은 클래스 이름, non-static은 객체이름
        System.out.println(a.foo);
        System.out.println(Calc.bar);
    }
}