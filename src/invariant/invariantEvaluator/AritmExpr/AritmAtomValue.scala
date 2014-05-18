package invariant.invariantEvaluator.AritmExpr

import invariant.invariantEvaluator.Parser.{InvariantParserTokenManager, InvariantParserTreeConstants,InvariantParserConstants}
import invariant.Invariant


class AritmAtomValue(strValue:String,dataType:Int,variables:Array[Invariant]) extends AritmAtom{
  var value:Double=0;
  if (dataType == InvariantParserConstants.VAR){}
  if (dataType == InvariantParserConstants.NUM){value = strValue.toDouble;}

  def getType(): Int={return VAL;}

  def evaluate:Double={
     if( dataType == InvariantParserConstants.NUM){return value};
     println("Aqui:"+(variables(strValue.replace("$","").toInt)).value);
     return (variables(strValue.replace("$","").toInt)).value
  }


}
