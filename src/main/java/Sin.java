/**
 * Created by koltsova on 14/04/2018.
 */
import java.math.*;
import java.lang.Object;
public class Sin implements Operation{
    public boolean isBinary(){
        return false;
    }
    public String getOperation(){
        return "sin";
    }
    public String getDescription(){
        return"sin : takes sine of a number";
    }
    public double execute(double ...n) {
        double result = 0;
        if(n.length==1){
        for (int i = 0, j = 1, k = 1; i < 100; i++, j = j + 2, k = k * -1) {
             result = result + ((Math.pow(n[0], j) / factorial(j)) * k);}
        }
        else{
            throw new ExepressionFormatExpression("Wrong");
        }
        return result;
    }
    public int factorial(int f) {

        return ((f == 0) ? 1 : f * factorial(f - 1));

    }
}