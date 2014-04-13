package invariant
class InvariantDouble(startValue:Double) extends Invariant{
	
		var value:Double = startValue;
		var evaluator:InvariantEvaluator= new InvariantEvaluator("{2,3} && [2,13]");
		

		// Adicao
		def +(arg:InvariantInt)    	: InvariantDouble={return new InvariantDouble(arg.value + value);}
		def +(arg:InvariantDouble) 	: InvariantDouble={return new InvariantDouble(arg.value + value);}
		def +(arg:InvariantFloat)	: InvariantDouble={return new InvariantDouble(arg.value + value);}

		def +(arg:Double) 	:  InvariantDouble={return new InvariantDouble(value + arg);}
		def +(arg:Int) 		:  InvariantDouble={return new InvariantDouble(value + arg);}
		def +(arg:Float) 	:  InvariantDouble={return new InvariantDouble(value + arg);}
		

		// Subtracao
		def -(arg:InvariantInt)    	: InvariantDouble={return new InvariantDouble(arg.value - value);}
		def -(arg:InvariantDouble) 	: InvariantDouble={return new InvariantDouble(arg.value - value);}
		def -(arg:InvariantFloat)	: InvariantDouble={return new InvariantDouble(arg.value - value);}

		def -(arg:Double) 	:  InvariantDouble={return new InvariantDouble(value - arg);}
		def -(arg:Int) 		:  InvariantDouble={return new InvariantDouble(value - arg);}
		def -(arg:Float) 	:  InvariantDouble={return new InvariantDouble(value - arg);}


		// Multiplicacao		
		def *(arg:InvariantInt)    	: InvariantDouble={return new InvariantDouble(arg.value * value);}
		def *(arg:InvariantDouble) 	: InvariantDouble={return new InvariantDouble(arg.value * value);}
		def *(arg:InvariantFloat)	: InvariantDouble={return new InvariantDouble(arg.value * value);}

		def *(arg:Double) 	:  InvariantDouble={return new InvariantDouble(value * arg);}
		def *(arg:Int) 		:  InvariantDouble={return new InvariantDouble(value * arg);}
		def *(arg:Float) 	:  InvariantDouble={return new InvariantDouble(value * arg);}
		

		// Divisao
		def /(arg:InvariantInt)   	: InvariantDouble={return new InvariantDouble(arg.value / value);}
		def /(arg:InvariantDouble)	: InvariantDouble={return new InvariantDouble(arg.value / value);}
		def /(arg:InvariantFloat)	: InvariantDouble={return new InvariantDouble(arg.value / value);}

		def /(arg:Double) 	:  InvariantDouble={return new InvariantDouble(value / arg);}
		def /(arg:Int) 		:  InvariantDouble={return new InvariantDouble(value / arg);}
		def /(arg:Float) 	:  InvariantDouble={return new InvariantDouble(value / arg);}


		// Resto Divisao Inteira
		def %(arg:InvariantInt)    	: InvariantDouble={return new InvariantDouble(arg.value % value);}
		def %(arg:InvariantDouble) 	: InvariantDouble={return new InvariantDouble(arg.value % value);}
		def %(arg:InvariantFloat) 	: InvariantDouble={return new InvariantDouble(arg.value % value);}

		def %(arg:Double) 	:  InvariantDouble={return new InvariantDouble(value % arg);}
		def %(arg:Int) 		:  InvariantDouble={return new InvariantDouble(value % arg);}
		def %(arg:Float) 	:  InvariantDouble={return new InvariantDouble(value % arg);}

		// Operador === Atribuicao de valor
		def ===(arg:InvariantDouble): 	Unit={value = (arg.value);}
		def ===(arg:InvariantFloat): 	Unit={value = (arg.value).toFloat;}
		def ===(arg:InvariantInt): 		Unit={value = (arg.value).toFloat;}

		// Operador !=
		def !=(arg:InvariantDouble) :  Boolean={return value != arg.value;}
		def !=(arg:InvariantFloat) :  Boolean={return value != arg.value;}
		def !=(arg:InvariantInt) :  Boolean={return value != arg.value;}
		def !=(arg:Double) 	:  Boolean={return value != arg;}
		def !=(arg:Int) 	:  Boolean={return value != arg;}
		def !=(arg:Float) 	:  Boolean={return value != arg;}
		
		// Operador ==
		def ==(arg:InvariantDouble) :  Boolean={return value == arg.value;}
		def ==(arg:InvariantFloat) :  Boolean={return value == arg.value;}
		def ==(arg:InvariantInt) :  Boolean={return value == arg.value;}
		def ==(arg:Double) 	:  Boolean={return value == arg;}
		def ==(arg:Int) 	:  Boolean={return value == arg;}
		def ==(arg:Float) 	:  Boolean={return value == arg;}
		
		// Operador <
		def <(arg:InvariantDouble) :  Boolean={return value < arg.value;}
		def <(arg:InvariantFloat) 	:  Boolean={return value < arg.value;}
		def <(arg:InvariantInt) 	:  Boolean={return value < arg.value;}
		def <(arg:Double) 	:  Boolean={return value < arg;}
		def <(arg:Int) 		:  Boolean={return value < arg;}
		def <(arg:Float) 	:  Boolean={return value < arg;}
		
		// Operador ==
		def <=(arg:InvariantDouble) :  Boolean={return value <= arg.value;}
		def <=(arg:InvariantFloat) :  Boolean={return value <= arg.value;}
		def <=(arg:InvariantInt) :  Boolean={return value <= arg.value;}
		def <=(arg:Double) 	:  Boolean={return value <= arg;}
		def <=(arg:Int) 	:  Boolean={return value <= arg;}
		def <=(arg:Float) 	:  Boolean={return value <= arg;}
		
		// Operador ==
		def >(arg:InvariantDouble) :  Boolean={return value > arg.value;}
		def >(arg:InvariantFloat) :  Boolean={return value > arg.value;}
		def >(arg:InvariantInt) :  Boolean={return value > arg.value;}
		def >(arg:Double) 	:  Boolean={return value > arg;}
		def >(arg:Int) 		:  Boolean={return value > arg;}
		def >(arg:Float) 	:  Boolean={return value > arg;}
		
		// Operador >=
		def >=(arg:InvariantDouble) :  Boolean={return value >= arg.value;}
		def >=(arg:InvariantFloat) :  Boolean={return value >= arg.value;}
		def >=(arg:InvariantInt) :  Boolean={return value >= arg.value;}
		def >=(arg:Double) 	:  Boolean={return value >= arg;}
		def >=(arg:Int) 	:  Boolean={return value >= arg;}
		def >=(arg:Float) 	:  Boolean={return value >= arg;}

	}

