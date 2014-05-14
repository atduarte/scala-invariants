package invariant.invariantEvaluator.AritmExpr

import invariant.invariantEvaluator.Parser.{InvariantParserTokenManager, InvariantParserTreeConstants,InvariantParserConstants}

/**
 * Created by Papa Formigas on 25-04-2014.
 */
class AritmAtomValue(strValue:String,dataType:Int) extends AritmAtom{
  var value:Double=0;
  if (dataType == InvariantParserConstants.VAR){}
  if (dataType == InvariantParserConstants.NUM){value = strValue.toDouble;}

  def getType(): Int={return VAL;}

  def evaluate:Double={
     return value;
  }


}
