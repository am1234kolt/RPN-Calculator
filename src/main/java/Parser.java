import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.lang.Character;
import java.util.*;
import java.lang.Object;

import java.math.BigDecimal;

//import org.apache.commons.lang.math.NumberUtils;
/**
 * Created by koltsova on 12/04/2018.
 */
public class Parser {
    private List<String> operators = RPNCalculator.getOperators();

    public Parser(List<String> operators) {
       this.operators =operators;
    }


    public List<String> parse(String command) {
        double value ;
        List<String> str= new ArrayList<>();
            StringTokenizer st = new StringTokenizer(command);
            while(st.hasMoreTokens()){
                String s = st.nextToken();
                if ( isNumber(s)!=null || operators.contains(s)){
                str.add(s);}
                else{
                    throw new ExepressionFormatExpression("Wrong format");
                }
            }
        return str;
        }

    public Double isNumber(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}