
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Thu May 08 18:57:11 CEST 2014
//----------------------------------------------------

package fr.ul.compilation.plic0.analyser;

import java_cup.runtime.*;
import java.util.LinkedList;
import fr.ul.compilation.plic0.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Thu May 08 18:57:11 CEST 2014
  */
public class AnalyseurSyntaxique extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public AnalyseurSyntaxique() {super();}

  /** Constructor which sets the default scanner. */
  public AnalyseurSyntaxique(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public AnalyseurSyntaxique(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\041\000\002\002\004\000\002\002\003\000\002\015" +
    "\006\000\002\014\003\000\002\014\003\000\002\014\004" +
    "\000\002\014\004\000\002\013\006\000\002\012\003\000" +
    "\002\011\003\000\002\011\003\000\002\011\003\000\002" +
    "\010\006\000\002\007\003\000\002\006\005\000\002\005" +
    "\005\000\002\005\005\000\002\004\003\000\002\004\003" +
    "\000\002\003\005\000\002\003\005\000\002\003\005\000" +
    "\002\003\004\000\002\003\003\000\002\003\005\000\002" +
    "\003\003\000\002\017\005\000\002\017\005\000\002\017" +
    "\005\000\002\016\003\000\002\016\003\000\002\016\003" +
    "\000\002\016\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\075\000\004\024\004\001\002\000\004\026\010\001" +
    "\002\000\004\002\007\001\002\000\004\002\000\001\002" +
    "\000\004\002\001\001\002\000\012\017\012\020\021\026" +
    "\013\031\015\001\002\000\014\017\012\020\021\023\ufffd" +
    "\026\013\031\015\001\002\000\014\005\033\010\027\025" +
    "\034\026\031\027\073\001\002\000\004\021\ufff4\001\002" +
    "\000\014\017\012\020\021\023\ufffe\026\013\031\015\001" +
    "\002\000\004\022\067\001\002\000\014\017\ufff9\020\ufff9" +
    "\023\ufff9\026\ufff9\031\ufff9\001\002\000\014\017\ufff7\020" +
    "\ufff7\023\ufff7\026\ufff7\031\ufff7\001\002\000\014\017\ufff6" +
    "\020\ufff6\023\ufff6\026\ufff6\031\ufff6\001\002\000\004\026" +
    "\065\001\002\000\004\021\026\001\002\000\004\023\025" +
    "\001\002\000\014\017\ufff8\020\ufff8\023\ufff8\026\ufff8\031" +
    "\ufff8\001\002\000\004\002\uffff\001\002\000\012\005\033" +
    "\010\027\025\034\026\031\001\002\000\012\005\033\010" +
    "\027\025\034\026\031\001\002\000\022\005\043\006\041" +
    "\007\042\012\052\013\053\014\051\015\054\016\uffef\001" +
    "\002\000\024\005\uffe8\006\uffe8\007\uffe8\011\uffe8\012\uffe8" +
    "\013\uffe8\014\uffe8\015\uffe8\016\uffe8\001\002\000\014\012" +
    "\052\013\053\014\051\015\054\016\ufff0\001\002\000\012" +
    "\005\033\010\037\025\034\026\031\001\002\000\024\005" +
    "\uffea\006\uffea\007\uffea\011\uffea\012\uffea\013\uffea\014\uffea" +
    "\015\uffea\016\uffea\001\002\000\004\016\036\001\002\000" +
    "\014\017\ufff5\020\ufff5\023\ufff5\026\ufff5\031\ufff5\001\002" +
    "\000\012\005\033\010\037\025\034\026\031\001\002\000" +
    "\024\005\uffeb\006\uffeb\007\uffeb\011\uffeb\012\uffeb\013\uffeb" +
    "\014\uffeb\015\uffeb\016\uffeb\001\002\000\012\005\033\010" +
    "\037\025\034\026\031\001\002\000\012\005\033\010\037" +
    "\025\034\026\031\001\002\000\012\005\033\010\037\025" +
    "\034\026\031\001\002\000\024\005\uffee\006\uffee\007\042" +
    "\011\uffee\012\uffee\013\uffee\014\uffee\015\uffee\016\uffee\001" +
    "\002\000\024\005\uffec\006\uffec\007\uffec\011\uffec\012\uffec" +
    "\013\uffec\014\uffec\015\uffec\016\uffec\001\002\000\024\005" +
    "\uffed\006\uffed\007\042\011\uffed\012\uffed\013\uffed\014\uffed" +
    "\015\uffed\016\uffed\001\002\000\012\005\043\006\041\007" +
    "\042\011\050\001\002\000\024\005\uffe9\006\uffe9\007\uffe9" +
    "\011\uffe9\012\uffe9\013\uffe9\014\uffe9\015\uffe9\016\uffe9\001" +
    "\002\000\012\005\uffe2\010\uffe2\025\uffe2\026\uffe2\001\002" +
    "\000\012\005\uffe4\010\uffe4\025\uffe4\026\uffe4\001\002\000" +
    "\012\005\uffe3\010\uffe3\025\uffe3\026\uffe3\001\002\000\012" +
    "\005\uffe1\010\uffe1\025\uffe1\026\uffe1\001\002\000\012\005" +
    "\033\010\027\025\034\026\031\001\002\000\020\005\043" +
    "\006\041\007\042\012\052\013\053\014\051\015\054\001" +
    "\002\000\016\011\uffe7\012\052\013\053\014\051\015\054" +
    "\016\uffe7\001\002\000\012\005\033\010\037\025\034\026" +
    "\031\001\002\000\024\005\043\006\041\007\042\011\uffe5" +
    "\012\uffe5\013\uffe5\014\uffe5\015\uffe5\016\uffe5\001\002\000" +
    "\022\005\043\006\041\007\042\011\050\012\052\013\053" +
    "\014\051\015\054\001\002\000\014\011\064\012\052\013" +
    "\053\014\051\015\054\001\002\000\016\011\uffe6\012\uffe6" +
    "\013\uffe6\014\uffe6\015\uffe6\016\uffe6\001\002\000\004\016" +
    "\066\001\002\000\014\017\ufff3\020\ufff3\023\ufff3\026\ufff3" +
    "\031\ufff3\001\002\000\004\030\070\001\002\000\004\016" +
    "\071\001\002\000\014\017\ufffa\020\ufffa\023\ufffa\026\ufffa" +
    "\031\ufffa\001\002\000\004\023\ufffb\001\002\000\004\016" +
    "\076\001\002\000\004\016\075\001\002\000\014\017\ufff2" +
    "\020\ufff2\023\ufff2\026\ufff2\031\ufff2\001\002\000\014\017" +
    "\ufff1\020\ufff1\023\ufff1\026\ufff1\031\ufff1\001\002\000\004" +
    "\023\ufffc\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\075\000\006\002\004\015\005\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\022\005\023\006\016\007\021\010\017\011\015\012" +
    "\010\013\013\014\022\001\001\000\022\005\023\006\016" +
    "\007\021\010\017\011\015\012\010\013\013\014\076\001" +
    "\001\000\010\003\027\004\073\017\031\001\001\000\002" +
    "\001\001\000\022\005\023\006\016\007\021\010\017\011" +
    "\015\012\010\013\013\014\071\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\010\003\027\004\034\017" +
    "\031\001\001\000\006\003\061\017\062\001\001\000\004" +
    "\016\057\001\001\000\002\001\001\000\004\016\054\001" +
    "\001\000\004\003\037\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\003\046\001\001\000" +
    "\002\001\001\000\004\003\045\001\001\000\004\003\044" +
    "\001\001\000\004\003\043\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\003\055\017\056\001\001" +
    "\000\004\016\057\001\001\000\004\016\054\001\001\000" +
    "\004\003\060\001\001\000\002\001\001\000\004\016\057" +
    "\001\001\000\004\016\054\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$AnalyseurSyntaxique$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$AnalyseurSyntaxique$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$AnalyseurSyntaxique$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    
    public void report_error(String message, Object info) {

        StringBuffer m = new StringBuffer("Error");
        if (info instanceof java_cup.runtime.Symbol) {

            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);
            if (s.left >= 0) {                
                m.append(" in line "+(s.left+1));   
                if (s.right >= 0)                    
                    m.append(", column "+(s.right+1));
            }
        }
   
        m.append(" : "+message);
   
        System.err.println(m);
    }

    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        System.exit(1);
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$AnalyseurSyntaxique$actions {

 
       	      	Expression arb = null;  
       	      	LinkedList<Expression> liste = new LinkedList<Expression>();
	    
  private final AnalyseurSyntaxique parser;

  /** Constructor */
  CUP$AnalyseurSyntaxique$actions(AnalyseurSyntaxique parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$AnalyseurSyntaxique$do_action(
    int                        CUP$AnalyseurSyntaxique$act_num,
    java_cup.runtime.lr_parser CUP$AnalyseurSyntaxique$parser,
    java.util.Stack            CUP$AnalyseurSyntaxique$stack,
    int                        CUP$AnalyseurSyntaxique$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$AnalyseurSyntaxique$result;

      /* select the action based on the action number */
      switch (CUP$AnalyseurSyntaxique$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // BOOL ::= DIFFERENT 
            {
              Binaire RESULT =null;
		RESULT = new Inegalite(); 
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("BOOL",12, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // BOOL ::= SUPERIEUR 
            {
              Binaire RESULT =null;
		RESULT = new Superieur(); 
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("BOOL",12, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // BOOL ::= EGAL 
            {
              Binaire RESULT =null;
		RESULT = new Egal(); 
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("BOOL",12, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // BOOL ::= INFERIEUR 
            {
              Binaire RESULT =null;
		RESULT = new Inferieur(); 
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("BOOL",12, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // EXPR_BOOL ::= EXPR BOOL EXPR 
            {
              Binaire RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		Binaire b = (Binaire)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		 	b.ajouterGauche(e1);
	   		b.ajouterDroit(e2);
	   		RESULT = b;
	   	
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR_BOOL",13, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // EXPR_BOOL ::= PARO EXPR_BOOL PARF 
            {
              Binaire RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		Binaire e = (Binaire)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		
		   	RESULT = e;
	 	
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR_BOOL",13, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // EXPR_BOOL ::= EXPR_BOOL BOOL EXPR_BOOL 
            {
              Binaire RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).right;
		Binaire e1 = (Binaire)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		Binaire b = (Binaire)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Binaire e2 = (Binaire)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		 	b.ajouterGauche(e1);
	   		b.ajouterDroit(e2);
	   		RESULT = b;
	   	
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR_BOOL",13, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // EXPR ::= IDF 
            {
              Expression RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
	 		RESULT = new Variable("publique", id);
	 	
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",1, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // EXPR ::= PARO EXPR PARF 
            {
              Expression RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		
		   	RESULT = e;
	 	
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",1, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // EXPR ::= ENTIER 
            {
              Expression RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
			
			RESULT = new Entier(Integer.parseInt(i)); 
		
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",1, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // EXPR ::= MOINS EXPR 
            {
              Expression RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
		   	RESULT = new Soustraction(new Entier(0), e) ;
	 	
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",1, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // EXPR ::= EXPR MULTIPLICATION EXPR 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		 
		  	RESULT = new Multiplication(e1, e2);
	 	
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",1, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // EXPR ::= EXPR PLUS EXPR 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		 
		   	RESULT = new Somme(e1, e2);
	 	
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",1, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // EXPR ::= EXPR MOINS EXPR 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		 
		   	RESULT = new Soustraction(e1, e2);
	 	
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",1, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // EXPR_LIST ::= EXPR 
            {
              Expression RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		 RESULT = e; 
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR_LIST",2, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // EXPR_LIST ::= EXPR_BOOL 
            {
              Expression RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Binaire e = (Binaire)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		 RESULT = e; 
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR_LIST",2, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // ECRIRE_FCT ::= ECRIRE CHAINE SEMI 
            {
              Expression RESULT =null;
		int chleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int chright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		String ch = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		
			RESULT = new Ecrire(new Chaine(ch));
		
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("ECRIRE_FCT",3, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // ECRIRE_FCT ::= ECRIRE EXPR_LIST SEMI 
            {
              Expression RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		
			RESULT = new Ecrire(e);
		
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("ECRIRE_FCT",3, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // LIRE_FCT ::= LIRE IDF SEMI 
            {
              Expression RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		
			RESULT = new Lire(id);
		
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("LIRE_FCT",4, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // ACCES ::= IDF 
            {
              Expression RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
			RESULT = new Variable("publique", id); 
		
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("ACCES",5, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // AFFECT ::= ACCES EGAL_AFFECT EXPR_LIST SEMI 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-3)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-3)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-3)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		
			RESULT = new Affection(e1, e2);
		
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("AFFECT",6, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-3)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // INST ::= AFFECT 
            {
              Expression RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
			RESULT = e;
		
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("INST",7, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // INST ::= LIRE_FCT 
            {
              Expression RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
			RESULT = e;
		
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("INST",7, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // INST ::= ECRIRE_FCT 
            {
              Expression RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
			RESULT = e;
		
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("INST",7, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // DECL_CONST ::= INST 
            {
              Expression RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
			liste.add(e);
		
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("DECL_CONST",8, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // DECL_CHAMP ::= STATUT TYPE IDF_MUL SEMI 
            {
              Expression RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-3)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-3)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		
			for(String str : e.split(",")) {
				liste.add(new Variable(s, str.replace(" ", "")));
			}
		
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("DECL_CHAMP",9, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-3)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // DECLARATION ::= DECL_CHAMP DECLARATION 
            {
              Expression RESULT =null;

              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("DECLARATION",10, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // DECLARATION ::= DECL_CONST DECLARATION 
            {
              Expression RESULT =null;

              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("DECLARATION",10, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // DECLARATION ::= DECL_CONST 
            {
              Expression RESULT =null;

              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("DECLARATION",10, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // DECLARATION ::= DECL_CHAMP 
            {
              Expression RESULT =null;

              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("DECLARATION",10, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // CLASSE_FCT ::= CLASSE IDF DECLARATION FIN_CLASSE 
            {
              Expression RESULT =null;

              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("CLASSE_FCT",11, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-3)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // SYSTEME ::= CLASSE_FCT 
            {
              LinkedList<Expression> RESULT =null;
		
			RESULT = liste;
		
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("SYSTEME",0, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= SYSTEME EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		LinkedList<Expression> start_val = (LinkedList<Expression>)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		RESULT = start_val;
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$AnalyseurSyntaxique$parser.done_parsing();
          return CUP$AnalyseurSyntaxique$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

