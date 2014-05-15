package invariant.invariantEvaluator.InvExpr

/**
 * Created by atduarte on 15/05/2014.
 */
abstract class InvAtom {
  val OPR:Int =0 ;
  val VAR:Int =1 ;
  val RANGEORSET:Int =2 ;

  def getType():Int;
}
