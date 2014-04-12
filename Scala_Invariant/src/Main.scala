import invariant._

object Main {
	def main() {
		var a : InvariantDouble = new InvariantDouble(10.12);
		var b : InvariantInt    = new InvariantInt(10);
		a = a+b*a;
		println("Cheguei:"+a.value );
    }
}
  