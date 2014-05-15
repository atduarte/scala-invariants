package invariant.invariantEvaluator.InvExpr

/**
 * Created by atduarte on 15/05/2014.
 */
class InvAtomOperator(name:Int) extends InvAtom {
  var operator = name

  def getType():Int = {
    return OPR
  }
}
