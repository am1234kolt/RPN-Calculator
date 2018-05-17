import java.util.ArrayList;
import java.util.List;

/**
 * Created by koltsova on 12/04/2018.
 */
import java.util.Stack;
public class RPNCalculator implements Calculator {
     static List<Operation> operations = new ArrayList<>();


public RPNCalculator(){}

   public  boolean addOperation( Operation operation) {
       if(operations.contains(operation)){
           return false;
       }else{
           operations.add(operation);
           return true;
       }
   }

    boolean removeOperation(String operator){
        for(Operation op: operations) {
            if (op.getOperation().equals(operator)) {
                operations.remove(op);
                return true;
            }
        }
        return false;
    }
   public double execute(List<String> expression) {
            Stack<Double> stack = new Stack<>();
        for (String str : expression) {
            if (operations.stream().noneMatch(o -> o.getOperation().equals(str))){
                stack.push(Double.valueOf(str));
            }
            else if(operations.stream().anyMatch(o -> o.getOperation().equals(str))){
                for (Operation op : operations) {
                    if (op.getOperation().equals(str)) {
                        if (op.isBinary()) {
                            stack.push(op.execute(stack.pop(), stack.pop()));
                        }
                        if (!op.isBinary()) {
                            stack.push(op.execute(stack.pop()));

                        }
                    }
                }
            }
        }

        return stack.pop();
    }
    boolean supportsOperation(String operator) {
       for(Operation op:operations) {
           if (op.getOperation().equals(operator)) {
               return true;
           }
       }
       return false;
    }
    public List<String> getOperationsInfo(){
        List<String> info = new ArrayList<>();
       for (Operation o: operations){
           info.add(o.getDescription());
       }
       return info;
    }
    static public  List<String> getOperators(){
        List<String> info = new ArrayList<>();
        for (Operation o: operations){
            info.add(o.getOperation());
        }
        return info;
    }
}

