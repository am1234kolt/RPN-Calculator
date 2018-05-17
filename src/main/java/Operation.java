/**
 * Created by koltsova on 07/04/2018.
 */
public interface Operation {
    boolean     isBinary      ();
    String      getOperation  ();
    String      getDescription();
    double      execute       (double ... operands);
}
