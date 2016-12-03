package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ASSIGN", "RULE_REFERENCE", "RULE_ID", "RULE_INTEGER", "RULE_ZINTEGER", "RULE_REAL", "RULE_INT", "RULE_EXT_INT", "RULE_ML_COMMENT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'conv'", "'max-pool'", "'avg-pool'", "'dense'", "'softmax'", "'sigmoid'", "'tanh'", "'relu'", "'sgd'", "'adam'", "'adadelta'", "'nestrovs'", "'adagrad'", "'rmsprop'", "'zero'", "'uniform'", "'normalized'", "'network'", "'{'", "'epochs'", "'seed'", "'updater'", "'learningRate'", "'}'", "'layer'", "'type'", "'activation'", "'weightsInit'", "'biasInit'", "'['", "']'", "','", "'('", "'out'", "':'", "')'", "'ref'", "'in'", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int T__50=50;
    public static final int RULE_REFERENCE=5;
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
    public static final int RULE_ID=6;
    public static final int RULE_REAL=9;
    public static final int RULE_ASSIGN=4;
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
    public static final int RULE_ZINTEGER=8;
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
    public static final int RULE_INTEGER=7;
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__NetworkAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__NetworkAssignment ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__NetworkAssignment ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__NetworkAssignment ) )
            // InternalMyDsl.g:68:3: ( rule__Model__NetworkAssignment )
            {
             before(grammarAccess.getModelAccess().getNetworkAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__NetworkAssignment )
            // InternalMyDsl.g:69:4: rule__Model__NetworkAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__NetworkAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNetworkAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNetwork"
    // InternalMyDsl.g:78:1: entryRuleNetwork : ruleNetwork EOF ;
    public final void entryRuleNetwork() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleNetwork EOF )
            // InternalMyDsl.g:80:1: ruleNetwork EOF
            {
             before(grammarAccess.getNetworkRule()); 
            pushFollow(FOLLOW_1);
            ruleNetwork();

            state._fsp--;

             after(grammarAccess.getNetworkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNetwork"


    // $ANTLR start "ruleNetwork"
    // InternalMyDsl.g:87:1: ruleNetwork : ( ( rule__Network__UnorderedGroup ) ) ;
    public final void ruleNetwork() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Network__UnorderedGroup ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Network__UnorderedGroup ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Network__UnorderedGroup ) )
            // InternalMyDsl.g:93:3: ( rule__Network__UnorderedGroup )
            {
             before(grammarAccess.getNetworkAccess().getUnorderedGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Network__UnorderedGroup )
            // InternalMyDsl.g:94:4: rule__Network__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__Network__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNetwork"


    // $ANTLR start "entryRuleLayer"
    // InternalMyDsl.g:103:1: entryRuleLayer : ruleLayer EOF ;
    public final void entryRuleLayer() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleLayer EOF )
            // InternalMyDsl.g:105:1: ruleLayer EOF
            {
             before(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getLayerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalMyDsl.g:112:1: ruleLayer : ( ( rule__Layer__UnorderedGroup ) ) ;
    public final void ruleLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Layer__UnorderedGroup ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Layer__UnorderedGroup ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Layer__UnorderedGroup ) )
            // InternalMyDsl.g:118:3: ( rule__Layer__UnorderedGroup )
            {
             before(grammarAccess.getLayerAccess().getUnorderedGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Layer__UnorderedGroup )
            // InternalMyDsl.g:119:4: rule__Layer__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__Layer__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleLayerDeclaration"
    // InternalMyDsl.g:128:1: entryRuleLayerDeclaration : ruleLayerDeclaration EOF ;
    public final void entryRuleLayerDeclaration() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleLayerDeclaration EOF )
            // InternalMyDsl.g:130:1: ruleLayerDeclaration EOF
            {
             before(grammarAccess.getLayerDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleLayerDeclaration();

            state._fsp--;

             after(grammarAccess.getLayerDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayerDeclaration"


    // $ANTLR start "ruleLayerDeclaration"
    // InternalMyDsl.g:137:1: ruleLayerDeclaration : ( ( rule__LayerDeclaration__Alternatives ) ) ;
    public final void ruleLayerDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__LayerDeclaration__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__LayerDeclaration__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__LayerDeclaration__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__LayerDeclaration__Alternatives )
            {
             before(grammarAccess.getLayerDeclarationAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__LayerDeclaration__Alternatives )
            // InternalMyDsl.g:144:4: rule__LayerDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LayerDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayerDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayerDeclaration"


    // $ANTLR start "entryRuleLayerTuple"
    // InternalMyDsl.g:153:1: entryRuleLayerTuple : ruleLayerTuple EOF ;
    public final void entryRuleLayerTuple() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleLayerTuple EOF )
            // InternalMyDsl.g:155:1: ruleLayerTuple EOF
            {
             before(grammarAccess.getLayerTupleRule()); 
            pushFollow(FOLLOW_1);
            ruleLayerTuple();

            state._fsp--;

             after(grammarAccess.getLayerTupleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayerTuple"


    // $ANTLR start "ruleLayerTuple"
    // InternalMyDsl.g:162:1: ruleLayerTuple : ( ( rule__LayerTuple__Alternatives ) ) ;
    public final void ruleLayerTuple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__LayerTuple__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__LayerTuple__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__LayerTuple__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__LayerTuple__Alternatives )
            {
             before(grammarAccess.getLayerTupleAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__LayerTuple__Alternatives )
            // InternalMyDsl.g:169:4: rule__LayerTuple__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LayerTuple__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayerTupleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayerTuple"


    // $ANTLR start "entryRuleLayerRef"
    // InternalMyDsl.g:178:1: entryRuleLayerRef : ruleLayerRef EOF ;
    public final void entryRuleLayerRef() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleLayerRef EOF )
            // InternalMyDsl.g:180:1: ruleLayerRef EOF
            {
             before(grammarAccess.getLayerRefRule()); 
            pushFollow(FOLLOW_1);
            ruleLayerRef();

            state._fsp--;

             after(grammarAccess.getLayerRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayerRef"


    // $ANTLR start "ruleLayerRef"
    // InternalMyDsl.g:187:1: ruleLayerRef : ( ( rule__LayerRef__Alternatives ) ) ;
    public final void ruleLayerRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__LayerRef__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__LayerRef__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__LayerRef__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__LayerRef__Alternatives )
            {
             before(grammarAccess.getLayerRefAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__LayerRef__Alternatives )
            // InternalMyDsl.g:194:4: rule__LayerRef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LayerRef__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayerRefAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayerRef"


    // $ANTLR start "entryRuleVariableAssignment"
    // InternalMyDsl.g:203:1: entryRuleVariableAssignment : ruleVariableAssignment EOF ;
    public final void entryRuleVariableAssignment() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleVariableAssignment EOF )
            // InternalMyDsl.g:205:1: ruleVariableAssignment EOF
            {
             before(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableAssignment();

            state._fsp--;

             after(grammarAccess.getVariableAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableAssignment"


    // $ANTLR start "ruleVariableAssignment"
    // InternalMyDsl.g:212:1: ruleVariableAssignment : ( ( rule__VariableAssignment__Alternatives ) ) ;
    public final void ruleVariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__VariableAssignment__Alternatives ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__VariableAssignment__Alternatives ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__VariableAssignment__Alternatives ) )
            // InternalMyDsl.g:218:3: ( rule__VariableAssignment__Alternatives )
            {
             before(grammarAccess.getVariableAssignmentAccess().getAlternatives()); 
            // InternalMyDsl.g:219:3: ( rule__VariableAssignment__Alternatives )
            // InternalMyDsl.g:219:4: rule__VariableAssignment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariableAssignment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableAssignmentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableAssignment"


    // $ANTLR start "entryRuleFunction"
    // InternalMyDsl.g:228:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleFunction EOF )
            // InternalMyDsl.g:230:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalMyDsl.g:237:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Function__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Function__Group__0 )
            // InternalMyDsl.g:244:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDeclaredParameter"
    // InternalMyDsl.g:253:1: entryRuleDeclaredParameter : ruleDeclaredParameter EOF ;
    public final void entryRuleDeclaredParameter() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleDeclaredParameter EOF )
            // InternalMyDsl.g:255:1: ruleDeclaredParameter EOF
            {
             before(grammarAccess.getDeclaredParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaredParameter();

            state._fsp--;

             after(grammarAccess.getDeclaredParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaredParameter"


    // $ANTLR start "ruleDeclaredParameter"
    // InternalMyDsl.g:262:1: ruleDeclaredParameter : ( ( rule__DeclaredParameter__NameAssignment ) ) ;
    public final void ruleDeclaredParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__DeclaredParameter__NameAssignment ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__DeclaredParameter__NameAssignment ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__DeclaredParameter__NameAssignment ) )
            // InternalMyDsl.g:268:3: ( rule__DeclaredParameter__NameAssignment )
            {
             before(grammarAccess.getDeclaredParameterAccess().getNameAssignment()); 
            // InternalMyDsl.g:269:3: ( rule__DeclaredParameter__NameAssignment )
            // InternalMyDsl.g:269:4: rule__DeclaredParameter__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredParameter__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDeclaredParameterAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaredParameter"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:278:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleExpression EOF )
            // InternalMyDsl.g:280:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:287:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Expression__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Expression__Group__0 )
            // InternalMyDsl.g:294:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTerm"
    // InternalMyDsl.g:303:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleTerm EOF )
            // InternalMyDsl.g:305:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMyDsl.g:312:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Term__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Term__Group__0 )
            // InternalMyDsl.g:319:4: rule__Term__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // InternalMyDsl.g:328:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleFactor EOF )
            // InternalMyDsl.g:330:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMyDsl.g:337:1: ruleFactor : ( ( rule__Factor__Alternatives ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Factor__Alternatives ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Factor__Alternatives ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Factor__Alternatives ) )
            // InternalMyDsl.g:343:3: ( rule__Factor__Alternatives )
            {
             before(grammarAccess.getFactorAccess().getAlternatives()); 
            // InternalMyDsl.g:344:3: ( rule__Factor__Alternatives )
            // InternalMyDsl.g:344:4: rule__Factor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "ruleLayerType"
    // InternalMyDsl.g:353:1: ruleLayerType : ( ( rule__LayerType__Alternatives ) ) ;
    public final void ruleLayerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:357:1: ( ( ( rule__LayerType__Alternatives ) ) )
            // InternalMyDsl.g:358:2: ( ( rule__LayerType__Alternatives ) )
            {
            // InternalMyDsl.g:358:2: ( ( rule__LayerType__Alternatives ) )
            // InternalMyDsl.g:359:3: ( rule__LayerType__Alternatives )
            {
             before(grammarAccess.getLayerTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:360:3: ( rule__LayerType__Alternatives )
            // InternalMyDsl.g:360:4: rule__LayerType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LayerType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayerTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayerType"


    // $ANTLR start "ruleActivationFunctionType"
    // InternalMyDsl.g:369:1: ruleActivationFunctionType : ( ( rule__ActivationFunctionType__Alternatives ) ) ;
    public final void ruleActivationFunctionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:373:1: ( ( ( rule__ActivationFunctionType__Alternatives ) ) )
            // InternalMyDsl.g:374:2: ( ( rule__ActivationFunctionType__Alternatives ) )
            {
            // InternalMyDsl.g:374:2: ( ( rule__ActivationFunctionType__Alternatives ) )
            // InternalMyDsl.g:375:3: ( rule__ActivationFunctionType__Alternatives )
            {
             before(grammarAccess.getActivationFunctionTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:376:3: ( rule__ActivationFunctionType__Alternatives )
            // InternalMyDsl.g:376:4: rule__ActivationFunctionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActivationFunctionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActivationFunctionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivationFunctionType"


    // $ANTLR start "ruleUpdaterType"
    // InternalMyDsl.g:385:1: ruleUpdaterType : ( ( rule__UpdaterType__Alternatives ) ) ;
    public final void ruleUpdaterType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:389:1: ( ( ( rule__UpdaterType__Alternatives ) ) )
            // InternalMyDsl.g:390:2: ( ( rule__UpdaterType__Alternatives ) )
            {
            // InternalMyDsl.g:390:2: ( ( rule__UpdaterType__Alternatives ) )
            // InternalMyDsl.g:391:3: ( rule__UpdaterType__Alternatives )
            {
             before(grammarAccess.getUpdaterTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:392:3: ( rule__UpdaterType__Alternatives )
            // InternalMyDsl.g:392:4: rule__UpdaterType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UpdaterType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUpdaterTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpdaterType"


    // $ANTLR start "ruleWeightInitType"
    // InternalMyDsl.g:401:1: ruleWeightInitType : ( ( rule__WeightInitType__Alternatives ) ) ;
    public final void ruleWeightInitType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:405:1: ( ( ( rule__WeightInitType__Alternatives ) ) )
            // InternalMyDsl.g:406:2: ( ( rule__WeightInitType__Alternatives ) )
            {
            // InternalMyDsl.g:406:2: ( ( rule__WeightInitType__Alternatives ) )
            // InternalMyDsl.g:407:3: ( rule__WeightInitType__Alternatives )
            {
             before(grammarAccess.getWeightInitTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:408:3: ( rule__WeightInitType__Alternatives )
            // InternalMyDsl.g:408:4: rule__WeightInitType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WeightInitType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWeightInitTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWeightInitType"


    // $ANTLR start "rule__LayerDeclaration__Alternatives"
    // InternalMyDsl.g:416:1: rule__LayerDeclaration__Alternatives : ( ( ( rule__LayerDeclaration__LayerTupleAssignment_0 ) ) | ( ( rule__LayerDeclaration__Group_1__0 ) ) | ( ( rule__LayerDeclaration__Group_2__0 ) ) );
    public final void rule__LayerDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:420:1: ( ( ( rule__LayerDeclaration__LayerTupleAssignment_0 ) ) | ( ( rule__LayerDeclaration__Group_1__0 ) ) | ( ( rule__LayerDeclaration__Group_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 49:
            case 51:
                {
                alt1=1;
                }
                break;
            case 46:
                {
                alt1=2;
                }
                break;
            case 35:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:421:2: ( ( rule__LayerDeclaration__LayerTupleAssignment_0 ) )
                    {
                    // InternalMyDsl.g:421:2: ( ( rule__LayerDeclaration__LayerTupleAssignment_0 ) )
                    // InternalMyDsl.g:422:3: ( rule__LayerDeclaration__LayerTupleAssignment_0 )
                    {
                     before(grammarAccess.getLayerDeclarationAccess().getLayerTupleAssignment_0()); 
                    // InternalMyDsl.g:423:3: ( rule__LayerDeclaration__LayerTupleAssignment_0 )
                    // InternalMyDsl.g:423:4: rule__LayerDeclaration__LayerTupleAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayerDeclaration__LayerTupleAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayerDeclarationAccess().getLayerTupleAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:427:2: ( ( rule__LayerDeclaration__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:427:2: ( ( rule__LayerDeclaration__Group_1__0 ) )
                    // InternalMyDsl.g:428:3: ( rule__LayerDeclaration__Group_1__0 )
                    {
                     before(grammarAccess.getLayerDeclarationAccess().getGroup_1()); 
                    // InternalMyDsl.g:429:3: ( rule__LayerDeclaration__Group_1__0 )
                    // InternalMyDsl.g:429:4: rule__LayerDeclaration__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayerDeclaration__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayerDeclarationAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:433:2: ( ( rule__LayerDeclaration__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:433:2: ( ( rule__LayerDeclaration__Group_2__0 ) )
                    // InternalMyDsl.g:434:3: ( rule__LayerDeclaration__Group_2__0 )
                    {
                     before(grammarAccess.getLayerDeclarationAccess().getGroup_2()); 
                    // InternalMyDsl.g:435:3: ( rule__LayerDeclaration__Group_2__0 )
                    // InternalMyDsl.g:435:4: rule__LayerDeclaration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayerDeclaration__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayerDeclarationAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Alternatives"


    // $ANTLR start "rule__LayerTuple__Alternatives"
    // InternalMyDsl.g:443:1: rule__LayerTuple__Alternatives : ( ( ( rule__LayerTuple__Group_0__0 ) ) | ( ( rule__LayerTuple__Group_1__0 ) ) | ( ( rule__LayerTuple__Group_2__0 ) ) );
    public final void rule__LayerTuple__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:447:1: ( ( ( rule__LayerTuple__Group_0__0 ) ) | ( ( rule__LayerTuple__Group_1__0 ) ) | ( ( rule__LayerTuple__Group_2__0 ) ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==49) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==50||(LA2_1>=53 && LA2_1<=54)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==RULE_INTEGER||LA2_1==51||LA2_1==55) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==51) ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:448:2: ( ( rule__LayerTuple__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:448:2: ( ( rule__LayerTuple__Group_0__0 ) )
                    // InternalMyDsl.g:449:3: ( rule__LayerTuple__Group_0__0 )
                    {
                     before(grammarAccess.getLayerTupleAccess().getGroup_0()); 
                    // InternalMyDsl.g:450:3: ( rule__LayerTuple__Group_0__0 )
                    // InternalMyDsl.g:450:4: rule__LayerTuple__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayerTuple__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayerTupleAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:454:2: ( ( rule__LayerTuple__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:454:2: ( ( rule__LayerTuple__Group_1__0 ) )
                    // InternalMyDsl.g:455:3: ( rule__LayerTuple__Group_1__0 )
                    {
                     before(grammarAccess.getLayerTupleAccess().getGroup_1()); 
                    // InternalMyDsl.g:456:3: ( rule__LayerTuple__Group_1__0 )
                    // InternalMyDsl.g:456:4: rule__LayerTuple__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayerTuple__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayerTupleAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:460:2: ( ( rule__LayerTuple__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:460:2: ( ( rule__LayerTuple__Group_2__0 ) )
                    // InternalMyDsl.g:461:3: ( rule__LayerTuple__Group_2__0 )
                    {
                     before(grammarAccess.getLayerTupleAccess().getGroup_2()); 
                    // InternalMyDsl.g:462:3: ( rule__LayerTuple__Group_2__0 )
                    // InternalMyDsl.g:462:4: rule__LayerTuple__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayerTuple__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayerTupleAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Alternatives"


    // $ANTLR start "rule__LayerRef__Alternatives"
    // InternalMyDsl.g:470:1: rule__LayerRef__Alternatives : ( ( ( rule__LayerRef__ValueAssignment_0 ) ) | ( ( rule__LayerRef__Group_1__0 ) ) );
    public final void rule__LayerRef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:474:1: ( ( ( rule__LayerRef__ValueAssignment_0 ) ) | ( ( rule__LayerRef__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INTEGER) ) {
                alt3=1;
            }
            else if ( (LA3_0==55) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:475:2: ( ( rule__LayerRef__ValueAssignment_0 ) )
                    {
                    // InternalMyDsl.g:475:2: ( ( rule__LayerRef__ValueAssignment_0 ) )
                    // InternalMyDsl.g:476:3: ( rule__LayerRef__ValueAssignment_0 )
                    {
                     before(grammarAccess.getLayerRefAccess().getValueAssignment_0()); 
                    // InternalMyDsl.g:477:3: ( rule__LayerRef__ValueAssignment_0 )
                    // InternalMyDsl.g:477:4: rule__LayerRef__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayerRef__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayerRefAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:481:2: ( ( rule__LayerRef__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:481:2: ( ( rule__LayerRef__Group_1__0 ) )
                    // InternalMyDsl.g:482:3: ( rule__LayerRef__Group_1__0 )
                    {
                     before(grammarAccess.getLayerRefAccess().getGroup_1()); 
                    // InternalMyDsl.g:483:3: ( rule__LayerRef__Group_1__0 )
                    // InternalMyDsl.g:483:4: rule__LayerRef__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayerRef__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayerRefAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerRef__Alternatives"


    // $ANTLR start "rule__VariableAssignment__Alternatives"
    // InternalMyDsl.g:491:1: rule__VariableAssignment__Alternatives : ( ( ( rule__VariableAssignment__ValueAssignment_0 ) ) | ( ruleExpression ) | ( ruleFunction ) );
    public final void rule__VariableAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:495:1: ( ( ( rule__VariableAssignment__ValueAssignment_0 ) ) | ( ruleExpression ) | ( ruleFunction ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
                {
                alt4=1;
                }
                break;
            case RULE_REAL:
            case 49:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==EOF||(LA4_3>=40 && LA4_3<=41)||(LA4_3>=44 && LA4_3<=45)||(LA4_3>=57 && LA4_3<=60)) ) {
                    alt4=2;
                }
                else if ( (LA4_3==RULE_ASSIGN||LA4_3==49) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:496:2: ( ( rule__VariableAssignment__ValueAssignment_0 ) )
                    {
                    // InternalMyDsl.g:496:2: ( ( rule__VariableAssignment__ValueAssignment_0 ) )
                    // InternalMyDsl.g:497:3: ( rule__VariableAssignment__ValueAssignment_0 )
                    {
                     before(grammarAccess.getVariableAssignmentAccess().getValueAssignment_0()); 
                    // InternalMyDsl.g:498:3: ( rule__VariableAssignment__ValueAssignment_0 )
                    // InternalMyDsl.g:498:4: rule__VariableAssignment__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableAssignment__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableAssignmentAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:502:2: ( ruleExpression )
                    {
                    // InternalMyDsl.g:502:2: ( ruleExpression )
                    // InternalMyDsl.g:503:3: ruleExpression
                    {
                     before(grammarAccess.getVariableAssignmentAccess().getExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getVariableAssignmentAccess().getExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:508:2: ( ruleFunction )
                    {
                    // InternalMyDsl.g:508:2: ( ruleFunction )
                    // InternalMyDsl.g:509:3: ruleFunction
                    {
                     before(grammarAccess.getVariableAssignmentAccess().getFunctionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getVariableAssignmentAccess().getFunctionParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives_1_0"
    // InternalMyDsl.g:518:1: rule__Expression__Alternatives_1_0 : ( ( ( rule__Expression__Group_1_0_0__0 ) ) | ( ( rule__Expression__Group_1_0_1__0 ) ) );
    public final void rule__Expression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:522:1: ( ( ( rule__Expression__Group_1_0_0__0 ) ) | ( ( rule__Expression__Group_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==57) ) {
                alt5=1;
            }
            else if ( (LA5_0==58) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:523:2: ( ( rule__Expression__Group_1_0_0__0 ) )
                    {
                    // InternalMyDsl.g:523:2: ( ( rule__Expression__Group_1_0_0__0 ) )
                    // InternalMyDsl.g:524:3: ( rule__Expression__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1_0_0()); 
                    // InternalMyDsl.g:525:3: ( rule__Expression__Group_1_0_0__0 )
                    // InternalMyDsl.g:525:4: rule__Expression__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:529:2: ( ( rule__Expression__Group_1_0_1__0 ) )
                    {
                    // InternalMyDsl.g:529:2: ( ( rule__Expression__Group_1_0_1__0 ) )
                    // InternalMyDsl.g:530:3: ( rule__Expression__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1_0_1()); 
                    // InternalMyDsl.g:531:3: ( rule__Expression__Group_1_0_1__0 )
                    // InternalMyDsl.g:531:4: rule__Expression__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives_1_0"


    // $ANTLR start "rule__Term__Alternatives_1_0"
    // InternalMyDsl.g:539:1: rule__Term__Alternatives_1_0 : ( ( ( rule__Term__Group_1_0_0__0 ) ) | ( ( rule__Term__Group_1_0_1__0 ) ) );
    public final void rule__Term__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:543:1: ( ( ( rule__Term__Group_1_0_0__0 ) ) | ( ( rule__Term__Group_1_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==59) ) {
                alt6=1;
            }
            else if ( (LA6_0==60) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:544:2: ( ( rule__Term__Group_1_0_0__0 ) )
                    {
                    // InternalMyDsl.g:544:2: ( ( rule__Term__Group_1_0_0__0 ) )
                    // InternalMyDsl.g:545:3: ( rule__Term__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_1_0_0()); 
                    // InternalMyDsl.g:546:3: ( rule__Term__Group_1_0_0__0 )
                    // InternalMyDsl.g:546:4: rule__Term__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:550:2: ( ( rule__Term__Group_1_0_1__0 ) )
                    {
                    // InternalMyDsl.g:550:2: ( ( rule__Term__Group_1_0_1__0 ) )
                    // InternalMyDsl.g:551:3: ( rule__Term__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_1_0_1()); 
                    // InternalMyDsl.g:552:3: ( rule__Term__Group_1_0_1__0 )
                    // InternalMyDsl.g:552:4: rule__Term__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Alternatives_1_0"


    // $ANTLR start "rule__Factor__Alternatives"
    // InternalMyDsl.g:560:1: rule__Factor__Alternatives : ( ( ( rule__Factor__NumberAssignment_0 ) ) | ( ( rule__Factor__VariableAssignment_1 ) ) | ( ( rule__Factor__Group_2__0 ) ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:564:1: ( ( ( rule__Factor__NumberAssignment_0 ) ) | ( ( rule__Factor__VariableAssignment_1 ) ) | ( ( rule__Factor__Group_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_REAL:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                alt7=2;
                }
                break;
            case 49:
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
                    // InternalMyDsl.g:565:2: ( ( rule__Factor__NumberAssignment_0 ) )
                    {
                    // InternalMyDsl.g:565:2: ( ( rule__Factor__NumberAssignment_0 ) )
                    // InternalMyDsl.g:566:3: ( rule__Factor__NumberAssignment_0 )
                    {
                     before(grammarAccess.getFactorAccess().getNumberAssignment_0()); 
                    // InternalMyDsl.g:567:3: ( rule__Factor__NumberAssignment_0 )
                    // InternalMyDsl.g:567:4: rule__Factor__NumberAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__NumberAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getNumberAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:571:2: ( ( rule__Factor__VariableAssignment_1 ) )
                    {
                    // InternalMyDsl.g:571:2: ( ( rule__Factor__VariableAssignment_1 ) )
                    // InternalMyDsl.g:572:3: ( rule__Factor__VariableAssignment_1 )
                    {
                     before(grammarAccess.getFactorAccess().getVariableAssignment_1()); 
                    // InternalMyDsl.g:573:3: ( rule__Factor__VariableAssignment_1 )
                    // InternalMyDsl.g:573:4: rule__Factor__VariableAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__VariableAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getVariableAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:577:2: ( ( rule__Factor__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:577:2: ( ( rule__Factor__Group_2__0 ) )
                    // InternalMyDsl.g:578:3: ( rule__Factor__Group_2__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_2()); 
                    // InternalMyDsl.g:579:3: ( rule__Factor__Group_2__0 )
                    // InternalMyDsl.g:579:4: rule__Factor__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Alternatives"


    // $ANTLR start "rule__LayerType__Alternatives"
    // InternalMyDsl.g:587:1: rule__LayerType__Alternatives : ( ( ( 'conv' ) ) | ( ( 'max-pool' ) ) | ( ( 'avg-pool' ) ) | ( ( 'dense' ) ) | ( ( 'softmax' ) ) );
    public final void rule__LayerType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:1: ( ( ( 'conv' ) ) | ( ( 'max-pool' ) ) | ( ( 'avg-pool' ) ) | ( ( 'dense' ) ) | ( ( 'softmax' ) ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case 19:
                {
                alt8=3;
                }
                break;
            case 20:
                {
                alt8=4;
                }
                break;
            case 21:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:592:2: ( ( 'conv' ) )
                    {
                    // InternalMyDsl.g:592:2: ( ( 'conv' ) )
                    // InternalMyDsl.g:593:3: ( 'conv' )
                    {
                     before(grammarAccess.getLayerTypeAccess().getCONVOLUTIONALEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:594:3: ( 'conv' )
                    // InternalMyDsl.g:594:4: 'conv'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getLayerTypeAccess().getCONVOLUTIONALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:598:2: ( ( 'max-pool' ) )
                    {
                    // InternalMyDsl.g:598:2: ( ( 'max-pool' ) )
                    // InternalMyDsl.g:599:3: ( 'max-pool' )
                    {
                     before(grammarAccess.getLayerTypeAccess().getMAXPOOLEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:600:3: ( 'max-pool' )
                    // InternalMyDsl.g:600:4: 'max-pool'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getLayerTypeAccess().getMAXPOOLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:604:2: ( ( 'avg-pool' ) )
                    {
                    // InternalMyDsl.g:604:2: ( ( 'avg-pool' ) )
                    // InternalMyDsl.g:605:3: ( 'avg-pool' )
                    {
                     before(grammarAccess.getLayerTypeAccess().getAVGPOOLEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:606:3: ( 'avg-pool' )
                    // InternalMyDsl.g:606:4: 'avg-pool'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getLayerTypeAccess().getAVGPOOLEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:610:2: ( ( 'dense' ) )
                    {
                    // InternalMyDsl.g:610:2: ( ( 'dense' ) )
                    // InternalMyDsl.g:611:3: ( 'dense' )
                    {
                     before(grammarAccess.getLayerTypeAccess().getDENSEEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:612:3: ( 'dense' )
                    // InternalMyDsl.g:612:4: 'dense'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getLayerTypeAccess().getDENSEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:616:2: ( ( 'softmax' ) )
                    {
                    // InternalMyDsl.g:616:2: ( ( 'softmax' ) )
                    // InternalMyDsl.g:617:3: ( 'softmax' )
                    {
                     before(grammarAccess.getLayerTypeAccess().getSOFTMAXEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:618:3: ( 'softmax' )
                    // InternalMyDsl.g:618:4: 'softmax'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getLayerTypeAccess().getSOFTMAXEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerType__Alternatives"


    // $ANTLR start "rule__ActivationFunctionType__Alternatives"
    // InternalMyDsl.g:626:1: rule__ActivationFunctionType__Alternatives : ( ( ( 'sigmoid' ) ) | ( ( 'tanh' ) ) | ( ( 'relu' ) ) );
    public final void rule__ActivationFunctionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:630:1: ( ( ( 'sigmoid' ) ) | ( ( 'tanh' ) ) | ( ( 'relu' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:631:2: ( ( 'sigmoid' ) )
                    {
                    // InternalMyDsl.g:631:2: ( ( 'sigmoid' ) )
                    // InternalMyDsl.g:632:3: ( 'sigmoid' )
                    {
                     before(grammarAccess.getActivationFunctionTypeAccess().getSIGMOIDEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:633:3: ( 'sigmoid' )
                    // InternalMyDsl.g:633:4: 'sigmoid'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getActivationFunctionTypeAccess().getSIGMOIDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:637:2: ( ( 'tanh' ) )
                    {
                    // InternalMyDsl.g:637:2: ( ( 'tanh' ) )
                    // InternalMyDsl.g:638:3: ( 'tanh' )
                    {
                     before(grammarAccess.getActivationFunctionTypeAccess().getTANHEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:639:3: ( 'tanh' )
                    // InternalMyDsl.g:639:4: 'tanh'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getActivationFunctionTypeAccess().getTANHEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:643:2: ( ( 'relu' ) )
                    {
                    // InternalMyDsl.g:643:2: ( ( 'relu' ) )
                    // InternalMyDsl.g:644:3: ( 'relu' )
                    {
                     before(grammarAccess.getActivationFunctionTypeAccess().getRELUEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:645:3: ( 'relu' )
                    // InternalMyDsl.g:645:4: 'relu'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getActivationFunctionTypeAccess().getRELUEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationFunctionType__Alternatives"


    // $ANTLR start "rule__UpdaterType__Alternatives"
    // InternalMyDsl.g:653:1: rule__UpdaterType__Alternatives : ( ( ( 'sgd' ) ) | ( ( 'adam' ) ) | ( ( 'adadelta' ) ) | ( ( 'nestrovs' ) ) | ( ( 'adagrad' ) ) | ( ( 'rmsprop' ) ) );
    public final void rule__UpdaterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:657:1: ( ( ( 'sgd' ) ) | ( ( 'adam' ) ) | ( ( 'adadelta' ) ) | ( ( 'nestrovs' ) ) | ( ( 'adagrad' ) ) | ( ( 'rmsprop' ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt10=1;
                }
                break;
            case 26:
                {
                alt10=2;
                }
                break;
            case 27:
                {
                alt10=3;
                }
                break;
            case 28:
                {
                alt10=4;
                }
                break;
            case 29:
                {
                alt10=5;
                }
                break;
            case 30:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:658:2: ( ( 'sgd' ) )
                    {
                    // InternalMyDsl.g:658:2: ( ( 'sgd' ) )
                    // InternalMyDsl.g:659:3: ( 'sgd' )
                    {
                     before(grammarAccess.getUpdaterTypeAccess().getSGDEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:660:3: ( 'sgd' )
                    // InternalMyDsl.g:660:4: 'sgd'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getUpdaterTypeAccess().getSGDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:664:2: ( ( 'adam' ) )
                    {
                    // InternalMyDsl.g:664:2: ( ( 'adam' ) )
                    // InternalMyDsl.g:665:3: ( 'adam' )
                    {
                     before(grammarAccess.getUpdaterTypeAccess().getADAMEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:666:3: ( 'adam' )
                    // InternalMyDsl.g:666:4: 'adam'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getUpdaterTypeAccess().getADAMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:670:2: ( ( 'adadelta' ) )
                    {
                    // InternalMyDsl.g:670:2: ( ( 'adadelta' ) )
                    // InternalMyDsl.g:671:3: ( 'adadelta' )
                    {
                     before(grammarAccess.getUpdaterTypeAccess().getADADELTAEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:672:3: ( 'adadelta' )
                    // InternalMyDsl.g:672:4: 'adadelta'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getUpdaterTypeAccess().getADADELTAEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:676:2: ( ( 'nestrovs' ) )
                    {
                    // InternalMyDsl.g:676:2: ( ( 'nestrovs' ) )
                    // InternalMyDsl.g:677:3: ( 'nestrovs' )
                    {
                     before(grammarAccess.getUpdaterTypeAccess().getNESTEROVSEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:678:3: ( 'nestrovs' )
                    // InternalMyDsl.g:678:4: 'nestrovs'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getUpdaterTypeAccess().getNESTEROVSEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:682:2: ( ( 'adagrad' ) )
                    {
                    // InternalMyDsl.g:682:2: ( ( 'adagrad' ) )
                    // InternalMyDsl.g:683:3: ( 'adagrad' )
                    {
                     before(grammarAccess.getUpdaterTypeAccess().getADAGRADEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:684:3: ( 'adagrad' )
                    // InternalMyDsl.g:684:4: 'adagrad'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getUpdaterTypeAccess().getADAGRADEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:688:2: ( ( 'rmsprop' ) )
                    {
                    // InternalMyDsl.g:688:2: ( ( 'rmsprop' ) )
                    // InternalMyDsl.g:689:3: ( 'rmsprop' )
                    {
                     before(grammarAccess.getUpdaterTypeAccess().getRMSPROPEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:690:3: ( 'rmsprop' )
                    // InternalMyDsl.g:690:4: 'rmsprop'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getUpdaterTypeAccess().getRMSPROPEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdaterType__Alternatives"


    // $ANTLR start "rule__WeightInitType__Alternatives"
    // InternalMyDsl.g:698:1: rule__WeightInitType__Alternatives : ( ( ( 'zero' ) ) | ( ( 'uniform' ) ) | ( ( 'normalized' ) ) );
    public final void rule__WeightInitType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( ( ( 'zero' ) ) | ( ( 'uniform' ) ) | ( ( 'normalized' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt11=1;
                }
                break;
            case 32:
                {
                alt11=2;
                }
                break;
            case 33:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:703:2: ( ( 'zero' ) )
                    {
                    // InternalMyDsl.g:703:2: ( ( 'zero' ) )
                    // InternalMyDsl.g:704:3: ( 'zero' )
                    {
                     before(grammarAccess.getWeightInitTypeAccess().getZEROEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:705:3: ( 'zero' )
                    // InternalMyDsl.g:705:4: 'zero'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeightInitTypeAccess().getZEROEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:709:2: ( ( 'uniform' ) )
                    {
                    // InternalMyDsl.g:709:2: ( ( 'uniform' ) )
                    // InternalMyDsl.g:710:3: ( 'uniform' )
                    {
                     before(grammarAccess.getWeightInitTypeAccess().getUNIFORMEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:711:3: ( 'uniform' )
                    // InternalMyDsl.g:711:4: 'uniform'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeightInitTypeAccess().getUNIFORMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:715:2: ( ( 'normalized' ) )
                    {
                    // InternalMyDsl.g:715:2: ( ( 'normalized' ) )
                    // InternalMyDsl.g:716:3: ( 'normalized' )
                    {
                     before(grammarAccess.getWeightInitTypeAccess().getNORMALIZEDEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:717:3: ( 'normalized' )
                    // InternalMyDsl.g:717:4: 'normalized'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeightInitTypeAccess().getNORMALIZEDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WeightInitType__Alternatives"


    // $ANTLR start "rule__Network__Group_0__0"
    // InternalMyDsl.g:725:1: rule__Network__Group_0__0 : rule__Network__Group_0__0__Impl rule__Network__Group_0__1 ;
    public final void rule__Network__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:729:1: ( rule__Network__Group_0__0__Impl rule__Network__Group_0__1 )
            // InternalMyDsl.g:730:2: rule__Network__Group_0__0__Impl rule__Network__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Network__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_0__0"


    // $ANTLR start "rule__Network__Group_0__0__Impl"
    // InternalMyDsl.g:737:1: rule__Network__Group_0__0__Impl : ( 'network' ) ;
    public final void rule__Network__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:1: ( ( 'network' ) )
            // InternalMyDsl.g:742:1: ( 'network' )
            {
            // InternalMyDsl.g:742:1: ( 'network' )
            // InternalMyDsl.g:743:2: 'network'
            {
             before(grammarAccess.getNetworkAccess().getNetworkKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getNetworkKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_0__0__Impl"


    // $ANTLR start "rule__Network__Group_0__1"
    // InternalMyDsl.g:752:1: rule__Network__Group_0__1 : rule__Network__Group_0__1__Impl rule__Network__Group_0__2 ;
    public final void rule__Network__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:756:1: ( rule__Network__Group_0__1__Impl rule__Network__Group_0__2 )
            // InternalMyDsl.g:757:2: rule__Network__Group_0__1__Impl rule__Network__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__Network__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_0__1"


    // $ANTLR start "rule__Network__Group_0__1__Impl"
    // InternalMyDsl.g:764:1: rule__Network__Group_0__1__Impl : ( ( rule__Network__NameAssignment_0_1 ) ) ;
    public final void rule__Network__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:768:1: ( ( ( rule__Network__NameAssignment_0_1 ) ) )
            // InternalMyDsl.g:769:1: ( ( rule__Network__NameAssignment_0_1 ) )
            {
            // InternalMyDsl.g:769:1: ( ( rule__Network__NameAssignment_0_1 ) )
            // InternalMyDsl.g:770:2: ( rule__Network__NameAssignment_0_1 )
            {
             before(grammarAccess.getNetworkAccess().getNameAssignment_0_1()); 
            // InternalMyDsl.g:771:2: ( rule__Network__NameAssignment_0_1 )
            // InternalMyDsl.g:771:3: rule__Network__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Network__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_0__1__Impl"


    // $ANTLR start "rule__Network__Group_0__2"
    // InternalMyDsl.g:779:1: rule__Network__Group_0__2 : rule__Network__Group_0__2__Impl ;
    public final void rule__Network__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:783:1: ( rule__Network__Group_0__2__Impl )
            // InternalMyDsl.g:784:2: rule__Network__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Network__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_0__2"


    // $ANTLR start "rule__Network__Group_0__2__Impl"
    // InternalMyDsl.g:790:1: rule__Network__Group_0__2__Impl : ( '{' ) ;
    public final void rule__Network__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:794:1: ( ( '{' ) )
            // InternalMyDsl.g:795:1: ( '{' )
            {
            // InternalMyDsl.g:795:1: ( '{' )
            // InternalMyDsl.g:796:2: '{'
            {
             before(grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_0_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_0__2__Impl"


    // $ANTLR start "rule__Network__Group_1__0"
    // InternalMyDsl.g:806:1: rule__Network__Group_1__0 : rule__Network__Group_1__0__Impl rule__Network__Group_1__1 ;
    public final void rule__Network__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:810:1: ( rule__Network__Group_1__0__Impl rule__Network__Group_1__1 )
            // InternalMyDsl.g:811:2: rule__Network__Group_1__0__Impl rule__Network__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Network__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_1__0"


    // $ANTLR start "rule__Network__Group_1__0__Impl"
    // InternalMyDsl.g:818:1: rule__Network__Group_1__0__Impl : ( 'epochs' ) ;
    public final void rule__Network__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:822:1: ( ( 'epochs' ) )
            // InternalMyDsl.g:823:1: ( 'epochs' )
            {
            // InternalMyDsl.g:823:1: ( 'epochs' )
            // InternalMyDsl.g:824:2: 'epochs'
            {
             before(grammarAccess.getNetworkAccess().getEpochsKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getEpochsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_1__0__Impl"


    // $ANTLR start "rule__Network__Group_1__1"
    // InternalMyDsl.g:833:1: rule__Network__Group_1__1 : rule__Network__Group_1__1__Impl rule__Network__Group_1__2 ;
    public final void rule__Network__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:837:1: ( rule__Network__Group_1__1__Impl rule__Network__Group_1__2 )
            // InternalMyDsl.g:838:2: rule__Network__Group_1__1__Impl rule__Network__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Network__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_1__1"


    // $ANTLR start "rule__Network__Group_1__1__Impl"
    // InternalMyDsl.g:845:1: rule__Network__Group_1__1__Impl : ( RULE_ASSIGN ) ;
    public final void rule__Network__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:849:1: ( ( RULE_ASSIGN ) )
            // InternalMyDsl.g:850:1: ( RULE_ASSIGN )
            {
            // InternalMyDsl.g:850:1: ( RULE_ASSIGN )
            // InternalMyDsl.g:851:2: RULE_ASSIGN
            {
             before(grammarAccess.getNetworkAccess().getASSIGNTerminalRuleCall_1_1()); 
            match(input,RULE_ASSIGN,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getASSIGNTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_1__1__Impl"


    // $ANTLR start "rule__Network__Group_1__2"
    // InternalMyDsl.g:860:1: rule__Network__Group_1__2 : rule__Network__Group_1__2__Impl ;
    public final void rule__Network__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:864:1: ( rule__Network__Group_1__2__Impl )
            // InternalMyDsl.g:865:2: rule__Network__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Network__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_1__2"


    // $ANTLR start "rule__Network__Group_1__2__Impl"
    // InternalMyDsl.g:871:1: rule__Network__Group_1__2__Impl : ( ( rule__Network__EpochsAssignment_1_2 ) ) ;
    public final void rule__Network__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:875:1: ( ( ( rule__Network__EpochsAssignment_1_2 ) ) )
            // InternalMyDsl.g:876:1: ( ( rule__Network__EpochsAssignment_1_2 ) )
            {
            // InternalMyDsl.g:876:1: ( ( rule__Network__EpochsAssignment_1_2 ) )
            // InternalMyDsl.g:877:2: ( rule__Network__EpochsAssignment_1_2 )
            {
             before(grammarAccess.getNetworkAccess().getEpochsAssignment_1_2()); 
            // InternalMyDsl.g:878:2: ( rule__Network__EpochsAssignment_1_2 )
            // InternalMyDsl.g:878:3: rule__Network__EpochsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Network__EpochsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getEpochsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_1__2__Impl"


    // $ANTLR start "rule__Network__Group_2__0"
    // InternalMyDsl.g:887:1: rule__Network__Group_2__0 : rule__Network__Group_2__0__Impl rule__Network__Group_2__1 ;
    public final void rule__Network__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:1: ( rule__Network__Group_2__0__Impl rule__Network__Group_2__1 )
            // InternalMyDsl.g:892:2: rule__Network__Group_2__0__Impl rule__Network__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Network__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_2__0"


    // $ANTLR start "rule__Network__Group_2__0__Impl"
    // InternalMyDsl.g:899:1: rule__Network__Group_2__0__Impl : ( 'seed' ) ;
    public final void rule__Network__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:903:1: ( ( 'seed' ) )
            // InternalMyDsl.g:904:1: ( 'seed' )
            {
            // InternalMyDsl.g:904:1: ( 'seed' )
            // InternalMyDsl.g:905:2: 'seed'
            {
             before(grammarAccess.getNetworkAccess().getSeedKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getSeedKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_2__0__Impl"


    // $ANTLR start "rule__Network__Group_2__1"
    // InternalMyDsl.g:914:1: rule__Network__Group_2__1 : rule__Network__Group_2__1__Impl rule__Network__Group_2__2 ;
    public final void rule__Network__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:918:1: ( rule__Network__Group_2__1__Impl rule__Network__Group_2__2 )
            // InternalMyDsl.g:919:2: rule__Network__Group_2__1__Impl rule__Network__Group_2__2
            {
            pushFollow(FOLLOW_7);
            rule__Network__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_2__1"


    // $ANTLR start "rule__Network__Group_2__1__Impl"
    // InternalMyDsl.g:926:1: rule__Network__Group_2__1__Impl : ( RULE_ASSIGN ) ;
    public final void rule__Network__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:930:1: ( ( RULE_ASSIGN ) )
            // InternalMyDsl.g:931:1: ( RULE_ASSIGN )
            {
            // InternalMyDsl.g:931:1: ( RULE_ASSIGN )
            // InternalMyDsl.g:932:2: RULE_ASSIGN
            {
             before(grammarAccess.getNetworkAccess().getASSIGNTerminalRuleCall_2_1()); 
            match(input,RULE_ASSIGN,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getASSIGNTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_2__1__Impl"


    // $ANTLR start "rule__Network__Group_2__2"
    // InternalMyDsl.g:941:1: rule__Network__Group_2__2 : rule__Network__Group_2__2__Impl ;
    public final void rule__Network__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:945:1: ( rule__Network__Group_2__2__Impl )
            // InternalMyDsl.g:946:2: rule__Network__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Network__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_2__2"


    // $ANTLR start "rule__Network__Group_2__2__Impl"
    // InternalMyDsl.g:952:1: rule__Network__Group_2__2__Impl : ( ( rule__Network__SeedAssignment_2_2 ) ) ;
    public final void rule__Network__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:956:1: ( ( ( rule__Network__SeedAssignment_2_2 ) ) )
            // InternalMyDsl.g:957:1: ( ( rule__Network__SeedAssignment_2_2 ) )
            {
            // InternalMyDsl.g:957:1: ( ( rule__Network__SeedAssignment_2_2 ) )
            // InternalMyDsl.g:958:2: ( rule__Network__SeedAssignment_2_2 )
            {
             before(grammarAccess.getNetworkAccess().getSeedAssignment_2_2()); 
            // InternalMyDsl.g:959:2: ( rule__Network__SeedAssignment_2_2 )
            // InternalMyDsl.g:959:3: rule__Network__SeedAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Network__SeedAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getSeedAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_2__2__Impl"


    // $ANTLR start "rule__Network__Group_3__0"
    // InternalMyDsl.g:968:1: rule__Network__Group_3__0 : rule__Network__Group_3__0__Impl rule__Network__Group_3__1 ;
    public final void rule__Network__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:972:1: ( rule__Network__Group_3__0__Impl rule__Network__Group_3__1 )
            // InternalMyDsl.g:973:2: rule__Network__Group_3__0__Impl rule__Network__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Network__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_3__0"


    // $ANTLR start "rule__Network__Group_3__0__Impl"
    // InternalMyDsl.g:980:1: rule__Network__Group_3__0__Impl : ( 'updater' ) ;
    public final void rule__Network__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:984:1: ( ( 'updater' ) )
            // InternalMyDsl.g:985:1: ( 'updater' )
            {
            // InternalMyDsl.g:985:1: ( 'updater' )
            // InternalMyDsl.g:986:2: 'updater'
            {
             before(grammarAccess.getNetworkAccess().getUpdaterKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getUpdaterKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_3__0__Impl"


    // $ANTLR start "rule__Network__Group_3__1"
    // InternalMyDsl.g:995:1: rule__Network__Group_3__1 : rule__Network__Group_3__1__Impl rule__Network__Group_3__2 ;
    public final void rule__Network__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:999:1: ( rule__Network__Group_3__1__Impl rule__Network__Group_3__2 )
            // InternalMyDsl.g:1000:2: rule__Network__Group_3__1__Impl rule__Network__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__Network__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_3__1"


    // $ANTLR start "rule__Network__Group_3__1__Impl"
    // InternalMyDsl.g:1007:1: rule__Network__Group_3__1__Impl : ( RULE_REFERENCE ) ;
    public final void rule__Network__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1011:1: ( ( RULE_REFERENCE ) )
            // InternalMyDsl.g:1012:1: ( RULE_REFERENCE )
            {
            // InternalMyDsl.g:1012:1: ( RULE_REFERENCE )
            // InternalMyDsl.g:1013:2: RULE_REFERENCE
            {
             before(grammarAccess.getNetworkAccess().getREFERENCETerminalRuleCall_3_1()); 
            match(input,RULE_REFERENCE,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getREFERENCETerminalRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_3__1__Impl"


    // $ANTLR start "rule__Network__Group_3__2"
    // InternalMyDsl.g:1022:1: rule__Network__Group_3__2 : rule__Network__Group_3__2__Impl ;
    public final void rule__Network__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1026:1: ( rule__Network__Group_3__2__Impl )
            // InternalMyDsl.g:1027:2: rule__Network__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Network__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_3__2"


    // $ANTLR start "rule__Network__Group_3__2__Impl"
    // InternalMyDsl.g:1033:1: rule__Network__Group_3__2__Impl : ( ( rule__Network__UpdaterTypeAssignment_3_2 ) ) ;
    public final void rule__Network__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1037:1: ( ( ( rule__Network__UpdaterTypeAssignment_3_2 ) ) )
            // InternalMyDsl.g:1038:1: ( ( rule__Network__UpdaterTypeAssignment_3_2 ) )
            {
            // InternalMyDsl.g:1038:1: ( ( rule__Network__UpdaterTypeAssignment_3_2 ) )
            // InternalMyDsl.g:1039:2: ( rule__Network__UpdaterTypeAssignment_3_2 )
            {
             before(grammarAccess.getNetworkAccess().getUpdaterTypeAssignment_3_2()); 
            // InternalMyDsl.g:1040:2: ( rule__Network__UpdaterTypeAssignment_3_2 )
            // InternalMyDsl.g:1040:3: rule__Network__UpdaterTypeAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Network__UpdaterTypeAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getUpdaterTypeAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_3__2__Impl"


    // $ANTLR start "rule__Network__Group_4__0"
    // InternalMyDsl.g:1049:1: rule__Network__Group_4__0 : rule__Network__Group_4__0__Impl rule__Network__Group_4__1 ;
    public final void rule__Network__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1053:1: ( rule__Network__Group_4__0__Impl rule__Network__Group_4__1 )
            // InternalMyDsl.g:1054:2: rule__Network__Group_4__0__Impl rule__Network__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Network__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_4__0"


    // $ANTLR start "rule__Network__Group_4__0__Impl"
    // InternalMyDsl.g:1061:1: rule__Network__Group_4__0__Impl : ( 'learningRate' ) ;
    public final void rule__Network__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1065:1: ( ( 'learningRate' ) )
            // InternalMyDsl.g:1066:1: ( 'learningRate' )
            {
            // InternalMyDsl.g:1066:1: ( 'learningRate' )
            // InternalMyDsl.g:1067:2: 'learningRate'
            {
             before(grammarAccess.getNetworkAccess().getLearningRateKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getLearningRateKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_4__0__Impl"


    // $ANTLR start "rule__Network__Group_4__1"
    // InternalMyDsl.g:1076:1: rule__Network__Group_4__1 : rule__Network__Group_4__1__Impl rule__Network__Group_4__2 ;
    public final void rule__Network__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1080:1: ( rule__Network__Group_4__1__Impl rule__Network__Group_4__2 )
            // InternalMyDsl.g:1081:2: rule__Network__Group_4__1__Impl rule__Network__Group_4__2
            {
            pushFollow(FOLLOW_10);
            rule__Network__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_4__1"


    // $ANTLR start "rule__Network__Group_4__1__Impl"
    // InternalMyDsl.g:1088:1: rule__Network__Group_4__1__Impl : ( RULE_ASSIGN ) ;
    public final void rule__Network__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1092:1: ( ( RULE_ASSIGN ) )
            // InternalMyDsl.g:1093:1: ( RULE_ASSIGN )
            {
            // InternalMyDsl.g:1093:1: ( RULE_ASSIGN )
            // InternalMyDsl.g:1094:2: RULE_ASSIGN
            {
             before(grammarAccess.getNetworkAccess().getASSIGNTerminalRuleCall_4_1()); 
            match(input,RULE_ASSIGN,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getASSIGNTerminalRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_4__1__Impl"


    // $ANTLR start "rule__Network__Group_4__2"
    // InternalMyDsl.g:1103:1: rule__Network__Group_4__2 : rule__Network__Group_4__2__Impl rule__Network__Group_4__3 ;
    public final void rule__Network__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1107:1: ( rule__Network__Group_4__2__Impl rule__Network__Group_4__3 )
            // InternalMyDsl.g:1108:2: rule__Network__Group_4__2__Impl rule__Network__Group_4__3
            {
            pushFollow(FOLLOW_11);
            rule__Network__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_4__2"


    // $ANTLR start "rule__Network__Group_4__2__Impl"
    // InternalMyDsl.g:1115:1: rule__Network__Group_4__2__Impl : ( ( rule__Network__LearningRateAssignment_4_2 ) ) ;
    public final void rule__Network__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1119:1: ( ( ( rule__Network__LearningRateAssignment_4_2 ) ) )
            // InternalMyDsl.g:1120:1: ( ( rule__Network__LearningRateAssignment_4_2 ) )
            {
            // InternalMyDsl.g:1120:1: ( ( rule__Network__LearningRateAssignment_4_2 ) )
            // InternalMyDsl.g:1121:2: ( rule__Network__LearningRateAssignment_4_2 )
            {
             before(grammarAccess.getNetworkAccess().getLearningRateAssignment_4_2()); 
            // InternalMyDsl.g:1122:2: ( rule__Network__LearningRateAssignment_4_2 )
            // InternalMyDsl.g:1122:3: rule__Network__LearningRateAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Network__LearningRateAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getLearningRateAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_4__2__Impl"


    // $ANTLR start "rule__Network__Group_4__3"
    // InternalMyDsl.g:1130:1: rule__Network__Group_4__3 : rule__Network__Group_4__3__Impl rule__Network__Group_4__4 ;
    public final void rule__Network__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1134:1: ( rule__Network__Group_4__3__Impl rule__Network__Group_4__4 )
            // InternalMyDsl.g:1135:2: rule__Network__Group_4__3__Impl rule__Network__Group_4__4
            {
            pushFollow(FOLLOW_11);
            rule__Network__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_4__3"


    // $ANTLR start "rule__Network__Group_4__3__Impl"
    // InternalMyDsl.g:1142:1: rule__Network__Group_4__3__Impl : ( ( rule__Network__LayersAssignment_4_3 )* ) ;
    public final void rule__Network__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1146:1: ( ( ( rule__Network__LayersAssignment_4_3 )* ) )
            // InternalMyDsl.g:1147:1: ( ( rule__Network__LayersAssignment_4_3 )* )
            {
            // InternalMyDsl.g:1147:1: ( ( rule__Network__LayersAssignment_4_3 )* )
            // InternalMyDsl.g:1148:2: ( rule__Network__LayersAssignment_4_3 )*
            {
             before(grammarAccess.getNetworkAccess().getLayersAssignment_4_3()); 
            // InternalMyDsl.g:1149:2: ( rule__Network__LayersAssignment_4_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==40) ) {
                    int LA12_1 = input.LA(2);

                    if ( ((LA12_1>=40 && LA12_1<=41)||(LA12_1>=44 && LA12_1<=45)) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==41||(LA12_0>=44 && LA12_0<=45)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1149:3: rule__Network__LayersAssignment_4_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Network__LayersAssignment_4_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getNetworkAccess().getLayersAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_4__3__Impl"


    // $ANTLR start "rule__Network__Group_4__4"
    // InternalMyDsl.g:1157:1: rule__Network__Group_4__4 : rule__Network__Group_4__4__Impl ;
    public final void rule__Network__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1161:1: ( rule__Network__Group_4__4__Impl )
            // InternalMyDsl.g:1162:2: rule__Network__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Network__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_4__4"


    // $ANTLR start "rule__Network__Group_4__4__Impl"
    // InternalMyDsl.g:1168:1: rule__Network__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Network__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1172:1: ( ( '}' ) )
            // InternalMyDsl.g:1173:1: ( '}' )
            {
            // InternalMyDsl.g:1173:1: ( '}' )
            // InternalMyDsl.g:1174:2: '}'
            {
             before(grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_4__4__Impl"


    // $ANTLR start "rule__Layer__Group_0__0"
    // InternalMyDsl.g:1184:1: rule__Layer__Group_0__0 : rule__Layer__Group_0__0__Impl rule__Layer__Group_0__1 ;
    public final void rule__Layer__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1188:1: ( rule__Layer__Group_0__0__Impl rule__Layer__Group_0__1 )
            // InternalMyDsl.g:1189:2: rule__Layer__Group_0__0__Impl rule__Layer__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Layer__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_0__0"


    // $ANTLR start "rule__Layer__Group_0__0__Impl"
    // InternalMyDsl.g:1196:1: rule__Layer__Group_0__0__Impl : ( 'layer' ) ;
    public final void rule__Layer__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1200:1: ( ( 'layer' ) )
            // InternalMyDsl.g:1201:1: ( 'layer' )
            {
            // InternalMyDsl.g:1201:1: ( 'layer' )
            // InternalMyDsl.g:1202:2: 'layer'
            {
             before(grammarAccess.getLayerAccess().getLayerKeyword_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getLayerKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_0__0__Impl"


    // $ANTLR start "rule__Layer__Group_0__1"
    // InternalMyDsl.g:1211:1: rule__Layer__Group_0__1 : rule__Layer__Group_0__1__Impl rule__Layer__Group_0__2 ;
    public final void rule__Layer__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1215:1: ( rule__Layer__Group_0__1__Impl rule__Layer__Group_0__2 )
            // InternalMyDsl.g:1216:2: rule__Layer__Group_0__1__Impl rule__Layer__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__Layer__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_0__1"


    // $ANTLR start "rule__Layer__Group_0__1__Impl"
    // InternalMyDsl.g:1223:1: rule__Layer__Group_0__1__Impl : ( ( rule__Layer__LayerDeclAssignment_0_1 ) ) ;
    public final void rule__Layer__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1227:1: ( ( ( rule__Layer__LayerDeclAssignment_0_1 ) ) )
            // InternalMyDsl.g:1228:1: ( ( rule__Layer__LayerDeclAssignment_0_1 ) )
            {
            // InternalMyDsl.g:1228:1: ( ( rule__Layer__LayerDeclAssignment_0_1 ) )
            // InternalMyDsl.g:1229:2: ( rule__Layer__LayerDeclAssignment_0_1 )
            {
             before(grammarAccess.getLayerAccess().getLayerDeclAssignment_0_1()); 
            // InternalMyDsl.g:1230:2: ( rule__Layer__LayerDeclAssignment_0_1 )
            // InternalMyDsl.g:1230:3: rule__Layer__LayerDeclAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Layer__LayerDeclAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getLayerDeclAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_0__1__Impl"


    // $ANTLR start "rule__Layer__Group_0__2"
    // InternalMyDsl.g:1238:1: rule__Layer__Group_0__2 : rule__Layer__Group_0__2__Impl rule__Layer__Group_0__3 ;
    public final void rule__Layer__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1242:1: ( rule__Layer__Group_0__2__Impl rule__Layer__Group_0__3 )
            // InternalMyDsl.g:1243:2: rule__Layer__Group_0__2__Impl rule__Layer__Group_0__3
            {
            pushFollow(FOLLOW_14);
            rule__Layer__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_0__2"


    // $ANTLR start "rule__Layer__Group_0__2__Impl"
    // InternalMyDsl.g:1250:1: rule__Layer__Group_0__2__Impl : ( '{' ) ;
    public final void rule__Layer__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1254:1: ( ( '{' ) )
            // InternalMyDsl.g:1255:1: ( '{' )
            {
            // InternalMyDsl.g:1255:1: ( '{' )
            // InternalMyDsl.g:1256:2: '{'
            {
             before(grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_0_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_0__2__Impl"


    // $ANTLR start "rule__Layer__Group_0__3"
    // InternalMyDsl.g:1265:1: rule__Layer__Group_0__3 : rule__Layer__Group_0__3__Impl rule__Layer__Group_0__4 ;
    public final void rule__Layer__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1269:1: ( rule__Layer__Group_0__3__Impl rule__Layer__Group_0__4 )
            // InternalMyDsl.g:1270:2: rule__Layer__Group_0__3__Impl rule__Layer__Group_0__4
            {
            pushFollow(FOLLOW_8);
            rule__Layer__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_0__3"


    // $ANTLR start "rule__Layer__Group_0__3__Impl"
    // InternalMyDsl.g:1277:1: rule__Layer__Group_0__3__Impl : ( 'type' ) ;
    public final void rule__Layer__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1281:1: ( ( 'type' ) )
            // InternalMyDsl.g:1282:1: ( 'type' )
            {
            // InternalMyDsl.g:1282:1: ( 'type' )
            // InternalMyDsl.g:1283:2: 'type'
            {
             before(grammarAccess.getLayerAccess().getTypeKeyword_0_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getTypeKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_0__3__Impl"


    // $ANTLR start "rule__Layer__Group_0__4"
    // InternalMyDsl.g:1292:1: rule__Layer__Group_0__4 : rule__Layer__Group_0__4__Impl rule__Layer__Group_0__5 ;
    public final void rule__Layer__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1296:1: ( rule__Layer__Group_0__4__Impl rule__Layer__Group_0__5 )
            // InternalMyDsl.g:1297:2: rule__Layer__Group_0__4__Impl rule__Layer__Group_0__5
            {
            pushFollow(FOLLOW_15);
            rule__Layer__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_0__4"


    // $ANTLR start "rule__Layer__Group_0__4__Impl"
    // InternalMyDsl.g:1304:1: rule__Layer__Group_0__4__Impl : ( RULE_REFERENCE ) ;
    public final void rule__Layer__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1308:1: ( ( RULE_REFERENCE ) )
            // InternalMyDsl.g:1309:1: ( RULE_REFERENCE )
            {
            // InternalMyDsl.g:1309:1: ( RULE_REFERENCE )
            // InternalMyDsl.g:1310:2: RULE_REFERENCE
            {
             before(grammarAccess.getLayerAccess().getREFERENCETerminalRuleCall_0_4()); 
            match(input,RULE_REFERENCE,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getREFERENCETerminalRuleCall_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_0__4__Impl"


    // $ANTLR start "rule__Layer__Group_0__5"
    // InternalMyDsl.g:1319:1: rule__Layer__Group_0__5 : rule__Layer__Group_0__5__Impl rule__Layer__Group_0__6 ;
    public final void rule__Layer__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1323:1: ( rule__Layer__Group_0__5__Impl rule__Layer__Group_0__6 )
            // InternalMyDsl.g:1324:2: rule__Layer__Group_0__5__Impl rule__Layer__Group_0__6
            {
            pushFollow(FOLLOW_16);
            rule__Layer__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_0__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_0__5"


    // $ANTLR start "rule__Layer__Group_0__5__Impl"
    // InternalMyDsl.g:1331:1: rule__Layer__Group_0__5__Impl : ( ( rule__Layer__LayerTypeAssignment_0_5 ) ) ;
    public final void rule__Layer__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1335:1: ( ( ( rule__Layer__LayerTypeAssignment_0_5 ) ) )
            // InternalMyDsl.g:1336:1: ( ( rule__Layer__LayerTypeAssignment_0_5 ) )
            {
            // InternalMyDsl.g:1336:1: ( ( rule__Layer__LayerTypeAssignment_0_5 ) )
            // InternalMyDsl.g:1337:2: ( rule__Layer__LayerTypeAssignment_0_5 )
            {
             before(grammarAccess.getLayerAccess().getLayerTypeAssignment_0_5()); 
            // InternalMyDsl.g:1338:2: ( rule__Layer__LayerTypeAssignment_0_5 )
            // InternalMyDsl.g:1338:3: rule__Layer__LayerTypeAssignment_0_5
            {
            pushFollow(FOLLOW_2);
            rule__Layer__LayerTypeAssignment_0_5();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getLayerTypeAssignment_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_0__5__Impl"


    // $ANTLR start "rule__Layer__Group_0__6"
    // InternalMyDsl.g:1346:1: rule__Layer__Group_0__6 : rule__Layer__Group_0__6__Impl ;
    public final void rule__Layer__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1350:1: ( rule__Layer__Group_0__6__Impl )
            // InternalMyDsl.g:1351:2: rule__Layer__Group_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group_0__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_0__6"


    // $ANTLR start "rule__Layer__Group_0__6__Impl"
    // InternalMyDsl.g:1357:1: rule__Layer__Group_0__6__Impl : ( ( rule__Layer__Group_0_6__0 )? ) ;
    public final void rule__Layer__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1361:1: ( ( ( rule__Layer__Group_0_6__0 )? ) )
            // InternalMyDsl.g:1362:1: ( ( rule__Layer__Group_0_6__0 )? )
            {
            // InternalMyDsl.g:1362:1: ( ( rule__Layer__Group_0_6__0 )? )
            // InternalMyDsl.g:1363:2: ( rule__Layer__Group_0_6__0 )?
            {
             before(grammarAccess.getLayerAccess().getGroup_0_6()); 
            // InternalMyDsl.g:1364:2: ( rule__Layer__Group_0_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==43) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1364:3: rule__Layer__Group_0_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Layer__Group_0_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayerAccess().getGroup_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_0__6__Impl"


    // $ANTLR start "rule__Layer__Group_0_6__0"
    // InternalMyDsl.g:1373:1: rule__Layer__Group_0_6__0 : rule__Layer__Group_0_6__0__Impl rule__Layer__Group_0_6__1 ;
    public final void rule__Layer__Group_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1377:1: ( rule__Layer__Group_0_6__0__Impl rule__Layer__Group_0_6__1 )
            // InternalMyDsl.g:1378:2: rule__Layer__Group_0_6__0__Impl rule__Layer__Group_0_6__1
            {
            pushFollow(FOLLOW_8);
            rule__Layer__Group_0_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_0_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_0_6__0"


    // $ANTLR start "rule__Layer__Group_0_6__0__Impl"
    // InternalMyDsl.g:1385:1: rule__Layer__Group_0_6__0__Impl : ( 'activation' ) ;
    public final void rule__Layer__Group_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1389:1: ( ( 'activation' ) )
            // InternalMyDsl.g:1390:1: ( 'activation' )
            {
            // InternalMyDsl.g:1390:1: ( 'activation' )
            // InternalMyDsl.g:1391:2: 'activation'
            {
             before(grammarAccess.getLayerAccess().getActivationKeyword_0_6_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getActivationKeyword_0_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_0_6__0__Impl"


    // $ANTLR start "rule__Layer__Group_0_6__1"
    // InternalMyDsl.g:1400:1: rule__Layer__Group_0_6__1 : rule__Layer__Group_0_6__1__Impl rule__Layer__Group_0_6__2 ;
    public final void rule__Layer__Group_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1404:1: ( rule__Layer__Group_0_6__1__Impl rule__Layer__Group_0_6__2 )
            // InternalMyDsl.g:1405:2: rule__Layer__Group_0_6__1__Impl rule__Layer__Group_0_6__2
            {
            pushFollow(FOLLOW_17);
            rule__Layer__Group_0_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_0_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_0_6__1"


    // $ANTLR start "rule__Layer__Group_0_6__1__Impl"
    // InternalMyDsl.g:1412:1: rule__Layer__Group_0_6__1__Impl : ( RULE_REFERENCE ) ;
    public final void rule__Layer__Group_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1416:1: ( ( RULE_REFERENCE ) )
            // InternalMyDsl.g:1417:1: ( RULE_REFERENCE )
            {
            // InternalMyDsl.g:1417:1: ( RULE_REFERENCE )
            // InternalMyDsl.g:1418:2: RULE_REFERENCE
            {
             before(grammarAccess.getLayerAccess().getREFERENCETerminalRuleCall_0_6_1()); 
            match(input,RULE_REFERENCE,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getREFERENCETerminalRuleCall_0_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_0_6__1__Impl"


    // $ANTLR start "rule__Layer__Group_0_6__2"
    // InternalMyDsl.g:1427:1: rule__Layer__Group_0_6__2 : rule__Layer__Group_0_6__2__Impl ;
    public final void rule__Layer__Group_0_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1431:1: ( rule__Layer__Group_0_6__2__Impl )
            // InternalMyDsl.g:1432:2: rule__Layer__Group_0_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group_0_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_0_6__2"


    // $ANTLR start "rule__Layer__Group_0_6__2__Impl"
    // InternalMyDsl.g:1438:1: rule__Layer__Group_0_6__2__Impl : ( ( rule__Layer__ActivTypeAssignment_0_6_2 ) ) ;
    public final void rule__Layer__Group_0_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1442:1: ( ( ( rule__Layer__ActivTypeAssignment_0_6_2 ) ) )
            // InternalMyDsl.g:1443:1: ( ( rule__Layer__ActivTypeAssignment_0_6_2 ) )
            {
            // InternalMyDsl.g:1443:1: ( ( rule__Layer__ActivTypeAssignment_0_6_2 ) )
            // InternalMyDsl.g:1444:2: ( rule__Layer__ActivTypeAssignment_0_6_2 )
            {
             before(grammarAccess.getLayerAccess().getActivTypeAssignment_0_6_2()); 
            // InternalMyDsl.g:1445:2: ( rule__Layer__ActivTypeAssignment_0_6_2 )
            // InternalMyDsl.g:1445:3: rule__Layer__ActivTypeAssignment_0_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Layer__ActivTypeAssignment_0_6_2();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getActivTypeAssignment_0_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_0_6__2__Impl"


    // $ANTLR start "rule__Layer__Group_1__0"
    // InternalMyDsl.g:1454:1: rule__Layer__Group_1__0 : rule__Layer__Group_1__0__Impl rule__Layer__Group_1__1 ;
    public final void rule__Layer__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1458:1: ( rule__Layer__Group_1__0__Impl rule__Layer__Group_1__1 )
            // InternalMyDsl.g:1459:2: rule__Layer__Group_1__0__Impl rule__Layer__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Layer__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_1__0"


    // $ANTLR start "rule__Layer__Group_1__0__Impl"
    // InternalMyDsl.g:1466:1: rule__Layer__Group_1__0__Impl : ( 'weightsInit' ) ;
    public final void rule__Layer__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1470:1: ( ( 'weightsInit' ) )
            // InternalMyDsl.g:1471:1: ( 'weightsInit' )
            {
            // InternalMyDsl.g:1471:1: ( 'weightsInit' )
            // InternalMyDsl.g:1472:2: 'weightsInit'
            {
             before(grammarAccess.getLayerAccess().getWeightsInitKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getWeightsInitKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_1__0__Impl"


    // $ANTLR start "rule__Layer__Group_1__1"
    // InternalMyDsl.g:1481:1: rule__Layer__Group_1__1 : rule__Layer__Group_1__1__Impl rule__Layer__Group_1__2 ;
    public final void rule__Layer__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1485:1: ( rule__Layer__Group_1__1__Impl rule__Layer__Group_1__2 )
            // InternalMyDsl.g:1486:2: rule__Layer__Group_1__1__Impl rule__Layer__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__Layer__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_1__1"


    // $ANTLR start "rule__Layer__Group_1__1__Impl"
    // InternalMyDsl.g:1493:1: rule__Layer__Group_1__1__Impl : ( RULE_REFERENCE ) ;
    public final void rule__Layer__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1497:1: ( ( RULE_REFERENCE ) )
            // InternalMyDsl.g:1498:1: ( RULE_REFERENCE )
            {
            // InternalMyDsl.g:1498:1: ( RULE_REFERENCE )
            // InternalMyDsl.g:1499:2: RULE_REFERENCE
            {
             before(grammarAccess.getLayerAccess().getREFERENCETerminalRuleCall_1_1()); 
            match(input,RULE_REFERENCE,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getREFERENCETerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_1__1__Impl"


    // $ANTLR start "rule__Layer__Group_1__2"
    // InternalMyDsl.g:1508:1: rule__Layer__Group_1__2 : rule__Layer__Group_1__2__Impl ;
    public final void rule__Layer__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1512:1: ( rule__Layer__Group_1__2__Impl )
            // InternalMyDsl.g:1513:2: rule__Layer__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_1__2"


    // $ANTLR start "rule__Layer__Group_1__2__Impl"
    // InternalMyDsl.g:1519:1: rule__Layer__Group_1__2__Impl : ( ( rule__Layer__WeightInitAssignment_1_2 ) ) ;
    public final void rule__Layer__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1523:1: ( ( ( rule__Layer__WeightInitAssignment_1_2 ) ) )
            // InternalMyDsl.g:1524:1: ( ( rule__Layer__WeightInitAssignment_1_2 ) )
            {
            // InternalMyDsl.g:1524:1: ( ( rule__Layer__WeightInitAssignment_1_2 ) )
            // InternalMyDsl.g:1525:2: ( rule__Layer__WeightInitAssignment_1_2 )
            {
             before(grammarAccess.getLayerAccess().getWeightInitAssignment_1_2()); 
            // InternalMyDsl.g:1526:2: ( rule__Layer__WeightInitAssignment_1_2 )
            // InternalMyDsl.g:1526:3: rule__Layer__WeightInitAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Layer__WeightInitAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getWeightInitAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_1__2__Impl"


    // $ANTLR start "rule__Layer__Group_2__0"
    // InternalMyDsl.g:1535:1: rule__Layer__Group_2__0 : rule__Layer__Group_2__0__Impl rule__Layer__Group_2__1 ;
    public final void rule__Layer__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1539:1: ( rule__Layer__Group_2__0__Impl rule__Layer__Group_2__1 )
            // InternalMyDsl.g:1540:2: rule__Layer__Group_2__0__Impl rule__Layer__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Layer__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_2__0"


    // $ANTLR start "rule__Layer__Group_2__0__Impl"
    // InternalMyDsl.g:1547:1: rule__Layer__Group_2__0__Impl : ( ( rule__Layer__Group_2_0__0 )? ) ;
    public final void rule__Layer__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1551:1: ( ( ( rule__Layer__Group_2_0__0 )? ) )
            // InternalMyDsl.g:1552:1: ( ( rule__Layer__Group_2_0__0 )? )
            {
            // InternalMyDsl.g:1552:1: ( ( rule__Layer__Group_2_0__0 )? )
            // InternalMyDsl.g:1553:2: ( rule__Layer__Group_2_0__0 )?
            {
             before(grammarAccess.getLayerAccess().getGroup_2_0()); 
            // InternalMyDsl.g:1554:2: ( rule__Layer__Group_2_0__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==45) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1554:3: rule__Layer__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Layer__Group_2_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayerAccess().getGroup_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_2__0__Impl"


    // $ANTLR start "rule__Layer__Group_2__1"
    // InternalMyDsl.g:1562:1: rule__Layer__Group_2__1 : rule__Layer__Group_2__1__Impl ;
    public final void rule__Layer__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1566:1: ( rule__Layer__Group_2__1__Impl )
            // InternalMyDsl.g:1567:2: rule__Layer__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_2__1"


    // $ANTLR start "rule__Layer__Group_2__1__Impl"
    // InternalMyDsl.g:1573:1: rule__Layer__Group_2__1__Impl : ( '}' ) ;
    public final void rule__Layer__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1577:1: ( ( '}' ) )
            // InternalMyDsl.g:1578:1: ( '}' )
            {
            // InternalMyDsl.g:1578:1: ( '}' )
            // InternalMyDsl.g:1579:2: '}'
            {
             before(grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_2_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_2__1__Impl"


    // $ANTLR start "rule__Layer__Group_2_0__0"
    // InternalMyDsl.g:1589:1: rule__Layer__Group_2_0__0 : rule__Layer__Group_2_0__0__Impl rule__Layer__Group_2_0__1 ;
    public final void rule__Layer__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1593:1: ( rule__Layer__Group_2_0__0__Impl rule__Layer__Group_2_0__1 )
            // InternalMyDsl.g:1594:2: rule__Layer__Group_2_0__0__Impl rule__Layer__Group_2_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Layer__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_2_0__0"


    // $ANTLR start "rule__Layer__Group_2_0__0__Impl"
    // InternalMyDsl.g:1601:1: rule__Layer__Group_2_0__0__Impl : ( 'biasInit' ) ;
    public final void rule__Layer__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1605:1: ( ( 'biasInit' ) )
            // InternalMyDsl.g:1606:1: ( 'biasInit' )
            {
            // InternalMyDsl.g:1606:1: ( 'biasInit' )
            // InternalMyDsl.g:1607:2: 'biasInit'
            {
             before(grammarAccess.getLayerAccess().getBiasInitKeyword_2_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getBiasInitKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_2_0__0__Impl"


    // $ANTLR start "rule__Layer__Group_2_0__1"
    // InternalMyDsl.g:1616:1: rule__Layer__Group_2_0__1 : rule__Layer__Group_2_0__1__Impl rule__Layer__Group_2_0__2 ;
    public final void rule__Layer__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1620:1: ( rule__Layer__Group_2_0__1__Impl rule__Layer__Group_2_0__2 )
            // InternalMyDsl.g:1621:2: rule__Layer__Group_2_0__1__Impl rule__Layer__Group_2_0__2
            {
            pushFollow(FOLLOW_19);
            rule__Layer__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_2_0__1"


    // $ANTLR start "rule__Layer__Group_2_0__1__Impl"
    // InternalMyDsl.g:1628:1: rule__Layer__Group_2_0__1__Impl : ( RULE_ASSIGN ) ;
    public final void rule__Layer__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1632:1: ( ( RULE_ASSIGN ) )
            // InternalMyDsl.g:1633:1: ( RULE_ASSIGN )
            {
            // InternalMyDsl.g:1633:1: ( RULE_ASSIGN )
            // InternalMyDsl.g:1634:2: RULE_ASSIGN
            {
             before(grammarAccess.getLayerAccess().getASSIGNTerminalRuleCall_2_0_1()); 
            match(input,RULE_ASSIGN,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getASSIGNTerminalRuleCall_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_2_0__1__Impl"


    // $ANTLR start "rule__Layer__Group_2_0__2"
    // InternalMyDsl.g:1643:1: rule__Layer__Group_2_0__2 : rule__Layer__Group_2_0__2__Impl ;
    public final void rule__Layer__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1647:1: ( rule__Layer__Group_2_0__2__Impl )
            // InternalMyDsl.g:1648:2: rule__Layer__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_2_0__2"


    // $ANTLR start "rule__Layer__Group_2_0__2__Impl"
    // InternalMyDsl.g:1654:1: rule__Layer__Group_2_0__2__Impl : ( ( rule__Layer__BiasInitAssignment_2_0_2 ) ) ;
    public final void rule__Layer__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1658:1: ( ( ( rule__Layer__BiasInitAssignment_2_0_2 ) ) )
            // InternalMyDsl.g:1659:1: ( ( rule__Layer__BiasInitAssignment_2_0_2 ) )
            {
            // InternalMyDsl.g:1659:1: ( ( rule__Layer__BiasInitAssignment_2_0_2 ) )
            // InternalMyDsl.g:1660:2: ( rule__Layer__BiasInitAssignment_2_0_2 )
            {
             before(grammarAccess.getLayerAccess().getBiasInitAssignment_2_0_2()); 
            // InternalMyDsl.g:1661:2: ( rule__Layer__BiasInitAssignment_2_0_2 )
            // InternalMyDsl.g:1661:3: rule__Layer__BiasInitAssignment_2_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Layer__BiasInitAssignment_2_0_2();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getBiasInitAssignment_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_2_0__2__Impl"


    // $ANTLR start "rule__LayerDeclaration__Group_1__0"
    // InternalMyDsl.g:1670:1: rule__LayerDeclaration__Group_1__0 : rule__LayerDeclaration__Group_1__0__Impl rule__LayerDeclaration__Group_1__1 ;
    public final void rule__LayerDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1674:1: ( rule__LayerDeclaration__Group_1__0__Impl rule__LayerDeclaration__Group_1__1 )
            // InternalMyDsl.g:1675:2: rule__LayerDeclaration__Group_1__0__Impl rule__LayerDeclaration__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__LayerDeclaration__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerDeclaration__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_1__0"


    // $ANTLR start "rule__LayerDeclaration__Group_1__0__Impl"
    // InternalMyDsl.g:1682:1: rule__LayerDeclaration__Group_1__0__Impl : ( '[' ) ;
    public final void rule__LayerDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1686:1: ( ( '[' ) )
            // InternalMyDsl.g:1687:1: ( '[' )
            {
            // InternalMyDsl.g:1687:1: ( '[' )
            // InternalMyDsl.g:1688:2: '['
            {
             before(grammarAccess.getLayerDeclarationAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getLayerDeclarationAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_1__0__Impl"


    // $ANTLR start "rule__LayerDeclaration__Group_1__1"
    // InternalMyDsl.g:1697:1: rule__LayerDeclaration__Group_1__1 : rule__LayerDeclaration__Group_1__1__Impl rule__LayerDeclaration__Group_1__2 ;
    public final void rule__LayerDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1701:1: ( rule__LayerDeclaration__Group_1__1__Impl rule__LayerDeclaration__Group_1__2 )
            // InternalMyDsl.g:1702:2: rule__LayerDeclaration__Group_1__1__Impl rule__LayerDeclaration__Group_1__2
            {
            pushFollow(FOLLOW_21);
            rule__LayerDeclaration__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerDeclaration__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_1__1"


    // $ANTLR start "rule__LayerDeclaration__Group_1__1__Impl"
    // InternalMyDsl.g:1709:1: rule__LayerDeclaration__Group_1__1__Impl : ( ( rule__LayerDeclaration__LayerTupleAssignment_1_1 ) ) ;
    public final void rule__LayerDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1713:1: ( ( ( rule__LayerDeclaration__LayerTupleAssignment_1_1 ) ) )
            // InternalMyDsl.g:1714:1: ( ( rule__LayerDeclaration__LayerTupleAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1714:1: ( ( rule__LayerDeclaration__LayerTupleAssignment_1_1 ) )
            // InternalMyDsl.g:1715:2: ( rule__LayerDeclaration__LayerTupleAssignment_1_1 )
            {
             before(grammarAccess.getLayerDeclarationAccess().getLayerTupleAssignment_1_1()); 
            // InternalMyDsl.g:1716:2: ( rule__LayerDeclaration__LayerTupleAssignment_1_1 )
            // InternalMyDsl.g:1716:3: rule__LayerDeclaration__LayerTupleAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LayerDeclaration__LayerTupleAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLayerDeclarationAccess().getLayerTupleAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_1__1__Impl"


    // $ANTLR start "rule__LayerDeclaration__Group_1__2"
    // InternalMyDsl.g:1724:1: rule__LayerDeclaration__Group_1__2 : rule__LayerDeclaration__Group_1__2__Impl rule__LayerDeclaration__Group_1__3 ;
    public final void rule__LayerDeclaration__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1728:1: ( rule__LayerDeclaration__Group_1__2__Impl rule__LayerDeclaration__Group_1__3 )
            // InternalMyDsl.g:1729:2: rule__LayerDeclaration__Group_1__2__Impl rule__LayerDeclaration__Group_1__3
            {
            pushFollow(FOLLOW_21);
            rule__LayerDeclaration__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerDeclaration__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_1__2"


    // $ANTLR start "rule__LayerDeclaration__Group_1__2__Impl"
    // InternalMyDsl.g:1736:1: rule__LayerDeclaration__Group_1__2__Impl : ( ( rule__LayerDeclaration__Group_1_2__0 )* ) ;
    public final void rule__LayerDeclaration__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1740:1: ( ( ( rule__LayerDeclaration__Group_1_2__0 )* ) )
            // InternalMyDsl.g:1741:1: ( ( rule__LayerDeclaration__Group_1_2__0 )* )
            {
            // InternalMyDsl.g:1741:1: ( ( rule__LayerDeclaration__Group_1_2__0 )* )
            // InternalMyDsl.g:1742:2: ( rule__LayerDeclaration__Group_1_2__0 )*
            {
             before(grammarAccess.getLayerDeclarationAccess().getGroup_1_2()); 
            // InternalMyDsl.g:1743:2: ( rule__LayerDeclaration__Group_1_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==48) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1743:3: rule__LayerDeclaration__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__LayerDeclaration__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getLayerDeclarationAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_1__2__Impl"


    // $ANTLR start "rule__LayerDeclaration__Group_1__3"
    // InternalMyDsl.g:1751:1: rule__LayerDeclaration__Group_1__3 : rule__LayerDeclaration__Group_1__3__Impl ;
    public final void rule__LayerDeclaration__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1755:1: ( rule__LayerDeclaration__Group_1__3__Impl )
            // InternalMyDsl.g:1756:2: rule__LayerDeclaration__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayerDeclaration__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_1__3"


    // $ANTLR start "rule__LayerDeclaration__Group_1__3__Impl"
    // InternalMyDsl.g:1762:1: rule__LayerDeclaration__Group_1__3__Impl : ( ']' ) ;
    public final void rule__LayerDeclaration__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1766:1: ( ( ']' ) )
            // InternalMyDsl.g:1767:1: ( ']' )
            {
            // InternalMyDsl.g:1767:1: ( ']' )
            // InternalMyDsl.g:1768:2: ']'
            {
             before(grammarAccess.getLayerDeclarationAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getLayerDeclarationAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_1__3__Impl"


    // $ANTLR start "rule__LayerDeclaration__Group_1_2__0"
    // InternalMyDsl.g:1778:1: rule__LayerDeclaration__Group_1_2__0 : rule__LayerDeclaration__Group_1_2__0__Impl rule__LayerDeclaration__Group_1_2__1 ;
    public final void rule__LayerDeclaration__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1782:1: ( rule__LayerDeclaration__Group_1_2__0__Impl rule__LayerDeclaration__Group_1_2__1 )
            // InternalMyDsl.g:1783:2: rule__LayerDeclaration__Group_1_2__0__Impl rule__LayerDeclaration__Group_1_2__1
            {
            pushFollow(FOLLOW_20);
            rule__LayerDeclaration__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerDeclaration__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_1_2__0"


    // $ANTLR start "rule__LayerDeclaration__Group_1_2__0__Impl"
    // InternalMyDsl.g:1790:1: rule__LayerDeclaration__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__LayerDeclaration__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1794:1: ( ( ',' ) )
            // InternalMyDsl.g:1795:1: ( ',' )
            {
            // InternalMyDsl.g:1795:1: ( ',' )
            // InternalMyDsl.g:1796:2: ','
            {
             before(grammarAccess.getLayerDeclarationAccess().getCommaKeyword_1_2_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getLayerDeclarationAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_1_2__0__Impl"


    // $ANTLR start "rule__LayerDeclaration__Group_1_2__1"
    // InternalMyDsl.g:1805:1: rule__LayerDeclaration__Group_1_2__1 : rule__LayerDeclaration__Group_1_2__1__Impl ;
    public final void rule__LayerDeclaration__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1809:1: ( rule__LayerDeclaration__Group_1_2__1__Impl )
            // InternalMyDsl.g:1810:2: rule__LayerDeclaration__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayerDeclaration__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_1_2__1"


    // $ANTLR start "rule__LayerDeclaration__Group_1_2__1__Impl"
    // InternalMyDsl.g:1816:1: rule__LayerDeclaration__Group_1_2__1__Impl : ( ( rule__LayerDeclaration__LayerTupleAssignment_1_2_1 ) ) ;
    public final void rule__LayerDeclaration__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1820:1: ( ( ( rule__LayerDeclaration__LayerTupleAssignment_1_2_1 ) ) )
            // InternalMyDsl.g:1821:1: ( ( rule__LayerDeclaration__LayerTupleAssignment_1_2_1 ) )
            {
            // InternalMyDsl.g:1821:1: ( ( rule__LayerDeclaration__LayerTupleAssignment_1_2_1 ) )
            // InternalMyDsl.g:1822:2: ( rule__LayerDeclaration__LayerTupleAssignment_1_2_1 )
            {
             before(grammarAccess.getLayerDeclarationAccess().getLayerTupleAssignment_1_2_1()); 
            // InternalMyDsl.g:1823:2: ( rule__LayerDeclaration__LayerTupleAssignment_1_2_1 )
            // InternalMyDsl.g:1823:3: rule__LayerDeclaration__LayerTupleAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LayerDeclaration__LayerTupleAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLayerDeclarationAccess().getLayerTupleAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_1_2__1__Impl"


    // $ANTLR start "rule__LayerDeclaration__Group_2__0"
    // InternalMyDsl.g:1832:1: rule__LayerDeclaration__Group_2__0 : rule__LayerDeclaration__Group_2__0__Impl rule__LayerDeclaration__Group_2__1 ;
    public final void rule__LayerDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1836:1: ( rule__LayerDeclaration__Group_2__0__Impl rule__LayerDeclaration__Group_2__1 )
            // InternalMyDsl.g:1837:2: rule__LayerDeclaration__Group_2__0__Impl rule__LayerDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__LayerDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerDeclaration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_2__0"


    // $ANTLR start "rule__LayerDeclaration__Group_2__0__Impl"
    // InternalMyDsl.g:1844:1: rule__LayerDeclaration__Group_2__0__Impl : ( '{' ) ;
    public final void rule__LayerDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1848:1: ( ( '{' ) )
            // InternalMyDsl.g:1849:1: ( '{' )
            {
            // InternalMyDsl.g:1849:1: ( '{' )
            // InternalMyDsl.g:1850:2: '{'
            {
             before(grammarAccess.getLayerDeclarationAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLayerDeclarationAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__LayerDeclaration__Group_2__1"
    // InternalMyDsl.g:1859:1: rule__LayerDeclaration__Group_2__1 : rule__LayerDeclaration__Group_2__1__Impl rule__LayerDeclaration__Group_2__2 ;
    public final void rule__LayerDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1863:1: ( rule__LayerDeclaration__Group_2__1__Impl rule__LayerDeclaration__Group_2__2 )
            // InternalMyDsl.g:1864:2: rule__LayerDeclaration__Group_2__1__Impl rule__LayerDeclaration__Group_2__2
            {
            pushFollow(FOLLOW_23);
            rule__LayerDeclaration__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerDeclaration__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_2__1"


    // $ANTLR start "rule__LayerDeclaration__Group_2__1__Impl"
    // InternalMyDsl.g:1871:1: rule__LayerDeclaration__Group_2__1__Impl : ( ( rule__LayerDeclaration__LayerMultiplierAssignment_2_1 ) ) ;
    public final void rule__LayerDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1875:1: ( ( ( rule__LayerDeclaration__LayerMultiplierAssignment_2_1 ) ) )
            // InternalMyDsl.g:1876:1: ( ( rule__LayerDeclaration__LayerMultiplierAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1876:1: ( ( rule__LayerDeclaration__LayerMultiplierAssignment_2_1 ) )
            // InternalMyDsl.g:1877:2: ( rule__LayerDeclaration__LayerMultiplierAssignment_2_1 )
            {
             before(grammarAccess.getLayerDeclarationAccess().getLayerMultiplierAssignment_2_1()); 
            // InternalMyDsl.g:1878:2: ( rule__LayerDeclaration__LayerMultiplierAssignment_2_1 )
            // InternalMyDsl.g:1878:3: rule__LayerDeclaration__LayerMultiplierAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LayerDeclaration__LayerMultiplierAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLayerDeclarationAccess().getLayerMultiplierAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__LayerDeclaration__Group_2__2"
    // InternalMyDsl.g:1886:1: rule__LayerDeclaration__Group_2__2 : rule__LayerDeclaration__Group_2__2__Impl rule__LayerDeclaration__Group_2__3 ;
    public final void rule__LayerDeclaration__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1890:1: ( rule__LayerDeclaration__Group_2__2__Impl rule__LayerDeclaration__Group_2__3 )
            // InternalMyDsl.g:1891:2: rule__LayerDeclaration__Group_2__2__Impl rule__LayerDeclaration__Group_2__3
            {
            pushFollow(FOLLOW_24);
            rule__LayerDeclaration__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerDeclaration__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_2__2"


    // $ANTLR start "rule__LayerDeclaration__Group_2__2__Impl"
    // InternalMyDsl.g:1898:1: rule__LayerDeclaration__Group_2__2__Impl : ( '}' ) ;
    public final void rule__LayerDeclaration__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1902:1: ( ( '}' ) )
            // InternalMyDsl.g:1903:1: ( '}' )
            {
            // InternalMyDsl.g:1903:1: ( '}' )
            // InternalMyDsl.g:1904:2: '}'
            {
             before(grammarAccess.getLayerDeclarationAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLayerDeclarationAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_2__2__Impl"


    // $ANTLR start "rule__LayerDeclaration__Group_2__3"
    // InternalMyDsl.g:1913:1: rule__LayerDeclaration__Group_2__3 : rule__LayerDeclaration__Group_2__3__Impl rule__LayerDeclaration__Group_2__4 ;
    public final void rule__LayerDeclaration__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1917:1: ( rule__LayerDeclaration__Group_2__3__Impl rule__LayerDeclaration__Group_2__4 )
            // InternalMyDsl.g:1918:2: rule__LayerDeclaration__Group_2__3__Impl rule__LayerDeclaration__Group_2__4
            {
            pushFollow(FOLLOW_20);
            rule__LayerDeclaration__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerDeclaration__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_2__3"


    // $ANTLR start "rule__LayerDeclaration__Group_2__3__Impl"
    // InternalMyDsl.g:1925:1: rule__LayerDeclaration__Group_2__3__Impl : ( '[' ) ;
    public final void rule__LayerDeclaration__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1929:1: ( ( '[' ) )
            // InternalMyDsl.g:1930:1: ( '[' )
            {
            // InternalMyDsl.g:1930:1: ( '[' )
            // InternalMyDsl.g:1931:2: '['
            {
             before(grammarAccess.getLayerDeclarationAccess().getLeftSquareBracketKeyword_2_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getLayerDeclarationAccess().getLeftSquareBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_2__3__Impl"


    // $ANTLR start "rule__LayerDeclaration__Group_2__4"
    // InternalMyDsl.g:1940:1: rule__LayerDeclaration__Group_2__4 : rule__LayerDeclaration__Group_2__4__Impl rule__LayerDeclaration__Group_2__5 ;
    public final void rule__LayerDeclaration__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1944:1: ( rule__LayerDeclaration__Group_2__4__Impl rule__LayerDeclaration__Group_2__5 )
            // InternalMyDsl.g:1945:2: rule__LayerDeclaration__Group_2__4__Impl rule__LayerDeclaration__Group_2__5
            {
            pushFollow(FOLLOW_25);
            rule__LayerDeclaration__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerDeclaration__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_2__4"


    // $ANTLR start "rule__LayerDeclaration__Group_2__4__Impl"
    // InternalMyDsl.g:1952:1: rule__LayerDeclaration__Group_2__4__Impl : ( ( rule__LayerDeclaration__LayerTupleAssignment_2_4 ) ) ;
    public final void rule__LayerDeclaration__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1956:1: ( ( ( rule__LayerDeclaration__LayerTupleAssignment_2_4 ) ) )
            // InternalMyDsl.g:1957:1: ( ( rule__LayerDeclaration__LayerTupleAssignment_2_4 ) )
            {
            // InternalMyDsl.g:1957:1: ( ( rule__LayerDeclaration__LayerTupleAssignment_2_4 ) )
            // InternalMyDsl.g:1958:2: ( rule__LayerDeclaration__LayerTupleAssignment_2_4 )
            {
             before(grammarAccess.getLayerDeclarationAccess().getLayerTupleAssignment_2_4()); 
            // InternalMyDsl.g:1959:2: ( rule__LayerDeclaration__LayerTupleAssignment_2_4 )
            // InternalMyDsl.g:1959:3: rule__LayerDeclaration__LayerTupleAssignment_2_4
            {
            pushFollow(FOLLOW_2);
            rule__LayerDeclaration__LayerTupleAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getLayerDeclarationAccess().getLayerTupleAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_2__4__Impl"


    // $ANTLR start "rule__LayerDeclaration__Group_2__5"
    // InternalMyDsl.g:1967:1: rule__LayerDeclaration__Group_2__5 : rule__LayerDeclaration__Group_2__5__Impl ;
    public final void rule__LayerDeclaration__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1971:1: ( rule__LayerDeclaration__Group_2__5__Impl )
            // InternalMyDsl.g:1972:2: rule__LayerDeclaration__Group_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayerDeclaration__Group_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_2__5"


    // $ANTLR start "rule__LayerDeclaration__Group_2__5__Impl"
    // InternalMyDsl.g:1978:1: rule__LayerDeclaration__Group_2__5__Impl : ( ']' ) ;
    public final void rule__LayerDeclaration__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1982:1: ( ( ']' ) )
            // InternalMyDsl.g:1983:1: ( ']' )
            {
            // InternalMyDsl.g:1983:1: ( ']' )
            // InternalMyDsl.g:1984:2: ']'
            {
             before(grammarAccess.getLayerDeclarationAccess().getRightSquareBracketKeyword_2_5()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getLayerDeclarationAccess().getRightSquareBracketKeyword_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__Group_2__5__Impl"


    // $ANTLR start "rule__LayerTuple__Group_0__0"
    // InternalMyDsl.g:1994:1: rule__LayerTuple__Group_0__0 : rule__LayerTuple__Group_0__0__Impl rule__LayerTuple__Group_0__1 ;
    public final void rule__LayerTuple__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1998:1: ( rule__LayerTuple__Group_0__0__Impl rule__LayerTuple__Group_0__1 )
            // InternalMyDsl.g:1999:2: rule__LayerTuple__Group_0__0__Impl rule__LayerTuple__Group_0__1
            {
            pushFollow(FOLLOW_26);
            rule__LayerTuple__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerTuple__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0__0"


    // $ANTLR start "rule__LayerTuple__Group_0__0__Impl"
    // InternalMyDsl.g:2006:1: rule__LayerTuple__Group_0__0__Impl : ( '(' ) ;
    public final void rule__LayerTuple__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2010:1: ( ( '(' ) )
            // InternalMyDsl.g:2011:1: ( '(' )
            {
            // InternalMyDsl.g:2011:1: ( '(' )
            // InternalMyDsl.g:2012:2: '('
            {
             before(grammarAccess.getLayerTupleAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLayerTupleAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0__0__Impl"


    // $ANTLR start "rule__LayerTuple__Group_0__1"
    // InternalMyDsl.g:2021:1: rule__LayerTuple__Group_0__1 : rule__LayerTuple__Group_0__1__Impl rule__LayerTuple__Group_0__2 ;
    public final void rule__LayerTuple__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2025:1: ( rule__LayerTuple__Group_0__1__Impl rule__LayerTuple__Group_0__2 )
            // InternalMyDsl.g:2026:2: rule__LayerTuple__Group_0__1__Impl rule__LayerTuple__Group_0__2
            {
            pushFollow(FOLLOW_26);
            rule__LayerTuple__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerTuple__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0__1"


    // $ANTLR start "rule__LayerTuple__Group_0__1__Impl"
    // InternalMyDsl.g:2033:1: rule__LayerTuple__Group_0__1__Impl : ( ( rule__LayerTuple__Group_0_1__0 )? ) ;
    public final void rule__LayerTuple__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2037:1: ( ( ( rule__LayerTuple__Group_0_1__0 )? ) )
            // InternalMyDsl.g:2038:1: ( ( rule__LayerTuple__Group_0_1__0 )? )
            {
            // InternalMyDsl.g:2038:1: ( ( rule__LayerTuple__Group_0_1__0 )? )
            // InternalMyDsl.g:2039:2: ( rule__LayerTuple__Group_0_1__0 )?
            {
             before(grammarAccess.getLayerTupleAccess().getGroup_0_1()); 
            // InternalMyDsl.g:2040:2: ( rule__LayerTuple__Group_0_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==53) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:2040:3: rule__LayerTuple__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayerTuple__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayerTupleAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0__1__Impl"


    // $ANTLR start "rule__LayerTuple__Group_0__2"
    // InternalMyDsl.g:2048:1: rule__LayerTuple__Group_0__2 : rule__LayerTuple__Group_0__2__Impl rule__LayerTuple__Group_0__3 ;
    public final void rule__LayerTuple__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2052:1: ( rule__LayerTuple__Group_0__2__Impl rule__LayerTuple__Group_0__3 )
            // InternalMyDsl.g:2053:2: rule__LayerTuple__Group_0__2__Impl rule__LayerTuple__Group_0__3
            {
            pushFollow(FOLLOW_26);
            rule__LayerTuple__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerTuple__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0__2"


    // $ANTLR start "rule__LayerTuple__Group_0__2__Impl"
    // InternalMyDsl.g:2060:1: rule__LayerTuple__Group_0__2__Impl : ( ( rule__LayerTuple__Group_0_2__0 )? ) ;
    public final void rule__LayerTuple__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2064:1: ( ( ( rule__LayerTuple__Group_0_2__0 )? ) )
            // InternalMyDsl.g:2065:1: ( ( rule__LayerTuple__Group_0_2__0 )? )
            {
            // InternalMyDsl.g:2065:1: ( ( rule__LayerTuple__Group_0_2__0 )? )
            // InternalMyDsl.g:2066:2: ( rule__LayerTuple__Group_0_2__0 )?
            {
             before(grammarAccess.getLayerTupleAccess().getGroup_0_2()); 
            // InternalMyDsl.g:2067:2: ( rule__LayerTuple__Group_0_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==54) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2067:3: rule__LayerTuple__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayerTuple__Group_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayerTupleAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0__2__Impl"


    // $ANTLR start "rule__LayerTuple__Group_0__3"
    // InternalMyDsl.g:2075:1: rule__LayerTuple__Group_0__3 : rule__LayerTuple__Group_0__3__Impl rule__LayerTuple__Group_0__4 ;
    public final void rule__LayerTuple__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2079:1: ( rule__LayerTuple__Group_0__3__Impl rule__LayerTuple__Group_0__4 )
            // InternalMyDsl.g:2080:2: rule__LayerTuple__Group_0__3__Impl rule__LayerTuple__Group_0__4
            {
            pushFollow(FOLLOW_27);
            rule__LayerTuple__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerTuple__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0__3"


    // $ANTLR start "rule__LayerTuple__Group_0__3__Impl"
    // InternalMyDsl.g:2087:1: rule__LayerTuple__Group_0__3__Impl : ( 'out' ) ;
    public final void rule__LayerTuple__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2091:1: ( ( 'out' ) )
            // InternalMyDsl.g:2092:1: ( 'out' )
            {
            // InternalMyDsl.g:2092:1: ( 'out' )
            // InternalMyDsl.g:2093:2: 'out'
            {
             before(grammarAccess.getLayerTupleAccess().getOutKeyword_0_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getLayerTupleAccess().getOutKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0__3__Impl"


    // $ANTLR start "rule__LayerTuple__Group_0__4"
    // InternalMyDsl.g:2102:1: rule__LayerTuple__Group_0__4 : rule__LayerTuple__Group_0__4__Impl rule__LayerTuple__Group_0__5 ;
    public final void rule__LayerTuple__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2106:1: ( rule__LayerTuple__Group_0__4__Impl rule__LayerTuple__Group_0__5 )
            // InternalMyDsl.g:2107:2: rule__LayerTuple__Group_0__4__Impl rule__LayerTuple__Group_0__5
            {
            pushFollow(FOLLOW_28);
            rule__LayerTuple__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerTuple__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0__4"


    // $ANTLR start "rule__LayerTuple__Group_0__4__Impl"
    // InternalMyDsl.g:2114:1: rule__LayerTuple__Group_0__4__Impl : ( ':' ) ;
    public final void rule__LayerTuple__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2118:1: ( ( ':' ) )
            // InternalMyDsl.g:2119:1: ( ':' )
            {
            // InternalMyDsl.g:2119:1: ( ':' )
            // InternalMyDsl.g:2120:2: ':'
            {
             before(grammarAccess.getLayerTupleAccess().getColonKeyword_0_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLayerTupleAccess().getColonKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0__4__Impl"


    // $ANTLR start "rule__LayerTuple__Group_0__5"
    // InternalMyDsl.g:2129:1: rule__LayerTuple__Group_0__5 : rule__LayerTuple__Group_0__5__Impl rule__LayerTuple__Group_0__6 ;
    public final void rule__LayerTuple__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2133:1: ( rule__LayerTuple__Group_0__5__Impl rule__LayerTuple__Group_0__6 )
            // InternalMyDsl.g:2134:2: rule__LayerTuple__Group_0__5__Impl rule__LayerTuple__Group_0__6
            {
            pushFollow(FOLLOW_29);
            rule__LayerTuple__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerTuple__Group_0__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0__5"


    // $ANTLR start "rule__LayerTuple__Group_0__5__Impl"
    // InternalMyDsl.g:2141:1: rule__LayerTuple__Group_0__5__Impl : ( ( rule__LayerTuple__OutAssignment_0_5 ) ) ;
    public final void rule__LayerTuple__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2145:1: ( ( ( rule__LayerTuple__OutAssignment_0_5 ) ) )
            // InternalMyDsl.g:2146:1: ( ( rule__LayerTuple__OutAssignment_0_5 ) )
            {
            // InternalMyDsl.g:2146:1: ( ( rule__LayerTuple__OutAssignment_0_5 ) )
            // InternalMyDsl.g:2147:2: ( rule__LayerTuple__OutAssignment_0_5 )
            {
             before(grammarAccess.getLayerTupleAccess().getOutAssignment_0_5()); 
            // InternalMyDsl.g:2148:2: ( rule__LayerTuple__OutAssignment_0_5 )
            // InternalMyDsl.g:2148:3: rule__LayerTuple__OutAssignment_0_5
            {
            pushFollow(FOLLOW_2);
            rule__LayerTuple__OutAssignment_0_5();

            state._fsp--;


            }

             after(grammarAccess.getLayerTupleAccess().getOutAssignment_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0__5__Impl"


    // $ANTLR start "rule__LayerTuple__Group_0__6"
    // InternalMyDsl.g:2156:1: rule__LayerTuple__Group_0__6 : rule__LayerTuple__Group_0__6__Impl ;
    public final void rule__LayerTuple__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2160:1: ( rule__LayerTuple__Group_0__6__Impl )
            // InternalMyDsl.g:2161:2: rule__LayerTuple__Group_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayerTuple__Group_0__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0__6"


    // $ANTLR start "rule__LayerTuple__Group_0__6__Impl"
    // InternalMyDsl.g:2167:1: rule__LayerTuple__Group_0__6__Impl : ( ')' ) ;
    public final void rule__LayerTuple__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2171:1: ( ( ')' ) )
            // InternalMyDsl.g:2172:1: ( ')' )
            {
            // InternalMyDsl.g:2172:1: ( ')' )
            // InternalMyDsl.g:2173:2: ')'
            {
             before(grammarAccess.getLayerTupleAccess().getRightParenthesisKeyword_0_6()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getLayerTupleAccess().getRightParenthesisKeyword_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0__6__Impl"


    // $ANTLR start "rule__LayerTuple__Group_0_1__0"
    // InternalMyDsl.g:2183:1: rule__LayerTuple__Group_0_1__0 : rule__LayerTuple__Group_0_1__0__Impl rule__LayerTuple__Group_0_1__1 ;
    public final void rule__LayerTuple__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2187:1: ( rule__LayerTuple__Group_0_1__0__Impl rule__LayerTuple__Group_0_1__1 )
            // InternalMyDsl.g:2188:2: rule__LayerTuple__Group_0_1__0__Impl rule__LayerTuple__Group_0_1__1
            {
            pushFollow(FOLLOW_27);
            rule__LayerTuple__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerTuple__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0_1__0"


    // $ANTLR start "rule__LayerTuple__Group_0_1__0__Impl"
    // InternalMyDsl.g:2195:1: rule__LayerTuple__Group_0_1__0__Impl : ( 'ref' ) ;
    public final void rule__LayerTuple__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2199:1: ( ( 'ref' ) )
            // InternalMyDsl.g:2200:1: ( 'ref' )
            {
            // InternalMyDsl.g:2200:1: ( 'ref' )
            // InternalMyDsl.g:2201:2: 'ref'
            {
             before(grammarAccess.getLayerTupleAccess().getRefKeyword_0_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getLayerTupleAccess().getRefKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0_1__0__Impl"


    // $ANTLR start "rule__LayerTuple__Group_0_1__1"
    // InternalMyDsl.g:2210:1: rule__LayerTuple__Group_0_1__1 : rule__LayerTuple__Group_0_1__1__Impl rule__LayerTuple__Group_0_1__2 ;
    public final void rule__LayerTuple__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2214:1: ( rule__LayerTuple__Group_0_1__1__Impl rule__LayerTuple__Group_0_1__2 )
            // InternalMyDsl.g:2215:2: rule__LayerTuple__Group_0_1__1__Impl rule__LayerTuple__Group_0_1__2
            {
            pushFollow(FOLLOW_3);
            rule__LayerTuple__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerTuple__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0_1__1"


    // $ANTLR start "rule__LayerTuple__Group_0_1__1__Impl"
    // InternalMyDsl.g:2222:1: rule__LayerTuple__Group_0_1__1__Impl : ( ':' ) ;
    public final void rule__LayerTuple__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2226:1: ( ( ':' ) )
            // InternalMyDsl.g:2227:1: ( ':' )
            {
            // InternalMyDsl.g:2227:1: ( ':' )
            // InternalMyDsl.g:2228:2: ':'
            {
             before(grammarAccess.getLayerTupleAccess().getColonKeyword_0_1_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLayerTupleAccess().getColonKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0_1__1__Impl"


    // $ANTLR start "rule__LayerTuple__Group_0_1__2"
    // InternalMyDsl.g:2237:1: rule__LayerTuple__Group_0_1__2 : rule__LayerTuple__Group_0_1__2__Impl ;
    public final void rule__LayerTuple__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2241:1: ( rule__LayerTuple__Group_0_1__2__Impl )
            // InternalMyDsl.g:2242:2: rule__LayerTuple__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayerTuple__Group_0_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0_1__2"


    // $ANTLR start "rule__LayerTuple__Group_0_1__2__Impl"
    // InternalMyDsl.g:2248:1: rule__LayerTuple__Group_0_1__2__Impl : ( ( rule__LayerTuple__RefAssignment_0_1_2 ) ) ;
    public final void rule__LayerTuple__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2252:1: ( ( ( rule__LayerTuple__RefAssignment_0_1_2 ) ) )
            // InternalMyDsl.g:2253:1: ( ( rule__LayerTuple__RefAssignment_0_1_2 ) )
            {
            // InternalMyDsl.g:2253:1: ( ( rule__LayerTuple__RefAssignment_0_1_2 ) )
            // InternalMyDsl.g:2254:2: ( rule__LayerTuple__RefAssignment_0_1_2 )
            {
             before(grammarAccess.getLayerTupleAccess().getRefAssignment_0_1_2()); 
            // InternalMyDsl.g:2255:2: ( rule__LayerTuple__RefAssignment_0_1_2 )
            // InternalMyDsl.g:2255:3: rule__LayerTuple__RefAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__LayerTuple__RefAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLayerTupleAccess().getRefAssignment_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0_1__2__Impl"


    // $ANTLR start "rule__LayerTuple__Group_0_2__0"
    // InternalMyDsl.g:2264:1: rule__LayerTuple__Group_0_2__0 : rule__LayerTuple__Group_0_2__0__Impl rule__LayerTuple__Group_0_2__1 ;
    public final void rule__LayerTuple__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2268:1: ( rule__LayerTuple__Group_0_2__0__Impl rule__LayerTuple__Group_0_2__1 )
            // InternalMyDsl.g:2269:2: rule__LayerTuple__Group_0_2__0__Impl rule__LayerTuple__Group_0_2__1
            {
            pushFollow(FOLLOW_27);
            rule__LayerTuple__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerTuple__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0_2__0"


    // $ANTLR start "rule__LayerTuple__Group_0_2__0__Impl"
    // InternalMyDsl.g:2276:1: rule__LayerTuple__Group_0_2__0__Impl : ( 'in' ) ;
    public final void rule__LayerTuple__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2280:1: ( ( 'in' ) )
            // InternalMyDsl.g:2281:1: ( 'in' )
            {
            // InternalMyDsl.g:2281:1: ( 'in' )
            // InternalMyDsl.g:2282:2: 'in'
            {
             before(grammarAccess.getLayerTupleAccess().getInKeyword_0_2_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getLayerTupleAccess().getInKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0_2__0__Impl"


    // $ANTLR start "rule__LayerTuple__Group_0_2__1"
    // InternalMyDsl.g:2291:1: rule__LayerTuple__Group_0_2__1 : rule__LayerTuple__Group_0_2__1__Impl rule__LayerTuple__Group_0_2__2 ;
    public final void rule__LayerTuple__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2295:1: ( rule__LayerTuple__Group_0_2__1__Impl rule__LayerTuple__Group_0_2__2 )
            // InternalMyDsl.g:2296:2: rule__LayerTuple__Group_0_2__1__Impl rule__LayerTuple__Group_0_2__2
            {
            pushFollow(FOLLOW_28);
            rule__LayerTuple__Group_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerTuple__Group_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0_2__1"


    // $ANTLR start "rule__LayerTuple__Group_0_2__1__Impl"
    // InternalMyDsl.g:2303:1: rule__LayerTuple__Group_0_2__1__Impl : ( ':' ) ;
    public final void rule__LayerTuple__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2307:1: ( ( ':' ) )
            // InternalMyDsl.g:2308:1: ( ':' )
            {
            // InternalMyDsl.g:2308:1: ( ':' )
            // InternalMyDsl.g:2309:2: ':'
            {
             before(grammarAccess.getLayerTupleAccess().getColonKeyword_0_2_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLayerTupleAccess().getColonKeyword_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0_2__1__Impl"


    // $ANTLR start "rule__LayerTuple__Group_0_2__2"
    // InternalMyDsl.g:2318:1: rule__LayerTuple__Group_0_2__2 : rule__LayerTuple__Group_0_2__2__Impl ;
    public final void rule__LayerTuple__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2322:1: ( rule__LayerTuple__Group_0_2__2__Impl )
            // InternalMyDsl.g:2323:2: rule__LayerTuple__Group_0_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayerTuple__Group_0_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0_2__2"


    // $ANTLR start "rule__LayerTuple__Group_0_2__2__Impl"
    // InternalMyDsl.g:2329:1: rule__LayerTuple__Group_0_2__2__Impl : ( ( rule__LayerTuple__InAssignment_0_2_2 ) ) ;
    public final void rule__LayerTuple__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2333:1: ( ( ( rule__LayerTuple__InAssignment_0_2_2 ) ) )
            // InternalMyDsl.g:2334:1: ( ( rule__LayerTuple__InAssignment_0_2_2 ) )
            {
            // InternalMyDsl.g:2334:1: ( ( rule__LayerTuple__InAssignment_0_2_2 ) )
            // InternalMyDsl.g:2335:2: ( rule__LayerTuple__InAssignment_0_2_2 )
            {
             before(grammarAccess.getLayerTupleAccess().getInAssignment_0_2_2()); 
            // InternalMyDsl.g:2336:2: ( rule__LayerTuple__InAssignment_0_2_2 )
            // InternalMyDsl.g:2336:3: rule__LayerTuple__InAssignment_0_2_2
            {
            pushFollow(FOLLOW_2);
            rule__LayerTuple__InAssignment_0_2_2();

            state._fsp--;


            }

             after(grammarAccess.getLayerTupleAccess().getInAssignment_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_0_2__2__Impl"


    // $ANTLR start "rule__LayerTuple__Group_1__0"
    // InternalMyDsl.g:2345:1: rule__LayerTuple__Group_1__0 : rule__LayerTuple__Group_1__0__Impl rule__LayerTuple__Group_1__1 ;
    public final void rule__LayerTuple__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2349:1: ( rule__LayerTuple__Group_1__0__Impl rule__LayerTuple__Group_1__1 )
            // InternalMyDsl.g:2350:2: rule__LayerTuple__Group_1__0__Impl rule__LayerTuple__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__LayerTuple__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerTuple__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_1__0"


    // $ANTLR start "rule__LayerTuple__Group_1__0__Impl"
    // InternalMyDsl.g:2357:1: rule__LayerTuple__Group_1__0__Impl : ( '(' ) ;
    public final void rule__LayerTuple__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2361:1: ( ( '(' ) )
            // InternalMyDsl.g:2362:1: ( '(' )
            {
            // InternalMyDsl.g:2362:1: ( '(' )
            // InternalMyDsl.g:2363:2: '('
            {
             before(grammarAccess.getLayerTupleAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLayerTupleAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_1__0__Impl"


    // $ANTLR start "rule__LayerTuple__Group_1__1"
    // InternalMyDsl.g:2372:1: rule__LayerTuple__Group_1__1 : rule__LayerTuple__Group_1__1__Impl rule__LayerTuple__Group_1__2 ;
    public final void rule__LayerTuple__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2376:1: ( rule__LayerTuple__Group_1__1__Impl rule__LayerTuple__Group_1__2 )
            // InternalMyDsl.g:2377:2: rule__LayerTuple__Group_1__1__Impl rule__LayerTuple__Group_1__2
            {
            pushFollow(FOLLOW_30);
            rule__LayerTuple__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerTuple__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_1__1"


    // $ANTLR start "rule__LayerTuple__Group_1__1__Impl"
    // InternalMyDsl.g:2384:1: rule__LayerTuple__Group_1__1__Impl : ( ( rule__LayerTuple__InAssignment_1_1 )? ) ;
    public final void rule__LayerTuple__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2388:1: ( ( ( rule__LayerTuple__InAssignment_1_1 )? ) )
            // InternalMyDsl.g:2389:1: ( ( rule__LayerTuple__InAssignment_1_1 )? )
            {
            // InternalMyDsl.g:2389:1: ( ( rule__LayerTuple__InAssignment_1_1 )? )
            // InternalMyDsl.g:2390:2: ( rule__LayerTuple__InAssignment_1_1 )?
            {
             before(grammarAccess.getLayerTupleAccess().getInAssignment_1_1()); 
            // InternalMyDsl.g:2391:2: ( rule__LayerTuple__InAssignment_1_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INTEGER||LA18_0==55) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:2391:3: rule__LayerTuple__InAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayerTuple__InAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayerTupleAccess().getInAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_1__1__Impl"


    // $ANTLR start "rule__LayerTuple__Group_1__2"
    // InternalMyDsl.g:2399:1: rule__LayerTuple__Group_1__2 : rule__LayerTuple__Group_1__2__Impl rule__LayerTuple__Group_1__3 ;
    public final void rule__LayerTuple__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2403:1: ( rule__LayerTuple__Group_1__2__Impl rule__LayerTuple__Group_1__3 )
            // InternalMyDsl.g:2404:2: rule__LayerTuple__Group_1__2__Impl rule__LayerTuple__Group_1__3
            {
            pushFollow(FOLLOW_28);
            rule__LayerTuple__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerTuple__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_1__2"


    // $ANTLR start "rule__LayerTuple__Group_1__2__Impl"
    // InternalMyDsl.g:2411:1: rule__LayerTuple__Group_1__2__Impl : ( ':' ) ;
    public final void rule__LayerTuple__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2415:1: ( ( ':' ) )
            // InternalMyDsl.g:2416:1: ( ':' )
            {
            // InternalMyDsl.g:2416:1: ( ':' )
            // InternalMyDsl.g:2417:2: ':'
            {
             before(grammarAccess.getLayerTupleAccess().getColonKeyword_1_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLayerTupleAccess().getColonKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_1__2__Impl"


    // $ANTLR start "rule__LayerTuple__Group_1__3"
    // InternalMyDsl.g:2426:1: rule__LayerTuple__Group_1__3 : rule__LayerTuple__Group_1__3__Impl rule__LayerTuple__Group_1__4 ;
    public final void rule__LayerTuple__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2430:1: ( rule__LayerTuple__Group_1__3__Impl rule__LayerTuple__Group_1__4 )
            // InternalMyDsl.g:2431:2: rule__LayerTuple__Group_1__3__Impl rule__LayerTuple__Group_1__4
            {
            pushFollow(FOLLOW_29);
            rule__LayerTuple__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerTuple__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_1__3"


    // $ANTLR start "rule__LayerTuple__Group_1__3__Impl"
    // InternalMyDsl.g:2438:1: rule__LayerTuple__Group_1__3__Impl : ( ( rule__LayerTuple__OutAssignment_1_3 ) ) ;
    public final void rule__LayerTuple__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2442:1: ( ( ( rule__LayerTuple__OutAssignment_1_3 ) ) )
            // InternalMyDsl.g:2443:1: ( ( rule__LayerTuple__OutAssignment_1_3 ) )
            {
            // InternalMyDsl.g:2443:1: ( ( rule__LayerTuple__OutAssignment_1_3 ) )
            // InternalMyDsl.g:2444:2: ( rule__LayerTuple__OutAssignment_1_3 )
            {
             before(grammarAccess.getLayerTupleAccess().getOutAssignment_1_3()); 
            // InternalMyDsl.g:2445:2: ( rule__LayerTuple__OutAssignment_1_3 )
            // InternalMyDsl.g:2445:3: rule__LayerTuple__OutAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__LayerTuple__OutAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getLayerTupleAccess().getOutAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_1__3__Impl"


    // $ANTLR start "rule__LayerTuple__Group_1__4"
    // InternalMyDsl.g:2453:1: rule__LayerTuple__Group_1__4 : rule__LayerTuple__Group_1__4__Impl ;
    public final void rule__LayerTuple__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2457:1: ( rule__LayerTuple__Group_1__4__Impl )
            // InternalMyDsl.g:2458:2: rule__LayerTuple__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayerTuple__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_1__4"


    // $ANTLR start "rule__LayerTuple__Group_1__4__Impl"
    // InternalMyDsl.g:2464:1: rule__LayerTuple__Group_1__4__Impl : ( ')' ) ;
    public final void rule__LayerTuple__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2468:1: ( ( ')' ) )
            // InternalMyDsl.g:2469:1: ( ')' )
            {
            // InternalMyDsl.g:2469:1: ( ')' )
            // InternalMyDsl.g:2470:2: ')'
            {
             before(grammarAccess.getLayerTupleAccess().getRightParenthesisKeyword_1_4()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getLayerTupleAccess().getRightParenthesisKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_1__4__Impl"


    // $ANTLR start "rule__LayerTuple__Group_2__0"
    // InternalMyDsl.g:2480:1: rule__LayerTuple__Group_2__0 : rule__LayerTuple__Group_2__0__Impl rule__LayerTuple__Group_2__1 ;
    public final void rule__LayerTuple__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2484:1: ( rule__LayerTuple__Group_2__0__Impl rule__LayerTuple__Group_2__1 )
            // InternalMyDsl.g:2485:2: rule__LayerTuple__Group_2__0__Impl rule__LayerTuple__Group_2__1
            {
            pushFollow(FOLLOW_28);
            rule__LayerTuple__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerTuple__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_2__0"


    // $ANTLR start "rule__LayerTuple__Group_2__0__Impl"
    // InternalMyDsl.g:2492:1: rule__LayerTuple__Group_2__0__Impl : ( ':' ) ;
    public final void rule__LayerTuple__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2496:1: ( ( ':' ) )
            // InternalMyDsl.g:2497:1: ( ':' )
            {
            // InternalMyDsl.g:2497:1: ( ':' )
            // InternalMyDsl.g:2498:2: ':'
            {
             before(grammarAccess.getLayerTupleAccess().getColonKeyword_2_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLayerTupleAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_2__0__Impl"


    // $ANTLR start "rule__LayerTuple__Group_2__1"
    // InternalMyDsl.g:2507:1: rule__LayerTuple__Group_2__1 : rule__LayerTuple__Group_2__1__Impl ;
    public final void rule__LayerTuple__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2511:1: ( rule__LayerTuple__Group_2__1__Impl )
            // InternalMyDsl.g:2512:2: rule__LayerTuple__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayerTuple__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_2__1"


    // $ANTLR start "rule__LayerTuple__Group_2__1__Impl"
    // InternalMyDsl.g:2518:1: rule__LayerTuple__Group_2__1__Impl : ( ( rule__LayerTuple__OutAssignment_2_1 ) ) ;
    public final void rule__LayerTuple__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2522:1: ( ( ( rule__LayerTuple__OutAssignment_2_1 ) ) )
            // InternalMyDsl.g:2523:1: ( ( rule__LayerTuple__OutAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2523:1: ( ( rule__LayerTuple__OutAssignment_2_1 ) )
            // InternalMyDsl.g:2524:2: ( rule__LayerTuple__OutAssignment_2_1 )
            {
             before(grammarAccess.getLayerTupleAccess().getOutAssignment_2_1()); 
            // InternalMyDsl.g:2525:2: ( rule__LayerTuple__OutAssignment_2_1 )
            // InternalMyDsl.g:2525:3: rule__LayerTuple__OutAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LayerTuple__OutAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLayerTupleAccess().getOutAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__Group_2__1__Impl"


    // $ANTLR start "rule__LayerRef__Group_1__0"
    // InternalMyDsl.g:2534:1: rule__LayerRef__Group_1__0 : rule__LayerRef__Group_1__0__Impl rule__LayerRef__Group_1__1 ;
    public final void rule__LayerRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2538:1: ( rule__LayerRef__Group_1__0__Impl rule__LayerRef__Group_1__1 )
            // InternalMyDsl.g:2539:2: rule__LayerRef__Group_1__0__Impl rule__LayerRef__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__LayerRef__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerRef__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerRef__Group_1__0"


    // $ANTLR start "rule__LayerRef__Group_1__0__Impl"
    // InternalMyDsl.g:2546:1: rule__LayerRef__Group_1__0__Impl : ( '<' ) ;
    public final void rule__LayerRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2550:1: ( ( '<' ) )
            // InternalMyDsl.g:2551:1: ( '<' )
            {
            // InternalMyDsl.g:2551:1: ( '<' )
            // InternalMyDsl.g:2552:2: '<'
            {
             before(grammarAccess.getLayerRefAccess().getLessThanSignKeyword_1_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getLayerRefAccess().getLessThanSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerRef__Group_1__0__Impl"


    // $ANTLR start "rule__LayerRef__Group_1__1"
    // InternalMyDsl.g:2561:1: rule__LayerRef__Group_1__1 : rule__LayerRef__Group_1__1__Impl rule__LayerRef__Group_1__2 ;
    public final void rule__LayerRef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2565:1: ( rule__LayerRef__Group_1__1__Impl rule__LayerRef__Group_1__2 )
            // InternalMyDsl.g:2566:2: rule__LayerRef__Group_1__1__Impl rule__LayerRef__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__LayerRef__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerRef__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerRef__Group_1__1"


    // $ANTLR start "rule__LayerRef__Group_1__1__Impl"
    // InternalMyDsl.g:2573:1: rule__LayerRef__Group_1__1__Impl : ( ( rule__LayerRef__RefAssignment_1_1 ) ) ;
    public final void rule__LayerRef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2577:1: ( ( ( rule__LayerRef__RefAssignment_1_1 ) ) )
            // InternalMyDsl.g:2578:1: ( ( rule__LayerRef__RefAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2578:1: ( ( rule__LayerRef__RefAssignment_1_1 ) )
            // InternalMyDsl.g:2579:2: ( rule__LayerRef__RefAssignment_1_1 )
            {
             before(grammarAccess.getLayerRefAccess().getRefAssignment_1_1()); 
            // InternalMyDsl.g:2580:2: ( rule__LayerRef__RefAssignment_1_1 )
            // InternalMyDsl.g:2580:3: rule__LayerRef__RefAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LayerRef__RefAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLayerRefAccess().getRefAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerRef__Group_1__1__Impl"


    // $ANTLR start "rule__LayerRef__Group_1__2"
    // InternalMyDsl.g:2588:1: rule__LayerRef__Group_1__2 : rule__LayerRef__Group_1__2__Impl ;
    public final void rule__LayerRef__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2592:1: ( rule__LayerRef__Group_1__2__Impl )
            // InternalMyDsl.g:2593:2: rule__LayerRef__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayerRef__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerRef__Group_1__2"


    // $ANTLR start "rule__LayerRef__Group_1__2__Impl"
    // InternalMyDsl.g:2599:1: rule__LayerRef__Group_1__2__Impl : ( '>' ) ;
    public final void rule__LayerRef__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2603:1: ( ( '>' ) )
            // InternalMyDsl.g:2604:1: ( '>' )
            {
            // InternalMyDsl.g:2604:1: ( '>' )
            // InternalMyDsl.g:2605:2: '>'
            {
             before(grammarAccess.getLayerRefAccess().getGreaterThanSignKeyword_1_2()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getLayerRefAccess().getGreaterThanSignKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerRef__Group_1__2__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalMyDsl.g:2615:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2619:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalMyDsl.g:2620:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalMyDsl.g:2627:1: rule__Function__Group__0__Impl : ( ( rule__Function__NameAssignment_0 ) ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2631:1: ( ( ( rule__Function__NameAssignment_0 ) ) )
            // InternalMyDsl.g:2632:1: ( ( rule__Function__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:2632:1: ( ( rule__Function__NameAssignment_0 ) )
            // InternalMyDsl.g:2633:2: ( rule__Function__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:2634:2: ( rule__Function__NameAssignment_0 )
            // InternalMyDsl.g:2634:3: rule__Function__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalMyDsl.g:2642:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2646:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalMyDsl.g:2647:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalMyDsl.g:2654:1: rule__Function__Group__1__Impl : ( ( rule__Function__Group_1__0 )? ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2658:1: ( ( ( rule__Function__Group_1__0 )? ) )
            // InternalMyDsl.g:2659:1: ( ( rule__Function__Group_1__0 )? )
            {
            // InternalMyDsl.g:2659:1: ( ( rule__Function__Group_1__0 )? )
            // InternalMyDsl.g:2660:2: ( rule__Function__Group_1__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_1()); 
            // InternalMyDsl.g:2661:2: ( rule__Function__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==49) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2661:3: rule__Function__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalMyDsl.g:2669:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2673:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalMyDsl.g:2674:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalMyDsl.g:2681:1: rule__Function__Group__2__Impl : ( RULE_ASSIGN ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2685:1: ( ( RULE_ASSIGN ) )
            // InternalMyDsl.g:2686:1: ( RULE_ASSIGN )
            {
            // InternalMyDsl.g:2686:1: ( RULE_ASSIGN )
            // InternalMyDsl.g:2687:2: RULE_ASSIGN
            {
             before(grammarAccess.getFunctionAccess().getASSIGNTerminalRuleCall_2()); 
            match(input,RULE_ASSIGN,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getASSIGNTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // InternalMyDsl.g:2696:1: rule__Function__Group__3 : rule__Function__Group__3__Impl ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2700:1: ( rule__Function__Group__3__Impl )
            // InternalMyDsl.g:2701:2: rule__Function__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalMyDsl.g:2707:1: rule__Function__Group__3__Impl : ( ( rule__Function__ExprAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2711:1: ( ( ( rule__Function__ExprAssignment_3 ) ) )
            // InternalMyDsl.g:2712:1: ( ( rule__Function__ExprAssignment_3 ) )
            {
            // InternalMyDsl.g:2712:1: ( ( rule__Function__ExprAssignment_3 ) )
            // InternalMyDsl.g:2713:2: ( rule__Function__ExprAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getExprAssignment_3()); 
            // InternalMyDsl.g:2714:2: ( rule__Function__ExprAssignment_3 )
            // InternalMyDsl.g:2714:3: rule__Function__ExprAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Function__ExprAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getExprAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group_1__0"
    // InternalMyDsl.g:2723:1: rule__Function__Group_1__0 : rule__Function__Group_1__0__Impl rule__Function__Group_1__1 ;
    public final void rule__Function__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2727:1: ( rule__Function__Group_1__0__Impl rule__Function__Group_1__1 )
            // InternalMyDsl.g:2728:2: rule__Function__Group_1__0__Impl rule__Function__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Function__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_1__0"


    // $ANTLR start "rule__Function__Group_1__0__Impl"
    // InternalMyDsl.g:2735:1: rule__Function__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Function__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2739:1: ( ( '(' ) )
            // InternalMyDsl.g:2740:1: ( '(' )
            {
            // InternalMyDsl.g:2740:1: ( '(' )
            // InternalMyDsl.g:2741:2: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_1__0__Impl"


    // $ANTLR start "rule__Function__Group_1__1"
    // InternalMyDsl.g:2750:1: rule__Function__Group_1__1 : rule__Function__Group_1__1__Impl rule__Function__Group_1__2 ;
    public final void rule__Function__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2754:1: ( rule__Function__Group_1__1__Impl rule__Function__Group_1__2 )
            // InternalMyDsl.g:2755:2: rule__Function__Group_1__1__Impl rule__Function__Group_1__2
            {
            pushFollow(FOLLOW_34);
            rule__Function__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_1__1"


    // $ANTLR start "rule__Function__Group_1__1__Impl"
    // InternalMyDsl.g:2762:1: rule__Function__Group_1__1__Impl : ( ( rule__Function__ArgsAssignment_1_1 ) ) ;
    public final void rule__Function__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2766:1: ( ( ( rule__Function__ArgsAssignment_1_1 ) ) )
            // InternalMyDsl.g:2767:1: ( ( rule__Function__ArgsAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2767:1: ( ( rule__Function__ArgsAssignment_1_1 ) )
            // InternalMyDsl.g:2768:2: ( rule__Function__ArgsAssignment_1_1 )
            {
             before(grammarAccess.getFunctionAccess().getArgsAssignment_1_1()); 
            // InternalMyDsl.g:2769:2: ( rule__Function__ArgsAssignment_1_1 )
            // InternalMyDsl.g:2769:3: rule__Function__ArgsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__ArgsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getArgsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_1__1__Impl"


    // $ANTLR start "rule__Function__Group_1__2"
    // InternalMyDsl.g:2777:1: rule__Function__Group_1__2 : rule__Function__Group_1__2__Impl rule__Function__Group_1__3 ;
    public final void rule__Function__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2781:1: ( rule__Function__Group_1__2__Impl rule__Function__Group_1__3 )
            // InternalMyDsl.g:2782:2: rule__Function__Group_1__2__Impl rule__Function__Group_1__3
            {
            pushFollow(FOLLOW_34);
            rule__Function__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_1__2"


    // $ANTLR start "rule__Function__Group_1__2__Impl"
    // InternalMyDsl.g:2789:1: rule__Function__Group_1__2__Impl : ( ( rule__Function__Group_1_2__0 )* ) ;
    public final void rule__Function__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2793:1: ( ( ( rule__Function__Group_1_2__0 )* ) )
            // InternalMyDsl.g:2794:1: ( ( rule__Function__Group_1_2__0 )* )
            {
            // InternalMyDsl.g:2794:1: ( ( rule__Function__Group_1_2__0 )* )
            // InternalMyDsl.g:2795:2: ( rule__Function__Group_1_2__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_1_2()); 
            // InternalMyDsl.g:2796:2: ( rule__Function__Group_1_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==48) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2796:3: rule__Function__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Function__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_1__2__Impl"


    // $ANTLR start "rule__Function__Group_1__3"
    // InternalMyDsl.g:2804:1: rule__Function__Group_1__3 : rule__Function__Group_1__3__Impl ;
    public final void rule__Function__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2808:1: ( rule__Function__Group_1__3__Impl )
            // InternalMyDsl.g:2809:2: rule__Function__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_1__3"


    // $ANTLR start "rule__Function__Group_1__3__Impl"
    // InternalMyDsl.g:2815:1: rule__Function__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Function__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2819:1: ( ( ')' ) )
            // InternalMyDsl.g:2820:1: ( ')' )
            {
            // InternalMyDsl.g:2820:1: ( ')' )
            // InternalMyDsl.g:2821:2: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_1_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_1__3__Impl"


    // $ANTLR start "rule__Function__Group_1_2__0"
    // InternalMyDsl.g:2831:1: rule__Function__Group_1_2__0 : rule__Function__Group_1_2__0__Impl rule__Function__Group_1_2__1 ;
    public final void rule__Function__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2835:1: ( rule__Function__Group_1_2__0__Impl rule__Function__Group_1_2__1 )
            // InternalMyDsl.g:2836:2: rule__Function__Group_1_2__0__Impl rule__Function__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Function__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_1_2__0"


    // $ANTLR start "rule__Function__Group_1_2__0__Impl"
    // InternalMyDsl.g:2843:1: rule__Function__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Function__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2847:1: ( ( ',' ) )
            // InternalMyDsl.g:2848:1: ( ',' )
            {
            // InternalMyDsl.g:2848:1: ( ',' )
            // InternalMyDsl.g:2849:2: ','
            {
             before(grammarAccess.getFunctionAccess().getCommaKeyword_1_2_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_1_2__0__Impl"


    // $ANTLR start "rule__Function__Group_1_2__1"
    // InternalMyDsl.g:2858:1: rule__Function__Group_1_2__1 : rule__Function__Group_1_2__1__Impl ;
    public final void rule__Function__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2862:1: ( rule__Function__Group_1_2__1__Impl )
            // InternalMyDsl.g:2863:2: rule__Function__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_1_2__1"


    // $ANTLR start "rule__Function__Group_1_2__1__Impl"
    // InternalMyDsl.g:2869:1: rule__Function__Group_1_2__1__Impl : ( ( rule__Function__ArgsAssignment_1_2_1 ) ) ;
    public final void rule__Function__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2873:1: ( ( ( rule__Function__ArgsAssignment_1_2_1 ) ) )
            // InternalMyDsl.g:2874:1: ( ( rule__Function__ArgsAssignment_1_2_1 ) )
            {
            // InternalMyDsl.g:2874:1: ( ( rule__Function__ArgsAssignment_1_2_1 ) )
            // InternalMyDsl.g:2875:2: ( rule__Function__ArgsAssignment_1_2_1 )
            {
             before(grammarAccess.getFunctionAccess().getArgsAssignment_1_2_1()); 
            // InternalMyDsl.g:2876:2: ( rule__Function__ArgsAssignment_1_2_1 )
            // InternalMyDsl.g:2876:3: rule__Function__ArgsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__ArgsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getArgsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_1_2__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalMyDsl.g:2885:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2889:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalMyDsl.g:2890:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalMyDsl.g:2897:1: rule__Expression__Group__0__Impl : ( ruleTerm ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2901:1: ( ( ruleTerm ) )
            // InternalMyDsl.g:2902:1: ( ruleTerm )
            {
            // InternalMyDsl.g:2902:1: ( ruleTerm )
            // InternalMyDsl.g:2903:2: ruleTerm
            {
             before(grammarAccess.getExpressionAccess().getTermParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getTermParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalMyDsl.g:2912:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2916:1: ( rule__Expression__Group__1__Impl )
            // InternalMyDsl.g:2917:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalMyDsl.g:2923:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2927:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalMyDsl.g:2928:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalMyDsl.g:2928:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalMyDsl.g:2929:2: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalMyDsl.g:2930:2: ( rule__Expression__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=57 && LA21_0<=58)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:2930:3: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalMyDsl.g:2939:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2943:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalMyDsl.g:2944:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalMyDsl.g:2951:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Alternatives_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2955:1: ( ( ( rule__Expression__Alternatives_1_0 ) ) )
            // InternalMyDsl.g:2956:1: ( ( rule__Expression__Alternatives_1_0 ) )
            {
            // InternalMyDsl.g:2956:1: ( ( rule__Expression__Alternatives_1_0 ) )
            // InternalMyDsl.g:2957:2: ( rule__Expression__Alternatives_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 
            // InternalMyDsl.g:2958:2: ( rule__Expression__Alternatives_1_0 )
            // InternalMyDsl.g:2958:3: rule__Expression__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalMyDsl.g:2966:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2970:1: ( rule__Expression__Group_1__1__Impl )
            // InternalMyDsl.g:2971:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalMyDsl.g:2977:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__RightAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2981:1: ( ( ( rule__Expression__RightAssignment_1_1 ) ) )
            // InternalMyDsl.g:2982:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2982:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            // InternalMyDsl.g:2983:2: ( rule__Expression__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 
            // InternalMyDsl.g:2984:2: ( rule__Expression__RightAssignment_1_1 )
            // InternalMyDsl.g:2984:3: rule__Expression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1_0_0__0"
    // InternalMyDsl.g:2993:1: rule__Expression__Group_1_0_0__0 : rule__Expression__Group_1_0_0__0__Impl rule__Expression__Group_1_0_0__1 ;
    public final void rule__Expression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2997:1: ( rule__Expression__Group_1_0_0__0__Impl rule__Expression__Group_1_0_0__1 )
            // InternalMyDsl.g:2998:2: rule__Expression__Group_1_0_0__0__Impl rule__Expression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_37);
            rule__Expression__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_0__0"


    // $ANTLR start "rule__Expression__Group_1_0_0__0__Impl"
    // InternalMyDsl.g:3005:1: rule__Expression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3009:1: ( ( () ) )
            // InternalMyDsl.g:3010:1: ( () )
            {
            // InternalMyDsl.g:3010:1: ( () )
            // InternalMyDsl.g:3011:2: ()
            {
             before(grammarAccess.getExpressionAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalMyDsl.g:3012:2: ()
            // InternalMyDsl.g:3012:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_1_0_0__1"
    // InternalMyDsl.g:3020:1: rule__Expression__Group_1_0_0__1 : rule__Expression__Group_1_0_0__1__Impl ;
    public final void rule__Expression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3024:1: ( rule__Expression__Group_1_0_0__1__Impl )
            // InternalMyDsl.g:3025:2: rule__Expression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_0__1"


    // $ANTLR start "rule__Expression__Group_1_0_0__1__Impl"
    // InternalMyDsl.g:3031:1: rule__Expression__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Expression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3035:1: ( ( '+' ) )
            // InternalMyDsl.g:3036:1: ( '+' )
            {
            // InternalMyDsl.g:3036:1: ( '+' )
            // InternalMyDsl.g:3037:2: '+'
            {
             before(grammarAccess.getExpressionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Expression__Group_1_0_1__0"
    // InternalMyDsl.g:3047:1: rule__Expression__Group_1_0_1__0 : rule__Expression__Group_1_0_1__0__Impl rule__Expression__Group_1_0_1__1 ;
    public final void rule__Expression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3051:1: ( rule__Expression__Group_1_0_1__0__Impl rule__Expression__Group_1_0_1__1 )
            // InternalMyDsl.g:3052:2: rule__Expression__Group_1_0_1__0__Impl rule__Expression__Group_1_0_1__1
            {
            pushFollow(FOLLOW_35);
            rule__Expression__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_1__0"


    // $ANTLR start "rule__Expression__Group_1_0_1__0__Impl"
    // InternalMyDsl.g:3059:1: rule__Expression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3063:1: ( ( () ) )
            // InternalMyDsl.g:3064:1: ( () )
            {
            // InternalMyDsl.g:3064:1: ( () )
            // InternalMyDsl.g:3065:2: ()
            {
             before(grammarAccess.getExpressionAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalMyDsl.g:3066:2: ()
            // InternalMyDsl.g:3066:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1_0_1__1"
    // InternalMyDsl.g:3074:1: rule__Expression__Group_1_0_1__1 : rule__Expression__Group_1_0_1__1__Impl ;
    public final void rule__Expression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3078:1: ( rule__Expression__Group_1_0_1__1__Impl )
            // InternalMyDsl.g:3079:2: rule__Expression__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_1__1"


    // $ANTLR start "rule__Expression__Group_1_0_1__1__Impl"
    // InternalMyDsl.g:3085:1: rule__Expression__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Expression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3089:1: ( ( '-' ) )
            // InternalMyDsl.g:3090:1: ( '-' )
            {
            // InternalMyDsl.g:3090:1: ( '-' )
            // InternalMyDsl.g:3091:2: '-'
            {
             before(grammarAccess.getExpressionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // InternalMyDsl.g:3101:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3105:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalMyDsl.g:3106:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0"


    // $ANTLR start "rule__Term__Group__0__Impl"
    // InternalMyDsl.g:3113:1: rule__Term__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3117:1: ( ( ruleFactor ) )
            // InternalMyDsl.g:3118:1: ( ruleFactor )
            {
            // InternalMyDsl.g:3118:1: ( ruleFactor )
            // InternalMyDsl.g:3119:2: ruleFactor
            {
             before(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0__Impl"


    // $ANTLR start "rule__Term__Group__1"
    // InternalMyDsl.g:3128:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3132:1: ( rule__Term__Group__1__Impl )
            // InternalMyDsl.g:3133:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1"


    // $ANTLR start "rule__Term__Group__1__Impl"
    // InternalMyDsl.g:3139:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3143:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // InternalMyDsl.g:3144:1: ( ( rule__Term__Group_1__0 )* )
            {
            // InternalMyDsl.g:3144:1: ( ( rule__Term__Group_1__0 )* )
            // InternalMyDsl.g:3145:2: ( rule__Term__Group_1__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // InternalMyDsl.g:3146:2: ( rule__Term__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=59 && LA22_0<=60)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:3146:3: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Term__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getTermAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1__Impl"


    // $ANTLR start "rule__Term__Group_1__0"
    // InternalMyDsl.g:3155:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3159:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalMyDsl.g:3160:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__Term__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0"


    // $ANTLR start "rule__Term__Group_1__0__Impl"
    // InternalMyDsl.g:3167:1: rule__Term__Group_1__0__Impl : ( ( rule__Term__Alternatives_1_0 ) ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3171:1: ( ( ( rule__Term__Alternatives_1_0 ) ) )
            // InternalMyDsl.g:3172:1: ( ( rule__Term__Alternatives_1_0 ) )
            {
            // InternalMyDsl.g:3172:1: ( ( rule__Term__Alternatives_1_0 ) )
            // InternalMyDsl.g:3173:2: ( rule__Term__Alternatives_1_0 )
            {
             before(grammarAccess.getTermAccess().getAlternatives_1_0()); 
            // InternalMyDsl.g:3174:2: ( rule__Term__Alternatives_1_0 )
            // InternalMyDsl.g:3174:3: rule__Term__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1__1"
    // InternalMyDsl.g:3182:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3186:1: ( rule__Term__Group_1__1__Impl )
            // InternalMyDsl.g:3187:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__1"


    // $ANTLR start "rule__Term__Group_1__1__Impl"
    // InternalMyDsl.g:3193:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__RightAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3197:1: ( ( ( rule__Term__RightAssignment_1_1 ) ) )
            // InternalMyDsl.g:3198:1: ( ( rule__Term__RightAssignment_1_1 ) )
            {
            // InternalMyDsl.g:3198:1: ( ( rule__Term__RightAssignment_1_1 ) )
            // InternalMyDsl.g:3199:2: ( rule__Term__RightAssignment_1_1 )
            {
             before(grammarAccess.getTermAccess().getRightAssignment_1_1()); 
            // InternalMyDsl.g:3200:2: ( rule__Term__RightAssignment_1_1 )
            // InternalMyDsl.g:3200:3: rule__Term__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Term__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__1__Impl"


    // $ANTLR start "rule__Term__Group_1_0_0__0"
    // InternalMyDsl.g:3209:1: rule__Term__Group_1_0_0__0 : rule__Term__Group_1_0_0__0__Impl rule__Term__Group_1_0_0__1 ;
    public final void rule__Term__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3213:1: ( rule__Term__Group_1_0_0__0__Impl rule__Term__Group_1_0_0__1 )
            // InternalMyDsl.g:3214:2: rule__Term__Group_1_0_0__0__Impl rule__Term__Group_1_0_0__1
            {
            pushFollow(FOLLOW_40);
            rule__Term__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_0__0"


    // $ANTLR start "rule__Term__Group_1_0_0__0__Impl"
    // InternalMyDsl.g:3221:1: rule__Term__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Term__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3225:1: ( ( () ) )
            // InternalMyDsl.g:3226:1: ( () )
            {
            // InternalMyDsl.g:3226:1: ( () )
            // InternalMyDsl.g:3227:2: ()
            {
             before(grammarAccess.getTermAccess().getMultiplyLeftAction_1_0_0_0()); 
            // InternalMyDsl.g:3228:2: ()
            // InternalMyDsl.g:3228:3: 
            {
            }

             after(grammarAccess.getTermAccess().getMultiplyLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Term__Group_1_0_0__1"
    // InternalMyDsl.g:3236:1: rule__Term__Group_1_0_0__1 : rule__Term__Group_1_0_0__1__Impl ;
    public final void rule__Term__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3240:1: ( rule__Term__Group_1_0_0__1__Impl )
            // InternalMyDsl.g:3241:2: rule__Term__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_0__1"


    // $ANTLR start "rule__Term__Group_1_0_0__1__Impl"
    // InternalMyDsl.g:3247:1: rule__Term__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Term__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3251:1: ( ( '*' ) )
            // InternalMyDsl.g:3252:1: ( '*' )
            {
            // InternalMyDsl.g:3252:1: ( '*' )
            // InternalMyDsl.g:3253:2: '*'
            {
             before(grammarAccess.getTermAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getTermAccess().getAsteriskKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Term__Group_1_0_1__0"
    // InternalMyDsl.g:3263:1: rule__Term__Group_1_0_1__0 : rule__Term__Group_1_0_1__0__Impl rule__Term__Group_1_0_1__1 ;
    public final void rule__Term__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3267:1: ( rule__Term__Group_1_0_1__0__Impl rule__Term__Group_1_0_1__1 )
            // InternalMyDsl.g:3268:2: rule__Term__Group_1_0_1__0__Impl rule__Term__Group_1_0_1__1
            {
            pushFollow(FOLLOW_38);
            rule__Term__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_1__0"


    // $ANTLR start "rule__Term__Group_1_0_1__0__Impl"
    // InternalMyDsl.g:3275:1: rule__Term__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Term__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3279:1: ( ( () ) )
            // InternalMyDsl.g:3280:1: ( () )
            {
            // InternalMyDsl.g:3280:1: ( () )
            // InternalMyDsl.g:3281:2: ()
            {
             before(grammarAccess.getTermAccess().getDivisionLeftAction_1_0_1_0()); 
            // InternalMyDsl.g:3282:2: ()
            // InternalMyDsl.g:3282:3: 
            {
            }

             after(grammarAccess.getTermAccess().getDivisionLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1_0_1__1"
    // InternalMyDsl.g:3290:1: rule__Term__Group_1_0_1__1 : rule__Term__Group_1_0_1__1__Impl ;
    public final void rule__Term__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3294:1: ( rule__Term__Group_1_0_1__1__Impl )
            // InternalMyDsl.g:3295:2: rule__Term__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_1__1"


    // $ANTLR start "rule__Term__Group_1_0_1__1__Impl"
    // InternalMyDsl.g:3301:1: rule__Term__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Term__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3305:1: ( ( '/' ) )
            // InternalMyDsl.g:3306:1: ( '/' )
            {
            // InternalMyDsl.g:3306:1: ( '/' )
            // InternalMyDsl.g:3307:2: '/'
            {
             before(grammarAccess.getTermAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getTermAccess().getSolidusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Factor__Group_2__0"
    // InternalMyDsl.g:3317:1: rule__Factor__Group_2__0 : rule__Factor__Group_2__0__Impl rule__Factor__Group_2__1 ;
    public final void rule__Factor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3321:1: ( rule__Factor__Group_2__0__Impl rule__Factor__Group_2__1 )
            // InternalMyDsl.g:3322:2: rule__Factor__Group_2__0__Impl rule__Factor__Group_2__1
            {
            pushFollow(FOLLOW_33);
            rule__Factor__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_2__0"


    // $ANTLR start "rule__Factor__Group_2__0__Impl"
    // InternalMyDsl.g:3329:1: rule__Factor__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Factor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3333:1: ( ( '(' ) )
            // InternalMyDsl.g:3334:1: ( '(' )
            {
            // InternalMyDsl.g:3334:1: ( '(' )
            // InternalMyDsl.g:3335:2: '('
            {
             before(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_2__0__Impl"


    // $ANTLR start "rule__Factor__Group_2__1"
    // InternalMyDsl.g:3344:1: rule__Factor__Group_2__1 : rule__Factor__Group_2__1__Impl rule__Factor__Group_2__2 ;
    public final void rule__Factor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3348:1: ( rule__Factor__Group_2__1__Impl rule__Factor__Group_2__2 )
            // InternalMyDsl.g:3349:2: rule__Factor__Group_2__1__Impl rule__Factor__Group_2__2
            {
            pushFollow(FOLLOW_29);
            rule__Factor__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_2__1"


    // $ANTLR start "rule__Factor__Group_2__1__Impl"
    // InternalMyDsl.g:3356:1: rule__Factor__Group_2__1__Impl : ( ( rule__Factor__ExpressionAssignment_2_1 ) ) ;
    public final void rule__Factor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3360:1: ( ( ( rule__Factor__ExpressionAssignment_2_1 ) ) )
            // InternalMyDsl.g:3361:1: ( ( rule__Factor__ExpressionAssignment_2_1 ) )
            {
            // InternalMyDsl.g:3361:1: ( ( rule__Factor__ExpressionAssignment_2_1 ) )
            // InternalMyDsl.g:3362:2: ( rule__Factor__ExpressionAssignment_2_1 )
            {
             before(grammarAccess.getFactorAccess().getExpressionAssignment_2_1()); 
            // InternalMyDsl.g:3363:2: ( rule__Factor__ExpressionAssignment_2_1 )
            // InternalMyDsl.g:3363:3: rule__Factor__ExpressionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__ExpressionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getExpressionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_2__1__Impl"


    // $ANTLR start "rule__Factor__Group_2__2"
    // InternalMyDsl.g:3371:1: rule__Factor__Group_2__2 : rule__Factor__Group_2__2__Impl ;
    public final void rule__Factor__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3375:1: ( rule__Factor__Group_2__2__Impl )
            // InternalMyDsl.g:3376:2: rule__Factor__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_2__2"


    // $ANTLR start "rule__Factor__Group_2__2__Impl"
    // InternalMyDsl.g:3382:1: rule__Factor__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Factor__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3386:1: ( ( ')' ) )
            // InternalMyDsl.g:3387:1: ( ')' )
            {
            // InternalMyDsl.g:3387:1: ( ')' )
            // InternalMyDsl.g:3388:2: ')'
            {
             before(grammarAccess.getFactorAccess().getRightParenthesisKeyword_2_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_2__2__Impl"


    // $ANTLR start "rule__Network__UnorderedGroup"
    // InternalMyDsl.g:3398:1: rule__Network__UnorderedGroup : rule__Network__UnorderedGroup__0 {...}?;
    public final void rule__Network__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getNetworkAccess().getUnorderedGroup());
        	
        try {
            // InternalMyDsl.g:3403:1: ( rule__Network__UnorderedGroup__0 {...}?)
            // InternalMyDsl.g:3404:2: rule__Network__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Network__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getNetworkAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__Network__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getNetworkAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getNetworkAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__UnorderedGroup"


    // $ANTLR start "rule__Network__UnorderedGroup__Impl"
    // InternalMyDsl.g:3412:1: rule__Network__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Network__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Network__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Network__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Network__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Network__Group_4__0 ) ) ) ) ) ;
    public final void rule__Network__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMyDsl.g:3417:1: ( ( ({...}? => ( ( ( rule__Network__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Network__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Network__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Network__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Network__Group_4__0 ) ) ) ) ) )
            // InternalMyDsl.g:3418:3: ( ({...}? => ( ( ( rule__Network__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Network__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Network__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Network__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Network__Group_4__0 ) ) ) ) )
            {
            // InternalMyDsl.g:3418:3: ( ({...}? => ( ( ( rule__Network__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Network__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Network__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Network__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Network__Group_4__0 ) ) ) ) )
            int alt23=5;
            int LA23_0 = input.LA(1);

            if ( LA23_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 1) ) {
                alt23=2;
            }
            else if ( LA23_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 2) ) {
                alt23=3;
            }
            else if ( LA23_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 3) ) {
                alt23=4;
            }
            else if ( LA23_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 4) ) {
                alt23=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:3419:3: ({...}? => ( ( ( rule__Network__Group_0__0 ) ) ) )
                    {
                    // InternalMyDsl.g:3419:3: ({...}? => ( ( ( rule__Network__Group_0__0 ) ) ) )
                    // InternalMyDsl.g:3420:4: {...}? => ( ( ( rule__Network__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Network__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalMyDsl.g:3420:101: ( ( ( rule__Network__Group_0__0 ) ) )
                    // InternalMyDsl.g:3421:5: ( ( rule__Network__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMyDsl.g:3427:5: ( ( rule__Network__Group_0__0 ) )
                    // InternalMyDsl.g:3428:6: ( rule__Network__Group_0__0 )
                    {
                     before(grammarAccess.getNetworkAccess().getGroup_0()); 
                    // InternalMyDsl.g:3429:6: ( rule__Network__Group_0__0 )
                    // InternalMyDsl.g:3429:7: rule__Network__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Network__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3434:3: ({...}? => ( ( ( rule__Network__Group_1__0 ) ) ) )
                    {
                    // InternalMyDsl.g:3434:3: ({...}? => ( ( ( rule__Network__Group_1__0 ) ) ) )
                    // InternalMyDsl.g:3435:4: {...}? => ( ( ( rule__Network__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Network__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalMyDsl.g:3435:101: ( ( ( rule__Network__Group_1__0 ) ) )
                    // InternalMyDsl.g:3436:5: ( ( rule__Network__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMyDsl.g:3442:5: ( ( rule__Network__Group_1__0 ) )
                    // InternalMyDsl.g:3443:6: ( rule__Network__Group_1__0 )
                    {
                     before(grammarAccess.getNetworkAccess().getGroup_1()); 
                    // InternalMyDsl.g:3444:6: ( rule__Network__Group_1__0 )
                    // InternalMyDsl.g:3444:7: rule__Network__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Network__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3449:3: ({...}? => ( ( ( rule__Network__Group_2__0 ) ) ) )
                    {
                    // InternalMyDsl.g:3449:3: ({...}? => ( ( ( rule__Network__Group_2__0 ) ) ) )
                    // InternalMyDsl.g:3450:4: {...}? => ( ( ( rule__Network__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Network__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalMyDsl.g:3450:101: ( ( ( rule__Network__Group_2__0 ) ) )
                    // InternalMyDsl.g:3451:5: ( ( rule__Network__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalMyDsl.g:3457:5: ( ( rule__Network__Group_2__0 ) )
                    // InternalMyDsl.g:3458:6: ( rule__Network__Group_2__0 )
                    {
                     before(grammarAccess.getNetworkAccess().getGroup_2()); 
                    // InternalMyDsl.g:3459:6: ( rule__Network__Group_2__0 )
                    // InternalMyDsl.g:3459:7: rule__Network__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Network__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkAccess().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3464:3: ({...}? => ( ( ( rule__Network__Group_3__0 ) ) ) )
                    {
                    // InternalMyDsl.g:3464:3: ({...}? => ( ( ( rule__Network__Group_3__0 ) ) ) )
                    // InternalMyDsl.g:3465:4: {...}? => ( ( ( rule__Network__Group_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Network__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalMyDsl.g:3465:101: ( ( ( rule__Network__Group_3__0 ) ) )
                    // InternalMyDsl.g:3466:5: ( ( rule__Network__Group_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup(), 3);
                    				

                    					selected = true;
                    				
                    // InternalMyDsl.g:3472:5: ( ( rule__Network__Group_3__0 ) )
                    // InternalMyDsl.g:3473:6: ( rule__Network__Group_3__0 )
                    {
                     before(grammarAccess.getNetworkAccess().getGroup_3()); 
                    // InternalMyDsl.g:3474:6: ( rule__Network__Group_3__0 )
                    // InternalMyDsl.g:3474:7: rule__Network__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Network__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkAccess().getGroup_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:3479:3: ({...}? => ( ( ( rule__Network__Group_4__0 ) ) ) )
                    {
                    // InternalMyDsl.g:3479:3: ({...}? => ( ( ( rule__Network__Group_4__0 ) ) ) )
                    // InternalMyDsl.g:3480:4: {...}? => ( ( ( rule__Network__Group_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Network__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 4)");
                    }
                    // InternalMyDsl.g:3480:101: ( ( ( rule__Network__Group_4__0 ) ) )
                    // InternalMyDsl.g:3481:5: ( ( rule__Network__Group_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup(), 4);
                    				

                    					selected = true;
                    				
                    // InternalMyDsl.g:3487:5: ( ( rule__Network__Group_4__0 ) )
                    // InternalMyDsl.g:3488:6: ( rule__Network__Group_4__0 )
                    {
                     before(grammarAccess.getNetworkAccess().getGroup_4()); 
                    // InternalMyDsl.g:3489:6: ( rule__Network__Group_4__0 )
                    // InternalMyDsl.g:3489:7: rule__Network__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Network__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkAccess().getGroup_4()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__UnorderedGroup__Impl"


    // $ANTLR start "rule__Network__UnorderedGroup__0"
    // InternalMyDsl.g:3502:1: rule__Network__UnorderedGroup__0 : rule__Network__UnorderedGroup__Impl ( rule__Network__UnorderedGroup__1 )? ;
    public final void rule__Network__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3506:1: ( rule__Network__UnorderedGroup__Impl ( rule__Network__UnorderedGroup__1 )? )
            // InternalMyDsl.g:3507:2: rule__Network__UnorderedGroup__Impl ( rule__Network__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_41);
            rule__Network__UnorderedGroup__Impl();

            state._fsp--;

            // InternalMyDsl.g:3508:2: ( rule__Network__UnorderedGroup__1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 1) ) {
                alt24=1;
            }
            else if ( LA24_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 2) ) {
                alt24=1;
            }
            else if ( LA24_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 3) ) {
                alt24=1;
            }
            else if ( LA24_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 4) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:3508:2: rule__Network__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Network__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__UnorderedGroup__0"


    // $ANTLR start "rule__Network__UnorderedGroup__1"
    // InternalMyDsl.g:3514:1: rule__Network__UnorderedGroup__1 : rule__Network__UnorderedGroup__Impl ( rule__Network__UnorderedGroup__2 )? ;
    public final void rule__Network__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3518:1: ( rule__Network__UnorderedGroup__Impl ( rule__Network__UnorderedGroup__2 )? )
            // InternalMyDsl.g:3519:2: rule__Network__UnorderedGroup__Impl ( rule__Network__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_41);
            rule__Network__UnorderedGroup__Impl();

            state._fsp--;

            // InternalMyDsl.g:3520:2: ( rule__Network__UnorderedGroup__2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( LA25_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 1) ) {
                alt25=1;
            }
            else if ( LA25_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 2) ) {
                alt25=1;
            }
            else if ( LA25_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 3) ) {
                alt25=1;
            }
            else if ( LA25_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 4) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:3520:2: rule__Network__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Network__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__UnorderedGroup__1"


    // $ANTLR start "rule__Network__UnorderedGroup__2"
    // InternalMyDsl.g:3526:1: rule__Network__UnorderedGroup__2 : rule__Network__UnorderedGroup__Impl ( rule__Network__UnorderedGroup__3 )? ;
    public final void rule__Network__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3530:1: ( rule__Network__UnorderedGroup__Impl ( rule__Network__UnorderedGroup__3 )? )
            // InternalMyDsl.g:3531:2: rule__Network__UnorderedGroup__Impl ( rule__Network__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_41);
            rule__Network__UnorderedGroup__Impl();

            state._fsp--;

            // InternalMyDsl.g:3532:2: ( rule__Network__UnorderedGroup__3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( LA26_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 1) ) {
                alt26=1;
            }
            else if ( LA26_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 2) ) {
                alt26=1;
            }
            else if ( LA26_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 3) ) {
                alt26=1;
            }
            else if ( LA26_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 4) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:3532:2: rule__Network__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Network__UnorderedGroup__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__UnorderedGroup__2"


    // $ANTLR start "rule__Network__UnorderedGroup__3"
    // InternalMyDsl.g:3538:1: rule__Network__UnorderedGroup__3 : rule__Network__UnorderedGroup__Impl ( rule__Network__UnorderedGroup__4 )? ;
    public final void rule__Network__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3542:1: ( rule__Network__UnorderedGroup__Impl ( rule__Network__UnorderedGroup__4 )? )
            // InternalMyDsl.g:3543:2: rule__Network__UnorderedGroup__Impl ( rule__Network__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_41);
            rule__Network__UnorderedGroup__Impl();

            state._fsp--;

            // InternalMyDsl.g:3544:2: ( rule__Network__UnorderedGroup__4 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 1) ) {
                alt27=1;
            }
            else if ( LA27_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 2) ) {
                alt27=1;
            }
            else if ( LA27_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 3) ) {
                alt27=1;
            }
            else if ( LA27_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup(), 4) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:3544:2: rule__Network__UnorderedGroup__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Network__UnorderedGroup__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__UnorderedGroup__3"


    // $ANTLR start "rule__Network__UnorderedGroup__4"
    // InternalMyDsl.g:3550:1: rule__Network__UnorderedGroup__4 : rule__Network__UnorderedGroup__Impl ;
    public final void rule__Network__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3554:1: ( rule__Network__UnorderedGroup__Impl )
            // InternalMyDsl.g:3555:2: rule__Network__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Network__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__UnorderedGroup__4"


    // $ANTLR start "rule__Layer__UnorderedGroup"
    // InternalMyDsl.g:3562:1: rule__Layer__UnorderedGroup : rule__Layer__UnorderedGroup__0 {...}?;
    public final void rule__Layer__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getLayerAccess().getUnorderedGroup());
        	
        try {
            // InternalMyDsl.g:3567:1: ( rule__Layer__UnorderedGroup__0 {...}?)
            // InternalMyDsl.g:3568:2: rule__Layer__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Layer__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__Layer__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getLayerAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__UnorderedGroup"


    // $ANTLR start "rule__Layer__UnorderedGroup__Impl"
    // InternalMyDsl.g:3576:1: rule__Layer__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Layer__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Layer__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Layer__Group_2__0 ) ) ) ) ) ;
    public final void rule__Layer__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMyDsl.g:3581:1: ( ( ({...}? => ( ( ( rule__Layer__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Layer__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Layer__Group_2__0 ) ) ) ) ) )
            // InternalMyDsl.g:3582:3: ( ({...}? => ( ( ( rule__Layer__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Layer__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Layer__Group_2__0 ) ) ) ) )
            {
            // InternalMyDsl.g:3582:3: ( ({...}? => ( ( ( rule__Layer__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Layer__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Layer__Group_2__0 ) ) ) ) )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( LA28_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 1) ) {
                alt28=2;
            }
            else if ( ( LA28_0 == 40 || LA28_0 == 45 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 2) ) {
                alt28=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:3583:3: ({...}? => ( ( ( rule__Layer__Group_0__0 ) ) ) )
                    {
                    // InternalMyDsl.g:3583:3: ({...}? => ( ( ( rule__Layer__Group_0__0 ) ) ) )
                    // InternalMyDsl.g:3584:4: {...}? => ( ( ( rule__Layer__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Layer__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalMyDsl.g:3584:99: ( ( ( rule__Layer__Group_0__0 ) ) )
                    // InternalMyDsl.g:3585:5: ( ( rule__Layer__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLayerAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMyDsl.g:3591:5: ( ( rule__Layer__Group_0__0 ) )
                    // InternalMyDsl.g:3592:6: ( rule__Layer__Group_0__0 )
                    {
                     before(grammarAccess.getLayerAccess().getGroup_0()); 
                    // InternalMyDsl.g:3593:6: ( rule__Layer__Group_0__0 )
                    // InternalMyDsl.g:3593:7: rule__Layer__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Layer__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayerAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3598:3: ({...}? => ( ( ( rule__Layer__Group_1__0 ) ) ) )
                    {
                    // InternalMyDsl.g:3598:3: ({...}? => ( ( ( rule__Layer__Group_1__0 ) ) ) )
                    // InternalMyDsl.g:3599:4: {...}? => ( ( ( rule__Layer__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Layer__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalMyDsl.g:3599:99: ( ( ( rule__Layer__Group_1__0 ) ) )
                    // InternalMyDsl.g:3600:5: ( ( rule__Layer__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLayerAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMyDsl.g:3606:5: ( ( rule__Layer__Group_1__0 ) )
                    // InternalMyDsl.g:3607:6: ( rule__Layer__Group_1__0 )
                    {
                     before(grammarAccess.getLayerAccess().getGroup_1()); 
                    // InternalMyDsl.g:3608:6: ( rule__Layer__Group_1__0 )
                    // InternalMyDsl.g:3608:7: rule__Layer__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Layer__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayerAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3613:3: ({...}? => ( ( ( rule__Layer__Group_2__0 ) ) ) )
                    {
                    // InternalMyDsl.g:3613:3: ({...}? => ( ( ( rule__Layer__Group_2__0 ) ) ) )
                    // InternalMyDsl.g:3614:4: {...}? => ( ( ( rule__Layer__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Layer__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalMyDsl.g:3614:99: ( ( ( rule__Layer__Group_2__0 ) ) )
                    // InternalMyDsl.g:3615:5: ( ( rule__Layer__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLayerAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalMyDsl.g:3621:5: ( ( rule__Layer__Group_2__0 ) )
                    // InternalMyDsl.g:3622:6: ( rule__Layer__Group_2__0 )
                    {
                     before(grammarAccess.getLayerAccess().getGroup_2()); 
                    // InternalMyDsl.g:3623:6: ( rule__Layer__Group_2__0 )
                    // InternalMyDsl.g:3623:7: rule__Layer__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Layer__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayerAccess().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLayerAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__UnorderedGroup__Impl"


    // $ANTLR start "rule__Layer__UnorderedGroup__0"
    // InternalMyDsl.g:3636:1: rule__Layer__UnorderedGroup__0 : rule__Layer__UnorderedGroup__Impl ( rule__Layer__UnorderedGroup__1 )? ;
    public final void rule__Layer__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3640:1: ( rule__Layer__UnorderedGroup__Impl ( rule__Layer__UnorderedGroup__1 )? )
            // InternalMyDsl.g:3641:2: rule__Layer__UnorderedGroup__Impl ( rule__Layer__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_12);
            rule__Layer__UnorderedGroup__Impl();

            state._fsp--;

            // InternalMyDsl.g:3642:2: ( rule__Layer__UnorderedGroup__1 )?
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:3642:2: rule__Layer__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Layer__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__UnorderedGroup__0"


    // $ANTLR start "rule__Layer__UnorderedGroup__1"
    // InternalMyDsl.g:3648:1: rule__Layer__UnorderedGroup__1 : rule__Layer__UnorderedGroup__Impl ( rule__Layer__UnorderedGroup__2 )? ;
    public final void rule__Layer__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3652:1: ( rule__Layer__UnorderedGroup__Impl ( rule__Layer__UnorderedGroup__2 )? )
            // InternalMyDsl.g:3653:2: rule__Layer__UnorderedGroup__Impl ( rule__Layer__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_12);
            rule__Layer__UnorderedGroup__Impl();

            state._fsp--;

            // InternalMyDsl.g:3654:2: ( rule__Layer__UnorderedGroup__2 )?
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:3654:2: rule__Layer__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Layer__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__UnorderedGroup__1"


    // $ANTLR start "rule__Layer__UnorderedGroup__2"
    // InternalMyDsl.g:3660:1: rule__Layer__UnorderedGroup__2 : rule__Layer__UnorderedGroup__Impl ;
    public final void rule__Layer__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3664:1: ( rule__Layer__UnorderedGroup__Impl )
            // InternalMyDsl.g:3665:2: rule__Layer__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__UnorderedGroup__2"


    // $ANTLR start "rule__Model__NetworkAssignment"
    // InternalMyDsl.g:3672:1: rule__Model__NetworkAssignment : ( ruleNetwork ) ;
    public final void rule__Model__NetworkAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3676:1: ( ( ruleNetwork ) )
            // InternalMyDsl.g:3677:2: ( ruleNetwork )
            {
            // InternalMyDsl.g:3677:2: ( ruleNetwork )
            // InternalMyDsl.g:3678:3: ruleNetwork
            {
             before(grammarAccess.getModelAccess().getNetworkNetworkParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNetwork();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNetworkNetworkParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NetworkAssignment"


    // $ANTLR start "rule__Network__NameAssignment_0_1"
    // InternalMyDsl.g:3687:1: rule__Network__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Network__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3691:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3692:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3692:2: ( RULE_ID )
            // InternalMyDsl.g:3693:3: RULE_ID
            {
             before(grammarAccess.getNetworkAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__NameAssignment_0_1"


    // $ANTLR start "rule__Network__EpochsAssignment_1_2"
    // InternalMyDsl.g:3702:1: rule__Network__EpochsAssignment_1_2 : ( RULE_INTEGER ) ;
    public final void rule__Network__EpochsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3706:1: ( ( RULE_INTEGER ) )
            // InternalMyDsl.g:3707:2: ( RULE_INTEGER )
            {
            // InternalMyDsl.g:3707:2: ( RULE_INTEGER )
            // InternalMyDsl.g:3708:3: RULE_INTEGER
            {
             before(grammarAccess.getNetworkAccess().getEpochsINTEGERTerminalRuleCall_1_2_0()); 
            match(input,RULE_INTEGER,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getEpochsINTEGERTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__EpochsAssignment_1_2"


    // $ANTLR start "rule__Network__SeedAssignment_2_2"
    // InternalMyDsl.g:3717:1: rule__Network__SeedAssignment_2_2 : ( RULE_ZINTEGER ) ;
    public final void rule__Network__SeedAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3721:1: ( ( RULE_ZINTEGER ) )
            // InternalMyDsl.g:3722:2: ( RULE_ZINTEGER )
            {
            // InternalMyDsl.g:3722:2: ( RULE_ZINTEGER )
            // InternalMyDsl.g:3723:3: RULE_ZINTEGER
            {
             before(grammarAccess.getNetworkAccess().getSeedZINTEGERTerminalRuleCall_2_2_0()); 
            match(input,RULE_ZINTEGER,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getSeedZINTEGERTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__SeedAssignment_2_2"


    // $ANTLR start "rule__Network__UpdaterTypeAssignment_3_2"
    // InternalMyDsl.g:3732:1: rule__Network__UpdaterTypeAssignment_3_2 : ( ruleUpdaterType ) ;
    public final void rule__Network__UpdaterTypeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3736:1: ( ( ruleUpdaterType ) )
            // InternalMyDsl.g:3737:2: ( ruleUpdaterType )
            {
            // InternalMyDsl.g:3737:2: ( ruleUpdaterType )
            // InternalMyDsl.g:3738:3: ruleUpdaterType
            {
             before(grammarAccess.getNetworkAccess().getUpdaterTypeUpdaterTypeEnumRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUpdaterType();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getUpdaterTypeUpdaterTypeEnumRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__UpdaterTypeAssignment_3_2"


    // $ANTLR start "rule__Network__LearningRateAssignment_4_2"
    // InternalMyDsl.g:3747:1: rule__Network__LearningRateAssignment_4_2 : ( ruleVariableAssignment ) ;
    public final void rule__Network__LearningRateAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3751:1: ( ( ruleVariableAssignment ) )
            // InternalMyDsl.g:3752:2: ( ruleVariableAssignment )
            {
            // InternalMyDsl.g:3752:2: ( ruleVariableAssignment )
            // InternalMyDsl.g:3753:3: ruleVariableAssignment
            {
             before(grammarAccess.getNetworkAccess().getLearningRateVariableAssignmentParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableAssignment();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getLearningRateVariableAssignmentParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__LearningRateAssignment_4_2"


    // $ANTLR start "rule__Network__LayersAssignment_4_3"
    // InternalMyDsl.g:3762:1: rule__Network__LayersAssignment_4_3 : ( ruleLayer ) ;
    public final void rule__Network__LayersAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3766:1: ( ( ruleLayer ) )
            // InternalMyDsl.g:3767:2: ( ruleLayer )
            {
            // InternalMyDsl.g:3767:2: ( ruleLayer )
            // InternalMyDsl.g:3768:3: ruleLayer
            {
             before(grammarAccess.getNetworkAccess().getLayersLayerParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getLayersLayerParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__LayersAssignment_4_3"


    // $ANTLR start "rule__Layer__LayerDeclAssignment_0_1"
    // InternalMyDsl.g:3777:1: rule__Layer__LayerDeclAssignment_0_1 : ( ruleLayerDeclaration ) ;
    public final void rule__Layer__LayerDeclAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3781:1: ( ( ruleLayerDeclaration ) )
            // InternalMyDsl.g:3782:2: ( ruleLayerDeclaration )
            {
            // InternalMyDsl.g:3782:2: ( ruleLayerDeclaration )
            // InternalMyDsl.g:3783:3: ruleLayerDeclaration
            {
             before(grammarAccess.getLayerAccess().getLayerDeclLayerDeclarationParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLayerDeclaration();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getLayerDeclLayerDeclarationParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__LayerDeclAssignment_0_1"


    // $ANTLR start "rule__Layer__LayerTypeAssignment_0_5"
    // InternalMyDsl.g:3792:1: rule__Layer__LayerTypeAssignment_0_5 : ( ruleLayerType ) ;
    public final void rule__Layer__LayerTypeAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3796:1: ( ( ruleLayerType ) )
            // InternalMyDsl.g:3797:2: ( ruleLayerType )
            {
            // InternalMyDsl.g:3797:2: ( ruleLayerType )
            // InternalMyDsl.g:3798:3: ruleLayerType
            {
             before(grammarAccess.getLayerAccess().getLayerTypeLayerTypeEnumRuleCall_0_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLayerType();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getLayerTypeLayerTypeEnumRuleCall_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__LayerTypeAssignment_0_5"


    // $ANTLR start "rule__Layer__ActivTypeAssignment_0_6_2"
    // InternalMyDsl.g:3807:1: rule__Layer__ActivTypeAssignment_0_6_2 : ( ruleActivationFunctionType ) ;
    public final void rule__Layer__ActivTypeAssignment_0_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3811:1: ( ( ruleActivationFunctionType ) )
            // InternalMyDsl.g:3812:2: ( ruleActivationFunctionType )
            {
            // InternalMyDsl.g:3812:2: ( ruleActivationFunctionType )
            // InternalMyDsl.g:3813:3: ruleActivationFunctionType
            {
             before(grammarAccess.getLayerAccess().getActivTypeActivationFunctionTypeEnumRuleCall_0_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActivationFunctionType();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getActivTypeActivationFunctionTypeEnumRuleCall_0_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__ActivTypeAssignment_0_6_2"


    // $ANTLR start "rule__Layer__WeightInitAssignment_1_2"
    // InternalMyDsl.g:3822:1: rule__Layer__WeightInitAssignment_1_2 : ( ruleWeightInitType ) ;
    public final void rule__Layer__WeightInitAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3826:1: ( ( ruleWeightInitType ) )
            // InternalMyDsl.g:3827:2: ( ruleWeightInitType )
            {
            // InternalMyDsl.g:3827:2: ( ruleWeightInitType )
            // InternalMyDsl.g:3828:3: ruleWeightInitType
            {
             before(grammarAccess.getLayerAccess().getWeightInitWeightInitTypeEnumRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWeightInitType();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getWeightInitWeightInitTypeEnumRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__WeightInitAssignment_1_2"


    // $ANTLR start "rule__Layer__BiasInitAssignment_2_0_2"
    // InternalMyDsl.g:3837:1: rule__Layer__BiasInitAssignment_2_0_2 : ( RULE_REAL ) ;
    public final void rule__Layer__BiasInitAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3841:1: ( ( RULE_REAL ) )
            // InternalMyDsl.g:3842:2: ( RULE_REAL )
            {
            // InternalMyDsl.g:3842:2: ( RULE_REAL )
            // InternalMyDsl.g:3843:3: RULE_REAL
            {
             before(grammarAccess.getLayerAccess().getBiasInitREALTerminalRuleCall_2_0_2_0()); 
            match(input,RULE_REAL,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getBiasInitREALTerminalRuleCall_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__BiasInitAssignment_2_0_2"


    // $ANTLR start "rule__LayerDeclaration__LayerTupleAssignment_0"
    // InternalMyDsl.g:3852:1: rule__LayerDeclaration__LayerTupleAssignment_0 : ( ruleLayerTuple ) ;
    public final void rule__LayerDeclaration__LayerTupleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3856:1: ( ( ruleLayerTuple ) )
            // InternalMyDsl.g:3857:2: ( ruleLayerTuple )
            {
            // InternalMyDsl.g:3857:2: ( ruleLayerTuple )
            // InternalMyDsl.g:3858:3: ruleLayerTuple
            {
             before(grammarAccess.getLayerDeclarationAccess().getLayerTupleLayerTupleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLayerTuple();

            state._fsp--;

             after(grammarAccess.getLayerDeclarationAccess().getLayerTupleLayerTupleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__LayerTupleAssignment_0"


    // $ANTLR start "rule__LayerDeclaration__LayerTupleAssignment_1_1"
    // InternalMyDsl.g:3867:1: rule__LayerDeclaration__LayerTupleAssignment_1_1 : ( ruleLayerTuple ) ;
    public final void rule__LayerDeclaration__LayerTupleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3871:1: ( ( ruleLayerTuple ) )
            // InternalMyDsl.g:3872:2: ( ruleLayerTuple )
            {
            // InternalMyDsl.g:3872:2: ( ruleLayerTuple )
            // InternalMyDsl.g:3873:3: ruleLayerTuple
            {
             before(grammarAccess.getLayerDeclarationAccess().getLayerTupleLayerTupleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLayerTuple();

            state._fsp--;

             after(grammarAccess.getLayerDeclarationAccess().getLayerTupleLayerTupleParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__LayerTupleAssignment_1_1"


    // $ANTLR start "rule__LayerDeclaration__LayerTupleAssignment_1_2_1"
    // InternalMyDsl.g:3882:1: rule__LayerDeclaration__LayerTupleAssignment_1_2_1 : ( ruleLayerTuple ) ;
    public final void rule__LayerDeclaration__LayerTupleAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3886:1: ( ( ruleLayerTuple ) )
            // InternalMyDsl.g:3887:2: ( ruleLayerTuple )
            {
            // InternalMyDsl.g:3887:2: ( ruleLayerTuple )
            // InternalMyDsl.g:3888:3: ruleLayerTuple
            {
             before(grammarAccess.getLayerDeclarationAccess().getLayerTupleLayerTupleParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLayerTuple();

            state._fsp--;

             after(grammarAccess.getLayerDeclarationAccess().getLayerTupleLayerTupleParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__LayerTupleAssignment_1_2_1"


    // $ANTLR start "rule__LayerDeclaration__LayerMultiplierAssignment_2_1"
    // InternalMyDsl.g:3897:1: rule__LayerDeclaration__LayerMultiplierAssignment_2_1 : ( RULE_INTEGER ) ;
    public final void rule__LayerDeclaration__LayerMultiplierAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3901:1: ( ( RULE_INTEGER ) )
            // InternalMyDsl.g:3902:2: ( RULE_INTEGER )
            {
            // InternalMyDsl.g:3902:2: ( RULE_INTEGER )
            // InternalMyDsl.g:3903:3: RULE_INTEGER
            {
             before(grammarAccess.getLayerDeclarationAccess().getLayerMultiplierINTEGERTerminalRuleCall_2_1_0()); 
            match(input,RULE_INTEGER,FOLLOW_2); 
             after(grammarAccess.getLayerDeclarationAccess().getLayerMultiplierINTEGERTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__LayerMultiplierAssignment_2_1"


    // $ANTLR start "rule__LayerDeclaration__LayerTupleAssignment_2_4"
    // InternalMyDsl.g:3912:1: rule__LayerDeclaration__LayerTupleAssignment_2_4 : ( ruleLayerTuple ) ;
    public final void rule__LayerDeclaration__LayerTupleAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3916:1: ( ( ruleLayerTuple ) )
            // InternalMyDsl.g:3917:2: ( ruleLayerTuple )
            {
            // InternalMyDsl.g:3917:2: ( ruleLayerTuple )
            // InternalMyDsl.g:3918:3: ruleLayerTuple
            {
             before(grammarAccess.getLayerDeclarationAccess().getLayerTupleLayerTupleParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLayerTuple();

            state._fsp--;

             after(grammarAccess.getLayerDeclarationAccess().getLayerTupleLayerTupleParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerDeclaration__LayerTupleAssignment_2_4"


    // $ANTLR start "rule__LayerTuple__RefAssignment_0_1_2"
    // InternalMyDsl.g:3927:1: rule__LayerTuple__RefAssignment_0_1_2 : ( RULE_ID ) ;
    public final void rule__LayerTuple__RefAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3931:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3932:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3932:2: ( RULE_ID )
            // InternalMyDsl.g:3933:3: RULE_ID
            {
             before(grammarAccess.getLayerTupleAccess().getRefIDTerminalRuleCall_0_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLayerTupleAccess().getRefIDTerminalRuleCall_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__RefAssignment_0_1_2"


    // $ANTLR start "rule__LayerTuple__InAssignment_0_2_2"
    // InternalMyDsl.g:3942:1: rule__LayerTuple__InAssignment_0_2_2 : ( ruleLayerRef ) ;
    public final void rule__LayerTuple__InAssignment_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3946:1: ( ( ruleLayerRef ) )
            // InternalMyDsl.g:3947:2: ( ruleLayerRef )
            {
            // InternalMyDsl.g:3947:2: ( ruleLayerRef )
            // InternalMyDsl.g:3948:3: ruleLayerRef
            {
             before(grammarAccess.getLayerTupleAccess().getInLayerRefParserRuleCall_0_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLayerRef();

            state._fsp--;

             after(grammarAccess.getLayerTupleAccess().getInLayerRefParserRuleCall_0_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__InAssignment_0_2_2"


    // $ANTLR start "rule__LayerTuple__OutAssignment_0_5"
    // InternalMyDsl.g:3957:1: rule__LayerTuple__OutAssignment_0_5 : ( ruleLayerRef ) ;
    public final void rule__LayerTuple__OutAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3961:1: ( ( ruleLayerRef ) )
            // InternalMyDsl.g:3962:2: ( ruleLayerRef )
            {
            // InternalMyDsl.g:3962:2: ( ruleLayerRef )
            // InternalMyDsl.g:3963:3: ruleLayerRef
            {
             before(grammarAccess.getLayerTupleAccess().getOutLayerRefParserRuleCall_0_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLayerRef();

            state._fsp--;

             after(grammarAccess.getLayerTupleAccess().getOutLayerRefParserRuleCall_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__OutAssignment_0_5"


    // $ANTLR start "rule__LayerTuple__InAssignment_1_1"
    // InternalMyDsl.g:3972:1: rule__LayerTuple__InAssignment_1_1 : ( ruleLayerRef ) ;
    public final void rule__LayerTuple__InAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3976:1: ( ( ruleLayerRef ) )
            // InternalMyDsl.g:3977:2: ( ruleLayerRef )
            {
            // InternalMyDsl.g:3977:2: ( ruleLayerRef )
            // InternalMyDsl.g:3978:3: ruleLayerRef
            {
             before(grammarAccess.getLayerTupleAccess().getInLayerRefParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLayerRef();

            state._fsp--;

             after(grammarAccess.getLayerTupleAccess().getInLayerRefParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__InAssignment_1_1"


    // $ANTLR start "rule__LayerTuple__OutAssignment_1_3"
    // InternalMyDsl.g:3987:1: rule__LayerTuple__OutAssignment_1_3 : ( ruleLayerRef ) ;
    public final void rule__LayerTuple__OutAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3991:1: ( ( ruleLayerRef ) )
            // InternalMyDsl.g:3992:2: ( ruleLayerRef )
            {
            // InternalMyDsl.g:3992:2: ( ruleLayerRef )
            // InternalMyDsl.g:3993:3: ruleLayerRef
            {
             before(grammarAccess.getLayerTupleAccess().getOutLayerRefParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLayerRef();

            state._fsp--;

             after(grammarAccess.getLayerTupleAccess().getOutLayerRefParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__OutAssignment_1_3"


    // $ANTLR start "rule__LayerTuple__OutAssignment_2_1"
    // InternalMyDsl.g:4002:1: rule__LayerTuple__OutAssignment_2_1 : ( ruleLayerRef ) ;
    public final void rule__LayerTuple__OutAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4006:1: ( ( ruleLayerRef ) )
            // InternalMyDsl.g:4007:2: ( ruleLayerRef )
            {
            // InternalMyDsl.g:4007:2: ( ruleLayerRef )
            // InternalMyDsl.g:4008:3: ruleLayerRef
            {
             before(grammarAccess.getLayerTupleAccess().getOutLayerRefParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLayerRef();

            state._fsp--;

             after(grammarAccess.getLayerTupleAccess().getOutLayerRefParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerTuple__OutAssignment_2_1"


    // $ANTLR start "rule__LayerRef__ValueAssignment_0"
    // InternalMyDsl.g:4017:1: rule__LayerRef__ValueAssignment_0 : ( RULE_INTEGER ) ;
    public final void rule__LayerRef__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4021:1: ( ( RULE_INTEGER ) )
            // InternalMyDsl.g:4022:2: ( RULE_INTEGER )
            {
            // InternalMyDsl.g:4022:2: ( RULE_INTEGER )
            // InternalMyDsl.g:4023:3: RULE_INTEGER
            {
             before(grammarAccess.getLayerRefAccess().getValueINTEGERTerminalRuleCall_0_0()); 
            match(input,RULE_INTEGER,FOLLOW_2); 
             after(grammarAccess.getLayerRefAccess().getValueINTEGERTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerRef__ValueAssignment_0"


    // $ANTLR start "rule__LayerRef__RefAssignment_1_1"
    // InternalMyDsl.g:4032:1: rule__LayerRef__RefAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__LayerRef__RefAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4036:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4037:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4037:2: ( RULE_ID )
            // InternalMyDsl.g:4038:3: RULE_ID
            {
             before(grammarAccess.getLayerRefAccess().getRefIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLayerRefAccess().getRefIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerRef__RefAssignment_1_1"


    // $ANTLR start "rule__VariableAssignment__ValueAssignment_0"
    // InternalMyDsl.g:4047:1: rule__VariableAssignment__ValueAssignment_0 : ( RULE_INTEGER ) ;
    public final void rule__VariableAssignment__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4051:1: ( ( RULE_INTEGER ) )
            // InternalMyDsl.g:4052:2: ( RULE_INTEGER )
            {
            // InternalMyDsl.g:4052:2: ( RULE_INTEGER )
            // InternalMyDsl.g:4053:3: RULE_INTEGER
            {
             before(grammarAccess.getVariableAssignmentAccess().getValueINTEGERTerminalRuleCall_0_0()); 
            match(input,RULE_INTEGER,FOLLOW_2); 
             after(grammarAccess.getVariableAssignmentAccess().getValueINTEGERTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__ValueAssignment_0"


    // $ANTLR start "rule__Function__NameAssignment_0"
    // InternalMyDsl.g:4062:1: rule__Function__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4066:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4067:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4067:2: ( RULE_ID )
            // InternalMyDsl.g:4068:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_0"


    // $ANTLR start "rule__Function__ArgsAssignment_1_1"
    // InternalMyDsl.g:4077:1: rule__Function__ArgsAssignment_1_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Function__ArgsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4081:1: ( ( ruleDeclaredParameter ) )
            // InternalMyDsl.g:4082:2: ( ruleDeclaredParameter )
            {
            // InternalMyDsl.g:4082:2: ( ruleDeclaredParameter )
            // InternalMyDsl.g:4083:3: ruleDeclaredParameter
            {
             before(grammarAccess.getFunctionAccess().getArgsDeclaredParameterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaredParameter();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getArgsDeclaredParameterParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ArgsAssignment_1_1"


    // $ANTLR start "rule__Function__ArgsAssignment_1_2_1"
    // InternalMyDsl.g:4092:1: rule__Function__ArgsAssignment_1_2_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Function__ArgsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4096:1: ( ( ruleDeclaredParameter ) )
            // InternalMyDsl.g:4097:2: ( ruleDeclaredParameter )
            {
            // InternalMyDsl.g:4097:2: ( ruleDeclaredParameter )
            // InternalMyDsl.g:4098:3: ruleDeclaredParameter
            {
             before(grammarAccess.getFunctionAccess().getArgsDeclaredParameterParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaredParameter();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getArgsDeclaredParameterParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ArgsAssignment_1_2_1"


    // $ANTLR start "rule__Function__ExprAssignment_3"
    // InternalMyDsl.g:4107:1: rule__Function__ExprAssignment_3 : ( ruleExpression ) ;
    public final void rule__Function__ExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4111:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:4112:2: ( ruleExpression )
            {
            // InternalMyDsl.g:4112:2: ( ruleExpression )
            // InternalMyDsl.g:4113:3: ruleExpression
            {
             before(grammarAccess.getFunctionAccess().getExprExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getExprExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ExprAssignment_3"


    // $ANTLR start "rule__DeclaredParameter__NameAssignment"
    // InternalMyDsl.g:4122:1: rule__DeclaredParameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__DeclaredParameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4126:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4127:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4127:2: ( RULE_ID )
            // InternalMyDsl.g:4128:3: RULE_ID
            {
             before(grammarAccess.getDeclaredParameterAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeclaredParameterAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredParameter__NameAssignment"


    // $ANTLR start "rule__Expression__RightAssignment_1_1"
    // InternalMyDsl.g:4137:1: rule__Expression__RightAssignment_1_1 : ( ruleTerm ) ;
    public final void rule__Expression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4141:1: ( ( ruleTerm ) )
            // InternalMyDsl.g:4142:2: ( ruleTerm )
            {
            // InternalMyDsl.g:4142:2: ( ruleTerm )
            // InternalMyDsl.g:4143:3: ruleTerm
            {
             before(grammarAccess.getExpressionAccess().getRightTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightTermParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__RightAssignment_1_1"


    // $ANTLR start "rule__Term__RightAssignment_1_1"
    // InternalMyDsl.g:4152:1: rule__Term__RightAssignment_1_1 : ( ruleFactor ) ;
    public final void rule__Term__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4156:1: ( ( ruleFactor ) )
            // InternalMyDsl.g:4157:2: ( ruleFactor )
            {
            // InternalMyDsl.g:4157:2: ( ruleFactor )
            // InternalMyDsl.g:4158:3: ruleFactor
            {
             before(grammarAccess.getTermAccess().getRightFactorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getTermAccess().getRightFactorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__RightAssignment_1_1"


    // $ANTLR start "rule__Factor__NumberAssignment_0"
    // InternalMyDsl.g:4167:1: rule__Factor__NumberAssignment_0 : ( RULE_REAL ) ;
    public final void rule__Factor__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4171:1: ( ( RULE_REAL ) )
            // InternalMyDsl.g:4172:2: ( RULE_REAL )
            {
            // InternalMyDsl.g:4172:2: ( RULE_REAL )
            // InternalMyDsl.g:4173:3: RULE_REAL
            {
             before(grammarAccess.getFactorAccess().getNumberREALTerminalRuleCall_0_0()); 
            match(input,RULE_REAL,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getNumberREALTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__NumberAssignment_0"


    // $ANTLR start "rule__Factor__VariableAssignment_1"
    // InternalMyDsl.g:4182:1: rule__Factor__VariableAssignment_1 : ( RULE_ID ) ;
    public final void rule__Factor__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4186:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4187:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4187:2: ( RULE_ID )
            // InternalMyDsl.g:4188:3: RULE_ID
            {
             before(grammarAccess.getFactorAccess().getVariableIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getVariableIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__VariableAssignment_1"


    // $ANTLR start "rule__Factor__ExpressionAssignment_2_1"
    // InternalMyDsl.g:4197:1: rule__Factor__ExpressionAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Factor__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4201:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:4202:2: ( ruleExpression )
            {
            // InternalMyDsl.g:4202:2: ( ruleExpression )
            // InternalMyDsl.g:4203:3: ruleExpression
            {
             before(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__ExpressionAssignment_2_1"

    // Delegated rules


    protected DFA29 dfa29 = new DFA29(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String dfa_1s = "\u009e\uffff";
    static final String dfa_2s = "\1\5\u009d\uffff";
    static final String dfa_3s = "\1\50\1\43\1\5\1\4\1\0\1\uffff\2\7\1\61\1\7\1\37\1\11\1\uffff\4\63\1\6\1\7\1\43\1\6\2\7\1\50\3\0\1\50\1\6\2\7\1\70\1\64\1\6\1\52\1\70\4\63\1\6\1\7\1\57\1\6\1\56\1\0\2\62\1\6\1\64\1\6\1\63\1\43\1\70\1\5\1\43\1\6\2\7\1\70\1\64\1\6\1\61\1\43\1\70\1\61\1\70\1\43\1\70\1\64\1\21\2\62\1\6\1\64\1\6\1\63\1\57\1\70\2\7\1\57\2\7\1\62\1\64\5\0\1\70\1\57\1\70\1\64\4\63\1\6\1\7\1\57\1\6\4\63\1\6\1\7\1\57\1\6\1\62\1\64\1\6\2\7\1\70\1\64\1\6\1\70\1\6\2\7\1\70\1\64\1\6\1\43\1\70\2\62\1\6\1\64\1\6\1\63\1\57\1\70\1\57\2\62\1\6\1\64\1\6\1\63\1\57\1\70\1\57\1\70\1\57\1\70\1\64\1\70\1\57\1\70\1\64\1\62\1\64\1\62\1\64";
    static final String dfa_4s = "\1\55\1\63\1\5\1\4\1\0\1\uffff\2\67\1\63\1\7\1\41\1\11\1\uffff\4\63\1\6\1\67\1\43\1\6\2\67\1\50\3\0\1\50\1\6\2\67\1\70\1\64\1\6\1\52\1\70\4\63\1\6\1\67\1\60\1\6\1\56\1\0\1\66\1\62\1\6\1\64\1\6\1\63\1\43\1\70\1\5\1\43\1\6\2\67\1\70\1\64\1\6\1\63\1\43\1\70\1\63\1\70\1\43\1\70\1\64\1\25\1\66\1\62\1\6\1\64\1\6\1\63\1\60\1\70\2\67\1\60\2\67\1\62\1\64\5\0\1\70\1\60\1\70\1\64\4\63\1\6\1\67\1\60\1\6\4\63\1\6\1\67\1\57\1\6\1\62\1\64\1\6\2\67\1\70\1\64\1\6\1\70\1\6\2\67\1\70\1\64\1\6\1\43\1\70\1\66\1\62\1\6\1\64\1\6\1\63\1\60\1\70\1\60\1\66\1\62\1\6\1\64\1\6\1\63\1\57\1\70\1\57\1\70\1\60\1\70\1\64\1\70\1\57\1\70\1\64\1\62\1\64\1\62\1\64";
    static final String dfa_5s = "\5\uffff\1\2\6\uffff\1\1\u0091\uffff";
    static final String dfa_6s = "\4\uffff\1\6\23\uffff\1\4\1\7\1\10\22\uffff\1\0\50\uffff\1\11\1\1\1\2\1\3\1\5\103\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\1\1\2\uffff\1\2\1\3",
            "\1\11\12\uffff\1\10\2\uffff\1\6\1\uffff\1\7",
            "\1\12",
            "\1\13",
            "\1\uffff",
            "",
            "\1\20\52\uffff\1\17\1\22\1\uffff\1\15\1\16\1\21",
            "\1\23\57\uffff\1\24",
            "\1\25\1\uffff\1\26",
            "\1\27",
            "\1\30\1\31\1\32",
            "\1\33",
            "",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\22",
            "\1\37",
            "\1\40\57\uffff\1\41",
            "\1\42",
            "\1\43",
            "\1\47\52\uffff\1\46\1\51\1\uffff\1\44\1\45\1\50",
            "\1\52\57\uffff\1\53",
            "\1\54",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\55",
            "\1\56",
            "\1\57\57\uffff\1\60",
            "\1\61\57\uffff\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\51",
            "\1\73",
            "\1\74\57\uffff\1\75",
            "\1\77\1\76",
            "\1\100",
            "\1\101",
            "\1\uffff",
            "\1\17\3\uffff\1\16",
            "\1\17",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\22",
            "\1\42",
            "\1\105",
            "\1\106",
            "\1\42",
            "\1\107",
            "\1\110\57\uffff\1\111",
            "\1\112\57\uffff\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117\1\uffff\1\120",
            "\1\42",
            "\1\121",
            "\1\122\1\uffff\1\123",
            "\1\124",
            "\1\42",
            "\1\125",
            "\1\64",
            "\1\126\1\127\1\130\1\131\1\132",
            "\1\46\3\uffff\1\45",
            "\1\46",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\51",
            "\1\77\1\76",
            "\1\136",
            "\1\142\52\uffff\1\141\1\144\1\uffff\1\137\1\140\1\143",
            "\1\145\57\uffff\1\146",
            "\1\77\1\76",
            "\1\152\52\uffff\1\151\1\154\1\uffff\1\147\1\150\1\153",
            "\1\155\57\uffff\1\156",
            "\1\17",
            "\1\103",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\157",
            "\1\77\1\76",
            "\1\160",
            "\1\115",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\144",
            "\1\164",
            "\1\165\57\uffff\1\166",
            "\1\77\1\76",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\154",
            "\1\173",
            "\1\174\57\uffff\1\175",
            "\1\176",
            "\1\177",
            "\1\46",
            "\1\134",
            "\1\u0080",
            "\1\u0081\57\uffff\1\u0082",
            "\1\u0083\57\uffff\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a\57\uffff\1\u008b",
            "\1\u008c\57\uffff\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\42",
            "\1\u0091",
            "\1\141\3\uffff\1\140",
            "\1\141",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\144",
            "\1\77\1\76",
            "\1\u0095",
            "\1\77\1\76",
            "\1\151\3\uffff\1\150",
            "\1\151",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\154",
            "\1\176",
            "\1\u0099",
            "\1\176",
            "\1\u009a",
            "\1\77\1\76",
            "\1\u009b",
            "\1\u0086",
            "\1\u009c",
            "\1\176",
            "\1\u009d",
            "\1\u008f",
            "\1\141",
            "\1\u0093",
            "\1\151",
            "\1\u0097"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3642:2: ( rule__Layer__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_45 = input.LA(1);

                         
                        int index29_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 2) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index29_45);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_87 = input.LA(1);

                         
                        int index29_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 0) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index29_87);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_88 = input.LA(1);

                         
                        int index29_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 0) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index29_88);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA29_89 = input.LA(1);

                         
                        int index29_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 0) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index29_89);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA29_24 = input.LA(1);

                         
                        int index29_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 1) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index29_24);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA29_90 = input.LA(1);

                         
                        int index29_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 0) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index29_90);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA29_4 = input.LA(1);

                         
                        int index29_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 2) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index29_4);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA29_25 = input.LA(1);

                         
                        int index29_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 1) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index29_25);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA29_26 = input.LA(1);

                         
                        int index29_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 1) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index29_26);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA29_86 = input.LA(1);

                         
                        int index29_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 0) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index29_86);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\4\uffff\1\3\23\uffff\1\1\1\4\1\5\22\uffff\1\7\50\uffff\1\6\1\10\1\11\1\0\1\2\103\uffff}>";
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_8;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3654:2: ( rule__Layer__UnorderedGroup__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_89 = input.LA(1);

                         
                        int index30_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 0) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index30_89);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_24 = input.LA(1);

                         
                        int index30_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 1) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index30_24);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_90 = input.LA(1);

                         
                        int index30_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 0) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index30_90);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA30_4 = input.LA(1);

                         
                        int index30_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 2) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index30_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA30_25 = input.LA(1);

                         
                        int index30_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 1) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index30_25);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA30_26 = input.LA(1);

                         
                        int index30_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 1) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index30_26);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA30_86 = input.LA(1);

                         
                        int index30_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 0) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index30_86);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA30_45 = input.LA(1);

                         
                        int index30_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 2) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index30_45);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA30_87 = input.LA(1);

                         
                        int index30_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 0) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index30_87);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA30_88 = input.LA(1);

                         
                        int index30_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getLayerAccess().getUnorderedGroup(), 0) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getLayerAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index30_88);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000007E000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00020000000002C0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000330000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000330000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000A400800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000A000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0064000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0080000000000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0088000000000080L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002000000000240L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000000F400000002L});

}
