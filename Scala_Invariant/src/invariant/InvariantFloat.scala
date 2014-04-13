package invariant
class InvariantFloat(startValue:Float) {

		var value:Float = startValue;

		// Adicao
		def +(arg:InvariantInt)    	: InvariantFloat={return new InvariantFloat(arg.value + value);}
		def +(arg:InvariantDouble) 	: InvariantFloat={return new InvariantFloat((arg.value + value).toFloat);}
		def +(arg:InvariantFloat)	: InvariantFloat={return new InvariantFloat(arg.value + value);}

		def +(arg:Double) 	:  InvariantFloat={return new InvariantFloat((value + arg).toFloat);}
		def +(arg:Int) 		:  InvariantFloat={return new InvariantFloat(value + arg);}
		def +(arg:Float) 	:  InvariantFloat={return new InvariantFloat(value + arg);}
		

		// Subtracao
		def -(arg:InvariantInt)    	: InvariantFloat={return new InvariantFloat(arg.value - value);}
		def -(arg:InvariantDouble) 	: InvariantFloat={return new InvariantFloat((arg.value - value).toFloat);}
		def -(arg:InvariantFloat)	: InvariantFloat={return new InvariantFloat(arg.value - value);}

		def -(arg:Double) 	:  InvariantFloat={return new InvariantFloat((value - arg).toFloat);}
		def -(arg:Int) 		:  InvariantFloat={return new InvariantFloat(value - arg);}
		def -(arg:Float) 	:  InvariantFloat={return new InvariantFloat(value - arg);}

		// Multiplicacao		
		def *(arg:InvariantInt)    	: InvariantFloat={return new InvariantFloat(arg.value * value);}
		def *(arg:InvariantDouble) 	: InvariantFloat={return new InvariantFloat((arg.value * value).toFloat);}
		def *(arg:InvariantFloat)	: InvariantFloat={return new InvariantFloat(arg.value * value);}

		def *(arg:Double) 	:  InvariantFloat={return new InvariantFloat((value * arg).toFloat);}
		def *(arg:Int) 		:  InvariantFloat={return new InvariantFloat(value * arg);}
		def *(arg:Float) 	:  InvariantFloat={return new InvariantFloat(value * arg);}
		

		// Divisao
		def /(arg:InvariantInt)    	: InvariantFloat={return new InvariantFloat(arg.value / value);}
		def /(arg:InvariantDouble) 	: InvariantFloat={return new InvariantFloat((arg.value / value).toFloat);}
		def /(arg:InvariantFloat)	: InvariantFloat={return new InvariantFloat(arg.value / value);}

		def /(arg:Double) 	:  InvariantFloat={return new InvariantFloat((value / arg).toFloat);}
		def /(arg:Int) 		:  InvariantFloat={return new InvariantFloat(value / arg);}
		def /(arg:Float) 	:  InvariantFloat={return new InvariantFloat(value / arg);}


		// Resto Divisao Inteira
		def %(arg:InvariantInt)    	: InvariantFloat={return new InvariantFloat(arg.value % value);}
		def %(arg:InvariantDouble) 	: InvariantFloat={return new InvariantFloat((arg.value % value).toFloat);}
		def %(arg:InvariantFloat)	: InvariantFloat={return new InvariantFloat(arg.value % value);}

		def %(arg:Double) 	:  InvariantFloat={return new InvariantFloat((value % arg).toFloat);}
		def %(arg:Int) 		:  InvariantFloat={return new InvariantFloat(value % arg);}
		def %(arg:Float) 	:  InvariantFloat={return new InvariantFloat(value % arg);}

		// Operador === Atribuicao de valor
		def ===(arg:InvariantDouble): 	Unit={value = (arg.value).toFloat;}
		def ===(arg:InvariantFloat): 	Unit={value = (arg.value);}
		def ===(arg:InvariantInt): 		Unit={value = (arg.value).toFloat;}

		// Operador !=
		def !=(arg:InvariantDouble) :  Boolean={return value != arg.value.toFloat;}
		def !=(arg:InvariantFloat) :  Boolean={return value != arg.value;}
		def !=(arg:InvariantInt) :  Boolean={return value != arg.value;}
		def !=(arg:Double) 	:  Boolean={return value != arg;}
		def !=(arg:Int) 	:  Boolean={return value != arg;}
		def !=(arg:Float) 	:  Boolean={return value != arg;}
		
		// Operador ==
		def ==(arg:InvariantDouble) :  Boolean={return value == arg.value.toFloat;}
		def ==(arg:InvariantFloat) :  Boolean={return value == arg.value;}
		def ==(arg:InvariantInt) :  Boolean={return value == arg.value;}
		def ==(arg:Double) 	:  Boolean={return value == arg;}
		def ==(arg:Int) 	:  Boolean={return value == arg;}
		def ==(arg:Float) 	:  Boolean={return value == arg;}
		
		// Operador <
		def <(arg:InvariantDouble) :  Boolean={return value < arg.value.toFloat;}
		def <(arg:InvariantFloat) :  Boolean={return value < arg.value;}
		def <(arg:InvariantInt) :  Boolean={return value < arg.value;}
		def <(arg:Double) 	:  Boolean={return value < arg.toFloat;}
		def <(arg:Int) 		:  Boolean={return value < arg;}
		def <(arg:Float) 	:  Boolean={return value < arg;}
		
		// Operador <=
		def <=(arg:InvariantDouble) :  Boolean={return value <= arg.value.toFloat;}
		def <=(arg:InvariantFloat) :  Boolean={return value <= arg.value;}
		def <=(arg:InvariantInt) :  Boolean={return value <= arg.value;}
		def <=(arg:Double) 	:  Boolean={return value <= arg.toFloat;}
		def <=(arg:Int) 	:  Boolean={return value <= arg;}
		def <=(arg:Float) 	:  Boolean={return value <= arg;}
		
		// Operador >
		def >(arg:InvariantDouble) :  Boolean={return value > arg.value.toFloat;}
		def >(arg:InvariantFloat) :  Boolean={return value > arg.value;}
		def >(arg:InvariantInt) :  Boolean={return value > arg.value;}
		def >(arg:Double) 	:  Boolean={return value > arg.toFloat;}
		def >(arg:Int) 		:  Boolean={return value > arg;}
		def >(arg:Float) 	:  Boolean={return value > arg;}
		
		// Operador >=
		def >=(arg:InvariantDouble) :  Boolean={return value >= arg.value.toFloat;}
		def >=(arg:InvariantFloat) :  Boolean={return value >= arg.value;}
		def >=(arg:InvariantInt) :  Boolean={return value >= arg.value;}
		def >=(arg:Double) 	:  Boolean={return value >= arg.toFloat;}
		def >=(arg:Int) 	:  Boolean={return value >= arg;}
		def >=(arg:Float) 	:  Boolean={return value >= arg;}

		
}