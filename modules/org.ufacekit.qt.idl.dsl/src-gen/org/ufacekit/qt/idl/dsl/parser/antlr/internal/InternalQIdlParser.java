package org.ufacekit.qt.idl.dsl.parser.antlr.internal; 

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
import org.ufacekit.qt.idl.dsl.services.QIdlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalQIdlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'{'", "'}'", "'class'", "'extends'", "','", "'constructor'", "'('", "');'", "'property'", "';'", "'enumeration'", "'flags'", "':'", "'='", "'|'", "'builtin'", "'const'", "'function'", "')'", "'signal'", "'slot'", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "'['", "']'", "'if'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'&'", "'virtual'", "'purevirtual'", "'public'", "'protected'", "'member'", "'pointer'", "'reference'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalQIdlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQIdlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQIdlParser.tokenNames; }
    public String getGrammarFileName() { return "../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g"; }



     	private QIdlGrammarAccess grammarAccess;
     	
        public InternalQIdlParser(TokenStream input, QIdlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "QtIdlTyp";	
       	}
       	
       	@Override
       	protected QIdlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleQtIdlTyp"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:68:1: entryRuleQtIdlTyp returns [EObject current=null] : iv_ruleQtIdlTyp= ruleQtIdlTyp EOF ;
    public final EObject entryRuleQtIdlTyp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtIdlTyp = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:69:2: (iv_ruleQtIdlTyp= ruleQtIdlTyp EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:70:2: iv_ruleQtIdlTyp= ruleQtIdlTyp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtIdlTypRule()); 
            }
            pushFollow(FOLLOW_ruleQtIdlTyp_in_entryRuleQtIdlTyp75);
            iv_ruleQtIdlTyp=ruleQtIdlTyp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtIdlTyp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtIdlTyp85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQtIdlTyp"


    // $ANTLR start "ruleQtIdlTyp"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:77:1: ruleQtIdlTyp returns [EObject current=null] : ( ( (lv_element_0_1= ruleQtBuitinType | lv_element_0_2= ruleQtClass | lv_element_0_3= ruleQtNamespace ) ) ) ;
    public final EObject ruleQtIdlTyp() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_1 = null;

        EObject lv_element_0_2 = null;

        EObject lv_element_0_3 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:80:28: ( ( ( (lv_element_0_1= ruleQtBuitinType | lv_element_0_2= ruleQtClass | lv_element_0_3= ruleQtNamespace ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:81:1: ( ( (lv_element_0_1= ruleQtBuitinType | lv_element_0_2= ruleQtClass | lv_element_0_3= ruleQtNamespace ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:81:1: ( ( (lv_element_0_1= ruleQtBuitinType | lv_element_0_2= ruleQtClass | lv_element_0_3= ruleQtNamespace ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:82:1: ( (lv_element_0_1= ruleQtBuitinType | lv_element_0_2= ruleQtClass | lv_element_0_3= ruleQtNamespace ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:82:1: ( (lv_element_0_1= ruleQtBuitinType | lv_element_0_2= ruleQtClass | lv_element_0_3= ruleQtNamespace ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:83:1: (lv_element_0_1= ruleQtBuitinType | lv_element_0_2= ruleQtClass | lv_element_0_3= ruleQtNamespace )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:83:1: (lv_element_0_1= ruleQtBuitinType | lv_element_0_2= ruleQtClass | lv_element_0_3= ruleQtNamespace )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 11:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:84:3: lv_element_0_1= ruleQtBuitinType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtIdlTypAccess().getElementQtBuitinTypeParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQtBuitinType_in_ruleQtIdlTyp132);
                    lv_element_0_1=ruleQtBuitinType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getQtIdlTypRule());
                      	        }
                             		set(
                             			current, 
                             			"element",
                              		lv_element_0_1, 
                              		"QtBuitinType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:99:8: lv_element_0_2= ruleQtClass
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtIdlTypAccess().getElementQtClassParserRuleCall_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQtClass_in_ruleQtIdlTyp151);
                    lv_element_0_2=ruleQtClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getQtIdlTypRule());
                      	        }
                             		set(
                             			current, 
                             			"element",
                              		lv_element_0_2, 
                              		"QtClass");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:114:8: lv_element_0_3= ruleQtNamespace
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtIdlTypAccess().getElementQtNamespaceParserRuleCall_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQtNamespace_in_ruleQtIdlTyp170);
                    lv_element_0_3=ruleQtNamespace();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getQtIdlTypRule());
                      	        }
                             		set(
                             			current, 
                             			"element",
                              		lv_element_0_3, 
                              		"QtNamespace");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQtIdlTyp"


    // $ANTLR start "entryRuleQtNamespace"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:140:1: entryRuleQtNamespace returns [EObject current=null] : iv_ruleQtNamespace= ruleQtNamespace EOF ;
    public final EObject entryRuleQtNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtNamespace = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:141:2: (iv_ruleQtNamespace= ruleQtNamespace EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:142:2: iv_ruleQtNamespace= ruleQtNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtNamespaceRule()); 
            }
            pushFollow(FOLLOW_ruleQtNamespace_in_entryRuleQtNamespace208);
            iv_ruleQtNamespace=ruleQtNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtNamespace; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtNamespace218); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQtNamespace"


    // $ANTLR start "ruleQtNamespace"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:149:1: ruleQtNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleQtNamespace ) )* ( (lv_enums_4_0= ruleQtEnum ) )* ( (lv_flags_5_0= ruleQtFlags ) )* ( (lv_classes_6_0= ruleQtClass ) )* otherlv_7= '}' ) ;
    public final EObject ruleQtNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_namespaces_3_0 = null;

        EObject lv_enums_4_0 = null;

        EObject lv_flags_5_0 = null;

        EObject lv_classes_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:152:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleQtNamespace ) )* ( (lv_enums_4_0= ruleQtEnum ) )* ( (lv_flags_5_0= ruleQtFlags ) )* ( (lv_classes_6_0= ruleQtClass ) )* otherlv_7= '}' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:153:1: (otherlv_0= 'namespace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleQtNamespace ) )* ( (lv_enums_4_0= ruleQtEnum ) )* ( (lv_flags_5_0= ruleQtFlags ) )* ( (lv_classes_6_0= ruleQtClass ) )* otherlv_7= '}' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:153:1: (otherlv_0= 'namespace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleQtNamespace ) )* ( (lv_enums_4_0= ruleQtEnum ) )* ( (lv_flags_5_0= ruleQtFlags ) )* ( (lv_classes_6_0= ruleQtClass ) )* otherlv_7= '}' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:153:3: otherlv_0= 'namespace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleQtNamespace ) )* ( (lv_enums_4_0= ruleQtEnum ) )* ( (lv_flags_5_0= ruleQtFlags ) )* ( (lv_classes_6_0= ruleQtClass ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleQtNamespace255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtNamespaceAccess().getNamespaceKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:157:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:158:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:158:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:159:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtNamespace272); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getQtNamespaceAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQtNamespaceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleQtNamespace289); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQtNamespaceAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:179:1: ( (lv_namespaces_3_0= ruleQtNamespace ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:180:1: (lv_namespaces_3_0= ruleQtNamespace )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:180:1: (lv_namespaces_3_0= ruleQtNamespace )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:181:3: lv_namespaces_3_0= ruleQtNamespace
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtNamespaceAccess().getNamespacesQtNamespaceParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtNamespace_in_ruleQtNamespace310);
            	    lv_namespaces_3_0=ruleQtNamespace();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQtNamespaceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"namespaces",
            	              		lv_namespaces_3_0, 
            	              		"QtNamespace");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:197:3: ( (lv_enums_4_0= ruleQtEnum ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:198:1: (lv_enums_4_0= ruleQtEnum )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:198:1: (lv_enums_4_0= ruleQtEnum )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:199:3: lv_enums_4_0= ruleQtEnum
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtNamespaceAccess().getEnumsQtEnumParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtEnum_in_ruleQtNamespace332);
            	    lv_enums_4_0=ruleQtEnum();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQtNamespaceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"enums",
            	              		lv_enums_4_0, 
            	              		"QtEnum");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:215:3: ( (lv_flags_5_0= ruleQtFlags ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:216:1: (lv_flags_5_0= ruleQtFlags )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:216:1: (lv_flags_5_0= ruleQtFlags )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:217:3: lv_flags_5_0= ruleQtFlags
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtNamespaceAccess().getFlagsQtFlagsParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtFlags_in_ruleQtNamespace354);
            	    lv_flags_5_0=ruleQtFlags();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQtNamespaceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"flags",
            	              		lv_flags_5_0, 
            	              		"QtFlags");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:233:3: ( (lv_classes_6_0= ruleQtClass ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:234:1: (lv_classes_6_0= ruleQtClass )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:234:1: (lv_classes_6_0= ruleQtClass )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:235:3: lv_classes_6_0= ruleQtClass
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtNamespaceAccess().getClassesQtClassParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtClass_in_ruleQtNamespace376);
            	    lv_classes_6_0=ruleQtClass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQtNamespaceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"classes",
            	              		lv_classes_6_0, 
            	              		"QtClass");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleQtNamespace389); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getQtNamespaceAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQtNamespace"


    // $ANTLR start "entryRuleQtOperations"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:265:1: entryRuleQtOperations returns [EObject current=null] : iv_ruleQtOperations= ruleQtOperations EOF ;
    public final EObject entryRuleQtOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtOperations = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:266:2: (iv_ruleQtOperations= ruleQtOperations EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:267:2: iv_ruleQtOperations= ruleQtOperations EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtOperationsRule()); 
            }
            pushFollow(FOLLOW_ruleQtOperations_in_entryRuleQtOperations427);
            iv_ruleQtOperations=ruleQtOperations();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtOperations; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtOperations437); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQtOperations"


    // $ANTLR start "ruleQtOperations"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:274:1: ruleQtOperations returns [EObject current=null] : (this_QtFunction_0= ruleQtFunction | this_QtSignal_1= ruleQtSignal | this_QtSlot_2= ruleQtSlot ) ;
    public final EObject ruleQtOperations() throws RecognitionException {
        EObject current = null;

        EObject this_QtFunction_0 = null;

        EObject this_QtSignal_1 = null;

        EObject this_QtSlot_2 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:277:28: ( (this_QtFunction_0= ruleQtFunction | this_QtSignal_1= ruleQtSignal | this_QtSlot_2= ruleQtSlot ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:278:1: (this_QtFunction_0= ruleQtFunction | this_QtSignal_1= ruleQtSignal | this_QtSlot_2= ruleQtSlot )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:278:1: (this_QtFunction_0= ruleQtFunction | this_QtSignal_1= ruleQtSignal | this_QtSlot_2= ruleQtSlot )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 85:
            case 86:
                {
                alt6=1;
                }
                break;
            case 31:
                {
                alt6=2;
                }
                break;
            case 32:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:279:5: this_QtFunction_0= ruleQtFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQtOperationsAccess().getQtFunctionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQtFunction_in_ruleQtOperations484);
                    this_QtFunction_0=ruleQtFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_QtFunction_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:289:5: this_QtSignal_1= ruleQtSignal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQtOperationsAccess().getQtSignalParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQtSignal_in_ruleQtOperations511);
                    this_QtSignal_1=ruleQtSignal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_QtSignal_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:299:5: this_QtSlot_2= ruleQtSlot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQtOperationsAccess().getQtSlotParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQtSlot_in_ruleQtOperations538);
                    this_QtSlot_2=ruleQtSlot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_QtSlot_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQtOperations"


    // $ANTLR start "entryRuleQtClass"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:315:1: entryRuleQtClass returns [EObject current=null] : iv_ruleQtClass= ruleQtClass EOF ;
    public final EObject entryRuleQtClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtClass = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:316:2: (iv_ruleQtClass= ruleQtClass EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:317:2: iv_ruleQtClass= ruleQtClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtClassRule()); 
            }
            pushFollow(FOLLOW_ruleQtClass_in_entryRuleQtClass573);
            iv_ruleQtClass=ruleQtClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtClass583); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQtClass"


    // $ANTLR start "ruleQtClass"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:324:1: ruleQtClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( (lv_enums_7_0= ruleQtEnum ) )* ( (lv_flags_8_0= ruleQtFlags ) )* ( (lv_classes_9_0= ruleQtClass ) )* ( (lv_properties_10_0= ruleQtProperty ) )* ( (lv_constructors_11_0= ruleQtConstructor ) )* ( (lv_operations_12_0= ruleQtOperations ) )* otherlv_13= '}' ) ;
    public final EObject ruleQtClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_13=null;
        EObject lv_enums_7_0 = null;

        EObject lv_flags_8_0 = null;

        EObject lv_classes_9_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_constructors_11_0 = null;

        EObject lv_operations_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:327:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( (lv_enums_7_0= ruleQtEnum ) )* ( (lv_flags_8_0= ruleQtFlags ) )* ( (lv_classes_9_0= ruleQtClass ) )* ( (lv_properties_10_0= ruleQtProperty ) )* ( (lv_constructors_11_0= ruleQtConstructor ) )* ( (lv_operations_12_0= ruleQtOperations ) )* otherlv_13= '}' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:328:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( (lv_enums_7_0= ruleQtEnum ) )* ( (lv_flags_8_0= ruleQtFlags ) )* ( (lv_classes_9_0= ruleQtClass ) )* ( (lv_properties_10_0= ruleQtProperty ) )* ( (lv_constructors_11_0= ruleQtConstructor ) )* ( (lv_operations_12_0= ruleQtOperations ) )* otherlv_13= '}' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:328:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( (lv_enums_7_0= ruleQtEnum ) )* ( (lv_flags_8_0= ruleQtFlags ) )* ( (lv_classes_9_0= ruleQtClass ) )* ( (lv_properties_10_0= ruleQtProperty ) )* ( (lv_constructors_11_0= ruleQtConstructor ) )* ( (lv_operations_12_0= ruleQtOperations ) )* otherlv_13= '}' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:328:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( (lv_enums_7_0= ruleQtEnum ) )* ( (lv_flags_8_0= ruleQtFlags ) )* ( (lv_classes_9_0= ruleQtClass ) )* ( (lv_properties_10_0= ruleQtProperty ) )* ( (lv_constructors_11_0= ruleQtConstructor ) )* ( (lv_operations_12_0= ruleQtOperations ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleQtClass620); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtClassAccess().getClassKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:332:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:333:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:333:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:334:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtClass637); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getQtClassAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQtClassRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:350:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:350:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleQtClass655); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getQtClassAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:354:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:355:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:355:1: (otherlv_3= RULE_ID )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:356:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getQtClassRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtClass675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getQtClassAccess().getSuperTypesQtClassCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:367:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:367:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleQtClass688); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getQtClassAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:371:1: ( (otherlv_5= RULE_ID ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:372:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:372:1: (otherlv_5= RULE_ID )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:373:3: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getQtClassRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtClass708); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_5, grammarAccess.getQtClassAccess().getSuperTypesQtClassCrossReference_2_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleQtClass724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getQtClassAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:388:1: ( (lv_enums_7_0= ruleQtEnum ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:389:1: (lv_enums_7_0= ruleQtEnum )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:389:1: (lv_enums_7_0= ruleQtEnum )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:390:3: lv_enums_7_0= ruleQtEnum
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtClassAccess().getEnumsQtEnumParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtEnum_in_ruleQtClass745);
            	    lv_enums_7_0=ruleQtEnum();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQtClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"enums",
            	              		lv_enums_7_0, 
            	              		"QtEnum");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:406:3: ( (lv_flags_8_0= ruleQtFlags ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:407:1: (lv_flags_8_0= ruleQtFlags )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:407:1: (lv_flags_8_0= ruleQtFlags )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:408:3: lv_flags_8_0= ruleQtFlags
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtClassAccess().getFlagsQtFlagsParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtFlags_in_ruleQtClass767);
            	    lv_flags_8_0=ruleQtFlags();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQtClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"flags",
            	              		lv_flags_8_0, 
            	              		"QtFlags");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:424:3: ( (lv_classes_9_0= ruleQtClass ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:425:1: (lv_classes_9_0= ruleQtClass )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:425:1: (lv_classes_9_0= ruleQtClass )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:426:3: lv_classes_9_0= ruleQtClass
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtClassAccess().getClassesQtClassParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtClass_in_ruleQtClass789);
            	    lv_classes_9_0=ruleQtClass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQtClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"classes",
            	              		lv_classes_9_0, 
            	              		"QtClass");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:442:3: ( (lv_properties_10_0= ruleQtProperty ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:443:1: (lv_properties_10_0= ruleQtProperty )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:443:1: (lv_properties_10_0= ruleQtProperty )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:444:3: lv_properties_10_0= ruleQtProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtClassAccess().getPropertiesQtPropertyParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtProperty_in_ruleQtClass811);
            	    lv_properties_10_0=ruleQtProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQtClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_10_0, 
            	              		"QtProperty");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:460:3: ( (lv_constructors_11_0= ruleQtConstructor ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:461:1: (lv_constructors_11_0= ruleQtConstructor )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:461:1: (lv_constructors_11_0= ruleQtConstructor )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:462:3: lv_constructors_11_0= ruleQtConstructor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtClassAccess().getConstructorsQtConstructorParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtConstructor_in_ruleQtClass833);
            	    lv_constructors_11_0=ruleQtConstructor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQtClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constructors",
            	              		lv_constructors_11_0, 
            	              		"QtConstructor");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:478:3: ( (lv_operations_12_0= ruleQtOperations ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=31 && LA14_0<=32)||(LA14_0>=85 && LA14_0<=86)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:479:1: (lv_operations_12_0= ruleQtOperations )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:479:1: (lv_operations_12_0= ruleQtOperations )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:480:3: lv_operations_12_0= ruleQtOperations
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtClassAccess().getOperationsQtOperationsParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtOperations_in_ruleQtClass855);
            	    lv_operations_12_0=ruleQtOperations();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQtClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"operations",
            	              		lv_operations_12_0, 
            	              		"QtOperations");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleQtClass868); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getQtClassAccess().getRightCurlyBracketKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQtClass"


    // $ANTLR start "entryRuleQtConstructor"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:508:1: entryRuleQtConstructor returns [EObject current=null] : iv_ruleQtConstructor= ruleQtConstructor EOF ;
    public final EObject entryRuleQtConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtConstructor = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:509:2: (iv_ruleQtConstructor= ruleQtConstructor EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:510:2: iv_ruleQtConstructor= ruleQtConstructor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtConstructorRule()); 
            }
            pushFollow(FOLLOW_ruleQtConstructor_in_entryRuleQtConstructor904);
            iv_ruleQtConstructor=ruleQtConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtConstructor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtConstructor914); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQtConstructor"


    // $ANTLR start "ruleQtConstructor"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:517:1: ruleQtConstructor returns [EObject current=null] : (otherlv_0= 'constructor' otherlv_1= '(' ( ( (lv_params_2_0= ruleQtValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleQtValue ) ) )* )? otherlv_5= ');' ) ;
    public final EObject ruleQtConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:520:28: ( (otherlv_0= 'constructor' otherlv_1= '(' ( ( (lv_params_2_0= ruleQtValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleQtValue ) ) )* )? otherlv_5= ');' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:521:1: (otherlv_0= 'constructor' otherlv_1= '(' ( ( (lv_params_2_0= ruleQtValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleQtValue ) ) )* )? otherlv_5= ');' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:521:1: (otherlv_0= 'constructor' otherlv_1= '(' ( ( (lv_params_2_0= ruleQtValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleQtValue ) ) )* )? otherlv_5= ');' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:521:3: otherlv_0= 'constructor' otherlv_1= '(' ( ( (lv_params_2_0= ruleQtValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleQtValue ) ) )* )? otherlv_5= ');'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleQtConstructor951); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtConstructorAccess().getConstructorKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleQtConstructor963); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getQtConstructorAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:529:1: ( ( (lv_params_2_0= ruleQtValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleQtValue ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||LA16_0==28||(LA16_0>=88 && LA16_0<=89)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:529:2: ( (lv_params_2_0= ruleQtValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleQtValue ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:529:2: ( (lv_params_2_0= ruleQtValue ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:530:1: (lv_params_2_0= ruleQtValue )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:530:1: (lv_params_2_0= ruleQtValue )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:531:3: lv_params_2_0= ruleQtValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtConstructorAccess().getParamsQtValueParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQtValue_in_ruleQtConstructor985);
                    lv_params_2_0=ruleQtValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getQtConstructorRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_2_0, 
                              		"QtValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:547:2: (otherlv_3= ',' ( (lv_params_4_0= ruleQtValue ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==16) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:547:4: otherlv_3= ',' ( (lv_params_4_0= ruleQtValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleQtConstructor998); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getQtConstructorAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:551:1: ( (lv_params_4_0= ruleQtValue ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:552:1: (lv_params_4_0= ruleQtValue )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:552:1: (lv_params_4_0= ruleQtValue )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:553:3: lv_params_4_0= ruleQtValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getQtConstructorAccess().getParamsQtValueParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQtValue_in_ruleQtConstructor1019);
                    	    lv_params_4_0=ruleQtValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getQtConstructorRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_4_0, 
                    	              		"QtValue");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleQtConstructor1035); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getQtConstructorAccess().getRightParenthesisSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQtConstructor"


    // $ANTLR start "entryRuleQtProperty"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:581:1: entryRuleQtProperty returns [EObject current=null] : iv_ruleQtProperty= ruleQtProperty EOF ;
    public final EObject entryRuleQtProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtProperty = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:582:2: (iv_ruleQtProperty= ruleQtProperty EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:583:2: iv_ruleQtProperty= ruleQtProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleQtProperty_in_entryRuleQtProperty1071);
            iv_ruleQtProperty=ruleQtProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtProperty1081); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQtProperty"


    // $ANTLR start "ruleQtProperty"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:590:1: ruleQtProperty returns [EObject current=null] : (otherlv_0= 'property' ( (lv_type_1_0= ruleQtValue ) ) otherlv_2= ';' ) ;
    public final EObject ruleQtProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:593:28: ( (otherlv_0= 'property' ( (lv_type_1_0= ruleQtValue ) ) otherlv_2= ';' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:594:1: (otherlv_0= 'property' ( (lv_type_1_0= ruleQtValue ) ) otherlv_2= ';' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:594:1: (otherlv_0= 'property' ( (lv_type_1_0= ruleQtValue ) ) otherlv_2= ';' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:594:3: otherlv_0= 'property' ( (lv_type_1_0= ruleQtValue ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleQtProperty1118); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtPropertyAccess().getPropertyKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:598:1: ( (lv_type_1_0= ruleQtValue ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:599:1: (lv_type_1_0= ruleQtValue )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:599:1: (lv_type_1_0= ruleQtValue )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:600:3: lv_type_1_0= ruleQtValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtPropertyAccess().getTypeQtValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQtValue_in_ruleQtProperty1139);
            lv_type_1_0=ruleQtValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQtPropertyRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"QtValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleQtProperty1151); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQtPropertyAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQtProperty"


    // $ANTLR start "entryRuleQtEnum"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:628:1: entryRuleQtEnum returns [EObject current=null] : iv_ruleQtEnum= ruleQtEnum EOF ;
    public final EObject entryRuleQtEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtEnum = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:629:2: (iv_ruleQtEnum= ruleQtEnum EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:630:2: iv_ruleQtEnum= ruleQtEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtEnumRule()); 
            }
            pushFollow(FOLLOW_ruleQtEnum_in_entryRuleQtEnum1187);
            iv_ruleQtEnum=ruleQtEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtEnum; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtEnum1197); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQtEnum"


    // $ANTLR start "ruleQtEnum"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:637:1: ruleQtEnum returns [EObject current=null] : (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleQtEnumValue ) )* otherlv_4= '}' ) ;
    public final EObject ruleQtEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:640:28: ( (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleQtEnumValue ) )* otherlv_4= '}' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:641:1: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleQtEnumValue ) )* otherlv_4= '}' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:641:1: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleQtEnumValue ) )* otherlv_4= '}' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:641:3: otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleQtEnumValue ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleQtEnum1234); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtEnumAccess().getEnumerationKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:645:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:646:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:646:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:647:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtEnum1251); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getQtEnumAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQtEnumRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleQtEnum1268); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQtEnumAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:667:1: ( (lv_values_3_0= ruleQtEnumValue ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:668:1: (lv_values_3_0= ruleQtEnumValue )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:668:1: (lv_values_3_0= ruleQtEnumValue )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:669:3: lv_values_3_0= ruleQtEnumValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtEnumAccess().getValuesQtEnumValueParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtEnumValue_in_ruleQtEnum1289);
            	    lv_values_3_0=ruleQtEnumValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQtEnumRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_3_0, 
            	              		"QtEnumValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleQtEnum1302); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQtEnumAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQtEnum"


    // $ANTLR start "entryRuleQtFlags"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:697:1: entryRuleQtFlags returns [EObject current=null] : iv_ruleQtFlags= ruleQtFlags EOF ;
    public final EObject entryRuleQtFlags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtFlags = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:698:2: (iv_ruleQtFlags= ruleQtFlags EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:699:2: iv_ruleQtFlags= ruleQtFlags EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtFlagsRule()); 
            }
            pushFollow(FOLLOW_ruleQtFlags_in_entryRuleQtFlags1338);
            iv_ruleQtFlags=ruleQtFlags();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtFlags; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtFlags1348); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQtFlags"


    // $ANTLR start "ruleQtFlags"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:706:1: ruleQtFlags returns [EObject current=null] : (otherlv_0= 'flags' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleQtFlags() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:709:28: ( (otherlv_0= 'flags' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:710:1: (otherlv_0= 'flags' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:710:1: (otherlv_0= 'flags' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:710:3: otherlv_0= 'flags' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleQtFlags1385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtFlagsAccess().getFlagsKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:714:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:715:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:715:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:716:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtFlags1402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getQtFlagsAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQtFlagsRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleQtFlags1419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQtFlagsAccess().getColonKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:736:1: ( (otherlv_3= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:737:1: (otherlv_3= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:737:1: (otherlv_3= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:738:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getQtFlagsRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtFlags1439); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getQtFlagsAccess().getEnumerationQtEnumCrossReference_3_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQtFlags"


    // $ANTLR start "entryRuleQtEnumValue"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:757:1: entryRuleQtEnumValue returns [EObject current=null] : iv_ruleQtEnumValue= ruleQtEnumValue EOF ;
    public final EObject entryRuleQtEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtEnumValue = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:758:2: (iv_ruleQtEnumValue= ruleQtEnumValue EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:759:2: iv_ruleQtEnumValue= ruleQtEnumValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtEnumValueRule()); 
            }
            pushFollow(FOLLOW_ruleQtEnumValue_in_entryRuleQtEnumValue1475);
            iv_ruleQtEnumValue=ruleQtEnumValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtEnumValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtEnumValue1485); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQtEnumValue"


    // $ANTLR start "ruleQtEnumValue"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:766:1: ruleQtEnumValue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLiteralValue ) ) ) ;
    public final EObject ruleQtEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:769:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLiteralValue ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:770:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLiteralValue ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:770:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLiteralValue ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:770:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLiteralValue ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:770:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:771:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:771:1: (lv_name_0_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:772:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtEnumValue1527); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getQtEnumValueAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQtEnumValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleQtEnumValue1544); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getQtEnumValueAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:792:1: ( (lv_value_2_0= ruleLiteralValue ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:793:1: (lv_value_2_0= ruleLiteralValue )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:793:1: (lv_value_2_0= ruleLiteralValue )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:794:3: lv_value_2_0= ruleLiteralValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtEnumValueAccess().getValueLiteralValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteralValue_in_ruleQtEnumValue1565);
            lv_value_2_0=ruleLiteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQtEnumValueRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"LiteralValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQtEnumValue"


    // $ANTLR start "entryRuleLiteralValue"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:818:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:819:2: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:820:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue1601);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValue1611); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralValue"


    // $ANTLR start "ruleLiteralValue"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:827:1: ruleLiteralValue returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|' ( (otherlv_2= RULE_ID ) ) )* ) | this_INT_3= RULE_INT | this_STRING_4= RULE_STRING ) ;
    public final EObject ruleLiteralValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_INT_3=null;
        Token this_STRING_4=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:830:28: ( ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|' ( (otherlv_2= RULE_ID ) ) )* ) | this_INT_3= RULE_INT | this_STRING_4= RULE_STRING ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:831:1: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|' ( (otherlv_2= RULE_ID ) ) )* ) | this_INT_3= RULE_INT | this_STRING_4= RULE_STRING )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:831:1: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|' ( (otherlv_2= RULE_ID ) ) )* ) | this_INT_3= RULE_INT | this_STRING_4= RULE_STRING )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt19=1;
                }
                break;
            case RULE_INT:
                {
                alt19=2;
                }
                break;
            case RULE_STRING:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:831:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|' ( (otherlv_2= RULE_ID ) ) )* )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:831:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|' ( (otherlv_2= RULE_ID ) ) )* )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:831:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|' ( (otherlv_2= RULE_ID ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:831:3: ( (otherlv_0= RULE_ID ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:832:1: (otherlv_0= RULE_ID )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:832:1: (otherlv_0= RULE_ID )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:833:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralValueRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralValue1657); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getLiteralValueAccess().getValueQtEnumValueCrossReference_0_0_0()); 
                      	
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:844:2: (otherlv_1= '|' ( (otherlv_2= RULE_ID ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==26) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:844:4: otherlv_1= '|' ( (otherlv_2= RULE_ID ) )
                    	    {
                    	    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleLiteralValue1670); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_1, grammarAccess.getLiteralValueAccess().getVerticalLineKeyword_0_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:848:1: ( (otherlv_2= RULE_ID ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:849:1: (otherlv_2= RULE_ID )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:849:1: (otherlv_2= RULE_ID )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:850:3: otherlv_2= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getLiteralValueRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralValue1690); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_2, grammarAccess.getLiteralValueAccess().getValueQtEnumValueCrossReference_0_1_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:862:6: this_INT_3= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLiteralValue1710); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_3, grammarAccess.getLiteralValueAccess().getINTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:867:6: this_STRING_4= RULE_STRING
                    {
                    this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteralValue1726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_4, grammarAccess.getLiteralValueAccess().getSTRINGTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteralValue"


    // $ANTLR start "entryRuleQtBuitinType"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:879:1: entryRuleQtBuitinType returns [EObject current=null] : iv_ruleQtBuitinType= ruleQtBuitinType EOF ;
    public final EObject entryRuleQtBuitinType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtBuitinType = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:880:2: (iv_ruleQtBuitinType= ruleQtBuitinType EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:881:2: iv_ruleQtBuitinType= ruleQtBuitinType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtBuitinTypeRule()); 
            }
            pushFollow(FOLLOW_ruleQtBuitinType_in_entryRuleQtBuitinType1761);
            iv_ruleQtBuitinType=ruleQtBuitinType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtBuitinType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtBuitinType1771); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQtBuitinType"


    // $ANTLR start "ruleQtBuitinType"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:888:1: ruleQtBuitinType returns [EObject current=null] : (otherlv_0= 'builtin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleJvmArgumentTypeReference ) ) ) ;
    public final EObject ruleQtBuitinType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:891:28: ( (otherlv_0= 'builtin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleJvmArgumentTypeReference ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:892:1: (otherlv_0= 'builtin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleJvmArgumentTypeReference ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:892:1: (otherlv_0= 'builtin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleJvmArgumentTypeReference ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:892:3: otherlv_0= 'builtin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleJvmArgumentTypeReference ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleQtBuitinType1808); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtBuitinTypeAccess().getBuiltinKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:896:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:897:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:897:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:898:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtBuitinType1825); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getQtBuitinTypeAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQtBuitinTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleQtBuitinType1842); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQtBuitinTypeAccess().getColonKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:918:1: ( (lv_value_3_0= ruleJvmArgumentTypeReference ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:919:1: (lv_value_3_0= ruleJvmArgumentTypeReference )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:919:1: (lv_value_3_0= ruleJvmArgumentTypeReference )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:920:3: lv_value_3_0= ruleJvmArgumentTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtBuitinTypeAccess().getValueJvmArgumentTypeReferenceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleQtBuitinType1863);
            lv_value_3_0=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQtBuitinTypeRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"JvmArgumentTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQtBuitinType"


    // $ANTLR start "entryRuleQtFunction"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:944:1: entryRuleQtFunction returns [EObject current=null] : iv_ruleQtFunction= ruleQtFunction EOF ;
    public final EObject entryRuleQtFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtFunction = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:945:2: (iv_ruleQtFunction= ruleQtFunction EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:946:2: iv_ruleQtFunction= ruleQtFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleQtFunction_in_entryRuleQtFunction1899);
            iv_ruleQtFunction=ruleQtFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtFunction1909); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQtFunction"


    // $ANTLR start "ruleQtFunction"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:953:1: ruleQtFunction returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) ) ( (lv_const_1_0= 'const' ) )? ( (lv_virtual_2_0= ruleVirtuality ) )? ( (lv_owner_3_0= ruleOwner ) ) otherlv_4= 'function' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleQtValue ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleQtValue ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_returnValue_12_0= ruleQtReturnValue ) ) otherlv_13= ';' ) ;
    public final EObject ruleQtFunction() throws RecognitionException {
        EObject current = null;

        Token lv_const_1_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Enumerator lv_visibility_0_0 = null;

        Enumerator lv_virtual_2_0 = null;

        Enumerator lv_owner_3_0 = null;

        EObject lv_params_7_0 = null;

        EObject lv_params_9_0 = null;

        EObject lv_returnValue_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:956:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) ) ( (lv_const_1_0= 'const' ) )? ( (lv_virtual_2_0= ruleVirtuality ) )? ( (lv_owner_3_0= ruleOwner ) ) otherlv_4= 'function' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleQtValue ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleQtValue ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_returnValue_12_0= ruleQtReturnValue ) ) otherlv_13= ';' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:957:1: ( ( (lv_visibility_0_0= ruleVisibility ) ) ( (lv_const_1_0= 'const' ) )? ( (lv_virtual_2_0= ruleVirtuality ) )? ( (lv_owner_3_0= ruleOwner ) ) otherlv_4= 'function' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleQtValue ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleQtValue ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_returnValue_12_0= ruleQtReturnValue ) ) otherlv_13= ';' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:957:1: ( ( (lv_visibility_0_0= ruleVisibility ) ) ( (lv_const_1_0= 'const' ) )? ( (lv_virtual_2_0= ruleVirtuality ) )? ( (lv_owner_3_0= ruleOwner ) ) otherlv_4= 'function' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleQtValue ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleQtValue ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_returnValue_12_0= ruleQtReturnValue ) ) otherlv_13= ';' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:957:2: ( (lv_visibility_0_0= ruleVisibility ) ) ( (lv_const_1_0= 'const' ) )? ( (lv_virtual_2_0= ruleVirtuality ) )? ( (lv_owner_3_0= ruleOwner ) ) otherlv_4= 'function' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleQtValue ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleQtValue ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_returnValue_12_0= ruleQtReturnValue ) ) otherlv_13= ';'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:957:2: ( (lv_visibility_0_0= ruleVisibility ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:958:1: (lv_visibility_0_0= ruleVisibility )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:958:1: (lv_visibility_0_0= ruleVisibility )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:959:3: lv_visibility_0_0= ruleVisibility
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtFunctionAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVisibility_in_ruleQtFunction1955);
            lv_visibility_0_0=ruleVisibility();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQtFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"visibility",
                      		lv_visibility_0_0, 
                      		"Visibility");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:975:2: ( (lv_const_1_0= 'const' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:976:1: (lv_const_1_0= 'const' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:976:1: (lv_const_1_0= 'const' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:977:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,28,FOLLOW_28_in_ruleQtFunction1973); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_const_1_0, grammarAccess.getQtFunctionAccess().getConstConstKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getQtFunctionRule());
                      	        }
                             		setWithLastConsumed(current, "const", lv_const_1_0, "const");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:990:3: ( (lv_virtual_2_0= ruleVirtuality ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=83 && LA21_0<=84)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:991:1: (lv_virtual_2_0= ruleVirtuality )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:991:1: (lv_virtual_2_0= ruleVirtuality )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:992:3: lv_virtual_2_0= ruleVirtuality
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtFunctionAccess().getVirtualVirtualityEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVirtuality_in_ruleQtFunction2008);
                    lv_virtual_2_0=ruleVirtuality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getQtFunctionRule());
                      	        }
                             		set(
                             			current, 
                             			"virtual",
                              		lv_virtual_2_0, 
                              		"Virtuality");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1008:3: ( (lv_owner_3_0= ruleOwner ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1009:1: (lv_owner_3_0= ruleOwner )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1009:1: (lv_owner_3_0= ruleOwner )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1010:3: lv_owner_3_0= ruleOwner
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtFunctionAccess().getOwnerOwnerEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOwner_in_ruleQtFunction2030);
            lv_owner_3_0=ruleOwner();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQtFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"owner",
                      		lv_owner_3_0, 
                      		"Owner");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleQtFunction2042); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQtFunctionAccess().getFunctionKeyword_4());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1030:1: ( (lv_name_5_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1031:1: (lv_name_5_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1031:1: (lv_name_5_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1032:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtFunction2059); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getQtFunctionAccess().getNameIDTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQtFunctionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleQtFunction2076); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getQtFunctionAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1052:1: ( ( (lv_params_7_0= ruleQtValue ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleQtValue ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||LA23_0==28||(LA23_0>=88 && LA23_0<=89)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1052:2: ( (lv_params_7_0= ruleQtValue ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleQtValue ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1052:2: ( (lv_params_7_0= ruleQtValue ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1053:1: (lv_params_7_0= ruleQtValue )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1053:1: (lv_params_7_0= ruleQtValue )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1054:3: lv_params_7_0= ruleQtValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtFunctionAccess().getParamsQtValueParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQtValue_in_ruleQtFunction2098);
                    lv_params_7_0=ruleQtValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getQtFunctionRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_7_0, 
                              		"QtValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1070:2: (otherlv_8= ',' ( (lv_params_9_0= ruleQtValue ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==16) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1070:4: otherlv_8= ',' ( (lv_params_9_0= ruleQtValue ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleQtFunction2111); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getQtFunctionAccess().getCommaKeyword_7_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1074:1: ( (lv_params_9_0= ruleQtValue ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1075:1: (lv_params_9_0= ruleQtValue )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1075:1: (lv_params_9_0= ruleQtValue )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1076:3: lv_params_9_0= ruleQtValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getQtFunctionAccess().getParamsQtValueParserRuleCall_7_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQtValue_in_ruleQtFunction2132);
                    	    lv_params_9_0=ruleQtValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getQtFunctionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_9_0, 
                    	              		"QtValue");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleQtFunction2148); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getQtFunctionAccess().getRightParenthesisKeyword_8());
                  
            }
            otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleQtFunction2160); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getQtFunctionAccess().getColonKeyword_9());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1100:1: ( (lv_returnValue_12_0= ruleQtReturnValue ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1101:1: (lv_returnValue_12_0= ruleQtReturnValue )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1101:1: (lv_returnValue_12_0= ruleQtReturnValue )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1102:3: lv_returnValue_12_0= ruleQtReturnValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtFunctionAccess().getReturnValueQtReturnValueParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQtReturnValue_in_ruleQtFunction2181);
            lv_returnValue_12_0=ruleQtReturnValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQtFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"returnValue",
                      		lv_returnValue_12_0, 
                      		"QtReturnValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleQtFunction2193); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getQtFunctionAccess().getSemicolonKeyword_11());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQtFunction"


    // $ANTLR start "entryRuleQtValue"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1130:1: entryRuleQtValue returns [EObject current=null] : iv_ruleQtValue= ruleQtValue EOF ;
    public final EObject entryRuleQtValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtValue = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1131:2: (iv_ruleQtValue= ruleQtValue EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1132:2: iv_ruleQtValue= ruleQtValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtValueRule()); 
            }
            pushFollow(FOLLOW_ruleQtValue_in_entryRuleQtValue2229);
            iv_ruleQtValue=ruleQtValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtValue2239); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQtValue"


    // $ANTLR start "ruleQtValue"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1139:1: ruleQtValue returns [EObject current=null] : ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleQtValue() throws RecognitionException {
        EObject current = null;

        Token lv_const_0_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Enumerator lv_valueType_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1142:28: ( ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1143:1: ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1143:1: ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1143:2: ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1143:2: ( (lv_const_0_0= 'const' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1144:1: (lv_const_0_0= 'const' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1144:1: (lv_const_0_0= 'const' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1145:3: lv_const_0_0= 'const'
                    {
                    lv_const_0_0=(Token)match(input,28,FOLLOW_28_in_ruleQtValue2282); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_const_0_0, grammarAccess.getQtValueAccess().getConstConstKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getQtValueRule());
                      	        }
                             		setWithLastConsumed(current, "const", lv_const_0_0, "const");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1158:3: ( (lv_valueType_1_0= ruleType ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=88 && LA25_0<=89)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1159:1: (lv_valueType_1_0= ruleType )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1159:1: (lv_valueType_1_0= ruleType )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1160:3: lv_valueType_1_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtValueAccess().getValueTypeTypeEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleQtValue2317);
                    lv_valueType_1_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getQtValueRule());
                      	        }
                             		set(
                             			current, 
                             			"valueType",
                              		lv_valueType_1_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1176:3: ( (otherlv_2= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1177:1: (otherlv_2= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1177:1: (otherlv_2= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1178:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getQtValueRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtValue2338); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getQtValueAccess().getTypeQtTypeCrossReference_2_0()); 
              	
            }

            }


            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1189:2: ( (lv_name_3_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1190:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1190:1: (lv_name_3_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1191:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtValue2355); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getQtValueAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQtValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQtValue"


    // $ANTLR start "entryRuleQtReturnValue"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1215:1: entryRuleQtReturnValue returns [EObject current=null] : iv_ruleQtReturnValue= ruleQtReturnValue EOF ;
    public final EObject entryRuleQtReturnValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtReturnValue = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1216:2: (iv_ruleQtReturnValue= ruleQtReturnValue EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1217:2: iv_ruleQtReturnValue= ruleQtReturnValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtReturnValueRule()); 
            }
            pushFollow(FOLLOW_ruleQtReturnValue_in_entryRuleQtReturnValue2396);
            iv_ruleQtReturnValue=ruleQtReturnValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtReturnValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtReturnValue2406); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQtReturnValue"


    // $ANTLR start "ruleQtReturnValue"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1224:1: ruleQtReturnValue returns [EObject current=null] : ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleQtReturnValue() throws RecognitionException {
        EObject current = null;

        Token lv_const_0_0=null;
        Token otherlv_2=null;
        Enumerator lv_valueType_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1227:28: ( ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1228:1: ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( (otherlv_2= RULE_ID ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1228:1: ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( (otherlv_2= RULE_ID ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1228:2: ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( (otherlv_2= RULE_ID ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1228:2: ( (lv_const_0_0= 'const' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1229:1: (lv_const_0_0= 'const' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1229:1: (lv_const_0_0= 'const' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1230:3: lv_const_0_0= 'const'
                    {
                    lv_const_0_0=(Token)match(input,28,FOLLOW_28_in_ruleQtReturnValue2449); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_const_0_0, grammarAccess.getQtReturnValueAccess().getConstConstKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getQtReturnValueRule());
                      	        }
                             		setWithLastConsumed(current, "const", lv_const_0_0, "const");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1243:3: ( (lv_valueType_1_0= ruleType ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=88 && LA27_0<=89)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1244:1: (lv_valueType_1_0= ruleType )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1244:1: (lv_valueType_1_0= ruleType )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1245:3: lv_valueType_1_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtReturnValueAccess().getValueTypeTypeEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleQtReturnValue2484);
                    lv_valueType_1_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getQtReturnValueRule());
                      	        }
                             		set(
                             			current, 
                             			"valueType",
                              		lv_valueType_1_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1261:3: ( (otherlv_2= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1262:1: (otherlv_2= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1262:1: (otherlv_2= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1263:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getQtReturnValueRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtReturnValue2505); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getQtReturnValueAccess().getTypeQtTypeCrossReference_2_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQtReturnValue"


    // $ANTLR start "entryRuleQtSignal"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1282:1: entryRuleQtSignal returns [EObject current=null] : iv_ruleQtSignal= ruleQtSignal EOF ;
    public final EObject entryRuleQtSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtSignal = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1283:2: (iv_ruleQtSignal= ruleQtSignal EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1284:2: iv_ruleQtSignal= ruleQtSignal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtSignalRule()); 
            }
            pushFollow(FOLLOW_ruleQtSignal_in_entryRuleQtSignal2541);
            iv_ruleQtSignal=ruleQtSignal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtSignal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtSignal2551); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQtSignal"


    // $ANTLR start "ruleQtSignal"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1291:1: ruleQtSignal returns [EObject current=null] : (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtValue ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' ) ;
    public final EObject ruleQtSignal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_returnValue_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1294:28: ( (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtValue ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1295:1: (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtValue ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1295:1: (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtValue ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1295:3: otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtValue ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleQtSignal2588); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtSignalAccess().getSignalKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1299:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1300:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1300:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1301:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtSignal2605); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getQtSignalAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQtSignalRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleQtSignal2622); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQtSignalAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1321:1: ( ( (lv_params_3_0= ruleQtValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtValue ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||LA29_0==28||(LA29_0>=88 && LA29_0<=89)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1321:2: ( (lv_params_3_0= ruleQtValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtValue ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1321:2: ( (lv_params_3_0= ruleQtValue ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1322:1: (lv_params_3_0= ruleQtValue )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1322:1: (lv_params_3_0= ruleQtValue )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1323:3: lv_params_3_0= ruleQtValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtSignalAccess().getParamsQtValueParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQtValue_in_ruleQtSignal2644);
                    lv_params_3_0=ruleQtValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getQtSignalRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_3_0, 
                              		"QtValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1339:2: (otherlv_4= ',' ( (lv_params_5_0= ruleQtValue ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==16) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1339:4: otherlv_4= ',' ( (lv_params_5_0= ruleQtValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleQtSignal2657); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getQtSignalAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1343:1: ( (lv_params_5_0= ruleQtValue ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1344:1: (lv_params_5_0= ruleQtValue )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1344:1: (lv_params_5_0= ruleQtValue )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1345:3: lv_params_5_0= ruleQtValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getQtSignalAccess().getParamsQtValueParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQtValue_in_ruleQtSignal2678);
                    	    lv_params_5_0=ruleQtValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getQtSignalRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_5_0, 
                    	              		"QtValue");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleQtSignal2694); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getQtSignalAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleQtSignal2706); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getQtSignalAccess().getColonKeyword_5());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1369:1: ( (lv_returnValue_8_0= ruleQtReturnValue ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1370:1: (lv_returnValue_8_0= ruleQtReturnValue )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1370:1: (lv_returnValue_8_0= ruleQtReturnValue )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1371:3: lv_returnValue_8_0= ruleQtReturnValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtSignalAccess().getReturnValueQtReturnValueParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQtReturnValue_in_ruleQtSignal2727);
            lv_returnValue_8_0=ruleQtReturnValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQtSignalRule());
              	        }
                     		set(
                     			current, 
                     			"returnValue",
                      		lv_returnValue_8_0, 
                      		"QtReturnValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleQtSignal2739); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getQtSignalAccess().getSemicolonKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQtSignal"


    // $ANTLR start "entryRuleQtSlot"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1399:1: entryRuleQtSlot returns [EObject current=null] : iv_ruleQtSlot= ruleQtSlot EOF ;
    public final EObject entryRuleQtSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtSlot = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1400:2: (iv_ruleQtSlot= ruleQtSlot EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1401:2: iv_ruleQtSlot= ruleQtSlot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtSlotRule()); 
            }
            pushFollow(FOLLOW_ruleQtSlot_in_entryRuleQtSlot2775);
            iv_ruleQtSlot=ruleQtSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtSlot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtSlot2785); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQtSlot"


    // $ANTLR start "ruleQtSlot"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1408:1: ruleQtSlot returns [EObject current=null] : (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtValue ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' ) ;
    public final EObject ruleQtSlot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_returnValue_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1411:28: ( (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtValue ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1412:1: (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtValue ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1412:1: (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtValue ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1412:3: otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtValue ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleQtSlot2822); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtSlotAccess().getSlotKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1416:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1417:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1417:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1418:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtSlot2839); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getQtSlotAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQtSlotRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleQtSlot2856); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQtSlotAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1438:1: ( ( (lv_params_3_0= ruleQtValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtValue ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID||LA31_0==28||(LA31_0>=88 && LA31_0<=89)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1438:2: ( (lv_params_3_0= ruleQtValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtValue ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1438:2: ( (lv_params_3_0= ruleQtValue ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1439:1: (lv_params_3_0= ruleQtValue )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1439:1: (lv_params_3_0= ruleQtValue )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1440:3: lv_params_3_0= ruleQtValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtSlotAccess().getParamsQtValueParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQtValue_in_ruleQtSlot2878);
                    lv_params_3_0=ruleQtValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getQtSlotRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_3_0, 
                              		"QtValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1456:2: (otherlv_4= ',' ( (lv_params_5_0= ruleQtValue ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==16) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1456:4: otherlv_4= ',' ( (lv_params_5_0= ruleQtValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleQtSlot2891); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getQtSlotAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1460:1: ( (lv_params_5_0= ruleQtValue ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1461:1: (lv_params_5_0= ruleQtValue )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1461:1: (lv_params_5_0= ruleQtValue )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1462:3: lv_params_5_0= ruleQtValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getQtSlotAccess().getParamsQtValueParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQtValue_in_ruleQtSlot2912);
                    	    lv_params_5_0=ruleQtValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getQtSlotRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_5_0, 
                    	              		"QtValue");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleQtSlot2928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getQtSlotAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleQtSlot2940); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getQtSlotAccess().getColonKeyword_5());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1486:1: ( (lv_returnValue_8_0= ruleQtReturnValue ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1487:1: (lv_returnValue_8_0= ruleQtReturnValue )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1487:1: (lv_returnValue_8_0= ruleQtReturnValue )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1488:3: lv_returnValue_8_0= ruleQtReturnValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtSlotAccess().getReturnValueQtReturnValueParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQtReturnValue_in_ruleQtSlot2961);
            lv_returnValue_8_0=ruleQtReturnValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQtSlotRule());
              	        }
                     		set(
                     			current, 
                     			"returnValue",
                      		lv_returnValue_8_0, 
                      		"QtReturnValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleQtSlot2973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getQtSlotAccess().getSemicolonKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQtSlot"


    // $ANTLR start "entryRuleXExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1516:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1517:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1518:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression3009);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression3019); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1525:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1528:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1530:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression3065);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1546:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1547:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1548:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment3099);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment3109); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1555:1: ruleXAssignment returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1558:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1559:1: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1559:1: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==25) ) {
                    alt33=1;
                }
                else if ( (LA33_1==EOF||(LA33_1>=RULE_ID && LA33_1<=RULE_STRING)||(LA33_1>=12 && LA33_1<=13)||LA33_1==16||LA33_1==18||LA33_1==21||LA33_1==24||LA33_1==30||(LA33_1>=33 && LA33_1<=80)) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA33_0>=RULE_INT && LA33_0<=RULE_STRING)||LA33_0==12||LA33_0==18||LA33_0==42||(LA33_0>=45 && LA33_0<=46)||LA33_0==51||LA33_0==56||LA33_0==58||LA33_0==60||(LA33_0>=63 && LA33_0<=65)||LA33_0==68||(LA33_0>=70 && LA33_0<=77)) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1559:2: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1559:2: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1559:3: () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1559:3: ()
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1560:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1565:2: ( (otherlv_1= RULE_ID ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1566:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1566:1: (otherlv_1= RULE_ID )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1567:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXAssignment3164); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment3180);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1586:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1587:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1587:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1588:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment3200);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1605:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1605:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1606:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment3230);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1614:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==33) ) {
                        int LA32_1 = input.LA(2);

                        if ( (synpred1_InternalQIdl()) ) {
                            alt32=1;
                        }
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1614:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1614:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1614:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1619:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1619:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1619:7: ()
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1620:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1625:2: ( ( ruleOpMultiAssign ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1626:1: ( ruleOpMultiAssign )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1626:1: ( ruleOpMultiAssign )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1627:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment3283);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1640:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1641:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1641:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1642:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment3306);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1666:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1667:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1668:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign3346);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign3357); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1675:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1678:28: (kw= '=' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1680:2: kw= '='
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpSingleAssign3394); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1693:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1694:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1695:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign3434);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign3445); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1702:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1705:28: (kw= '+=' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1707:2: kw= '+='
            {
            kw=(Token)match(input,33,FOLLOW_33_in_ruleOpMultiAssign3482); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1720:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1721:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1722:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression3521);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression3531); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1729:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1732:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1733:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1733:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1734:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression3578);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1742:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==34) ) {
                    int LA34_2 = input.LA(2);

                    if ( (synpred2_InternalQIdl()) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1742:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1742:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1742:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1747:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1747:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1747:7: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1748:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1753:2: ( ( ruleOpOr ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1754:1: ( ruleOpOr )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1754:1: ( ruleOpOr )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1755:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression3631);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1768:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1769:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1769:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1770:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression3654);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1794:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1795:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1796:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr3693);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr3704); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1803:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1806:28: (kw= '||' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1808:2: kw= '||'
            {
            kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOr3741); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1821:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1822:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1823:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression3780);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression3790); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1830:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1833:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1834:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1834:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1835:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3837);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1843:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==35) ) {
                    int LA35_2 = input.LA(2);

                    if ( (synpred3_InternalQIdl()) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1843:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1843:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1843:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1848:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1848:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1848:7: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1849:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1854:2: ( ( ruleOpAnd ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1855:1: ( ruleOpAnd )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1855:1: ( ruleOpAnd )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1856:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression3890);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1869:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1870:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1870:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1871:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3913);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1895:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1896:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1897:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd3952);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd3963); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1904:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1907:28: (kw= '&&' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1909:2: kw= '&&'
            {
            kw=(Token)match(input,35,FOLLOW_35_in_ruleOpAnd4000); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1922:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1923:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1924:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression4039);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression4049); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1931:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1934:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1935:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1935:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1936:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression4096);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1944:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==36) ) {
                    int LA36_2 = input.LA(2);

                    if ( (synpred4_InternalQIdl()) ) {
                        alt36=1;
                    }


                }
                else if ( (LA36_0==37) ) {
                    int LA36_3 = input.LA(2);

                    if ( (synpred4_InternalQIdl()) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1944:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1944:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1944:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1949:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1949:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1949:7: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1950:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1955:2: ( ( ruleOpEquality ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1956:1: ( ruleOpEquality )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1956:1: ( ruleOpEquality )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1957:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression4149);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1970:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1971:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1971:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1972:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression4172);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1996:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1997:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1998:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality4211);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality4222); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2005:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2008:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2009:1: (kw= '==' | kw= '!=' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2009:1: (kw= '==' | kw= '!=' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==36) ) {
                alt37=1;
            }
            else if ( (LA37_0==37) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2010:2: kw= '=='
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpEquality4260); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2017:2: kw= '!='
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpEquality4279); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2030:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2031:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2032:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression4319);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression4329); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2039:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2042:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2043:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2043:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2044:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4376);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2052:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop38:
            do {
                int alt38=3;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    int LA38_2 = input.LA(2);

                    if ( (synpred5_InternalQIdl()) ) {
                        alt38=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA38_3 = input.LA(2);

                    if ( (synpred6_InternalQIdl()) ) {
                        alt38=2;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA38_4 = input.LA(2);

                    if ( (synpred6_InternalQIdl()) ) {
                        alt38=2;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA38_5 = input.LA(2);

                    if ( (synpred6_InternalQIdl()) ) {
                        alt38=2;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA38_6 = input.LA(2);

                    if ( (synpred6_InternalQIdl()) ) {
                        alt38=2;
                    }


                    }
                    break;

                }

                switch (alt38) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2052:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2052:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2052:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2052:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2052:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2054:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2054:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2054:6: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2055:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXRelationalExpression4412); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2064:3: ( ( ruleQualifiedName ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2065:1: ( ruleQualifiedName )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2065:1: ( ruleQualifiedName )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2066:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression4437);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2080:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2080:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2080:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2080:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2080:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2085:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2085:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2085:7: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2086:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2091:2: ( ( ruleOpCompare ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2092:1: ( ruleOpCompare )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2092:1: ( ruleOpCompare )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2093:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression4498);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2106:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2107:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2107:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2108:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4521);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2132:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2133:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2134:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare4561);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare4572); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2141:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2144:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2145:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2145:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt39=1;
                }
                break;
            case 40:
                {
                alt39=2;
                }
                break;
            case 41:
                {
                alt39=3;
                }
                break;
            case 42:
                {
                alt39=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2146:2: kw= '>='
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpCompare4610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2153:2: kw= '<='
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpCompare4629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2160:2: kw= '>'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpCompare4648); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2167:2: kw= '<'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpCompare4667); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2180:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2181:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2182:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression4707);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression4717); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2189:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2192:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2193:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2193:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2194:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4764);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2202:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==43) ) {
                    int LA40_2 = input.LA(2);

                    if ( (synpred7_InternalQIdl()) ) {
                        alt40=1;
                    }


                }
                else if ( (LA40_0==44) ) {
                    int LA40_3 = input.LA(2);

                    if ( (synpred7_InternalQIdl()) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2202:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2202:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2202:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2207:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2207:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2207:7: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2208:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2213:2: ( ( ruleOpOther ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2214:1: ( ruleOpOther )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2214:1: ( ruleOpOther )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2215:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression4817);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2228:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2229:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2229:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2230:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4840);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2254:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2255:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2256:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther4879);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther4890); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2263:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2266:28: ( (kw= '->' | kw= '..' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2267:1: (kw= '->' | kw= '..' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2267:1: (kw= '->' | kw= '..' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            else if ( (LA41_0==44) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2268:2: kw= '->'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpOther4928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2275:2: kw= '..'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpOther4947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2288:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2289:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2290:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4987);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression4997); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2297:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2300:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2301:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2301:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2302:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5044);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2310:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==45) ) {
                    int LA42_2 = input.LA(2);

                    if ( (synpred8_InternalQIdl()) ) {
                        alt42=1;
                    }


                }
                else if ( (LA42_0==46) ) {
                    int LA42_3 = input.LA(2);

                    if ( (synpred8_InternalQIdl()) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2310:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2310:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2310:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2315:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2315:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2315:7: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2316:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2321:2: ( ( ruleOpAdd ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2322:1: ( ruleOpAdd )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2322:1: ( ruleOpAdd )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2323:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression5097);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2336:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2337:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2337:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2338:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5120);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2362:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2363:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2364:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd5159);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd5170); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2371:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2374:28: ( (kw= '+' | kw= '-' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2375:1: (kw= '+' | kw= '-' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2375:1: (kw= '+' | kw= '-' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==45) ) {
                alt43=1;
            }
            else if ( (LA43_0==46) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2376:2: kw= '+'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpAdd5208); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2383:2: kw= '-'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpAdd5227); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2396:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2397:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2398:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression5267);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression5277); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2405:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2408:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2409:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2409:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2410:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5324);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2418:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop44:
            do {
                int alt44=2;
                switch ( input.LA(1) ) {
                case 47:
                    {
                    int LA44_2 = input.LA(2);

                    if ( (synpred9_InternalQIdl()) ) {
                        alt44=1;
                    }


                    }
                    break;
                case 48:
                    {
                    int LA44_3 = input.LA(2);

                    if ( (synpred9_InternalQIdl()) ) {
                        alt44=1;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA44_4 = input.LA(2);

                    if ( (synpred9_InternalQIdl()) ) {
                        alt44=1;
                    }


                    }
                    break;
                case 50:
                    {
                    int LA44_5 = input.LA(2);

                    if ( (synpred9_InternalQIdl()) ) {
                        alt44=1;
                    }


                    }
                    break;

                }

                switch (alt44) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2418:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2418:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2418:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2423:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2423:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2423:7: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2424:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2429:2: ( ( ruleOpMulti ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2430:1: ( ruleOpMulti )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2430:1: ( ruleOpMulti )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2431:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression5377);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2444:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2445:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2445:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2446:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5400);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2470:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2471:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2472:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti5439);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti5450); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2479:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2482:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2483:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2483:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt45=1;
                }
                break;
            case 48:
                {
                alt45=2;
                }
                break;
            case 49:
                {
                alt45=3;
                }
                break;
            case 50:
                {
                alt45=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2484:2: kw= '*'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpMulti5488); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2491:2: kw= '**'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOpMulti5507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2498:2: kw= '/'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleOpMulti5526); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2505:2: kw= '%'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleOpMulti5545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2518:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2519:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2520:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation5585);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation5595); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2527:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2530:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2531:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2531:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=45 && LA46_0<=46)||LA46_0==51) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_STRING)||LA46_0==12||LA46_0==18||LA46_0==42||LA46_0==56||LA46_0==58||LA46_0==60||(LA46_0>=63 && LA46_0<=65)||LA46_0==68||(LA46_0>=70 && LA46_0<=77)) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2531:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2531:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2531:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2531:3: ()
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2532:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2537:2: ( ( ruleOpUnary ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2538:1: ( ruleOpUnary )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2538:1: ( ruleOpUnary )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2539:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation5653);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2552:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2553:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2553:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2554:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5674);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2572:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5703);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2588:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2589:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2590:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary5739);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary5750); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2597:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2600:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2601:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2601:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt47=1;
                }
                break;
            case 46:
                {
                alt47=2;
                }
                break;
            case 45:
                {
                alt47=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2602:2: kw= '!'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleOpUnary5788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2609:2: kw= '-'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpUnary5807); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2616:2: kw= '+'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpUnary5826); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2629:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2630:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2631:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5866);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression5876); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2638:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2641:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2642:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2642:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2643:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5923);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2651:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==52) ) {
                    int LA48_2 = input.LA(2);

                    if ( (synpred10_InternalQIdl()) ) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2651:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2651:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2651:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2653:5: ( () otherlv_2= 'as' )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2653:6: () otherlv_2= 'as'
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2653:6: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2654:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleXCastedExpression5958); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2663:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2664:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2664:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2665:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5981);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2689:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2690:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2691:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall6019);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall6029); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2698:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2701:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2702:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2702:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2703:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall6076);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2711:1: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            loop55:
            do {
                int alt55=3;
                switch ( input.LA(1) ) {
                case 53:
                    {
                    int LA55_2 = input.LA(2);

                    if ( (synpred11_InternalQIdl()) ) {
                        alt55=1;
                    }
                    else if ( (synpred12_InternalQIdl()) ) {
                        alt55=2;
                    }


                    }
                    break;
                case 54:
                    {
                    int LA55_3 = input.LA(2);

                    if ( (synpred12_InternalQIdl()) ) {
                        alt55=2;
                    }


                    }
                    break;
                case 55:
                    {
                    int LA55_4 = input.LA(2);

                    if ( (synpred12_InternalQIdl()) ) {
                        alt55=2;
                    }


                    }
                    break;

                }

                switch (alt55) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2711:2: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2711:2: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2711:3: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2711:3: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2711:4: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2718:25: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2718:26: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2718:26: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2719:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleXMemberFeatureCall6125); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2728:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2729:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2729:1: (otherlv_3= RULE_ID )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2730:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXMemberFeatureCall6145); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall6161);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2749:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2750:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2750:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2751:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall6183);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2768:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2768:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2768:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2768:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2768:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2784:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2784:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2784:8: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2785:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2790:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt49=3;
            	    switch ( input.LA(1) ) {
            	    case 53:
            	        {
            	        alt49=1;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt49=2;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt49=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 49, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt49) {
            	        case 1 :
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2790:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleXMemberFeatureCall6269); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2795:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2795:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2796:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2796:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2797:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,54,FOLLOW_54_in_ruleXMemberFeatureCall6293); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2811:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2811:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2812:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2812:1: (lv_spreading_9_0= '*.' )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2813:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,55,FOLLOW_55_in_ruleXMemberFeatureCall6330); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2826:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==42) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2826:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall6359); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2830:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2831:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2831:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2832:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6380);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2848:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop50:
            	            do {
            	                int alt50=2;
            	                int LA50_0 = input.LA(1);

            	                if ( (LA50_0==16) ) {
            	                    alt50=1;
            	                }


            	                switch (alt50) {
            	            	case 1 :
            	            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2848:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall6393); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2852:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2853:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2853:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2854:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6414);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop50;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall6428); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2874:3: ( (otherlv_15= RULE_ID ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2875:1: (otherlv_15= RULE_ID )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2875:1: (otherlv_15= RULE_ID )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2876:3: otherlv_15= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXMemberFeatureCall6450); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_15, grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2887:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt54=2;
            	    alt54 = dfa54.predict(input);
            	    switch (alt54) {
            	        case 1 :
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2887:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2887:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2887:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2894:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2895:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,18,FOLLOW_18_in_ruleXMemberFeatureCall6484); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2908:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt53=3;
            	            alt53 = dfa53.predict(input);
            	            switch (alt53) {
            	                case 1 :
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2908:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2908:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2908:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2920:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2921:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall6559);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2938:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2938:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2938:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2938:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2939:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2939:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2940:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6587);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2956:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop52:
            	                    do {
            	                        int alt52=2;
            	                        int LA52_0 = input.LA(1);

            	                        if ( (LA52_0==16) ) {
            	                            alt52=1;
            	                        }


            	                        switch (alt52) {
            	                    	case 1 :
            	                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2956:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall6600); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2960:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2961:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2961:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2962:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6621);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop52;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,30,FOLLOW_30_in_ruleXMemberFeatureCall6638); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2990:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2991:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2992:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression6679);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression6689); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2999:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3002:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3003:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3003:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt56=13;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt56=1;
                }
                break;
            case 12:
                {
                alt56=2;
                }
                break;
            case 60:
                {
                alt56=3;
                }
                break;
            case RULE_ID:
            case 42:
            case 68:
                {
                alt56=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 56:
            case 71:
            case 72:
            case 73:
            case 74:
                {
                alt56=5;
                }
                break;
            case 58:
                {
                alt56=6;
                }
                break;
            case 63:
                {
                alt56=7;
                }
                break;
            case 64:
                {
                alt56=8;
                }
                break;
            case 65:
                {
                alt56=9;
                }
                break;
            case 75:
                {
                alt56=10;
                }
                break;
            case 76:
                {
                alt56=11;
                }
                break;
            case 77:
                {
                alt56=12;
                }
                break;
            case 18:
                {
                alt56=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3004:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression6736);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3014:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression6763);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3024:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression6790);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3034:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression6817);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3044:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression6844);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3054:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression6871);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3064:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression6898);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3074:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression6925);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3084:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression6952);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3094:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression6979);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3104:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression7006);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3114:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression7033);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3124:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression7060);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3140:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3141:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3142:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral7095);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral7105); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3149:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XIntLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3152:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3153:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3153:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt57=6;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt57=1;
                }
                break;
            case 71:
            case 72:
                {
                alt57=2;
                }
                break;
            case RULE_INT:
                {
                alt57=3;
                }
                break;
            case 73:
                {
                alt57=4;
                }
                break;
            case RULE_STRING:
                {
                alt57=5;
                }
                break;
            case 74:
                {
                alt57=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3154:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral7152);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3164:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral7179);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3174:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral7206);
                    this_XIntLiteral_2=ruleXIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIntLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3184:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral7233);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3194:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral7260);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3204:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral7287);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3220:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3221:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3222:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure7322);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure7332); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3229:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_formalParameters_2_0 = null;

        EObject lv_formalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3232:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3233:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3233:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3233:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3233:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3234:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXClosure7378); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3243:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID||LA59_0==18||LA59_0==80) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3243:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3243:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3244:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3244:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3245:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7400);
                    lv_formalParameters_2_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParameters",
                              		lv_formalParameters_2_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3261:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==16) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3261:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleXClosure7413); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3265:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3266:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3266:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3267:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7434);
                    	    lv_formalParameters_4_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParameters",
                    	              		lv_formalParameters_4_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleXClosure7450); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3287:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3288:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3288:1: (lv_expression_6_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3289:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure7471);
            lv_expression_6_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleXClosure7483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3317:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3318:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3319:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure7519);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure7529); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3326:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3329:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3330:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3330:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3330:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3330:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3330:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3341:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3341:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3341:6: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3342:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3347:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID||LA61_0==18||LA61_0==80) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3347:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3347:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3348:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3348:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3349:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7627);
                    lv_formalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParameters",
                              		lv_formalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3365:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==16) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3365:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXShortClosure7640); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3369:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3370:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3370:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3371:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7661);
                    	    lv_formalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParameters",
                    	              		lv_formalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleXShortClosure7677); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3391:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3392:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3392:1: (lv_expression_5_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3393:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure7700);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3417:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3418:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3419:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression7736);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression7746); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3426:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3429:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3430:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3430:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3430:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleXParenthesizedExpression7783); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7805);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleXParenthesizedExpression7816); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3455:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3456:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3457:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7852);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression7862); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3464:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3467:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3468:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3468:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3468:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3468:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3469:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXIfExpression7908); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleXIfExpression7920); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3482:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3483:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3483:1: (lv_if_3_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3484:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7941);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleXIfExpression7953); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3504:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3505:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3505:1: (lv_then_5_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3506:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7974);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3522:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==59) ) {
                int LA62_1 = input.LA(2);

                if ( (synpred16_InternalQIdl()) ) {
                    alt62=1;
                }
            }
            switch (alt62) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3522:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3522:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3522:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,59,FOLLOW_59_in_ruleXIfExpression7995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3527:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3528:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3528:1: (lv_else_7_0= ruleXExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3529:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression8017);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3553:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3554:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3555:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression8055);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression8065); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3562:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_localVarName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_switch_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_default_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3565:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3566:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3566:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3566:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3566:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3567:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXSwitchExpression8111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3576:1: ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==24) ) {
                    alt63=1;
                }
            }
            switch (alt63) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3576:2: ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':'
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3576:2: ( (lv_localVarName_2_0= RULE_ID ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3577:1: (lv_localVarName_2_0= RULE_ID )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3577:1: (lv_localVarName_2_0= RULE_ID )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3578:3: lv_localVarName_2_0= RULE_ID
                    {
                    lv_localVarName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXSwitchExpression8129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_localVarName_2_0, grammarAccess.getXSwitchExpressionAccess().getLocalVarNameIDTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleXSwitchExpression8146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3598:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3599:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3599:1: (lv_switch_4_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3600:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression8169);
            lv_switch_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switch",
                      		lv_switch_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleXSwitchExpression8181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3620:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_ID||LA64_0==18||LA64_0==24||LA64_0==62||LA64_0==80) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3621:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3621:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3622:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression8202);
            	    lv_cases_6_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_6_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt64 >= 1 ) break loop64;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
            } while (true);

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3638:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==61) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3638:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,61,FOLLOW_61_in_ruleXSwitchExpression8216); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleXSwitchExpression8228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3646:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3647:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3647:1: (lv_default_9_0= ruleXExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3648:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression8249);
                    lv_default_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_9_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleXSwitchExpression8263); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3676:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3677:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3678:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart8299);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart8309); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3685:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3688:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3689:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3689:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3689:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3689:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID||LA66_0==18||LA66_0==80) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3690:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3690:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3691:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart8355);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3707:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==62) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3707:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXCasePart8369); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3711:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3712:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3712:1: (lv_case_2_0= ruleXExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3713:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart8390);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleXCasePart8404); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3733:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3734:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3734:1: (lv_then_4_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3735:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart8425);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3759:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3760:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3761:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression8461);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression8471); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3768:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3771:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3772:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3772:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3772:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3772:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3773:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXForLoopExpression8517); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleXForLoopExpression8529); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3786:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3787:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3787:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3788:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression8550);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleXForLoopExpression8562); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3808:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3809:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3809:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3810:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression8583);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleXForLoopExpression8595); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3830:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3831:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3831:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3832:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression8616);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3856:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3857:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3858:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression8652);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression8662); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3865:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3868:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3869:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3869:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3869:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3869:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3870:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXWhileExpression8708); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleXWhileExpression8720); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3883:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3884:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3884:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3885:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression8741);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleXWhileExpression8753); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3905:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3906:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3906:1: (lv_body_5_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3907:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression8774);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3931:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3932:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3933:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8810);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression8820); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3940:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3943:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3944:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3944:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3944:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3944:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3945:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXDoWhileExpression8866); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3954:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3955:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3955:1: (lv_body_2_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3956:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8887);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,64,FOLLOW_64_in_ruleXDoWhileExpression8899); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleXDoWhileExpression8911); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3980:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3981:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3981:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3982:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8932);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleXDoWhileExpression8944); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4010:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4011:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4012:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8980);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression8990); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4019:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4022:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4023:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4023:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4023:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4023:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4024:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleXBlockExpression9036); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4033:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( ((LA69_0>=RULE_ID && LA69_0<=RULE_STRING)||LA69_0==12||LA69_0==18||LA69_0==42||(LA69_0>=45 && LA69_0<=46)||LA69_0==51||LA69_0==56||LA69_0==58||LA69_0==60||(LA69_0>=63 && LA69_0<=68)||(LA69_0>=70 && LA69_0<=77)) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4033:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4033:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4034:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4034:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4035:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression9058);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4051:2: (otherlv_3= ';' )?
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==21) ) {
            	        alt68=1;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4051:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleXBlockExpression9071); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleXBlockExpression9087); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4067:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4068:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4069:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock9123);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock9133); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4076:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4079:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4080:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4080:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=66 && LA70_0<=67)) ) {
                alt70=1;
            }
            else if ( ((LA70_0>=RULE_ID && LA70_0<=RULE_STRING)||LA70_0==12||LA70_0==18||LA70_0==42||(LA70_0>=45 && LA70_0<=46)||LA70_0==51||LA70_0==56||LA70_0==58||LA70_0==60||(LA70_0>=63 && LA70_0<=65)||LA70_0==68||(LA70_0>=70 && LA70_0<=77)) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4081:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock9180);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4091:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock9207);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4107:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4108:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4109:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration9242);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration9252); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4116:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4119:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4120:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4120:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4120:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4120:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4121:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4126:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==66) ) {
                alt71=1;
            }
            else if ( (LA71_0==67) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4126:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4126:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4127:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4127:1: (lv_writeable_1_0= 'var' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4128:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,66,FOLLOW_66_in_ruleXVariableDeclaration9305); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4142:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleXVariableDeclaration9336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4146:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ID) ) {
                int LA72_1 = input.LA(2);

                if ( (synpred17_InternalQIdl()) ) {
                    alt72=1;
                }
                else if ( (true) ) {
                    alt72=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA72_0==18) && (synpred17_InternalQIdl())) {
                alt72=1;
            }
            else if ( (LA72_0==80) && (synpred17_InternalQIdl())) {
                alt72=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4146:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4146:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4146:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4155:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4155:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4155:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4156:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4156:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4157:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration9385);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4173:2: ( (lv_name_4_0= RULE_ID ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4174:1: (lv_name_4_0= RULE_ID )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4174:1: (lv_name_4_0= RULE_ID )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4175:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXVariableDeclaration9402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_4_0, grammarAccess.getXVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4192:6: ( (lv_name_5_0= RULE_ID ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4192:6: ( (lv_name_5_0= RULE_ID ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4193:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4193:1: (lv_name_5_0= RULE_ID )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4194:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXVariableDeclaration9432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_5_0, grammarAccess.getXVariableDeclarationAccess().getNameIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4210:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==25) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4210:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleXVariableDeclaration9451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4214:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4215:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4215:1: (lv_right_7_0= ruleXExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4216:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration9472);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4240:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4241:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4242:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter9510);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter9520); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4249:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_parameterType_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4252:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4253:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4253:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4253:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4253:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_ID) ) {
                int LA74_1 = input.LA(2);

                if ( (LA74_1==RULE_ID||LA74_1==42||LA74_1==53) ) {
                    alt74=1;
                }
            }
            else if ( (LA74_0==18||LA74_0==80) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4254:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4254:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4255:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter9566);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4271:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4272:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4272:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4273:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJvmFormalParameter9584); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getJvmFormalParameterAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4297:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4298:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4299:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall9625);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall9635); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4306:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4309:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4310:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4310:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4310:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4310:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4311:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4316:2: ( ( ruleStaticQualifier ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID) ) {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==69) ) {
                    alt75=1;
                }
            }
            switch (alt75) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4317:1: ( ruleStaticQualifier )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4317:1: ( ruleStaticQualifier )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4318:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall9692);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4331:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==42) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4331:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXFeatureCall9706); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4335:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4336:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4336:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4337:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9727);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4353:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==16) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4353:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleXFeatureCall9740); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4357:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4358:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4358:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4359:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9761);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall9775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4379:3: ( ( ruleIdOrSuper ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4380:1: ( ruleIdOrSuper )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4380:1: ( ruleIdOrSuper )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4381:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9800);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4394:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt80=2;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4394:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4394:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4394:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4401:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4402:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,18,FOLLOW_18_in_ruleXFeatureCall9834); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4415:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt79=3;
                    alt79 = dfa79.predict(input);
                    switch (alt79) {
                        case 1 :
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4415:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4415:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4415:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4427:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4428:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9909);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4445:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4445:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4445:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4445:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4446:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4446:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4447:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9937);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4463:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop78:
                            do {
                                int alt78=2;
                                int LA78_0 = input.LA(1);

                                if ( (LA78_0==16) ) {
                                    alt78=1;
                                }


                                switch (alt78) {
                            	case 1 :
                            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4463:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleXFeatureCall9950); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4467:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4468:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4468:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4469:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9971);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop78;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,30,FOLLOW_30_in_ruleXFeatureCall9988); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4497:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4498:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4499:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper10027);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper10038); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4506:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4509:28: ( (this_ID_0= RULE_ID | kw= 'super' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4510:1: (this_ID_0= RULE_ID | kw= 'super' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4510:1: (this_ID_0= RULE_ID | kw= 'super' )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID) ) {
                alt81=1;
            }
            else if ( (LA81_0==68) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4510:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdOrSuper10078); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getIdOrSuperAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4519:2: kw= 'super'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleIdOrSuper10102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4532:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4533:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4534:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier10143);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier10154); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4541:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4544:28: ( (this_ID_0= RULE_ID kw= '::' )+ )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4545:1: (this_ID_0= RULE_ID kw= '::' )+
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4545:1: (this_ID_0= RULE_ID kw= '::' )+
            int cnt82=0;
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==RULE_ID) ) {
                    int LA82_2 = input.LA(2);

                    if ( (LA82_2==69) ) {
                        alt82=1;
                    }


                }


                switch (alt82) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4545:6: this_ID_0= RULE_ID kw= '::'
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStaticQualifier10194); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_0, grammarAccess.getStaticQualifierAccess().getIDTerminalRuleCall_0()); 
            	          
            	    }
            	    kw=(Token)match(input,69,FOLLOW_69_in_ruleStaticQualifier10212); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt82 >= 1 ) break loop82;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(82, input);
                        throw eee;
                }
                cnt82++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4566:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4567:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4568:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall10253);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall10263); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4575:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4578:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4579:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4579:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4579:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4579:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4580:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXConstructorCall10309); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4589:1: ( ( ruleQualifiedName ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4590:1: ( ruleQualifiedName )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4590:1: ( ruleQualifiedName )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4591:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall10332);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4604:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==42) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4604:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleXConstructorCall10345); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4608:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4609:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4609:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4610:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10366);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4626:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==16) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4626:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleXConstructorCall10379); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4630:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4631:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4631:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4632:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10400);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall10414); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleXConstructorCall10428); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4656:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt86=3;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4656:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4656:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4656:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4668:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4669:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall10490);
                    lv_arguments_9_0=ruleXShortClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_9_0, 
                              		"XShortClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4686:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4686:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4686:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4686:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4687:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4687:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4688:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall10518);
                    lv_arguments_10_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_10_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4704:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==16) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4704:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleXConstructorCall10531); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4708:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4709:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4709:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4710:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall10552);
                    	    lv_arguments_12_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_12_0, 
                    	              		"XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,30,FOLLOW_30_in_ruleXConstructorCall10569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4738:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4739:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4740:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10605);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral10615); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4747:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4750:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4751:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4751:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4751:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4751:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4752:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4757:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==71) ) {
                alt87=1;
            }
            else if ( (LA87_0==72) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4757:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXBooleanLiteral10662); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4762:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4762:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4763:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4763:1: (lv_isTrue_2_0= 'true' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4764:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,72,FOLLOW_72_in_ruleXBooleanLiteral10686); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4785:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4786:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4787:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10736);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral10746); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4794:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4797:28: ( ( () otherlv_1= 'null' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4798:1: ( () otherlv_1= 'null' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4798:1: ( () otherlv_1= 'null' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4798:2: () otherlv_1= 'null'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4798:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4799:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXNullLiteral10792); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXIntLiteral"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4816:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4817:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4818:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral10828);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral10838); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIntLiteral"


    // $ANTLR start "ruleXIntLiteral"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4825:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4828:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4829:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4829:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4829:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4829:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4830:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4835:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4836:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4836:1: (lv_value_1_0= RULE_INT )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4837:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral10889); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXIntLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4861:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4862:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4863:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10930);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral10940); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4870:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4873:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4874:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4874:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4874:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4874:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4875:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4880:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4881:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4881:1: (lv_value_1_0= RULE_STRING )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4882:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral10991); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4906:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4907:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4908:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral11032);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral11042); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4915:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4918:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4919:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4919:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4919:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4919:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4920:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXTypeLiteral11088); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleXTypeLiteral11100); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4933:1: ( ( ruleQualifiedName ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4934:1: ( ruleQualifiedName )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4934:1: ( ruleQualifiedName )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4935:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral11123);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleXTypeLiteral11135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4960:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4961:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4962:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression11171);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression11181); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4969:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4972:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4973:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4973:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4973:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4973:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4974:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXThrowExpression11227); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4983:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4984:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4984:1: (lv_expression_2_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4985:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression11248);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5009:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5010:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5011:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression11284);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression11294); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5018:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5021:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5022:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5022:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5022:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5022:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5023:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleXReturnExpression11340); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5032:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt88=2;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5032:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5037:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5038:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression11371);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5062:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5063:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5064:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression11408);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression11418); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5071:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5074:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5075:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5075:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5075:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5075:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5076:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleXTryCatchFinallyExpression11464); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5085:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5086:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5086:1: (lv_expression_2_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5087:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11485);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5103:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==79) ) {
                alt91=1;
            }
            else if ( (LA91_0==78) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5103:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5103:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5103:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5103:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt89=0;
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==79) ) {
                            int LA89_2 = input.LA(2);

                            if ( (synpred22_InternalQIdl()) ) {
                                alt89=1;
                            }


                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5103:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5105:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5106:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11515);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt89 >= 1 ) break loop89;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(89, input);
                                throw eee;
                        }
                        cnt89++;
                    } while (true);

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5122:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==78) ) {
                        int LA90_1 = input.LA(2);

                        if ( (synpred23_InternalQIdl()) ) {
                            alt90=1;
                        }
                    }
                    switch (alt90) {
                        case 1 :
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5122:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5122:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5122:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,78,FOLLOW_78_in_ruleXTryCatchFinallyExpression11537); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5127:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5128:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5128:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5129:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11559);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5146:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5146:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5146:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,78,FOLLOW_78_in_ruleXTryCatchFinallyExpression11581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5150:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5151:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5151:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5152:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11602);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5176:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5177:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5178:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11640);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause11650); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5185:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5188:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5189:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5189:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5189:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5189:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5189:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleXCatchClause11695); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleXCatchClause11708); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5198:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5199:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5199:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5200:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause11729);
            lv_declaredParam_2_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleXCatchClause11741); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5220:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5221:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5221:1: (lv_expression_4_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5222:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause11762);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5246:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5247:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5248:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11799);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName11810); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5255:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5258:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5259:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5259:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5259:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName11850); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5266:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==53) ) {
                    int LA92_2 = input.LA(2);

                    if ( (LA92_2==RULE_ID) ) {
                        int LA92_3 = input.LA(3);

                        if ( (synpred25_InternalQIdl()) ) {
                            alt92=1;
                        }


                    }


                }


                switch (alt92) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5266:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5266:2: ( ( '.' )=>kw= '.' )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5266:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,53,FOLLOW_53_in_ruleQualifiedName11878); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName11894); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5289:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5290:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5291:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11941);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11951); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5298:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5301:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5302:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5302:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_ID) ) {
                alt93=1;
            }
            else if ( (LA93_0==18||LA93_0==80) ) {
                alt93=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5303:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11998);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5313:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference12025);
                    this_XFunctionTypeRef_1=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5329:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5330:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5331:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef12060);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef12070); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5338:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5341:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5342:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5342:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5342:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5342:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==18) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5342:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleXFunctionTypeRef12108); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5346:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5347:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5347:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5348:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12129);
                    lv_paramTypes_1_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                      	        }
                             		add(
                             			current, 
                             			"paramTypes",
                              		lv_paramTypes_1_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5364:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==16) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5364:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXFunctionTypeRef12142); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5368:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5369:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5369:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5370:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12163);
                    	    lv_paramTypes_3_0=ruleJvmTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"paramTypes",
                    	              		lv_paramTypes_3_0, 
                    	              		"JvmTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop94;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleXFunctionTypeRef12177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,80,FOLLOW_80_in_ruleXFunctionTypeRef12191); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5394:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5395:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5395:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5396:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12212);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5420:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5421:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5422:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference12248);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12258); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5429:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5432:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5433:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5433:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5433:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5433:2: ( ( ruleQualifiedName ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5434:1: ( ruleQualifiedName )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5434:1: ( ruleQualifiedName )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5435:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12306);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5448:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt97=2;
            alt97 = dfa97.predict(input);
            switch (alt97) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5448:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5448:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5448:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleJvmParameterizedTypeReference12327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5453:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5454:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5454:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5455:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12349);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5471:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==16) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5471:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleJvmParameterizedTypeReference12362); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5475:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5476:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5476:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5477:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12383);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop96;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleJvmParameterizedTypeReference12397); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5505:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5506:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5507:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12435);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12445); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5514:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5517:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5518:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5518:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_ID||LA98_0==18||LA98_0==80) ) {
                alt98=1;
            }
            else if ( (LA98_0==81) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5519:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12492);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5529:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12519);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5545:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5546:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5547:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12554);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12564); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5554:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5557:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5558:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5558:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5558:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5558:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5559:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,81,FOLLOW_81_in_ruleJvmWildcardTypeReference12610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5568:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt99=3;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==15) ) {
                alt99=1;
            }
            else if ( (LA99_0==68) ) {
                alt99=2;
            }
            switch (alt99) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5568:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5568:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5569:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5569:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5570:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12632);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5587:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5587:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5588:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5588:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5589:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12659);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5613:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5614:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5615:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12697);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound12707); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5622:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5625:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5626:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5626:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5626:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleJvmUpperBound12744); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5630:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5631:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5631:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5632:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12765);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5656:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5657:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5658:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12801);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12811); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5665:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5668:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5669:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5669:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5669:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleJvmUpperBoundAnded12848); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5673:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5674:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5674:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5675:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12869);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5699:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5700:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5701:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12905);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12915); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5708:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5711:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5712:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5712:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5712:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleJvmLowerBound12952); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5716:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5717:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5717:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5718:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12973);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "ruleVirtuality"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5744:1: ruleVirtuality returns [Enumerator current=null] : ( (enumLiteral_0= 'virtual' ) | (enumLiteral_1= 'purevirtual' ) ) ;
    public final Enumerator ruleVirtuality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5746:28: ( ( (enumLiteral_0= 'virtual' ) | (enumLiteral_1= 'purevirtual' ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5747:1: ( (enumLiteral_0= 'virtual' ) | (enumLiteral_1= 'purevirtual' ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5747:1: ( (enumLiteral_0= 'virtual' ) | (enumLiteral_1= 'purevirtual' ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==83) ) {
                alt100=1;
            }
            else if ( (LA100_0==84) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5747:2: (enumLiteral_0= 'virtual' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5747:2: (enumLiteral_0= 'virtual' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5747:4: enumLiteral_0= 'virtual'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_83_in_ruleVirtuality13025); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVirtualityAccess().getVirtualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVirtualityAccess().getVirtualEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5753:6: (enumLiteral_1= 'purevirtual' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5753:6: (enumLiteral_1= 'purevirtual' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5753:8: enumLiteral_1= 'purevirtual'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_84_in_ruleVirtuality13042); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVirtualityAccess().getPurevirtualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getVirtualityAccess().getPurevirtualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVirtuality"


    // $ANTLR start "ruleVisibility"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5763:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5765:28: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5766:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5766:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==85) ) {
                alt101=1;
            }
            else if ( (LA101_0==86) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5766:2: (enumLiteral_0= 'public' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5766:2: (enumLiteral_0= 'public' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5766:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_85_in_ruleVisibility13087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5772:6: (enumLiteral_1= 'protected' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5772:6: (enumLiteral_1= 'protected' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5772:8: enumLiteral_1= 'protected'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_86_in_ruleVisibility13104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "ruleOwner"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5782:1: ruleOwner returns [Enumerator current=null] : ( (enumLiteral_0= 'member' ) | (enumLiteral_1= 'class' ) ) ;
    public final Enumerator ruleOwner() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5784:28: ( ( (enumLiteral_0= 'member' ) | (enumLiteral_1= 'class' ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5785:1: ( (enumLiteral_0= 'member' ) | (enumLiteral_1= 'class' ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5785:1: ( (enumLiteral_0= 'member' ) | (enumLiteral_1= 'class' ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==87) ) {
                alt102=1;
            }
            else if ( (LA102_0==14) ) {
                alt102=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5785:2: (enumLiteral_0= 'member' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5785:2: (enumLiteral_0= 'member' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5785:4: enumLiteral_0= 'member'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleOwner13149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOwnerAccess().getMemberEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOwnerAccess().getMemberEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5791:6: (enumLiteral_1= 'class' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5791:6: (enumLiteral_1= 'class' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5791:8: enumLiteral_1= 'class'
                    {
                    enumLiteral_1=(Token)match(input,14,FOLLOW_14_in_ruleOwner13166); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOwnerAccess().getClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOwnerAccess().getClassEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOwner"


    // $ANTLR start "ruleType"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5801:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'pointer' ) | (enumLiteral_1= 'reference' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5803:28: ( ( (enumLiteral_0= 'pointer' ) | (enumLiteral_1= 'reference' ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5804:1: ( (enumLiteral_0= 'pointer' ) | (enumLiteral_1= 'reference' ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5804:1: ( (enumLiteral_0= 'pointer' ) | (enumLiteral_1= 'reference' ) )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==88) ) {
                alt103=1;
            }
            else if ( (LA103_0==89) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5804:2: (enumLiteral_0= 'pointer' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5804:2: (enumLiteral_0= 'pointer' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5804:4: enumLiteral_0= 'pointer'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_88_in_ruleType13211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeAccess().getPointerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getPointerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5810:6: (enumLiteral_1= 'reference' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5810:6: (enumLiteral_1= 'reference' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5810:8: enumLiteral_1= 'reference'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_89_in_ruleType13228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeAccess().getReferenceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getReferenceEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleType"

    // $ANTLR start synpred1_InternalQIdl
    public final void synpred1_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1614:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1614:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1614:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1614:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1614:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1615:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1615:2: ( ( ruleOpMultiAssign ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1616:1: ( ruleOpMultiAssign )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1616:1: ( ruleOpMultiAssign )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1617:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalQIdl3251);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalQIdl

    // $ANTLR start synpred2_InternalQIdl
    public final void synpred2_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1742:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1742:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1742:4: ( () ( ( ruleOpOr ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1742:5: () ( ( ruleOpOr ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1742:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1743:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1743:2: ( ( ruleOpOr ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1744:1: ( ruleOpOr )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1744:1: ( ruleOpOr )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1745:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalQIdl3599);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalQIdl

    // $ANTLR start synpred3_InternalQIdl
    public final void synpred3_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1843:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1843:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1843:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1843:5: () ( ( ruleOpAnd ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1843:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1844:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1844:2: ( ( ruleOpAnd ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1845:1: ( ruleOpAnd )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1845:1: ( ruleOpAnd )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1846:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalQIdl3858);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalQIdl

    // $ANTLR start synpred4_InternalQIdl
    public final void synpred4_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1944:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1944:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1944:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1944:5: () ( ( ruleOpEquality ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1944:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1945:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1945:2: ( ( ruleOpEquality ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1946:1: ( ruleOpEquality )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1946:1: ( ruleOpEquality )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1947:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalQIdl4117);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalQIdl

    // $ANTLR start synpred5_InternalQIdl
    public final void synpred5_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2052:4: ( ( () 'instanceof' ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2052:5: ( () 'instanceof' )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2052:5: ( () 'instanceof' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2052:6: () 'instanceof'
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2052:6: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2053:1: 
        {
        }

        match(input,38,FOLLOW_38_in_synpred5_InternalQIdl4393); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalQIdl

    // $ANTLR start synpred6_InternalQIdl
    public final void synpred6_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2080:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2080:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2080:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2080:10: () ( ( ruleOpCompare ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2080:10: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2081:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2081:2: ( ( ruleOpCompare ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2082:1: ( ruleOpCompare )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2082:1: ( ruleOpCompare )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2083:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalQIdl4466);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalQIdl

    // $ANTLR start synpred7_InternalQIdl
    public final void synpred7_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2202:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2202:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2202:4: ( () ( ( ruleOpOther ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2202:5: () ( ( ruleOpOther ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2202:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2203:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2203:2: ( ( ruleOpOther ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2204:1: ( ruleOpOther )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2204:1: ( ruleOpOther )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2205:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalQIdl4785);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalQIdl

    // $ANTLR start synpred8_InternalQIdl
    public final void synpred8_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2310:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2310:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2310:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2310:5: () ( ( ruleOpAdd ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2310:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2311:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2311:2: ( ( ruleOpAdd ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2312:1: ( ruleOpAdd )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2312:1: ( ruleOpAdd )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2313:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalQIdl5065);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalQIdl

    // $ANTLR start synpred9_InternalQIdl
    public final void synpred9_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2418:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2418:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2418:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2418:5: () ( ( ruleOpMulti ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2418:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2419:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2419:2: ( ( ruleOpMulti ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2420:1: ( ruleOpMulti )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2420:1: ( ruleOpMulti )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2421:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalQIdl5345);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalQIdl

    // $ANTLR start synpred10_InternalQIdl
    public final void synpred10_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2651:3: ( ( () 'as' ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2651:4: ( () 'as' )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2651:4: ( () 'as' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2651:5: () 'as'
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2651:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2652:1: 
        {
        }

        match(input,52,FOLLOW_52_in_synpred10_InternalQIdl5939); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalQIdl

    // $ANTLR start synpred11_InternalQIdl
    public final void synpred11_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2711:4: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2711:5: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2711:5: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2711:6: () '.' ( ( RULE_ID ) ) ruleOpSingleAssign
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2711:6: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2712:1: 
        {
        }

        match(input,53,FOLLOW_53_in_synpred11_InternalQIdl6093); if (state.failed) return ;
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2713:1: ( ( RULE_ID ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2714:1: ( RULE_ID )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2714:1: ( RULE_ID )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2715:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred11_InternalQIdl6101); if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalQIdl6108);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalQIdl

    // $ANTLR start synpred12_InternalQIdl
    public final void synpred12_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2768:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2768:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2768:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2768:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2768:10: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2769:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2769:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt104=3;
        switch ( input.LA(1) ) {
        case 53:
            {
            alt104=1;
            }
            break;
        case 54:
            {
            alt104=2;
            }
            break;
        case 55:
            {
            alt104=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 104, 0, input);

            throw nvae;
        }

        switch (alt104) {
            case 1 :
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2769:4: '.'
                {
                match(input,53,FOLLOW_53_in_synpred12_InternalQIdl6208); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2771:6: ( ( '?.' ) )
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2771:6: ( ( '?.' ) )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2772:1: ( '?.' )
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2772:1: ( '?.' )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2773:2: '?.'
                {
                match(input,54,FOLLOW_54_in_synpred12_InternalQIdl6222); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2778:6: ( ( '*.' ) )
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2778:6: ( ( '*.' ) )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2779:1: ( '*.' )
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2779:1: ( '*.' )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2780:2: '*.'
                {
                match(input,55,FOLLOW_55_in_synpred12_InternalQIdl6242); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalQIdl

    // $ANTLR start synpred13_InternalQIdl
    public final void synpred13_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2887:4: ( ( '(' ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2888:1: ( '(' )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2888:1: ( '(' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2889:2: '('
        {
        match(input,18,FOLLOW_18_in_synpred13_InternalQIdl6466); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalQIdl

    // $ANTLR start synpred14_InternalQIdl
    public final void synpred14_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2908:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2908:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2908:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2908:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2908:6: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2909:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2909:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt106=2;
        int LA106_0 = input.LA(1);

        if ( (LA106_0==RULE_ID||LA106_0==18||LA106_0==80) ) {
            alt106=1;
        }
        switch (alt106) {
            case 1 :
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2909:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2909:3: ( ( ruleJvmFormalParameter ) )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2910:1: ( ruleJvmFormalParameter )
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2910:1: ( ruleJvmFormalParameter )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2911:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalQIdl6518);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2913:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop105:
                do {
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==16) ) {
                        alt105=1;
                    }


                    switch (alt105) {
                	case 1 :
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2913:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_16_in_synpred14_InternalQIdl6525); if (state.failed) return ;
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2914:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2915:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2915:1: ( ruleJvmFormalParameter )
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2916:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalQIdl6532);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop105;
                    }
                } while (true);


                }
                break;

        }

        match(input,26,FOLLOW_26_in_synpred14_InternalQIdl6542); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalQIdl

    // $ANTLR start synpred16_InternalQIdl
    public final void synpred16_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3522:4: ( 'else' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3522:6: 'else'
        {
        match(input,59,FOLLOW_59_in_synpred16_InternalQIdl7987); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalQIdl

    // $ANTLR start synpred17_InternalQIdl
    public final void synpred17_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4146:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4146:5: ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4146:5: ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4146:6: ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4146:6: ( ( ruleJvmTypeReference ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4147:1: ( ruleJvmTypeReference )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4147:1: ( ruleJvmTypeReference )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4148:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred17_InternalQIdl9354);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4150:2: ( ( RULE_ID ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4151:1: ( RULE_ID )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4151:1: ( RULE_ID )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4152:1: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred17_InternalQIdl9363); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalQIdl

    // $ANTLR start synpred18_InternalQIdl
    public final void synpred18_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4394:4: ( ( '(' ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4395:1: ( '(' )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4395:1: ( '(' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4396:2: '('
        {
        match(input,18,FOLLOW_18_in_synpred18_InternalQIdl9816); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalQIdl

    // $ANTLR start synpred19_InternalQIdl
    public final void synpred19_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4415:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4415:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4415:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4415:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4415:6: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4416:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4416:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt110=2;
        int LA110_0 = input.LA(1);

        if ( (LA110_0==RULE_ID||LA110_0==18||LA110_0==80) ) {
            alt110=1;
        }
        switch (alt110) {
            case 1 :
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4416:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4416:3: ( ( ruleJvmFormalParameter ) )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4417:1: ( ruleJvmFormalParameter )
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4417:1: ( ruleJvmFormalParameter )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4418:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalQIdl9868);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4420:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop109:
                do {
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==16) ) {
                        alt109=1;
                    }


                    switch (alt109) {
                	case 1 :
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4420:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_16_in_synpred19_InternalQIdl9875); if (state.failed) return ;
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4421:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4422:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4422:1: ( ruleJvmFormalParameter )
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4423:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalQIdl9882);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop109;
                    }
                } while (true);


                }
                break;

        }

        match(input,26,FOLLOW_26_in_synpred19_InternalQIdl9892); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalQIdl

    // $ANTLR start synpred20_InternalQIdl
    public final void synpred20_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4656:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4656:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4656:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4656:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4656:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4657:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4657:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt112=2;
        int LA112_0 = input.LA(1);

        if ( (LA112_0==RULE_ID||LA112_0==18||LA112_0==80) ) {
            alt112=1;
        }
        switch (alt112) {
            case 1 :
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4657:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4657:3: ( ( ruleJvmFormalParameter ) )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4658:1: ( ruleJvmFormalParameter )
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4658:1: ( ruleJvmFormalParameter )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4659:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalQIdl10449);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4661:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop111:
                do {
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==16) ) {
                        alt111=1;
                    }


                    switch (alt111) {
                	case 1 :
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4661:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_16_in_synpred20_InternalQIdl10456); if (state.failed) return ;
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4662:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4663:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4663:1: ( ruleJvmFormalParameter )
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4664:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalQIdl10463);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop111;
                    }
                } while (true);


                }
                break;

        }

        match(input,26,FOLLOW_26_in_synpred20_InternalQIdl10473); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalQIdl

    // $ANTLR start synpred21_InternalQIdl
    public final void synpred21_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5032:2: ( ( ruleXExpression ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5033:1: ( ruleXExpression )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5033:1: ( ruleXExpression )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5034:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred21_InternalQIdl11354);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalQIdl

    // $ANTLR start synpred22_InternalQIdl
    public final void synpred22_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5103:5: ( 'catch' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5103:7: 'catch'
        {
        match(input,79,FOLLOW_79_in_synpred22_InternalQIdl11499); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalQIdl

    // $ANTLR start synpred23_InternalQIdl
    public final void synpred23_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5122:5: ( 'finally' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5122:7: 'finally'
        {
        match(input,78,FOLLOW_78_in_synpred23_InternalQIdl11529); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalQIdl

    // $ANTLR start synpred25_InternalQIdl
    public final void synpred25_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5266:3: ( '.' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5267:2: '.'
        {
        match(input,53,FOLLOW_53_in_synpred25_InternalQIdl11869); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalQIdl

    // $ANTLR start synpred26_InternalQIdl
    public final void synpred26_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5448:4: ( '<' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5448:6: '<'
        {
        match(input,42,FOLLOW_42_in_synpred26_InternalQIdl12319); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalQIdl

    // Delegated rules

    public final boolean synpred18_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalQIdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalQIdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA54 dfa54 = new DFA54(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA86 dfa86 = new DFA86(this);
    protected DFA88 dfa88 = new DFA88(this);
    protected DFA97 dfa97 = new DFA97(this);
    static final String DFA54_eotS =
        "\74\uffff";
    static final String DFA54_eofS =
        "\1\2\73\uffff";
    static final String DFA54_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA54_maxS =
        "\1\120\1\0\72\uffff";
    static final String DFA54_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA54_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA54_transitionS = {
            "\3\2\5\uffff\2\2\2\uffff\1\2\1\uffff\1\1\2\uffff\1\2\2\uffff"+
            "\1\2\5\uffff\1\2\2\uffff\44\2\1\uffff\13\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "2887:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_1 = input.LA(1);

                         
                        int index54_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index54_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\34\uffff";
    static final String DFA53_eofS =
        "\34\uffff";
    static final String DFA53_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA53_maxS =
        "\1\120\2\0\31\uffff";
    static final String DFA53_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA53_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\1\2\5\5\uffff\1\5\5\uffff\1\2\7\uffff\1\4\3\uffff\1\33\13"+
            "\uffff\1\5\2\uffff\2\5\4\uffff\1\5\4\uffff\1\5\1\uffff\1\5\1"+
            "\uffff\1\5\2\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "2908:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_0 = input.LA(1);

                         
                        int index53_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_0==RULE_ID) ) {s = 1;}

                        else if ( (LA53_0==18) ) {s = 2;}

                        else if ( (LA53_0==80) && (synpred14_InternalQIdl())) {s = 3;}

                        else if ( (LA53_0==26) && (synpred14_InternalQIdl())) {s = 4;}

                        else if ( ((LA53_0>=RULE_INT && LA53_0<=RULE_STRING)||LA53_0==12||LA53_0==42||(LA53_0>=45 && LA53_0<=46)||LA53_0==51||LA53_0==56||LA53_0==58||LA53_0==60||(LA53_0>=63 && LA53_0<=65)||LA53_0==68||(LA53_0>=70 && LA53_0<=77)) ) {s = 5;}

                        else if ( (LA53_0==30) ) {s = 27;}

                         
                        input.seek(index53_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_1 = input.LA(1);

                         
                        int index53_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalQIdl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index53_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA53_2 = input.LA(1);

                         
                        int index53_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalQIdl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index53_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA80_eotS =
        "\74\uffff";
    static final String DFA80_eofS =
        "\1\2\73\uffff";
    static final String DFA80_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA80_maxS =
        "\1\120\1\0\72\uffff";
    static final String DFA80_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA80_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA80_transitionS = {
            "\3\2\5\uffff\2\2\2\uffff\1\2\1\uffff\1\1\2\uffff\1\2\2\uffff"+
            "\1\2\5\uffff\1\2\2\uffff\44\2\1\uffff\13\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "4394:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA80_1 = input.LA(1);

                         
                        int index80_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index80_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 80, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA79_eotS =
        "\34\uffff";
    static final String DFA79_eofS =
        "\34\uffff";
    static final String DFA79_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA79_maxS =
        "\1\120\2\0\31\uffff";
    static final String DFA79_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA79_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA79_transitionS = {
            "\1\1\2\5\5\uffff\1\5\5\uffff\1\2\7\uffff\1\4\3\uffff\1\33\13"+
            "\uffff\1\5\2\uffff\2\5\4\uffff\1\5\4\uffff\1\5\1\uffff\1\5\1"+
            "\uffff\1\5\2\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "4415:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_0 = input.LA(1);

                         
                        int index79_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA79_0==RULE_ID) ) {s = 1;}

                        else if ( (LA79_0==18) ) {s = 2;}

                        else if ( (LA79_0==80) && (synpred19_InternalQIdl())) {s = 3;}

                        else if ( (LA79_0==26) && (synpred19_InternalQIdl())) {s = 4;}

                        else if ( ((LA79_0>=RULE_INT && LA79_0<=RULE_STRING)||LA79_0==12||LA79_0==42||(LA79_0>=45 && LA79_0<=46)||LA79_0==51||LA79_0==56||LA79_0==58||LA79_0==60||(LA79_0>=63 && LA79_0<=65)||LA79_0==68||(LA79_0>=70 && LA79_0<=77)) ) {s = 5;}

                        else if ( (LA79_0==30) ) {s = 27;}

                         
                        input.seek(index79_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA79_1 = input.LA(1);

                         
                        int index79_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalQIdl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA79_2 = input.LA(1);

                         
                        int index79_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalQIdl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index79_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA86_eotS =
        "\34\uffff";
    static final String DFA86_eofS =
        "\34\uffff";
    static final String DFA86_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA86_maxS =
        "\1\120\2\0\31\uffff";
    static final String DFA86_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA86_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA86_transitionS = {
            "\1\1\2\5\5\uffff\1\5\5\uffff\1\2\7\uffff\1\4\3\uffff\1\33\13"+
            "\uffff\1\5\2\uffff\2\5\4\uffff\1\5\4\uffff\1\5\1\uffff\1\5\1"+
            "\uffff\1\5\2\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA86_eot = DFA.unpackEncodedString(DFA86_eotS);
    static final short[] DFA86_eof = DFA.unpackEncodedString(DFA86_eofS);
    static final char[] DFA86_min = DFA.unpackEncodedStringToUnsignedChars(DFA86_minS);
    static final char[] DFA86_max = DFA.unpackEncodedStringToUnsignedChars(DFA86_maxS);
    static final short[] DFA86_accept = DFA.unpackEncodedString(DFA86_acceptS);
    static final short[] DFA86_special = DFA.unpackEncodedString(DFA86_specialS);
    static final short[][] DFA86_transition;

    static {
        int numStates = DFA86_transitionS.length;
        DFA86_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA86_transition[i] = DFA.unpackEncodedString(DFA86_transitionS[i]);
        }
    }

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = DFA86_eot;
            this.eof = DFA86_eof;
            this.min = DFA86_min;
            this.max = DFA86_max;
            this.accept = DFA86_accept;
            this.special = DFA86_special;
            this.transition = DFA86_transition;
        }
        public String getDescription() {
            return "4656:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA86_0 = input.LA(1);

                         
                        int index86_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA86_0==RULE_ID) ) {s = 1;}

                        else if ( (LA86_0==18) ) {s = 2;}

                        else if ( (LA86_0==80) && (synpred20_InternalQIdl())) {s = 3;}

                        else if ( (LA86_0==26) && (synpred20_InternalQIdl())) {s = 4;}

                        else if ( ((LA86_0>=RULE_INT && LA86_0<=RULE_STRING)||LA86_0==12||LA86_0==42||(LA86_0>=45 && LA86_0<=46)||LA86_0==51||LA86_0==56||LA86_0==58||LA86_0==60||(LA86_0>=63 && LA86_0<=65)||LA86_0==68||(LA86_0>=70 && LA86_0<=77)) ) {s = 5;}

                        else if ( (LA86_0==30) ) {s = 27;}

                         
                        input.seek(index86_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA86_1 = input.LA(1);

                         
                        int index86_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalQIdl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index86_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA86_2 = input.LA(1);

                         
                        int index86_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalQIdl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index86_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 86, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA88_eotS =
        "\74\uffff";
    static final String DFA88_eofS =
        "\1\31\73\uffff";
    static final String DFA88_minS =
        "\1\4\30\0\43\uffff";
    static final String DFA88_maxS =
        "\1\120\30\0\43\uffff";
    static final String DFA88_acceptS =
        "\31\uffff\1\2\41\uffff\1\1";
    static final String DFA88_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\43\uffff}>";
    static final String[] DFA88_transitionS = {
            "\1\1\1\15\1\17\5\uffff\1\6\1\31\2\uffff\1\31\1\uffff\1\30\2"+
            "\uffff\1\31\2\uffff\1\31\5\uffff\1\31\2\uffff\11\31\1\10\2\31"+
            "\1\4\1\3\4\31\1\2\4\31\1\12\1\31\1\21\1\31\1\7\2\31\1\22\1\23"+
            "\1\24\2\31\1\11\1\uffff\1\5\1\13\1\14\1\16\1\20\1\25\1\26\1"+
            "\27\3\31",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA88_eot = DFA.unpackEncodedString(DFA88_eotS);
    static final short[] DFA88_eof = DFA.unpackEncodedString(DFA88_eofS);
    static final char[] DFA88_min = DFA.unpackEncodedStringToUnsignedChars(DFA88_minS);
    static final char[] DFA88_max = DFA.unpackEncodedStringToUnsignedChars(DFA88_maxS);
    static final short[] DFA88_accept = DFA.unpackEncodedString(DFA88_acceptS);
    static final short[] DFA88_special = DFA.unpackEncodedString(DFA88_specialS);
    static final short[][] DFA88_transition;

    static {
        int numStates = DFA88_transitionS.length;
        DFA88_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA88_transition[i] = DFA.unpackEncodedString(DFA88_transitionS[i]);
        }
    }

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = DFA88_eot;
            this.eof = DFA88_eof;
            this.min = DFA88_min;
            this.max = DFA88_max;
            this.accept = DFA88_accept;
            this.special = DFA88_special;
            this.transition = DFA88_transition;
        }
        public String getDescription() {
            return "5032:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA88_1 = input.LA(1);

                         
                        int index88_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA88_2 = input.LA(1);

                         
                        int index88_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA88_3 = input.LA(1);

                         
                        int index88_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA88_4 = input.LA(1);

                         
                        int index88_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA88_5 = input.LA(1);

                         
                        int index88_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA88_6 = input.LA(1);

                         
                        int index88_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA88_7 = input.LA(1);

                         
                        int index88_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA88_8 = input.LA(1);

                         
                        int index88_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA88_9 = input.LA(1);

                         
                        int index88_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA88_10 = input.LA(1);

                         
                        int index88_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA88_11 = input.LA(1);

                         
                        int index88_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA88_12 = input.LA(1);

                         
                        int index88_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA88_13 = input.LA(1);

                         
                        int index88_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA88_14 = input.LA(1);

                         
                        int index88_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA88_15 = input.LA(1);

                         
                        int index88_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA88_16 = input.LA(1);

                         
                        int index88_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA88_17 = input.LA(1);

                         
                        int index88_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA88_18 = input.LA(1);

                         
                        int index88_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA88_19 = input.LA(1);

                         
                        int index88_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA88_20 = input.LA(1);

                         
                        int index88_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA88_21 = input.LA(1);

                         
                        int index88_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA88_22 = input.LA(1);

                         
                        int index88_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA88_23 = input.LA(1);

                         
                        int index88_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA88_24 = input.LA(1);

                         
                        int index88_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index88_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 88, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA97_eotS =
        "\74\uffff";
    static final String DFA97_eofS =
        "\1\2\73\uffff";
    static final String DFA97_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA97_maxS =
        "\1\120\1\0\72\uffff";
    static final String DFA97_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA97_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA97_transitionS = {
            "\3\2\5\uffff\2\2\2\uffff\1\2\1\uffff\1\2\2\uffff\1\2\2\uffff"+
            "\1\2\5\uffff\1\2\2\uffff\11\2\1\1\32\2\1\uffff\13\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA97_eot = DFA.unpackEncodedString(DFA97_eotS);
    static final short[] DFA97_eof = DFA.unpackEncodedString(DFA97_eofS);
    static final char[] DFA97_min = DFA.unpackEncodedStringToUnsignedChars(DFA97_minS);
    static final char[] DFA97_max = DFA.unpackEncodedStringToUnsignedChars(DFA97_maxS);
    static final short[] DFA97_accept = DFA.unpackEncodedString(DFA97_acceptS);
    static final short[] DFA97_special = DFA.unpackEncodedString(DFA97_specialS);
    static final short[][] DFA97_transition;

    static {
        int numStates = DFA97_transitionS.length;
        DFA97_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA97_transition[i] = DFA.unpackEncodedString(DFA97_transitionS[i]);
        }
    }

    class DFA97 extends DFA {

        public DFA97(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 97;
            this.eot = DFA97_eot;
            this.eof = DFA97_eof;
            this.min = DFA97_min;
            this.max = DFA97_max;
            this.accept = DFA97_accept;
            this.special = DFA97_special;
            this.transition = DFA97_transition;
        }
        public String getDescription() {
            return "5448:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA97_1 = input.LA(1);

                         
                        int index97_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index97_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 97, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleQtIdlTyp_in_entryRuleQtIdlTyp75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtIdlTyp85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtBuitinType_in_ruleQtIdlTyp132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtClass_in_ruleQtIdlTyp151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtNamespace_in_ruleQtIdlTyp170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtNamespace_in_entryRuleQtNamespace208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtNamespace218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleQtNamespace255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtNamespace272 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQtNamespace289 = new BitSet(new long[]{0x0000000000C06800L});
    public static final BitSet FOLLOW_ruleQtNamespace_in_ruleQtNamespace310 = new BitSet(new long[]{0x0000000000C06800L});
    public static final BitSet FOLLOW_ruleQtEnum_in_ruleQtNamespace332 = new BitSet(new long[]{0x0000000000C06000L});
    public static final BitSet FOLLOW_ruleQtFlags_in_ruleQtNamespace354 = new BitSet(new long[]{0x0000000000806000L});
    public static final BitSet FOLLOW_ruleQtClass_in_ruleQtNamespace376 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleQtNamespace389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtOperations_in_entryRuleQtOperations427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtOperations437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtFunction_in_ruleQtOperations484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtSignal_in_ruleQtOperations511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtSlot_in_ruleQtOperations538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtClass_in_entryRuleQtClass573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtClass583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleQtClass620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtClass637 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_ruleQtClass655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtClass675 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_16_in_ruleQtClass688 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtClass708 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_12_in_ruleQtClass724 = new BitSet(new long[]{0x0000000180D26000L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleQtEnum_in_ruleQtClass745 = new BitSet(new long[]{0x0000000180D26000L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleQtFlags_in_ruleQtClass767 = new BitSet(new long[]{0x0000000180926000L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleQtClass_in_ruleQtClass789 = new BitSet(new long[]{0x0000000180126000L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleQtProperty_in_ruleQtClass811 = new BitSet(new long[]{0x0000000180122000L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleQtConstructor_in_ruleQtClass833 = new BitSet(new long[]{0x0000000180022000L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleQtOperations_in_ruleQtClass855 = new BitSet(new long[]{0x0000000180002000L,0x0000000000600000L});
    public static final BitSet FOLLOW_13_in_ruleQtClass868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtConstructor_in_entryRuleQtConstructor904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtConstructor914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleQtConstructor951 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQtConstructor963 = new BitSet(new long[]{0x0000000010080010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtValue_in_ruleQtConstructor985 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleQtConstructor998 = new BitSet(new long[]{0x0000000010000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtValue_in_ruleQtConstructor1019 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_ruleQtConstructor1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtProperty_in_entryRuleQtProperty1071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtProperty1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleQtProperty1118 = new BitSet(new long[]{0x0000000010000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtValue_in_ruleQtProperty1139 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleQtProperty1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtEnum_in_entryRuleQtEnum1187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtEnum1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleQtEnum1234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtEnum1251 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQtEnum1268 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleQtEnumValue_in_ruleQtEnum1289 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleQtEnum1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtFlags_in_entryRuleQtFlags1338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtFlags1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleQtFlags1385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtFlags1402 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQtFlags1419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtFlags1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtEnumValue_in_entryRuleQtEnumValue1475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtEnumValue1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtEnumValue1527 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleQtEnumValue1544 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_ruleQtEnumValue1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue1601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralValue1657 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleLiteralValue1670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralValue1690 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLiteralValue1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralValue1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtBuitinType_in_entryRuleQtBuitinType1761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtBuitinType1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleQtBuitinType1808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtBuitinType1825 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQtBuitinType1842 = new BitSet(new long[]{0x0000000000040010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleQtBuitinType1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtFunction_in_entryRuleQtFunction1899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtFunction1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleQtFunction1955 = new BitSet(new long[]{0x0000000010004000L,0x0000000000980000L});
    public static final BitSet FOLLOW_28_in_ruleQtFunction1973 = new BitSet(new long[]{0x0000000010004000L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleVirtuality_in_ruleQtFunction2008 = new BitSet(new long[]{0x0000000010004000L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleOwner_in_ruleQtFunction2030 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleQtFunction2042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtFunction2059 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQtFunction2076 = new BitSet(new long[]{0x0000000050000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtValue_in_ruleQtFunction2098 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleQtFunction2111 = new BitSet(new long[]{0x0000000010000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtValue_in_ruleQtFunction2132 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_30_in_ruleQtFunction2148 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQtFunction2160 = new BitSet(new long[]{0x0000000010000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtReturnValue_in_ruleQtFunction2181 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleQtFunction2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtValue_in_entryRuleQtValue2229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtValue2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleQtValue2282 = new BitSet(new long[]{0x0000000000000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleQtValue2317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtValue2338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtValue2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtReturnValue_in_entryRuleQtReturnValue2396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtReturnValue2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleQtReturnValue2449 = new BitSet(new long[]{0x0000000000000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleQtReturnValue2484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtReturnValue2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtSignal_in_entryRuleQtSignal2541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtSignal2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleQtSignal2588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtSignal2605 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQtSignal2622 = new BitSet(new long[]{0x0000000050000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtValue_in_ruleQtSignal2644 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleQtSignal2657 = new BitSet(new long[]{0x0000000010000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtValue_in_ruleQtSignal2678 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_30_in_ruleQtSignal2694 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQtSignal2706 = new BitSet(new long[]{0x0000000010000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtReturnValue_in_ruleQtSignal2727 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleQtSignal2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtSlot_in_entryRuleQtSlot2775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtSlot2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleQtSlot2822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtSlot2839 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQtSlot2856 = new BitSet(new long[]{0x0000000050000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtValue_in_ruleQtSlot2878 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleQtSlot2891 = new BitSet(new long[]{0x0000000010000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtValue_in_ruleQtSlot2912 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_30_in_ruleQtSlot2928 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQtSlot2940 = new BitSet(new long[]{0x0000000010000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtReturnValue_in_ruleQtSlot2961 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleQtSlot2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression3009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment3099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXAssignment3164 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment3180 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment3230 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment3283 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign3346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpSingleAssign3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign3434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpMultiAssign3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression3521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression3578 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression3631 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression3654 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr3693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOr3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression3780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3837 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression3890 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3913 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd3952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpAnd4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression4039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression4049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression4096 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression4149 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression4172 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality4211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpEquality4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpEquality4279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression4319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4376 = new BitSet(new long[]{0x000007C000000002L});
    public static final BitSet FOLLOW_38_in_ruleXRelationalExpression4412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression4437 = new BitSet(new long[]{0x000007C000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression4498 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4521 = new BitSet(new long[]{0x000007C000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare4561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpCompare4610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpCompare4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpCompare4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpCompare4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression4707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression4717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4764 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression4817 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4840 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther4879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpOther4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpOther4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5044 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression5097 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5120 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd5159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd5170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpAdd5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpAdd5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression5267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5324 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression5377 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5400 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti5439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti5450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpMulti5488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpMulti5507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOpMulti5526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOpMulti5545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation5585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation5653 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary5739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary5750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleOpUnary5788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpUnary5807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpUnary5826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5923 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXCastedExpression5958 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5981 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall6019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall6029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall6076 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXMemberFeatureCall6125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXMemberFeatureCall6145 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall6161 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall6183 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXMemberFeatureCall6269 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_54_in_ruleXMemberFeatureCall6293 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_55_in_ruleXMemberFeatureCall6330 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall6359 = new BitSet(new long[]{0x0000000000040010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6380 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall6393 = new BitSet(new long[]{0x0000000000040010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6414 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall6428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXMemberFeatureCall6450 = new BitSet(new long[]{0x00E0000000040002L});
    public static final BitSet FOLLOW_18_in_ruleXMemberFeatureCall6484 = new BitSet(new long[]{0x9508640044041070L,0x0000000000013FD3L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall6559 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6587 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall6600 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6621 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_30_in_ruleXMemberFeatureCall6638 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression6679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression6689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression6736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression6763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression6790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression6817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression6844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression6871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression6898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression6925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression6952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression6979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression7006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression7033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression7060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral7095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral7105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral7152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral7179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral7206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral7233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral7260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral7287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure7322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure7332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXClosure7378 = new BitSet(new long[]{0x0000000004040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7400 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_ruleXClosure7413 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7434 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_ruleXClosure7450 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure7471 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXClosure7483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure7519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure7529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7627 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_ruleXShortClosure7640 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7661 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_ruleXShortClosure7677 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure7700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression7736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression7746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleXParenthesizedExpression7783 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7805 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXParenthesizedExpression7816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression7862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXIfExpression7908 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXIfExpression7920 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7941 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXIfExpression7953 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7974 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXIfExpression7995 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression8017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression8055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression8065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXSwitchExpression8111 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXSwitchExpression8129 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXSwitchExpression8146 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression8169 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleXSwitchExpression8181 = new BitSet(new long[]{0x4000000001040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression8202 = new BitSet(new long[]{0x6000000001042010L,0x0000000000010000L});
    public static final BitSet FOLLOW_61_in_ruleXSwitchExpression8216 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXSwitchExpression8228 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression8249 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXSwitchExpression8263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart8299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart8309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart8355 = new BitSet(new long[]{0x4000000001000000L});
    public static final BitSet FOLLOW_62_in_ruleXCasePart8369 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart8390 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXCasePart8404 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart8425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression8461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression8471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXForLoopExpression8517 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXForLoopExpression8529 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression8550 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXForLoopExpression8562 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression8583 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXForLoopExpression8595 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression8616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression8652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression8662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXWhileExpression8708 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXWhileExpression8720 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression8741 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXWhileExpression8753 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression8774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression8820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXDoWhileExpression8866 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleXDoWhileExpression8899 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXDoWhileExpression8911 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8932 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXDoWhileExpression8944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression8990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleXBlockExpression9036 = new BitSet(new long[]{0x9508640000043070L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression9058 = new BitSet(new long[]{0x9508640000243070L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_21_in_ruleXBlockExpression9071 = new BitSet(new long[]{0x9508640000043070L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_13_in_ruleXBlockExpression9087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock9123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock9133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock9180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock9207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration9242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration9252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXVariableDeclaration9305 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_67_in_ruleXVariableDeclaration9336 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration9385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXVariableDeclaration9402 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXVariableDeclaration9432 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleXVariableDeclaration9451 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration9472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter9510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter9520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter9566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJvmFormalParameter9584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall9625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall9635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall9692 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_42_in_ruleXFeatureCall9706 = new BitSet(new long[]{0x0000000000040010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9727 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_16_in_ruleXFeatureCall9740 = new BitSet(new long[]{0x0000000000040010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9761 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall9775 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9800 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleXFeatureCall9834 = new BitSet(new long[]{0x9508640044041070L,0x0000000000013FD3L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9909 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9937 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleXFeatureCall9950 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9971 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_30_in_ruleXFeatureCall9988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper10027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper10038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdOrSuper10078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleIdOrSuper10102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier10143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier10154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStaticQualifier10194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleStaticQualifier10212 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall10253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall10263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXConstructorCall10309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall10332 = new BitSet(new long[]{0x0000040000040000L});
    public static final BitSet FOLLOW_42_in_ruleXConstructorCall10345 = new BitSet(new long[]{0x0000000000040010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10366 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_16_in_ruleXConstructorCall10379 = new BitSet(new long[]{0x0000000000040010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10400 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall10414 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXConstructorCall10428 = new BitSet(new long[]{0x9508640044041070L,0x0000000000013FD3L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall10490 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10518 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleXConstructorCall10531 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10552 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_30_in_ruleXConstructorCall10569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral10615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXBooleanLiteral10662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXBooleanLiteral10686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral10746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXNullLiteral10792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral10828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral10838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral10889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral10940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral10991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral11032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral11042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXTypeLiteral11088 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXTypeLiteral11100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral11123 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXTypeLiteral11135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression11171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression11181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXThrowExpression11227 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression11248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression11284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression11294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXReturnExpression11340 = new BitSet(new long[]{0x9508640000041072L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression11371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression11408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression11418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXTryCatchFinallyExpression11464 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11485 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11515 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_78_in_ruleXTryCatchFinallyExpression11537 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleXTryCatchFinallyExpression11581 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause11650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleXCatchClause11695 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXCatchClause11708 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause11729 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXCatchClause11741 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause11762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName11810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName11850 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleQualifiedName11878 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName11894 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference12025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef12060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef12070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleXFunctionTypeRef12108 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12129 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleXFunctionTypeRef12142 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12163 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_30_in_ruleXFunctionTypeRef12177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleXFunctionTypeRef12191 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference12248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12306 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleJvmParameterizedTypeReference12327 = new BitSet(new long[]{0x0000000000040010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12349 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_16_in_ruleJvmParameterizedTypeReference12362 = new BitSet(new long[]{0x0000000000040010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12383 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_41_in_ruleJvmParameterizedTypeReference12397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleJvmWildcardTypeReference12610 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound12707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleJvmUpperBound12744 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleJvmUpperBoundAnded12848 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleJvmLowerBound12952 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleVirtuality13025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleVirtuality13042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleVisibility13087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleVisibility13104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleOwner13149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOwner13166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleType13211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleType13228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalQIdl3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalQIdl3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalQIdl3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalQIdl4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred5_InternalQIdl4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalQIdl4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalQIdl4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalQIdl5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalQIdl5345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred10_InternalQIdl5939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred11_InternalQIdl6093 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred11_InternalQIdl6101 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalQIdl6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred12_InternalQIdl6208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred12_InternalQIdl6222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred12_InternalQIdl6242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred13_InternalQIdl6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalQIdl6518 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_synpred14_InternalQIdl6525 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalQIdl6532 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_synpred14_InternalQIdl6542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_synpred16_InternalQIdl7987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred17_InternalQIdl9354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred17_InternalQIdl9363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred18_InternalQIdl9816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalQIdl9868 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_synpred19_InternalQIdl9875 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalQIdl9882 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_synpred19_InternalQIdl9892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalQIdl10449 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_synpred20_InternalQIdl10456 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalQIdl10463 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_synpred20_InternalQIdl10473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred21_InternalQIdl11354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_synpred22_InternalQIdl11499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_synpred23_InternalQIdl11529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred25_InternalQIdl11869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred26_InternalQIdl12319 = new BitSet(new long[]{0x0000000000000002L});

}