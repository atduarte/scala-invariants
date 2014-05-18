package invariant.invariantEvaluator.RangeOrSet

import invariant.invariantEvaluator.Parser.{InvariantParserConstants, InvariantParserTreeConstants, SimpleNode}
import java.util.Vector
import invariant.invariantEvaluator.AritmExpr.AritmExpr
import invariant.Invariant

class RangeOrSet(rootNode:SimpleNode,variables:Array[Invariant]) extends InvariantParserConstants with InvariantParserTreeConstants {

  var currentNode : SimpleNode = rootNode

  val isRange:Boolean = currentNode.getID == InvariantParserTreeConstants.JJTRANGE
  val isSet:  Boolean = currentNode.getID == InvariantParserTreeConstants.JJTSET

  var aritms:Vector[AritmExpr] = new Vector[AritmExpr](0);
  for (i <- 0 to currentNode.jjtGetNumChildren()-1) {
    aritms.add(new AritmExpr(currentNode.jjtGetChild(i).asInstanceOf[SimpleNode],variables));
  }







  def evaluate(newValue : Invariant):Boolean= {
    if (isRange) {
      return evaluateRange(newValue)
    } else{
      return evaluateSet(newValue)
    }
  }

  def evaluateRange(newValue: Invariant):Boolean = {
    var a = newValue > aritms.elementAt(0).evaluate()
    if (currentNode.operators.get(0).equals(InvariantParserConstants.REC_BRAC_O)) {
      a = newValue  >= aritms.elementAt(0).evaluate()
    }


    var b =  newValue < aritms.elementAt(1).evaluate()
    if (currentNode.operators.get(1).equals(InvariantParserConstants.REC_BRAC_C)) {
      b = newValue <= aritms.elementAt(1).evaluate()
    }
    return a && b
  }

  def evaluateSet(newvalue:Invariant):Boolean = {
    for (i <- 0 to aritms.size()-1) {
      if(newvalue ==  aritms.get(i).evaluate())      {return true;}
    }
    return false;
  }
}
