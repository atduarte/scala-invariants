package invariant.invariantEvaluator

import invariant.invariantEvaluator.Parser.{InvariantParserConstants, InvariantParserTreeConstants, SimpleNode}
import java.util.Vector
import invariant.invariantEvaluator.AritmExpr.AritmExpr

class RangeOrSet(rootNode:SimpleNode) extends InvariantParserConstants with InvariantParserTreeConstants {

  var currentNode : SimpleNode = rootNode

  // A tirar
  currentNode = currentNode.jjtGetChild(currentNode.jjtGetNumChildren()-1).asInstanceOf[SimpleNode]
  while(currentNode.getID != InvariantParserTreeConstants.JJTRANGE &&
        currentNode.getID != InvariantParserTreeConstants.JJTSET) {
    currentNode = currentNode.jjtGetChild(0).asInstanceOf[SimpleNode]
  }

  val isRange:Boolean = currentNode.getID == InvariantParserTreeConstants.JJTRANGE
  val isSet:Boolean = currentNode.getID == InvariantParserTreeConstants.JJTSET

  var aritms:Vector[AritmExpr] = new Vector[AritmExpr](0);
  for (i <- 0 to currentNode.jjtGetNumChildren()-1) {
    aritms.add(new AritmExpr(currentNode.jjtGetChild(i).asInstanceOf[SimpleNode]));
  }
  println("8 ");
  println(evaluate(-1))
  println("2 ");
  println(evaluate(-2))
  println("13")
  println(evaluate(13))
  println("14");
  println(evaluate(14))
  println("0 ");
  println(evaluate(0))


  def evaluate(newvalue : Double):Boolean= {
    if (isRange) {
      return evaluateRange(newvalue)
    } else{
      return evaluateSet(newvalue)
    }
  }

  def evaluateRange(newvalue: Double):Boolean = {
    var a = aritms.elementAt(0).evaluate() < newvalue
    if (currentNode.operators.get(0).equals(InvariantParserConstants.REC_BRAC_O)) {
      a = aritms.elementAt(0).evaluate() <= newvalue
    }


    var b = aritms.elementAt(1).evaluate() > newvalue
    if (currentNode.operators.get(1).equals(InvariantParserConstants.REC_BRAC_C)) {
      b = aritms.elementAt(1).evaluate() >= newvalue
    }
    return a && b
  }

  def evaluateSet(newvalue:Double):Boolean = {
    for (i <- 0 to aritms.size()-1) {
      if(aritms.get(i).evaluate().equals(newvalue))      {return true;}
    }
    return false;
  }
}
