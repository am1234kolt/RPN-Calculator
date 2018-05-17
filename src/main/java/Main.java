import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by koltsova on 25/04/2018.
 */
public class Main {

    public static void main(String[] args) {
        RPNCalculator calc = new RPNCalculator();
        calc.addOperation(new Divide());
        calc.addOperation(new Addition());
        calc.addOperation(new Cos());
        calc.addOperation(new Exp());
        calc.addOperation(new Exponent());
        calc.addOperation(new Logarithm());
        calc.addOperation(new Multiplication());
        calc.addOperation(new Sin());
        calc.addOperation(new SquareRoot());
        calc.addOperation(new Subtraction());
        System.out.println(calc.removeOperation("-"));
        System.out.println(calc.supportsOperation("+"));
        Parser p = new Parser(calc.getOperators());
        Interactor inter = new Interactor(calc,p);
        inter.run();
    }
}
