package inheritance.Calculator;

public class AdvanceCalculator extends Calculator{
    final static String MULT = "*";
    final static   String DIV = "/";

    public static void mult(int x, int y) {
        Display(x,y, MULT, x*y);
    }

    public static void div(int x, int y) {
        Display(x, y, DIV, x/y);
    }

}
