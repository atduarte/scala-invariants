package invariant.invariantEvaluator.VarDecExpr

import invariant.invariantEvaluator.Parser.SimpleNode
import invariant.Invariant
import invariant.invariantEvaluator.AritmExpr.AritmExpr
import scala.collection.mutable.HashMap


class VarDecExpr(node:SimpleNode,variables:Array[Invariant],macros:HashMap[String,VarDecExpr]) {
    var variable:String = node.numVar;
    var aritm:AritmExpr = new AritmExpr(node.jjtGetChild(0).asInstanceOf[SimpleNode],variables,macros);

    def evaluate:Double={
      aritm.evaluate();
    }
}
