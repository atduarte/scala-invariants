import invariant._

object Main {
	def main(args:Array[String]) {
		var a : InvariantDouble = new InvariantDouble(10.12);
		var b : InvariantInt    = new InvariantInt(10);
		a = a+b*a+10;
		println("Cheguei:"+a.value );
    }
}
  