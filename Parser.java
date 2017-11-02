/* Generated By:JJTree&JavaCC: Do not edit this line. Parser.java */
                                        //The parser class name is "Parser"
import java.io.*;
public class Parser/*@bgen(jjtree)*/implements ParserTreeConstants, ParserConstants {/*@bgen(jjtree)*/
  protected JJTParserState jjtree = new JJTParserState();

//////////////////////////   Grammar Rules  /////////////////////////////
  final public ASTSpeech Speech() throws ParseException {
 /*@bgen(jjtree) Speech */
  ASTSpeech jjtn000 = new ASTSpeech(JJTSPEECH);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      label_1:
      while (true) {
        Sentence();
        jj_consume_token(PERIOD);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case DETERMINER:
        case NOUN:
        case PRONOUN:
        case VERB:
        case ADJ:
          ;
          break;
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
      }
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

  final public void Sentence() throws ParseException {
 /*@bgen(jjtree) Sentence */
  ASTSentence jjtn000 = new ASTSentence(JJTSENTENCE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case DETERMINER:
      case NOUN:
      case PRONOUN:
      case ADJ:
        NP();
        break;
      default:
        jj_la1[1] = jj_gen;
        ;
      }
      VP();
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

  final public void NP() throws ParseException {
 /*@bgen(jjtree) NounPhrase */
  ASTNounPhrase jjtn000 = new ASTNounPhrase(JJTNOUNPHRASE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PRONOUN:
        Pronoun();
        break;
      case DETERMINER:
      case NOUN:
      case ADJ:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case DETERMINER:
          Determiner();
          break;
        default:
          jj_la1[2] = jj_gen;
          ;
        }
        label_2:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case ADJ:
            ;
            break;
          default:
            jj_la1[3] = jj_gen;
            break label_2;
          }
          Adjective();
        }
        CN();
        break;
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PREPOSITION:
        PP();
        break;
      default:
        jj_la1[5] = jj_gen;
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

  final public void CN() throws ParseException {
 /*@bgen(jjtree) CompoundNoun */
  ASTCompoundNoun jjtn000 = new ASTCompoundNoun(JJTCOMPOUNDNOUN);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Noun();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NOUN:
        Noun();
        break;
      default:
        jj_la1[6] = jj_gen;
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

  final public void PP() throws ParseException {
 /*@bgen(jjtree) PrepPhrase */
  ASTPrepPhrase jjtn000 = new ASTPrepPhrase(JJTPREPPHRASE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Preposition();
      NP();
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

  final public void VP() throws ParseException {
 /*@bgen(jjtree) VerbPhrase */
  ASTVerbPhrase jjtn000 = new ASTVerbPhrase(JJTVERBPHRASE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Verb();
      NP();
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

///////////////////////// Grammar Leaf Nodes  //////////////////////////
  final public void Noun() throws ParseException {
 /*@bgen(jjtree) Noun */
 ASTNoun jjtn000 = new ASTNoun(JJTNOUN);
 boolean jjtc000 = true;
 jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(NOUN);
               jjtree.closeNodeScope(jjtn000, true);
               jjtc000 = false;
              jjtn000.setLexem(t.image);
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  final public void Pronoun() throws ParseException {
 /*@bgen(jjtree) Pronoun */
 ASTPronoun jjtn000 = new ASTPronoun(JJTPRONOUN);
 boolean jjtc000 = true;
 jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(PRONOUN);
                  jjtree.closeNodeScope(jjtn000, true);
                  jjtc000 = false;
                 jjtn000.setLexem(t.image);
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  final public void Determiner() throws ParseException {
 /*@bgen(jjtree) Determiner */
 ASTDeterminer jjtn000 = new ASTDeterminer(JJTDETERMINER);
 boolean jjtc000 = true;
 jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(DETERMINER);
                     jjtree.closeNodeScope(jjtn000, true);
                     jjtc000 = false;
                    jjtn000.setLexem(t.image);
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  final public void Adjective() throws ParseException {
 /*@bgen(jjtree) Adjective */
 ASTAdjective jjtn000 = new ASTAdjective(JJTADJECTIVE);
 boolean jjtc000 = true;
 jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(ADJ);
              jjtree.closeNodeScope(jjtn000, true);
              jjtc000 = false;
             jjtn000.setLexem(t.image);
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  final public void Preposition() throws ParseException {
 /*@bgen(jjtree) Preposition */
 ASTPreposition jjtn000 = new ASTPreposition(JJTPREPOSITION);
 boolean jjtc000 = true;
 jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(PREPOSITION);
                      jjtree.closeNodeScope(jjtn000, true);
                      jjtc000 = false;
                     jjtn000.setLexem(t.image);
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  final public void Verb() throws ParseException {
 /*@bgen(jjtree) Verb */
 ASTVerb jjtn000 = new ASTVerb(JJTVERB);
 boolean jjtc000 = true;
 jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(VERB);
               jjtree.closeNodeScope(jjtn000, true);
               jjtc000 = false;
              jjtn000.setLexem(t.image);
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  /** Generated Token Manager. */
  public ParserTokenManager token_source;
  JavaCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[7];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x1f00,0x1700,0x100,0x1000,0x1700,0x2000,0x200,};
   }

  /** Constructor with InputStream. */
  public Parser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Parser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new JavaCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
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
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Parser(java.io.Reader stream) {
    jj_input_stream = new JavaCharStream(stream, 1, 1);
    token_source = new ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Parser(ParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
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
    boolean[] la1tokens = new boolean[17];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 7; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 17; i++) {
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