package pack;

abstract class Calculator {
    public abstract int add(int a, int b);
}

public class GoodCalc extends Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        GoodCalc c = new GoodCalc();
        System.out.println(c.add(2, 3));
    }
}
