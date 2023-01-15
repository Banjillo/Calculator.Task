package inheritance.Calculator;
public class Calculator {
    //final static String INPUT = "-";
    final static String ADD = "+";
    final static String SUB = "-";

    public static void Display(int x, int y, String operator, int z){
        System.out.println(x + " " + operator + " " + y + " = " + z);
    }
    public static void add(int x, int y){
        Display(x, y, ADD, x+y);
    }
    public static void sub(int x, int y){
        Display(x, y, SUB, x-y);
    }
}
