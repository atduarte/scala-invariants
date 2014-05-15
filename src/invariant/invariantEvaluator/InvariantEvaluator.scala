package invariant.invariantEvaluator

import invariant.invariantEvaluator.Parser.{SimpleNode, InvariantParser}
import java.io.ByteArrayInputStream
import java.util.Vector
import AritmExpr.AritmExpr
import invariant.InvariantDouble
import invariant.invariantEvaluator.RangeOrSet

class InvariantEvaluator(expression : String) {

  var expr:String  = expression + "\n"

	var parser:InvariantParser = new InvariantParser(new ByteArrayInputStream(expr.getBytes));
  var tree:SimpleNode = parser.Inv_exp

  //var aritm:AritmExpr = new AritmExpr(tree)
  var range:RangeOrSet = new RangeOrSet(tree)


  def evaluate(value:Double) {
    println("Avalia")
  }
}
