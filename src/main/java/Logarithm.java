/**
 * Created by koltsova on 14/04/2018.
 */
public class Logarithm implements Operation{
    public boolean isBinary(){
        return true;
    }
    public String getOperation(){
        return "log";
    }
    public String getDescription(){
        return" log : takes the logarithmic value of a second number with the first number being a base ";
    }
    public double execute(double ...num)
    {
        if(num.length==2){
        return (Math.log(num[0])/Math.log(num[1]));}
        else{
            throw new ExepressionFormatExpression("Wrong");
        }
    }
}
