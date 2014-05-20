import invariant._
import java.util.Scanner

object Main {
  def main(args: Array[String]) {


    /*Demos - 0-100*/
    var input: InvariantDouble = new InvariantDouble(1);
    input.restrict("" +
      "var a=$0+$1;\n" +
      "$0=[$0,a] \n" +
      "");
   // var scan: Scanner = new java.util.Scanner(System.in)
    //input.evaluator.evaluate();
    input is 1.5





  }
}