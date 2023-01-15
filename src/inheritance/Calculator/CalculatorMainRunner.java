package inheritance.Calculator;

import java.util.Scanner;

public class CalculatorMainRunner extends AdvanceCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a,b;
        String op;

        System.out.println("Input");
        a = sc.nextInt(); op = sc.next(); b = sc.nextInt(); sc.nextLine();

        if(op.equals(ADD)) add(a,b);
        if(op.equals(SUB)) sub(a,b);
        if(op.equals(MULT)) mult(a,b);
        if(op.equals(DIV)) div(a,b);

        System.out.println("Output");
        sc.close();
    }
}
