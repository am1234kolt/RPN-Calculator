/**
 * Created by koltsova on 14/04/2018.
 */
public class SquareRoot implements Operation {

    public boolean isBinary() {
        return false;
    }

    public String getOperation() {
        return "sqrt";
    }

    public String getDescription() {
        return " sqrt : takes a square root of a number";
    }

    public double execute(double... x) {
        if (x.length == 1) {
            long low = 0;
            long high = (long) x[0];
            while (low <= high) {
                long mid = low + (high - low) / 2;
                long result = mid * mid;
                if (result == x[0]) {
                    return (int) mid;
                } else if (result > x[0]) {
                    high = mid - 1;
                } else {

                    low = mid + 1;
                }
            }
            return (double) high;
        }else{
            throw new ExepressionFormatExpression("Wrong");
        }
    }

}

