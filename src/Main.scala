import invariant._

object Main {
	def main(args:Array[String]) {
		var a : InvariantDouble = new InvariantDouble(10.12)
    a.restrict("$0 = {1,2,3,10} && $0 = [0, 10[")
    a.is(10)
    a.is(11)

		  println("Cheguei:" + a.value)
  }
}
