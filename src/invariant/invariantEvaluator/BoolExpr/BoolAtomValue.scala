package invariant.invariantEvaluator.BoolExpr

import invariant.invariantEvaluator.RangeOrSet.RangeOrSet
import invariant.invariantEvaluator.Parser.SimpleNode
import invariant.Invariant


class BoolAtomValue(strVar:String,neg:Boolean,ros:SimpleNode,variables:Array[Invariant]) extends BoolAtom{

  var rangeOrSet:RangeOrSet = new RangeOrSet(ros,variables)
  var negate:Boolean = neg;
  var variableString:String = strVar;
  variableString=variableString.replace("$","");
  var variable = variables(variableString.toInt);

  def getType(): Int={return VAL;}

  def evaluate:Boolean={
    if (negate){return !rangeOrSet.evaluate(variable);}
    return rangeOrSet.evaluate(variable)
  }
}
