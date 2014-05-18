package invariant.invariantEvaluator

import invariant.invariantEvaluator.Parser.{SimpleNode, InvariantParser}
import java.io.ByteArrayInputStream
import invariant.invariantEvaluator.BoolExpr.BoolExpr
import invariant.Invariant
import invariant.invariantEvaluator.VarDecExpr.VarDecExpr
import scala.collection.mutable.HashMap


class InvariantEvaluator(expression : String,variables:Array[Invariant]){

  var expr:String  = expression + "\n"
	var parser:InvariantParser = new InvariantParser(new ByteArrayInputStream(expr.getBytes));
  var tree:SimpleNode = parser.Inv_exp
  var macros:HashMap[String,VarDecExpr]=new HashMap[String,VarDecExpr];

  for (i<-0 to tree.jjtGetNumChildren()-2){
    var temp = new VarDecExpr(tree.jjtGetChild(i).asInstanceOf[SimpleNode],variables,macros);
    macros.put(temp.variable,temp);
  }
  var nexpr:BoolExpr = new BoolExpr(tree.jjtGetChild(tree.jjtGetNumChildren()-1).asInstanceOf[SimpleNode],variables,macros)

  def evaluate():Boolean={
    return nexpr.evaluate();
  }
}
