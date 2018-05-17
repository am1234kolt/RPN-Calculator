import java.util.Scanner;

/**
 * Created by koltsova on 14/04/2018.
 */
public class Divide implements Operation{
    public boolean isBinary(){
        return true;
    }
    public String getOperation(){
        return "/";
    }
    public String getDescription(){
        return" / : performs division of the first operand by the second";
    }

    public double execute(double... operands) {
        double total=0;
        if(operands.length==1){
            throw new ExepressionFormatExpression("Wrong format");
        }else if(operands.length==2) {
            total=operands[1]/operands[0];
            if (total > Integer.MAX_VALUE) {
                throw new ArithmeticException("Integer value overflow");
            }
            if (total < Integer.MIN_VALUE) {
                throw new ArithmeticException("Integer value underflow");
            }
        }
        return total;
    }
}
