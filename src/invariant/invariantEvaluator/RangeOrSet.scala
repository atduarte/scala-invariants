package invariant.invariantEvaluator

import invariant.invariantEvaluator.Parser.{InvariantParserConstants, InvariantParserTreeConstants, SimpleNode}
import java.util.Vector
import invariant.invariantEvaluator.AritmExpr.AritmExpr

class RangeOrSet(rootNode:SimpleNode) extends InvariantParserConstants {

  var currentNode : SimpleNode = rootNode

  // A tirar
  while(currentNode.getID != InvariantParserTreeConstants.JJTRANGE &&
        currentNode.getID != InvariantParserTreeConstants.JJTSET) {
    currentNode = currentNode.jjtGetChild(0).asInstanceOf[SimpleNode]
  }

  val isRange:Boolean = currentNode.getID != InvariantParserTreeConstants.JJTRANGE
  val isSet:Boolean = currentNode.getID != InvariantParserTreeConstants.JJTSET

  var aritms:Vector[AritmExpr] = new Vector[AritmExpr](0);
  for (i <- 0 to currentNode.jjtGetNumChildren()-1) {
    aritms.add(new AritmExpr(currentNode.jjtGetChild(i).asInstanceOf[SimpleNode]));
  }

  def evaluate(newvalue : Double):Boolean= {
    if (isRange) {
      return evaluateRange(newvalue)
    } else{
      return evaluateSet(newvalue)
    }
  }

  def evaluateRange(newvalue: Double):Boolean = {
    var a = aritms.elementAt(0).evaluate() >= newvalue
    if (currentNode.operators.get(0).equals(8)) {
      a = aritms.elementAt(0).evaluate() > newvalue
    }

    var b = aritms.elementAt(1).evaluate() >= newvalue
    if (currentNode.operators.get(1).equals(8)) {
      b = aritms.elementAt(1).evaluate() > newvalue
    }

    return a && b
  }

  def evaluateSet(newvalue:Double):Boolean = {
    return false
  }
}
