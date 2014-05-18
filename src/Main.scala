import invariant._

object Main {
	def main(args:Array[String]) {
    var a : InvariantDouble = new InvariantDouble(2);
    var b : InvariantDouble = new InvariantDouble(0);
    var c : InvariantDouble = new InvariantDouble(17);
    var d : InvariantDouble = new InvariantDouble(18);
    var e : InvariantDouble = new InvariantDouble(2);
    var i : InvariantDouble = new InvariantDouble(4.5);
    i.restrict(
      "($0 = [0,10] )",a,b,c,d,e);


    i is c+2;
    i is i+1;
    i is i+1;
    println(i.value);

  }
}
  