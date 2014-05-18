/* Generated By:JJTree&JavaCC: Do not edit this line. InvariantParser.java */
/*Coisas p/ adicionar depois de compilar:
 SimpleNode:

  public Vector<Integer> operators;
  public String numVar;
  public boolean negative;
  public int getID() throws ParseException{
	return id;
  }


*/

package invariant.invariantEvaluator.Parser;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Vector;
import java.lang.Integer;
import java.lang.String;

public class InvariantParser/*@bgen(jjtree)*/implements InvariantParserTreeConstants, InvariantParserConstants {/*@bgen(jjtree)*/
  protected JJTInvariantParserState jjtree = new JJTInvariantParserState();Vector<String> vars;
        InvariantParserConstants constants;
         SimpleNode getTree(String expr) throws ParseException{
            InputStream stream = new ByteArrayInputStream(expr.getBytes());
            ReInit(stream);
                return Inv_exp();
        }

  final public SimpleNode Inv_exp() throws ParseException {
                      /*@bgen(jjtree) Inv_exp */
  SimpleNode jjtn000 = new SimpleNode(JJTINV_EXP);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case VAR_TAG:
          ;
          break;
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        VarDecl();
      }
      OrExpr();
      jj_consume_token(25);
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
         {if (true) return jjtn000;}
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
    throw new Error("Missing return statement in function");
  }

  final public void OrExpr() throws ParseException {
               /*@bgen(jjtree) OrExpr */
  SimpleNode jjtn000 = new SimpleNode(JJTOREXPR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      AndExpr();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OR:
        OrExpr_();
        break;
      default:
        jj_la1[1] = jj_gen;
        ;
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void OrExpr_() throws ParseException {
                /*@bgen(jjtree) OrExpr_ */
  SimpleNode jjtn000 = new SimpleNode(JJTOREXPR_);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(OR);
      AndExpr();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OR:
        OrExpr_();
        break;
      default:
        jj_la1[2] = jj_gen;
        ;
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void AndExpr() throws ParseException {
                /*@bgen(jjtree) AndExpr */
  SimpleNode jjtn000 = new SimpleNode(JJTANDEXPR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      atomInv();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AND:
        AndExpr_();
        break;
      default:
        jj_la1[3] = jj_gen;
        ;
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void AndExpr_() throws ParseException {
                 /*@bgen(jjtree) AndExpr_ */
  SimpleNode jjtn000 = new SimpleNode(JJTANDEXPR_);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(AND);
      atomInv();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AND:
        AndExpr_();
        break;
      default:
        jj_la1[4] = jj_gen;
        ;
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void atomInv() throws ParseException {
                /*@bgen(jjtree) atomInv */
                SimpleNode jjtn000 = new SimpleNode(JJTATOMINV);
                boolean jjtc000 = true;
                jjtree.openNodeScope(jjtn000);Token value;
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VAR:
         jjtn000.operators = new Vector<Integer>();
        value = jj_consume_token(VAR);
                    jjtn000.numVar =value.toString();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case EQUAL:
          jj_consume_token(EQUAL);
                                                                jjtn000.operators.add(constants.EQUAL);
          break;
        case NOTEQUAL:
          jj_consume_token(NOTEQUAL);
                                                                                                                    jjtn000.operators.add(constants.NOTEQUAL);
          break;
        default:
          jj_la1[5] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PAR_SETO:
          Set();
          break;
        case REC_BRAC_O:
        case REC_BRAC_C:
          Range();
          break;
        default:
          jj_la1[6] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
      case PAR_OPEN:
        jj_consume_token(PAR_OPEN);
        OrExpr();
        jj_consume_token(PAR_CLOSE);
        break;
      default:
        jj_la1[7] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void Range() throws ParseException {
              /*@bgen(jjtree) Range */
  SimpleNode jjtn000 = new SimpleNode(JJTRANGE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
         jjtn000.operators = new Vector<Integer>();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case REC_BRAC_O:
        jj_consume_token(REC_BRAC_O);
                        jjtn000.operators.add(constants.REC_BRAC_O);
        break;
      case REC_BRAC_C:
        jj_consume_token(REC_BRAC_C);
                                                                                    jjtn000.operators.add(constants.REC_BRAC_C);
        break;
      default:
        jj_la1[8] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      Aritm();
      jj_consume_token(COMMA);
      Aritm();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case REC_BRAC_O:
        jj_consume_token(REC_BRAC_O);
                                                                                                                                                                     jjtree.closeNodeScope(jjtn000, true);
                                                                                                                                                                     jjtc000 = false;
                                                                                                                                                                    jjtn000.operators.add(constants.REC_BRAC_O);
        break;
      case REC_BRAC_C:
        jj_consume_token(REC_BRAC_C);
                                                                                                                                                                                                                                  jjtree.closeNodeScope(jjtn000, true);
                                                                                                                                                                                                                                  jjtc000 = false;
                                                                                                                                                                                                                                 jjtn000.operators.add(constants.REC_BRAC_C);
        break;
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void Set() throws ParseException {
            /*@bgen(jjtree) Set */
  SimpleNode jjtn000 = new SimpleNode(JJTSET);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(PAR_SETO);
      Aritm();
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case COMMA:
          ;
          break;
        default:
          jj_la1[10] = jj_gen;
          break label_2;
        }
        jj_consume_token(COMMA);
        Aritm();
      }
      jj_consume_token(PAR_SETC);
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void VarDecl() throws ParseException {
                /*@bgen(jjtree) VarDecl */
                SimpleNode jjtn000 = new SimpleNode(JJTVARDECL);
                boolean jjtc000 = true;
                jjtree.openNodeScope(jjtn000);Token value;
    try {
      jj_consume_token(VAR_TAG);
      value = jj_consume_token(VAR_LOCAL);
                                    jjtn000.numVar =value.toString();
      jj_consume_token(EQUAL);
      Aritm();
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void Aritm() throws ParseException {
              /*@bgen(jjtree) Aritm */
  SimpleNode jjtn000 = new SimpleNode(JJTARITM);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VAR:
      case VAR_LOCAL:
      case NUM:
      case PAR_OPEN:
      case OP_SUM:
      case OP_DIFF:
        SumExpr();
        break;
      case INF:
        jj_consume_token(INF);
        break;
      default:
        jj_la1[11] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void SumExpr() throws ParseException {
                /*@bgen(jjtree) SumExpr */
  SimpleNode jjtn000 = new SimpleNode(JJTSUMEXPR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      multExpr();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OP_SUM:
      case OP_DIFF:
        SumExpr_();
        break;
      default:
        jj_la1[12] = jj_gen;
        ;
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void SumExpr_() throws ParseException {
                 /*@bgen(jjtree) SumExpr_ */
  SimpleNode jjtn000 = new SimpleNode(JJTSUMEXPR_);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
         jjtn000.operators = new Vector<Integer>();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OP_SUM:
        jj_consume_token(OP_SUM);
                  jjtn000.operators.add(constants.OP_SUM);
        break;
      case OP_DIFF:
        jj_consume_token(OP_DIFF);
                                                                      jjtn000.operators.add(constants.OP_DIFF);
        break;
      default:
        jj_la1[13] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      multExpr();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OP_SUM:
      case OP_DIFF:
        SumExpr_();
        break;
      default:
        jj_la1[14] = jj_gen;
        ;
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void multExpr() throws ParseException {
                 /*@bgen(jjtree) multExpr */
  SimpleNode jjtn000 = new SimpleNode(JJTMULTEXPR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      atom();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OP_EXP:
      case OP_MUL:
      case OP_DIV:
        multExpr_();
        break;
      default:
        jj_la1[15] = jj_gen;
        ;
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void multExpr_() throws ParseException {
                  /*@bgen(jjtree) multExpr_ */
  SimpleNode jjtn000 = new SimpleNode(JJTMULTEXPR_);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
         jjtn000.operators = new Vector<Integer>();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OP_MUL:
        jj_consume_token(OP_MUL);
                  jjtn000.operators.add(constants.OP_MUL);
        break;
      case OP_DIV:
        jj_consume_token(OP_DIV);
              jjtn000.operators.add(constants.OP_DIV);
        break;
      case OP_EXP:
        jj_consume_token(OP_EXP);
              jjtn000.operators.add(constants.OP_EXP);
        break;
      default:
        jj_la1[16] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      atom();
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  final public void atom() throws ParseException {
             /*@bgen(jjtree) atom */
             SimpleNode jjtn000 = new SimpleNode(JJTATOM);
             boolean jjtc000 = true;
             jjtree.openNodeScope(jjtn000);Token value;
    try {
         jjtn000.operators = new Vector<Integer>();jjtn000.negative=false;
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case OP_SUM:
        case OP_DIFF:
          ;
          break;
        default:
          jj_la1[17] = jj_gen;
          break label_3;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case OP_DIFF:
          jj_consume_token(OP_DIFF);
                    jjtn000.negative = !jjtn000.negative;
          break;
        case OP_SUM:
          jj_consume_token(OP_SUM);
          break;
        default:
          jj_la1[18] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VAR:
      case VAR_LOCAL:
      case NUM:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case NUM:
          value = jj_consume_token(NUM);
                                                  jjtn000.operators.add(constants.NUM);
          break;
        case VAR:
          value = jj_consume_token(VAR);
                                                  jjtn000.operators.add(constants.VAR);
          break;
        case VAR_LOCAL:
          value = jj_consume_token(VAR_LOCAL);
                                          jjtn000.operators.add(constants.VAR_LOCAL);
          break;
        default:
          jj_la1[19] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
                    jjtree.closeNodeScope(jjtn000, true);
                    jjtc000 = false;
                   jjtn000.numVar =value.toString();
        break;
      case PAR_OPEN:
        jj_consume_token(PAR_OPEN);
        SumExpr();
        jj_consume_token(PAR_CLOSE);
        break;
      default:
        jj_la1[20] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  /** Generated Token Manager. */
  public InvariantParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[21];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x20,0x100,0x100,0x200,0x200,0x60000,0x4c00,0x1010,0xc00,0xc00,0x10000,0x6810d0,0x600000,0x600000,0x600000,0x1900000,0x1900000,0x600000,0x600000,0xd0,0x10d0,};
   }

  /** Constructor with InputStream. */
  public InvariantParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public InvariantParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new InvariantParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public InvariantParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new InvariantParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public InvariantParser(InvariantParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(InvariantParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[26];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 21; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 26; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
