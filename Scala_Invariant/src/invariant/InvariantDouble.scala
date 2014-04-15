package invariant

import invariant.invariantEvaluator.{InvariantInterface, InvariantEvaluator}

class InvariantDouble(startValue:Double) extends InvariantInterface{
	
		var value:Double = startValue;
		var evaluator:InvariantEvaluator= new InvariantEvaluator("{2,3} && [2,13]");
		
		
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

