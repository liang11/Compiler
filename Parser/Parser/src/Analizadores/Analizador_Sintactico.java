
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analizadores;

import java_cup.runtime.Symbol;
import java.util.LinkedList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Analizador_Sintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Simbolos.class;
}

  /** Default constructor. */
  @Deprecated
  public Analizador_Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Analizador_Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Analizador_Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\004\000\002\002\004\000\002\002\003\000\002\003" +
    "\005\000\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\010\000\006\012\007\015\004\001\002\000\004\002" +
    "\ufffe\001\002\000\004\002\000\001\002\000\004\002\012" +
    "\001\002\000\004\014\010\001\002\000\004\013\011\001" +
    "\002\000\004\002\uffff\001\002\000\004\002\001\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\010\000\006\002\005\003\004\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Analizador_Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Analizador_Sintactico$actions(this);
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
    return action_obj.CUP$Analizador_Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public String resultado = "";
    public static LinkedList<TError> tablaES = new LinkedList<TError>();

    //Metodo al que se llama solo en caso de un error sintactico
    public void syntax_error(Symbol s){
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;

        System.out.println("Error sintactico Recuperado!");
        System.out.println("\tLexema: " + lexema);
        System.out.println("\tFila: " + fila);
        System.out.println("\tColumna: " + columna);   

        TError  datos = new TError(lexema, "Error Sintactico", "Caracter no esperado", fila, columna);
        tablaES.add(datos);
    }

    //Metodo al que se llama solo en caso qye no se pueda recuperar del error
    public void unrecovered_syntax_error(Symbol s){
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;

        System.out.println("Error sintactico, No es posible recuperacion!");
        System.out.println("\tLexema: " + lexema);
        System.out.println("\tFila: " + fila);
        System.out.println("\tColumna: " + columna);   

        TError  datos = new TError(lexema, "Error Sintactico", "Caracter no esperado", fila, columna);
        tablaES.add(datos);
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Analizador_Sintactico$actions {


    

  private final Analizador_Sintactico parser;

  /** Constructor */
  CUP$Analizador_Sintactico$actions(Analizador_Sintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Analizador_Sintactico$do_action_part00000000(
    int                        CUP$Analizador_Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Analizador_Sintactico$parser,
    java.util.Stack            CUP$Analizador_Sintactico$stack,
    int                        CUP$Analizador_Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Analizador_Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Analizador_Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.elementAt(CUP$Analizador_Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.elementAt(CUP$Analizador_Sintactico$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$Analizador_Sintactico$stack.elementAt(CUP$Analizador_Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.elementAt(CUP$Analizador_Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Analizador_Sintactico$parser.done_parsing();
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= E 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Analizador_Sintactico$stack.peek()).value;
		resultado = a; 
              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // E ::= RW beg term 
            {
              String RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.elementAt(CUP$Analizador_Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // E ::= lit 
            {
              String RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Analizador_Sintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Analizador_Sintactico$do_action(
    int                        CUP$Analizador_Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Analizador_Sintactico$parser,
    java.util.Stack            CUP$Analizador_Sintactico$stack,
    int                        CUP$Analizador_Sintactico$top)
    throws java.lang.Exception
    {
              return CUP$Analizador_Sintactico$do_action_part00000000(
                               CUP$Analizador_Sintactico$act_num,
                               CUP$Analizador_Sintactico$parser,
                               CUP$Analizador_Sintactico$stack,
                               CUP$Analizador_Sintactico$top);
    }
}

}