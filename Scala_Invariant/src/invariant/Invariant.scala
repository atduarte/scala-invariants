package invariant

abstract class Invariant {
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