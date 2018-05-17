/**
 * Created by koltsova on 12/04/2018.
 */

import java.util.List;

public interface Calculator {
    double execute(List<String> expression);

    List<String> getOperationsInfo();
}
