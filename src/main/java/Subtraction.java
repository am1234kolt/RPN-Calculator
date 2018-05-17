/**
 * Created by koltsova on 14/04/2018.
 */
public class Subtraction implements Operation {
    public boolean isBinary(){
        return true;
    }
    public String getOperation(){
        return "-";
    }
    public String getDescription(){
        return" - : performs subtraction of the second operand from the first";
    }

    public double execute(double ... operands) {
        double total;
        if(operands.length==2) {
            total=operands[1]-operands[0];
            if (total > Integer.MAX_VALUE) {
                throw new ArithmeticException("Integer value overflow");
            }
            if (total < Integer.MIN_VALUE) {
                throw new ArithmeticException("Integer value underflow");
            }
        }else{throw new ExepressionFormatExpression("Wrong");}
        return  total;

    }

}
