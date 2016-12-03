package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_REFERENCE=8;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_ID=4;
    public static final int RULE_REAL=9;
    public static final int RULE_ASSIGN=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=13;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_ZINTEGER=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=15;
    public static final int RULE_EXT_INT=11;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_INTEGER=6;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( 'network' )
            // InternalMyDsl.g:11:9: 'network'
            {
            match("network"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( '{' )
            // InternalMyDsl.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( 'epochs' )
            // InternalMyDsl.g:13:9: 'epochs'
            {
            match("epochs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( 'seed' )
            // InternalMyDsl.g:14:9: 'seed'
            {
            match("seed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( 'updater' )
            // InternalMyDsl.g:15:9: 'updater'
            {
            match("updater"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( 'learningRate' )
            // InternalMyDsl.g:16:9: 'learningRate'
            {
            match("learningRate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( '}' )
            // InternalMyDsl.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( 'layer' )
            // InternalMyDsl.g:18:9: 'layer'
            {
            match("layer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( 'type' )
            // InternalMyDsl.g:19:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( 'activation' )
            // InternalMyDsl.g:20:9: 'activation'
            {
            match("activation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( 'weightsInit' )
            // InternalMyDsl.g:21:9: 'weightsInit'
            {
            match("weightsInit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( 'biasInit' )
            // InternalMyDsl.g:22:9: 'biasInit'
            {
            match("biasInit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:23:7: ( '[' )
            // InternalMyDsl.g:23:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:24:7: ( ',' )
            // InternalMyDsl.g:24:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25:7: ( ']' )
            // InternalMyDsl.g:25:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26:7: ( '(' )
            // InternalMyDsl.g:26:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:27:7: ( 'ref' )
            // InternalMyDsl.g:27:9: 'ref'
            {
            match("ref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:28:7: ( ':' )
            // InternalMyDsl.g:28:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:29:7: ( 'in' )
            // InternalMyDsl.g:29:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:30:7: ( 'out' )
            // InternalMyDsl.g:30:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:31:7: ( ')' )
            // InternalMyDsl.g:31:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:32:7: ( '<' )
            // InternalMyDsl.g:32:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:33:7: ( '>' )
            // InternalMyDsl.g:33:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:34:7: ( '+' )
            // InternalMyDsl.g:34:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:35:7: ( '-' )
            // InternalMyDsl.g:35:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:36:7: ( '*' )
            // InternalMyDsl.g:36:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:37:7: ( '/' )
            // InternalMyDsl.g:37:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:38:7: ( 'conv' )
            // InternalMyDsl.g:38:9: 'conv'
            {
            match("conv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:39:7: ( 'max-pool' )
            // InternalMyDsl.g:39:9: 'max-pool'
            {
            match("max-pool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:40:7: ( 'avg-pool' )
            // InternalMyDsl.g:40:9: 'avg-pool'
            {
            match("avg-pool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:41:7: ( 'dense' )
            // InternalMyDsl.g:41:9: 'dense'
            {
            match("dense"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:42:7: ( 'softmax' )
            // InternalMyDsl.g:42:9: 'softmax'
            {
            match("softmax"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:43:7: ( 'sigmoid' )
            // InternalMyDsl.g:43:9: 'sigmoid'
            {
            match("sigmoid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:44:7: ( 'tanh' )
            // InternalMyDsl.g:44:9: 'tanh'
            {
            match("tanh"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:45:7: ( 'relu' )
            // InternalMyDsl.g:45:9: 'relu'
            {
            match("relu"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:46:7: ( 'sgd' )
            // InternalMyDsl.g:46:9: 'sgd'
            {
            match("sgd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:47:7: ( 'adam' )
            // InternalMyDsl.g:47:9: 'adam'
            {
            match("adam"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:48:7: ( 'adadelta' )
            // InternalMyDsl.g:48:9: 'adadelta'
            {
            match("adadelta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:49:7: ( 'nestrovs' )
            // InternalMyDsl.g:49:9: 'nestrovs'
            {
            match("nestrovs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:50:7: ( 'adagrad' )
            // InternalMyDsl.g:50:9: 'adagrad'
            {
            match("adagrad"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:51:7: ( 'rmsprop' )
            // InternalMyDsl.g:51:9: 'rmsprop'
            {
            match("rmsprop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:52:7: ( 'zero' )
            // InternalMyDsl.g:52:9: 'zero'
            {
            match("zero"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:53:7: ( 'uniform' )
            // InternalMyDsl.g:53:9: 'uniform'
            {
            match("uniform"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:54:7: ( 'normalized' )
            // InternalMyDsl.g:54:9: 'normalized'
            {
            match("normalized"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "RULE_EXT_INT"
    public final void mRULE_EXT_INT() throws RecognitionException {
        try {
            // InternalMyDsl.g:1580:23: ( RULE_INT ( 'e' | 'E' ) ( '-' | '+' ) RULE_INTEGER )
            // InternalMyDsl.g:1580:25: RULE_INT ( 'e' | 'E' ) ( '-' | '+' ) RULE_INTEGER
            {
            mRULE_INT(); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            mRULE_INTEGER(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXT_INT"

    // $ANTLR start "RULE_INTEGER"
    public final void mRULE_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1582:14: ( '1' .. '9' ( RULE_INT )* )
            // InternalMyDsl.g:1582:16: '1' .. '9' ( RULE_INT )*
            {
            matchRange('1','9'); 
            // InternalMyDsl.g:1582:25: ( RULE_INT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:1582:25: RULE_INT
            	    {
            	    mRULE_INT(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER"

    // $ANTLR start "RULE_ZINTEGER"
    public final void mRULE_ZINTEGER() throws RecognitionException {
        try {
            int _type = RULE_ZINTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1584:15: ( RULE_INT )
            // InternalMyDsl.g:1584:17: RULE_INT
            {
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ZINTEGER"

    // $ANTLR start "RULE_REAL"
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1586:11: ( ( RULE_INTEGER | RULE_INT '.' ( RULE_EXT_INT | RULE_INT ) ( RULE_INT )* ) )
            // InternalMyDsl.g:1586:13: ( RULE_INTEGER | RULE_INT '.' ( RULE_EXT_INT | RULE_INT ) ( RULE_INT )* )
            {
            // InternalMyDsl.g:1586:13: ( RULE_INTEGER | RULE_INT '.' ( RULE_EXT_INT | RULE_INT ) ( RULE_INT )* )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:1586:14: RULE_INTEGER
                    {
                    mRULE_INTEGER(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1586:27: RULE_INT '.' ( RULE_EXT_INT | RULE_INT ) ( RULE_INT )*
                    {
                    mRULE_INT(); 
                    match('.'); 
                    // InternalMyDsl.g:1586:40: ( RULE_EXT_INT | RULE_INT )
                    int alt2=2;
                    alt2 = dfa2.predict(input);
                    switch (alt2) {
                        case 1 :
                            // InternalMyDsl.g:1586:41: RULE_EXT_INT
                            {
                            mRULE_EXT_INT(); 

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1586:54: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;

                    }

                    // InternalMyDsl.g:1586:64: ( RULE_INT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:1586:64: RULE_INT
                    	    {
                    	    mRULE_INT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL"

    // $ANTLR start "RULE_ASSIGN"
    public final void mRULE_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1588:13: ( '=' )
            // InternalMyDsl.g:1588:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASSIGN"

    // $ANTLR start "RULE_REFERENCE"
    public final void mRULE_REFERENCE() throws RecognitionException {
        try {
            int _type = RULE_REFERENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1590:16: ( '->' )
            // InternalMyDsl.g:1590:18: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REFERENCE"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1592:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:1592:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:1592:24: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:1592:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1594:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:1594:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:1594:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1594:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:1594:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalMyDsl.g:1596:19: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:1596:21: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:1596:21: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1596:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1598:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:1598:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:1598:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1598:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:1598:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:1598:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1598:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1598:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:1598:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:1598:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1598:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1600:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:1600:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:1600:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1600:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalMyDsl.g:1600:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1600:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:1600:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMyDsl.g:1600:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1602:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:1602:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:1602:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1604:16: ( . )
            // InternalMyDsl.g:1604:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | RULE_INTEGER | RULE_ZINTEGER | RULE_REAL | RULE_ASSIGN | RULE_REFERENCE | RULE_ML_COMMENT | RULE_ID | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=55;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalMyDsl.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // InternalMyDsl.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // InternalMyDsl.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // InternalMyDsl.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // InternalMyDsl.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // InternalMyDsl.g:1:274: RULE_INTEGER
                {
                mRULE_INTEGER(); 

                }
                break;
            case 46 :
                // InternalMyDsl.g:1:287: RULE_ZINTEGER
                {
                mRULE_ZINTEGER(); 

                }
                break;
            case 47 :
                // InternalMyDsl.g:1:301: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 48 :
                // InternalMyDsl.g:1:311: RULE_ASSIGN
                {
                mRULE_ASSIGN(); 

                }
                break;
            case 49 :
                // InternalMyDsl.g:1:323: RULE_REFERENCE
                {
                mRULE_REFERENCE(); 

                }
                break;
            case 50 :
                // InternalMyDsl.g:1:338: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 51 :
                // InternalMyDsl.g:1:354: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 52 :
                // InternalMyDsl.g:1:362: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 53 :
                // InternalMyDsl.g:1:374: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 54 :
                // InternalMyDsl.g:1:390: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 55 :
                // InternalMyDsl.g:1:398: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA4_eotS =
        "\1\uffff\1\3\2\uffff\1\3";
    static final String DFA4_eofS =
        "\5\uffff";
    static final String DFA4_minS =
        "\1\60\1\56\2\uffff\1\56";
    static final String DFA4_maxS =
        "\2\71\2\uffff\1\71";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA4_specialS =
        "\5\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\11\1",
            "\1\2\1\uffff\12\4",
            "",
            "",
            "\1\2\1\uffff\12\4"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1586:13: ( RULE_INTEGER | RULE_INT '.' ( RULE_EXT_INT | RULE_INT ) ( RULE_INT )* )";
        }
    }
    static final String DFA2_eotS =
        "\1\uffff\1\2\1\uffff\1\2\1\uffff";
    static final String DFA2_eofS =
        "\5\uffff";
    static final String DFA2_minS =
        "\2\60\1\uffff\1\60\1\uffff";
    static final String DFA2_maxS =
        "\1\71\1\145\1\uffff\1\145\1\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA2_specialS =
        "\5\uffff}>";
    static final String[] DFA2_transitionS = {
            "\12\1",
            "\12\3\13\uffff\1\4\37\uffff\1\4",
            "",
            "\12\3\13\uffff\1\4\37\uffff\1\4",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "1586:40: ( RULE_EXT_INT | RULE_INT )";
        }
    }
    static final String DFA16_eotS =
        "\1\uffff\1\52\1\uffff\4\52\1\uffff\4\52\4\uffff\1\52\1\uffff\2\52\4\uffff\1\113\1\uffff\1\117\4\52\1\124\1\127\1\uffff\1\47\1\uffff\2\47\2\uffff\2\52\2\uffff\11\52\1\uffff\7\52\4\uffff\2\52\1\uffff\1\162\1\52\12\uffff\4\52\2\uffff\1\124\1\uffff\1\127\3\uffff\7\52\1\177\13\52\1\u008d\2\52\1\uffff\1\u0090\10\52\1\u0099\2\52\1\uffff\4\52\1\u00a0\1\u00a1\1\52\1\uffff\1\u00a3\4\52\1\uffff\1\u00a8\1\52\1\uffff\1\u00aa\1\uffff\1\52\1\u00ac\4\52\1\uffff\5\52\1\u00b6\2\uffff\1\52\1\uffff\4\52\1\uffff\1\52\1\uffff\1\u00bd\1\uffff\3\52\1\u00c1\5\52\1\uffff\6\52\1\uffff\1\u00cd\2\52\1\uffff\1\u00d0\1\u00d1\1\u00d2\1\u00d3\3\52\1\u00d7\2\52\1\u00da\1\uffff\1\u00db\1\52\4\uffff\2\52\1\u00df\1\uffff\1\52\1\u00e1\2\uffff\3\52\1\uffff\1\52\1\uffff\1\u00e6\1\52\1\u00e8\1\52\1\uffff\1\52\1\uffff\1\u00eb\1\u00ec\2\uffff";
    static final String DFA16_eofS =
        "\u00ed\uffff";
    static final String DFA16_minS =
        "\1\0\1\145\1\uffff\1\160\1\145\1\156\1\141\1\uffff\1\141\1\143\1\145\1\151\4\uffff\1\145\1\uffff\1\156\1\165\4\uffff\1\76\1\uffff\1\52\1\157\1\141\2\145\2\56\1\uffff\1\101\1\uffff\2\0\2\uffff\1\163\1\162\2\uffff\1\157\1\145\1\146\1\147\2\144\1\151\1\141\1\171\1\uffff\1\160\1\156\1\164\1\147\1\141\1\151\1\141\4\uffff\1\146\1\163\1\uffff\1\60\1\164\12\uffff\1\156\1\170\1\156\1\162\2\uffff\1\56\1\uffff\1\56\3\uffff\1\167\1\164\1\155\1\143\1\144\1\164\1\155\1\60\1\141\1\146\1\162\2\145\1\150\1\151\1\55\1\144\1\147\1\163\1\60\1\165\1\160\1\uffff\1\60\1\166\1\55\1\163\2\157\1\162\1\141\1\150\1\60\1\155\1\157\1\uffff\1\164\1\157\1\156\1\162\2\60\1\166\1\uffff\1\60\1\145\1\162\1\150\1\111\1\uffff\1\60\1\162\1\uffff\1\60\1\uffff\1\145\1\60\1\162\1\157\1\154\1\163\1\uffff\1\141\1\151\1\145\1\162\1\151\1\60\2\uffff\1\141\1\uffff\1\154\1\141\1\164\1\156\1\uffff\1\157\1\uffff\1\60\1\uffff\1\153\1\166\1\151\1\60\1\170\1\144\1\162\1\155\1\156\1\uffff\2\164\1\144\1\163\1\151\1\160\1\uffff\1\60\1\163\1\172\1\uffff\4\60\1\147\1\151\1\141\1\60\1\111\1\164\1\60\1\uffff\1\60\1\145\4\uffff\1\122\1\157\1\60\1\uffff\1\156\1\60\2\uffff\1\144\1\141\1\156\1\uffff\1\151\1\uffff\1\60\1\164\1\60\1\164\1\uffff\1\145\1\uffff\2\60\2\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\157\1\uffff\1\160\1\157\1\160\1\145\1\uffff\1\171\1\166\1\145\1\151\4\uffff\1\155\1\uffff\1\156\1\165\4\uffff\1\76\1\uffff\1\57\1\157\1\141\2\145\2\71\1\uffff\1\172\1\uffff\2\uffff\2\uffff\1\164\1\162\2\uffff\1\157\1\145\1\146\1\147\2\144\1\151\1\141\1\171\1\uffff\1\160\1\156\1\164\1\147\1\141\1\151\1\141\4\uffff\1\154\1\163\1\uffff\1\172\1\164\12\uffff\1\156\1\170\1\156\1\162\2\uffff\1\71\1\uffff\1\71\3\uffff\1\167\1\164\1\155\1\143\1\144\1\164\1\155\1\172\1\141\1\146\1\162\2\145\1\150\1\151\1\55\1\155\1\147\1\163\1\172\1\165\1\160\1\uffff\1\172\1\166\1\55\1\163\2\157\1\162\1\141\1\150\1\172\1\155\1\157\1\uffff\1\164\1\157\1\156\1\162\2\172\1\166\1\uffff\1\172\1\145\1\162\1\150\1\111\1\uffff\1\172\1\162\1\uffff\1\172\1\uffff\1\145\1\172\1\162\1\157\1\154\1\163\1\uffff\1\141\1\151\1\145\1\162\1\151\1\172\2\uffff\1\141\1\uffff\1\154\1\141\1\164\1\156\1\uffff\1\157\1\uffff\1\172\1\uffff\1\153\1\166\1\151\1\172\1\170\1\144\1\162\1\155\1\156\1\uffff\2\164\1\144\1\163\1\151\1\160\1\uffff\1\172\1\163\1\172\1\uffff\4\172\1\147\1\151\1\141\1\172\1\111\1\164\1\172\1\uffff\1\172\1\145\4\uffff\1\122\1\157\1\172\1\uffff\1\156\1\172\2\uffff\1\144\1\141\1\156\1\uffff\1\151\1\uffff\1\172\1\164\1\172\1\164\1\uffff\1\145\1\uffff\2\172\2\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\4\uffff\1\7\4\uffff\1\15\1\16\1\17\1\20\1\uffff\1\22\2\uffff\1\25\1\26\1\27\1\30\1\uffff\1\32\7\uffff\1\60\1\uffff\1\63\2\uffff\1\66\1\67\2\uffff\1\63\1\2\11\uffff\1\7\7\uffff\1\15\1\16\1\17\1\20\2\uffff\1\22\2\uffff\1\25\1\26\1\27\1\30\1\61\1\31\1\32\1\62\1\65\1\33\4\uffff\1\55\1\57\1\uffff\1\56\1\uffff\1\60\1\64\1\66\26\uffff\1\23\14\uffff\1\44\7\uffff\1\36\5\uffff\1\21\2\uffff\1\24\1\uffff\1\35\6\uffff\1\4\6\uffff\1\11\1\42\1\uffff\1\45\4\uffff\1\43\1\uffff\1\34\1\uffff\1\52\11\uffff\1\10\6\uffff\1\37\3\uffff\1\3\13\uffff\1\1\2\uffff\1\40\1\41\1\5\1\53\3\uffff\1\50\2\uffff\1\51\1\47\3\uffff\1\46\1\uffff\1\14\4\uffff\1\54\1\uffff\1\12\2\uffff\1\13\1\6";
    static final String DFA16_specialS =
        "\1\1\43\uffff\1\0\1\2\u00c7\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\47\1\44\4\47\1\45\1\17\1\24\1\31\1\27\1\15\1\30\1\47\1\32\1\40\11\37\1\21\1\47\1\25\1\41\1\26\2\47\32\43\1\14\1\47\1\16\1\42\1\43\1\47\1\11\1\13\1\33\1\35\1\3\3\43\1\22\2\43\1\6\1\34\1\1\1\23\2\43\1\20\1\4\1\10\1\5\1\43\1\12\2\43\1\36\1\2\1\47\1\7\uff82\47",
            "\1\50\11\uffff\1\51",
            "",
            "\1\54",
            "\1\55\1\uffff\1\60\1\uffff\1\57\5\uffff\1\56",
            "\1\62\1\uffff\1\61",
            "\1\64\3\uffff\1\63",
            "",
            "\1\67\27\uffff\1\66",
            "\1\70\1\72\21\uffff\1\71",
            "\1\73",
            "\1\74",
            "",
            "",
            "",
            "",
            "\1\101\7\uffff\1\102",
            "",
            "\1\104",
            "\1\105",
            "",
            "",
            "",
            "",
            "\1\112",
            "",
            "\1\115\4\uffff\1\116",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\125\1\uffff\12\126",
            "\1\125\1\uffff\12\130",
            "",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\0\132",
            "\0\132",
            "",
            "",
            "\1\135\1\134",
            "\1\136",
            "",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "",
            "",
            "",
            "\1\157\5\uffff\1\160",
            "\1\161",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\163",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "",
            "\1\125\1\uffff\12\126",
            "",
            "\1\125\1\uffff\12\130",
            "",
            "",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0089\2\uffff\1\u008a\5\uffff\1\u0088",
            "\1\u008b",
            "\1\u008c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u008e",
            "\1\u008f",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u009a",
            "\1\u009b",
            "",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a2",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a9",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00ab",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d8",
            "\1\u00d9",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00dc",
            "",
            "",
            "",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00e0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e7",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e9",
            "",
            "\1\u00ea",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | RULE_INTEGER | RULE_ZINTEGER | RULE_REAL | RULE_ASSIGN | RULE_REFERENCE | RULE_ML_COMMENT | RULE_ID | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_36 = input.LA(1);

                        s = -1;
                        if ( ((LA16_36>='\u0000' && LA16_36<='\uFFFF')) ) {s = 90;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='n') ) {s = 1;}

                        else if ( (LA16_0=='{') ) {s = 2;}

                        else if ( (LA16_0=='e') ) {s = 3;}

                        else if ( (LA16_0=='s') ) {s = 4;}

                        else if ( (LA16_0=='u') ) {s = 5;}

                        else if ( (LA16_0=='l') ) {s = 6;}

                        else if ( (LA16_0=='}') ) {s = 7;}

                        else if ( (LA16_0=='t') ) {s = 8;}

                        else if ( (LA16_0=='a') ) {s = 9;}

                        else if ( (LA16_0=='w') ) {s = 10;}

                        else if ( (LA16_0=='b') ) {s = 11;}

                        else if ( (LA16_0=='[') ) {s = 12;}

                        else if ( (LA16_0==',') ) {s = 13;}

                        else if ( (LA16_0==']') ) {s = 14;}

                        else if ( (LA16_0=='(') ) {s = 15;}

                        else if ( (LA16_0=='r') ) {s = 16;}

                        else if ( (LA16_0==':') ) {s = 17;}

                        else if ( (LA16_0=='i') ) {s = 18;}

                        else if ( (LA16_0=='o') ) {s = 19;}

                        else if ( (LA16_0==')') ) {s = 20;}

                        else if ( (LA16_0=='<') ) {s = 21;}

                        else if ( (LA16_0=='>') ) {s = 22;}

                        else if ( (LA16_0=='+') ) {s = 23;}

                        else if ( (LA16_0=='-') ) {s = 24;}

                        else if ( (LA16_0=='*') ) {s = 25;}

                        else if ( (LA16_0=='/') ) {s = 26;}

                        else if ( (LA16_0=='c') ) {s = 27;}

                        else if ( (LA16_0=='m') ) {s = 28;}

                        else if ( (LA16_0=='d') ) {s = 29;}

                        else if ( (LA16_0=='z') ) {s = 30;}

                        else if ( ((LA16_0>='1' && LA16_0<='9')) ) {s = 31;}

                        else if ( (LA16_0=='0') ) {s = 32;}

                        else if ( (LA16_0=='=') ) {s = 33;}

                        else if ( (LA16_0=='^') ) {s = 34;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='f' && LA16_0<='h')||(LA16_0>='j' && LA16_0<='k')||(LA16_0>='p' && LA16_0<='q')||LA16_0=='v'||(LA16_0>='x' && LA16_0<='y')) ) {s = 35;}

                        else if ( (LA16_0=='\"') ) {s = 36;}

                        else if ( (LA16_0=='\'') ) {s = 37;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 38;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||LA16_0=='.'||LA16_0==';'||(LA16_0>='?' && LA16_0<='@')||LA16_0=='\\'||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_37 = input.LA(1);

                        s = -1;
                        if ( ((LA16_37>='\u0000' && LA16_37<='\uFFFF')) ) {s = 90;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}