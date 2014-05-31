package invariant.invariantEvaluator.Exceptions

import java.io.{PrintWriter, PrintStream}


class InvariantExceptionIllegalMacro(variable:String,expr:String) extends InvariantException{
  override def printStackTrace(){
    println("\nInvariant Illegal Argument Exception:\n");
    println("\nDeclaration of :\"var "+variable + "\" has initialized values\n");
    println("Expression provided: \n"+expr)
    println("\n");
    super.printStackTrace();
  }
  override def printStackTrace(s:PrintStream){
    s.print("\nInvariant Illegal Argument Exception:\n");
    s.print("\nDeclaration of :\"var "+variable + "\" has initialized values\n");
    s.print("Expression provided: \n"+expr)
    s.print("\n");
    super.printStackTrace(s);
  }
  override def printStackTrace(s:PrintWriter) {
    s.print("\nInvariant Illegal Argument Exception:\n");
    s.print("\nDeclaration of :\"var " + variable + "\" has initialized values\n");
    s.print("Expression provided: \n" + expr)
    s.print("\n");
    super.printStackTrace(s);
  }
}
