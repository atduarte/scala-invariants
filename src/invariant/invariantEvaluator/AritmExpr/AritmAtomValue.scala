package invariant.invariantEvaluator.AritmExpr

import invariant.invariantEvaluator.Parser.{InvariantParserTokenManager, InvariantParserTreeConstants,InvariantParserConstants}
import invariant.Invariant
import scala.collection.mutable.HashMap
import invariant.invariantEvaluator.VarDecExpr.VarDecExpr


class AritmAtomValue(strValue:String,dataType:Int,variables:Array[Invariant],macros:HashMap[String,VarDecExpr]) extends AritmAtom{
  var value:Double=0;
  var key:String=null;
  if (dataType == InvariantParserConstants.VAR){}
  if (dataType == InvariantParserConstants.NUM){value = strValue.toDouble;}
  if (dataType == InvariantParserConstants.VAR_LOCAL){key = strValue;}

  def getType(): Int={return VAL;}

  def evaluate:Double={
     if( dataType == InvariantParserConstants.NUM){return value};
     if( dataType == InvariantParserConstants.VAR_LOCAL){return (macros.get(key).get.evaluate)}

    var index = strValue.replace("$","").toInt;
    var value2 = variables(index).value
    return value2
  }


}
