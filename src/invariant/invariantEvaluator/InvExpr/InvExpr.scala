package invariant.invariantEvaluator.InvExpr

import invariant.invariantEvaluator.Parser.{InvariantParserConstants, InvariantParserTreeConstants, SimpleNode}
import java.util.Vector
import invariant.invariantEvaluator.AritmExpr.{AritmAtomValue, AritmAtomOperator, AritmAtom}

/**
 * Created by atduarte on 15/05/2014.
 */
class InvExpr(rootNode:SimpleNode) {

  var currentNode:SimpleNode = rootNode
  var expr : Vector[InvAtom] = moveDown(currentNode)

  def moveDown(node : SimpleNode) : Vector[InvAtom] = {

    if      (node.getID == InvariantParserTreeConstants.JJTOREXPR ){return moveDownOrAnd(node, InvariantParserConstants.OR);}
    else if (node.getID == InvariantParserTreeConstants.JJTANDEXPR){return moveDownOrAnd(node, InvariantParserConstants.AND);}
    else if (node.getID == InvariantParserTreeConstants.JJTATOMINV){return moveDownAtom(node);}

    null
  }

  def moveDownOrAnd(node : SimpleNode, name : Int) : Vector[InvAtom] = {
    if (node.jjtGetNumChildren() == 0){/*ERRO ARVORE INVALIDA*/return null}
    if (node.jjtGetNumChildren() == 1){return moveDown(node.jjtGetChild(0).asInstanceOf[SimpleNode]);}

    var expr:Vector[InvAtom]=new Vector[InvAtom](0);
    var opCtr:Int = -1;

    for (i <- 0 to node.jjtGetNumChildren()-1){
      expr addAll moveDown(node.jjtGetChild(i).asInstanceOf[SimpleNode]);
      opCtr+=1
      if ( opCtr % 2 == 1){
        expr add new InvAtomOperator(name);
      }
    }
    if ( opCtr % 2 == 0) {expr add new InvAtomOperator(name);}

    return  expr;
  }

  def moveDownAtom(node : SimpleNode) : Vector[InvAtom] = {
    if (node.jjtGetNumChildren() > 2 ){/*ERRO ARVORE INVALIDA*/}

    if (node.jjtGetNumChildren() == 1) {
      return moveDown(node.jjtGetChild(0).asInstanceOf[SimpleNode]);
    }

    if (node.jjtGetNumChildren() == 2) {
      var expr:Vector[InvAtom]=new Vector[InvAtom](0);
      expr.add(new InvAtomRangeOrSet());
      return expr;
    }

    return null
  }

}
