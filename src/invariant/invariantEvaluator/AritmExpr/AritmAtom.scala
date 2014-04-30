package invariant.invariantEvaluator.AritmExpr

/**
 * Created by Papa Formigas on 25-04-2014.
 */
abstract class AritmAtom {
 val OPR:Int =0 ;
 val VAL:Int =1 ;
 val VAR:Int =2 ;

  def getType():Int;
}
