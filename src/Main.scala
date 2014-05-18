import invariant._

object Main {
	def main(args:Array[String]) {
    var a : InvariantDouble = new InvariantDouble(2);
    var b : InvariantDouble = new InvariantDouble(0);
    var c : InvariantDouble = new InvariantDouble(17);
    var d : InvariantDouble = new InvariantDouble(18);
    var e : InvariantDouble = new InvariantDouble(2);
    var i : InvariantDouble = new InvariantDouble(3);
    i.restrict(
        "var a = d;" +
        "var b = 3;" +
        "var c = 4;" +
        "var d = (12);" +
        "($0 = [a,10] )",a,b,c,d,e);

  println (i.evaluator.evaluate());
  //  i is 0;
  //  i is i+1;
  //  i is i+1;
  //  println(i.value);

  }
}
  