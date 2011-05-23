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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:149:1: ruleQtNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleQtNamespace ) )* ( (lv_enums_4_0= ruleQtEnum ) )* ( (lv_flags_5_0= ruleQtFlags ) )* ( (lv_classes_6_0= ruleQtClass ) )* ( (lv_operations_7_0= ruleQtOperation ) )* otherlv_8= '}' ) ;
    public final EObject ruleQtNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        EObject lv_namespaces_3_0 = null;

        EObject lv_enums_4_0 = null;

        EObject lv_flags_5_0 = null;

        EObject lv_classes_6_0 = null;

        EObject lv_operations_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:152:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleQtNamespace ) )* ( (lv_enums_4_0= ruleQtEnum ) )* ( (lv_flags_5_0= ruleQtFlags ) )* ( (lv_classes_6_0= ruleQtClass ) )* ( (lv_operations_7_0= ruleQtOperation ) )* otherlv_8= '}' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:153:1: (otherlv_0= 'namespace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleQtNamespace ) )* ( (lv_enums_4_0= ruleQtEnum ) )* ( (lv_flags_5_0= ruleQtFlags ) )* ( (lv_classes_6_0= ruleQtClass ) )* ( (lv_operations_7_0= ruleQtOperation ) )* otherlv_8= '}' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:153:1: (otherlv_0= 'namespace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleQtNamespace ) )* ( (lv_enums_4_0= ruleQtEnum ) )* ( (lv_flags_5_0= ruleQtFlags ) )* ( (lv_classes_6_0= ruleQtClass ) )* ( (lv_operations_7_0= ruleQtOperation ) )* otherlv_8= '}' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:153:3: otherlv_0= 'namespace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleQtNamespace ) )* ( (lv_enums_4_0= ruleQtEnum ) )* ( (lv_flags_5_0= ruleQtFlags ) )* ( (lv_classes_6_0= ruleQtClass ) )* ( (lv_operations_7_0= ruleQtOperation ) )* otherlv_8= '}'
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:251:3: ( (lv_operations_7_0= ruleQtOperation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=31 && LA6_0<=32)||(LA6_0>=85 && LA6_0<=86)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:252:1: (lv_operations_7_0= ruleQtOperation )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:252:1: (lv_operations_7_0= ruleQtOperation )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:253:3: lv_operations_7_0= ruleQtOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtNamespaceAccess().getOperationsQtOperationParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtOperation_in_ruleQtNamespace398);
            	    lv_operations_7_0=ruleQtOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQtNamespaceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"operations",
            	              		lv_operations_7_0, 
            	              		"QtOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleQtNamespace411); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getQtNamespaceAccess().getRightCurlyBracketKeyword_8());
                  
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


    // $ANTLR start "entryRuleQtOperation"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:283:1: entryRuleQtOperation returns [EObject current=null] : iv_ruleQtOperation= ruleQtOperation EOF ;
    public final EObject entryRuleQtOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtOperation = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:284:2: (iv_ruleQtOperation= ruleQtOperation EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:285:2: iv_ruleQtOperation= ruleQtOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtOperationRule()); 
            }
            pushFollow(FOLLOW_ruleQtOperation_in_entryRuleQtOperation449);
            iv_ruleQtOperation=ruleQtOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtOperation459); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQtOperation"


    // $ANTLR start "ruleQtOperation"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:292:1: ruleQtOperation returns [EObject current=null] : (this_QtFunction_0= ruleQtFunction | this_QtSignal_1= ruleQtSignal | this_QtSlot_2= ruleQtSlot ) ;
    public final EObject ruleQtOperation() throws RecognitionException {
        EObject current = null;

        EObject this_QtFunction_0 = null;

        EObject this_QtSignal_1 = null;

        EObject this_QtSlot_2 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:295:28: ( (this_QtFunction_0= ruleQtFunction | this_QtSignal_1= ruleQtSignal | this_QtSlot_2= ruleQtSlot ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:296:1: (this_QtFunction_0= ruleQtFunction | this_QtSignal_1= ruleQtSignal | this_QtSlot_2= ruleQtSlot )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:296:1: (this_QtFunction_0= ruleQtFunction | this_QtSignal_1= ruleQtSignal | this_QtSlot_2= ruleQtSlot )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 85:
            case 86:
                {
                alt7=1;
                }
                break;
            case 31:
                {
                alt7=2;
                }
                break;
            case 32:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:297:5: this_QtFunction_0= ruleQtFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQtOperationAccess().getQtFunctionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQtFunction_in_ruleQtOperation506);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:307:5: this_QtSignal_1= ruleQtSignal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQtOperationAccess().getQtSignalParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQtSignal_in_ruleQtOperation533);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:317:5: this_QtSlot_2= ruleQtSlot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQtOperationAccess().getQtSlotParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQtSlot_in_ruleQtOperation560);
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
    // $ANTLR end "ruleQtOperation"


    // $ANTLR start "entryRuleQtClass"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:333:1: entryRuleQtClass returns [EObject current=null] : iv_ruleQtClass= ruleQtClass EOF ;
    public final EObject entryRuleQtClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtClass = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:334:2: (iv_ruleQtClass= ruleQtClass EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:335:2: iv_ruleQtClass= ruleQtClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtClassRule()); 
            }
            pushFollow(FOLLOW_ruleQtClass_in_entryRuleQtClass595);
            iv_ruleQtClass=ruleQtClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtClass605); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:342:1: ruleQtClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( (lv_enums_7_0= ruleQtEnum ) )* ( (lv_flags_8_0= ruleQtFlags ) )* ( (lv_classes_9_0= ruleQtClass ) )* ( (lv_properties_10_0= ruleQtProperty ) )* ( (lv_constructors_11_0= ruleQtConstructor ) )* ( (lv_operations_12_0= ruleQtOperation ) )* otherlv_13= '}' ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:345:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( (lv_enums_7_0= ruleQtEnum ) )* ( (lv_flags_8_0= ruleQtFlags ) )* ( (lv_classes_9_0= ruleQtClass ) )* ( (lv_properties_10_0= ruleQtProperty ) )* ( (lv_constructors_11_0= ruleQtConstructor ) )* ( (lv_operations_12_0= ruleQtOperation ) )* otherlv_13= '}' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:346:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( (lv_enums_7_0= ruleQtEnum ) )* ( (lv_flags_8_0= ruleQtFlags ) )* ( (lv_classes_9_0= ruleQtClass ) )* ( (lv_properties_10_0= ruleQtProperty ) )* ( (lv_constructors_11_0= ruleQtConstructor ) )* ( (lv_operations_12_0= ruleQtOperation ) )* otherlv_13= '}' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:346:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( (lv_enums_7_0= ruleQtEnum ) )* ( (lv_flags_8_0= ruleQtFlags ) )* ( (lv_classes_9_0= ruleQtClass ) )* ( (lv_properties_10_0= ruleQtProperty ) )* ( (lv_constructors_11_0= ruleQtConstructor ) )* ( (lv_operations_12_0= ruleQtOperation ) )* otherlv_13= '}' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:346:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( (lv_enums_7_0= ruleQtEnum ) )* ( (lv_flags_8_0= ruleQtFlags ) )* ( (lv_classes_9_0= ruleQtClass ) )* ( (lv_properties_10_0= ruleQtProperty ) )* ( (lv_constructors_11_0= ruleQtConstructor ) )* ( (lv_operations_12_0= ruleQtOperation ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleQtClass642); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtClassAccess().getClassKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:350:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:351:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:351:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:352:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtClass659); if (state.failed) return current;
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:368:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:368:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleQtClass677); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getQtClassAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:372:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:373:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:373:1: (otherlv_3= RULE_ID )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:374:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getQtClassRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtClass697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getQtClassAccess().getSuperTypesQtClassCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:385:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==16) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:385:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleQtClass710); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getQtClassAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:389:1: ( (otherlv_5= RULE_ID ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:390:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:390:1: (otherlv_5= RULE_ID )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:391:3: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getQtClassRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtClass730); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_5, grammarAccess.getQtClassAccess().getSuperTypesQtClassCrossReference_2_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleQtClass746); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getQtClassAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:406:1: ( (lv_enums_7_0= ruleQtEnum ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:407:1: (lv_enums_7_0= ruleQtEnum )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:407:1: (lv_enums_7_0= ruleQtEnum )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:408:3: lv_enums_7_0= ruleQtEnum
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtClassAccess().getEnumsQtEnumParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtEnum_in_ruleQtClass767);
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
            	    break loop10;
                }
            } while (true);

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:424:3: ( (lv_flags_8_0= ruleQtFlags ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:425:1: (lv_flags_8_0= ruleQtFlags )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:425:1: (lv_flags_8_0= ruleQtFlags )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:426:3: lv_flags_8_0= ruleQtFlags
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtClassAccess().getFlagsQtFlagsParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtFlags_in_ruleQtClass789);
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
            	    break loop11;
                }
            } while (true);

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:442:3: ( (lv_classes_9_0= ruleQtClass ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:443:1: (lv_classes_9_0= ruleQtClass )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:443:1: (lv_classes_9_0= ruleQtClass )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:444:3: lv_classes_9_0= ruleQtClass
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtClassAccess().getClassesQtClassParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtClass_in_ruleQtClass811);
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
            	    break loop12;
                }
            } while (true);

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:460:3: ( (lv_properties_10_0= ruleQtProperty ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:461:1: (lv_properties_10_0= ruleQtProperty )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:461:1: (lv_properties_10_0= ruleQtProperty )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:462:3: lv_properties_10_0= ruleQtProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtClassAccess().getPropertiesQtPropertyParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtProperty_in_ruleQtClass833);
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
            	    break loop13;
                }
            } while (true);

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:478:3: ( (lv_constructors_11_0= ruleQtConstructor ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:479:1: (lv_constructors_11_0= ruleQtConstructor )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:479:1: (lv_constructors_11_0= ruleQtConstructor )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:480:3: lv_constructors_11_0= ruleQtConstructor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtClassAccess().getConstructorsQtConstructorParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtConstructor_in_ruleQtClass855);
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
            	    break loop14;
                }
            } while (true);

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:496:3: ( (lv_operations_12_0= ruleQtOperation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=31 && LA15_0<=32)||(LA15_0>=85 && LA15_0<=86)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:497:1: (lv_operations_12_0= ruleQtOperation )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:497:1: (lv_operations_12_0= ruleQtOperation )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:498:3: lv_operations_12_0= ruleQtOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtClassAccess().getOperationsQtOperationParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtOperation_in_ruleQtClass877);
            	    lv_operations_12_0=ruleQtOperation();

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
            	              		"QtOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleQtClass890); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:526:1: entryRuleQtConstructor returns [EObject current=null] : iv_ruleQtConstructor= ruleQtConstructor EOF ;
    public final EObject entryRuleQtConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtConstructor = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:527:2: (iv_ruleQtConstructor= ruleQtConstructor EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:528:2: iv_ruleQtConstructor= ruleQtConstructor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtConstructorRule()); 
            }
            pushFollow(FOLLOW_ruleQtConstructor_in_entryRuleQtConstructor926);
            iv_ruleQtConstructor=ruleQtConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtConstructor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtConstructor936); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:535:1: ruleQtConstructor returns [EObject current=null] : (otherlv_0= 'constructor' otherlv_1= '(' ( ( (lv_params_2_0= ruleQtParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleQtParameter ) ) )* )? otherlv_5= ');' ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:538:28: ( (otherlv_0= 'constructor' otherlv_1= '(' ( ( (lv_params_2_0= ruleQtParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleQtParameter ) ) )* )? otherlv_5= ');' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:539:1: (otherlv_0= 'constructor' otherlv_1= '(' ( ( (lv_params_2_0= ruleQtParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleQtParameter ) ) )* )? otherlv_5= ');' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:539:1: (otherlv_0= 'constructor' otherlv_1= '(' ( ( (lv_params_2_0= ruleQtParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleQtParameter ) ) )* )? otherlv_5= ');' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:539:3: otherlv_0= 'constructor' otherlv_1= '(' ( ( (lv_params_2_0= ruleQtParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleQtParameter ) ) )* )? otherlv_5= ');'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleQtConstructor973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtConstructorAccess().getConstructorKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleQtConstructor985); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getQtConstructorAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:547:1: ( ( (lv_params_2_0= ruleQtParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleQtParameter ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||LA17_0==28||(LA17_0>=88 && LA17_0<=89)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:547:2: ( (lv_params_2_0= ruleQtParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleQtParameter ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:547:2: ( (lv_params_2_0= ruleQtParameter ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:548:1: (lv_params_2_0= ruleQtParameter )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:548:1: (lv_params_2_0= ruleQtParameter )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:549:3: lv_params_2_0= ruleQtParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtConstructorAccess().getParamsQtParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQtParameter_in_ruleQtConstructor1007);
                    lv_params_2_0=ruleQtParameter();

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
                              		"QtParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:565:2: (otherlv_3= ',' ( (lv_params_4_0= ruleQtParameter ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==16) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:565:4: otherlv_3= ',' ( (lv_params_4_0= ruleQtParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleQtConstructor1020); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getQtConstructorAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:569:1: ( (lv_params_4_0= ruleQtParameter ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:570:1: (lv_params_4_0= ruleQtParameter )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:570:1: (lv_params_4_0= ruleQtParameter )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:571:3: lv_params_4_0= ruleQtParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getQtConstructorAccess().getParamsQtParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQtParameter_in_ruleQtConstructor1041);
                    	    lv_params_4_0=ruleQtParameter();

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
                    	              		"QtParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleQtConstructor1057); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:599:1: entryRuleQtProperty returns [EObject current=null] : iv_ruleQtProperty= ruleQtProperty EOF ;
    public final EObject entryRuleQtProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtProperty = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:600:2: (iv_ruleQtProperty= ruleQtProperty EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:601:2: iv_ruleQtProperty= ruleQtProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleQtProperty_in_entryRuleQtProperty1093);
            iv_ruleQtProperty=ruleQtProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtProperty1103); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:608:1: ruleQtProperty returns [EObject current=null] : (otherlv_0= 'property' ( (lv_type_1_0= ruleQtValue ) ) otherlv_2= ';' ) ;
    public final EObject ruleQtProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:611:28: ( (otherlv_0= 'property' ( (lv_type_1_0= ruleQtValue ) ) otherlv_2= ';' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:612:1: (otherlv_0= 'property' ( (lv_type_1_0= ruleQtValue ) ) otherlv_2= ';' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:612:1: (otherlv_0= 'property' ( (lv_type_1_0= ruleQtValue ) ) otherlv_2= ';' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:612:3: otherlv_0= 'property' ( (lv_type_1_0= ruleQtValue ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleQtProperty1140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtPropertyAccess().getPropertyKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:616:1: ( (lv_type_1_0= ruleQtValue ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:617:1: (lv_type_1_0= ruleQtValue )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:617:1: (lv_type_1_0= ruleQtValue )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:618:3: lv_type_1_0= ruleQtValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtPropertyAccess().getTypeQtValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQtValue_in_ruleQtProperty1161);
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

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleQtProperty1173); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:646:1: entryRuleQtEnum returns [EObject current=null] : iv_ruleQtEnum= ruleQtEnum EOF ;
    public final EObject entryRuleQtEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtEnum = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:647:2: (iv_ruleQtEnum= ruleQtEnum EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:648:2: iv_ruleQtEnum= ruleQtEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtEnumRule()); 
            }
            pushFollow(FOLLOW_ruleQtEnum_in_entryRuleQtEnum1209);
            iv_ruleQtEnum=ruleQtEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtEnum; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtEnum1219); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:655:1: ruleQtEnum returns [EObject current=null] : (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleQtEnumValue ) )* otherlv_4= '}' ) ;
    public final EObject ruleQtEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:658:28: ( (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleQtEnumValue ) )* otherlv_4= '}' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:659:1: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleQtEnumValue ) )* otherlv_4= '}' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:659:1: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleQtEnumValue ) )* otherlv_4= '}' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:659:3: otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleQtEnumValue ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleQtEnum1256); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtEnumAccess().getEnumerationKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:663:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:664:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:664:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:665:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtEnum1273); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleQtEnum1290); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQtEnumAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:685:1: ( (lv_values_3_0= ruleQtEnumValue ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:686:1: (lv_values_3_0= ruleQtEnumValue )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:686:1: (lv_values_3_0= ruleQtEnumValue )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:687:3: lv_values_3_0= ruleQtEnumValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtEnumAccess().getValuesQtEnumValueParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtEnumValue_in_ruleQtEnum1311);
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
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleQtEnum1324); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:715:1: entryRuleQtFlags returns [EObject current=null] : iv_ruleQtFlags= ruleQtFlags EOF ;
    public final EObject entryRuleQtFlags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtFlags = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:716:2: (iv_ruleQtFlags= ruleQtFlags EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:717:2: iv_ruleQtFlags= ruleQtFlags EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtFlagsRule()); 
            }
            pushFollow(FOLLOW_ruleQtFlags_in_entryRuleQtFlags1360);
            iv_ruleQtFlags=ruleQtFlags();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtFlags; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtFlags1370); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:724:1: ruleQtFlags returns [EObject current=null] : (otherlv_0= 'flags' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleQtFlags() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:727:28: ( (otherlv_0= 'flags' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:728:1: (otherlv_0= 'flags' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:728:1: (otherlv_0= 'flags' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:728:3: otherlv_0= 'flags' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleQtFlags1407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtFlagsAccess().getFlagsKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:732:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:733:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:733:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:734:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtFlags1424); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleQtFlags1441); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQtFlagsAccess().getColonKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:754:1: ( (otherlv_3= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:755:1: (otherlv_3= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:755:1: (otherlv_3= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:756:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getQtFlagsRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtFlags1461); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:775:1: entryRuleQtEnumValue returns [EObject current=null] : iv_ruleQtEnumValue= ruleQtEnumValue EOF ;
    public final EObject entryRuleQtEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtEnumValue = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:776:2: (iv_ruleQtEnumValue= ruleQtEnumValue EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:777:2: iv_ruleQtEnumValue= ruleQtEnumValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtEnumValueRule()); 
            }
            pushFollow(FOLLOW_ruleQtEnumValue_in_entryRuleQtEnumValue1497);
            iv_ruleQtEnumValue=ruleQtEnumValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtEnumValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtEnumValue1507); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:784:1: ruleQtEnumValue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_enumMask_2_0= ruleQtEnumValueMask ) ) | ( (lv_numericValue_3_0= RULE_INT ) ) ) ) ;
    public final EObject ruleQtEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_numericValue_3_0=null;
        EObject lv_enumMask_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:787:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_enumMask_2_0= ruleQtEnumValueMask ) ) | ( (lv_numericValue_3_0= RULE_INT ) ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:788:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_enumMask_2_0= ruleQtEnumValueMask ) ) | ( (lv_numericValue_3_0= RULE_INT ) ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:788:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_enumMask_2_0= ruleQtEnumValueMask ) ) | ( (lv_numericValue_3_0= RULE_INT ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:788:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_enumMask_2_0= ruleQtEnumValueMask ) ) | ( (lv_numericValue_3_0= RULE_INT ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:788:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:789:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:789:1: (lv_name_0_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:790:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtEnumValue1549); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleQtEnumValue1566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getQtEnumValueAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:810:1: ( ( (lv_enumMask_2_0= ruleQtEnumValueMask ) ) | ( (lv_numericValue_3_0= RULE_INT ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_INT) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:810:2: ( (lv_enumMask_2_0= ruleQtEnumValueMask ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:810:2: ( (lv_enumMask_2_0= ruleQtEnumValueMask ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:811:1: (lv_enumMask_2_0= ruleQtEnumValueMask )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:811:1: (lv_enumMask_2_0= ruleQtEnumValueMask )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:812:3: lv_enumMask_2_0= ruleQtEnumValueMask
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtEnumValueAccess().getEnumMaskQtEnumValueMaskParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQtEnumValueMask_in_ruleQtEnumValue1588);
                    lv_enumMask_2_0=ruleQtEnumValueMask();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getQtEnumValueRule());
                      	        }
                             		set(
                             			current, 
                             			"enumMask",
                              		lv_enumMask_2_0, 
                              		"QtEnumValueMask");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:829:6: ( (lv_numericValue_3_0= RULE_INT ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:829:6: ( (lv_numericValue_3_0= RULE_INT ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:830:1: (lv_numericValue_3_0= RULE_INT )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:830:1: (lv_numericValue_3_0= RULE_INT )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:831:3: lv_numericValue_3_0= RULE_INT
                    {
                    lv_numericValue_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQtEnumValue1611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_numericValue_3_0, grammarAccess.getQtEnumValueAccess().getNumericValueINTTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getQtEnumValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"numericValue",
                              		lv_numericValue_3_0, 
                              		"INT");
                      	    
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
    // $ANTLR end "ruleQtEnumValue"


    // $ANTLR start "entryRuleQtEnumValueMask"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:855:1: entryRuleQtEnumValueMask returns [EObject current=null] : iv_ruleQtEnumValueMask= ruleQtEnumValueMask EOF ;
    public final EObject entryRuleQtEnumValueMask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtEnumValueMask = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:856:2: (iv_ruleQtEnumValueMask= ruleQtEnumValueMask EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:857:2: iv_ruleQtEnumValueMask= ruleQtEnumValueMask EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtEnumValueMaskRule()); 
            }
            pushFollow(FOLLOW_ruleQtEnumValueMask_in_entryRuleQtEnumValueMask1653);
            iv_ruleQtEnumValueMask=ruleQtEnumValueMask();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtEnumValueMask; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtEnumValueMask1663); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQtEnumValueMask"


    // $ANTLR start "ruleQtEnumValueMask"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:864:1: ruleQtEnumValueMask returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleQtEnumValueMask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:867:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:868:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:868:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|' ( (otherlv_2= RULE_ID ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:868:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '|' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:868:2: ( (otherlv_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:869:1: (otherlv_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:869:1: (otherlv_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:870:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getQtEnumValueMaskRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtEnumValueMask1708); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getQtEnumValueMaskAccess().getValueQtEnumValueCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:881:2: (otherlv_1= '|' ( (otherlv_2= RULE_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:881:4: otherlv_1= '|' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleQtEnumValueMask1721); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getQtEnumValueMaskAccess().getVerticalLineKeyword_1_0());
            	          
            	    }
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:885:1: ( (otherlv_2= RULE_ID ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:886:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:886:1: (otherlv_2= RULE_ID )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:887:3: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getQtEnumValueMaskRule());
            	      	        }
            	              
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtEnumValueMask1741); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_2, grammarAccess.getQtEnumValueMaskAccess().getValueQtEnumValueCrossReference_1_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleQtEnumValueMask"


    // $ANTLR start "entryRuleQtBuitinType"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:906:1: entryRuleQtBuitinType returns [EObject current=null] : iv_ruleQtBuitinType= ruleQtBuitinType EOF ;
    public final EObject entryRuleQtBuitinType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtBuitinType = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:907:2: (iv_ruleQtBuitinType= ruleQtBuitinType EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:908:2: iv_ruleQtBuitinType= ruleQtBuitinType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtBuitinTypeRule()); 
            }
            pushFollow(FOLLOW_ruleQtBuitinType_in_entryRuleQtBuitinType1779);
            iv_ruleQtBuitinType=ruleQtBuitinType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtBuitinType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtBuitinType1789); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:915:1: ruleQtBuitinType returns [EObject current=null] : (otherlv_0= 'builtin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleJvmArgumentTypeReference ) ) ) ;
    public final EObject ruleQtBuitinType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:918:28: ( (otherlv_0= 'builtin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleJvmArgumentTypeReference ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:919:1: (otherlv_0= 'builtin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleJvmArgumentTypeReference ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:919:1: (otherlv_0= 'builtin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleJvmArgumentTypeReference ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:919:3: otherlv_0= 'builtin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleJvmArgumentTypeReference ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleQtBuitinType1826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtBuitinTypeAccess().getBuiltinKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:923:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:924:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:924:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:925:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtBuitinType1843); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleQtBuitinType1860); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQtBuitinTypeAccess().getColonKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:945:1: ( (lv_value_3_0= ruleJvmArgumentTypeReference ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:946:1: (lv_value_3_0= ruleJvmArgumentTypeReference )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:946:1: (lv_value_3_0= ruleJvmArgumentTypeReference )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:947:3: lv_value_3_0= ruleJvmArgumentTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtBuitinTypeAccess().getValueJvmArgumentTypeReferenceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleQtBuitinType1881);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:971:1: entryRuleQtFunction returns [EObject current=null] : iv_ruleQtFunction= ruleQtFunction EOF ;
    public final EObject entryRuleQtFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtFunction = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:972:2: (iv_ruleQtFunction= ruleQtFunction EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:973:2: iv_ruleQtFunction= ruleQtFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleQtFunction_in_entryRuleQtFunction1917);
            iv_ruleQtFunction=ruleQtFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtFunction1927); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:980:1: ruleQtFunction returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) ) ( (lv_const_1_0= 'const' ) )? ( (lv_virtual_2_0= ruleVirtuality ) )? ( (lv_owner_3_0= ruleOwner ) ) otherlv_4= 'function' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleQtParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleQtParameter ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_returnValue_12_0= ruleQtReturnValue ) ) otherlv_13= ';' ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:983:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) ) ( (lv_const_1_0= 'const' ) )? ( (lv_virtual_2_0= ruleVirtuality ) )? ( (lv_owner_3_0= ruleOwner ) ) otherlv_4= 'function' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleQtParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleQtParameter ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_returnValue_12_0= ruleQtReturnValue ) ) otherlv_13= ';' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:984:1: ( ( (lv_visibility_0_0= ruleVisibility ) ) ( (lv_const_1_0= 'const' ) )? ( (lv_virtual_2_0= ruleVirtuality ) )? ( (lv_owner_3_0= ruleOwner ) ) otherlv_4= 'function' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleQtParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleQtParameter ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_returnValue_12_0= ruleQtReturnValue ) ) otherlv_13= ';' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:984:1: ( ( (lv_visibility_0_0= ruleVisibility ) ) ( (lv_const_1_0= 'const' ) )? ( (lv_virtual_2_0= ruleVirtuality ) )? ( (lv_owner_3_0= ruleOwner ) ) otherlv_4= 'function' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleQtParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleQtParameter ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_returnValue_12_0= ruleQtReturnValue ) ) otherlv_13= ';' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:984:2: ( (lv_visibility_0_0= ruleVisibility ) ) ( (lv_const_1_0= 'const' ) )? ( (lv_virtual_2_0= ruleVirtuality ) )? ( (lv_owner_3_0= ruleOwner ) ) otherlv_4= 'function' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleQtParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleQtParameter ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_returnValue_12_0= ruleQtReturnValue ) ) otherlv_13= ';'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:984:2: ( (lv_visibility_0_0= ruleVisibility ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:985:1: (lv_visibility_0_0= ruleVisibility )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:985:1: (lv_visibility_0_0= ruleVisibility )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:986:3: lv_visibility_0_0= ruleVisibility
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtFunctionAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVisibility_in_ruleQtFunction1973);
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1002:2: ( (lv_const_1_0= 'const' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1003:1: (lv_const_1_0= 'const' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1003:1: (lv_const_1_0= 'const' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1004:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,28,FOLLOW_28_in_ruleQtFunction1991); if (state.failed) return current;
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1017:3: ( (lv_virtual_2_0= ruleVirtuality ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=83 && LA22_0<=84)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1018:1: (lv_virtual_2_0= ruleVirtuality )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1018:1: (lv_virtual_2_0= ruleVirtuality )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1019:3: lv_virtual_2_0= ruleVirtuality
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtFunctionAccess().getVirtualVirtualityEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVirtuality_in_ruleQtFunction2026);
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1035:3: ( (lv_owner_3_0= ruleOwner ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1036:1: (lv_owner_3_0= ruleOwner )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1036:1: (lv_owner_3_0= ruleOwner )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1037:3: lv_owner_3_0= ruleOwner
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtFunctionAccess().getOwnerOwnerEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOwner_in_ruleQtFunction2048);
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

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleQtFunction2060); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQtFunctionAccess().getFunctionKeyword_4());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1057:1: ( (lv_name_5_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1058:1: (lv_name_5_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1058:1: (lv_name_5_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1059:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtFunction2077); if (state.failed) return current;
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

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleQtFunction2094); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getQtFunctionAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1079:1: ( ( (lv_params_7_0= ruleQtParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleQtParameter ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||LA24_0==28||(LA24_0>=88 && LA24_0<=89)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1079:2: ( (lv_params_7_0= ruleQtParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleQtParameter ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1079:2: ( (lv_params_7_0= ruleQtParameter ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1080:1: (lv_params_7_0= ruleQtParameter )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1080:1: (lv_params_7_0= ruleQtParameter )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1081:3: lv_params_7_0= ruleQtParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtFunctionAccess().getParamsQtParameterParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQtParameter_in_ruleQtFunction2116);
                    lv_params_7_0=ruleQtParameter();

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
                              		"QtParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1097:2: (otherlv_8= ',' ( (lv_params_9_0= ruleQtParameter ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==16) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1097:4: otherlv_8= ',' ( (lv_params_9_0= ruleQtParameter ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleQtFunction2129); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getQtFunctionAccess().getCommaKeyword_7_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1101:1: ( (lv_params_9_0= ruleQtParameter ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1102:1: (lv_params_9_0= ruleQtParameter )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1102:1: (lv_params_9_0= ruleQtParameter )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1103:3: lv_params_9_0= ruleQtParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getQtFunctionAccess().getParamsQtParameterParserRuleCall_7_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQtParameter_in_ruleQtFunction2150);
                    	    lv_params_9_0=ruleQtParameter();

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
                    	              		"QtParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleQtFunction2166); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getQtFunctionAccess().getRightParenthesisKeyword_8());
                  
            }
            otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleQtFunction2178); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getQtFunctionAccess().getColonKeyword_9());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1127:1: ( (lv_returnValue_12_0= ruleQtReturnValue ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1128:1: (lv_returnValue_12_0= ruleQtReturnValue )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1128:1: (lv_returnValue_12_0= ruleQtReturnValue )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1129:3: lv_returnValue_12_0= ruleQtReturnValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtFunctionAccess().getReturnValueQtReturnValueParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQtReturnValue_in_ruleQtFunction2199);
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

            otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleQtFunction2211); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1157:1: entryRuleQtValue returns [EObject current=null] : iv_ruleQtValue= ruleQtValue EOF ;
    public final EObject entryRuleQtValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtValue = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1158:2: (iv_ruleQtValue= ruleQtValue EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1159:2: iv_ruleQtValue= ruleQtValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtValueRule()); 
            }
            pushFollow(FOLLOW_ruleQtValue_in_entryRuleQtValue2247);
            iv_ruleQtValue=ruleQtValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtValue2257); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1166:1: ruleQtValue returns [EObject current=null] : ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleQtValue() throws RecognitionException {
        EObject current = null;

        Token lv_const_0_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Enumerator lv_valueType_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1169:28: ( ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1170:1: ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1170:1: ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1170:2: ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1170:2: ( (lv_const_0_0= 'const' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1171:1: (lv_const_0_0= 'const' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1171:1: (lv_const_0_0= 'const' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1172:3: lv_const_0_0= 'const'
                    {
                    lv_const_0_0=(Token)match(input,28,FOLLOW_28_in_ruleQtValue2300); if (state.failed) return current;
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1185:3: ( (lv_valueType_1_0= ruleType ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=88 && LA26_0<=89)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1186:1: (lv_valueType_1_0= ruleType )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1186:1: (lv_valueType_1_0= ruleType )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1187:3: lv_valueType_1_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtValueAccess().getValueTypeTypeEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleQtValue2335);
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1203:3: ( (otherlv_2= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1204:1: (otherlv_2= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1204:1: (otherlv_2= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1205:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getQtValueRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtValue2356); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getQtValueAccess().getTypeQtTypeCrossReference_2_0()); 
              	
            }

            }


            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1216:2: ( (lv_name_3_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1217:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1217:1: (lv_name_3_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1218:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtValue2373); if (state.failed) return current;
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


    // $ANTLR start "entryRuleQtParameter"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1242:1: entryRuleQtParameter returns [EObject current=null] : iv_ruleQtParameter= ruleQtParameter EOF ;
    public final EObject entryRuleQtParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtParameter = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1243:2: (iv_ruleQtParameter= ruleQtParameter EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1244:2: iv_ruleQtParameter= ruleQtParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtParameterRule()); 
            }
            pushFollow(FOLLOW_ruleQtParameter_in_entryRuleQtParameter2414);
            iv_ruleQtParameter=ruleQtParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtParameter2424); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQtParameter"


    // $ANTLR start "ruleQtParameter"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1251:1: ruleQtParameter returns [EObject current=null] : ( ( (lv_value_0_0= ruleQtValue ) ) (otherlv_1= '=' ( ( (lv_defaultInt_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )? ) ;
    public final EObject ruleQtParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_defaultInt_2_0=null;
        Token otherlv_3=null;
        EObject lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1254:28: ( ( ( (lv_value_0_0= ruleQtValue ) ) (otherlv_1= '=' ( ( (lv_defaultInt_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )? ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1255:1: ( ( (lv_value_0_0= ruleQtValue ) ) (otherlv_1= '=' ( ( (lv_defaultInt_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )? )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1255:1: ( ( (lv_value_0_0= ruleQtValue ) ) (otherlv_1= '=' ( ( (lv_defaultInt_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )? )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1255:2: ( (lv_value_0_0= ruleQtValue ) ) (otherlv_1= '=' ( ( (lv_defaultInt_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )?
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1255:2: ( (lv_value_0_0= ruleQtValue ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1256:1: (lv_value_0_0= ruleQtValue )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1256:1: (lv_value_0_0= ruleQtValue )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1257:3: lv_value_0_0= ruleQtValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtParameterAccess().getValueQtValueParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQtValue_in_ruleQtParameter2470);
            lv_value_0_0=ruleQtValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQtParameterRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"QtValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1273:2: (otherlv_1= '=' ( ( (lv_defaultInt_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1273:4: otherlv_1= '=' ( ( (lv_defaultInt_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleQtParameter2483); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getQtParameterAccess().getEqualsSignKeyword_1_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1277:1: ( ( (lv_defaultInt_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_INT) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==RULE_ID) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1277:2: ( (lv_defaultInt_2_0= RULE_INT ) )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1277:2: ( (lv_defaultInt_2_0= RULE_INT ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1278:1: (lv_defaultInt_2_0= RULE_INT )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1278:1: (lv_defaultInt_2_0= RULE_INT )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1279:3: lv_defaultInt_2_0= RULE_INT
                            {
                            lv_defaultInt_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQtParameter2501); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_defaultInt_2_0, grammarAccess.getQtParameterAccess().getDefaultIntINTTerminalRuleCall_1_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getQtParameterRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"defaultInt",
                                      		lv_defaultInt_2_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1296:6: ( (otherlv_3= RULE_ID ) )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1296:6: ( (otherlv_3= RULE_ID ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1297:1: (otherlv_3= RULE_ID )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1297:1: (otherlv_3= RULE_ID )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1298:3: otherlv_3= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getQtParameterRule());
                              	        }
                                      
                            }
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtParameter2532); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_3, grammarAccess.getQtParameterAccess().getDefaultEnumQtEnumValueCrossReference_1_1_1_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleQtParameter"


    // $ANTLR start "entryRuleQtReturnValue"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1317:1: entryRuleQtReturnValue returns [EObject current=null] : iv_ruleQtReturnValue= ruleQtReturnValue EOF ;
    public final EObject entryRuleQtReturnValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtReturnValue = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1318:2: (iv_ruleQtReturnValue= ruleQtReturnValue EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1319:2: iv_ruleQtReturnValue= ruleQtReturnValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtReturnValueRule()); 
            }
            pushFollow(FOLLOW_ruleQtReturnValue_in_entryRuleQtReturnValue2571);
            iv_ruleQtReturnValue=ruleQtReturnValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtReturnValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtReturnValue2581); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1326:1: ruleQtReturnValue returns [EObject current=null] : ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleQtReturnValue() throws RecognitionException {
        EObject current = null;

        Token lv_const_0_0=null;
        Token otherlv_2=null;
        Enumerator lv_valueType_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1329:28: ( ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1330:1: ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( (otherlv_2= RULE_ID ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1330:1: ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( (otherlv_2= RULE_ID ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1330:2: ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( (otherlv_2= RULE_ID ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1330:2: ( (lv_const_0_0= 'const' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1331:1: (lv_const_0_0= 'const' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1331:1: (lv_const_0_0= 'const' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1332:3: lv_const_0_0= 'const'
                    {
                    lv_const_0_0=(Token)match(input,28,FOLLOW_28_in_ruleQtReturnValue2624); if (state.failed) return current;
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1345:3: ( (lv_valueType_1_0= ruleType ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=88 && LA30_0<=89)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1346:1: (lv_valueType_1_0= ruleType )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1346:1: (lv_valueType_1_0= ruleType )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1347:3: lv_valueType_1_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtReturnValueAccess().getValueTypeTypeEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleQtReturnValue2659);
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1363:3: ( (otherlv_2= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1364:1: (otherlv_2= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1364:1: (otherlv_2= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1365:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getQtReturnValueRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtReturnValue2680); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1384:1: entryRuleQtSignal returns [EObject current=null] : iv_ruleQtSignal= ruleQtSignal EOF ;
    public final EObject entryRuleQtSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtSignal = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1385:2: (iv_ruleQtSignal= ruleQtSignal EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1386:2: iv_ruleQtSignal= ruleQtSignal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtSignalRule()); 
            }
            pushFollow(FOLLOW_ruleQtSignal_in_entryRuleQtSignal2716);
            iv_ruleQtSignal=ruleQtSignal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtSignal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtSignal2726); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1393:1: ruleQtSignal returns [EObject current=null] : (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1396:28: ( (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1397:1: (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1397:1: (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1397:3: otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleQtSignal2763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtSignalAccess().getSignalKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1401:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1402:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1402:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1403:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtSignal2780); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleQtSignal2797); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQtSignalAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1423:1: ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID||LA32_0==28||(LA32_0>=88 && LA32_0<=89)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1423:2: ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1423:2: ( (lv_params_3_0= ruleQtParameter ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1424:1: (lv_params_3_0= ruleQtParameter )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1424:1: (lv_params_3_0= ruleQtParameter )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1425:3: lv_params_3_0= ruleQtParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtSignalAccess().getParamsQtParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQtParameter_in_ruleQtSignal2819);
                    lv_params_3_0=ruleQtParameter();

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
                              		"QtParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1441:2: (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==16) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1441:4: otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleQtSignal2832); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getQtSignalAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1445:1: ( (lv_params_5_0= ruleQtParameter ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1446:1: (lv_params_5_0= ruleQtParameter )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1446:1: (lv_params_5_0= ruleQtParameter )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1447:3: lv_params_5_0= ruleQtParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getQtSignalAccess().getParamsQtParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQtParameter_in_ruleQtSignal2853);
                    	    lv_params_5_0=ruleQtParameter();

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
                    	              		"QtParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleQtSignal2869); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getQtSignalAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleQtSignal2881); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getQtSignalAccess().getColonKeyword_5());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1471:1: ( (lv_returnValue_8_0= ruleQtReturnValue ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1472:1: (lv_returnValue_8_0= ruleQtReturnValue )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1472:1: (lv_returnValue_8_0= ruleQtReturnValue )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1473:3: lv_returnValue_8_0= ruleQtReturnValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtSignalAccess().getReturnValueQtReturnValueParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQtReturnValue_in_ruleQtSignal2902);
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

            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleQtSignal2914); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1501:1: entryRuleQtSlot returns [EObject current=null] : iv_ruleQtSlot= ruleQtSlot EOF ;
    public final EObject entryRuleQtSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtSlot = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1502:2: (iv_ruleQtSlot= ruleQtSlot EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1503:2: iv_ruleQtSlot= ruleQtSlot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtSlotRule()); 
            }
            pushFollow(FOLLOW_ruleQtSlot_in_entryRuleQtSlot2950);
            iv_ruleQtSlot=ruleQtSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtSlot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtSlot2960); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1510:1: ruleQtSlot returns [EObject current=null] : (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1513:28: ( (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1514:1: (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1514:1: (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1514:3: otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleQtSlot2997); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtSlotAccess().getSlotKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1518:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1519:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1519:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1520:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtSlot3014); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleQtSlot3031); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQtSlotAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1540:1: ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID||LA34_0==28||(LA34_0>=88 && LA34_0<=89)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1540:2: ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1540:2: ( (lv_params_3_0= ruleQtParameter ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1541:1: (lv_params_3_0= ruleQtParameter )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1541:1: (lv_params_3_0= ruleQtParameter )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1542:3: lv_params_3_0= ruleQtParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtSlotAccess().getParamsQtParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQtParameter_in_ruleQtSlot3053);
                    lv_params_3_0=ruleQtParameter();

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
                              		"QtParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1558:2: (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==16) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1558:4: otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleQtSlot3066); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getQtSlotAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1562:1: ( (lv_params_5_0= ruleQtParameter ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1563:1: (lv_params_5_0= ruleQtParameter )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1563:1: (lv_params_5_0= ruleQtParameter )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1564:3: lv_params_5_0= ruleQtParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getQtSlotAccess().getParamsQtParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQtParameter_in_ruleQtSlot3087);
                    	    lv_params_5_0=ruleQtParameter();

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
                    	              		"QtParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleQtSlot3103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getQtSlotAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleQtSlot3115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getQtSlotAccess().getColonKeyword_5());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1588:1: ( (lv_returnValue_8_0= ruleQtReturnValue ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1589:1: (lv_returnValue_8_0= ruleQtReturnValue )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1589:1: (lv_returnValue_8_0= ruleQtReturnValue )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1590:3: lv_returnValue_8_0= ruleQtReturnValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtSlotAccess().getReturnValueQtReturnValueParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQtReturnValue_in_ruleQtSlot3136);
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

            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleQtSlot3148); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1618:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1619:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1620:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression3184);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression3194); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1627:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1630:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1632:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression3240);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1648:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1649:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1650:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment3274);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment3284); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1657:1: ruleXAssignment returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1660:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1661:1: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1661:1: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==EOF||(LA36_1>=RULE_ID && LA36_1<=RULE_STRING)||(LA36_1>=12 && LA36_1<=13)||LA36_1==16||LA36_1==18||LA36_1==21||LA36_1==24||LA36_1==30||(LA36_1>=33 && LA36_1<=80)) ) {
                    alt36=2;
                }
                else if ( (LA36_1==25) ) {
                    alt36=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA36_0>=RULE_INT && LA36_0<=RULE_STRING)||LA36_0==12||LA36_0==18||LA36_0==42||(LA36_0>=45 && LA36_0<=46)||LA36_0==51||LA36_0==56||LA36_0==58||LA36_0==60||(LA36_0>=63 && LA36_0<=65)||LA36_0==68||(LA36_0>=70 && LA36_0<=77)) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1661:2: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1661:2: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1661:3: () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1661:3: ()
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1662:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1667:2: ( (otherlv_1= RULE_ID ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1668:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1668:1: (otherlv_1= RULE_ID )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1669:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXAssignment3339); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment3355);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1688:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1689:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1689:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1690:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment3375);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1707:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1707:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1708:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment3405);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1716:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==33) ) {
                        int LA35_1 = input.LA(2);

                        if ( (synpred1_InternalQIdl()) ) {
                            alt35=1;
                        }
                    }
                    switch (alt35) {
                        case 1 :
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1716:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1716:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1716:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1721:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1721:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1721:7: ()
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1722:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1727:2: ( ( ruleOpMultiAssign ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1728:1: ( ruleOpMultiAssign )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1728:1: ( ruleOpMultiAssign )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1729:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment3458);
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

                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1742:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1743:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1743:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1744:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment3481);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1768:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1769:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1770:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign3521);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign3532); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1777:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1780:28: (kw= '=' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1782:2: kw= '='
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpSingleAssign3569); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1795:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1796:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1797:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign3609);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign3620); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1804:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1807:28: (kw= '+=' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1809:2: kw= '+='
            {
            kw=(Token)match(input,33,FOLLOW_33_in_ruleOpMultiAssign3657); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1822:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1823:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1824:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression3696);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression3706); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1831:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1834:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1835:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1835:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1836:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression3753);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1844:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==34) ) {
                    int LA37_2 = input.LA(2);

                    if ( (synpred2_InternalQIdl()) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1844:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1844:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1844:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1849:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1849:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1849:7: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1850:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1855:2: ( ( ruleOpOr ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1856:1: ( ruleOpOr )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1856:1: ( ruleOpOr )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1857:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression3806);
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

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1870:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1871:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1871:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1872:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression3829);
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
            	    break loop37;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1896:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1897:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1898:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr3868);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr3879); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1905:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1908:28: (kw= '||' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1910:2: kw= '||'
            {
            kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOr3916); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1923:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1924:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1925:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression3955);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression3965); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1932:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1935:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1936:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1936:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1937:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression4012);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1945:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==35) ) {
                    int LA38_2 = input.LA(2);

                    if ( (synpred3_InternalQIdl()) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1945:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1945:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1945:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1950:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1950:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1950:7: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1951:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1956:2: ( ( ruleOpAnd ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1957:1: ( ruleOpAnd )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1957:1: ( ruleOpAnd )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1958:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression4065);
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

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1971:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1972:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1972:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1973:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression4088);
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1997:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1998:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1999:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd4127);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd4138); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2006:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2009:28: (kw= '&&' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2011:2: kw= '&&'
            {
            kw=(Token)match(input,35,FOLLOW_35_in_ruleOpAnd4175); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2024:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2025:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2026:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression4214);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression4224); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2033:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2036:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2037:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2037:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2038:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression4271);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2046:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==36) ) {
                    int LA39_2 = input.LA(2);

                    if ( (synpred4_InternalQIdl()) ) {
                        alt39=1;
                    }


                }
                else if ( (LA39_0==37) ) {
                    int LA39_3 = input.LA(2);

                    if ( (synpred4_InternalQIdl()) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2046:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2046:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2046:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2051:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2051:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2051:7: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2052:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2057:2: ( ( ruleOpEquality ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2058:1: ( ruleOpEquality )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2058:1: ( ruleOpEquality )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2059:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression4324);
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

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2072:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2073:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2073:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2074:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression4347);
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
            	    break loop39;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2098:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2099:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2100:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality4386);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality4397); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2107:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2110:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2111:1: (kw= '==' | kw= '!=' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2111:1: (kw= '==' | kw= '!=' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==36) ) {
                alt40=1;
            }
            else if ( (LA40_0==37) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2112:2: kw= '=='
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpEquality4435); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2119:2: kw= '!='
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpEquality4454); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2132:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2133:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2134:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression4494);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression4504); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2141:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2144:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2145:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2145:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2146:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4551);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2154:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop41:
            do {
                int alt41=3;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    int LA41_2 = input.LA(2);

                    if ( (synpred5_InternalQIdl()) ) {
                        alt41=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA41_3 = input.LA(2);

                    if ( (synpred6_InternalQIdl()) ) {
                        alt41=2;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA41_4 = input.LA(2);

                    if ( (synpred6_InternalQIdl()) ) {
                        alt41=2;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA41_5 = input.LA(2);

                    if ( (synpred6_InternalQIdl()) ) {
                        alt41=2;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA41_6 = input.LA(2);

                    if ( (synpred6_InternalQIdl()) ) {
                        alt41=2;
                    }


                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2154:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2154:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2154:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2154:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2154:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2156:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2156:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2156:6: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2157:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXRelationalExpression4587); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2166:3: ( ( ruleQualifiedName ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2167:1: ( ruleQualifiedName )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2167:1: ( ruleQualifiedName )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2168:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression4612);
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
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2182:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2182:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2182:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2182:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2182:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2187:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2187:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2187:7: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2188:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2193:2: ( ( ruleOpCompare ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2194:1: ( ruleOpCompare )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2194:1: ( ruleOpCompare )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2195:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression4673);
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

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2208:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2209:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2209:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2210:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4696);
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
            	    break loop41;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2234:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2235:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2236:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare4736);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare4747); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2243:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2246:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2247:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2247:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt42=1;
                }
                break;
            case 40:
                {
                alt42=2;
                }
                break;
            case 41:
                {
                alt42=3;
                }
                break;
            case 42:
                {
                alt42=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2248:2: kw= '>='
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpCompare4785); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2255:2: kw= '<='
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpCompare4804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2262:2: kw= '>'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpCompare4823); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2269:2: kw= '<'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpCompare4842); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2282:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2283:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2284:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression4882);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression4892); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2291:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2294:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2295:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2295:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2296:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4939);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2304:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==43) ) {
                    int LA43_2 = input.LA(2);

                    if ( (synpred7_InternalQIdl()) ) {
                        alt43=1;
                    }


                }
                else if ( (LA43_0==44) ) {
                    int LA43_3 = input.LA(2);

                    if ( (synpred7_InternalQIdl()) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2304:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2304:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2304:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2309:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2309:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2309:7: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2310:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2315:2: ( ( ruleOpOther ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2316:1: ( ruleOpOther )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2316:1: ( ruleOpOther )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2317:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression4992);
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

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2330:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2331:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2331:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2332:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression5015);
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
            	    break loop43;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2356:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2357:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2358:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther5054);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther5065); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2365:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2368:28: ( (kw= '->' | kw= '..' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2369:1: (kw= '->' | kw= '..' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2369:1: (kw= '->' | kw= '..' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==43) ) {
                alt44=1;
            }
            else if ( (LA44_0==44) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2370:2: kw= '->'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpOther5103); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2377:2: kw= '..'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpOther5122); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2390:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2391:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2392:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression5162);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression5172); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2399:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2402:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2403:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2403:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2404:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5219);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2412:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==45) ) {
                    int LA45_2 = input.LA(2);

                    if ( (synpred8_InternalQIdl()) ) {
                        alt45=1;
                    }


                }
                else if ( (LA45_0==46) ) {
                    int LA45_3 = input.LA(2);

                    if ( (synpred8_InternalQIdl()) ) {
                        alt45=1;
                    }


                }


                switch (alt45) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2412:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2412:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2412:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2417:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2417:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2417:7: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2418:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2423:2: ( ( ruleOpAdd ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2424:1: ( ruleOpAdd )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2424:1: ( ruleOpAdd )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2425:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression5272);
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

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2438:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2439:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2439:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2440:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5295);
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
            	    break loop45;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2464:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2465:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2466:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd5334);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd5345); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2473:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2476:28: ( (kw= '+' | kw= '-' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2477:1: (kw= '+' | kw= '-' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2477:1: (kw= '+' | kw= '-' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==45) ) {
                alt46=1;
            }
            else if ( (LA46_0==46) ) {
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2478:2: kw= '+'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpAdd5383); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2485:2: kw= '-'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpAdd5402); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2498:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2499:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2500:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression5442);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression5452); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2507:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2510:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2511:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2511:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2512:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5499);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2520:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop47:
            do {
                int alt47=2;
                switch ( input.LA(1) ) {
                case 47:
                    {
                    int LA47_2 = input.LA(2);

                    if ( (synpred9_InternalQIdl()) ) {
                        alt47=1;
                    }


                    }
                    break;
                case 48:
                    {
                    int LA47_3 = input.LA(2);

                    if ( (synpred9_InternalQIdl()) ) {
                        alt47=1;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA47_4 = input.LA(2);

                    if ( (synpred9_InternalQIdl()) ) {
                        alt47=1;
                    }


                    }
                    break;
                case 50:
                    {
                    int LA47_5 = input.LA(2);

                    if ( (synpred9_InternalQIdl()) ) {
                        alt47=1;
                    }


                    }
                    break;

                }

                switch (alt47) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2520:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2520:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2520:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2525:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2525:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2525:7: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2526:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2531:2: ( ( ruleOpMulti ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2532:1: ( ruleOpMulti )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2532:1: ( ruleOpMulti )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2533:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression5552);
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

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2546:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2547:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2547:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2548:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5575);
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
            	    break loop47;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2572:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2573:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2574:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti5614);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti5625); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2581:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2584:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2585:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2585:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt48=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt48=1;
                }
                break;
            case 48:
                {
                alt48=2;
                }
                break;
            case 49:
                {
                alt48=3;
                }
                break;
            case 50:
                {
                alt48=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2586:2: kw= '*'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpMulti5663); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2593:2: kw= '**'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOpMulti5682); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2600:2: kw= '/'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleOpMulti5701); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2607:2: kw= '%'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleOpMulti5720); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2620:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2621:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2622:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation5760);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation5770); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2629:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2632:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2633:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2633:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=45 && LA49_0<=46)||LA49_0==51) ) {
                alt49=1;
            }
            else if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_STRING)||LA49_0==12||LA49_0==18||LA49_0==42||LA49_0==56||LA49_0==58||LA49_0==60||(LA49_0>=63 && LA49_0<=65)||LA49_0==68||(LA49_0>=70 && LA49_0<=77)) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2633:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2633:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2633:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2633:3: ()
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2634:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2639:2: ( ( ruleOpUnary ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2640:1: ( ruleOpUnary )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2640:1: ( ruleOpUnary )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2641:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation5828);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2654:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2655:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2655:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2656:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5849);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2674:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5878);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2690:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2691:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2692:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary5914);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary5925); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2699:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2702:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2703:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2703:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt50=1;
                }
                break;
            case 46:
                {
                alt50=2;
                }
                break;
            case 45:
                {
                alt50=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2704:2: kw= '!'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleOpUnary5963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2711:2: kw= '-'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpUnary5982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2718:2: kw= '+'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpUnary6001); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2731:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2732:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2733:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression6041);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression6051); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2740:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2743:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2744:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2744:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2745:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression6098);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2753:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==52) ) {
                    int LA51_2 = input.LA(2);

                    if ( (synpred10_InternalQIdl()) ) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2753:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2753:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2753:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2755:5: ( () otherlv_2= 'as' )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2755:6: () otherlv_2= 'as'
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2755:6: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2756:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleXCastedExpression6133); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2765:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2766:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2766:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2767:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression6156);
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
            	    break loop51;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2791:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2792:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2793:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall6194);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall6204); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2800:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2803:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2804:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2804:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2805:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall6251);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2813:1: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            loop58:
            do {
                int alt58=3;
                switch ( input.LA(1) ) {
                case 53:
                    {
                    int LA58_2 = input.LA(2);

                    if ( (synpred11_InternalQIdl()) ) {
                        alt58=1;
                    }
                    else if ( (synpred12_InternalQIdl()) ) {
                        alt58=2;
                    }


                    }
                    break;
                case 54:
                    {
                    int LA58_3 = input.LA(2);

                    if ( (synpred12_InternalQIdl()) ) {
                        alt58=2;
                    }


                    }
                    break;
                case 55:
                    {
                    int LA58_4 = input.LA(2);

                    if ( (synpred12_InternalQIdl()) ) {
                        alt58=2;
                    }


                    }
                    break;

                }

                switch (alt58) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2813:2: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2813:2: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2813:3: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2813:3: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2813:4: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2820:25: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2820:26: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2820:26: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2821:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleXMemberFeatureCall6300); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2830:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2831:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2831:1: (otherlv_3= RULE_ID )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2832:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXMemberFeatureCall6320); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall6336);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2851:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2852:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2852:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2853:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall6358);
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
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2870:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2870:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2870:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2870:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2870:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2886:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2886:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2886:8: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2887:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2892:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt52=3;
            	    switch ( input.LA(1) ) {
            	    case 53:
            	        {
            	        alt52=1;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt52=2;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt52=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 52, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt52) {
            	        case 1 :
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2892:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleXMemberFeatureCall6444); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2897:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2897:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2898:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2898:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2899:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,54,FOLLOW_54_in_ruleXMemberFeatureCall6468); if (state.failed) return current;
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
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2913:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2913:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2914:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2914:1: (lv_spreading_9_0= '*.' )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2915:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,55,FOLLOW_55_in_ruleXMemberFeatureCall6505); if (state.failed) return current;
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

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2928:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==42) ) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2928:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall6534); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2932:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2933:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2933:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2934:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6555);
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

            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2950:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop53:
            	            do {
            	                int alt53=2;
            	                int LA53_0 = input.LA(1);

            	                if ( (LA53_0==16) ) {
            	                    alt53=1;
            	                }


            	                switch (alt53) {
            	            	case 1 :
            	            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2950:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall6568); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2954:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2955:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2955:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2956:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6589);
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
            	            	    break loop53;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall6603); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2976:3: ( (otherlv_15= RULE_ID ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2977:1: (otherlv_15= RULE_ID )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2977:1: (otherlv_15= RULE_ID )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2978:3: otherlv_15= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXMemberFeatureCall6625); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_15, grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2989:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt57=2;
            	    alt57 = dfa57.predict(input);
            	    switch (alt57) {
            	        case 1 :
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2989:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2989:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2989:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2996:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2997:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,18,FOLLOW_18_in_ruleXMemberFeatureCall6659); if (state.failed) return current;
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

            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3010:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt56=3;
            	            alt56 = dfa56.predict(input);
            	            switch (alt56) {
            	                case 1 :
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3010:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3010:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3010:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3022:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3023:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall6734);
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
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3040:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3040:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3040:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3040:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3041:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3041:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3042:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6762);
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

            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3058:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop55:
            	                    do {
            	                        int alt55=2;
            	                        int LA55_0 = input.LA(1);

            	                        if ( (LA55_0==16) ) {
            	                            alt55=1;
            	                        }


            	                        switch (alt55) {
            	                    	case 1 :
            	                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3058:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall6775); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3062:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3063:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3063:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3064:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6796);
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
            	                    	    break loop55;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,30,FOLLOW_30_in_ruleXMemberFeatureCall6813); if (state.failed) return current;
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
            	    break loop58;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3092:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3093:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3094:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression6854);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression6864); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3101:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3104:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3105:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3105:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt59=13;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt59=1;
                }
                break;
            case 12:
                {
                alt59=2;
                }
                break;
            case 60:
                {
                alt59=3;
                }
                break;
            case RULE_ID:
            case 42:
            case 68:
                {
                alt59=4;
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
                alt59=5;
                }
                break;
            case 58:
                {
                alt59=6;
                }
                break;
            case 63:
                {
                alt59=7;
                }
                break;
            case 64:
                {
                alt59=8;
                }
                break;
            case 65:
                {
                alt59=9;
                }
                break;
            case 75:
                {
                alt59=10;
                }
                break;
            case 76:
                {
                alt59=11;
                }
                break;
            case 77:
                {
                alt59=12;
                }
                break;
            case 18:
                {
                alt59=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3106:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression6911);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3116:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression6938);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3126:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression6965);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3136:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression6992);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3146:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression7019);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3156:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression7046);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3166:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression7073);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3176:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression7100);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3186:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression7127);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3196:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression7154);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3206:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression7181);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3216:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression7208);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3226:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression7235);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3242:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3243:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3244:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral7270);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral7280); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3251:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3254:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3255:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3255:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt60=6;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt60=1;
                }
                break;
            case 71:
            case 72:
                {
                alt60=2;
                }
                break;
            case RULE_INT:
                {
                alt60=3;
                }
                break;
            case 73:
                {
                alt60=4;
                }
                break;
            case RULE_STRING:
                {
                alt60=5;
                }
                break;
            case 74:
                {
                alt60=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3256:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral7327);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3266:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral7354);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3276:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral7381);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3286:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral7408);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3296:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral7435);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3306:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral7462);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3322:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3323:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3324:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure7497);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure7507); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3331:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3334:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3335:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3335:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3335:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3335:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3336:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXClosure7553); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3345:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID||LA62_0==18||LA62_0==80) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3345:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3345:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3346:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3346:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3347:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7575);
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3363:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==16) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3363:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleXClosure7588); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3367:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3368:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3368:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3369:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7609);
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
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleXClosure7625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3389:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3390:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3390:1: (lv_expression_6_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3391:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure7646);
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

            otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleXClosure7658); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3419:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3420:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3421:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure7694);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure7704); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3428:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3431:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3432:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3432:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3432:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3432:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3432:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3443:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3443:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3443:6: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3444:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3449:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_ID||LA64_0==18||LA64_0==80) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3449:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3449:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3450:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3450:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3451:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7802);
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3467:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==16) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3467:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXShortClosure7815); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3471:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3472:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3472:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3473:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7836);
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
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleXShortClosure7852); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3493:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3494:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3494:1: (lv_expression_5_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3495:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure7875);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3519:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3520:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3521:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression7911);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression7921); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3528:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3531:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3532:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3532:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3532:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleXParenthesizedExpression7958); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7980);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleXParenthesizedExpression7991); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3557:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3558:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3559:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression8027);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression8037); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3566:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3569:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3570:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3570:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3570:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3570:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3571:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXIfExpression8083); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleXIfExpression8095); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3584:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3585:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3585:1: (lv_if_3_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3586:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression8116);
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

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleXIfExpression8128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3606:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3607:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3607:1: (lv_then_5_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3608:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression8149);
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3624:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==59) ) {
                int LA65_1 = input.LA(2);

                if ( (synpred16_InternalQIdl()) ) {
                    alt65=1;
                }
            }
            switch (alt65) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3624:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3624:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3624:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,59,FOLLOW_59_in_ruleXIfExpression8170); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3629:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3630:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3630:1: (lv_else_7_0= ruleXExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3631:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression8192);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3655:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3656:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3657:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression8230);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression8240); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3664:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3667:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3668:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3668:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3668:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3668:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3669:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXSwitchExpression8286); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3678:1: ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==24) ) {
                    alt66=1;
                }
            }
            switch (alt66) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3678:2: ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':'
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3678:2: ( (lv_localVarName_2_0= RULE_ID ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3679:1: (lv_localVarName_2_0= RULE_ID )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3679:1: (lv_localVarName_2_0= RULE_ID )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3680:3: lv_localVarName_2_0= RULE_ID
                    {
                    lv_localVarName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXSwitchExpression8304); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleXSwitchExpression8321); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3700:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3701:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3701:1: (lv_switch_4_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3702:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression8344);
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

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleXSwitchExpression8356); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3722:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt67=0;
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==RULE_ID||LA67_0==18||LA67_0==24||LA67_0==62||LA67_0==80) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3723:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3723:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3724:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression8377);
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
            	    if ( cnt67 >= 1 ) break loop67;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(67, input);
                        throw eee;
                }
                cnt67++;
            } while (true);

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3740:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==61) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3740:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,61,FOLLOW_61_in_ruleXSwitchExpression8391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleXSwitchExpression8403); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3748:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3749:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3749:1: (lv_default_9_0= ruleXExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3750:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression8424);
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

            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleXSwitchExpression8438); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3778:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3779:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3780:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart8474);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart8484); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3787:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3790:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3791:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3791:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3791:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3791:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID||LA69_0==18||LA69_0==80) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3792:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3792:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3793:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart8530);
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3809:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==62) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3809:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXCasePart8544); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3813:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3814:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3814:1: (lv_case_2_0= ruleXExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3815:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart8565);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleXCasePart8579); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3835:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3836:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3836:1: (lv_then_4_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3837:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart8600);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3861:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3862:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3863:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression8636);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression8646); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3870:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3873:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3874:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3874:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3874:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3874:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3875:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXForLoopExpression8692); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleXForLoopExpression8704); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3888:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3889:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3889:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3890:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression8725);
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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleXForLoopExpression8737); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3910:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3911:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3911:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3912:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression8758);
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

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleXForLoopExpression8770); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3932:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3933:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3933:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3934:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression8791);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3958:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3959:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3960:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression8827);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression8837); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3967:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3970:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3971:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3971:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3971:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3971:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3972:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXWhileExpression8883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleXWhileExpression8895); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3985:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3986:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3986:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3987:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression8916);
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

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleXWhileExpression8928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4007:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4008:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4008:1: (lv_body_5_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4009:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression8949);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4033:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4034:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4035:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8985);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression8995); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4042:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4045:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4046:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4046:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4046:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4046:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4047:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXDoWhileExpression9041); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4056:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4057:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4057:1: (lv_body_2_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4058:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression9062);
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

            otherlv_3=(Token)match(input,64,FOLLOW_64_in_ruleXDoWhileExpression9074); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleXDoWhileExpression9086); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4082:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4083:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4083:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4084:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression9107);
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

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleXDoWhileExpression9119); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4112:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4113:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4114:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression9155);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression9165); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4121:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4124:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4125:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4125:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4125:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4125:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4126:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleXBlockExpression9211); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4135:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=RULE_ID && LA72_0<=RULE_STRING)||LA72_0==12||LA72_0==18||LA72_0==42||(LA72_0>=45 && LA72_0<=46)||LA72_0==51||LA72_0==56||LA72_0==58||LA72_0==60||(LA72_0>=63 && LA72_0<=68)||(LA72_0>=70 && LA72_0<=77)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4135:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4135:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4136:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4136:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4137:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression9233);
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

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4153:2: (otherlv_3= ';' )?
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==21) ) {
            	        alt71=1;
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4153:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleXBlockExpression9246); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleXBlockExpression9262); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4169:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4170:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4171:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock9298);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock9308); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4178:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4181:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4182:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4182:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=66 && LA73_0<=67)) ) {
                alt73=1;
            }
            else if ( ((LA73_0>=RULE_ID && LA73_0<=RULE_STRING)||LA73_0==12||LA73_0==18||LA73_0==42||(LA73_0>=45 && LA73_0<=46)||LA73_0==51||LA73_0==56||LA73_0==58||LA73_0==60||(LA73_0>=63 && LA73_0<=65)||LA73_0==68||(LA73_0>=70 && LA73_0<=77)) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4183:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock9355);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4193:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock9382);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4209:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4210:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4211:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration9417);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration9427); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4218:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4221:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4222:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4222:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4222:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4222:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4223:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4228:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==66) ) {
                alt74=1;
            }
            else if ( (LA74_0==67) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4228:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4228:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4229:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4229:1: (lv_writeable_1_0= 'var' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4230:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,66,FOLLOW_66_in_ruleXVariableDeclaration9480); if (state.failed) return current;
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4244:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleXVariableDeclaration9511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4248:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID) ) {
                int LA75_1 = input.LA(2);

                if ( (synpred17_InternalQIdl()) ) {
                    alt75=1;
                }
                else if ( (true) ) {
                    alt75=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA75_0==18) && (synpred17_InternalQIdl())) {
                alt75=1;
            }
            else if ( (LA75_0==80) && (synpred17_InternalQIdl())) {
                alt75=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4248:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4248:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4248:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4257:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4257:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4257:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4258:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4258:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4259:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration9560);
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4275:2: ( (lv_name_4_0= RULE_ID ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4276:1: (lv_name_4_0= RULE_ID )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4276:1: (lv_name_4_0= RULE_ID )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4277:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXVariableDeclaration9577); if (state.failed) return current;
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4294:6: ( (lv_name_5_0= RULE_ID ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4294:6: ( (lv_name_5_0= RULE_ID ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4295:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4295:1: (lv_name_5_0= RULE_ID )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4296:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXVariableDeclaration9607); if (state.failed) return current;
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4312:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==25) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4312:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleXVariableDeclaration9626); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4316:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4317:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4317:1: (lv_right_7_0= ruleXExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4318:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration9647);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4342:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4343:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4344:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter9685);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter9695); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4351:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_parameterType_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4354:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4355:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4355:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4355:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4355:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_ID) ) {
                int LA77_1 = input.LA(2);

                if ( (LA77_1==RULE_ID||LA77_1==42||LA77_1==53) ) {
                    alt77=1;
                }
            }
            else if ( (LA77_0==18||LA77_0==80) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4356:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4356:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4357:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter9741);
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4373:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4374:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4374:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4375:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJvmFormalParameter9759); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4399:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4400:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4401:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall9800);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall9810); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4408:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4411:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4412:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4412:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4412:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4412:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4413:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4418:2: ( ( ruleStaticQualifier ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_ID) ) {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==69) ) {
                    alt78=1;
                }
            }
            switch (alt78) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4419:1: ( ruleStaticQualifier )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4419:1: ( ruleStaticQualifier )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4420:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall9867);
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4433:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==42) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4433:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXFeatureCall9881); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4437:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4438:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4438:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4439:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9902);
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4455:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==16) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4455:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleXFeatureCall9915); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4459:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4460:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4460:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4461:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9936);
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
                    	    break loop79;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall9950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4481:3: ( ( ruleIdOrSuper ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4482:1: ( ruleIdOrSuper )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4482:1: ( ruleIdOrSuper )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4483:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9975);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4496:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt83=2;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4496:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4496:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4496:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4503:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4504:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,18,FOLLOW_18_in_ruleXFeatureCall10009); if (state.failed) return current;
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4517:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt82=3;
                    alt82 = dfa82.predict(input);
                    switch (alt82) {
                        case 1 :
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4517:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4517:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4517:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4529:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4530:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall10084);
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
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4547:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4547:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4547:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4547:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4548:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4548:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4549:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall10112);
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

                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4565:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop81:
                            do {
                                int alt81=2;
                                int LA81_0 = input.LA(1);

                                if ( (LA81_0==16) ) {
                                    alt81=1;
                                }


                                switch (alt81) {
                            	case 1 :
                            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4565:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleXFeatureCall10125); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4569:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4570:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4570:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4571:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall10146);
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
                            	    break loop81;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,30,FOLLOW_30_in_ruleXFeatureCall10163); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4599:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4600:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4601:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper10202);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper10213); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4608:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4611:28: ( (this_ID_0= RULE_ID | kw= 'super' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4612:1: (this_ID_0= RULE_ID | kw= 'super' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4612:1: (this_ID_0= RULE_ID | kw= 'super' )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_ID) ) {
                alt84=1;
            }
            else if ( (LA84_0==68) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4612:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdOrSuper10253); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getIdOrSuperAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4621:2: kw= 'super'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleIdOrSuper10277); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4634:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4635:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4636:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier10318);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier10329); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4643:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4646:28: ( (this_ID_0= RULE_ID kw= '::' )+ )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4647:1: (this_ID_0= RULE_ID kw= '::' )+
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4647:1: (this_ID_0= RULE_ID kw= '::' )+
            int cnt85=0;
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==RULE_ID) ) {
                    int LA85_2 = input.LA(2);

                    if ( (LA85_2==69) ) {
                        alt85=1;
                    }


                }


                switch (alt85) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4647:6: this_ID_0= RULE_ID kw= '::'
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStaticQualifier10369); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_0, grammarAccess.getStaticQualifierAccess().getIDTerminalRuleCall_0()); 
            	          
            	    }
            	    kw=(Token)match(input,69,FOLLOW_69_in_ruleStaticQualifier10387); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt85 >= 1 ) break loop85;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(85, input);
                        throw eee;
                }
                cnt85++;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4668:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4669:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4670:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall10428);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall10438); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4677:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4680:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4681:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4681:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4681:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4681:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4682:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXConstructorCall10484); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4691:1: ( ( ruleQualifiedName ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4692:1: ( ruleQualifiedName )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4692:1: ( ruleQualifiedName )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4693:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall10507);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4706:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==42) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4706:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleXConstructorCall10520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4710:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4711:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4711:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4712:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10541);
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4728:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==16) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4728:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleXConstructorCall10554); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4732:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4733:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4733:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4734:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10575);
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
                    	    break loop86;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall10589); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleXConstructorCall10603); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4758:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt89=3;
            alt89 = dfa89.predict(input);
            switch (alt89) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4758:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4758:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4758:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4770:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4771:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall10665);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4788:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4788:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4788:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4788:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4789:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4789:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4790:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall10693);
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4806:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==16) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4806:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleXConstructorCall10706); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4810:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4811:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4811:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4812:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall10727);
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
                    	    break loop88;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,30,FOLLOW_30_in_ruleXConstructorCall10744); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4840:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4841:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4842:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10780);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral10790); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4849:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4852:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4853:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4853:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4853:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4853:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4854:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4859:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==71) ) {
                alt90=1;
            }
            else if ( (LA90_0==72) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4859:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXBooleanLiteral10837); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4864:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4864:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4865:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4865:1: (lv_isTrue_2_0= 'true' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4866:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,72,FOLLOW_72_in_ruleXBooleanLiteral10861); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4887:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4888:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4889:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10911);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral10921); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4896:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4899:28: ( ( () otherlv_1= 'null' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4900:1: ( () otherlv_1= 'null' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4900:1: ( () otherlv_1= 'null' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4900:2: () otherlv_1= 'null'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4900:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4901:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXNullLiteral10967); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4918:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4919:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4920:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral11003);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral11013); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4927:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4930:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4931:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4931:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4931:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4931:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4932:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4937:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4938:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4938:1: (lv_value_1_0= RULE_INT )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4939:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral11064); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4963:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4964:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4965:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral11105);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral11115); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4972:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4975:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4976:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4976:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4976:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4976:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4977:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4982:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4983:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4983:1: (lv_value_1_0= RULE_STRING )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4984:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral11166); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5008:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5009:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5010:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral11207);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral11217); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5017:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5020:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5021:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5021:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5021:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5021:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5022:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXTypeLiteral11263); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleXTypeLiteral11275); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5035:1: ( ( ruleQualifiedName ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5036:1: ( ruleQualifiedName )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5036:1: ( ruleQualifiedName )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5037:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral11298);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleXTypeLiteral11310); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5062:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5063:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5064:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression11346);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression11356); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5071:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5074:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5075:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5075:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5075:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5075:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5076:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXThrowExpression11402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5085:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5086:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5086:1: (lv_expression_2_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5087:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression11423);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5111:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5112:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5113:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression11459);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression11469); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5120:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5123:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5124:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5124:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5124:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5124:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5125:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleXReturnExpression11515); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5134:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt91=2;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5134:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5139:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5140:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression11546);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5164:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5165:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5166:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression11583);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression11593); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5173:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5176:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5177:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5177:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5177:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5177:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5178:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleXTryCatchFinallyExpression11639); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5187:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5188:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5188:1: (lv_expression_2_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5189:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11660);
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5205:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==79) ) {
                alt94=1;
            }
            else if ( (LA94_0==78) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5205:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5205:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5205:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5205:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt92=0;
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==79) ) {
                            int LA92_2 = input.LA(2);

                            if ( (synpred22_InternalQIdl()) ) {
                                alt92=1;
                            }


                        }


                        switch (alt92) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5205:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5207:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5208:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11690);
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
                    	    if ( cnt92 >= 1 ) break loop92;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(92, input);
                                throw eee;
                        }
                        cnt92++;
                    } while (true);

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5224:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==78) ) {
                        int LA93_1 = input.LA(2);

                        if ( (synpred23_InternalQIdl()) ) {
                            alt93=1;
                        }
                    }
                    switch (alt93) {
                        case 1 :
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5224:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5224:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5224:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,78,FOLLOW_78_in_ruleXTryCatchFinallyExpression11712); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5229:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5230:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5230:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5231:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11734);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5248:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5248:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5248:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,78,FOLLOW_78_in_ruleXTryCatchFinallyExpression11756); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5252:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5253:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5253:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5254:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11777);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5278:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5279:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5280:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11815);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause11825); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5287:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5290:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5291:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5291:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5291:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5291:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5291:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleXCatchClause11870); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleXCatchClause11883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5300:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5301:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5301:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5302:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause11904);
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

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleXCatchClause11916); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5322:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5323:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5323:1: (lv_expression_4_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5324:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause11937);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5348:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5349:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5350:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11974);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName11985); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5357:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5360:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5361:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5361:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5361:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12025); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5368:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==53) ) {
                    int LA95_2 = input.LA(2);

                    if ( (LA95_2==RULE_ID) ) {
                        int LA95_3 = input.LA(3);

                        if ( (synpred25_InternalQIdl()) ) {
                            alt95=1;
                        }


                    }


                }


                switch (alt95) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5368:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5368:2: ( ( '.' )=>kw= '.' )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5368:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,53,FOLLOW_53_in_ruleQualifiedName12053); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12069); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop95;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5391:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5392:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5393:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference12116);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference12126); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5400:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5403:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5404:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5404:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_ID) ) {
                alt96=1;
            }
            else if ( (LA96_0==18||LA96_0==80) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5405:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference12173);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5415:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference12200);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5431:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5432:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5433:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef12235);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef12245); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5440:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5443:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5444:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5444:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5444:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5444:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==18) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5444:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleXFunctionTypeRef12283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5448:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5449:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5449:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5450:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12304);
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5466:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==16) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5466:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXFunctionTypeRef12317); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5470:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5471:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5471:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5472:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12338);
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
                    	    break loop97;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleXFunctionTypeRef12352); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,80,FOLLOW_80_in_ruleXFunctionTypeRef12366); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5496:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5497:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5497:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5498:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12387);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5522:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5523:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5524:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference12423);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12433); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5531:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5534:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5535:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5535:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5535:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5535:2: ( ( ruleQualifiedName ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5536:1: ( ruleQualifiedName )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5536:1: ( ruleQualifiedName )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5537:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12481);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5550:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt100=2;
            alt100 = dfa100.predict(input);
            switch (alt100) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5550:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5550:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5550:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleJvmParameterizedTypeReference12502); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5555:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5556:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5556:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5557:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12524);
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5573:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==16) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5573:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleJvmParameterizedTypeReference12537); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5577:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5578:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5578:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5579:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12558);
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
                    	    break loop99;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleJvmParameterizedTypeReference12572); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5607:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5608:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5609:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12610);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12620); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5616:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5619:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5620:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5620:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_ID||LA101_0==18||LA101_0==80) ) {
                alt101=1;
            }
            else if ( (LA101_0==81) ) {
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5621:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12667);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5631:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12694);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5647:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5648:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5649:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12729);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12739); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5656:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5659:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5660:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5660:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5660:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5660:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5661:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,81,FOLLOW_81_in_ruleJvmWildcardTypeReference12785); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5670:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt102=3;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==15) ) {
                alt102=1;
            }
            else if ( (LA102_0==68) ) {
                alt102=2;
            }
            switch (alt102) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5670:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5670:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5671:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5671:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5672:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12807);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5689:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5689:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5690:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5690:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5691:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12834);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5715:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5716:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5717:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12872);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound12882); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5724:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5727:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5728:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5728:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5728:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleJvmUpperBound12919); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5732:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5733:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5733:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5734:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12940);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5758:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5759:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5760:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12976);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12986); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5767:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5770:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5771:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5771:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5771:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleJvmUpperBoundAnded13023); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5775:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5776:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5776:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5777:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded13044);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5801:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5802:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5803:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound13080);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound13090); if (state.failed) return current;

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5810:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5813:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5814:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5814:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5814:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleJvmLowerBound13127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5818:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5819:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5819:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5820:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound13148);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5846:1: ruleVirtuality returns [Enumerator current=null] : ( (enumLiteral_0= 'virtual' ) | (enumLiteral_1= 'purevirtual' ) ) ;
    public final Enumerator ruleVirtuality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5848:28: ( ( (enumLiteral_0= 'virtual' ) | (enumLiteral_1= 'purevirtual' ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5849:1: ( (enumLiteral_0= 'virtual' ) | (enumLiteral_1= 'purevirtual' ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5849:1: ( (enumLiteral_0= 'virtual' ) | (enumLiteral_1= 'purevirtual' ) )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==83) ) {
                alt103=1;
            }
            else if ( (LA103_0==84) ) {
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5849:2: (enumLiteral_0= 'virtual' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5849:2: (enumLiteral_0= 'virtual' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5849:4: enumLiteral_0= 'virtual'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_83_in_ruleVirtuality13200); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVirtualityAccess().getVirtualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVirtualityAccess().getVirtualEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5855:6: (enumLiteral_1= 'purevirtual' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5855:6: (enumLiteral_1= 'purevirtual' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5855:8: enumLiteral_1= 'purevirtual'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_84_in_ruleVirtuality13217); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5865:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5867:28: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5868:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5868:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==85) ) {
                alt104=1;
            }
            else if ( (LA104_0==86) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5868:2: (enumLiteral_0= 'public' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5868:2: (enumLiteral_0= 'public' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5868:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_85_in_ruleVisibility13262); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5874:6: (enumLiteral_1= 'protected' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5874:6: (enumLiteral_1= 'protected' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5874:8: enumLiteral_1= 'protected'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_86_in_ruleVisibility13279); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5884:1: ruleOwner returns [Enumerator current=null] : ( (enumLiteral_0= 'member' ) | (enumLiteral_1= 'class' ) ) ;
    public final Enumerator ruleOwner() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5886:28: ( ( (enumLiteral_0= 'member' ) | (enumLiteral_1= 'class' ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5887:1: ( (enumLiteral_0= 'member' ) | (enumLiteral_1= 'class' ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5887:1: ( (enumLiteral_0= 'member' ) | (enumLiteral_1= 'class' ) )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==87) ) {
                alt105=1;
            }
            else if ( (LA105_0==14) ) {
                alt105=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5887:2: (enumLiteral_0= 'member' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5887:2: (enumLiteral_0= 'member' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5887:4: enumLiteral_0= 'member'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleOwner13324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOwnerAccess().getMemberEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOwnerAccess().getMemberEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5893:6: (enumLiteral_1= 'class' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5893:6: (enumLiteral_1= 'class' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5893:8: enumLiteral_1= 'class'
                    {
                    enumLiteral_1=(Token)match(input,14,FOLLOW_14_in_ruleOwner13341); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5903:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'pointer' ) | (enumLiteral_1= 'reference' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5905:28: ( ( (enumLiteral_0= 'pointer' ) | (enumLiteral_1= 'reference' ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5906:1: ( (enumLiteral_0= 'pointer' ) | (enumLiteral_1= 'reference' ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5906:1: ( (enumLiteral_0= 'pointer' ) | (enumLiteral_1= 'reference' ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==88) ) {
                alt106=1;
            }
            else if ( (LA106_0==89) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5906:2: (enumLiteral_0= 'pointer' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5906:2: (enumLiteral_0= 'pointer' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5906:4: enumLiteral_0= 'pointer'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_88_in_ruleType13386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeAccess().getPointerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getPointerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5912:6: (enumLiteral_1= 'reference' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5912:6: (enumLiteral_1= 'reference' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5912:8: enumLiteral_1= 'reference'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_89_in_ruleType13403); if (state.failed) return current;
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
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1716:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1716:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1716:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1716:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1716:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1717:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1717:2: ( ( ruleOpMultiAssign ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1718:1: ( ruleOpMultiAssign )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1718:1: ( ruleOpMultiAssign )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1719:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalQIdl3426);
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
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1844:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1844:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1844:4: ( () ( ( ruleOpOr ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1844:5: () ( ( ruleOpOr ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1844:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1845:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1845:2: ( ( ruleOpOr ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1846:1: ( ruleOpOr )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1846:1: ( ruleOpOr )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1847:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalQIdl3774);
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
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1945:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1945:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1945:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1945:5: () ( ( ruleOpAnd ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1945:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1946:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1946:2: ( ( ruleOpAnd ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1947:1: ( ruleOpAnd )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1947:1: ( ruleOpAnd )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1948:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalQIdl4033);
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
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2046:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2046:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2046:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2046:5: () ( ( ruleOpEquality ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2046:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2047:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2047:2: ( ( ruleOpEquality ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2048:1: ( ruleOpEquality )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2048:1: ( ruleOpEquality )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2049:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalQIdl4292);
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
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2154:4: ( ( () 'instanceof' ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2154:5: ( () 'instanceof' )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2154:5: ( () 'instanceof' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2154:6: () 'instanceof'
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2154:6: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2155:1: 
        {
        }

        match(input,38,FOLLOW_38_in_synpred5_InternalQIdl4568); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalQIdl

    // $ANTLR start synpred6_InternalQIdl
    public final void synpred6_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2182:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2182:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2182:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2182:10: () ( ( ruleOpCompare ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2182:10: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2183:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2183:2: ( ( ruleOpCompare ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2184:1: ( ruleOpCompare )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2184:1: ( ruleOpCompare )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2185:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalQIdl4641);
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
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2304:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2304:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2304:4: ( () ( ( ruleOpOther ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2304:5: () ( ( ruleOpOther ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2304:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2305:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2305:2: ( ( ruleOpOther ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2306:1: ( ruleOpOther )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2306:1: ( ruleOpOther )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2307:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalQIdl4960);
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
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2412:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2412:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2412:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2412:5: () ( ( ruleOpAdd ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2412:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2413:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2413:2: ( ( ruleOpAdd ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2414:1: ( ruleOpAdd )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2414:1: ( ruleOpAdd )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2415:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalQIdl5240);
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
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2520:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2520:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2520:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2520:5: () ( ( ruleOpMulti ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2520:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2521:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2521:2: ( ( ruleOpMulti ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2522:1: ( ruleOpMulti )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2522:1: ( ruleOpMulti )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2523:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalQIdl5520);
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
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2753:3: ( ( () 'as' ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2753:4: ( () 'as' )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2753:4: ( () 'as' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2753:5: () 'as'
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2753:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2754:1: 
        {
        }

        match(input,52,FOLLOW_52_in_synpred10_InternalQIdl6114); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalQIdl

    // $ANTLR start synpred11_InternalQIdl
    public final void synpred11_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2813:4: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2813:5: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2813:5: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2813:6: () '.' ( ( RULE_ID ) ) ruleOpSingleAssign
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2813:6: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2814:1: 
        {
        }

        match(input,53,FOLLOW_53_in_synpred11_InternalQIdl6268); if (state.failed) return ;
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2815:1: ( ( RULE_ID ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2816:1: ( RULE_ID )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2816:1: ( RULE_ID )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2817:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred11_InternalQIdl6276); if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalQIdl6283);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalQIdl

    // $ANTLR start synpred12_InternalQIdl
    public final void synpred12_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2870:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2870:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2870:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2870:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2870:10: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2871:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2871:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt107=3;
        switch ( input.LA(1) ) {
        case 53:
            {
            alt107=1;
            }
            break;
        case 54:
            {
            alt107=2;
            }
            break;
        case 55:
            {
            alt107=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 107, 0, input);

            throw nvae;
        }

        switch (alt107) {
            case 1 :
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2871:4: '.'
                {
                match(input,53,FOLLOW_53_in_synpred12_InternalQIdl6383); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2873:6: ( ( '?.' ) )
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2873:6: ( ( '?.' ) )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2874:1: ( '?.' )
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2874:1: ( '?.' )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2875:2: '?.'
                {
                match(input,54,FOLLOW_54_in_synpred12_InternalQIdl6397); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2880:6: ( ( '*.' ) )
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2880:6: ( ( '*.' ) )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2881:1: ( '*.' )
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2881:1: ( '*.' )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2882:2: '*.'
                {
                match(input,55,FOLLOW_55_in_synpred12_InternalQIdl6417); if (state.failed) return ;

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
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2989:4: ( ( '(' ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2990:1: ( '(' )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2990:1: ( '(' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2991:2: '('
        {
        match(input,18,FOLLOW_18_in_synpred13_InternalQIdl6641); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalQIdl

    // $ANTLR start synpred14_InternalQIdl
    public final void synpred14_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3010:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3010:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3010:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3010:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3010:6: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3011:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3011:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt109=2;
        int LA109_0 = input.LA(1);

        if ( (LA109_0==RULE_ID||LA109_0==18||LA109_0==80) ) {
            alt109=1;
        }
        switch (alt109) {
            case 1 :
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3011:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3011:3: ( ( ruleJvmFormalParameter ) )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3012:1: ( ruleJvmFormalParameter )
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3012:1: ( ruleJvmFormalParameter )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3013:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalQIdl6693);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3015:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop108:
                do {
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==16) ) {
                        alt108=1;
                    }


                    switch (alt108) {
                	case 1 :
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3015:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_16_in_synpred14_InternalQIdl6700); if (state.failed) return ;
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3016:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3017:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3017:1: ( ruleJvmFormalParameter )
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3018:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalQIdl6707);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop108;
                    }
                } while (true);


                }
                break;

        }

        match(input,26,FOLLOW_26_in_synpred14_InternalQIdl6717); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalQIdl

    // $ANTLR start synpred16_InternalQIdl
    public final void synpred16_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3624:4: ( 'else' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3624:6: 'else'
        {
        match(input,59,FOLLOW_59_in_synpred16_InternalQIdl8162); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalQIdl

    // $ANTLR start synpred17_InternalQIdl
    public final void synpred17_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4248:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4248:5: ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4248:5: ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4248:6: ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4248:6: ( ( ruleJvmTypeReference ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4249:1: ( ruleJvmTypeReference )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4249:1: ( ruleJvmTypeReference )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4250:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred17_InternalQIdl9529);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4252:2: ( ( RULE_ID ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4253:1: ( RULE_ID )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4253:1: ( RULE_ID )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4254:1: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred17_InternalQIdl9538); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalQIdl

    // $ANTLR start synpred18_InternalQIdl
    public final void synpred18_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4496:4: ( ( '(' ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4497:1: ( '(' )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4497:1: ( '(' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4498:2: '('
        {
        match(input,18,FOLLOW_18_in_synpred18_InternalQIdl9991); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalQIdl

    // $ANTLR start synpred19_InternalQIdl
    public final void synpred19_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4517:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4517:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4517:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4517:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4517:6: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4518:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4518:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt113=2;
        int LA113_0 = input.LA(1);

        if ( (LA113_0==RULE_ID||LA113_0==18||LA113_0==80) ) {
            alt113=1;
        }
        switch (alt113) {
            case 1 :
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4518:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4518:3: ( ( ruleJvmFormalParameter ) )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4519:1: ( ruleJvmFormalParameter )
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4519:1: ( ruleJvmFormalParameter )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4520:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalQIdl10043);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4522:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop112:
                do {
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==16) ) {
                        alt112=1;
                    }


                    switch (alt112) {
                	case 1 :
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4522:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_16_in_synpred19_InternalQIdl10050); if (state.failed) return ;
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4523:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4524:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4524:1: ( ruleJvmFormalParameter )
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4525:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalQIdl10057);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop112;
                    }
                } while (true);


                }
                break;

        }

        match(input,26,FOLLOW_26_in_synpred19_InternalQIdl10067); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalQIdl

    // $ANTLR start synpred20_InternalQIdl
    public final void synpred20_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4758:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4758:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4758:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4758:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4758:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4759:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4759:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt115=2;
        int LA115_0 = input.LA(1);

        if ( (LA115_0==RULE_ID||LA115_0==18||LA115_0==80) ) {
            alt115=1;
        }
        switch (alt115) {
            case 1 :
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4759:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4759:3: ( ( ruleJvmFormalParameter ) )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4760:1: ( ruleJvmFormalParameter )
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4760:1: ( ruleJvmFormalParameter )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4761:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalQIdl10624);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4763:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop114:
                do {
                    int alt114=2;
                    int LA114_0 = input.LA(1);

                    if ( (LA114_0==16) ) {
                        alt114=1;
                    }


                    switch (alt114) {
                	case 1 :
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4763:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_16_in_synpred20_InternalQIdl10631); if (state.failed) return ;
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4764:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4765:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4765:1: ( ruleJvmFormalParameter )
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4766:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalQIdl10638);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop114;
                    }
                } while (true);


                }
                break;

        }

        match(input,26,FOLLOW_26_in_synpred20_InternalQIdl10648); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalQIdl

    // $ANTLR start synpred21_InternalQIdl
    public final void synpred21_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5134:2: ( ( ruleXExpression ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5135:1: ( ruleXExpression )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5135:1: ( ruleXExpression )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5136:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred21_InternalQIdl11529);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalQIdl

    // $ANTLR start synpred22_InternalQIdl
    public final void synpred22_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5205:5: ( 'catch' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5205:7: 'catch'
        {
        match(input,79,FOLLOW_79_in_synpred22_InternalQIdl11674); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalQIdl

    // $ANTLR start synpred23_InternalQIdl
    public final void synpred23_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5224:5: ( 'finally' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5224:7: 'finally'
        {
        match(input,78,FOLLOW_78_in_synpred23_InternalQIdl11704); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalQIdl

    // $ANTLR start synpred25_InternalQIdl
    public final void synpred25_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5368:3: ( '.' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5369:2: '.'
        {
        match(input,53,FOLLOW_53_in_synpred25_InternalQIdl12044); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalQIdl

    // $ANTLR start synpred26_InternalQIdl
    public final void synpred26_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5550:4: ( '<' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5550:6: '<'
        {
        match(input,42,FOLLOW_42_in_synpred26_InternalQIdl12494); if (state.failed) return ;

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


    protected DFA57 dfa57 = new DFA57(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA89 dfa89 = new DFA89(this);
    protected DFA91 dfa91 = new DFA91(this);
    protected DFA100 dfa100 = new DFA100(this);
    static final String DFA57_eotS =
        "\74\uffff";
    static final String DFA57_eofS =
        "\1\2\73\uffff";
    static final String DFA57_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA57_maxS =
        "\1\120\1\0\72\uffff";
    static final String DFA57_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA57_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA57_transitionS = {
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

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "2989:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_1 = input.LA(1);

                         
                        int index57_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index57_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA56_eotS =
        "\34\uffff";
    static final String DFA56_eofS =
        "\34\uffff";
    static final String DFA56_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA56_maxS =
        "\1\120\2\0\31\uffff";
    static final String DFA56_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA56_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA56_transitionS = {
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

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "3010:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_0 = input.LA(1);

                         
                        int index56_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA56_0==RULE_ID) ) {s = 1;}

                        else if ( (LA56_0==18) ) {s = 2;}

                        else if ( (LA56_0==80) && (synpred14_InternalQIdl())) {s = 3;}

                        else if ( (LA56_0==26) && (synpred14_InternalQIdl())) {s = 4;}

                        else if ( ((LA56_0>=RULE_INT && LA56_0<=RULE_STRING)||LA56_0==12||LA56_0==42||(LA56_0>=45 && LA56_0<=46)||LA56_0==51||LA56_0==56||LA56_0==58||LA56_0==60||(LA56_0>=63 && LA56_0<=65)||LA56_0==68||(LA56_0>=70 && LA56_0<=77)) ) {s = 5;}

                        else if ( (LA56_0==30) ) {s = 27;}

                         
                        input.seek(index56_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_1 = input.LA(1);

                         
                        int index56_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalQIdl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index56_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA56_2 = input.LA(1);

                         
                        int index56_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalQIdl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index56_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA83_eotS =
        "\74\uffff";
    static final String DFA83_eofS =
        "\1\2\73\uffff";
    static final String DFA83_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA83_maxS =
        "\1\120\1\0\72\uffff";
    static final String DFA83_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA83_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA83_transitionS = {
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

    static final short[] DFA83_eot = DFA.unpackEncodedString(DFA83_eotS);
    static final short[] DFA83_eof = DFA.unpackEncodedString(DFA83_eofS);
    static final char[] DFA83_min = DFA.unpackEncodedStringToUnsignedChars(DFA83_minS);
    static final char[] DFA83_max = DFA.unpackEncodedStringToUnsignedChars(DFA83_maxS);
    static final short[] DFA83_accept = DFA.unpackEncodedString(DFA83_acceptS);
    static final short[] DFA83_special = DFA.unpackEncodedString(DFA83_specialS);
    static final short[][] DFA83_transition;

    static {
        int numStates = DFA83_transitionS.length;
        DFA83_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA83_transition[i] = DFA.unpackEncodedString(DFA83_transitionS[i]);
        }
    }

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = DFA83_eot;
            this.eof = DFA83_eof;
            this.min = DFA83_min;
            this.max = DFA83_max;
            this.accept = DFA83_accept;
            this.special = DFA83_special;
            this.transition = DFA83_transition;
        }
        public String getDescription() {
            return "4496:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA83_1 = input.LA(1);

                         
                        int index83_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index83_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 83, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA82_eotS =
        "\34\uffff";
    static final String DFA82_eofS =
        "\34\uffff";
    static final String DFA82_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA82_maxS =
        "\1\120\2\0\31\uffff";
    static final String DFA82_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA82_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA82_transitionS = {
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

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "4517:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA82_0 = input.LA(1);

                         
                        int index82_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA82_0==RULE_ID) ) {s = 1;}

                        else if ( (LA82_0==18) ) {s = 2;}

                        else if ( (LA82_0==80) && (synpred19_InternalQIdl())) {s = 3;}

                        else if ( (LA82_0==26) && (synpred19_InternalQIdl())) {s = 4;}

                        else if ( ((LA82_0>=RULE_INT && LA82_0<=RULE_STRING)||LA82_0==12||LA82_0==42||(LA82_0>=45 && LA82_0<=46)||LA82_0==51||LA82_0==56||LA82_0==58||LA82_0==60||(LA82_0>=63 && LA82_0<=65)||LA82_0==68||(LA82_0>=70 && LA82_0<=77)) ) {s = 5;}

                        else if ( (LA82_0==30) ) {s = 27;}

                         
                        input.seek(index82_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA82_1 = input.LA(1);

                         
                        int index82_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalQIdl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index82_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA82_2 = input.LA(1);

                         
                        int index82_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalQIdl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index82_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 82, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA89_eotS =
        "\34\uffff";
    static final String DFA89_eofS =
        "\34\uffff";
    static final String DFA89_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA89_maxS =
        "\1\120\2\0\31\uffff";
    static final String DFA89_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA89_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA89_transitionS = {
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

    static final short[] DFA89_eot = DFA.unpackEncodedString(DFA89_eotS);
    static final short[] DFA89_eof = DFA.unpackEncodedString(DFA89_eofS);
    static final char[] DFA89_min = DFA.unpackEncodedStringToUnsignedChars(DFA89_minS);
    static final char[] DFA89_max = DFA.unpackEncodedStringToUnsignedChars(DFA89_maxS);
    static final short[] DFA89_accept = DFA.unpackEncodedString(DFA89_acceptS);
    static final short[] DFA89_special = DFA.unpackEncodedString(DFA89_specialS);
    static final short[][] DFA89_transition;

    static {
        int numStates = DFA89_transitionS.length;
        DFA89_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA89_transition[i] = DFA.unpackEncodedString(DFA89_transitionS[i]);
        }
    }

    class DFA89 extends DFA {

        public DFA89(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 89;
            this.eot = DFA89_eot;
            this.eof = DFA89_eof;
            this.min = DFA89_min;
            this.max = DFA89_max;
            this.accept = DFA89_accept;
            this.special = DFA89_special;
            this.transition = DFA89_transition;
        }
        public String getDescription() {
            return "4758:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA89_0 = input.LA(1);

                         
                        int index89_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA89_0==RULE_ID) ) {s = 1;}

                        else if ( (LA89_0==18) ) {s = 2;}

                        else if ( (LA89_0==80) && (synpred20_InternalQIdl())) {s = 3;}

                        else if ( (LA89_0==26) && (synpred20_InternalQIdl())) {s = 4;}

                        else if ( ((LA89_0>=RULE_INT && LA89_0<=RULE_STRING)||LA89_0==12||LA89_0==42||(LA89_0>=45 && LA89_0<=46)||LA89_0==51||LA89_0==56||LA89_0==58||LA89_0==60||(LA89_0>=63 && LA89_0<=65)||LA89_0==68||(LA89_0>=70 && LA89_0<=77)) ) {s = 5;}

                        else if ( (LA89_0==30) ) {s = 27;}

                         
                        input.seek(index89_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA89_1 = input.LA(1);

                         
                        int index89_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalQIdl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index89_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA89_2 = input.LA(1);

                         
                        int index89_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalQIdl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index89_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 89, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA91_eotS =
        "\74\uffff";
    static final String DFA91_eofS =
        "\1\31\73\uffff";
    static final String DFA91_minS =
        "\1\4\30\0\43\uffff";
    static final String DFA91_maxS =
        "\1\120\30\0\43\uffff";
    static final String DFA91_acceptS =
        "\31\uffff\1\2\41\uffff\1\1";
    static final String DFA91_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\43\uffff}>";
    static final String[] DFA91_transitionS = {
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

    static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);
    static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);
    static final char[] DFA91_min = DFA.unpackEncodedStringToUnsignedChars(DFA91_minS);
    static final char[] DFA91_max = DFA.unpackEncodedStringToUnsignedChars(DFA91_maxS);
    static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);
    static final short[] DFA91_special = DFA.unpackEncodedString(DFA91_specialS);
    static final short[][] DFA91_transition;

    static {
        int numStates = DFA91_transitionS.length;
        DFA91_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = DFA91_eot;
            this.eof = DFA91_eof;
            this.min = DFA91_min;
            this.max = DFA91_max;
            this.accept = DFA91_accept;
            this.special = DFA91_special;
            this.transition = DFA91_transition;
        }
        public String getDescription() {
            return "5134:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA91_1 = input.LA(1);

                         
                        int index91_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA91_2 = input.LA(1);

                         
                        int index91_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA91_3 = input.LA(1);

                         
                        int index91_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA91_4 = input.LA(1);

                         
                        int index91_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA91_5 = input.LA(1);

                         
                        int index91_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA91_6 = input.LA(1);

                         
                        int index91_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA91_7 = input.LA(1);

                         
                        int index91_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA91_8 = input.LA(1);

                         
                        int index91_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA91_9 = input.LA(1);

                         
                        int index91_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA91_10 = input.LA(1);

                         
                        int index91_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA91_11 = input.LA(1);

                         
                        int index91_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA91_12 = input.LA(1);

                         
                        int index91_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA91_13 = input.LA(1);

                         
                        int index91_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA91_14 = input.LA(1);

                         
                        int index91_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA91_15 = input.LA(1);

                         
                        int index91_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA91_16 = input.LA(1);

                         
                        int index91_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA91_17 = input.LA(1);

                         
                        int index91_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA91_18 = input.LA(1);

                         
                        int index91_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA91_19 = input.LA(1);

                         
                        int index91_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA91_20 = input.LA(1);

                         
                        int index91_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA91_21 = input.LA(1);

                         
                        int index91_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA91_22 = input.LA(1);

                         
                        int index91_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA91_23 = input.LA(1);

                         
                        int index91_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA91_24 = input.LA(1);

                         
                        int index91_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index91_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 91, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA100_eotS =
        "\74\uffff";
    static final String DFA100_eofS =
        "\1\2\73\uffff";
    static final String DFA100_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA100_maxS =
        "\1\120\1\0\72\uffff";
    static final String DFA100_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA100_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA100_transitionS = {
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

    static final short[] DFA100_eot = DFA.unpackEncodedString(DFA100_eotS);
    static final short[] DFA100_eof = DFA.unpackEncodedString(DFA100_eofS);
    static final char[] DFA100_min = DFA.unpackEncodedStringToUnsignedChars(DFA100_minS);
    static final char[] DFA100_max = DFA.unpackEncodedStringToUnsignedChars(DFA100_maxS);
    static final short[] DFA100_accept = DFA.unpackEncodedString(DFA100_acceptS);
    static final short[] DFA100_special = DFA.unpackEncodedString(DFA100_specialS);
    static final short[][] DFA100_transition;

    static {
        int numStates = DFA100_transitionS.length;
        DFA100_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA100_transition[i] = DFA.unpackEncodedString(DFA100_transitionS[i]);
        }
    }

    class DFA100 extends DFA {

        public DFA100(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 100;
            this.eot = DFA100_eot;
            this.eof = DFA100_eof;
            this.min = DFA100_min;
            this.max = DFA100_max;
            this.accept = DFA100_accept;
            this.special = DFA100_special;
            this.transition = DFA100_transition;
        }
        public String getDescription() {
            return "5550:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA100_1 = input.LA(1);

                         
                        int index100_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index100_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 100, _s, input);
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
    public static final BitSet FOLLOW_12_in_ruleQtNamespace289 = new BitSet(new long[]{0x0000000180C06800L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleQtNamespace_in_ruleQtNamespace310 = new BitSet(new long[]{0x0000000180C06800L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleQtEnum_in_ruleQtNamespace332 = new BitSet(new long[]{0x0000000180C06000L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleQtFlags_in_ruleQtNamespace354 = new BitSet(new long[]{0x0000000180806000L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleQtClass_in_ruleQtNamespace376 = new BitSet(new long[]{0x0000000180006000L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleQtOperation_in_ruleQtNamespace398 = new BitSet(new long[]{0x0000000180002000L,0x0000000000600000L});
    public static final BitSet FOLLOW_13_in_ruleQtNamespace411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtOperation_in_entryRuleQtOperation449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtOperation459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtFunction_in_ruleQtOperation506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtSignal_in_ruleQtOperation533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtSlot_in_ruleQtOperation560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtClass_in_entryRuleQtClass595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtClass605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleQtClass642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtClass659 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_ruleQtClass677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtClass697 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_16_in_ruleQtClass710 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtClass730 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_12_in_ruleQtClass746 = new BitSet(new long[]{0x0000000180D26000L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleQtEnum_in_ruleQtClass767 = new BitSet(new long[]{0x0000000180D26000L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleQtFlags_in_ruleQtClass789 = new BitSet(new long[]{0x0000000180926000L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleQtClass_in_ruleQtClass811 = new BitSet(new long[]{0x0000000180126000L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleQtProperty_in_ruleQtClass833 = new BitSet(new long[]{0x0000000180122000L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleQtConstructor_in_ruleQtClass855 = new BitSet(new long[]{0x0000000180022000L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleQtOperation_in_ruleQtClass877 = new BitSet(new long[]{0x0000000180002000L,0x0000000000600000L});
    public static final BitSet FOLLOW_13_in_ruleQtClass890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtConstructor_in_entryRuleQtConstructor926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtConstructor936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleQtConstructor973 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQtConstructor985 = new BitSet(new long[]{0x0000000010080010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtParameter_in_ruleQtConstructor1007 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleQtConstructor1020 = new BitSet(new long[]{0x0000000010000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtParameter_in_ruleQtConstructor1041 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_ruleQtConstructor1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtProperty_in_entryRuleQtProperty1093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtProperty1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleQtProperty1140 = new BitSet(new long[]{0x0000000010000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtValue_in_ruleQtProperty1161 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleQtProperty1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtEnum_in_entryRuleQtEnum1209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtEnum1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleQtEnum1256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtEnum1273 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQtEnum1290 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleQtEnumValue_in_ruleQtEnum1311 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleQtEnum1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtFlags_in_entryRuleQtFlags1360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtFlags1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleQtFlags1407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtFlags1424 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQtFlags1441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtFlags1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtEnumValue_in_entryRuleQtEnumValue1497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtEnumValue1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtEnumValue1549 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleQtEnumValue1566 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleQtEnumValueMask_in_ruleQtEnumValue1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQtEnumValue1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtEnumValueMask_in_entryRuleQtEnumValueMask1653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtEnumValueMask1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtEnumValueMask1708 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleQtEnumValueMask1721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtEnumValueMask1741 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleQtBuitinType_in_entryRuleQtBuitinType1779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtBuitinType1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleQtBuitinType1826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtBuitinType1843 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQtBuitinType1860 = new BitSet(new long[]{0x0000000000040010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleQtBuitinType1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtFunction_in_entryRuleQtFunction1917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtFunction1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleQtFunction1973 = new BitSet(new long[]{0x0000000010004000L,0x0000000000980000L});
    public static final BitSet FOLLOW_28_in_ruleQtFunction1991 = new BitSet(new long[]{0x0000000010004000L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleVirtuality_in_ruleQtFunction2026 = new BitSet(new long[]{0x0000000010004000L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleOwner_in_ruleQtFunction2048 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleQtFunction2060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtFunction2077 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQtFunction2094 = new BitSet(new long[]{0x0000000050000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtParameter_in_ruleQtFunction2116 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleQtFunction2129 = new BitSet(new long[]{0x0000000010000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtParameter_in_ruleQtFunction2150 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_30_in_ruleQtFunction2166 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQtFunction2178 = new BitSet(new long[]{0x0000000010000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtReturnValue_in_ruleQtFunction2199 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleQtFunction2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtValue_in_entryRuleQtValue2247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtValue2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleQtValue2300 = new BitSet(new long[]{0x0000000000000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleQtValue2335 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtValue2356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtValue2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtParameter_in_entryRuleQtParameter2414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtParameter2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtValue_in_ruleQtParameter2470 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleQtParameter2483 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQtParameter2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtParameter2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtReturnValue_in_entryRuleQtReturnValue2571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtReturnValue2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleQtReturnValue2624 = new BitSet(new long[]{0x0000000000000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleQtReturnValue2659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtReturnValue2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtSignal_in_entryRuleQtSignal2716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtSignal2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleQtSignal2763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtSignal2780 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQtSignal2797 = new BitSet(new long[]{0x0000000050000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtParameter_in_ruleQtSignal2819 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleQtSignal2832 = new BitSet(new long[]{0x0000000010000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtParameter_in_ruleQtSignal2853 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_30_in_ruleQtSignal2869 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQtSignal2881 = new BitSet(new long[]{0x0000000010000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtReturnValue_in_ruleQtSignal2902 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleQtSignal2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtSlot_in_entryRuleQtSlot2950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtSlot2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleQtSlot2997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtSlot3014 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQtSlot3031 = new BitSet(new long[]{0x0000000050000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtParameter_in_ruleQtSlot3053 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleQtSlot3066 = new BitSet(new long[]{0x0000000010000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtParameter_in_ruleQtSlot3087 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_30_in_ruleQtSlot3103 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQtSlot3115 = new BitSet(new long[]{0x0000000010000010L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleQtReturnValue_in_ruleQtSlot3136 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleQtSlot3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression3184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment3274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXAssignment3339 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment3355 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment3405 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment3458 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign3521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpSingleAssign3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign3609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpMultiAssign3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression3696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression3753 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression3806 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression3829 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr3868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOr3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression3955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression4012 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression4065 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression4088 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd4127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd4138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpAnd4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression4214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression4271 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression4324 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression4347 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality4386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality4397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpEquality4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpEquality4454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression4494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4551 = new BitSet(new long[]{0x000007C000000002L});
    public static final BitSet FOLLOW_38_in_ruleXRelationalExpression4587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression4612 = new BitSet(new long[]{0x000007C000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression4673 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4696 = new BitSet(new long[]{0x000007C000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare4736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpCompare4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpCompare4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpCompare4823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpCompare4842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression4882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4939 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression4992 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression5015 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther5054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpOther5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpOther5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression5162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression5172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5219 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression5272 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5295 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd5334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd5345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpAdd5383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpAdd5402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression5442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5499 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression5552 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5575 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti5614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti5625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpMulti5663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpMulti5682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOpMulti5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOpMulti5720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation5760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation5828 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary5914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary5925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleOpUnary5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpUnary5982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpUnary6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression6041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression6051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression6098 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXCastedExpression6133 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression6156 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall6194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall6204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall6251 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXMemberFeatureCall6300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXMemberFeatureCall6320 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall6336 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall6358 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXMemberFeatureCall6444 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_54_in_ruleXMemberFeatureCall6468 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_55_in_ruleXMemberFeatureCall6505 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall6534 = new BitSet(new long[]{0x0000000000040010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6555 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall6568 = new BitSet(new long[]{0x0000000000040010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6589 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall6603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXMemberFeatureCall6625 = new BitSet(new long[]{0x00E0000000040002L});
    public static final BitSet FOLLOW_18_in_ruleXMemberFeatureCall6659 = new BitSet(new long[]{0x9508640044041070L,0x0000000000013FD3L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall6734 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6762 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall6775 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6796 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_30_in_ruleXMemberFeatureCall6813 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression6854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression6864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression6911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression6938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression6965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression6992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression7019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression7046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression7073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression7100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression7127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression7154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression7181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression7208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression7235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral7270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral7280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral7327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral7354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral7381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral7408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral7435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral7462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure7497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure7507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXClosure7553 = new BitSet(new long[]{0x0000000004040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7575 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_ruleXClosure7588 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7609 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_ruleXClosure7625 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure7646 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXClosure7658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure7694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure7704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7802 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_ruleXShortClosure7815 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7836 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_ruleXShortClosure7852 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure7875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression7911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression7921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleXParenthesizedExpression7958 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7980 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXParenthesizedExpression7991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression8027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression8037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXIfExpression8083 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXIfExpression8095 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression8116 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXIfExpression8128 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression8149 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXIfExpression8170 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression8192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression8230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression8240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXSwitchExpression8286 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXSwitchExpression8304 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXSwitchExpression8321 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression8344 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleXSwitchExpression8356 = new BitSet(new long[]{0x4000000001040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression8377 = new BitSet(new long[]{0x6000000001042010L,0x0000000000010000L});
    public static final BitSet FOLLOW_61_in_ruleXSwitchExpression8391 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXSwitchExpression8403 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression8424 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXSwitchExpression8438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart8474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart8484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart8530 = new BitSet(new long[]{0x4000000001000000L});
    public static final BitSet FOLLOW_62_in_ruleXCasePart8544 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart8565 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXCasePart8579 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart8600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression8636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression8646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXForLoopExpression8692 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXForLoopExpression8704 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression8725 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXForLoopExpression8737 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression8758 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXForLoopExpression8770 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression8791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression8827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression8837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXWhileExpression8883 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXWhileExpression8895 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression8916 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXWhileExpression8928 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression8949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression8995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXDoWhileExpression9041 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression9062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleXDoWhileExpression9074 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXDoWhileExpression9086 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression9107 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXDoWhileExpression9119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression9155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression9165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleXBlockExpression9211 = new BitSet(new long[]{0x9508640000043070L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression9233 = new BitSet(new long[]{0x9508640000243070L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_21_in_ruleXBlockExpression9246 = new BitSet(new long[]{0x9508640000043070L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_13_in_ruleXBlockExpression9262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock9298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock9308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock9355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock9382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration9417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration9427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXVariableDeclaration9480 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_67_in_ruleXVariableDeclaration9511 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration9560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXVariableDeclaration9577 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXVariableDeclaration9607 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleXVariableDeclaration9626 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration9647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter9685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter9695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter9741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJvmFormalParameter9759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall9800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall9810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall9867 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_42_in_ruleXFeatureCall9881 = new BitSet(new long[]{0x0000000000040010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9902 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_16_in_ruleXFeatureCall9915 = new BitSet(new long[]{0x0000000000040010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9936 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall9950 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9975 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleXFeatureCall10009 = new BitSet(new long[]{0x9508640044041070L,0x0000000000013FD3L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall10084 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall10112 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleXFeatureCall10125 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall10146 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_30_in_ruleXFeatureCall10163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper10202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper10213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdOrSuper10253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleIdOrSuper10277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier10318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier10329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStaticQualifier10369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleStaticQualifier10387 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall10428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall10438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXConstructorCall10484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall10507 = new BitSet(new long[]{0x0000040000040000L});
    public static final BitSet FOLLOW_42_in_ruleXConstructorCall10520 = new BitSet(new long[]{0x0000000000040010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10541 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_16_in_ruleXConstructorCall10554 = new BitSet(new long[]{0x0000000000040010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10575 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall10589 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXConstructorCall10603 = new BitSet(new long[]{0x9508640044041070L,0x0000000000013FD3L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall10665 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10693 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleXConstructorCall10706 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10727 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_30_in_ruleXConstructorCall10744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral10790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXBooleanLiteral10837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXBooleanLiteral10861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral10921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXNullLiteral10967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral11003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral11013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral11064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral11105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral11115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral11166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral11207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral11217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXTypeLiteral11263 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXTypeLiteral11275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral11298 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXTypeLiteral11310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression11346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression11356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXThrowExpression11402 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression11423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression11459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression11469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXReturnExpression11515 = new BitSet(new long[]{0x9508640000041072L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression11546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression11583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression11593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXTryCatchFinallyExpression11639 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11660 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11690 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_78_in_ruleXTryCatchFinallyExpression11712 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleXTryCatchFinallyExpression11756 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause11825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleXCatchClause11870 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXCatchClause11883 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause11904 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXCatchClause11916 = new BitSet(new long[]{0x9508640000041070L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause11937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName11985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12025 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleQualifiedName12053 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12069 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference12116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference12126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference12173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference12200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef12235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef12245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleXFunctionTypeRef12283 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12304 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleXFunctionTypeRef12317 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12338 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_30_in_ruleXFunctionTypeRef12352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleXFunctionTypeRef12366 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference12423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12481 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleJvmParameterizedTypeReference12502 = new BitSet(new long[]{0x0000000000040010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12524 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_16_in_ruleJvmParameterizedTypeReference12537 = new BitSet(new long[]{0x0000000000040010L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12558 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_41_in_ruleJvmParameterizedTypeReference12572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleJvmWildcardTypeReference12785 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound12882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleJvmUpperBound12919 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleJvmUpperBoundAnded13023 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded13044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound13080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound13090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleJvmLowerBound13127 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound13148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleVirtuality13200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleVirtuality13217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleVisibility13262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleVisibility13279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleOwner13324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOwner13341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleType13386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleType13403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalQIdl3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalQIdl3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalQIdl4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalQIdl4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred5_InternalQIdl4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalQIdl4641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalQIdl4960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalQIdl5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalQIdl5520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred10_InternalQIdl6114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred11_InternalQIdl6268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred11_InternalQIdl6276 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalQIdl6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred12_InternalQIdl6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred12_InternalQIdl6397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred12_InternalQIdl6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred13_InternalQIdl6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalQIdl6693 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_synpred14_InternalQIdl6700 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalQIdl6707 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_synpred14_InternalQIdl6717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_synpred16_InternalQIdl8162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred17_InternalQIdl9529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred17_InternalQIdl9538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred18_InternalQIdl9991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalQIdl10043 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_synpred19_InternalQIdl10050 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalQIdl10057 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_synpred19_InternalQIdl10067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalQIdl10624 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_synpred20_InternalQIdl10631 = new BitSet(new long[]{0x0000000000040010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalQIdl10638 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_synpred20_InternalQIdl10648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred21_InternalQIdl11529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_synpred22_InternalQIdl11674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_synpred23_InternalQIdl11704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred25_InternalQIdl12044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred26_InternalQIdl12494 = new BitSet(new long[]{0x0000000000000002L});

}