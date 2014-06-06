import invariant._
import invariant.invariantEvaluator.Exceptions._
import java.util.Scanner

object Main {
  def test(){
    var x1:InvariantDouble = new InvariantDouble(2);
    var x2:InvariantDouble = new InvariantDouble(2);
    var x3:InvariantDouble = new InvariantDouble(2);
    var x4:InvariantDouble = new InvariantDouble(2);
    var x5:InvariantDouble = new InvariantDouble(2);
    var x6:InvariantDouble = new InvariantDouble(2);

    x1.restrict("" +
      "var a = $1;" +
      "var b = $2;" +
      "$0=]@inf,2014]",x1,x2,x3,x4,x5,x6);

    x2.restrict("" +
      "var c = 2;" +
      "($0=[-2,10] && $0=]@inf,2] ) && $0 = {-1,0,1}");
    try {
      x3.restrict("" +
        "var a = $1;" +
        "var b = $2;")
    }catch{
      case e:InvariantExceptionSyntax => println("1-Esperado");
    }

    x4.restric("" +
      ""
    )













  }
  def main(args: Array[String]) {

    test();
}
}