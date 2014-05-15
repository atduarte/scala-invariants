package invariant

import invariant.invariantEvaluator.InvariantEvaluator
import java.util.Vector

class InvariantDouble(startValue:Double) {

  var value:Double = startValue
  var evaluator:InvariantEvaluator = null

  def restrict(restrictions : String) {
    evaluator = new InvariantEvaluator(restrictions)
  }

  def is(newValue:Double) {
    if (evaluator != null && this.verify(newValue)) {
      println("Verified")
      value = newValue
    } else {
      println("Failed")
      // Exception
    }
  }

  def verify(newValue:Double) : Boolean = {
    evaluator.evaluate(newValue)
    true
  }


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

