package invariant
class InvariantInt(startValue:Int) extends Invariant{
		
		var value:Int = startValue;
		var evaluator:InvariantEvaluator= new InvariantEvaluator("{2,3} && [2,13]");
		

		// Adicao
		def +(arg:InvariantInt) 	: InvariantInt	={return new InvariantInt(arg.value + value);}
		def +(arg:InvariantDouble) 	: InvariantInt	={return new InvariantInt((arg.value + value).floor.toInt);}
		def +(arg:InvariantFloat) 	: InvariantInt	={return new InvariantInt((arg.value + value).floor.toInt);}

		def +(arg:Int) 		: InvariantInt	={return new InvariantInt(value + arg);}
		def +(arg:Double) 	: InvariantInt	={return new InvariantInt((value + arg).floor.toInt);}
		def +(arg:Float) 	: InvariantInt	={return new InvariantInt((value + arg).floor.toInt);}
		

		// Subtracao
		def -(arg:InvariantInt) 	: InvariantInt	={return new InvariantInt(arg.value - value);}
		def -(arg:InvariantDouble) 	: InvariantInt	={return new InvariantInt((arg.value - value).floor.toInt);}
		def -(arg:InvariantFloat) 	: InvariantInt	={return new InvariantInt((arg.value - value).floor.toInt);}

		def -(arg:Int) 		: InvariantInt	={return new InvariantInt(value - arg);}
		def -(arg:Double) 	: InvariantInt	={return new InvariantInt((value - arg).floor.toInt);}
		def -(arg:Float) 	: InvariantInt	={return new InvariantInt((value - arg).floor.toInt);}
		

		// Multiplicacao 
		def *(arg:InvariantInt) 	: InvariantInt	={return new InvariantInt(arg.value * value);}
		def *(arg:InvariantDouble) 	: InvariantInt	={return new InvariantInt((arg.value * value).floor.toInt);}
		def *(arg:InvariantFloat) 	: InvariantInt	={return new InvariantInt((arg.value * value).floor.toInt);}

		def *(arg:Int) 		: InvariantInt	={return new InvariantInt(value * arg);}
		def *(arg:Double) 	: InvariantInt	={return new InvariantInt((value * arg).floor.toInt);}
		def *(arg:Float) 	: InvariantInt	={return new InvariantInt((value * arg).floor.toInt);}
		

		// Divisao
		def /(arg:InvariantInt) 	: InvariantInt	={return new InvariantInt(arg.value / value);}
		def /(arg:InvariantDouble) 	: InvariantInt	={return new InvariantInt((arg.value / value).floor.toInt);}
		def /(arg:InvariantFloat) 	: InvariantInt	={return new InvariantInt((arg.value / value).floor.toInt);}

		def /(arg:Int) 		: InvariantInt	={return new InvariantInt(value / arg);}
		def /(arg:Double) 	: InvariantInt	={return new InvariantInt((value / arg).floor.toInt);}
		def /(arg:Float) 	: InvariantInt	={return new InvariantInt((value / arg).floor.toInt);}


		// Resto Divisao Inteira
		def %(arg:InvariantInt) 	: InvariantInt	={return new InvariantInt(arg.value % value);}
		def %(arg:InvariantDouble) 	: InvariantInt	={return new InvariantInt((arg.value % value).floor.toInt);}
		def %(arg:InvariantFloat) 	: InvariantInt	={return new InvariantInt((arg.value % value).floor.toInt);}

		def %(arg:Int) 		: InvariantInt	={return new InvariantInt(value % arg);}
		def %(arg:Double) 	: InvariantInt	={return new InvariantInt((value % arg).floor.toInt);}
		def %(arg:Float) 	: InvariantInt	={return new InvariantInt((value % arg).floor.toInt);}
		
		
		// Operador !=
		// Nao faz sentido compara com InvariantDouble or InvariantFloat pois sao tipos diferentes. Warning(?)
		def !=(arg:InvariantInt):  Boolean={return value != arg.value;}
		def !=(arg:Double) 		:  Boolean={return value != arg;}
		def !=(arg:Int) 		:  Boolean={return value != arg;}
		def !=(arg:Float) 		:  Boolean={return value != arg;}
		

		// Operador ==
		// Nao faz sentido compara com InvariantDouble or InvariantFloat pois sao tipos diferentes.
		def ==(arg:InvariantInt):  Boolean={return value == arg.value;}
		def ==(arg:Double) 		:  Boolean={return value == arg;}
		def ==(arg:Int) 		:  Boolean={return value == arg;}
		def ==(arg:Float) 		:  Boolean={return value == arg;}

		// Operador === Atribuicao de valor
		def ===(arg:InvariantDouble): 	Unit={value = (arg.value).toInt;}
		def ===(arg:InvariantFloat): 	Unit={value = (arg.value).toInt;}
		def ===(arg:InvariantInt): 		Unit={value = arg.value;}
		
		// Operador <
		def <(arg:InvariantInt):  		Boolean={return value < arg.value;}
		def <(arg:InvariantDouble):		Boolean={return value < arg.value.toInt;}
		def <(arg:InvariantFloat):  	Boolean={return value < arg.value.toInt;}
		def <(arg:Double) 		:  Boolean={return value < arg;}
		def <(arg:Int) 			:  Boolean={return value < arg;}
		def <(arg:Float) 		:  Boolean={return value < arg;}
		
		// Operador <=
		def <=(arg:InvariantInt):  		Boolean={return value <= arg.value;}
		def <=(arg:InvariantDouble):	Boolean={return value <= arg.value.toInt;}
		def <=(arg:InvariantFloat):  	Boolean={return value <= arg.value.toInt;}
		def <=(arg:Double) 		:  Boolean={return value <= arg;}
		def <=(arg:Int) 		:  Boolean={return value <= arg;}
		def <=(arg:Float) 		:  Boolean={return value <= arg;}
			
		// Operador >
		def >(arg:InvariantInt):  		Boolean={return value > arg.value;}
		def >(arg:InvariantDouble):		Boolean={return value > arg.value.toInt;}
		def >(arg:InvariantFloat):  	Boolean={return value > arg.value.toInt;}
		def >(arg:Double) 		:  Boolean={return value > arg;}
		def >(arg:Int) 			:  Boolean={return value > arg;}
		def >(arg:Float) 		:  Boolean={return value > arg;}
		
		// Operador >=
		def >=(arg:InvariantInt):  		Boolean={return value >= arg.value;}
		def >=(arg:InvariantDouble):	Boolean={return value >= arg.value.toInt;}
		def >=(arg:InvariantFloat):  	Boolean={return value >= arg.value.toInt;}
		def >=(arg:Double) 		:  Boolean={return value >= arg;}
		def >=(arg:Int) 		:  Boolean={return value >= arg;}
		def >=(arg:Float) 		:  Boolean={return value >= arg;}
}