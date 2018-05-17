/**
 * Created by koltsova on 07/04/2018.
 */
import java.util.Scanner;

public class Interactor {
    private Calculator calc;
    private Parser parser;

    public Interactor(Calculator calc, Parser parser) {
        this.calc = calc;
        this.parser = parser;
    }

    void displayOperations() {
        System.out.println("The following RPN calculator supports those operations : \n");
        for (String str: calc.getOperationsInfo()) {
            System.out.println(str + "\n");
        }
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        displayOperations();
       while(true) {
           String input = sc.nextLine();
           if(input.equalsIgnoreCase("q")){
               System.exit(1);
           }else {
               System.out.println(calc.execute(parser.parse(input)));
           }
       }
    }
}
