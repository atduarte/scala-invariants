package invariant.invariantEvaluator
import invariant.invariantEvaluator.Parser.{SimpleNode, InvariantParser}
import java.io.ByteArrayInputStream
;
class InvariantEvaluator(expression : String){
  var expr:String  = expression + "\n"
	var parser:InvariantParser = new InvariantParser(new ByteArrayInputStream(expr.getBytes));
  var tree:SimpleNode = parser Inv_exp;

}