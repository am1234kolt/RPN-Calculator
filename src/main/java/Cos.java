/**
 * Created by koltsova on 14/04/2018.
 */
public class Cos implements Operation {
    public boolean isBinary() {
        return false;
    }

    public String getOperation() {
        return "cos";
    }

    public String getDescription() {
        return "cos : takes cosine of a number";
    }

    public double execute(double ... n) {
        if(n.length==1){
            return Math.cos(n[0]);
        } else {
            throw new ExepressionFormatExpression("Wrong format");
    }

    }
}
