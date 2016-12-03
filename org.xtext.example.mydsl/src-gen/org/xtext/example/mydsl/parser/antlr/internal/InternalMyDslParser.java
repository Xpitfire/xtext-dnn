package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ASSIGN", "RULE_INTEGER", "RULE_ZINTEGER", "RULE_REFERENCE", "RULE_REAL", "RULE_INT", "RULE_EXT_INT", "RULE_ML_COMMENT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'network'", "'{'", "'epochs'", "'seed'", "'updater'", "'learningRate'", "'}'", "'layer'", "'type'", "'activation'", "'weightsInit'", "'biasInit'", "'['", "','", "']'", "'('", "'ref'", "':'", "'in'", "'out'", "')'", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'conv'", "'max-pool'", "'avg-pool'", "'dense'", "'softmax'", "'sigmoid'", "'tanh'", "'relu'", "'sgd'", "'adam'", "'adadelta'", "'nestrovs'", "'adagrad'", "'rmsprop'", "'zero'", "'uniform'", "'normalized'"
    };
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:72:1: ruleModel returns [EObject current=null] : ( (lv_network_0_0= ruleNetwork ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_network_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( (lv_network_0_0= ruleNetwork ) ) )
            // InternalMyDsl.g:79:2: ( (lv_network_0_0= ruleNetwork ) )
            {
            // InternalMyDsl.g:79:2: ( (lv_network_0_0= ruleNetwork ) )
            // InternalMyDsl.g:80:3: (lv_network_0_0= ruleNetwork )
            {
            // InternalMyDsl.g:80:3: (lv_network_0_0= ruleNetwork )
            // InternalMyDsl.g:81:4: lv_network_0_0= ruleNetwork
            {

            				newCompositeNode(grammarAccess.getModelAccess().getNetworkNetworkParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_network_0_0=ruleNetwork();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				set(
            					current,
            					"network",
            					lv_network_0_0,
            					"org.xtext.example.mydsl.MyDsl.Network");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNetwork"
    // InternalMyDsl.g:101:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // InternalMyDsl.g:101:48: (iv_ruleNetwork= ruleNetwork EOF )
            // InternalMyDsl.g:102:2: iv_ruleNetwork= ruleNetwork EOF
            {
             newCompositeNode(grammarAccess.getNetworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetwork=ruleNetwork();

            state._fsp--;

             current =iv_ruleNetwork; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNetwork"


    // $ANTLR start "ruleNetwork"
    // InternalMyDsl.g:108:1: ruleNetwork returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'epochs' this_ASSIGN_5= RULE_ASSIGN ( (lv_epochs_6_0= RULE_INTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'seed' this_ASSIGN_8= RULE_ASSIGN ( (lv_seed_9_0= RULE_ZINTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'updater' this_REFERENCE_11= RULE_REFERENCE ( (lv_updaterType_12_0= ruleUpdaterType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'learningRate' this_ASSIGN_14= RULE_ASSIGN ( (lv_learningRate_15_0= ruleVariableAssignment ) ) ( (lv_layers_16_0= ruleLayer ) )* otherlv_17= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleNetwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_ASSIGN_5=null;
        Token lv_epochs_6_0=null;
        Token otherlv_7=null;
        Token this_ASSIGN_8=null;
        Token lv_seed_9_0=null;
        Token otherlv_10=null;
        Token this_REFERENCE_11=null;
        Token otherlv_13=null;
        Token this_ASSIGN_14=null;
        Token otherlv_17=null;
        Enumerator lv_updaterType_12_0 = null;

        EObject lv_learningRate_15_0 = null;

        EObject lv_layers_16_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:114:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'epochs' this_ASSIGN_5= RULE_ASSIGN ( (lv_epochs_6_0= RULE_INTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'seed' this_ASSIGN_8= RULE_ASSIGN ( (lv_seed_9_0= RULE_ZINTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'updater' this_REFERENCE_11= RULE_REFERENCE ( (lv_updaterType_12_0= ruleUpdaterType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'learningRate' this_ASSIGN_14= RULE_ASSIGN ( (lv_learningRate_15_0= ruleVariableAssignment ) ) ( (lv_layers_16_0= ruleLayer ) )* otherlv_17= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalMyDsl.g:115:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'epochs' this_ASSIGN_5= RULE_ASSIGN ( (lv_epochs_6_0= RULE_INTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'seed' this_ASSIGN_8= RULE_ASSIGN ( (lv_seed_9_0= RULE_ZINTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'updater' this_REFERENCE_11= RULE_REFERENCE ( (lv_updaterType_12_0= ruleUpdaterType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'learningRate' this_ASSIGN_14= RULE_ASSIGN ( (lv_learningRate_15_0= ruleVariableAssignment ) ) ( (lv_layers_16_0= ruleLayer ) )* otherlv_17= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalMyDsl.g:115:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'epochs' this_ASSIGN_5= RULE_ASSIGN ( (lv_epochs_6_0= RULE_INTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'seed' this_ASSIGN_8= RULE_ASSIGN ( (lv_seed_9_0= RULE_ZINTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'updater' this_REFERENCE_11= RULE_REFERENCE ( (lv_updaterType_12_0= ruleUpdaterType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'learningRate' this_ASSIGN_14= RULE_ASSIGN ( (lv_learningRate_15_0= ruleVariableAssignment ) ) ( (lv_layers_16_0= ruleLayer ) )* otherlv_17= '}' ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:116:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'epochs' this_ASSIGN_5= RULE_ASSIGN ( (lv_epochs_6_0= RULE_INTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'seed' this_ASSIGN_8= RULE_ASSIGN ( (lv_seed_9_0= RULE_ZINTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'updater' this_REFERENCE_11= RULE_REFERENCE ( (lv_updaterType_12_0= ruleUpdaterType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'learningRate' this_ASSIGN_14= RULE_ASSIGN ( (lv_learningRate_15_0= ruleVariableAssignment ) ) ( (lv_layers_16_0= ruleLayer ) )* otherlv_17= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:116:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'epochs' this_ASSIGN_5= RULE_ASSIGN ( (lv_epochs_6_0= RULE_INTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'seed' this_ASSIGN_8= RULE_ASSIGN ( (lv_seed_9_0= RULE_ZINTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'updater' this_REFERENCE_11= RULE_REFERENCE ( (lv_updaterType_12_0= ruleUpdaterType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'learningRate' this_ASSIGN_14= RULE_ASSIGN ( (lv_learningRate_15_0= ruleVariableAssignment ) ) ( (lv_layers_16_0= ruleLayer ) )* otherlv_17= '}' ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:117:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'epochs' this_ASSIGN_5= RULE_ASSIGN ( (lv_epochs_6_0= RULE_INTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'seed' this_ASSIGN_8= RULE_ASSIGN ( (lv_seed_9_0= RULE_ZINTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'updater' this_REFERENCE_11= RULE_REFERENCE ( (lv_updaterType_12_0= ruleUpdaterType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'learningRate' this_ASSIGN_14= RULE_ASSIGN ( (lv_learningRate_15_0= ruleVariableAssignment ) ) ( (lv_layers_16_0= ruleLayer ) )* otherlv_17= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getNetworkAccess().getUnorderedGroup());
            			
            // InternalMyDsl.g:120:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'epochs' this_ASSIGN_5= RULE_ASSIGN ( (lv_epochs_6_0= RULE_INTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'seed' this_ASSIGN_8= RULE_ASSIGN ( (lv_seed_9_0= RULE_ZINTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'updater' this_REFERENCE_11= RULE_REFERENCE ( (lv_updaterType_12_0= ruleUpdaterType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'learningRate' this_ASSIGN_14= RULE_ASSIGN ( (lv_learningRate_15_0= ruleVariableAssignment ) ) ( (lv_layers_16_0= ruleLayer ) )* otherlv_17= '}' ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:121:5: ( ({...}? => ( ({...}? => (otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'epochs' this_ASSIGN_5= RULE_ASSIGN ( (lv_epochs_6_0= RULE_INTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'seed' this_ASSIGN_8= RULE_ASSIGN ( (lv_seed_9_0= RULE_ZINTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'updater' this_REFERENCE_11= RULE_REFERENCE ( (lv_updaterType_12_0= ruleUpdaterType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'learningRate' this_ASSIGN_14= RULE_ASSIGN ( (lv_learningRate_15_0= ruleVariableAssignment ) ) ( (lv_layers_16_0= ruleLayer ) )* otherlv_17= '}' ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:121:5: ( ({...}? => ( ({...}? => (otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'epochs' this_ASSIGN_5= RULE_ASSIGN ( (lv_epochs_6_0= RULE_INTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'seed' this_ASSIGN_8= RULE_ASSIGN ( (lv_seed_9_0= RULE_ZINTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'updater' this_REFERENCE_11= RULE_REFERENCE ( (lv_updaterType_12_0= ruleUpdaterType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'learningRate' this_ASSIGN_14= RULE_ASSIGN ( (lv_learningRate_15_0= ruleVariableAssignment ) ) ( (lv_layers_16_0= ruleLayer ) )* otherlv_17= '}' ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=6;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 1) ) {
                    alt2=2;
                }
                else if ( LA2_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 2) ) {
                    alt2=3;
                }
                else if ( LA2_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 3) ) {
                    alt2=4;
                }
                else if ( LA2_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 4) ) {
                    alt2=5;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:122:3: ({...}? => ( ({...}? => (otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) )
            	    {
            	    // InternalMyDsl.g:122:3: ({...}? => ( ({...}? => (otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) )
            	    // InternalMyDsl.g:123:4: {...}? => ( ({...}? => (otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalMyDsl.g:123:101: ( ({...}? => (otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) )
            	    // InternalMyDsl.g:124:5: ({...}? => (otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalMyDsl.g:127:8: ({...}? => (otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) )
            	    // InternalMyDsl.g:127:9: {...}? => (otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNetwork", "true");
            	    }
            	    // InternalMyDsl.g:127:18: (otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' )
            	    // InternalMyDsl.g:127:19: otherlv_1= 'network' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{'
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getNetworkAccess().getNetworkKeyword_0_0());
            	    							
            	    // InternalMyDsl.g:131:8: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalMyDsl.g:132:9: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalMyDsl.g:132:9: (lv_name_2_0= RULE_ID )
            	    // InternalMyDsl.g:133:10: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    										newLeafNode(lv_name_2_0, grammarAccess.getNetworkAccess().getNameIDTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getNetworkRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"name",
            	    											lv_name_2_0,
            	    											"org.eclipse.xtext.common.Terminals.ID");
            	    									

            	    }


            	    }

            	    otherlv_3=(Token)match(input,18,FOLLOW_5); 

            	    								newLeafNode(otherlv_3, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_0_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:159:3: ({...}? => ( ({...}? => (otherlv_4= 'epochs' this_ASSIGN_5= RULE_ASSIGN ( (lv_epochs_6_0= RULE_INTEGER ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:159:3: ({...}? => ( ({...}? => (otherlv_4= 'epochs' this_ASSIGN_5= RULE_ASSIGN ( (lv_epochs_6_0= RULE_INTEGER ) ) ) ) ) )
            	    // InternalMyDsl.g:160:4: {...}? => ( ({...}? => (otherlv_4= 'epochs' this_ASSIGN_5= RULE_ASSIGN ( (lv_epochs_6_0= RULE_INTEGER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalMyDsl.g:160:101: ( ({...}? => (otherlv_4= 'epochs' this_ASSIGN_5= RULE_ASSIGN ( (lv_epochs_6_0= RULE_INTEGER ) ) ) ) )
            	    // InternalMyDsl.g:161:5: ({...}? => (otherlv_4= 'epochs' this_ASSIGN_5= RULE_ASSIGN ( (lv_epochs_6_0= RULE_INTEGER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalMyDsl.g:164:8: ({...}? => (otherlv_4= 'epochs' this_ASSIGN_5= RULE_ASSIGN ( (lv_epochs_6_0= RULE_INTEGER ) ) ) )
            	    // InternalMyDsl.g:164:9: {...}? => (otherlv_4= 'epochs' this_ASSIGN_5= RULE_ASSIGN ( (lv_epochs_6_0= RULE_INTEGER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNetwork", "true");
            	    }
            	    // InternalMyDsl.g:164:18: (otherlv_4= 'epochs' this_ASSIGN_5= RULE_ASSIGN ( (lv_epochs_6_0= RULE_INTEGER ) ) )
            	    // InternalMyDsl.g:164:19: otherlv_4= 'epochs' this_ASSIGN_5= RULE_ASSIGN ( (lv_epochs_6_0= RULE_INTEGER ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_6); 

            	    								newLeafNode(otherlv_4, grammarAccess.getNetworkAccess().getEpochsKeyword_1_0());
            	    							
            	    this_ASSIGN_5=(Token)match(input,RULE_ASSIGN,FOLLOW_7); 

            	    								newLeafNode(this_ASSIGN_5, grammarAccess.getNetworkAccess().getASSIGNTerminalRuleCall_1_1());
            	    							
            	    // InternalMyDsl.g:172:8: ( (lv_epochs_6_0= RULE_INTEGER ) )
            	    // InternalMyDsl.g:173:9: (lv_epochs_6_0= RULE_INTEGER )
            	    {
            	    // InternalMyDsl.g:173:9: (lv_epochs_6_0= RULE_INTEGER )
            	    // InternalMyDsl.g:174:10: lv_epochs_6_0= RULE_INTEGER
            	    {
            	    lv_epochs_6_0=(Token)match(input,RULE_INTEGER,FOLLOW_5); 

            	    										newLeafNode(lv_epochs_6_0, grammarAccess.getNetworkAccess().getEpochsINTEGERTerminalRuleCall_1_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getNetworkRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"epochs",
            	    											lv_epochs_6_0,
            	    											"org.xtext.example.mydsl.MyDsl.INTEGER");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:196:3: ({...}? => ( ({...}? => (otherlv_7= 'seed' this_ASSIGN_8= RULE_ASSIGN ( (lv_seed_9_0= RULE_ZINTEGER ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:196:3: ({...}? => ( ({...}? => (otherlv_7= 'seed' this_ASSIGN_8= RULE_ASSIGN ( (lv_seed_9_0= RULE_ZINTEGER ) ) ) ) ) )
            	    // InternalMyDsl.g:197:4: {...}? => ( ({...}? => (otherlv_7= 'seed' this_ASSIGN_8= RULE_ASSIGN ( (lv_seed_9_0= RULE_ZINTEGER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalMyDsl.g:197:101: ( ({...}? => (otherlv_7= 'seed' this_ASSIGN_8= RULE_ASSIGN ( (lv_seed_9_0= RULE_ZINTEGER ) ) ) ) )
            	    // InternalMyDsl.g:198:5: ({...}? => (otherlv_7= 'seed' this_ASSIGN_8= RULE_ASSIGN ( (lv_seed_9_0= RULE_ZINTEGER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalMyDsl.g:201:8: ({...}? => (otherlv_7= 'seed' this_ASSIGN_8= RULE_ASSIGN ( (lv_seed_9_0= RULE_ZINTEGER ) ) ) )
            	    // InternalMyDsl.g:201:9: {...}? => (otherlv_7= 'seed' this_ASSIGN_8= RULE_ASSIGN ( (lv_seed_9_0= RULE_ZINTEGER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNetwork", "true");
            	    }
            	    // InternalMyDsl.g:201:18: (otherlv_7= 'seed' this_ASSIGN_8= RULE_ASSIGN ( (lv_seed_9_0= RULE_ZINTEGER ) ) )
            	    // InternalMyDsl.g:201:19: otherlv_7= 'seed' this_ASSIGN_8= RULE_ASSIGN ( (lv_seed_9_0= RULE_ZINTEGER ) )
            	    {
            	    otherlv_7=(Token)match(input,20,FOLLOW_6); 

            	    								newLeafNode(otherlv_7, grammarAccess.getNetworkAccess().getSeedKeyword_2_0());
            	    							
            	    this_ASSIGN_8=(Token)match(input,RULE_ASSIGN,FOLLOW_8); 

            	    								newLeafNode(this_ASSIGN_8, grammarAccess.getNetworkAccess().getASSIGNTerminalRuleCall_2_1());
            	    							
            	    // InternalMyDsl.g:209:8: ( (lv_seed_9_0= RULE_ZINTEGER ) )
            	    // InternalMyDsl.g:210:9: (lv_seed_9_0= RULE_ZINTEGER )
            	    {
            	    // InternalMyDsl.g:210:9: (lv_seed_9_0= RULE_ZINTEGER )
            	    // InternalMyDsl.g:211:10: lv_seed_9_0= RULE_ZINTEGER
            	    {
            	    lv_seed_9_0=(Token)match(input,RULE_ZINTEGER,FOLLOW_5); 

            	    										newLeafNode(lv_seed_9_0, grammarAccess.getNetworkAccess().getSeedZINTEGERTerminalRuleCall_2_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getNetworkRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"seed",
            	    											lv_seed_9_0,
            	    											"org.xtext.example.mydsl.MyDsl.ZINTEGER");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:233:3: ({...}? => ( ({...}? => (otherlv_10= 'updater' this_REFERENCE_11= RULE_REFERENCE ( (lv_updaterType_12_0= ruleUpdaterType ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:233:3: ({...}? => ( ({...}? => (otherlv_10= 'updater' this_REFERENCE_11= RULE_REFERENCE ( (lv_updaterType_12_0= ruleUpdaterType ) ) ) ) ) )
            	    // InternalMyDsl.g:234:4: {...}? => ( ({...}? => (otherlv_10= 'updater' this_REFERENCE_11= RULE_REFERENCE ( (lv_updaterType_12_0= ruleUpdaterType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalMyDsl.g:234:101: ( ({...}? => (otherlv_10= 'updater' this_REFERENCE_11= RULE_REFERENCE ( (lv_updaterType_12_0= ruleUpdaterType ) ) ) ) )
            	    // InternalMyDsl.g:235:5: ({...}? => (otherlv_10= 'updater' this_REFERENCE_11= RULE_REFERENCE ( (lv_updaterType_12_0= ruleUpdaterType ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalMyDsl.g:238:8: ({...}? => (otherlv_10= 'updater' this_REFERENCE_11= RULE_REFERENCE ( (lv_updaterType_12_0= ruleUpdaterType ) ) ) )
            	    // InternalMyDsl.g:238:9: {...}? => (otherlv_10= 'updater' this_REFERENCE_11= RULE_REFERENCE ( (lv_updaterType_12_0= ruleUpdaterType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNetwork", "true");
            	    }
            	    // InternalMyDsl.g:238:18: (otherlv_10= 'updater' this_REFERENCE_11= RULE_REFERENCE ( (lv_updaterType_12_0= ruleUpdaterType ) ) )
            	    // InternalMyDsl.g:238:19: otherlv_10= 'updater' this_REFERENCE_11= RULE_REFERENCE ( (lv_updaterType_12_0= ruleUpdaterType ) )
            	    {
            	    otherlv_10=(Token)match(input,21,FOLLOW_9); 

            	    								newLeafNode(otherlv_10, grammarAccess.getNetworkAccess().getUpdaterKeyword_3_0());
            	    							
            	    this_REFERENCE_11=(Token)match(input,RULE_REFERENCE,FOLLOW_10); 

            	    								newLeafNode(this_REFERENCE_11, grammarAccess.getNetworkAccess().getREFERENCETerminalRuleCall_3_1());
            	    							
            	    // InternalMyDsl.g:246:8: ( (lv_updaterType_12_0= ruleUpdaterType ) )
            	    // InternalMyDsl.g:247:9: (lv_updaterType_12_0= ruleUpdaterType )
            	    {
            	    // InternalMyDsl.g:247:9: (lv_updaterType_12_0= ruleUpdaterType )
            	    // InternalMyDsl.g:248:10: lv_updaterType_12_0= ruleUpdaterType
            	    {

            	    										newCompositeNode(grammarAccess.getNetworkAccess().getUpdaterTypeUpdaterTypeEnumRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_updaterType_12_0=ruleUpdaterType();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getNetworkRule());
            	    										}
            	    										set(
            	    											current,
            	    											"updaterType",
            	    											lv_updaterType_12_0,
            	    											"org.xtext.example.mydsl.MyDsl.UpdaterType");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:271:3: ({...}? => ( ({...}? => (otherlv_13= 'learningRate' this_ASSIGN_14= RULE_ASSIGN ( (lv_learningRate_15_0= ruleVariableAssignment ) ) ( (lv_layers_16_0= ruleLayer ) )* otherlv_17= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:271:3: ({...}? => ( ({...}? => (otherlv_13= 'learningRate' this_ASSIGN_14= RULE_ASSIGN ( (lv_learningRate_15_0= ruleVariableAssignment ) ) ( (lv_layers_16_0= ruleLayer ) )* otherlv_17= '}' ) ) ) )
            	    // InternalMyDsl.g:272:4: {...}? => ( ({...}? => (otherlv_13= 'learningRate' this_ASSIGN_14= RULE_ASSIGN ( (lv_learningRate_15_0= ruleVariableAssignment ) ) ( (lv_layers_16_0= ruleLayer ) )* otherlv_17= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalMyDsl.g:272:101: ( ({...}? => (otherlv_13= 'learningRate' this_ASSIGN_14= RULE_ASSIGN ( (lv_learningRate_15_0= ruleVariableAssignment ) ) ( (lv_layers_16_0= ruleLayer ) )* otherlv_17= '}' ) ) )
            	    // InternalMyDsl.g:273:5: ({...}? => (otherlv_13= 'learningRate' this_ASSIGN_14= RULE_ASSIGN ( (lv_learningRate_15_0= ruleVariableAssignment ) ) ( (lv_layers_16_0= ruleLayer ) )* otherlv_17= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalMyDsl.g:276:8: ({...}? => (otherlv_13= 'learningRate' this_ASSIGN_14= RULE_ASSIGN ( (lv_learningRate_15_0= ruleVariableAssignment ) ) ( (lv_layers_16_0= ruleLayer ) )* otherlv_17= '}' ) )
            	    // InternalMyDsl.g:276:9: {...}? => (otherlv_13= 'learningRate' this_ASSIGN_14= RULE_ASSIGN ( (lv_learningRate_15_0= ruleVariableAssignment ) ) ( (lv_layers_16_0= ruleLayer ) )* otherlv_17= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNetwork", "true");
            	    }
            	    // InternalMyDsl.g:276:18: (otherlv_13= 'learningRate' this_ASSIGN_14= RULE_ASSIGN ( (lv_learningRate_15_0= ruleVariableAssignment ) ) ( (lv_layers_16_0= ruleLayer ) )* otherlv_17= '}' )
            	    // InternalMyDsl.g:276:19: otherlv_13= 'learningRate' this_ASSIGN_14= RULE_ASSIGN ( (lv_learningRate_15_0= ruleVariableAssignment ) ) ( (lv_layers_16_0= ruleLayer ) )* otherlv_17= '}'
            	    {
            	    otherlv_13=(Token)match(input,22,FOLLOW_6); 

            	    								newLeafNode(otherlv_13, grammarAccess.getNetworkAccess().getLearningRateKeyword_4_0());
            	    							
            	    this_ASSIGN_14=(Token)match(input,RULE_ASSIGN,FOLLOW_11); 

            	    								newLeafNode(this_ASSIGN_14, grammarAccess.getNetworkAccess().getASSIGNTerminalRuleCall_4_1());
            	    							
            	    // InternalMyDsl.g:284:8: ( (lv_learningRate_15_0= ruleVariableAssignment ) )
            	    // InternalMyDsl.g:285:9: (lv_learningRate_15_0= ruleVariableAssignment )
            	    {
            	    // InternalMyDsl.g:285:9: (lv_learningRate_15_0= ruleVariableAssignment )
            	    // InternalMyDsl.g:286:10: lv_learningRate_15_0= ruleVariableAssignment
            	    {

            	    										newCompositeNode(grammarAccess.getNetworkAccess().getLearningRateVariableAssignmentParserRuleCall_4_2_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_learningRate_15_0=ruleVariableAssignment();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getNetworkRule());
            	    										}
            	    										set(
            	    											current,
            	    											"learningRate",
            	    											lv_learningRate_15_0,
            	    											"org.xtext.example.mydsl.MyDsl.VariableAssignment");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalMyDsl.g:303:8: ( (lv_layers_16_0= ruleLayer ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==23) ) {
            	            int LA1_1 = input.LA(2);

            	            if ( ((LA1_1>=23 && LA1_1<=24)||(LA1_1>=27 && LA1_1<=28)) ) {
            	                alt1=1;
            	            }


            	        }
            	        else if ( (LA1_0==24||(LA1_0>=27 && LA1_0<=28)) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:304:9: (lv_layers_16_0= ruleLayer )
            	    	    {
            	    	    // InternalMyDsl.g:304:9: (lv_layers_16_0= ruleLayer )
            	    	    // InternalMyDsl.g:305:10: lv_layers_16_0= ruleLayer
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getNetworkAccess().getLayersLayerParserRuleCall_4_3_0());
            	    	    									
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_layers_16_0=ruleLayer();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getNetworkRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"layers",
            	    	    											lv_layers_16_0,
            	    	    											"org.xtext.example.mydsl.MyDsl.Layer");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);

            	    otherlv_17=(Token)match(input,23,FOLLOW_5); 

            	    								newLeafNode(otherlv_17, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_4_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getNetworkAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canLeave(grammarAccess.getNetworkAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getNetworkAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNetwork"


    // $ANTLR start "entryRuleLayer"
    // InternalMyDsl.g:343:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalMyDsl.g:343:46: (iv_ruleLayer= ruleLayer EOF )
            // InternalMyDsl.g:344:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalMyDsl.g:350:1: ruleLayer returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'layer' ( (lv_layerDecl_2_0= ruleLayerDeclaration ) ) otherlv_3= '{' otherlv_4= 'type' this_REFERENCE_5= RULE_REFERENCE ( (lv_layerType_6_0= ruleLayerType ) ) (otherlv_7= 'activation' this_REFERENCE_8= RULE_REFERENCE ( (lv_activType_9_0= ruleActivationFunctionType ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'weightsInit' this_REFERENCE_11= RULE_REFERENCE ( (lv_weightInit_12_0= ruleWeightInitType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= 'biasInit' this_ASSIGN_14= RULE_ASSIGN ( (lv_biasInit_15_0= RULE_REAL ) ) )? otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_REFERENCE_5=null;
        Token otherlv_7=null;
        Token this_REFERENCE_8=null;
        Token otherlv_10=null;
        Token this_REFERENCE_11=null;
        Token otherlv_13=null;
        Token this_ASSIGN_14=null;
        Token lv_biasInit_15_0=null;
        Token otherlv_16=null;
        EObject lv_layerDecl_2_0 = null;

        Enumerator lv_layerType_6_0 = null;

        Enumerator lv_activType_9_0 = null;

        Enumerator lv_weightInit_12_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:356:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'layer' ( (lv_layerDecl_2_0= ruleLayerDeclaration ) ) otherlv_3= '{' otherlv_4= 'type' this_REFERENCE_5= RULE_REFERENCE ( (lv_layerType_6_0= ruleLayerType ) ) (otherlv_7= 'activation' this_REFERENCE_8= RULE_REFERENCE ( (lv_activType_9_0= ruleActivationFunctionType ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'weightsInit' this_REFERENCE_11= RULE_REFERENCE ( (lv_weightInit_12_0= ruleWeightInitType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= 'biasInit' this_ASSIGN_14= RULE_ASSIGN ( (lv_biasInit_15_0= RULE_REAL ) ) )? otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalMyDsl.g:357:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'layer' ( (lv_layerDecl_2_0= ruleLayerDeclaration ) ) otherlv_3= '{' otherlv_4= 'type' this_REFERENCE_5= RULE_REFERENCE ( (lv_layerType_6_0= ruleLayerType ) ) (otherlv_7= 'activation' this_REFERENCE_8= RULE_REFERENCE ( (lv_activType_9_0= ruleActivationFunctionType ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'weightsInit' this_REFERENCE_11= RULE_REFERENCE ( (lv_weightInit_12_0= ruleWeightInitType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= 'biasInit' this_ASSIGN_14= RULE_ASSIGN ( (lv_biasInit_15_0= RULE_REAL ) ) )? otherlv_16= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalMyDsl.g:357:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'layer' ( (lv_layerDecl_2_0= ruleLayerDeclaration ) ) otherlv_3= '{' otherlv_4= 'type' this_REFERENCE_5= RULE_REFERENCE ( (lv_layerType_6_0= ruleLayerType ) ) (otherlv_7= 'activation' this_REFERENCE_8= RULE_REFERENCE ( (lv_activType_9_0= ruleActivationFunctionType ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'weightsInit' this_REFERENCE_11= RULE_REFERENCE ( (lv_weightInit_12_0= ruleWeightInitType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= 'biasInit' this_ASSIGN_14= RULE_ASSIGN ( (lv_biasInit_15_0= RULE_REAL ) ) )? otherlv_16= '}' ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:358:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'layer' ( (lv_layerDecl_2_0= ruleLayerDeclaration ) ) otherlv_3= '{' otherlv_4= 'type' this_REFERENCE_5= RULE_REFERENCE ( (lv_layerType_6_0= ruleLayerType ) ) (otherlv_7= 'activation' this_REFERENCE_8= RULE_REFERENCE ( (lv_activType_9_0= ruleActivationFunctionType ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'weightsInit' this_REFERENCE_11= RULE_REFERENCE ( (lv_weightInit_12_0= ruleWeightInitType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= 'biasInit' this_ASSIGN_14= RULE_ASSIGN ( (lv_biasInit_15_0= RULE_REAL ) ) )? otherlv_16= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:358:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'layer' ( (lv_layerDecl_2_0= ruleLayerDeclaration ) ) otherlv_3= '{' otherlv_4= 'type' this_REFERENCE_5= RULE_REFERENCE ( (lv_layerType_6_0= ruleLayerType ) ) (otherlv_7= 'activation' this_REFERENCE_8= RULE_REFERENCE ( (lv_activType_9_0= ruleActivationFunctionType ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'weightsInit' this_REFERENCE_11= RULE_REFERENCE ( (lv_weightInit_12_0= ruleWeightInitType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= 'biasInit' this_ASSIGN_14= RULE_ASSIGN ( (lv_biasInit_15_0= RULE_REAL ) ) )? otherlv_16= '}' ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:359:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'layer' ( (lv_layerDecl_2_0= ruleLayerDeclaration ) ) otherlv_3= '{' otherlv_4= 'type' this_REFERENCE_5= RULE_REFERENCE ( (lv_layerType_6_0= ruleLayerType ) ) (otherlv_7= 'activation' this_REFERENCE_8= RULE_REFERENCE ( (lv_activType_9_0= ruleActivationFunctionType ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'weightsInit' this_REFERENCE_11= RULE_REFERENCE ( (lv_weightInit_12_0= ruleWeightInitType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= 'biasInit' this_ASSIGN_14= RULE_ASSIGN ( (lv_biasInit_15_0= RULE_REAL ) ) )? otherlv_16= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getLayerAccess().getUnorderedGroup());
            			
            // InternalMyDsl.g:362:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'layer' ( (lv_layerDecl_2_0= ruleLayerDeclaration ) ) otherlv_3= '{' otherlv_4= 'type' this_REFERENCE_5= RULE_REFERENCE ( (lv_layerType_6_0= ruleLayerType ) ) (otherlv_7= 'activation' this_REFERENCE_8= RULE_REFERENCE ( (lv_activType_9_0= ruleActivationFunctionType ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'weightsInit' this_REFERENCE_11= RULE_REFERENCE ( (lv_weightInit_12_0= ruleWeightInitType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= 'biasInit' this_ASSIGN_14= RULE_ASSIGN ( (lv_biasInit_15_0= RULE_REAL ) ) )? otherlv_16= '}' ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:363:5: ( ({...}? => ( ({...}? => (otherlv_1= 'layer' ( (lv_layerDecl_2_0= ruleLayerDeclaration ) ) otherlv_3= '{' otherlv_4= 'type' this_REFERENCE_5= RULE_REFERENCE ( (lv_layerType_6_0= ruleLayerType ) ) (otherlv_7= 'activation' this_REFERENCE_8= RULE_REFERENCE ( (lv_activType_9_0= ruleActivationFunctionType ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'weightsInit' this_REFERENCE_11= RULE_REFERENCE ( (lv_weightInit_12_0= ruleWeightInitType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= 'biasInit' this_ASSIGN_14= RULE_ASSIGN ( (lv_biasInit_15_0= RULE_REAL ) ) )? otherlv_16= '}' ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:363:5: ( ({...}? => ( ({...}? => (otherlv_1= 'layer' ( (lv_layerDecl_2_0= ruleLayerDeclaration ) ) otherlv_3= '{' otherlv_4= 'type' this_REFERENCE_5= RULE_REFERENCE ( (lv_layerType_6_0= ruleLayerType ) ) (otherlv_7= 'activation' this_REFERENCE_8= RULE_REFERENCE ( (lv_activType_9_0= ruleActivationFunctionType ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'weightsInit' this_REFERENCE_11= RULE_REFERENCE ( (lv_weightInit_12_0= ruleWeightInitType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= 'biasInit' this_ASSIGN_14= RULE_ASSIGN ( (lv_biasInit_15_0= RULE_REAL ) ) )? otherlv_16= '}' ) ) ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=4;
                switch ( input.LA(1) ) {
                case 23:
                    {
                    int LA5_1 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 2) ) {
                        alt5=3;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA5_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 0) ) {
                        alt5=1;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA5_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 1) ) {
                        alt5=2;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA5_4 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 2) ) {
                        alt5=3;
                    }


                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:364:3: ({...}? => ( ({...}? => (otherlv_1= 'layer' ( (lv_layerDecl_2_0= ruleLayerDeclaration ) ) otherlv_3= '{' otherlv_4= 'type' this_REFERENCE_5= RULE_REFERENCE ( (lv_layerType_6_0= ruleLayerType ) ) (otherlv_7= 'activation' this_REFERENCE_8= RULE_REFERENCE ( (lv_activType_9_0= ruleActivationFunctionType ) ) )? ) ) ) )
            	    {
            	    // InternalMyDsl.g:364:3: ({...}? => ( ({...}? => (otherlv_1= 'layer' ( (lv_layerDecl_2_0= ruleLayerDeclaration ) ) otherlv_3= '{' otherlv_4= 'type' this_REFERENCE_5= RULE_REFERENCE ( (lv_layerType_6_0= ruleLayerType ) ) (otherlv_7= 'activation' this_REFERENCE_8= RULE_REFERENCE ( (lv_activType_9_0= ruleActivationFunctionType ) ) )? ) ) ) )
            	    // InternalMyDsl.g:365:4: {...}? => ( ({...}? => (otherlv_1= 'layer' ( (lv_layerDecl_2_0= ruleLayerDeclaration ) ) otherlv_3= '{' otherlv_4= 'type' this_REFERENCE_5= RULE_REFERENCE ( (lv_layerType_6_0= ruleLayerType ) ) (otherlv_7= 'activation' this_REFERENCE_8= RULE_REFERENCE ( (lv_activType_9_0= ruleActivationFunctionType ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLayer", "getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalMyDsl.g:365:99: ( ({...}? => (otherlv_1= 'layer' ( (lv_layerDecl_2_0= ruleLayerDeclaration ) ) otherlv_3= '{' otherlv_4= 'type' this_REFERENCE_5= RULE_REFERENCE ( (lv_layerType_6_0= ruleLayerType ) ) (otherlv_7= 'activation' this_REFERENCE_8= RULE_REFERENCE ( (lv_activType_9_0= ruleActivationFunctionType ) ) )? ) ) )
            	    // InternalMyDsl.g:366:5: ({...}? => (otherlv_1= 'layer' ( (lv_layerDecl_2_0= ruleLayerDeclaration ) ) otherlv_3= '{' otherlv_4= 'type' this_REFERENCE_5= RULE_REFERENCE ( (lv_layerType_6_0= ruleLayerType ) ) (otherlv_7= 'activation' this_REFERENCE_8= RULE_REFERENCE ( (lv_activType_9_0= ruleActivationFunctionType ) ) )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLayerAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalMyDsl.g:369:8: ({...}? => (otherlv_1= 'layer' ( (lv_layerDecl_2_0= ruleLayerDeclaration ) ) otherlv_3= '{' otherlv_4= 'type' this_REFERENCE_5= RULE_REFERENCE ( (lv_layerType_6_0= ruleLayerType ) ) (otherlv_7= 'activation' this_REFERENCE_8= RULE_REFERENCE ( (lv_activType_9_0= ruleActivationFunctionType ) ) )? ) )
            	    // InternalMyDsl.g:369:9: {...}? => (otherlv_1= 'layer' ( (lv_layerDecl_2_0= ruleLayerDeclaration ) ) otherlv_3= '{' otherlv_4= 'type' this_REFERENCE_5= RULE_REFERENCE ( (lv_layerType_6_0= ruleLayerType ) ) (otherlv_7= 'activation' this_REFERENCE_8= RULE_REFERENCE ( (lv_activType_9_0= ruleActivationFunctionType ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLayer", "true");
            	    }
            	    // InternalMyDsl.g:369:18: (otherlv_1= 'layer' ( (lv_layerDecl_2_0= ruleLayerDeclaration ) ) otherlv_3= '{' otherlv_4= 'type' this_REFERENCE_5= RULE_REFERENCE ( (lv_layerType_6_0= ruleLayerType ) ) (otherlv_7= 'activation' this_REFERENCE_8= RULE_REFERENCE ( (lv_activType_9_0= ruleActivationFunctionType ) ) )? )
            	    // InternalMyDsl.g:369:19: otherlv_1= 'layer' ( (lv_layerDecl_2_0= ruleLayerDeclaration ) ) otherlv_3= '{' otherlv_4= 'type' this_REFERENCE_5= RULE_REFERENCE ( (lv_layerType_6_0= ruleLayerType ) ) (otherlv_7= 'activation' this_REFERENCE_8= RULE_REFERENCE ( (lv_activType_9_0= ruleActivationFunctionType ) ) )?
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_13); 

            	    								newLeafNode(otherlv_1, grammarAccess.getLayerAccess().getLayerKeyword_0_0());
            	    							
            	    // InternalMyDsl.g:373:8: ( (lv_layerDecl_2_0= ruleLayerDeclaration ) )
            	    // InternalMyDsl.g:374:9: (lv_layerDecl_2_0= ruleLayerDeclaration )
            	    {
            	    // InternalMyDsl.g:374:9: (lv_layerDecl_2_0= ruleLayerDeclaration )
            	    // InternalMyDsl.g:375:10: lv_layerDecl_2_0= ruleLayerDeclaration
            	    {

            	    										newCompositeNode(grammarAccess.getLayerAccess().getLayerDeclLayerDeclarationParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_layerDecl_2_0=ruleLayerDeclaration();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLayerRule());
            	    										}
            	    										set(
            	    											current,
            	    											"layerDecl",
            	    											lv_layerDecl_2_0,
            	    											"org.xtext.example.mydsl.MyDsl.LayerDeclaration");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_3=(Token)match(input,18,FOLLOW_14); 

            	    								newLeafNode(otherlv_3, grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_0_2());
            	    							
            	    otherlv_4=(Token)match(input,25,FOLLOW_9); 

            	    								newLeafNode(otherlv_4, grammarAccess.getLayerAccess().getTypeKeyword_0_3());
            	    							
            	    this_REFERENCE_5=(Token)match(input,RULE_REFERENCE,FOLLOW_15); 

            	    								newLeafNode(this_REFERENCE_5, grammarAccess.getLayerAccess().getREFERENCETerminalRuleCall_0_4());
            	    							
            	    // InternalMyDsl.g:404:8: ( (lv_layerType_6_0= ruleLayerType ) )
            	    // InternalMyDsl.g:405:9: (lv_layerType_6_0= ruleLayerType )
            	    {
            	    // InternalMyDsl.g:405:9: (lv_layerType_6_0= ruleLayerType )
            	    // InternalMyDsl.g:406:10: lv_layerType_6_0= ruleLayerType
            	    {

            	    										newCompositeNode(grammarAccess.getLayerAccess().getLayerTypeLayerTypeEnumRuleCall_0_5_0());
            	    									
            	    pushFollow(FOLLOW_16);
            	    lv_layerType_6_0=ruleLayerType();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLayerRule());
            	    										}
            	    										set(
            	    											current,
            	    											"layerType",
            	    											lv_layerType_6_0,
            	    											"org.xtext.example.mydsl.MyDsl.LayerType");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalMyDsl.g:423:8: (otherlv_7= 'activation' this_REFERENCE_8= RULE_REFERENCE ( (lv_activType_9_0= ruleActivationFunctionType ) ) )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==26) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalMyDsl.g:424:9: otherlv_7= 'activation' this_REFERENCE_8= RULE_REFERENCE ( (lv_activType_9_0= ruleActivationFunctionType ) )
            	            {
            	            otherlv_7=(Token)match(input,26,FOLLOW_9); 

            	            									newLeafNode(otherlv_7, grammarAccess.getLayerAccess().getActivationKeyword_0_6_0());
            	            								
            	            this_REFERENCE_8=(Token)match(input,RULE_REFERENCE,FOLLOW_17); 

            	            									newLeafNode(this_REFERENCE_8, grammarAccess.getLayerAccess().getREFERENCETerminalRuleCall_0_6_1());
            	            								
            	            // InternalMyDsl.g:432:9: ( (lv_activType_9_0= ruleActivationFunctionType ) )
            	            // InternalMyDsl.g:433:10: (lv_activType_9_0= ruleActivationFunctionType )
            	            {
            	            // InternalMyDsl.g:433:10: (lv_activType_9_0= ruleActivationFunctionType )
            	            // InternalMyDsl.g:434:11: lv_activType_9_0= ruleActivationFunctionType
            	            {

            	            											newCompositeNode(grammarAccess.getLayerAccess().getActivTypeActivationFunctionTypeEnumRuleCall_0_6_2_0());
            	            										
            	            pushFollow(FOLLOW_18);
            	            lv_activType_9_0=ruleActivationFunctionType();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getLayerRule());
            	            											}
            	            											set(
            	            												current,
            	            												"activType",
            	            												lv_activType_9_0,
            	            												"org.xtext.example.mydsl.MyDsl.ActivationFunctionType");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLayerAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:458:3: ({...}? => ( ({...}? => (otherlv_10= 'weightsInit' this_REFERENCE_11= RULE_REFERENCE ( (lv_weightInit_12_0= ruleWeightInitType ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:458:3: ({...}? => ( ({...}? => (otherlv_10= 'weightsInit' this_REFERENCE_11= RULE_REFERENCE ( (lv_weightInit_12_0= ruleWeightInitType ) ) ) ) ) )
            	    // InternalMyDsl.g:459:4: {...}? => ( ({...}? => (otherlv_10= 'weightsInit' this_REFERENCE_11= RULE_REFERENCE ( (lv_weightInit_12_0= ruleWeightInitType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLayer", "getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalMyDsl.g:459:99: ( ({...}? => (otherlv_10= 'weightsInit' this_REFERENCE_11= RULE_REFERENCE ( (lv_weightInit_12_0= ruleWeightInitType ) ) ) ) )
            	    // InternalMyDsl.g:460:5: ({...}? => (otherlv_10= 'weightsInit' this_REFERENCE_11= RULE_REFERENCE ( (lv_weightInit_12_0= ruleWeightInitType ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLayerAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalMyDsl.g:463:8: ({...}? => (otherlv_10= 'weightsInit' this_REFERENCE_11= RULE_REFERENCE ( (lv_weightInit_12_0= ruleWeightInitType ) ) ) )
            	    // InternalMyDsl.g:463:9: {...}? => (otherlv_10= 'weightsInit' this_REFERENCE_11= RULE_REFERENCE ( (lv_weightInit_12_0= ruleWeightInitType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLayer", "true");
            	    }
            	    // InternalMyDsl.g:463:18: (otherlv_10= 'weightsInit' this_REFERENCE_11= RULE_REFERENCE ( (lv_weightInit_12_0= ruleWeightInitType ) ) )
            	    // InternalMyDsl.g:463:19: otherlv_10= 'weightsInit' this_REFERENCE_11= RULE_REFERENCE ( (lv_weightInit_12_0= ruleWeightInitType ) )
            	    {
            	    otherlv_10=(Token)match(input,27,FOLLOW_9); 

            	    								newLeafNode(otherlv_10, grammarAccess.getLayerAccess().getWeightsInitKeyword_1_0());
            	    							
            	    this_REFERENCE_11=(Token)match(input,RULE_REFERENCE,FOLLOW_19); 

            	    								newLeafNode(this_REFERENCE_11, grammarAccess.getLayerAccess().getREFERENCETerminalRuleCall_1_1());
            	    							
            	    // InternalMyDsl.g:471:8: ( (lv_weightInit_12_0= ruleWeightInitType ) )
            	    // InternalMyDsl.g:472:9: (lv_weightInit_12_0= ruleWeightInitType )
            	    {
            	    // InternalMyDsl.g:472:9: (lv_weightInit_12_0= ruleWeightInitType )
            	    // InternalMyDsl.g:473:10: lv_weightInit_12_0= ruleWeightInitType
            	    {

            	    										newCompositeNode(grammarAccess.getLayerAccess().getWeightInitWeightInitTypeEnumRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_18);
            	    lv_weightInit_12_0=ruleWeightInitType();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLayerRule());
            	    										}
            	    										set(
            	    											current,
            	    											"weightInit",
            	    											lv_weightInit_12_0,
            	    											"org.xtext.example.mydsl.MyDsl.WeightInitType");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLayerAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:496:3: ({...}? => ( ({...}? => ( (otherlv_13= 'biasInit' this_ASSIGN_14= RULE_ASSIGN ( (lv_biasInit_15_0= RULE_REAL ) ) )? otherlv_16= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:496:3: ({...}? => ( ({...}? => ( (otherlv_13= 'biasInit' this_ASSIGN_14= RULE_ASSIGN ( (lv_biasInit_15_0= RULE_REAL ) ) )? otherlv_16= '}' ) ) ) )
            	    // InternalMyDsl.g:497:4: {...}? => ( ({...}? => ( (otherlv_13= 'biasInit' this_ASSIGN_14= RULE_ASSIGN ( (lv_biasInit_15_0= RULE_REAL ) ) )? otherlv_16= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleLayer", "getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalMyDsl.g:497:99: ( ({...}? => ( (otherlv_13= 'biasInit' this_ASSIGN_14= RULE_ASSIGN ( (lv_biasInit_15_0= RULE_REAL ) ) )? otherlv_16= '}' ) ) )
            	    // InternalMyDsl.g:498:5: ({...}? => ( (otherlv_13= 'biasInit' this_ASSIGN_14= RULE_ASSIGN ( (lv_biasInit_15_0= RULE_REAL ) ) )? otherlv_16= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLayerAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalMyDsl.g:501:8: ({...}? => ( (otherlv_13= 'biasInit' this_ASSIGN_14= RULE_ASSIGN ( (lv_biasInit_15_0= RULE_REAL ) ) )? otherlv_16= '}' ) )
            	    // InternalMyDsl.g:501:9: {...}? => ( (otherlv_13= 'biasInit' this_ASSIGN_14= RULE_ASSIGN ( (lv_biasInit_15_0= RULE_REAL ) ) )? otherlv_16= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLayer", "true");
            	    }
            	    // InternalMyDsl.g:501:18: ( (otherlv_13= 'biasInit' this_ASSIGN_14= RULE_ASSIGN ( (lv_biasInit_15_0= RULE_REAL ) ) )? otherlv_16= '}' )
            	    // InternalMyDsl.g:501:19: (otherlv_13= 'biasInit' this_ASSIGN_14= RULE_ASSIGN ( (lv_biasInit_15_0= RULE_REAL ) ) )? otherlv_16= '}'
            	    {
            	    // InternalMyDsl.g:501:19: (otherlv_13= 'biasInit' this_ASSIGN_14= RULE_ASSIGN ( (lv_biasInit_15_0= RULE_REAL ) ) )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==28) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalMyDsl.g:502:9: otherlv_13= 'biasInit' this_ASSIGN_14= RULE_ASSIGN ( (lv_biasInit_15_0= RULE_REAL ) )
            	            {
            	            otherlv_13=(Token)match(input,28,FOLLOW_6); 

            	            									newLeafNode(otherlv_13, grammarAccess.getLayerAccess().getBiasInitKeyword_2_0_0());
            	            								
            	            this_ASSIGN_14=(Token)match(input,RULE_ASSIGN,FOLLOW_20); 

            	            									newLeafNode(this_ASSIGN_14, grammarAccess.getLayerAccess().getASSIGNTerminalRuleCall_2_0_1());
            	            								
            	            // InternalMyDsl.g:510:9: ( (lv_biasInit_15_0= RULE_REAL ) )
            	            // InternalMyDsl.g:511:10: (lv_biasInit_15_0= RULE_REAL )
            	            {
            	            // InternalMyDsl.g:511:10: (lv_biasInit_15_0= RULE_REAL )
            	            // InternalMyDsl.g:512:11: lv_biasInit_15_0= RULE_REAL
            	            {
            	            lv_biasInit_15_0=(Token)match(input,RULE_REAL,FOLLOW_21); 

            	            											newLeafNode(lv_biasInit_15_0, grammarAccess.getLayerAccess().getBiasInitREALTerminalRuleCall_2_0_2_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getLayerRule());
            	            											}
            	            											setWithLastConsumed(
            	            												current,
            	            												"biasInit",
            	            												lv_biasInit_15_0,
            	            												"org.xtext.example.mydsl.MyDsl.REAL");
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_16=(Token)match(input,23,FOLLOW_18); 

            	    								newLeafNode(otherlv_16, grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_2_1());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLayerAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleLayer", "getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getLayerAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleLayerDeclaration"
    // InternalMyDsl.g:550:1: entryRuleLayerDeclaration returns [EObject current=null] : iv_ruleLayerDeclaration= ruleLayerDeclaration EOF ;
    public final EObject entryRuleLayerDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayerDeclaration = null;


        try {
            // InternalMyDsl.g:550:57: (iv_ruleLayerDeclaration= ruleLayerDeclaration EOF )
            // InternalMyDsl.g:551:2: iv_ruleLayerDeclaration= ruleLayerDeclaration EOF
            {
             newCompositeNode(grammarAccess.getLayerDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayerDeclaration=ruleLayerDeclaration();

            state._fsp--;

             current =iv_ruleLayerDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayerDeclaration"


    // $ANTLR start "ruleLayerDeclaration"
    // InternalMyDsl.g:557:1: ruleLayerDeclaration returns [EObject current=null] : ( ( (lv_layerTuple_0_0= ruleLayerTuple ) ) | (otherlv_1= '[' ( (lv_layerTuple_2_0= ruleLayerTuple ) ) (otherlv_3= ',' ( (lv_layerTuple_4_0= ruleLayerTuple ) ) )* otherlv_5= ']' ) | (otherlv_6= '{' ( (lv_layerMultiplier_7_0= RULE_INTEGER ) ) otherlv_8= '}' otherlv_9= '[' ( (lv_layerTuple_10_0= ruleLayerTuple ) ) otherlv_11= ']' ) ) ;
    public final EObject ruleLayerDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_layerMultiplier_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_layerTuple_0_0 = null;

        EObject lv_layerTuple_2_0 = null;

        EObject lv_layerTuple_4_0 = null;

        EObject lv_layerTuple_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:563:2: ( ( ( (lv_layerTuple_0_0= ruleLayerTuple ) ) | (otherlv_1= '[' ( (lv_layerTuple_2_0= ruleLayerTuple ) ) (otherlv_3= ',' ( (lv_layerTuple_4_0= ruleLayerTuple ) ) )* otherlv_5= ']' ) | (otherlv_6= '{' ( (lv_layerMultiplier_7_0= RULE_INTEGER ) ) otherlv_8= '}' otherlv_9= '[' ( (lv_layerTuple_10_0= ruleLayerTuple ) ) otherlv_11= ']' ) ) )
            // InternalMyDsl.g:564:2: ( ( (lv_layerTuple_0_0= ruleLayerTuple ) ) | (otherlv_1= '[' ( (lv_layerTuple_2_0= ruleLayerTuple ) ) (otherlv_3= ',' ( (lv_layerTuple_4_0= ruleLayerTuple ) ) )* otherlv_5= ']' ) | (otherlv_6= '{' ( (lv_layerMultiplier_7_0= RULE_INTEGER ) ) otherlv_8= '}' otherlv_9= '[' ( (lv_layerTuple_10_0= ruleLayerTuple ) ) otherlv_11= ']' ) )
            {
            // InternalMyDsl.g:564:2: ( ( (lv_layerTuple_0_0= ruleLayerTuple ) ) | (otherlv_1= '[' ( (lv_layerTuple_2_0= ruleLayerTuple ) ) (otherlv_3= ',' ( (lv_layerTuple_4_0= ruleLayerTuple ) ) )* otherlv_5= ']' ) | (otherlv_6= '{' ( (lv_layerMultiplier_7_0= RULE_INTEGER ) ) otherlv_8= '}' otherlv_9= '[' ( (lv_layerTuple_10_0= ruleLayerTuple ) ) otherlv_11= ']' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 32:
            case 34:
                {
                alt7=1;
                }
                break;
            case 29:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:565:3: ( (lv_layerTuple_0_0= ruleLayerTuple ) )
                    {
                    // InternalMyDsl.g:565:3: ( (lv_layerTuple_0_0= ruleLayerTuple ) )
                    // InternalMyDsl.g:566:4: (lv_layerTuple_0_0= ruleLayerTuple )
                    {
                    // InternalMyDsl.g:566:4: (lv_layerTuple_0_0= ruleLayerTuple )
                    // InternalMyDsl.g:567:5: lv_layerTuple_0_0= ruleLayerTuple
                    {

                    					newCompositeNode(grammarAccess.getLayerDeclarationAccess().getLayerTupleLayerTupleParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_layerTuple_0_0=ruleLayerTuple();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLayerDeclarationRule());
                    					}
                    					add(
                    						current,
                    						"layerTuple",
                    						lv_layerTuple_0_0,
                    						"org.xtext.example.mydsl.MyDsl.LayerTuple");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:585:3: (otherlv_1= '[' ( (lv_layerTuple_2_0= ruleLayerTuple ) ) (otherlv_3= ',' ( (lv_layerTuple_4_0= ruleLayerTuple ) ) )* otherlv_5= ']' )
                    {
                    // InternalMyDsl.g:585:3: (otherlv_1= '[' ( (lv_layerTuple_2_0= ruleLayerTuple ) ) (otherlv_3= ',' ( (lv_layerTuple_4_0= ruleLayerTuple ) ) )* otherlv_5= ']' )
                    // InternalMyDsl.g:586:4: otherlv_1= '[' ( (lv_layerTuple_2_0= ruleLayerTuple ) ) (otherlv_3= ',' ( (lv_layerTuple_4_0= ruleLayerTuple ) ) )* otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getLayerDeclarationAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalMyDsl.g:590:4: ( (lv_layerTuple_2_0= ruleLayerTuple ) )
                    // InternalMyDsl.g:591:5: (lv_layerTuple_2_0= ruleLayerTuple )
                    {
                    // InternalMyDsl.g:591:5: (lv_layerTuple_2_0= ruleLayerTuple )
                    // InternalMyDsl.g:592:6: lv_layerTuple_2_0= ruleLayerTuple
                    {

                    						newCompositeNode(grammarAccess.getLayerDeclarationAccess().getLayerTupleLayerTupleParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_layerTuple_2_0=ruleLayerTuple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLayerDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"layerTuple",
                    							lv_layerTuple_2_0,
                    							"org.xtext.example.mydsl.MyDsl.LayerTuple");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:609:4: (otherlv_3= ',' ( (lv_layerTuple_4_0= ruleLayerTuple ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==30) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:610:5: otherlv_3= ',' ( (lv_layerTuple_4_0= ruleLayerTuple ) )
                    	    {
                    	    otherlv_3=(Token)match(input,30,FOLLOW_22); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getLayerDeclarationAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalMyDsl.g:614:5: ( (lv_layerTuple_4_0= ruleLayerTuple ) )
                    	    // InternalMyDsl.g:615:6: (lv_layerTuple_4_0= ruleLayerTuple )
                    	    {
                    	    // InternalMyDsl.g:615:6: (lv_layerTuple_4_0= ruleLayerTuple )
                    	    // InternalMyDsl.g:616:7: lv_layerTuple_4_0= ruleLayerTuple
                    	    {

                    	    							newCompositeNode(grammarAccess.getLayerDeclarationAccess().getLayerTupleLayerTupleParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_layerTuple_4_0=ruleLayerTuple();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLayerDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"layerTuple",
                    	    								lv_layerTuple_4_0,
                    	    								"org.xtext.example.mydsl.MyDsl.LayerTuple");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getLayerDeclarationAccess().getRightSquareBracketKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:640:3: (otherlv_6= '{' ( (lv_layerMultiplier_7_0= RULE_INTEGER ) ) otherlv_8= '}' otherlv_9= '[' ( (lv_layerTuple_10_0= ruleLayerTuple ) ) otherlv_11= ']' )
                    {
                    // InternalMyDsl.g:640:3: (otherlv_6= '{' ( (lv_layerMultiplier_7_0= RULE_INTEGER ) ) otherlv_8= '}' otherlv_9= '[' ( (lv_layerTuple_10_0= ruleLayerTuple ) ) otherlv_11= ']' )
                    // InternalMyDsl.g:641:4: otherlv_6= '{' ( (lv_layerMultiplier_7_0= RULE_INTEGER ) ) otherlv_8= '}' otherlv_9= '[' ( (lv_layerTuple_10_0= ruleLayerTuple ) ) otherlv_11= ']'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getLayerDeclarationAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalMyDsl.g:645:4: ( (lv_layerMultiplier_7_0= RULE_INTEGER ) )
                    // InternalMyDsl.g:646:5: (lv_layerMultiplier_7_0= RULE_INTEGER )
                    {
                    // InternalMyDsl.g:646:5: (lv_layerMultiplier_7_0= RULE_INTEGER )
                    // InternalMyDsl.g:647:6: lv_layerMultiplier_7_0= RULE_INTEGER
                    {
                    lv_layerMultiplier_7_0=(Token)match(input,RULE_INTEGER,FOLLOW_21); 

                    						newLeafNode(lv_layerMultiplier_7_0, grammarAccess.getLayerDeclarationAccess().getLayerMultiplierINTEGERTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLayerDeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"layerMultiplier",
                    							lv_layerMultiplier_7_0,
                    							"org.xtext.example.mydsl.MyDsl.INTEGER");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,23,FOLLOW_24); 

                    				newLeafNode(otherlv_8, grammarAccess.getLayerDeclarationAccess().getRightCurlyBracketKeyword_2_2());
                    			
                    otherlv_9=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_9, grammarAccess.getLayerDeclarationAccess().getLeftSquareBracketKeyword_2_3());
                    			
                    // InternalMyDsl.g:671:4: ( (lv_layerTuple_10_0= ruleLayerTuple ) )
                    // InternalMyDsl.g:672:5: (lv_layerTuple_10_0= ruleLayerTuple )
                    {
                    // InternalMyDsl.g:672:5: (lv_layerTuple_10_0= ruleLayerTuple )
                    // InternalMyDsl.g:673:6: lv_layerTuple_10_0= ruleLayerTuple
                    {

                    						newCompositeNode(grammarAccess.getLayerDeclarationAccess().getLayerTupleLayerTupleParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_layerTuple_10_0=ruleLayerTuple();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLayerDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"layerTuple",
                    							lv_layerTuple_10_0,
                    							"org.xtext.example.mydsl.MyDsl.LayerTuple");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getLayerDeclarationAccess().getRightSquareBracketKeyword_2_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayerDeclaration"


    // $ANTLR start "entryRuleLayerTuple"
    // InternalMyDsl.g:699:1: entryRuleLayerTuple returns [EObject current=null] : iv_ruleLayerTuple= ruleLayerTuple EOF ;
    public final EObject entryRuleLayerTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayerTuple = null;


        try {
            // InternalMyDsl.g:699:51: (iv_ruleLayerTuple= ruleLayerTuple EOF )
            // InternalMyDsl.g:700:2: iv_ruleLayerTuple= ruleLayerTuple EOF
            {
             newCompositeNode(grammarAccess.getLayerTupleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayerTuple=ruleLayerTuple();

            state._fsp--;

             current =iv_ruleLayerTuple; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayerTuple"


    // $ANTLR start "ruleLayerTuple"
    // InternalMyDsl.g:706:1: ruleLayerTuple returns [EObject current=null] : ( (otherlv_0= '(' (otherlv_1= 'ref' otherlv_2= ':' ( (lv_ref_3_0= RULE_ID ) ) )? (otherlv_4= 'in' otherlv_5= ':' ( (lv_in_6_0= ruleLayerRef ) ) )? otherlv_7= 'out' otherlv_8= ':' ( (lv_out_9_0= ruleLayerRef ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_in_12_0= ruleLayerRef ) )? otherlv_13= ':' ( (lv_out_14_0= ruleLayerRef ) ) otherlv_15= ')' ) | (otherlv_16= ':' ( (lv_out_17_0= ruleLayerRef ) ) ) ) ;
    public final EObject ruleLayerTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_ref_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_in_6_0 = null;

        EObject lv_out_9_0 = null;

        EObject lv_in_12_0 = null;

        EObject lv_out_14_0 = null;

        EObject lv_out_17_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:712:2: ( ( (otherlv_0= '(' (otherlv_1= 'ref' otherlv_2= ':' ( (lv_ref_3_0= RULE_ID ) ) )? (otherlv_4= 'in' otherlv_5= ':' ( (lv_in_6_0= ruleLayerRef ) ) )? otherlv_7= 'out' otherlv_8= ':' ( (lv_out_9_0= ruleLayerRef ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_in_12_0= ruleLayerRef ) )? otherlv_13= ':' ( (lv_out_14_0= ruleLayerRef ) ) otherlv_15= ')' ) | (otherlv_16= ':' ( (lv_out_17_0= ruleLayerRef ) ) ) ) )
            // InternalMyDsl.g:713:2: ( (otherlv_0= '(' (otherlv_1= 'ref' otherlv_2= ':' ( (lv_ref_3_0= RULE_ID ) ) )? (otherlv_4= 'in' otherlv_5= ':' ( (lv_in_6_0= ruleLayerRef ) ) )? otherlv_7= 'out' otherlv_8= ':' ( (lv_out_9_0= ruleLayerRef ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_in_12_0= ruleLayerRef ) )? otherlv_13= ':' ( (lv_out_14_0= ruleLayerRef ) ) otherlv_15= ')' ) | (otherlv_16= ':' ( (lv_out_17_0= ruleLayerRef ) ) ) )
            {
            // InternalMyDsl.g:713:2: ( (otherlv_0= '(' (otherlv_1= 'ref' otherlv_2= ':' ( (lv_ref_3_0= RULE_ID ) ) )? (otherlv_4= 'in' otherlv_5= ':' ( (lv_in_6_0= ruleLayerRef ) ) )? otherlv_7= 'out' otherlv_8= ':' ( (lv_out_9_0= ruleLayerRef ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_in_12_0= ruleLayerRef ) )? otherlv_13= ':' ( (lv_out_14_0= ruleLayerRef ) ) otherlv_15= ')' ) | (otherlv_16= ':' ( (lv_out_17_0= ruleLayerRef ) ) ) )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==33||(LA11_1>=35 && LA11_1<=36)) ) {
                    alt11=1;
                }
                else if ( (LA11_1==RULE_INTEGER||LA11_1==34||LA11_1==38) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==34) ) {
                alt11=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:714:3: (otherlv_0= '(' (otherlv_1= 'ref' otherlv_2= ':' ( (lv_ref_3_0= RULE_ID ) ) )? (otherlv_4= 'in' otherlv_5= ':' ( (lv_in_6_0= ruleLayerRef ) ) )? otherlv_7= 'out' otherlv_8= ':' ( (lv_out_9_0= ruleLayerRef ) ) otherlv_10= ')' )
                    {
                    // InternalMyDsl.g:714:3: (otherlv_0= '(' (otherlv_1= 'ref' otherlv_2= ':' ( (lv_ref_3_0= RULE_ID ) ) )? (otherlv_4= 'in' otherlv_5= ':' ( (lv_in_6_0= ruleLayerRef ) ) )? otherlv_7= 'out' otherlv_8= ':' ( (lv_out_9_0= ruleLayerRef ) ) otherlv_10= ')' )
                    // InternalMyDsl.g:715:4: otherlv_0= '(' (otherlv_1= 'ref' otherlv_2= ':' ( (lv_ref_3_0= RULE_ID ) ) )? (otherlv_4= 'in' otherlv_5= ':' ( (lv_in_6_0= ruleLayerRef ) ) )? otherlv_7= 'out' otherlv_8= ':' ( (lv_out_9_0= ruleLayerRef ) ) otherlv_10= ')'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getLayerTupleAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalMyDsl.g:719:4: (otherlv_1= 'ref' otherlv_2= ':' ( (lv_ref_3_0= RULE_ID ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==33) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyDsl.g:720:5: otherlv_1= 'ref' otherlv_2= ':' ( (lv_ref_3_0= RULE_ID ) )
                            {
                            otherlv_1=(Token)match(input,33,FOLLOW_27); 

                            					newLeafNode(otherlv_1, grammarAccess.getLayerTupleAccess().getRefKeyword_0_1_0());
                            				
                            otherlv_2=(Token)match(input,34,FOLLOW_3); 

                            					newLeafNode(otherlv_2, grammarAccess.getLayerTupleAccess().getColonKeyword_0_1_1());
                            				
                            // InternalMyDsl.g:728:5: ( (lv_ref_3_0= RULE_ID ) )
                            // InternalMyDsl.g:729:6: (lv_ref_3_0= RULE_ID )
                            {
                            // InternalMyDsl.g:729:6: (lv_ref_3_0= RULE_ID )
                            // InternalMyDsl.g:730:7: lv_ref_3_0= RULE_ID
                            {
                            lv_ref_3_0=(Token)match(input,RULE_ID,FOLLOW_28); 

                            							newLeafNode(lv_ref_3_0, grammarAccess.getLayerTupleAccess().getRefIDTerminalRuleCall_0_1_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLayerTupleRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"ref",
                            								lv_ref_3_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalMyDsl.g:747:4: (otherlv_4= 'in' otherlv_5= ':' ( (lv_in_6_0= ruleLayerRef ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==35) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyDsl.g:748:5: otherlv_4= 'in' otherlv_5= ':' ( (lv_in_6_0= ruleLayerRef ) )
                            {
                            otherlv_4=(Token)match(input,35,FOLLOW_27); 

                            					newLeafNode(otherlv_4, grammarAccess.getLayerTupleAccess().getInKeyword_0_2_0());
                            				
                            otherlv_5=(Token)match(input,34,FOLLOW_29); 

                            					newLeafNode(otherlv_5, grammarAccess.getLayerTupleAccess().getColonKeyword_0_2_1());
                            				
                            // InternalMyDsl.g:756:5: ( (lv_in_6_0= ruleLayerRef ) )
                            // InternalMyDsl.g:757:6: (lv_in_6_0= ruleLayerRef )
                            {
                            // InternalMyDsl.g:757:6: (lv_in_6_0= ruleLayerRef )
                            // InternalMyDsl.g:758:7: lv_in_6_0= ruleLayerRef
                            {

                            							newCompositeNode(grammarAccess.getLayerTupleAccess().getInLayerRefParserRuleCall_0_2_2_0());
                            						
                            pushFollow(FOLLOW_30);
                            lv_in_6_0=ruleLayerRef();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getLayerTupleRule());
                            							}
                            							set(
                            								current,
                            								"in",
                            								lv_in_6_0,
                            								"org.xtext.example.mydsl.MyDsl.LayerRef");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,36,FOLLOW_27); 

                    				newLeafNode(otherlv_7, grammarAccess.getLayerTupleAccess().getOutKeyword_0_3());
                    			
                    otherlv_8=(Token)match(input,34,FOLLOW_29); 

                    				newLeafNode(otherlv_8, grammarAccess.getLayerTupleAccess().getColonKeyword_0_4());
                    			
                    // InternalMyDsl.g:784:4: ( (lv_out_9_0= ruleLayerRef ) )
                    // InternalMyDsl.g:785:5: (lv_out_9_0= ruleLayerRef )
                    {
                    // InternalMyDsl.g:785:5: (lv_out_9_0= ruleLayerRef )
                    // InternalMyDsl.g:786:6: lv_out_9_0= ruleLayerRef
                    {

                    						newCompositeNode(grammarAccess.getLayerTupleAccess().getOutLayerRefParserRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_out_9_0=ruleLayerRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLayerTupleRule());
                    						}
                    						set(
                    							current,
                    							"out",
                    							lv_out_9_0,
                    							"org.xtext.example.mydsl.MyDsl.LayerRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getLayerTupleAccess().getRightParenthesisKeyword_0_6());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:809:3: (otherlv_11= '(' ( (lv_in_12_0= ruleLayerRef ) )? otherlv_13= ':' ( (lv_out_14_0= ruleLayerRef ) ) otherlv_15= ')' )
                    {
                    // InternalMyDsl.g:809:3: (otherlv_11= '(' ( (lv_in_12_0= ruleLayerRef ) )? otherlv_13= ':' ( (lv_out_14_0= ruleLayerRef ) ) otherlv_15= ')' )
                    // InternalMyDsl.g:810:4: otherlv_11= '(' ( (lv_in_12_0= ruleLayerRef ) )? otherlv_13= ':' ( (lv_out_14_0= ruleLayerRef ) ) otherlv_15= ')'
                    {
                    otherlv_11=(Token)match(input,32,FOLLOW_32); 

                    				newLeafNode(otherlv_11, grammarAccess.getLayerTupleAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalMyDsl.g:814:4: ( (lv_in_12_0= ruleLayerRef ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_INTEGER||LA10_0==38) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMyDsl.g:815:5: (lv_in_12_0= ruleLayerRef )
                            {
                            // InternalMyDsl.g:815:5: (lv_in_12_0= ruleLayerRef )
                            // InternalMyDsl.g:816:6: lv_in_12_0= ruleLayerRef
                            {

                            						newCompositeNode(grammarAccess.getLayerTupleAccess().getInLayerRefParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_27);
                            lv_in_12_0=ruleLayerRef();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getLayerTupleRule());
                            						}
                            						set(
                            							current,
                            							"in",
                            							lv_in_12_0,
                            							"org.xtext.example.mydsl.MyDsl.LayerRef");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,34,FOLLOW_29); 

                    				newLeafNode(otherlv_13, grammarAccess.getLayerTupleAccess().getColonKeyword_1_2());
                    			
                    // InternalMyDsl.g:837:4: ( (lv_out_14_0= ruleLayerRef ) )
                    // InternalMyDsl.g:838:5: (lv_out_14_0= ruleLayerRef )
                    {
                    // InternalMyDsl.g:838:5: (lv_out_14_0= ruleLayerRef )
                    // InternalMyDsl.g:839:6: lv_out_14_0= ruleLayerRef
                    {

                    						newCompositeNode(grammarAccess.getLayerTupleAccess().getOutLayerRefParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_out_14_0=ruleLayerRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLayerTupleRule());
                    						}
                    						set(
                    							current,
                    							"out",
                    							lv_out_14_0,
                    							"org.xtext.example.mydsl.MyDsl.LayerRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getLayerTupleAccess().getRightParenthesisKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:862:3: (otherlv_16= ':' ( (lv_out_17_0= ruleLayerRef ) ) )
                    {
                    // InternalMyDsl.g:862:3: (otherlv_16= ':' ( (lv_out_17_0= ruleLayerRef ) ) )
                    // InternalMyDsl.g:863:4: otherlv_16= ':' ( (lv_out_17_0= ruleLayerRef ) )
                    {
                    otherlv_16=(Token)match(input,34,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getLayerTupleAccess().getColonKeyword_2_0());
                    			
                    // InternalMyDsl.g:867:4: ( (lv_out_17_0= ruleLayerRef ) )
                    // InternalMyDsl.g:868:5: (lv_out_17_0= ruleLayerRef )
                    {
                    // InternalMyDsl.g:868:5: (lv_out_17_0= ruleLayerRef )
                    // InternalMyDsl.g:869:6: lv_out_17_0= ruleLayerRef
                    {

                    						newCompositeNode(grammarAccess.getLayerTupleAccess().getOutLayerRefParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_out_17_0=ruleLayerRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLayerTupleRule());
                    						}
                    						set(
                    							current,
                    							"out",
                    							lv_out_17_0,
                    							"org.xtext.example.mydsl.MyDsl.LayerRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayerTuple"


    // $ANTLR start "entryRuleLayerRef"
    // InternalMyDsl.g:891:1: entryRuleLayerRef returns [EObject current=null] : iv_ruleLayerRef= ruleLayerRef EOF ;
    public final EObject entryRuleLayerRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayerRef = null;


        try {
            // InternalMyDsl.g:891:49: (iv_ruleLayerRef= ruleLayerRef EOF )
            // InternalMyDsl.g:892:2: iv_ruleLayerRef= ruleLayerRef EOF
            {
             newCompositeNode(grammarAccess.getLayerRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayerRef=ruleLayerRef();

            state._fsp--;

             current =iv_ruleLayerRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayerRef"


    // $ANTLR start "ruleLayerRef"
    // InternalMyDsl.g:898:1: ruleLayerRef returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INTEGER ) ) | (otherlv_1= '<' ( (lv_ref_2_0= RULE_ID ) ) otherlv_3= '>' ) ) ;
    public final EObject ruleLayerRef() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token lv_ref_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:904:2: ( ( ( (lv_value_0_0= RULE_INTEGER ) ) | (otherlv_1= '<' ( (lv_ref_2_0= RULE_ID ) ) otherlv_3= '>' ) ) )
            // InternalMyDsl.g:905:2: ( ( (lv_value_0_0= RULE_INTEGER ) ) | (otherlv_1= '<' ( (lv_ref_2_0= RULE_ID ) ) otherlv_3= '>' ) )
            {
            // InternalMyDsl.g:905:2: ( ( (lv_value_0_0= RULE_INTEGER ) ) | (otherlv_1= '<' ( (lv_ref_2_0= RULE_ID ) ) otherlv_3= '>' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INTEGER) ) {
                alt12=1;
            }
            else if ( (LA12_0==38) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:906:3: ( (lv_value_0_0= RULE_INTEGER ) )
                    {
                    // InternalMyDsl.g:906:3: ( (lv_value_0_0= RULE_INTEGER ) )
                    // InternalMyDsl.g:907:4: (lv_value_0_0= RULE_INTEGER )
                    {
                    // InternalMyDsl.g:907:4: (lv_value_0_0= RULE_INTEGER )
                    // InternalMyDsl.g:908:5: lv_value_0_0= RULE_INTEGER
                    {
                    lv_value_0_0=(Token)match(input,RULE_INTEGER,FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getLayerRefAccess().getValueINTEGERTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLayerRefRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"org.xtext.example.mydsl.MyDsl.INTEGER");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:925:3: (otherlv_1= '<' ( (lv_ref_2_0= RULE_ID ) ) otherlv_3= '>' )
                    {
                    // InternalMyDsl.g:925:3: (otherlv_1= '<' ( (lv_ref_2_0= RULE_ID ) ) otherlv_3= '>' )
                    // InternalMyDsl.g:926:4: otherlv_1= '<' ( (lv_ref_2_0= RULE_ID ) ) otherlv_3= '>'
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getLayerRefAccess().getLessThanSignKeyword_1_0());
                    			
                    // InternalMyDsl.g:930:4: ( (lv_ref_2_0= RULE_ID ) )
                    // InternalMyDsl.g:931:5: (lv_ref_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:931:5: (lv_ref_2_0= RULE_ID )
                    // InternalMyDsl.g:932:6: lv_ref_2_0= RULE_ID
                    {
                    lv_ref_2_0=(Token)match(input,RULE_ID,FOLLOW_33); 

                    						newLeafNode(lv_ref_2_0, grammarAccess.getLayerRefAccess().getRefIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLayerRefRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ref",
                    							lv_ref_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getLayerRefAccess().getGreaterThanSignKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayerRef"


    // $ANTLR start "entryRuleVariableAssignment"
    // InternalMyDsl.g:957:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // InternalMyDsl.g:957:59: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // InternalMyDsl.g:958:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableAssignment=ruleVariableAssignment();

            state._fsp--;

             current =iv_ruleVariableAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableAssignment"


    // $ANTLR start "ruleVariableAssignment"
    // InternalMyDsl.g:964:1: ruleVariableAssignment returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INTEGER ) ) | this_Expression_1= ruleExpression | this_Function_2= ruleFunction ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        EObject this_Expression_1 = null;

        EObject this_Function_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:970:2: ( ( ( (lv_value_0_0= RULE_INTEGER ) ) | this_Expression_1= ruleExpression | this_Function_2= ruleFunction ) )
            // InternalMyDsl.g:971:2: ( ( (lv_value_0_0= RULE_INTEGER ) ) | this_Expression_1= ruleExpression | this_Function_2= ruleFunction )
            {
            // InternalMyDsl.g:971:2: ( ( (lv_value_0_0= RULE_INTEGER ) ) | this_Expression_1= ruleExpression | this_Function_2= ruleFunction )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
                {
                alt13=1;
                }
                break;
            case RULE_REAL:
            case 32:
                {
                alt13=2;
                }
                break;
            case RULE_ID:
                {
                int LA13_3 = input.LA(2);

                if ( (LA13_3==EOF||(LA13_3>=23 && LA13_3<=24)||(LA13_3>=27 && LA13_3<=28)||(LA13_3>=40 && LA13_3<=43)) ) {
                    alt13=2;
                }
                else if ( (LA13_3==RULE_ASSIGN||LA13_3==32) ) {
                    alt13=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:972:3: ( (lv_value_0_0= RULE_INTEGER ) )
                    {
                    // InternalMyDsl.g:972:3: ( (lv_value_0_0= RULE_INTEGER ) )
                    // InternalMyDsl.g:973:4: (lv_value_0_0= RULE_INTEGER )
                    {
                    // InternalMyDsl.g:973:4: (lv_value_0_0= RULE_INTEGER )
                    // InternalMyDsl.g:974:5: lv_value_0_0= RULE_INTEGER
                    {
                    lv_value_0_0=(Token)match(input,RULE_INTEGER,FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getVariableAssignmentAccess().getValueINTEGERTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableAssignmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"org.xtext.example.mydsl.MyDsl.INTEGER");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:991:3: this_Expression_1= ruleExpression
                    {

                    			newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    			current = this_Expression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1000:3: this_Function_2= ruleFunction
                    {

                    			newCompositeNode(grammarAccess.getVariableAssignmentAccess().getFunctionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Function_2=ruleFunction();

                    state._fsp--;


                    			current = this_Function_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableAssignment"


    // $ANTLR start "entryRuleFunction"
    // InternalMyDsl.g:1012:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalMyDsl.g:1012:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalMyDsl.g:1013:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalMyDsl.g:1019:1: ruleFunction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_args_2_0= ruleDeclaredParameter ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* otherlv_5= ')' )? this_ASSIGN_6= RULE_ASSIGN ( (lv_expr_7_0= ruleExpression ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_ASSIGN_6=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;

        EObject lv_expr_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1025:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_args_2_0= ruleDeclaredParameter ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* otherlv_5= ')' )? this_ASSIGN_6= RULE_ASSIGN ( (lv_expr_7_0= ruleExpression ) ) ) )
            // InternalMyDsl.g:1026:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_args_2_0= ruleDeclaredParameter ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* otherlv_5= ')' )? this_ASSIGN_6= RULE_ASSIGN ( (lv_expr_7_0= ruleExpression ) ) )
            {
            // InternalMyDsl.g:1026:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_args_2_0= ruleDeclaredParameter ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* otherlv_5= ')' )? this_ASSIGN_6= RULE_ASSIGN ( (lv_expr_7_0= ruleExpression ) ) )
            // InternalMyDsl.g:1027:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_args_2_0= ruleDeclaredParameter ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* otherlv_5= ')' )? this_ASSIGN_6= RULE_ASSIGN ( (lv_expr_7_0= ruleExpression ) )
            {
            // InternalMyDsl.g:1027:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:1028:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1028:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:1029:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:1045:3: (otherlv_1= '(' ( (lv_args_2_0= ruleDeclaredParameter ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* otherlv_5= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1046:4: otherlv_1= '(' ( (lv_args_2_0= ruleDeclaredParameter ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalMyDsl.g:1050:4: ( (lv_args_2_0= ruleDeclaredParameter ) )
                    // InternalMyDsl.g:1051:5: (lv_args_2_0= ruleDeclaredParameter )
                    {
                    // InternalMyDsl.g:1051:5: (lv_args_2_0= ruleDeclaredParameter )
                    // InternalMyDsl.g:1052:6: lv_args_2_0= ruleDeclaredParameter
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getArgsDeclaredParameterParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_args_2_0=ruleDeclaredParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_2_0,
                    							"org.xtext.example.mydsl.MyDsl.DeclaredParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1069:4: (otherlv_3= ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==30) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyDsl.g:1070:5: otherlv_3= ',' ( (lv_args_4_0= ruleDeclaredParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,30,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalMyDsl.g:1074:5: ( (lv_args_4_0= ruleDeclaredParameter ) )
                    	    // InternalMyDsl.g:1075:6: (lv_args_4_0= ruleDeclaredParameter )
                    	    {
                    	    // InternalMyDsl.g:1075:6: (lv_args_4_0= ruleDeclaredParameter )
                    	    // InternalMyDsl.g:1076:7: lv_args_4_0= ruleDeclaredParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionAccess().getArgsDeclaredParameterParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_args_4_0=ruleDeclaredParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_4_0,
                    	    								"org.xtext.example.mydsl.MyDsl.DeclaredParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,37,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

            }

            this_ASSIGN_6=(Token)match(input,RULE_ASSIGN,FOLLOW_36); 

            			newLeafNode(this_ASSIGN_6, grammarAccess.getFunctionAccess().getASSIGNTerminalRuleCall_2());
            		
            // InternalMyDsl.g:1103:3: ( (lv_expr_7_0= ruleExpression ) )
            // InternalMyDsl.g:1104:4: (lv_expr_7_0= ruleExpression )
            {
            // InternalMyDsl.g:1104:4: (lv_expr_7_0= ruleExpression )
            // InternalMyDsl.g:1105:5: lv_expr_7_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getExprExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_7_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_7_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDeclaredParameter"
    // InternalMyDsl.g:1126:1: entryRuleDeclaredParameter returns [EObject current=null] : iv_ruleDeclaredParameter= ruleDeclaredParameter EOF ;
    public final EObject entryRuleDeclaredParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredParameter = null;


        try {
            // InternalMyDsl.g:1126:58: (iv_ruleDeclaredParameter= ruleDeclaredParameter EOF )
            // InternalMyDsl.g:1127:2: iv_ruleDeclaredParameter= ruleDeclaredParameter EOF
            {
             newCompositeNode(grammarAccess.getDeclaredParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaredParameter=ruleDeclaredParameter();

            state._fsp--;

             current =iv_ruleDeclaredParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaredParameter"


    // $ANTLR start "ruleDeclaredParameter"
    // InternalMyDsl.g:1133:1: ruleDeclaredParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDeclaredParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1139:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:1140:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:1140:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:1141:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1141:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:1142:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getDeclaredParameterAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDeclaredParameterRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaredParameter"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:1161:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:1161:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:1162:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:1168:1: ruleExpression returns [EObject current=null] : (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Term_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1174:2: ( (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) )
            // InternalMyDsl.g:1175:2: (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            {
            // InternalMyDsl.g:1175:2: (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            // InternalMyDsl.g:1176:3: this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_Term_0=ruleTerm();

            state._fsp--;


            			current = this_Term_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:1184:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=40 && LA17_0<=41)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1185:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) )
            	    {
            	    // InternalMyDsl.g:1185:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==40) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==41) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalMyDsl.g:1186:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMyDsl.g:1186:5: ( () otherlv_2= '+' )
            	            // InternalMyDsl.g:1187:6: () otherlv_2= '+'
            	            {
            	            // InternalMyDsl.g:1187:6: ()
            	            // InternalMyDsl.g:1188:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpressionAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,40,FOLLOW_36); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1200:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMyDsl.g:1200:5: ( () otherlv_4= '-' )
            	            // InternalMyDsl.g:1201:6: () otherlv_4= '-'
            	            {
            	            // InternalMyDsl.g:1201:6: ()
            	            // InternalMyDsl.g:1202:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpressionAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,41,FOLLOW_36); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:1214:4: ( (lv_right_5_0= ruleTerm ) )
            	    // InternalMyDsl.g:1215:5: (lv_right_5_0= ruleTerm )
            	    {
            	    // InternalMyDsl.g:1215:5: (lv_right_5_0= ruleTerm )
            	    // InternalMyDsl.g:1216:6: lv_right_5_0= ruleTerm
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightTermParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_right_5_0=ruleTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.Term");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTerm"
    // InternalMyDsl.g:1238:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalMyDsl.g:1238:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalMyDsl.g:1239:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMyDsl.g:1245:1: ruleTerm returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1251:2: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalMyDsl.g:1252:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalMyDsl.g:1252:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalMyDsl.g:1253:3: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:1261:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=42 && LA19_0<=43)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1262:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalMyDsl.g:1262:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==42) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==43) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalMyDsl.g:1263:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalMyDsl.g:1263:5: ( () otherlv_2= '*' )
            	            // InternalMyDsl.g:1264:6: () otherlv_2= '*'
            	            {
            	            // InternalMyDsl.g:1264:6: ()
            	            // InternalMyDsl.g:1265:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getTermAccess().getMultiplyLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,42,FOLLOW_36); 

            	            						newLeafNode(otherlv_2, grammarAccess.getTermAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1277:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalMyDsl.g:1277:5: ( () otherlv_4= '/' )
            	            // InternalMyDsl.g:1278:6: () otherlv_4= '/'
            	            {
            	            // InternalMyDsl.g:1278:6: ()
            	            // InternalMyDsl.g:1279:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getTermAccess().getDivisionLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,43,FOLLOW_36); 

            	            						newLeafNode(otherlv_4, grammarAccess.getTermAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:1291:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalMyDsl.g:1292:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalMyDsl.g:1292:5: (lv_right_5_0= ruleFactor )
            	    // InternalMyDsl.g:1293:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // InternalMyDsl.g:1315:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMyDsl.g:1315:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMyDsl.g:1316:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMyDsl.g:1322:1: ruleFactor returns [EObject current=null] : ( ( (lv_number_0_0= RULE_REAL ) ) | ( (lv_variable_1_0= RULE_ID ) ) | (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_variable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1328:2: ( ( ( (lv_number_0_0= RULE_REAL ) ) | ( (lv_variable_1_0= RULE_ID ) ) | (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) ) )
            // InternalMyDsl.g:1329:2: ( ( (lv_number_0_0= RULE_REAL ) ) | ( (lv_variable_1_0= RULE_ID ) ) | (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            {
            // InternalMyDsl.g:1329:2: ( ( (lv_number_0_0= RULE_REAL ) ) | ( (lv_variable_1_0= RULE_ID ) ) | (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case RULE_REAL:
                {
                alt20=1;
                }
                break;
            case RULE_ID:
                {
                alt20=2;
                }
                break;
            case 32:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1330:3: ( (lv_number_0_0= RULE_REAL ) )
                    {
                    // InternalMyDsl.g:1330:3: ( (lv_number_0_0= RULE_REAL ) )
                    // InternalMyDsl.g:1331:4: (lv_number_0_0= RULE_REAL )
                    {
                    // InternalMyDsl.g:1331:4: (lv_number_0_0= RULE_REAL )
                    // InternalMyDsl.g:1332:5: lv_number_0_0= RULE_REAL
                    {
                    lv_number_0_0=(Token)match(input,RULE_REAL,FOLLOW_2); 

                    					newLeafNode(lv_number_0_0, grammarAccess.getFactorAccess().getNumberREALTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"number",
                    						lv_number_0_0,
                    						"org.xtext.example.mydsl.MyDsl.REAL");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1349:3: ( (lv_variable_1_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:1349:3: ( (lv_variable_1_0= RULE_ID ) )
                    // InternalMyDsl.g:1350:4: (lv_variable_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1350:4: (lv_variable_1_0= RULE_ID )
                    // InternalMyDsl.g:1351:5: lv_variable_1_0= RULE_ID
                    {
                    lv_variable_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_variable_1_0, grammarAccess.getFactorAccess().getVariableIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"variable",
                    						lv_variable_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1368:3: (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )
                    {
                    // InternalMyDsl.g:1368:3: (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )
                    // InternalMyDsl.g:1369:4: otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_36); 

                    				newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMyDsl.g:1373:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalMyDsl.g:1374:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1374:5: (lv_expression_3_0= ruleExpression )
                    // InternalMyDsl.g:1375:6: lv_expression_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_expression_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_3_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getRightParenthesisKeyword_2_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "ruleLayerType"
    // InternalMyDsl.g:1401:1: ruleLayerType returns [Enumerator current=null] : ( (enumLiteral_0= 'conv' ) | (enumLiteral_1= 'max-pool' ) | (enumLiteral_2= 'avg-pool' ) | (enumLiteral_3= 'dense' ) | (enumLiteral_4= 'softmax' ) ) ;
    public final Enumerator ruleLayerType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1407:2: ( ( (enumLiteral_0= 'conv' ) | (enumLiteral_1= 'max-pool' ) | (enumLiteral_2= 'avg-pool' ) | (enumLiteral_3= 'dense' ) | (enumLiteral_4= 'softmax' ) ) )
            // InternalMyDsl.g:1408:2: ( (enumLiteral_0= 'conv' ) | (enumLiteral_1= 'max-pool' ) | (enumLiteral_2= 'avg-pool' ) | (enumLiteral_3= 'dense' ) | (enumLiteral_4= 'softmax' ) )
            {
            // InternalMyDsl.g:1408:2: ( (enumLiteral_0= 'conv' ) | (enumLiteral_1= 'max-pool' ) | (enumLiteral_2= 'avg-pool' ) | (enumLiteral_3= 'dense' ) | (enumLiteral_4= 'softmax' ) )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt21=1;
                }
                break;
            case 45:
                {
                alt21=2;
                }
                break;
            case 46:
                {
                alt21=3;
                }
                break;
            case 47:
                {
                alt21=4;
                }
                break;
            case 48:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1409:3: (enumLiteral_0= 'conv' )
                    {
                    // InternalMyDsl.g:1409:3: (enumLiteral_0= 'conv' )
                    // InternalMyDsl.g:1410:4: enumLiteral_0= 'conv'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getLayerTypeAccess().getCONVOLUTIONALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLayerTypeAccess().getCONVOLUTIONALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1417:3: (enumLiteral_1= 'max-pool' )
                    {
                    // InternalMyDsl.g:1417:3: (enumLiteral_1= 'max-pool' )
                    // InternalMyDsl.g:1418:4: enumLiteral_1= 'max-pool'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getLayerTypeAccess().getMAXPOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLayerTypeAccess().getMAXPOOLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1425:3: (enumLiteral_2= 'avg-pool' )
                    {
                    // InternalMyDsl.g:1425:3: (enumLiteral_2= 'avg-pool' )
                    // InternalMyDsl.g:1426:4: enumLiteral_2= 'avg-pool'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getLayerTypeAccess().getAVGPOOLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLayerTypeAccess().getAVGPOOLEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1433:3: (enumLiteral_3= 'dense' )
                    {
                    // InternalMyDsl.g:1433:3: (enumLiteral_3= 'dense' )
                    // InternalMyDsl.g:1434:4: enumLiteral_3= 'dense'
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getLayerTypeAccess().getDENSEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLayerTypeAccess().getDENSEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1441:3: (enumLiteral_4= 'softmax' )
                    {
                    // InternalMyDsl.g:1441:3: (enumLiteral_4= 'softmax' )
                    // InternalMyDsl.g:1442:4: enumLiteral_4= 'softmax'
                    {
                    enumLiteral_4=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getLayerTypeAccess().getSOFTMAXEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLayerTypeAccess().getSOFTMAXEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayerType"


    // $ANTLR start "ruleActivationFunctionType"
    // InternalMyDsl.g:1452:1: ruleActivationFunctionType returns [Enumerator current=null] : ( (enumLiteral_0= 'sigmoid' ) | (enumLiteral_1= 'tanh' ) | (enumLiteral_2= 'relu' ) ) ;
    public final Enumerator ruleActivationFunctionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1458:2: ( ( (enumLiteral_0= 'sigmoid' ) | (enumLiteral_1= 'tanh' ) | (enumLiteral_2= 'relu' ) ) )
            // InternalMyDsl.g:1459:2: ( (enumLiteral_0= 'sigmoid' ) | (enumLiteral_1= 'tanh' ) | (enumLiteral_2= 'relu' ) )
            {
            // InternalMyDsl.g:1459:2: ( (enumLiteral_0= 'sigmoid' ) | (enumLiteral_1= 'tanh' ) | (enumLiteral_2= 'relu' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt22=1;
                }
                break;
            case 50:
                {
                alt22=2;
                }
                break;
            case 51:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1460:3: (enumLiteral_0= 'sigmoid' )
                    {
                    // InternalMyDsl.g:1460:3: (enumLiteral_0= 'sigmoid' )
                    // InternalMyDsl.g:1461:4: enumLiteral_0= 'sigmoid'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getActivationFunctionTypeAccess().getSIGMOIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActivationFunctionTypeAccess().getSIGMOIDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1468:3: (enumLiteral_1= 'tanh' )
                    {
                    // InternalMyDsl.g:1468:3: (enumLiteral_1= 'tanh' )
                    // InternalMyDsl.g:1469:4: enumLiteral_1= 'tanh'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getActivationFunctionTypeAccess().getTANHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActivationFunctionTypeAccess().getTANHEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1476:3: (enumLiteral_2= 'relu' )
                    {
                    // InternalMyDsl.g:1476:3: (enumLiteral_2= 'relu' )
                    // InternalMyDsl.g:1477:4: enumLiteral_2= 'relu'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getActivationFunctionTypeAccess().getRELUEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActivationFunctionTypeAccess().getRELUEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivationFunctionType"


    // $ANTLR start "ruleUpdaterType"
    // InternalMyDsl.g:1487:1: ruleUpdaterType returns [Enumerator current=null] : ( (enumLiteral_0= 'sgd' ) | (enumLiteral_1= 'adam' ) | (enumLiteral_2= 'adadelta' ) | (enumLiteral_3= 'nestrovs' ) | (enumLiteral_4= 'adagrad' ) | (enumLiteral_5= 'rmsprop' ) ) ;
    public final Enumerator ruleUpdaterType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1493:2: ( ( (enumLiteral_0= 'sgd' ) | (enumLiteral_1= 'adam' ) | (enumLiteral_2= 'adadelta' ) | (enumLiteral_3= 'nestrovs' ) | (enumLiteral_4= 'adagrad' ) | (enumLiteral_5= 'rmsprop' ) ) )
            // InternalMyDsl.g:1494:2: ( (enumLiteral_0= 'sgd' ) | (enumLiteral_1= 'adam' ) | (enumLiteral_2= 'adadelta' ) | (enumLiteral_3= 'nestrovs' ) | (enumLiteral_4= 'adagrad' ) | (enumLiteral_5= 'rmsprop' ) )
            {
            // InternalMyDsl.g:1494:2: ( (enumLiteral_0= 'sgd' ) | (enumLiteral_1= 'adam' ) | (enumLiteral_2= 'adadelta' ) | (enumLiteral_3= 'nestrovs' ) | (enumLiteral_4= 'adagrad' ) | (enumLiteral_5= 'rmsprop' ) )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt23=1;
                }
                break;
            case 53:
                {
                alt23=2;
                }
                break;
            case 54:
                {
                alt23=3;
                }
                break;
            case 55:
                {
                alt23=4;
                }
                break;
            case 56:
                {
                alt23=5;
                }
                break;
            case 57:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1495:3: (enumLiteral_0= 'sgd' )
                    {
                    // InternalMyDsl.g:1495:3: (enumLiteral_0= 'sgd' )
                    // InternalMyDsl.g:1496:4: enumLiteral_0= 'sgd'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getUpdaterTypeAccess().getSGDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUpdaterTypeAccess().getSGDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1503:3: (enumLiteral_1= 'adam' )
                    {
                    // InternalMyDsl.g:1503:3: (enumLiteral_1= 'adam' )
                    // InternalMyDsl.g:1504:4: enumLiteral_1= 'adam'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getUpdaterTypeAccess().getADAMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUpdaterTypeAccess().getADAMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1511:3: (enumLiteral_2= 'adadelta' )
                    {
                    // InternalMyDsl.g:1511:3: (enumLiteral_2= 'adadelta' )
                    // InternalMyDsl.g:1512:4: enumLiteral_2= 'adadelta'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getUpdaterTypeAccess().getADADELTAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getUpdaterTypeAccess().getADADELTAEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1519:3: (enumLiteral_3= 'nestrovs' )
                    {
                    // InternalMyDsl.g:1519:3: (enumLiteral_3= 'nestrovs' )
                    // InternalMyDsl.g:1520:4: enumLiteral_3= 'nestrovs'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getUpdaterTypeAccess().getNESTEROVSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getUpdaterTypeAccess().getNESTEROVSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1527:3: (enumLiteral_4= 'adagrad' )
                    {
                    // InternalMyDsl.g:1527:3: (enumLiteral_4= 'adagrad' )
                    // InternalMyDsl.g:1528:4: enumLiteral_4= 'adagrad'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getUpdaterTypeAccess().getADAGRADEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getUpdaterTypeAccess().getADAGRADEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1535:3: (enumLiteral_5= 'rmsprop' )
                    {
                    // InternalMyDsl.g:1535:3: (enumLiteral_5= 'rmsprop' )
                    // InternalMyDsl.g:1536:4: enumLiteral_5= 'rmsprop'
                    {
                    enumLiteral_5=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getUpdaterTypeAccess().getRMSPROPEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getUpdaterTypeAccess().getRMSPROPEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUpdaterType"


    // $ANTLR start "ruleWeightInitType"
    // InternalMyDsl.g:1546:1: ruleWeightInitType returns [Enumerator current=null] : ( (enumLiteral_0= 'zero' ) | (enumLiteral_1= 'uniform' ) | (enumLiteral_2= 'normalized' ) ) ;
    public final Enumerator ruleWeightInitType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1552:2: ( ( (enumLiteral_0= 'zero' ) | (enumLiteral_1= 'uniform' ) | (enumLiteral_2= 'normalized' ) ) )
            // InternalMyDsl.g:1553:2: ( (enumLiteral_0= 'zero' ) | (enumLiteral_1= 'uniform' ) | (enumLiteral_2= 'normalized' ) )
            {
            // InternalMyDsl.g:1553:2: ( (enumLiteral_0= 'zero' ) | (enumLiteral_1= 'uniform' ) | (enumLiteral_2= 'normalized' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt24=1;
                }
                break;
            case 59:
                {
                alt24=2;
                }
                break;
            case 60:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1554:3: (enumLiteral_0= 'zero' )
                    {
                    // InternalMyDsl.g:1554:3: (enumLiteral_0= 'zero' )
                    // InternalMyDsl.g:1555:4: enumLiteral_0= 'zero'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getWeightInitTypeAccess().getZEROEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWeightInitTypeAccess().getZEROEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1562:3: (enumLiteral_1= 'uniform' )
                    {
                    // InternalMyDsl.g:1562:3: (enumLiteral_1= 'uniform' )
                    // InternalMyDsl.g:1563:4: enumLiteral_1= 'uniform'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getWeightInitTypeAccess().getUNIFORMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWeightInitTypeAccess().getUNIFORMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1570:3: (enumLiteral_2= 'normalized' )
                    {
                    // InternalMyDsl.g:1570:3: (enumLiteral_2= 'normalized' )
                    // InternalMyDsl.g:1571:4: enumLiteral_2= 'normalized'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getWeightInitTypeAccess().getNORMALIZEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWeightInitTypeAccess().getNORMALIZEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWeightInitType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000007A0002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x03F0000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000250L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000019800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000520040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001F00000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000001D800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000019800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001A00000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004400000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000100000210L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000C0000000002L});

}
