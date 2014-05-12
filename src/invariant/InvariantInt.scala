package invariant

import invariant.invariantEvaluator.InvariantEvaluator

class InvariantInt(startValue:Int) {

		var value:Int = startValue;
		var evaluator:InvariantEvaluator= new InvariantEvaluator("$0=[2,13]");

		def +(arg:InvariantInt) : InvariantInt	={return new InvariantInt(arg.value + value);}
		def +(arg:Double) 		: InvariantDouble={return new InvariantDouble(value + arg);}
		def +(arg:Int) 			: InvariantInt	={return new InvariantInt(value + arg);}
		def +(arg:Float) 		: InvariantFloat={return new InvariantFloat(value + arg);}


		def -(arg:InvariantInt) : InvariantInt	={return new InvariantInt(arg.value - value);}
		def -(arg:Double) 		: InvariantDouble={return new InvariantDouble(value - arg);}
		def -(arg:Int) 			: InvariantInt	={return new InvariantInt(value - arg);}
		def -(arg:Float) 		: InvariantFloat={return new InvariantFloat(value - arg);}


		def *(arg:InvariantInt) : InvariantInt	={return new InvariantInt(arg.value * value);}
		def *(arg:InvariantDouble): InvariantDouble	={return new InvariantDouble(arg.value * value);}
		def *(arg:Double) 		: InvariantDouble={return new InvariantDouble(value * arg);}
		def *(arg:Int) 			: InvariantInt	={return new InvariantInt(value * arg);}
		def *(arg:Float) 		: InvariantFloat={return new InvariantFloat(value * arg);}

		def /(arg:InvariantInt) : InvariantInt	={return new InvariantInt(arg.value / value);}
		def /(arg:Double) 		: InvariantDouble={return new InvariantDouble(value / arg);}
		def /(arg:Int) 			: InvariantInt	={return new InvariantInt(value / arg);}
		def /(arg:Float) 		: InvariantFloat={return new InvariantFloat(value / arg);}

		def %(arg:InvariantInt) : InvariantInt	={return new InvariantInt(arg.value % value);}
		def %(arg:Double) 		: InvariantDouble={return new InvariantDouble(value % arg);}
		def %(arg:Int) 			: InvariantInt	={return new InvariantInt(value % arg);}
		def %(arg:Float) 		: InvariantFloat={return new InvariantFloat(value % arg);}


		def !=(arg:InvariantInt):  Boolean={return value != arg.value;}
		def !=(arg:Double) 		:  Boolean={return value != arg;}
		def !=(arg:Int) 		:  Boolean={return value != arg;}
		def !=(arg:Float) 		:  Boolean={return value != arg;}

		def ==(arg:InvariantInt):  Boolean={return value == arg.value;}
		def ==(arg:Double) 		:  Boolean={return value == arg;}
		def ==(arg:Int) 		:  Boolean={return value == arg;}
		def ==(arg:Float) 		:  Boolean={return value == arg;}

		def <(arg:InvariantInt) :  Boolean={return value < arg.value;}
		def <(arg:Double) 		:  Boolean={return value < arg;}
		def <(arg:Int) 			:  Boolean={return value < arg;}
		def <(arg:Float) 		:  Boolean={return value < arg;}

		def <=(arg:InvariantInt):  Boolean={return value <= arg.value;}
		def <=(arg:Double) 		:  Boolean={return value <= arg;}
		def <=(arg:Int) 		:  Boolean={return value <= arg;}
		def <=(arg:Float) 		:  Boolean={return value <= arg;}

		def >(arg:InvariantInt) :  Boolean={return value > arg.value;}
		def >(arg:Double) 		:  Boolean={return value > arg;}
		def >(arg:Int) 			:  Boolean={return value > arg;}
		def >(arg:Float) 		:  Boolean={return value > arg;}

		def >=(arg:InvariantInt):  Boolean={return value >= arg.value;}
		def >=(arg:Double) 		:  Boolean={return value >= arg;}
		def >=(arg:Int) 		:  Boolean={return value >= arg;}
		def >=(arg:Float) 		:  Boolean={return value >= arg;}
}
