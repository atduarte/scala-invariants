import java.io.ByteArrayInputStream;
import java.util.Vector;

/**
 * Created by Papa Formigas on 07-04-2014.
 */
public class AST {
    Vector<String> expressions;
    Vector<SimpleNode> trees;
    Invariant parser;

    public AST() {
        trees = new Vector<SimpleNode>();
        expressions = new Vector<String>();
        parser = new Invariant(new ByteArrayInputStream("".getBytes()));

    }

    boolean parse(String string) {
        try {
            parser.ReInit(new ByteArrayInputStream(string.getBytes()));
            trees.add(parser.Inv_exp());
            expressions.add(string);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

}
