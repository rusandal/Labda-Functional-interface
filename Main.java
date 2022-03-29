public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(10,4);
        int c = calc.divide.apply(a, b);
        System.out.println("a="+a+" b="+b+" a/b=");
        calc.println.accept(c);
        int x = calc.pow.apply(a);
        System.out.println("a*a="+x);
        int y = calc.abs.apply(b);
        System.out.println("b(+/-)="+y);
        boolean count = calc.isPositive.test(b);
        System.out.println("b>0? "+count);
    }
}
