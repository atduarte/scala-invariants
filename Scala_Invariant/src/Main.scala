import invariant._

object Main {
	def main(args: Array[String]) {

		var a : InvariantDouble = new InvariantDouble(10);
		var b : InvariantInt    = new InvariantInt(10);
		var c : InvariantInt 	= new InvariantInt(20);
		var d : InvariantFloat  = new InvariantFloat(5.2f);
		

		println("Operadores Doubles")
		println((a > d));
		println((a <= c ));
		println((a > 3.14));
		println();

		println("Operadores Float")
		println((d > d));
		println((d <= c ));
		println((d < 3.14));
		println();

		println("Operadores Int")
		println((b == a));
		println((b >= c ));
		println((b > 3.14));

	}
}
