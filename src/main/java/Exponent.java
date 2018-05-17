/**
 * Created by koltsova on 14/04/2018.
 */
public class Exponent implements Operation{

    public boolean isBinary(){
        return true;
    }
    public String getOperation(){
        return "^";
    }
    public String getDescription(){
        return" ^ : rises the first number to the power of the second number";
    }
    public double execute(double ...operands)
    {
        if(operands.length==2){
        return (int)Math.pow(operands[1],operands[0]);}
        else {
            throw new  ExepressionFormatExpression("Wrong format");
        }
    }
}
