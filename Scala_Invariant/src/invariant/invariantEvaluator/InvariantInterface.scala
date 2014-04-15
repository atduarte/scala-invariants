package invariant.invariantEvaluator


abstract class InvariantInterface {
		var evaluator:InvariantEvaluator
		def !=(arg:Double) 	:  Boolean
		def !=(arg:Int) 	:  Boolean
		def !=(arg:Float) 	:  Boolean
		
		def ==(arg:Double) 	:  Boolean
		def ==(arg:Int) 	:  Boolean
		def ==(arg:Float) 	:  Boolean
		
		def <(arg:Double) 	:  Boolean
		def <(arg:Int) 		:  Boolean
		def <(arg:Float) 	:  Boolean
		
		def <=(arg:Double) 	:  Boolean
		def <=(arg:Int) 	:  Boolean
		def <=(arg:Float) 	:  Boolean
			
		def >(arg:Double) 	:  Boolean
		def >(arg:Int) 		:  Boolean
		def >(arg:Float) 	:  Boolean
		
		def >=(arg:Double) 	:  Boolean
		def >=(arg:Int) 	:  Boolean
		def >=(arg:Float) 	:  Boolean
}