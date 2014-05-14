package invariant

import invariant.invariantEvaluator.InvariantEvaluator

class InvariantDouble(startValue:Double) {

		var value:Double = startValue;
		var evaluator:InvariantEvaluator= new InvariantEvaluator("" +
      "var a = 2"+
      "var b = $0 + 32"+
      "var c = $1 + 12"+
      "$0={-2,-2*+(2*-3),6} && " +
      "( $0=]12+34,$1] || $1 = ]15,30] )");



		def +(arg:InvariantInt)    : InvariantDouble={return new InvariantDouble(arg.value + value);}
		def +(arg:InvariantDouble) : InvariantDouble={return new InvariantDouble(arg.value + value);}
		def +(arg:Double) 	:  InvariantDouble={return new InvariantDouble(value + arg);}
		def +(arg:Int) 		:  InvariantDouble={return new InvariantDouble(value + arg);}
		def +(arg:Float) 	:  InvariantDouble={return new InvariantDouble(value + arg);}

		def -(arg:InvariantInt)    : InvariantDouble={return new InvariantDouble(arg.value - value);}
		def -(arg:InvariantDouble) : InvariantDouble={return new InvariantDouble(arg.value - value);}
		def -(arg:Double) 	:  InvariantDouble={return new InvariantDouble(value - arg);}
		def -(arg:Int) 		:  InvariantDouble={return new InvariantDouble(value - arg);}
		def -(arg:Float) 	:  InvariantDouble={return new InvariantDouble(value - arg);}

		def *(arg:InvariantInt)    : InvariantDouble={return new InvariantDouble(arg.value * value);}
		def *(arg:InvariantDouble) : InvariantDouble={return new InvariantDouble(arg.value * value);}
		def *(arg:Double) 	:  InvariantDouble={return new InvariantDouble(value * arg);}
		def *(arg:Int) 		:  InvariantDouble={return new InvariantDouble(value * arg);}
		def *(arg:Float) 	:  InvariantDouble={return new InvariantDouble(value * arg);}

		def /(arg:InvariantInt)    : InvariantDouble={return new InvariantDouble(arg.value / value);}
		def /(arg:InvariantDouble) : InvariantDouble={return new InvariantDouble(arg.value / value);}
		def /(arg:Double) 	:  InvariantDouble={return new InvariantDouble(value / arg);}
		def /(arg:Int) 		:  InvariantDouble={return new InvariantDouble(value / arg);}
		def /(arg:Float) 	:  InvariantDouble={return new InvariantDouble(value / arg);}

		def %(arg:InvariantInt)    : InvariantDouble={return new InvariantDouble(arg.value % value);}
		def %(arg:InvariantDouble) : InvariantDouble={return new InvariantDouble(arg.value % value);}
		def %(arg:Double) 	:  InvariantDouble={return new InvariantDouble(value % arg);}
		def %(arg:Int) 		:  InvariantDouble={return new InvariantDouble(value % arg);}
		def %(arg:Float) 	:  InvariantDouble={return new InvariantDouble(value % arg);}

		def !=(arg:InvariantInt) 	:  Boolean={return value != arg.value;}
		def !=(arg:InvariantDouble) :  Boolean={return value != arg.value;}
		def !=(arg:Double) 	:  Boolean={return value != arg;}
		def !=(arg:Int) 	:  Boolean={return value != arg;}
		def !=(arg:Float) 	:  Boolean={return value != arg;}

		def ==(arg:InvariantInt) 	:  Boolean={return value == arg.value;}
		def ==(arg:InvariantDouble) :  Boolean={return value == arg.value;}
		def ==(arg:Double) 	:  Boolean={return value == arg;}
		def ==(arg:Int) 	:  Boolean={return value == arg;}
		def ==(arg:Float) 	:  Boolean={return value == arg;}

		def <(arg:InvariantInt)    :  Boolean={return value < arg.value;}
		def <(arg:InvariantDouble) :  Boolean={return value < arg.value;}
		def <(arg:Double) 	:  Boolean={return value < arg;}
		def <(arg:Int) 		:  Boolean={return value < arg;}
		def <(arg:Float) 	:  Boolean={return value < arg;}

		def <=(arg:InvariantInt) 	:  Boolean={return value <= arg.value;}
		def <=(arg:InvariantDouble) :  Boolean={return value <= arg.value;}
		def <=(arg:Double) 	:  Boolean={return value <= arg;}
		def <=(arg:Int) 	:  Boolean={return value <= arg;}
		def <=(arg:Float) 	:  Boolean={return value <= arg;}

		def >(arg:InvariantInt)    :  Boolean={return value > arg.value;}
		def >(arg:InvariantDouble) :  Boolean={return value > arg.value;}
		def >(arg:Double) 	:  Boolean={return value > arg;}
		def >(arg:Int) 		:  Boolean={return value > arg;}
		def >(arg:Float) 	:  Boolean={return value > arg;}

		def >=(arg:InvariantInt) 	:  Boolean={return value >= arg.value;}
		def >=(arg:InvariantDouble) :  Boolean={return value >= arg.value;}
		def >=(arg:Double) 	:  Boolean={return value >= arg;}
		def >=(arg:Int) 	:  Boolean={return value >= arg;}
		def >=(arg:Float) 	:  Boolean={return value >= arg;}
	}

