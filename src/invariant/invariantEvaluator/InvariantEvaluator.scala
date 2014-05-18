package invariant.invariantEvaluator

import invariant.invariantEvaluator.Parser.{SimpleNode, InvariantParser}
import java.io.ByteArrayInputStream
import invariant.invariantEvaluator.BoolExpr.BoolExpr
import invariant.Invariant


class InvariantEvaluator(expression : String,variables:Array[Invariant]){

  var expr:String  = expression + "\n"
	var parser:InvariantParser = new InvariantParser(new ByteArrayInputStream(expr.getBytes));
  var tree:SimpleNode = parser.Inv_exp

  var nexpr:BoolExpr = new BoolExpr(tree.jjtGetChild(tree.jjtGetNumChildren()-1).asInstanceOf[SimpleNode],variables)

  def evaluate():Boolean={
    return nexpr.evaluate();
  }
}
