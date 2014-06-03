import invariant._
import java.util.Scanner

object Main {
  def main(args: Array[String]) {



    var input: InvariantDouble = new InvariantDouble(2);
    var x1:InvariantDouble = new InvariantDouble(2);
    var x2:InvariantDouble = new InvariantDouble(1);


    var b:InvariantDouble = new InvariantDouble(2);
    input.restrict("" +
      "var a=2^2+4;\n" +
      "var b=2+3+a;\n"+
      "var c=2;\n"+
      "c=]$0,2^2+$1-b[ && b={2,3,5}\n",b);







  }
}