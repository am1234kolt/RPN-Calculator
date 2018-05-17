import java.util.Map;

/**
 * Created by koltsova on 14/04/2018.
 */
public class Exp implements Operation{
    public boolean isBinary() {
        return false;
    }

    public String getOperation() {
        return "exp";
    }

    public String getDescription() {
        return "exp : raises the e number to the power of an entered number";
    }

    public double execute(double ...val) {
        if(val.length==1){
            return Math.exp(val[0]);
        } else {
            throw new ExepressionFormatExpression("Wrong format");
        }

    }


}
