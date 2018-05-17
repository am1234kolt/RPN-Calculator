/**
 * Created by koltsova on 14/04/2018.
 */
public class Addition implements Operation {
    public boolean isBinary() {
        return true;
    }

    public String getDescription() {
        return " + : performs addition of two numbers";
    }

    public String getOperation() {
        return "+";
    }

    public double execute(double ...operands) {
        double total=0;
        if (operands.length==1){throw new ExepressionFormatExpression("This operation needs 2 operan");}
        else if(operands.length==2) {
             total = operands[1] + operands[0];
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
