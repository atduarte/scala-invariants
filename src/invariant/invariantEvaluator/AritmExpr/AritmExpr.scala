package invariant.invariantEvaluator.AritmExpr
import invariant.invariantEvaluator.Parser.{InvariantParserTreeConstants, SimpleNode}
import java.util.Vector
import java.util.Stack;

/**
 * Created by Papa Formigas on 25-04-2014.
 */
class AritmExpr(rootNode:SimpleNode) {

  var currentNode:SimpleNode = rootNode;
  getAritm()
  var expr = moveDown(currentNode);
  println("Valor calculado:"+evaluate());

  def getAritm(){
    while(currentNode.getID != InvariantParserTreeConstants.JJTARITM){
      currentNode = currentNode.jjtGetChild(0).asInstanceOf[SimpleNode];
    }
  }

  def evaluate():Double={
    var stack:Stack[Double]=new Stack[Double];

    for(i <- 0 to expr.size-1){
      if ( expr.elementAt(i).isInstanceOf[AritmAtomOperator]){
        val second = stack.pop;
        val first  = stack.pop;
        stack push expr.elementAt(i).asInstanceOf[AritmAtomOperator].evaluate(first,second);
      }
      else {
        stack.push(expr.elementAt(i).asInstanceOf[AritmAtomValue].evaluate);
      }
    }
    return stack.pop()
  }

  def moveDown(node:SimpleNode):Vector[AritmAtom]={

    if      ( node.getID == InvariantParserTreeConstants.JJTMULTEXPR){return moveDownSumOrMult(node);}
    else if ( node.getID == InvariantParserTreeConstants.JJTSUMEXPR ){return moveDownSumOrMult(node);}
    else if ( node.getID == InvariantParserTreeConstants.JJTATOM    ){return moveDownAtom(node);}
    else if ( node.getID == InvariantParserTreeConstants.JJTARITM   ){return moveDownAritm(node);}

    return null;
  }

  def moveDownAritm(node:SimpleNode):Vector[AritmAtom]={
    //if (node.jjtGetNumChildren() == 0){return null;/*INFINITY*/}
    if (node.jjtGetNumChildren() == 1){return moveDown(node.jjtGetChild(0).asInstanceOf[SimpleNode]);}

    return null;
  }

  def moveDownSumOrMult(node:SimpleNode):Vector[AritmAtom]={

    if (node.jjtGetNumChildren() == 0){/*ERRO ARVORE INVALIDA*/}
    if (node.jjtGetNumChildren() == 1){return moveDown(node.jjtGetChild(0).asInstanceOf[SimpleNode]);}

    var expr:Vector[AritmAtom]=new Vector[AritmAtom](0);
    expr = new Vector[AritmAtom];
    var opCtr:Int = -1;

    for (i <- 0 to node.jjtGetNumChildren()-1){
      expr addAll moveDown(node.jjtGetChild(i).asInstanceOf[SimpleNode]);
      opCtr+=1;
      if ( opCtr % 2 == 1){
        expr add new AritmAtomOperator(node.operators.get(opCtr/2) );
      }
    }
    if ( opCtr % 2 == 0) {expr add new AritmAtomOperator(node.operators.lastElement());}

    return  expr;

  }

  def moveDownAtom(node:SimpleNode):Vector[AritmAtom]={
    if (node.jjtGetNumChildren() > 1 ){/*ERRO ARVORE INVALIDA*/}
    if (node.jjtGetNumChildren() == 1){return moveDown(node.jjtGetChild(0).asInstanceOf[SimpleNode]);}

    var expr:Vector[AritmAtom] = new Vector[AritmAtom];
    expr.add(new AritmAtomValue(node.numVar,node.operators.elementAt(0))) ;
    return expr;
  }
}
