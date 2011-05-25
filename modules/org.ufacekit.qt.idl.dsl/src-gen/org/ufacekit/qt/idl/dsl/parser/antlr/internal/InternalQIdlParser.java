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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LONG", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'{'", "'}'", "'class'", "'extends'", "','", "'constructor'", "'('", "');'", "'property'", "';'", "'enumeration'", "'flags'", "':'", "'='", "'|'", "'builtin'", "'const'", "'function'", "')'", "'signal'", "'slot'", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "'['", "']'", "'if'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'&'", "'virtual'", "'purevirtual'", "'public'", "'protected'", "'member'", "'pointer'", "'reference'"
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
    public static final int RULE_ANY_OTHER=11;
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
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__90=90;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
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
    public static final int RULE_LONG=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
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
    public static final int RULE_WS=10;
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
            case 28:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 12:
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:149:1: ruleQtNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_namespaces_3_0= ruleQtNamespace ) ) | ( (lv_enums_4_0= ruleQtEnum ) ) | ( (lv_flags_5_0= ruleQtFlags ) ) | ( (lv_classes_6_0= ruleQtClass ) ) | ( (lv_operations_7_0= ruleQtOperation ) ) )* otherlv_8= '}' ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:152:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_namespaces_3_0= ruleQtNamespace ) ) | ( (lv_enums_4_0= ruleQtEnum ) ) | ( (lv_flags_5_0= ruleQtFlags ) ) | ( (lv_classes_6_0= ruleQtClass ) ) | ( (lv_operations_7_0= ruleQtOperation ) ) )* otherlv_8= '}' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:153:1: (otherlv_0= 'namespace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_namespaces_3_0= ruleQtNamespace ) ) | ( (lv_enums_4_0= ruleQtEnum ) ) | ( (lv_flags_5_0= ruleQtFlags ) ) | ( (lv_classes_6_0= ruleQtClass ) ) | ( (lv_operations_7_0= ruleQtOperation ) ) )* otherlv_8= '}' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:153:1: (otherlv_0= 'namespace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_namespaces_3_0= ruleQtNamespace ) ) | ( (lv_enums_4_0= ruleQtEnum ) ) | ( (lv_flags_5_0= ruleQtFlags ) ) | ( (lv_classes_6_0= ruleQtClass ) ) | ( (lv_operations_7_0= ruleQtOperation ) ) )* otherlv_8= '}' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:153:3: otherlv_0= 'namespace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_namespaces_3_0= ruleQtNamespace ) ) | ( (lv_enums_4_0= ruleQtEnum ) ) | ( (lv_flags_5_0= ruleQtFlags ) ) | ( (lv_classes_6_0= ruleQtClass ) ) | ( (lv_operations_7_0= ruleQtOperation ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleQtNamespace255); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleQtNamespace289); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQtNamespaceAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:179:1: ( ( (lv_namespaces_3_0= ruleQtNamespace ) ) | ( (lv_enums_4_0= ruleQtEnum ) ) | ( (lv_flags_5_0= ruleQtFlags ) ) | ( (lv_classes_6_0= ruleQtClass ) ) | ( (lv_operations_7_0= ruleQtOperation ) ) )*
            loop2:
            do {
                int alt2=6;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    alt2=1;
                    }
                    break;
                case 23:
                    {
                    alt2=2;
                    }
                    break;
                case 24:
                    {
                    alt2=3;
                    }
                    break;
                case 15:
                    {
                    alt2=4;
                    }
                    break;
                case 32:
                case 33:
                case 86:
                case 87:
                    {
                    alt2=5;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:179:2: ( (lv_namespaces_3_0= ruleQtNamespace ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:179:2: ( (lv_namespaces_3_0= ruleQtNamespace ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:180:1: (lv_namespaces_3_0= ruleQtNamespace )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:180:1: (lv_namespaces_3_0= ruleQtNamespace )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:181:3: lv_namespaces_3_0= ruleQtNamespace
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtNamespaceAccess().getNamespacesQtNamespaceParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtNamespace_in_ruleQtNamespace311);
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


            	    }
            	    break;
            	case 2 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:198:6: ( (lv_enums_4_0= ruleQtEnum ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:198:6: ( (lv_enums_4_0= ruleQtEnum ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:199:1: (lv_enums_4_0= ruleQtEnum )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:199:1: (lv_enums_4_0= ruleQtEnum )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:200:3: lv_enums_4_0= ruleQtEnum
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtNamespaceAccess().getEnumsQtEnumParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtEnum_in_ruleQtNamespace338);
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


            	    }
            	    break;
            	case 3 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:217:6: ( (lv_flags_5_0= ruleQtFlags ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:217:6: ( (lv_flags_5_0= ruleQtFlags ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:218:1: (lv_flags_5_0= ruleQtFlags )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:218:1: (lv_flags_5_0= ruleQtFlags )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:219:3: lv_flags_5_0= ruleQtFlags
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtNamespaceAccess().getFlagsQtFlagsParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtFlags_in_ruleQtNamespace365);
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


            	    }
            	    break;
            	case 4 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:236:6: ( (lv_classes_6_0= ruleQtClass ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:236:6: ( (lv_classes_6_0= ruleQtClass ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:237:1: (lv_classes_6_0= ruleQtClass )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:237:1: (lv_classes_6_0= ruleQtClass )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:238:3: lv_classes_6_0= ruleQtClass
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtNamespaceAccess().getClassesQtClassParserRuleCall_3_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtClass_in_ruleQtNamespace392);
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


            	    }
            	    break;
            	case 5 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:255:6: ( (lv_operations_7_0= ruleQtOperation ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:255:6: ( (lv_operations_7_0= ruleQtOperation ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:256:1: (lv_operations_7_0= ruleQtOperation )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:256:1: (lv_operations_7_0= ruleQtOperation )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:257:3: lv_operations_7_0= ruleQtOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtNamespaceAccess().getOperationsQtOperationParserRuleCall_3_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtOperation_in_ruleQtNamespace419);
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


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleQtNamespace433); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getQtNamespaceAccess().getRightCurlyBracketKeyword_4());
                  
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:287:1: entryRuleQtOperation returns [EObject current=null] : iv_ruleQtOperation= ruleQtOperation EOF ;
    public final EObject entryRuleQtOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtOperation = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:288:2: (iv_ruleQtOperation= ruleQtOperation EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:289:2: iv_ruleQtOperation= ruleQtOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtOperationRule()); 
            }
            pushFollow(FOLLOW_ruleQtOperation_in_entryRuleQtOperation471);
            iv_ruleQtOperation=ruleQtOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtOperation481); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:296:1: ruleQtOperation returns [EObject current=null] : (this_QtFunction_0= ruleQtFunction | this_QtSignal_1= ruleQtSignal | this_QtSlot_2= ruleQtSlot ) ;
    public final EObject ruleQtOperation() throws RecognitionException {
        EObject current = null;

        EObject this_QtFunction_0 = null;

        EObject this_QtSignal_1 = null;

        EObject this_QtSlot_2 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:299:28: ( (this_QtFunction_0= ruleQtFunction | this_QtSignal_1= ruleQtSignal | this_QtSlot_2= ruleQtSlot ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:300:1: (this_QtFunction_0= ruleQtFunction | this_QtSignal_1= ruleQtSignal | this_QtSlot_2= ruleQtSlot )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:300:1: (this_QtFunction_0= ruleQtFunction | this_QtSignal_1= ruleQtSignal | this_QtSlot_2= ruleQtSlot )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 86:
            case 87:
                {
                alt3=1;
                }
                break;
            case 32:
                {
                alt3=2;
                }
                break;
            case 33:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:301:5: this_QtFunction_0= ruleQtFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQtOperationAccess().getQtFunctionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQtFunction_in_ruleQtOperation528);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:311:5: this_QtSignal_1= ruleQtSignal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQtOperationAccess().getQtSignalParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQtSignal_in_ruleQtOperation555);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:321:5: this_QtSlot_2= ruleQtSlot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQtOperationAccess().getQtSlotParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQtSlot_in_ruleQtOperation582);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:337:1: entryRuleQtClass returns [EObject current=null] : iv_ruleQtClass= ruleQtClass EOF ;
    public final EObject entryRuleQtClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtClass = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:338:2: (iv_ruleQtClass= ruleQtClass EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:339:2: iv_ruleQtClass= ruleQtClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtClassRule()); 
            }
            pushFollow(FOLLOW_ruleQtClass_in_entryRuleQtClass617);
            iv_ruleQtClass=ruleQtClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtClass627); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:346:1: ruleQtClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( ( (lv_enums_7_0= ruleQtEnum ) ) | ( (lv_flags_8_0= ruleQtFlags ) ) | ( (lv_classes_9_0= ruleQtClass ) ) | ( (lv_properties_10_0= ruleQtProperty ) ) | ( (lv_constructors_11_0= ruleQtConstructor ) ) | ( (lv_operations_12_0= ruleQtOperation ) ) )* otherlv_13= '}' ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:349:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( ( (lv_enums_7_0= ruleQtEnum ) ) | ( (lv_flags_8_0= ruleQtFlags ) ) | ( (lv_classes_9_0= ruleQtClass ) ) | ( (lv_properties_10_0= ruleQtProperty ) ) | ( (lv_constructors_11_0= ruleQtConstructor ) ) | ( (lv_operations_12_0= ruleQtOperation ) ) )* otherlv_13= '}' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:350:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( ( (lv_enums_7_0= ruleQtEnum ) ) | ( (lv_flags_8_0= ruleQtFlags ) ) | ( (lv_classes_9_0= ruleQtClass ) ) | ( (lv_properties_10_0= ruleQtProperty ) ) | ( (lv_constructors_11_0= ruleQtConstructor ) ) | ( (lv_operations_12_0= ruleQtOperation ) ) )* otherlv_13= '}' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:350:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( ( (lv_enums_7_0= ruleQtEnum ) ) | ( (lv_flags_8_0= ruleQtFlags ) ) | ( (lv_classes_9_0= ruleQtClass ) ) | ( (lv_properties_10_0= ruleQtProperty ) ) | ( (lv_constructors_11_0= ruleQtConstructor ) ) | ( (lv_operations_12_0= ruleQtOperation ) ) )* otherlv_13= '}' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:350:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( ( (lv_enums_7_0= ruleQtEnum ) ) | ( (lv_flags_8_0= ruleQtFlags ) ) | ( (lv_classes_9_0= ruleQtClass ) ) | ( (lv_properties_10_0= ruleQtProperty ) ) | ( (lv_constructors_11_0= ruleQtConstructor ) ) | ( (lv_operations_12_0= ruleQtOperation ) ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleQtClass664); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtClassAccess().getClassKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:354:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:355:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:355:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:356:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtClass681); if (state.failed) return current;
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:372:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:372:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleQtClass699); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getQtClassAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:376:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:377:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:377:1: (otherlv_3= RULE_ID )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:378:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getQtClassRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtClass719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getQtClassAccess().getSuperTypesQtClassCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:389:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:389:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleQtClass732); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getQtClassAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:393:1: ( (otherlv_5= RULE_ID ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:394:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:394:1: (otherlv_5= RULE_ID )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:395:3: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getQtClassRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtClass752); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_5, grammarAccess.getQtClassAccess().getSuperTypesQtClassCrossReference_2_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleQtClass768); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getQtClassAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:410:1: ( ( (lv_enums_7_0= ruleQtEnum ) ) | ( (lv_flags_8_0= ruleQtFlags ) ) | ( (lv_classes_9_0= ruleQtClass ) ) | ( (lv_properties_10_0= ruleQtProperty ) ) | ( (lv_constructors_11_0= ruleQtConstructor ) ) | ( (lv_operations_12_0= ruleQtOperation ) ) )*
            loop6:
            do {
                int alt6=7;
                switch ( input.LA(1) ) {
                case 23:
                    {
                    alt6=1;
                    }
                    break;
                case 24:
                    {
                    alt6=2;
                    }
                    break;
                case 15:
                    {
                    alt6=3;
                    }
                    break;
                case 21:
                    {
                    alt6=4;
                    }
                    break;
                case 18:
                    {
                    alt6=5;
                    }
                    break;
                case 32:
                case 33:
                case 86:
                case 87:
                    {
                    alt6=6;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:410:2: ( (lv_enums_7_0= ruleQtEnum ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:410:2: ( (lv_enums_7_0= ruleQtEnum ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:411:1: (lv_enums_7_0= ruleQtEnum )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:411:1: (lv_enums_7_0= ruleQtEnum )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:412:3: lv_enums_7_0= ruleQtEnum
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtClassAccess().getEnumsQtEnumParserRuleCall_4_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtEnum_in_ruleQtClass790);
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


            	    }
            	    break;
            	case 2 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:429:6: ( (lv_flags_8_0= ruleQtFlags ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:429:6: ( (lv_flags_8_0= ruleQtFlags ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:430:1: (lv_flags_8_0= ruleQtFlags )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:430:1: (lv_flags_8_0= ruleQtFlags )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:431:3: lv_flags_8_0= ruleQtFlags
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtClassAccess().getFlagsQtFlagsParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtFlags_in_ruleQtClass817);
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


            	    }
            	    break;
            	case 3 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:448:6: ( (lv_classes_9_0= ruleQtClass ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:448:6: ( (lv_classes_9_0= ruleQtClass ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:449:1: (lv_classes_9_0= ruleQtClass )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:449:1: (lv_classes_9_0= ruleQtClass )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:450:3: lv_classes_9_0= ruleQtClass
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtClassAccess().getClassesQtClassParserRuleCall_4_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtClass_in_ruleQtClass844);
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


            	    }
            	    break;
            	case 4 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:467:6: ( (lv_properties_10_0= ruleQtProperty ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:467:6: ( (lv_properties_10_0= ruleQtProperty ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:468:1: (lv_properties_10_0= ruleQtProperty )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:468:1: (lv_properties_10_0= ruleQtProperty )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:469:3: lv_properties_10_0= ruleQtProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtClassAccess().getPropertiesQtPropertyParserRuleCall_4_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtProperty_in_ruleQtClass871);
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


            	    }
            	    break;
            	case 5 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:486:6: ( (lv_constructors_11_0= ruleQtConstructor ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:486:6: ( (lv_constructors_11_0= ruleQtConstructor ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:487:1: (lv_constructors_11_0= ruleQtConstructor )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:487:1: (lv_constructors_11_0= ruleQtConstructor )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:488:3: lv_constructors_11_0= ruleQtConstructor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtClassAccess().getConstructorsQtConstructorParserRuleCall_4_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtConstructor_in_ruleQtClass898);
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


            	    }
            	    break;
            	case 6 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:505:6: ( (lv_operations_12_0= ruleQtOperation ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:505:6: ( (lv_operations_12_0= ruleQtOperation ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:506:1: (lv_operations_12_0= ruleQtOperation )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:506:1: (lv_operations_12_0= ruleQtOperation )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:507:3: lv_operations_12_0= ruleQtOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtClassAccess().getOperationsQtOperationParserRuleCall_4_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtOperation_in_ruleQtClass925);
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


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleQtClass939); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getQtClassAccess().getRightCurlyBracketKeyword_5());
                  
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:535:1: entryRuleQtConstructor returns [EObject current=null] : iv_ruleQtConstructor= ruleQtConstructor EOF ;
    public final EObject entryRuleQtConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtConstructor = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:536:2: (iv_ruleQtConstructor= ruleQtConstructor EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:537:2: iv_ruleQtConstructor= ruleQtConstructor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtConstructorRule()); 
            }
            pushFollow(FOLLOW_ruleQtConstructor_in_entryRuleQtConstructor975);
            iv_ruleQtConstructor=ruleQtConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtConstructor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtConstructor985); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:544:1: ruleQtConstructor returns [EObject current=null] : (otherlv_0= 'constructor' () otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ');' ) ;
    public final EObject ruleQtConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:547:28: ( (otherlv_0= 'constructor' () otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ');' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:548:1: (otherlv_0= 'constructor' () otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ');' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:548:1: (otherlv_0= 'constructor' () otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ');' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:548:3: otherlv_0= 'constructor' () otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ');'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleQtConstructor1022); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtConstructorAccess().getConstructorKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:552:1: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:553:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getQtConstructorAccess().getQtConstructorAction_1(),
                          current);
                  
            }

            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleQtConstructor1043); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQtConstructorAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:562:1: ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||LA8_0==29||(LA8_0>=89 && LA8_0<=90)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:562:2: ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:562:2: ( (lv_params_3_0= ruleQtParameter ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:563:1: (lv_params_3_0= ruleQtParameter )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:563:1: (lv_params_3_0= ruleQtParameter )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:564:3: lv_params_3_0= ruleQtParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtConstructorAccess().getParamsQtParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQtParameter_in_ruleQtConstructor1065);
                    lv_params_3_0=ruleQtParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getQtConstructorRule());
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:580:2: (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:580:4: otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleQtConstructor1078); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getQtConstructorAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:584:1: ( (lv_params_5_0= ruleQtParameter ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:585:1: (lv_params_5_0= ruleQtParameter )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:585:1: (lv_params_5_0= ruleQtParameter )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:586:3: lv_params_5_0= ruleQtParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getQtConstructorAccess().getParamsQtParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQtParameter_in_ruleQtConstructor1099);
                    	    lv_params_5_0=ruleQtParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getQtConstructorRule());
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
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleQtConstructor1115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getQtConstructorAccess().getRightParenthesisSemicolonKeyword_4());
                  
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:614:1: entryRuleQtProperty returns [EObject current=null] : iv_ruleQtProperty= ruleQtProperty EOF ;
    public final EObject entryRuleQtProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtProperty = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:615:2: (iv_ruleQtProperty= ruleQtProperty EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:616:2: iv_ruleQtProperty= ruleQtProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleQtProperty_in_entryRuleQtProperty1151);
            iv_ruleQtProperty=ruleQtProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtProperty1161); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:623:1: ruleQtProperty returns [EObject current=null] : (otherlv_0= 'property' ( (lv_type_1_0= ruleQtValue ) ) otherlv_2= ';' ) ;
    public final EObject ruleQtProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:626:28: ( (otherlv_0= 'property' ( (lv_type_1_0= ruleQtValue ) ) otherlv_2= ';' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:627:1: (otherlv_0= 'property' ( (lv_type_1_0= ruleQtValue ) ) otherlv_2= ';' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:627:1: (otherlv_0= 'property' ( (lv_type_1_0= ruleQtValue ) ) otherlv_2= ';' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:627:3: otherlv_0= 'property' ( (lv_type_1_0= ruleQtValue ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleQtProperty1198); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtPropertyAccess().getPropertyKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:631:1: ( (lv_type_1_0= ruleQtValue ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:632:1: (lv_type_1_0= ruleQtValue )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:632:1: (lv_type_1_0= ruleQtValue )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:633:3: lv_type_1_0= ruleQtValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtPropertyAccess().getTypeQtValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQtValue_in_ruleQtProperty1219);
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

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleQtProperty1231); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:661:1: entryRuleQtEnum returns [EObject current=null] : iv_ruleQtEnum= ruleQtEnum EOF ;
    public final EObject entryRuleQtEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtEnum = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:662:2: (iv_ruleQtEnum= ruleQtEnum EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:663:2: iv_ruleQtEnum= ruleQtEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtEnumRule()); 
            }
            pushFollow(FOLLOW_ruleQtEnum_in_entryRuleQtEnum1267);
            iv_ruleQtEnum=ruleQtEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtEnum; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtEnum1277); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:670:1: ruleQtEnum returns [EObject current=null] : (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleQtEnumValue ) )* otherlv_4= '}' ) ;
    public final EObject ruleQtEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:673:28: ( (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleQtEnumValue ) )* otherlv_4= '}' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:674:1: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleQtEnumValue ) )* otherlv_4= '}' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:674:1: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleQtEnumValue ) )* otherlv_4= '}' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:674:3: otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleQtEnumValue ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleQtEnum1314); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtEnumAccess().getEnumerationKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:678:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:679:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:679:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:680:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtEnum1331); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleQtEnum1348); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQtEnumAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:700:1: ( (lv_values_3_0= ruleQtEnumValue ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:701:1: (lv_values_3_0= ruleQtEnumValue )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:701:1: (lv_values_3_0= ruleQtEnumValue )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:702:3: lv_values_3_0= ruleQtEnumValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQtEnumAccess().getValuesQtEnumValueParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQtEnumValue_in_ruleQtEnum1369);
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
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleQtEnum1382); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:730:1: entryRuleQtFlags returns [EObject current=null] : iv_ruleQtFlags= ruleQtFlags EOF ;
    public final EObject entryRuleQtFlags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtFlags = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:731:2: (iv_ruleQtFlags= ruleQtFlags EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:732:2: iv_ruleQtFlags= ruleQtFlags EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtFlagsRule()); 
            }
            pushFollow(FOLLOW_ruleQtFlags_in_entryRuleQtFlags1418);
            iv_ruleQtFlags=ruleQtFlags();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtFlags; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtFlags1428); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:739:1: ruleQtFlags returns [EObject current=null] : (otherlv_0= 'flags' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleQtFlags() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:742:28: ( (otherlv_0= 'flags' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:743:1: (otherlv_0= 'flags' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:743:1: (otherlv_0= 'flags' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:743:3: otherlv_0= 'flags' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleQtFlags1465); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtFlagsAccess().getFlagsKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:747:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:748:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:748:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:749:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtFlags1482); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleQtFlags1499); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQtFlagsAccess().getColonKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:769:1: ( (otherlv_3= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:770:1: (otherlv_3= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:770:1: (otherlv_3= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:771:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getQtFlagsRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtFlags1519); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getQtFlagsAccess().getEnumerationQtEnumCrossReference_3_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleQtFlags1531); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQtFlagsAccess().getSemicolonKeyword_4());
                  
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:794:1: entryRuleQtEnumValue returns [EObject current=null] : iv_ruleQtEnumValue= ruleQtEnumValue EOF ;
    public final EObject entryRuleQtEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtEnumValue = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:795:2: (iv_ruleQtEnumValue= ruleQtEnumValue EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:796:2: iv_ruleQtEnumValue= ruleQtEnumValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtEnumValueRule()); 
            }
            pushFollow(FOLLOW_ruleQtEnumValue_in_entryRuleQtEnumValue1567);
            iv_ruleQtEnumValue=ruleQtEnumValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtEnumValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtEnumValue1577); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:803:1: ruleQtEnumValue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_enumMask_2_0= ruleQtEnumValueMask ) ) ) ;
    public final EObject ruleQtEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_enumMask_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:806:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_enumMask_2_0= ruleQtEnumValueMask ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:807:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_enumMask_2_0= ruleQtEnumValueMask ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:807:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_enumMask_2_0= ruleQtEnumValueMask ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:807:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_enumMask_2_0= ruleQtEnumValueMask ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:807:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:808:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:808:1: (lv_name_0_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:809:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtEnumValue1619); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleQtEnumValue1636); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getQtEnumValueAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:829:1: ( (lv_enumMask_2_0= ruleQtEnumValueMask ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:830:1: (lv_enumMask_2_0= ruleQtEnumValueMask )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:830:1: (lv_enumMask_2_0= ruleQtEnumValueMask )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:831:3: lv_enumMask_2_0= ruleQtEnumValueMask
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtEnumValueAccess().getEnumMaskQtEnumValueMaskParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQtEnumValueMask_in_ruleQtEnumValue1657);
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
            pushFollow(FOLLOW_ruleQtEnumValueMask_in_entryRuleQtEnumValueMask1693);
            iv_ruleQtEnumValueMask=ruleQtEnumValueMask();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtEnumValueMask; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtEnumValueMask1703); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:864:1: ruleQtEnumValueMask returns [EObject current=null] : ( ( ( ( ruleQualifiedName ) ) | ( (lv_numericValue_1_0= RULE_LONG ) ) ) (otherlv_2= '|' ( ( ( ruleQualifiedName ) ) | ( (lv_numericValue_4_0= RULE_LONG ) ) ) )* ) ;
    public final EObject ruleQtEnumValueMask() throws RecognitionException {
        EObject current = null;

        Token lv_numericValue_1_0=null;
        Token otherlv_2=null;
        Token lv_numericValue_4_0=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:867:28: ( ( ( ( ( ruleQualifiedName ) ) | ( (lv_numericValue_1_0= RULE_LONG ) ) ) (otherlv_2= '|' ( ( ( ruleQualifiedName ) ) | ( (lv_numericValue_4_0= RULE_LONG ) ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:868:1: ( ( ( ( ruleQualifiedName ) ) | ( (lv_numericValue_1_0= RULE_LONG ) ) ) (otherlv_2= '|' ( ( ( ruleQualifiedName ) ) | ( (lv_numericValue_4_0= RULE_LONG ) ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:868:1: ( ( ( ( ruleQualifiedName ) ) | ( (lv_numericValue_1_0= RULE_LONG ) ) ) (otherlv_2= '|' ( ( ( ruleQualifiedName ) ) | ( (lv_numericValue_4_0= RULE_LONG ) ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:868:2: ( ( ( ruleQualifiedName ) ) | ( (lv_numericValue_1_0= RULE_LONG ) ) ) (otherlv_2= '|' ( ( ( ruleQualifiedName ) ) | ( (lv_numericValue_4_0= RULE_LONG ) ) ) )*
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:868:2: ( ( ( ruleQualifiedName ) ) | ( (lv_numericValue_1_0= RULE_LONG ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_LONG) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:868:3: ( ( ruleQualifiedName ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:868:3: ( ( ruleQualifiedName ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:869:1: ( ruleQualifiedName )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:869:1: ( ruleQualifiedName )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:870:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getQtEnumValueMaskRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtEnumValueMaskAccess().getValueQtEnumValueCrossReference_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleQtEnumValueMask1752);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:884:6: ( (lv_numericValue_1_0= RULE_LONG ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:884:6: ( (lv_numericValue_1_0= RULE_LONG ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:885:1: (lv_numericValue_1_0= RULE_LONG )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:885:1: (lv_numericValue_1_0= RULE_LONG )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:886:3: lv_numericValue_1_0= RULE_LONG
                    {
                    lv_numericValue_1_0=(Token)match(input,RULE_LONG,FOLLOW_RULE_LONG_in_ruleQtEnumValueMask1775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_numericValue_1_0, grammarAccess.getQtEnumValueMaskAccess().getNumericValueLONGTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getQtEnumValueMaskRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"numericValue",
                              		lv_numericValue_1_0, 
                              		"LONG");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:902:3: (otherlv_2= '|' ( ( ( ruleQualifiedName ) ) | ( (lv_numericValue_4_0= RULE_LONG ) ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:902:5: otherlv_2= '|' ( ( ( ruleQualifiedName ) ) | ( (lv_numericValue_4_0= RULE_LONG ) ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleQtEnumValueMask1794); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getQtEnumValueMaskAccess().getVerticalLineKeyword_1_0());
            	          
            	    }
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:906:1: ( ( ( ruleQualifiedName ) ) | ( (lv_numericValue_4_0= RULE_LONG ) ) )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==RULE_ID) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==RULE_LONG) ) {
            	        alt11=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:906:2: ( ( ruleQualifiedName ) )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:906:2: ( ( ruleQualifiedName ) )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:907:1: ( ruleQualifiedName )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:907:1: ( ruleQualifiedName )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:908:3: ruleQualifiedName
            	            {
            	            if ( state.backtracking==0 ) {

            	              			if (current==null) {
            	              	            current = createModelElement(grammarAccess.getQtEnumValueMaskRule());
            	              	        }
            	                      
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getQtEnumValueMaskAccess().getValueQtEnumValueCrossReference_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQtEnumValueMask1818);
            	            ruleQualifiedName();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {
            	               
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:922:6: ( (lv_numericValue_4_0= RULE_LONG ) )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:922:6: ( (lv_numericValue_4_0= RULE_LONG ) )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:923:1: (lv_numericValue_4_0= RULE_LONG )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:923:1: (lv_numericValue_4_0= RULE_LONG )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:924:3: lv_numericValue_4_0= RULE_LONG
            	            {
            	            lv_numericValue_4_0=(Token)match(input,RULE_LONG,FOLLOW_RULE_LONG_in_ruleQtEnumValueMask1841); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_numericValue_4_0, grammarAccess.getQtEnumValueMaskAccess().getNumericValueLONGTerminalRuleCall_1_1_1_0()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getQtEnumValueMaskRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"numericValue",
            	                      		lv_numericValue_4_0, 
            	                      		"LONG");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:948:1: entryRuleQtBuitinType returns [EObject current=null] : iv_ruleQtBuitinType= ruleQtBuitinType EOF ;
    public final EObject entryRuleQtBuitinType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtBuitinType = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:949:2: (iv_ruleQtBuitinType= ruleQtBuitinType EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:950:2: iv_ruleQtBuitinType= ruleQtBuitinType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtBuitinTypeRule()); 
            }
            pushFollow(FOLLOW_ruleQtBuitinType_in_entryRuleQtBuitinType1885);
            iv_ruleQtBuitinType=ruleQtBuitinType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtBuitinType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtBuitinType1895); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:957:1: ruleQtBuitinType returns [EObject current=null] : (otherlv_0= 'builtin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleJvmArgumentTypeReference ) ) ) ;
    public final EObject ruleQtBuitinType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:960:28: ( (otherlv_0= 'builtin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleJvmArgumentTypeReference ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:961:1: (otherlv_0= 'builtin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleJvmArgumentTypeReference ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:961:1: (otherlv_0= 'builtin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleJvmArgumentTypeReference ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:961:3: otherlv_0= 'builtin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleJvmArgumentTypeReference ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleQtBuitinType1932); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtBuitinTypeAccess().getBuiltinKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:965:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:966:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:966:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:967:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtBuitinType1949); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleQtBuitinType1966); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQtBuitinTypeAccess().getColonKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:987:1: ( (lv_value_3_0= ruleJvmArgumentTypeReference ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:988:1: (lv_value_3_0= ruleJvmArgumentTypeReference )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:988:1: (lv_value_3_0= ruleJvmArgumentTypeReference )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:989:3: lv_value_3_0= ruleJvmArgumentTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtBuitinTypeAccess().getValueJvmArgumentTypeReferenceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleQtBuitinType1987);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1013:1: entryRuleQtFunction returns [EObject current=null] : iv_ruleQtFunction= ruleQtFunction EOF ;
    public final EObject entryRuleQtFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtFunction = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1014:2: (iv_ruleQtFunction= ruleQtFunction EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1015:2: iv_ruleQtFunction= ruleQtFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleQtFunction_in_entryRuleQtFunction2023);
            iv_ruleQtFunction=ruleQtFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtFunction2033); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1022:1: ruleQtFunction returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) ) ( (lv_const_1_0= 'const' ) )? ( (lv_virtual_2_0= ruleVirtuality ) )? ( (lv_owner_3_0= ruleOwner ) ) otherlv_4= 'function' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleQtParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleQtParameter ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_returnValue_12_0= ruleQtReturnValue ) ) otherlv_13= ';' ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1025:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) ) ( (lv_const_1_0= 'const' ) )? ( (lv_virtual_2_0= ruleVirtuality ) )? ( (lv_owner_3_0= ruleOwner ) ) otherlv_4= 'function' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleQtParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleQtParameter ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_returnValue_12_0= ruleQtReturnValue ) ) otherlv_13= ';' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1026:1: ( ( (lv_visibility_0_0= ruleVisibility ) ) ( (lv_const_1_0= 'const' ) )? ( (lv_virtual_2_0= ruleVirtuality ) )? ( (lv_owner_3_0= ruleOwner ) ) otherlv_4= 'function' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleQtParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleQtParameter ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_returnValue_12_0= ruleQtReturnValue ) ) otherlv_13= ';' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1026:1: ( ( (lv_visibility_0_0= ruleVisibility ) ) ( (lv_const_1_0= 'const' ) )? ( (lv_virtual_2_0= ruleVirtuality ) )? ( (lv_owner_3_0= ruleOwner ) ) otherlv_4= 'function' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleQtParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleQtParameter ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_returnValue_12_0= ruleQtReturnValue ) ) otherlv_13= ';' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1026:2: ( (lv_visibility_0_0= ruleVisibility ) ) ( (lv_const_1_0= 'const' ) )? ( (lv_virtual_2_0= ruleVirtuality ) )? ( (lv_owner_3_0= ruleOwner ) ) otherlv_4= 'function' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleQtParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleQtParameter ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_returnValue_12_0= ruleQtReturnValue ) ) otherlv_13= ';'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1026:2: ( (lv_visibility_0_0= ruleVisibility ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1027:1: (lv_visibility_0_0= ruleVisibility )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1027:1: (lv_visibility_0_0= ruleVisibility )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1028:3: lv_visibility_0_0= ruleVisibility
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtFunctionAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVisibility_in_ruleQtFunction2079);
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1044:2: ( (lv_const_1_0= 'const' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1045:1: (lv_const_1_0= 'const' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1045:1: (lv_const_1_0= 'const' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1046:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,29,FOLLOW_29_in_ruleQtFunction2097); if (state.failed) return current;
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1059:3: ( (lv_virtual_2_0= ruleVirtuality ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=84 && LA14_0<=85)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1060:1: (lv_virtual_2_0= ruleVirtuality )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1060:1: (lv_virtual_2_0= ruleVirtuality )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1061:3: lv_virtual_2_0= ruleVirtuality
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtFunctionAccess().getVirtualVirtualityEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVirtuality_in_ruleQtFunction2132);
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1077:3: ( (lv_owner_3_0= ruleOwner ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1078:1: (lv_owner_3_0= ruleOwner )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1078:1: (lv_owner_3_0= ruleOwner )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1079:3: lv_owner_3_0= ruleOwner
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtFunctionAccess().getOwnerOwnerEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOwner_in_ruleQtFunction2154);
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

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleQtFunction2166); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQtFunctionAccess().getFunctionKeyword_4());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1099:1: ( (lv_name_5_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1100:1: (lv_name_5_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1100:1: (lv_name_5_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1101:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtFunction2183); if (state.failed) return current;
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

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleQtFunction2200); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getQtFunctionAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1121:1: ( ( (lv_params_7_0= ruleQtParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleQtParameter ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||LA16_0==29||(LA16_0>=89 && LA16_0<=90)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1121:2: ( (lv_params_7_0= ruleQtParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleQtParameter ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1121:2: ( (lv_params_7_0= ruleQtParameter ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1122:1: (lv_params_7_0= ruleQtParameter )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1122:1: (lv_params_7_0= ruleQtParameter )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1123:3: lv_params_7_0= ruleQtParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtFunctionAccess().getParamsQtParameterParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQtParameter_in_ruleQtFunction2222);
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1139:2: (otherlv_8= ',' ( (lv_params_9_0= ruleQtParameter ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==17) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1139:4: otherlv_8= ',' ( (lv_params_9_0= ruleQtParameter ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleQtFunction2235); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getQtFunctionAccess().getCommaKeyword_7_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1143:1: ( (lv_params_9_0= ruleQtParameter ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1144:1: (lv_params_9_0= ruleQtParameter )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1144:1: (lv_params_9_0= ruleQtParameter )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1145:3: lv_params_9_0= ruleQtParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getQtFunctionAccess().getParamsQtParameterParserRuleCall_7_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQtParameter_in_ruleQtFunction2256);
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
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,31,FOLLOW_31_in_ruleQtFunction2272); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getQtFunctionAccess().getRightParenthesisKeyword_8());
                  
            }
            otherlv_11=(Token)match(input,25,FOLLOW_25_in_ruleQtFunction2284); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getQtFunctionAccess().getColonKeyword_9());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1169:1: ( (lv_returnValue_12_0= ruleQtReturnValue ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1170:1: (lv_returnValue_12_0= ruleQtReturnValue )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1170:1: (lv_returnValue_12_0= ruleQtReturnValue )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1171:3: lv_returnValue_12_0= ruleQtReturnValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtFunctionAccess().getReturnValueQtReturnValueParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQtReturnValue_in_ruleQtFunction2305);
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

            otherlv_13=(Token)match(input,22,FOLLOW_22_in_ruleQtFunction2317); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1199:1: entryRuleQtValue returns [EObject current=null] : iv_ruleQtValue= ruleQtValue EOF ;
    public final EObject entryRuleQtValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtValue = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1200:2: (iv_ruleQtValue= ruleQtValue EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1201:2: iv_ruleQtValue= ruleQtValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtValueRule()); 
            }
            pushFollow(FOLLOW_ruleQtValue_in_entryRuleQtValue2353);
            iv_ruleQtValue=ruleQtValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtValue2363); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1208:1: ruleQtValue returns [EObject current=null] : ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleQtValue() throws RecognitionException {
        EObject current = null;

        Token lv_const_0_0=null;
        Token lv_name_3_0=null;
        Enumerator lv_valueType_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1211:28: ( ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1212:1: ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1212:1: ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1212:2: ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1212:2: ( (lv_const_0_0= 'const' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1213:1: (lv_const_0_0= 'const' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1213:1: (lv_const_0_0= 'const' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1214:3: lv_const_0_0= 'const'
                    {
                    lv_const_0_0=(Token)match(input,29,FOLLOW_29_in_ruleQtValue2406); if (state.failed) return current;
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1227:3: ( (lv_valueType_1_0= ruleType ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=89 && LA18_0<=90)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1228:1: (lv_valueType_1_0= ruleType )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1228:1: (lv_valueType_1_0= ruleType )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1229:3: lv_valueType_1_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtValueAccess().getValueTypeTypeEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleQtValue2441);
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1245:3: ( ( ruleQualifiedName ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1246:1: ( ruleQualifiedName )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1246:1: ( ruleQualifiedName )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1247:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getQtValueRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtValueAccess().getTypeQtTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQtValue2465);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1260:2: ( (lv_name_3_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1261:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1261:1: (lv_name_3_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1262:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtValue2482); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1286:1: entryRuleQtParameter returns [EObject current=null] : iv_ruleQtParameter= ruleQtParameter EOF ;
    public final EObject entryRuleQtParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtParameter = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1287:2: (iv_ruleQtParameter= ruleQtParameter EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1288:2: iv_ruleQtParameter= ruleQtParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtParameterRule()); 
            }
            pushFollow(FOLLOW_ruleQtParameter_in_entryRuleQtParameter2523);
            iv_ruleQtParameter=ruleQtParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtParameter2533); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1295:1: ruleQtParameter returns [EObject current=null] : ( ( (lv_value_0_0= ruleQtValue ) ) (otherlv_1= '=' ( ( (lv_defaultInt_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )? ) ;
    public final EObject ruleQtParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_defaultInt_2_0=null;
        Token otherlv_3=null;
        EObject lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1298:28: ( ( ( (lv_value_0_0= ruleQtValue ) ) (otherlv_1= '=' ( ( (lv_defaultInt_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )? ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1299:1: ( ( (lv_value_0_0= ruleQtValue ) ) (otherlv_1= '=' ( ( (lv_defaultInt_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )? )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1299:1: ( ( (lv_value_0_0= ruleQtValue ) ) (otherlv_1= '=' ( ( (lv_defaultInt_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )? )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1299:2: ( (lv_value_0_0= ruleQtValue ) ) (otherlv_1= '=' ( ( (lv_defaultInt_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )?
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1299:2: ( (lv_value_0_0= ruleQtValue ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1300:1: (lv_value_0_0= ruleQtValue )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1300:1: (lv_value_0_0= ruleQtValue )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1301:3: lv_value_0_0= ruleQtValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtParameterAccess().getValueQtValueParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQtValue_in_ruleQtParameter2579);
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1317:2: (otherlv_1= '=' ( ( (lv_defaultInt_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1317:4: otherlv_1= '=' ( ( (lv_defaultInt_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleQtParameter2592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getQtParameterAccess().getEqualsSignKeyword_1_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1321:1: ( ( (lv_defaultInt_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_INT) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==RULE_ID) ) {
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
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1321:2: ( (lv_defaultInt_2_0= RULE_INT ) )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1321:2: ( (lv_defaultInt_2_0= RULE_INT ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1322:1: (lv_defaultInt_2_0= RULE_INT )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1322:1: (lv_defaultInt_2_0= RULE_INT )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1323:3: lv_defaultInt_2_0= RULE_INT
                            {
                            lv_defaultInt_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQtParameter2610); if (state.failed) return current;
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
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1340:6: ( (otherlv_3= RULE_ID ) )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1340:6: ( (otherlv_3= RULE_ID ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1341:1: (otherlv_3= RULE_ID )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1341:1: (otherlv_3= RULE_ID )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1342:3: otherlv_3= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getQtParameterRule());
                              	        }
                                      
                            }
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtParameter2641); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1361:1: entryRuleQtReturnValue returns [EObject current=null] : iv_ruleQtReturnValue= ruleQtReturnValue EOF ;
    public final EObject entryRuleQtReturnValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtReturnValue = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1362:2: (iv_ruleQtReturnValue= ruleQtReturnValue EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1363:2: iv_ruleQtReturnValue= ruleQtReturnValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtReturnValueRule()); 
            }
            pushFollow(FOLLOW_ruleQtReturnValue_in_entryRuleQtReturnValue2680);
            iv_ruleQtReturnValue=ruleQtReturnValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtReturnValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtReturnValue2690); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1370:1: ruleQtReturnValue returns [EObject current=null] : ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleQtReturnValue() throws RecognitionException {
        EObject current = null;

        Token lv_const_0_0=null;
        Enumerator lv_valueType_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1373:28: ( ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( ( ruleQualifiedName ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1374:1: ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( ( ruleQualifiedName ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1374:1: ( ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( ( ruleQualifiedName ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1374:2: ( (lv_const_0_0= 'const' ) )? ( (lv_valueType_1_0= ruleType ) )? ( ( ruleQualifiedName ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1374:2: ( (lv_const_0_0= 'const' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1375:1: (lv_const_0_0= 'const' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1375:1: (lv_const_0_0= 'const' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1376:3: lv_const_0_0= 'const'
                    {
                    lv_const_0_0=(Token)match(input,29,FOLLOW_29_in_ruleQtReturnValue2733); if (state.failed) return current;
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1389:3: ( (lv_valueType_1_0= ruleType ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=89 && LA22_0<=90)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1390:1: (lv_valueType_1_0= ruleType )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1390:1: (lv_valueType_1_0= ruleType )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1391:3: lv_valueType_1_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtReturnValueAccess().getValueTypeTypeEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleQtReturnValue2768);
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1407:3: ( ( ruleQualifiedName ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1408:1: ( ruleQualifiedName )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1408:1: ( ruleQualifiedName )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1409:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getQtReturnValueRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtReturnValueAccess().getTypeQtTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQtReturnValue2792);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1430:1: entryRuleQtSignal returns [EObject current=null] : iv_ruleQtSignal= ruleQtSignal EOF ;
    public final EObject entryRuleQtSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtSignal = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1431:2: (iv_ruleQtSignal= ruleQtSignal EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1432:2: iv_ruleQtSignal= ruleQtSignal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtSignalRule()); 
            }
            pushFollow(FOLLOW_ruleQtSignal_in_entryRuleQtSignal2828);
            iv_ruleQtSignal=ruleQtSignal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtSignal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtSignal2838); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1439:1: ruleQtSignal returns [EObject current=null] : (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1442:28: ( (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1443:1: (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1443:1: (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1443:3: otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleQtSignal2875); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtSignalAccess().getSignalKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1447:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1448:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1448:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1449:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtSignal2892); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleQtSignal2909); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQtSignalAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1469:1: ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||LA24_0==29||(LA24_0>=89 && LA24_0<=90)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1469:2: ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1469:2: ( (lv_params_3_0= ruleQtParameter ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1470:1: (lv_params_3_0= ruleQtParameter )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1470:1: (lv_params_3_0= ruleQtParameter )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1471:3: lv_params_3_0= ruleQtParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtSignalAccess().getParamsQtParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQtParameter_in_ruleQtSignal2931);
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1487:2: (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==17) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1487:4: otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleQtSignal2944); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getQtSignalAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1491:1: ( (lv_params_5_0= ruleQtParameter ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1492:1: (lv_params_5_0= ruleQtParameter )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1492:1: (lv_params_5_0= ruleQtParameter )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1493:3: lv_params_5_0= ruleQtParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getQtSignalAccess().getParamsQtParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQtParameter_in_ruleQtSignal2965);
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
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleQtSignal2981); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getQtSignalAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleQtSignal2993); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getQtSignalAccess().getColonKeyword_5());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1517:1: ( (lv_returnValue_8_0= ruleQtReturnValue ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1518:1: (lv_returnValue_8_0= ruleQtReturnValue )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1518:1: (lv_returnValue_8_0= ruleQtReturnValue )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1519:3: lv_returnValue_8_0= ruleQtReturnValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtSignalAccess().getReturnValueQtReturnValueParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQtReturnValue_in_ruleQtSignal3014);
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

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleQtSignal3026); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1547:1: entryRuleQtSlot returns [EObject current=null] : iv_ruleQtSlot= ruleQtSlot EOF ;
    public final EObject entryRuleQtSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQtSlot = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1548:2: (iv_ruleQtSlot= ruleQtSlot EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1549:2: iv_ruleQtSlot= ruleQtSlot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQtSlotRule()); 
            }
            pushFollow(FOLLOW_ruleQtSlot_in_entryRuleQtSlot3062);
            iv_ruleQtSlot=ruleQtSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQtSlot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQtSlot3072); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1556:1: ruleQtSlot returns [EObject current=null] : (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1559:28: ( (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1560:1: (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1560:1: (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1560:3: otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnValue_8_0= ruleQtReturnValue ) ) otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleQtSlot3109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQtSlotAccess().getSlotKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1564:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1565:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1565:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1566:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQtSlot3126); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleQtSlot3143); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQtSlotAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1586:1: ( ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||LA26_0==29||(LA26_0>=89 && LA26_0<=90)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1586:2: ( (lv_params_3_0= ruleQtParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1586:2: ( (lv_params_3_0= ruleQtParameter ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1587:1: (lv_params_3_0= ruleQtParameter )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1587:1: (lv_params_3_0= ruleQtParameter )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1588:3: lv_params_3_0= ruleQtParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQtSlotAccess().getParamsQtParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQtParameter_in_ruleQtSlot3165);
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1604:2: (otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==17) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1604:4: otherlv_4= ',' ( (lv_params_5_0= ruleQtParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleQtSlot3178); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getQtSlotAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1608:1: ( (lv_params_5_0= ruleQtParameter ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1609:1: (lv_params_5_0= ruleQtParameter )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1609:1: (lv_params_5_0= ruleQtParameter )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1610:3: lv_params_5_0= ruleQtParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getQtSlotAccess().getParamsQtParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQtParameter_in_ruleQtSlot3199);
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
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleQtSlot3215); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getQtSlotAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleQtSlot3227); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getQtSlotAccess().getColonKeyword_5());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1634:1: ( (lv_returnValue_8_0= ruleQtReturnValue ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1635:1: (lv_returnValue_8_0= ruleQtReturnValue )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1635:1: (lv_returnValue_8_0= ruleQtReturnValue )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1636:3: lv_returnValue_8_0= ruleQtReturnValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQtSlotAccess().getReturnValueQtReturnValueParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQtReturnValue_in_ruleQtSlot3248);
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

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleQtSlot3260); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1664:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1665:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1666:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression3296);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression3306); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1673:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1676:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1678:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression3352);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1694:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1695:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1696:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment3386);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment3396); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1703:1: ruleXAssignment returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1706:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1707:1: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1707:1: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==EOF||LA28_1==RULE_ID||(LA28_1>=RULE_INT && LA28_1<=RULE_STRING)||(LA28_1>=13 && LA28_1<=14)||LA28_1==17||LA28_1==19||LA28_1==22||LA28_1==25||LA28_1==31||(LA28_1>=34 && LA28_1<=81)) ) {
                    alt28=2;
                }
                else if ( (LA28_1==26) ) {
                    alt28=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA28_0>=RULE_INT && LA28_0<=RULE_STRING)||LA28_0==13||LA28_0==19||LA28_0==43||(LA28_0>=46 && LA28_0<=47)||LA28_0==52||LA28_0==57||LA28_0==59||LA28_0==61||(LA28_0>=64 && LA28_0<=66)||LA28_0==69||(LA28_0>=71 && LA28_0<=78)) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1707:2: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1707:2: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1707:3: () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1707:3: ()
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1708:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1713:2: ( (otherlv_1= RULE_ID ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1714:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1714:1: (otherlv_1= RULE_ID )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1715:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXAssignment3451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment3467);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1734:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1735:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1735:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1736:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment3487);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1753:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1753:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1754:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment3517);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1762:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==34) ) {
                        int LA27_1 = input.LA(2);

                        if ( (synpred1_InternalQIdl()) ) {
                            alt27=1;
                        }
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1762:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1762:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1762:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1767:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1767:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1767:7: ()
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1768:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1773:2: ( ( ruleOpMultiAssign ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1774:1: ( ruleOpMultiAssign )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1774:1: ( ruleOpMultiAssign )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1775:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment3570);
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

                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1788:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1789:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1789:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1790:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment3593);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1814:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1815:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1816:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign3633);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign3644); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1823:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1826:28: (kw= '=' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1828:2: kw= '='
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpSingleAssign3681); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1841:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1842:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1843:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign3721);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign3732); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1850:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1853:28: (kw= '+=' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1855:2: kw= '+='
            {
            kw=(Token)match(input,34,FOLLOW_34_in_ruleOpMultiAssign3769); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1868:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1869:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1870:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression3808);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression3818); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1877:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1880:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1881:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1881:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1882:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression3865);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1890:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==35) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred2_InternalQIdl()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1890:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1890:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1890:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1895:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1895:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1895:7: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1896:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1901:2: ( ( ruleOpOr ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1902:1: ( ruleOpOr )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1902:1: ( ruleOpOr )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1903:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression3918);
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

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1916:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1917:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1917:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1918:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression3941);
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
            	    break loop29;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1942:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1943:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1944:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr3980);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr3991); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1951:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1954:28: (kw= '||' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1956:2: kw= '||'
            {
            kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOr4028); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1969:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1970:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1971:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression4067);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression4077); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1978:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1981:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1982:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1982:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1983:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression4124);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1991:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==36) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred3_InternalQIdl()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1991:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1991:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1991:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1996:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1996:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1996:7: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1997:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2002:2: ( ( ruleOpAnd ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2003:1: ( ruleOpAnd )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2003:1: ( ruleOpAnd )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2004:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression4177);
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

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2017:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2018:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2018:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2019:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression4200);
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
            	    break loop30;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2043:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2044:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2045:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd4239);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd4250); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2052:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2055:28: (kw= '&&' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2057:2: kw= '&&'
            {
            kw=(Token)match(input,36,FOLLOW_36_in_ruleOpAnd4287); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2070:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2071:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2072:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression4326);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression4336); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2079:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2082:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2083:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2083:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2084:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression4383);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2092:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==37) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred4_InternalQIdl()) ) {
                        alt31=1;
                    }


                }
                else if ( (LA31_0==38) ) {
                    int LA31_3 = input.LA(2);

                    if ( (synpred4_InternalQIdl()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2092:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2092:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2092:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2097:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2097:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2097:7: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2098:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2103:2: ( ( ruleOpEquality ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2104:1: ( ruleOpEquality )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2104:1: ( ruleOpEquality )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2105:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression4436);
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

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2118:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2119:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2119:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2120:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression4459);
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
            	    break loop31;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2144:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2145:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2146:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality4498);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality4509); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2153:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2156:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2157:1: (kw= '==' | kw= '!=' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2157:1: (kw= '==' | kw= '!=' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            else if ( (LA32_0==38) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2158:2: kw= '=='
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpEquality4547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2165:2: kw= '!='
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpEquality4566); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2178:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2179:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2180:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression4606);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression4616); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2187:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2190:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2191:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2191:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2192:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4663);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2200:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop33:
            do {
                int alt33=3;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    int LA33_2 = input.LA(2);

                    if ( (synpred5_InternalQIdl()) ) {
                        alt33=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA33_3 = input.LA(2);

                    if ( (synpred6_InternalQIdl()) ) {
                        alt33=2;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA33_4 = input.LA(2);

                    if ( (synpred6_InternalQIdl()) ) {
                        alt33=2;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA33_5 = input.LA(2);

                    if ( (synpred6_InternalQIdl()) ) {
                        alt33=2;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA33_6 = input.LA(2);

                    if ( (synpred6_InternalQIdl()) ) {
                        alt33=2;
                    }


                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2200:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2200:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2200:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2200:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2200:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2202:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2202:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2202:6: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2203:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXRelationalExpression4699); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2212:3: ( ( ruleQualifiedName ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2213:1: ( ruleQualifiedName )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2213:1: ( ruleQualifiedName )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2214:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression4724);
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
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2228:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2228:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2228:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2228:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2228:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2233:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2233:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2233:7: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2234:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2239:2: ( ( ruleOpCompare ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2240:1: ( ruleOpCompare )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2240:1: ( ruleOpCompare )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2241:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression4785);
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

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2254:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2255:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2255:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2256:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4808);
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
            	    break loop33;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2280:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2281:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2282:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare4848);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare4859); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2289:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2292:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2293:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2293:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt34=1;
                }
                break;
            case 41:
                {
                alt34=2;
                }
                break;
            case 42:
                {
                alt34=3;
                }
                break;
            case 43:
                {
                alt34=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2294:2: kw= '>='
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpCompare4897); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2301:2: kw= '<='
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpCompare4916); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2308:2: kw= '>'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpCompare4935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2315:2: kw= '<'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpCompare4954); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2328:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2329:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2330:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression4994);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression5004); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2337:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2340:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2341:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2341:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2342:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression5051);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2350:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==44) ) {
                    int LA35_2 = input.LA(2);

                    if ( (synpred7_InternalQIdl()) ) {
                        alt35=1;
                    }


                }
                else if ( (LA35_0==45) ) {
                    int LA35_3 = input.LA(2);

                    if ( (synpred7_InternalQIdl()) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2350:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2350:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2350:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2355:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2355:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2355:7: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2356:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2361:2: ( ( ruleOpOther ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2362:1: ( ruleOpOther )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2362:1: ( ruleOpOther )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2363:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression5104);
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

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2376:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2377:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2377:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2378:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression5127);
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2402:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2403:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2404:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther5166);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther5177); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2411:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2414:28: ( (kw= '->' | kw= '..' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2415:1: (kw= '->' | kw= '..' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2415:1: (kw= '->' | kw= '..' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==44) ) {
                alt36=1;
            }
            else if ( (LA36_0==45) ) {
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2416:2: kw= '->'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpOther5215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2423:2: kw= '..'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpOther5234); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2436:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2437:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2438:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression5274);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression5284); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2445:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2448:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2449:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2449:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2450:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5331);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2458:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==46) ) {
                    int LA37_2 = input.LA(2);

                    if ( (synpred8_InternalQIdl()) ) {
                        alt37=1;
                    }


                }
                else if ( (LA37_0==47) ) {
                    int LA37_3 = input.LA(2);

                    if ( (synpred8_InternalQIdl()) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2458:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2458:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2458:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2463:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2463:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2463:7: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2464:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2469:2: ( ( ruleOpAdd ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2470:1: ( ruleOpAdd )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2470:1: ( ruleOpAdd )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2471:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression5384);
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

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2484:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2485:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2485:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2486:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5407);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2510:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2511:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2512:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd5446);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd5457); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2519:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2522:28: ( (kw= '+' | kw= '-' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2523:1: (kw= '+' | kw= '-' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2523:1: (kw= '+' | kw= '-' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==46) ) {
                alt38=1;
            }
            else if ( (LA38_0==47) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2524:2: kw= '+'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpAdd5495); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2531:2: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpAdd5514); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2544:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2545:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2546:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression5554);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression5564); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2553:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2556:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2557:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2557:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2558:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5611);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2566:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop39:
            do {
                int alt39=2;
                switch ( input.LA(1) ) {
                case 48:
                    {
                    int LA39_2 = input.LA(2);

                    if ( (synpred9_InternalQIdl()) ) {
                        alt39=1;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA39_3 = input.LA(2);

                    if ( (synpred9_InternalQIdl()) ) {
                        alt39=1;
                    }


                    }
                    break;
                case 50:
                    {
                    int LA39_4 = input.LA(2);

                    if ( (synpred9_InternalQIdl()) ) {
                        alt39=1;
                    }


                    }
                    break;
                case 51:
                    {
                    int LA39_5 = input.LA(2);

                    if ( (synpred9_InternalQIdl()) ) {
                        alt39=1;
                    }


                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2566:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2566:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2566:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2571:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2571:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2571:7: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2572:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2577:2: ( ( ruleOpMulti ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2578:1: ( ruleOpMulti )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2578:1: ( ruleOpMulti )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2579:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression5664);
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

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2592:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2593:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2593:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2594:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5687);
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2618:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2619:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2620:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti5726);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti5737); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2627:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2630:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2631:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2631:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt40=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt40=1;
                }
                break;
            case 49:
                {
                alt40=2;
                }
                break;
            case 50:
                {
                alt40=3;
                }
                break;
            case 51:
                {
                alt40=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2632:2: kw= '*'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOpMulti5775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2639:2: kw= '**'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleOpMulti5794); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2646:2: kw= '/'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleOpMulti5813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2653:2: kw= '%'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleOpMulti5832); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2666:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2667:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2668:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation5872);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation5882); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2675:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2678:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2679:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2679:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=46 && LA41_0<=47)||LA41_0==52) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_ID||(LA41_0>=RULE_INT && LA41_0<=RULE_STRING)||LA41_0==13||LA41_0==19||LA41_0==43||LA41_0==57||LA41_0==59||LA41_0==61||(LA41_0>=64 && LA41_0<=66)||LA41_0==69||(LA41_0>=71 && LA41_0<=78)) ) {
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2679:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2679:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2679:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2679:3: ()
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2680:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2685:2: ( ( ruleOpUnary ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2686:1: ( ruleOpUnary )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2686:1: ( ruleOpUnary )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2687:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation5940);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2700:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2701:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2701:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2702:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5961);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2720:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5990);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2736:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2737:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2738:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary6026);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary6037); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2745:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2748:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2749:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2749:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt42=1;
                }
                break;
            case 47:
                {
                alt42=2;
                }
                break;
            case 46:
                {
                alt42=3;
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2750:2: kw= '!'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleOpUnary6075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2757:2: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpUnary6094); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2764:2: kw= '+'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpUnary6113); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2777:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2778:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2779:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression6153);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression6163); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2786:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2789:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2790:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2790:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2791:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression6210);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2799:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==53) ) {
                    int LA43_2 = input.LA(2);

                    if ( (synpred10_InternalQIdl()) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2799:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2799:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2799:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2801:5: ( () otherlv_2= 'as' )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2801:6: () otherlv_2= 'as'
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2801:6: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2802:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleXCastedExpression6245); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2811:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2812:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2812:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2813:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression6268);
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2837:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2838:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2839:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall6306);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall6316); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2846:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2849:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2850:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2850:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2851:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall6363);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2859:1: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            loop50:
            do {
                int alt50=3;
                switch ( input.LA(1) ) {
                case 54:
                    {
                    int LA50_2 = input.LA(2);

                    if ( (synpred11_InternalQIdl()) ) {
                        alt50=1;
                    }
                    else if ( (synpred12_InternalQIdl()) ) {
                        alt50=2;
                    }


                    }
                    break;
                case 55:
                    {
                    int LA50_3 = input.LA(2);

                    if ( (synpred12_InternalQIdl()) ) {
                        alt50=2;
                    }


                    }
                    break;
                case 56:
                    {
                    int LA50_4 = input.LA(2);

                    if ( (synpred12_InternalQIdl()) ) {
                        alt50=2;
                    }


                    }
                    break;

                }

                switch (alt50) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2859:2: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2859:2: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2859:3: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2859:3: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2859:4: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2866:25: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2866:26: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2866:26: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2867:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleXMemberFeatureCall6412); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2876:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2877:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2877:1: (otherlv_3= RULE_ID )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2878:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXMemberFeatureCall6432); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall6448);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2897:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2898:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2898:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2899:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall6470);
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
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2916:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2916:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2916:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2916:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2916:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2932:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2932:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2932:8: ()
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2933:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2938:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt44=3;
            	    switch ( input.LA(1) ) {
            	    case 54:
            	        {
            	        alt44=1;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt44=2;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt44=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt44) {
            	        case 1 :
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2938:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,54,FOLLOW_54_in_ruleXMemberFeatureCall6556); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2943:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2943:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2944:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2944:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2945:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,55,FOLLOW_55_in_ruleXMemberFeatureCall6580); if (state.failed) return current;
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
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2959:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2959:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2960:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2960:1: (lv_spreading_9_0= '*.' )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2961:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,56,FOLLOW_56_in_ruleXMemberFeatureCall6617); if (state.failed) return current;
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

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2974:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==43) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2974:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall6646); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2978:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2979:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2979:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2980:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6667);
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

            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2996:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop45:
            	            do {
            	                int alt45=2;
            	                int LA45_0 = input.LA(1);

            	                if ( (LA45_0==17) ) {
            	                    alt45=1;
            	                }


            	                switch (alt45) {
            	            	case 1 :
            	            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2996:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleXMemberFeatureCall6680); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3000:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3001:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3001:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3002:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6701);
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
            	            	    break loop45;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall6715); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3022:3: ( (otherlv_15= RULE_ID ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3023:1: (otherlv_15= RULE_ID )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3023:1: (otherlv_15= RULE_ID )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3024:3: otherlv_15= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXMemberFeatureCall6737); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_15, grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3035:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt49=2;
            	    alt49 = dfa49.predict(input);
            	    switch (alt49) {
            	        case 1 :
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3035:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3035:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3035:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3042:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3043:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,19,FOLLOW_19_in_ruleXMemberFeatureCall6771); if (state.failed) return current;
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

            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3056:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt48=3;
            	            alt48 = dfa48.predict(input);
            	            switch (alt48) {
            	                case 1 :
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3056:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3056:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3056:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3068:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3069:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall6846);
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
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3086:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3086:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3086:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3086:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3087:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3087:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3088:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6874);
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

            	                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3104:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop47:
            	                    do {
            	                        int alt47=2;
            	                        int LA47_0 = input.LA(1);

            	                        if ( (LA47_0==17) ) {
            	                            alt47=1;
            	                        }


            	                        switch (alt47) {
            	                    	case 1 :
            	                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3104:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,17,FOLLOW_17_in_ruleXMemberFeatureCall6887); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3108:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3109:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3109:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3110:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6908);
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
            	                    	    break loop47;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,31,FOLLOW_31_in_ruleXMemberFeatureCall6925); if (state.failed) return current;
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
            	    break loop50;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3138:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3139:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3140:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression6966);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression6976); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3147:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3150:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3151:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3151:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt51=13;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt51=1;
                }
                break;
            case 13:
                {
                alt51=2;
                }
                break;
            case 61:
                {
                alt51=3;
                }
                break;
            case RULE_ID:
            case 43:
            case 69:
                {
                alt51=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 57:
            case 72:
            case 73:
            case 74:
            case 75:
                {
                alt51=5;
                }
                break;
            case 59:
                {
                alt51=6;
                }
                break;
            case 64:
                {
                alt51=7;
                }
                break;
            case 65:
                {
                alt51=8;
                }
                break;
            case 66:
                {
                alt51=9;
                }
                break;
            case 76:
                {
                alt51=10;
                }
                break;
            case 77:
                {
                alt51=11;
                }
                break;
            case 78:
                {
                alt51=12;
                }
                break;
            case 19:
                {
                alt51=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3152:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression7023);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3162:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression7050);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3172:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression7077);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3182:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression7104);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3192:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression7131);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3202:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression7158);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3212:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression7185);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3222:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression7212);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3232:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression7239);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3242:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression7266);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3252:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression7293);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3262:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression7320);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3272:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression7347);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3288:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3289:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3290:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral7382);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral7392); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3297:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3300:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3301:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3301:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt52=6;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt52=1;
                }
                break;
            case 72:
            case 73:
                {
                alt52=2;
                }
                break;
            case RULE_INT:
                {
                alt52=3;
                }
                break;
            case 74:
                {
                alt52=4;
                }
                break;
            case RULE_STRING:
                {
                alt52=5;
                }
                break;
            case 75:
                {
                alt52=6;
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3302:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral7439);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3312:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral7466);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3322:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral7493);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3332:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral7520);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3342:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral7547);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3352:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral7574);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3368:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3369:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3370:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure7609);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure7619); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3377:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3380:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3381:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3381:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3381:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3381:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3382:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXClosure7665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3391:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID||LA54_0==19||LA54_0==81) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3391:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3391:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3392:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3392:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3393:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7687);
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3409:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==17) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3409:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleXClosure7700); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3413:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3414:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3414:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3415:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7721);
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
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleXClosure7737); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3435:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3436:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3436:1: (lv_expression_6_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3437:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure7758);
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

            otherlv_7=(Token)match(input,58,FOLLOW_58_in_ruleXClosure7770); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3465:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3466:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3467:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure7806);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure7816); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3474:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3477:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3478:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3478:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3478:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3478:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3478:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3489:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3489:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3489:6: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3490:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3495:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID||LA56_0==19||LA56_0==81) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3495:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3495:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3496:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3496:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3497:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7914);
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3513:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==17) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3513:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleXShortClosure7927); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3517:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3518:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3518:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3519:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7948);
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
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleXShortClosure7964); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3539:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3540:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3540:1: (lv_expression_5_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3541:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure7987);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3565:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3566:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3567:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression8023);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression8033); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3574:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3577:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3578:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3578:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3578:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleXParenthesizedExpression8070); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression8092);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleXParenthesizedExpression8103); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3603:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3604:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3605:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression8139);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression8149); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3612:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3615:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3616:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3616:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3616:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3616:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3617:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXIfExpression8195); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXIfExpression8207); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3630:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3631:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3631:1: (lv_if_3_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3632:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression8228);
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

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleXIfExpression8240); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3652:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3653:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3653:1: (lv_then_5_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3654:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression8261);
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3670:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==60) ) {
                int LA57_1 = input.LA(2);

                if ( (synpred16_InternalQIdl()) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3670:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3670:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3670:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,60,FOLLOW_60_in_ruleXIfExpression8282); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3675:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3676:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3676:1: (lv_else_7_0= ruleXExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3677:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression8304);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3701:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3702:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3703:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression8342);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression8352); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3710:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3713:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3714:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3714:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3714:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3714:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3715:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXSwitchExpression8398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3724:1: ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==25) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3724:2: ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':'
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3724:2: ( (lv_localVarName_2_0= RULE_ID ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3725:1: (lv_localVarName_2_0= RULE_ID )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3725:1: (lv_localVarName_2_0= RULE_ID )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3726:3: lv_localVarName_2_0= RULE_ID
                    {
                    lv_localVarName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXSwitchExpression8416); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleXSwitchExpression8433); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3746:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3747:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3747:1: (lv_switch_4_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3748:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression8456);
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

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleXSwitchExpression8468); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3768:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_ID||LA59_0==19||LA59_0==25||LA59_0==63||LA59_0==81) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3769:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3769:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3770:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression8489);
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
            	    if ( cnt59 >= 1 ) break loop59;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
            } while (true);

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3786:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==62) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3786:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,62,FOLLOW_62_in_ruleXSwitchExpression8503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleXSwitchExpression8515); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3794:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3795:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3795:1: (lv_default_9_0= ruleXExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3796:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression8536);
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

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleXSwitchExpression8550); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3824:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3825:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3826:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart8586);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart8596); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3833:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3836:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3837:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3837:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3837:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3837:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID||LA61_0==19||LA61_0==81) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3838:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3838:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3839:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart8642);
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3855:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==63) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3855:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXCasePart8656); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3859:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3860:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3860:1: (lv_case_2_0= ruleXExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3861:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart8677);
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

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleXCasePart8691); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3881:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3882:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3882:1: (lv_then_4_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3883:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart8712);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3907:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3908:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3909:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression8748);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression8758); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3916:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3919:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3920:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3920:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3920:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3920:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3921:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXForLoopExpression8804); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXForLoopExpression8816); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3934:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3935:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3935:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3936:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression8837);
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleXForLoopExpression8849); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3956:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3957:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3957:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3958:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression8870);
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

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleXForLoopExpression8882); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3978:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3979:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3979:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3980:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression8903);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4004:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4005:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4006:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression8939);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression8949); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4013:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4016:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4017:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4017:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4017:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4017:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4018:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXWhileExpression8995); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXWhileExpression9007); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4031:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4032:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4032:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4033:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression9028);
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

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleXWhileExpression9040); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4053:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4054:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4054:1: (lv_body_5_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4055:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression9061);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4079:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4080:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4081:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression9097);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression9107); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4088:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4091:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4092:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4092:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4092:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4092:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4093:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXDoWhileExpression9153); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4102:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4103:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4103:1: (lv_body_2_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4104:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression9174);
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

            otherlv_3=(Token)match(input,65,FOLLOW_65_in_ruleXDoWhileExpression9186); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleXDoWhileExpression9198); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4128:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4129:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4129:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4130:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression9219);
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

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleXDoWhileExpression9231); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4158:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4159:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4160:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression9267);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression9277); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4167:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4170:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4171:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4171:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4171:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4171:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4172:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleXBlockExpression9323); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4181:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_ID||(LA64_0>=RULE_INT && LA64_0<=RULE_STRING)||LA64_0==13||LA64_0==19||LA64_0==43||(LA64_0>=46 && LA64_0<=47)||LA64_0==52||LA64_0==57||LA64_0==59||LA64_0==61||(LA64_0>=64 && LA64_0<=69)||(LA64_0>=71 && LA64_0<=78)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4181:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4181:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4182:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4182:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4183:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression9345);
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

            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4199:2: (otherlv_3= ';' )?
            	    int alt63=2;
            	    int LA63_0 = input.LA(1);

            	    if ( (LA63_0==22) ) {
            	        alt63=1;
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4199:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleXBlockExpression9358); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleXBlockExpression9374); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4215:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4216:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4217:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock9410);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock9420); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4224:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4227:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4228:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4228:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=67 && LA65_0<=68)) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_ID||(LA65_0>=RULE_INT && LA65_0<=RULE_STRING)||LA65_0==13||LA65_0==19||LA65_0==43||(LA65_0>=46 && LA65_0<=47)||LA65_0==52||LA65_0==57||LA65_0==59||LA65_0==61||(LA65_0>=64 && LA65_0<=66)||LA65_0==69||(LA65_0>=71 && LA65_0<=78)) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4229:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock9467);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4239:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock9494);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4255:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4256:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4257:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration9529);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration9539); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4264:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4267:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4268:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4268:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4268:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4268:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4269:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4274:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==67) ) {
                alt66=1;
            }
            else if ( (LA66_0==68) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4274:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4274:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4275:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4275:1: (lv_writeable_1_0= 'var' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4276:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,67,FOLLOW_67_in_ruleXVariableDeclaration9592); if (state.failed) return current;
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4290:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleXVariableDeclaration9623); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4294:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                int LA67_1 = input.LA(2);

                if ( (synpred17_InternalQIdl()) ) {
                    alt67=1;
                }
                else if ( (true) ) {
                    alt67=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA67_0==19) && (synpred17_InternalQIdl())) {
                alt67=1;
            }
            else if ( (LA67_0==81) && (synpred17_InternalQIdl())) {
                alt67=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4294:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4294:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4294:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4303:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4303:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4303:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4304:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4304:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4305:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration9672);
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4321:2: ( (lv_name_4_0= RULE_ID ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4322:1: (lv_name_4_0= RULE_ID )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4322:1: (lv_name_4_0= RULE_ID )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4323:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXVariableDeclaration9689); if (state.failed) return current;
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4340:6: ( (lv_name_5_0= RULE_ID ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4340:6: ( (lv_name_5_0= RULE_ID ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4341:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4341:1: (lv_name_5_0= RULE_ID )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4342:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXVariableDeclaration9719); if (state.failed) return current;
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4358:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==26) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4358:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleXVariableDeclaration9738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4362:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4363:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4363:1: (lv_right_7_0= ruleXExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4364:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration9759);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4388:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4389:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4390:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter9797);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter9807); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4397:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_parameterType_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4400:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4401:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4401:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4401:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4401:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID) ) {
                int LA69_1 = input.LA(2);

                if ( (LA69_1==RULE_ID||LA69_1==43||LA69_1==54) ) {
                    alt69=1;
                }
            }
            else if ( (LA69_0==19||LA69_0==81) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4402:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4402:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4403:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter9853);
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4419:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4420:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4420:1: (lv_name_1_0= RULE_ID )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4421:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJvmFormalParameter9871); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4445:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4446:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4447:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall9912);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall9922); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4454:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4457:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4458:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4458:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4458:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4458:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4459:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4464:2: ( ( ruleStaticQualifier ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ID) ) {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==70) ) {
                    alt70=1;
                }
            }
            switch (alt70) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4465:1: ( ruleStaticQualifier )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4465:1: ( ruleStaticQualifier )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4466:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall9979);
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4479:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==43) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4479:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall9993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4483:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4484:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4484:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4485:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall10014);
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4501:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==17) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4501:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleXFeatureCall10027); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4505:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4506:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4506:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4507:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall10048);
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
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,42,FOLLOW_42_in_ruleXFeatureCall10062); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4527:3: ( ( ruleIdOrSuper ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4528:1: ( ruleIdOrSuper )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4528:1: ( ruleIdOrSuper )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4529:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall10087);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4542:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt75=2;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4542:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4542:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4542:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4549:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4550:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,19,FOLLOW_19_in_ruleXFeatureCall10121); if (state.failed) return current;
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4563:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt74=3;
                    alt74 = dfa74.predict(input);
                    switch (alt74) {
                        case 1 :
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4563:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4563:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4563:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4575:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4576:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall10196);
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
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4593:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4593:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4593:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4593:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4594:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4594:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4595:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall10224);
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

                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4611:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop73:
                            do {
                                int alt73=2;
                                int LA73_0 = input.LA(1);

                                if ( (LA73_0==17) ) {
                                    alt73=1;
                                }


                                switch (alt73) {
                            	case 1 :
                            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4611:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleXFeatureCall10237); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4615:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4616:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4616:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4617:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall10258);
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
                            	    break loop73;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,31,FOLLOW_31_in_ruleXFeatureCall10275); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4645:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4646:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4647:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper10314);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper10325); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4654:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4657:28: ( (this_ID_0= RULE_ID | kw= 'super' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4658:1: (this_ID_0= RULE_ID | kw= 'super' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4658:1: (this_ID_0= RULE_ID | kw= 'super' )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID) ) {
                alt76=1;
            }
            else if ( (LA76_0==69) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4658:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdOrSuper10365); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getIdOrSuperAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4667:2: kw= 'super'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleIdOrSuper10389); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4680:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4681:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4682:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier10430);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier10441); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4689:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4692:28: ( (this_ID_0= RULE_ID kw= '::' )+ )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4693:1: (this_ID_0= RULE_ID kw= '::' )+
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4693:1: (this_ID_0= RULE_ID kw= '::' )+
            int cnt77=0;
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==RULE_ID) ) {
                    int LA77_2 = input.LA(2);

                    if ( (LA77_2==70) ) {
                        alt77=1;
                    }


                }


                switch (alt77) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4693:6: this_ID_0= RULE_ID kw= '::'
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStaticQualifier10481); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_0, grammarAccess.getStaticQualifierAccess().getIDTerminalRuleCall_0()); 
            	          
            	    }
            	    kw=(Token)match(input,70,FOLLOW_70_in_ruleStaticQualifier10499); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt77 >= 1 ) break loop77;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(77, input);
                        throw eee;
                }
                cnt77++;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4714:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4715:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4716:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall10540);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall10550); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4723:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4726:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4727:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4727:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4727:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4727:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4728:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXConstructorCall10596); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4737:1: ( ( ruleQualifiedName ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4738:1: ( ruleQualifiedName )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4738:1: ( ruleQualifiedName )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4739:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall10619);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4752:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==43) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4752:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall10632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4756:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4757:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4757:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4758:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10653);
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4774:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==17) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4774:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleXConstructorCall10666); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4778:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4779:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4779:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4780:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10687);
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
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,42,FOLLOW_42_in_ruleXConstructorCall10701); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleXConstructorCall10715); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4804:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt81=3;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4804:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4804:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4804:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4816:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4817:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall10777);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4834:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4834:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4834:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4834:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4835:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4835:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4836:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall10805);
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4852:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==17) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4852:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleXConstructorCall10818); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4856:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4857:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4857:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4858:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall10839);
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
                    	    break loop80;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,31,FOLLOW_31_in_ruleXConstructorCall10856); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4886:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4887:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4888:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10892);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral10902); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4895:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4898:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4899:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4899:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4899:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4899:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4900:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4905:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==72) ) {
                alt82=1;
            }
            else if ( (LA82_0==73) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4905:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXBooleanLiteral10949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4910:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4910:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4911:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4911:1: (lv_isTrue_2_0= 'true' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4912:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,73,FOLLOW_73_in_ruleXBooleanLiteral10973); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4933:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4934:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4935:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral11023);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral11033); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4942:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4945:28: ( ( () otherlv_1= 'null' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4946:1: ( () otherlv_1= 'null' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4946:1: ( () otherlv_1= 'null' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4946:2: () otherlv_1= 'null'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4946:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4947:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXNullLiteral11079); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4964:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4965:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4966:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral11115);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral11125); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4973:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4976:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4977:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4977:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4977:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4977:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4978:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4983:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4984:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4984:1: (lv_value_1_0= RULE_INT )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4985:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral11176); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5009:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5010:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5011:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral11217);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral11227); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5018:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5021:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5022:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5022:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5022:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5022:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5023:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5028:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5029:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5029:1: (lv_value_1_0= RULE_STRING )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5030:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral11278); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5054:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5055:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5056:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral11319);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral11329); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5063:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5066:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5067:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5067:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5067:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5067:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5068:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXTypeLiteral11375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXTypeLiteral11387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5081:1: ( ( ruleQualifiedName ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5082:1: ( ruleQualifiedName )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5082:1: ( ruleQualifiedName )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5083:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral11410);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleXTypeLiteral11422); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5108:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5109:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5110:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression11458);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression11468); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5117:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5120:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5121:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5121:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5121:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5121:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5122:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleXThrowExpression11514); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5131:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5132:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5132:1: (lv_expression_2_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5133:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression11535);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5157:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5158:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5159:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression11571);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression11581); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5166:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5169:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5170:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5170:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5170:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5170:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5171:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleXReturnExpression11627); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5180:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt83=2;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5180:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5185:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5186:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression11658);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5210:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5211:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5212:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression11695);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression11705); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5219:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5222:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5223:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5223:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5223:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5223:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5224:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleXTryCatchFinallyExpression11751); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5233:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5234:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5234:1: (lv_expression_2_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5235:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11772);
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

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5251:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==80) ) {
                alt86=1;
            }
            else if ( (LA86_0==79) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5251:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5251:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5251:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5251:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt84=0;
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==80) ) {
                            int LA84_2 = input.LA(2);

                            if ( (synpred22_InternalQIdl()) ) {
                                alt84=1;
                            }


                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5251:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5253:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5254:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11802);
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
                    	    if ( cnt84 >= 1 ) break loop84;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(84, input);
                                throw eee;
                        }
                        cnt84++;
                    } while (true);

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5270:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==79) ) {
                        int LA85_1 = input.LA(2);

                        if ( (synpred23_InternalQIdl()) ) {
                            alt85=1;
                        }
                    }
                    switch (alt85) {
                        case 1 :
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5270:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5270:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5270:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,79,FOLLOW_79_in_ruleXTryCatchFinallyExpression11824); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5275:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5276:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5276:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5277:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11846);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5294:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5294:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5294:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,79,FOLLOW_79_in_ruleXTryCatchFinallyExpression11868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5298:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5299:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5299:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5300:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11889);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5324:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5325:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5326:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11927);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause11937); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5333:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5336:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5337:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5337:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5337:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5337:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5337:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleXCatchClause11982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleXCatchClause11995); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5346:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5347:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5347:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5348:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause12016);
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

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleXCatchClause12028); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5368:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5369:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5369:1: (lv_expression_4_0= ruleXExpression )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5370:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause12049);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5394:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5395:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5396:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12086);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName12097); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5403:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5406:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5407:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5407:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5407:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12137); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5414:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==54) ) {
                    int LA87_2 = input.LA(2);

                    if ( (LA87_2==RULE_ID) ) {
                        int LA87_3 = input.LA(3);

                        if ( (synpred25_InternalQIdl()) ) {
                            alt87=1;
                        }


                    }


                }


                switch (alt87) {
            	case 1 :
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5414:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5414:2: ( ( '.' )=>kw= '.' )
            	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5414:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,54,FOLLOW_54_in_ruleQualifiedName12165); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12181); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop87;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5437:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5438:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5439:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference12228);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference12238); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5446:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5449:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5450:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5450:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_ID) ) {
                alt88=1;
            }
            else if ( (LA88_0==19||LA88_0==81) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5451:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference12285);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5461:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference12312);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5477:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5478:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5479:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef12347);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef12357); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5486:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5489:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5490:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5490:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5490:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5490:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==19) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5490:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleXFunctionTypeRef12395); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5494:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5495:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5495:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5496:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12416);
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5512:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==17) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5512:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleXFunctionTypeRef12429); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5516:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5517:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5517:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5518:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12450);
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
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleXFunctionTypeRef12464); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,81,FOLLOW_81_in_ruleXFunctionTypeRef12478); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5542:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5543:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5543:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5544:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12499);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5568:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5569:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5570:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference12535);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12545); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5577:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5580:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5581:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5581:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5581:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5581:2: ( ( ruleQualifiedName ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5582:1: ( ruleQualifiedName )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5582:1: ( ruleQualifiedName )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5583:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12593);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5596:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt92=2;
            alt92 = dfa92.predict(input);
            switch (alt92) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5596:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5596:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5596:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleJvmParameterizedTypeReference12614); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5601:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5602:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5602:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5603:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12636);
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

                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5619:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==17) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5619:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleJvmParameterizedTypeReference12649); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5623:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5624:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5624:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5625:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12670);
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
                    	    break loop91;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleJvmParameterizedTypeReference12684); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5653:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5654:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5655:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12722);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12732); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5662:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5665:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5666:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5666:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_ID||LA93_0==19||LA93_0==81) ) {
                alt93=1;
            }
            else if ( (LA93_0==82) ) {
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5667:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12779);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5677:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12806);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5693:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5694:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5695:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12841);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12851); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5702:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5705:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5706:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5706:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5706:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5706:2: ()
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5707:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,82,FOLLOW_82_in_ruleJvmWildcardTypeReference12897); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5716:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt94=3;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==16) ) {
                alt94=1;
            }
            else if ( (LA94_0==69) ) {
                alt94=2;
            }
            switch (alt94) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5716:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5716:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5717:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5717:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5718:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12919);
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5735:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5735:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5736:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5736:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5737:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12946);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5761:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5762:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5763:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12984);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound12994); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5770:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5773:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5774:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5774:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5774:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleJvmUpperBound13031); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5778:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5779:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5779:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5780:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound13052);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5804:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5805:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5806:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded13088);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded13098); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5813:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5816:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5817:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5817:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5817:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,83,FOLLOW_83_in_ruleJvmUpperBoundAnded13135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5821:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5822:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5822:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5823:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded13156);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5847:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5848:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5849:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound13192);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound13202); if (state.failed) return current;

            }

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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5856:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5859:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5860:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5860:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5860:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleJvmLowerBound13239); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5864:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5865:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5865:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5866:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound13260);
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5892:1: ruleVirtuality returns [Enumerator current=null] : ( (enumLiteral_0= 'virtual' ) | (enumLiteral_1= 'purevirtual' ) ) ;
    public final Enumerator ruleVirtuality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5894:28: ( ( (enumLiteral_0= 'virtual' ) | (enumLiteral_1= 'purevirtual' ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5895:1: ( (enumLiteral_0= 'virtual' ) | (enumLiteral_1= 'purevirtual' ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5895:1: ( (enumLiteral_0= 'virtual' ) | (enumLiteral_1= 'purevirtual' ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==84) ) {
                alt95=1;
            }
            else if ( (LA95_0==85) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5895:2: (enumLiteral_0= 'virtual' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5895:2: (enumLiteral_0= 'virtual' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5895:4: enumLiteral_0= 'virtual'
                    {
                    enumLiteral_0=(Token)match(input,84,FOLLOW_84_in_ruleVirtuality13312); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVirtualityAccess().getVirtualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVirtualityAccess().getVirtualEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5901:6: (enumLiteral_1= 'purevirtual' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5901:6: (enumLiteral_1= 'purevirtual' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5901:8: enumLiteral_1= 'purevirtual'
                    {
                    enumLiteral_1=(Token)match(input,85,FOLLOW_85_in_ruleVirtuality13329); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5911:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5913:28: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5914:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5914:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==86) ) {
                alt96=1;
            }
            else if ( (LA96_0==87) ) {
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5914:2: (enumLiteral_0= 'public' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5914:2: (enumLiteral_0= 'public' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5914:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_86_in_ruleVisibility13374); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5920:6: (enumLiteral_1= 'protected' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5920:6: (enumLiteral_1= 'protected' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5920:8: enumLiteral_1= 'protected'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_87_in_ruleVisibility13391); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5930:1: ruleOwner returns [Enumerator current=null] : ( (enumLiteral_0= 'member' ) | (enumLiteral_1= 'class' ) ) ;
    public final Enumerator ruleOwner() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5932:28: ( ( (enumLiteral_0= 'member' ) | (enumLiteral_1= 'class' ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5933:1: ( (enumLiteral_0= 'member' ) | (enumLiteral_1= 'class' ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5933:1: ( (enumLiteral_0= 'member' ) | (enumLiteral_1= 'class' ) )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==88) ) {
                alt97=1;
            }
            else if ( (LA97_0==15) ) {
                alt97=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5933:2: (enumLiteral_0= 'member' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5933:2: (enumLiteral_0= 'member' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5933:4: enumLiteral_0= 'member'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_88_in_ruleOwner13436); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOwnerAccess().getMemberEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOwnerAccess().getMemberEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5939:6: (enumLiteral_1= 'class' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5939:6: (enumLiteral_1= 'class' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5939:8: enumLiteral_1= 'class'
                    {
                    enumLiteral_1=(Token)match(input,15,FOLLOW_15_in_ruleOwner13453); if (state.failed) return current;
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
    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5949:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'pointer' ) | (enumLiteral_1= 'reference' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5951:28: ( ( (enumLiteral_0= 'pointer' ) | (enumLiteral_1= 'reference' ) ) )
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5952:1: ( (enumLiteral_0= 'pointer' ) | (enumLiteral_1= 'reference' ) )
            {
            // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5952:1: ( (enumLiteral_0= 'pointer' ) | (enumLiteral_1= 'reference' ) )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==89) ) {
                alt98=1;
            }
            else if ( (LA98_0==90) ) {
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
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5952:2: (enumLiteral_0= 'pointer' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5952:2: (enumLiteral_0= 'pointer' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5952:4: enumLiteral_0= 'pointer'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_89_in_ruleType13498); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeAccess().getPointerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getPointerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5958:6: (enumLiteral_1= 'reference' )
                    {
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5958:6: (enumLiteral_1= 'reference' )
                    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5958:8: enumLiteral_1= 'reference'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_90_in_ruleType13515); if (state.failed) return current;
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
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1762:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1762:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1762:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1762:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1762:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1763:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1763:2: ( ( ruleOpMultiAssign ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1764:1: ( ruleOpMultiAssign )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1764:1: ( ruleOpMultiAssign )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1765:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalQIdl3538);
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
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1890:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1890:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1890:4: ( () ( ( ruleOpOr ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1890:5: () ( ( ruleOpOr ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1890:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1891:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1891:2: ( ( ruleOpOr ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1892:1: ( ruleOpOr )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1892:1: ( ruleOpOr )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1893:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalQIdl3886);
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
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1991:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1991:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1991:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1991:5: () ( ( ruleOpAnd ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1991:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1992:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1992:2: ( ( ruleOpAnd ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1993:1: ( ruleOpAnd )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1993:1: ( ruleOpAnd )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:1994:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalQIdl4145);
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
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2092:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2092:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2092:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2092:5: () ( ( ruleOpEquality ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2092:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2093:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2093:2: ( ( ruleOpEquality ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2094:1: ( ruleOpEquality )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2094:1: ( ruleOpEquality )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2095:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalQIdl4404);
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
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2200:4: ( ( () 'instanceof' ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2200:5: ( () 'instanceof' )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2200:5: ( () 'instanceof' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2200:6: () 'instanceof'
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2200:6: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2201:1: 
        {
        }

        match(input,39,FOLLOW_39_in_synpred5_InternalQIdl4680); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalQIdl

    // $ANTLR start synpred6_InternalQIdl
    public final void synpred6_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2228:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2228:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2228:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2228:10: () ( ( ruleOpCompare ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2228:10: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2229:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2229:2: ( ( ruleOpCompare ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2230:1: ( ruleOpCompare )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2230:1: ( ruleOpCompare )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2231:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalQIdl4753);
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
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2350:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2350:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2350:4: ( () ( ( ruleOpOther ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2350:5: () ( ( ruleOpOther ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2350:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2351:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2351:2: ( ( ruleOpOther ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2352:1: ( ruleOpOther )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2352:1: ( ruleOpOther )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2353:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalQIdl5072);
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
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2458:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2458:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2458:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2458:5: () ( ( ruleOpAdd ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2458:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2459:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2459:2: ( ( ruleOpAdd ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2460:1: ( ruleOpAdd )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2460:1: ( ruleOpAdd )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2461:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalQIdl5352);
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
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2566:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2566:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2566:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2566:5: () ( ( ruleOpMulti ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2566:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2567:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2567:2: ( ( ruleOpMulti ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2568:1: ( ruleOpMulti )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2568:1: ( ruleOpMulti )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2569:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalQIdl5632);
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
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2799:3: ( ( () 'as' ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2799:4: ( () 'as' )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2799:4: ( () 'as' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2799:5: () 'as'
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2799:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2800:1: 
        {
        }

        match(input,53,FOLLOW_53_in_synpred10_InternalQIdl6226); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalQIdl

    // $ANTLR start synpred11_InternalQIdl
    public final void synpred11_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2859:4: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2859:5: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2859:5: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2859:6: () '.' ( ( RULE_ID ) ) ruleOpSingleAssign
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2859:6: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2860:1: 
        {
        }

        match(input,54,FOLLOW_54_in_synpred11_InternalQIdl6380); if (state.failed) return ;
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2861:1: ( ( RULE_ID ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2862:1: ( RULE_ID )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2862:1: ( RULE_ID )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2863:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred11_InternalQIdl6388); if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalQIdl6395);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalQIdl

    // $ANTLR start synpred12_InternalQIdl
    public final void synpred12_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2916:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2916:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2916:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2916:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2916:10: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2917:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2917:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt99=3;
        switch ( input.LA(1) ) {
        case 54:
            {
            alt99=1;
            }
            break;
        case 55:
            {
            alt99=2;
            }
            break;
        case 56:
            {
            alt99=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 99, 0, input);

            throw nvae;
        }

        switch (alt99) {
            case 1 :
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2917:4: '.'
                {
                match(input,54,FOLLOW_54_in_synpred12_InternalQIdl6495); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2919:6: ( ( '?.' ) )
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2919:6: ( ( '?.' ) )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2920:1: ( '?.' )
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2920:1: ( '?.' )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2921:2: '?.'
                {
                match(input,55,FOLLOW_55_in_synpred12_InternalQIdl6509); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2926:6: ( ( '*.' ) )
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2926:6: ( ( '*.' ) )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2927:1: ( '*.' )
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2927:1: ( '*.' )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:2928:2: '*.'
                {
                match(input,56,FOLLOW_56_in_synpred12_InternalQIdl6529); if (state.failed) return ;

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
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3035:4: ( ( '(' ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3036:1: ( '(' )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3036:1: ( '(' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3037:2: '('
        {
        match(input,19,FOLLOW_19_in_synpred13_InternalQIdl6753); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalQIdl

    // $ANTLR start synpred14_InternalQIdl
    public final void synpred14_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3056:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3056:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3056:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3056:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3056:6: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3057:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3057:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt101=2;
        int LA101_0 = input.LA(1);

        if ( (LA101_0==RULE_ID||LA101_0==19||LA101_0==81) ) {
            alt101=1;
        }
        switch (alt101) {
            case 1 :
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3057:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3057:3: ( ( ruleJvmFormalParameter ) )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3058:1: ( ruleJvmFormalParameter )
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3058:1: ( ruleJvmFormalParameter )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3059:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalQIdl6805);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3061:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop100:
                do {
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==17) ) {
                        alt100=1;
                    }


                    switch (alt100) {
                	case 1 :
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3061:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,17,FOLLOW_17_in_synpred14_InternalQIdl6812); if (state.failed) return ;
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3062:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3063:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3063:1: ( ruleJvmFormalParameter )
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3064:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalQIdl6819);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop100;
                    }
                } while (true);


                }
                break;

        }

        match(input,27,FOLLOW_27_in_synpred14_InternalQIdl6829); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalQIdl

    // $ANTLR start synpred16_InternalQIdl
    public final void synpred16_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3670:4: ( 'else' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:3670:6: 'else'
        {
        match(input,60,FOLLOW_60_in_synpred16_InternalQIdl8274); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalQIdl

    // $ANTLR start synpred17_InternalQIdl
    public final void synpred17_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4294:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4294:5: ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4294:5: ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4294:6: ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4294:6: ( ( ruleJvmTypeReference ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4295:1: ( ruleJvmTypeReference )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4295:1: ( ruleJvmTypeReference )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4296:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred17_InternalQIdl9641);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4298:2: ( ( RULE_ID ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4299:1: ( RULE_ID )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4299:1: ( RULE_ID )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4300:1: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred17_InternalQIdl9650); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalQIdl

    // $ANTLR start synpred18_InternalQIdl
    public final void synpred18_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4542:4: ( ( '(' ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4543:1: ( '(' )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4543:1: ( '(' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4544:2: '('
        {
        match(input,19,FOLLOW_19_in_synpred18_InternalQIdl10103); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalQIdl

    // $ANTLR start synpred19_InternalQIdl
    public final void synpred19_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4563:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4563:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4563:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4563:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4563:6: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4564:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4564:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt105=2;
        int LA105_0 = input.LA(1);

        if ( (LA105_0==RULE_ID||LA105_0==19||LA105_0==81) ) {
            alt105=1;
        }
        switch (alt105) {
            case 1 :
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4564:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4564:3: ( ( ruleJvmFormalParameter ) )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4565:1: ( ruleJvmFormalParameter )
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4565:1: ( ruleJvmFormalParameter )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4566:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalQIdl10155);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4568:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop104:
                do {
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==17) ) {
                        alt104=1;
                    }


                    switch (alt104) {
                	case 1 :
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4568:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,17,FOLLOW_17_in_synpred19_InternalQIdl10162); if (state.failed) return ;
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4569:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4570:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4570:1: ( ruleJvmFormalParameter )
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4571:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalQIdl10169);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop104;
                    }
                } while (true);


                }
                break;

        }

        match(input,27,FOLLOW_27_in_synpred19_InternalQIdl10179); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalQIdl

    // $ANTLR start synpred20_InternalQIdl
    public final void synpred20_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4804:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4804:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4804:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4804:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4804:5: ()
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4805:1: 
        {
        }

        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4805:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt107=2;
        int LA107_0 = input.LA(1);

        if ( (LA107_0==RULE_ID||LA107_0==19||LA107_0==81) ) {
            alt107=1;
        }
        switch (alt107) {
            case 1 :
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4805:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4805:3: ( ( ruleJvmFormalParameter ) )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4806:1: ( ruleJvmFormalParameter )
                {
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4806:1: ( ruleJvmFormalParameter )
                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4807:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalQIdl10736);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4809:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop106:
                do {
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==17) ) {
                        alt106=1;
                    }


                    switch (alt106) {
                	case 1 :
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4809:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,17,FOLLOW_17_in_synpred20_InternalQIdl10743); if (state.failed) return ;
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4810:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4811:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4811:1: ( ruleJvmFormalParameter )
                	    // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:4812:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalQIdl10750);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop106;
                    }
                } while (true);


                }
                break;

        }

        match(input,27,FOLLOW_27_in_synpred20_InternalQIdl10760); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalQIdl

    // $ANTLR start synpred21_InternalQIdl
    public final void synpred21_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5180:2: ( ( ruleXExpression ) )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5181:1: ( ruleXExpression )
        {
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5181:1: ( ruleXExpression )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5182:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred21_InternalQIdl11641);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalQIdl

    // $ANTLR start synpred22_InternalQIdl
    public final void synpred22_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5251:5: ( 'catch' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5251:7: 'catch'
        {
        match(input,80,FOLLOW_80_in_synpred22_InternalQIdl11786); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalQIdl

    // $ANTLR start synpred23_InternalQIdl
    public final void synpred23_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5270:5: ( 'finally' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5270:7: 'finally'
        {
        match(input,79,FOLLOW_79_in_synpred23_InternalQIdl11816); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalQIdl

    // $ANTLR start synpred25_InternalQIdl
    public final void synpred25_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5414:3: ( '.' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5415:2: '.'
        {
        match(input,54,FOLLOW_54_in_synpred25_InternalQIdl12156); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalQIdl

    // $ANTLR start synpred26_InternalQIdl
    public final void synpred26_InternalQIdl_fragment() throws RecognitionException {   
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5596:4: ( '<' )
        // ../org.ufacekit.qt.idl.dsl/src-gen/org/ufacekit/qt/idl/dsl/parser/antlr/internal/InternalQIdl.g:5596:6: '<'
        {
        match(input,43,FOLLOW_43_in_synpred26_InternalQIdl12606); if (state.failed) return ;

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


    protected DFA49 dfa49 = new DFA49(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA92 dfa92 = new DFA92(this);
    static final String DFA49_eotS =
        "\74\uffff";
    static final String DFA49_eofS =
        "\1\2\73\uffff";
    static final String DFA49_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA49_maxS =
        "\1\121\1\0\72\uffff";
    static final String DFA49_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA49_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\2\1\uffff\2\2\5\uffff\2\2\2\uffff\1\2\1\uffff\1\1\2\uffff"+
            "\1\2\2\uffff\1\2\5\uffff\1\2\2\uffff\44\2\1\uffff\13\2",
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

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "3035:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_1 = input.LA(1);

                         
                        int index49_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index49_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA48_eotS =
        "\34\uffff";
    static final String DFA48_eofS =
        "\34\uffff";
    static final String DFA48_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA48_maxS =
        "\1\121\2\0\31\uffff";
    static final String DFA48_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA48_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\1\1\uffff\2\5\5\uffff\1\5\5\uffff\1\2\7\uffff\1\4\3\uffff"+
            "\1\33\13\uffff\1\5\2\uffff\2\5\4\uffff\1\5\4\uffff\1\5\1\uffff"+
            "\1\5\1\uffff\1\5\2\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff"+
            "\1\3",
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

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "3056:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_0 = input.LA(1);

                         
                        int index48_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_0==RULE_ID) ) {s = 1;}

                        else if ( (LA48_0==19) ) {s = 2;}

                        else if ( (LA48_0==81) && (synpred14_InternalQIdl())) {s = 3;}

                        else if ( (LA48_0==27) && (synpred14_InternalQIdl())) {s = 4;}

                        else if ( ((LA48_0>=RULE_INT && LA48_0<=RULE_STRING)||LA48_0==13||LA48_0==43||(LA48_0>=46 && LA48_0<=47)||LA48_0==52||LA48_0==57||LA48_0==59||LA48_0==61||(LA48_0>=64 && LA48_0<=66)||LA48_0==69||(LA48_0>=71 && LA48_0<=78)) ) {s = 5;}

                        else if ( (LA48_0==31) ) {s = 27;}

                         
                        input.seek(index48_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA48_1 = input.LA(1);

                         
                        int index48_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalQIdl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index48_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA48_2 = input.LA(1);

                         
                        int index48_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalQIdl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index48_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 48, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA75_eotS =
        "\74\uffff";
    static final String DFA75_eofS =
        "\1\2\73\uffff";
    static final String DFA75_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA75_maxS =
        "\1\121\1\0\72\uffff";
    static final String DFA75_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA75_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA75_transitionS = {
            "\1\2\1\uffff\2\2\5\uffff\2\2\2\uffff\1\2\1\uffff\1\1\2\uffff"+
            "\1\2\2\uffff\1\2\5\uffff\1\2\2\uffff\44\2\1\uffff\13\2",
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

    static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
    static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
    static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
    static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
    static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
    static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
    static final short[][] DFA75_transition;

    static {
        int numStates = DFA75_transitionS.length;
        DFA75_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = DFA75_eot;
            this.eof = DFA75_eof;
            this.min = DFA75_min;
            this.max = DFA75_max;
            this.accept = DFA75_accept;
            this.special = DFA75_special;
            this.transition = DFA75_transition;
        }
        public String getDescription() {
            return "4542:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA75_1 = input.LA(1);

                         
                        int index75_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index75_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 75, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA74_eotS =
        "\34\uffff";
    static final String DFA74_eofS =
        "\34\uffff";
    static final String DFA74_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA74_maxS =
        "\1\121\2\0\31\uffff";
    static final String DFA74_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA74_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\1\1\uffff\2\5\5\uffff\1\5\5\uffff\1\2\7\uffff\1\4\3\uffff"+
            "\1\33\13\uffff\1\5\2\uffff\2\5\4\uffff\1\5\4\uffff\1\5\1\uffff"+
            "\1\5\1\uffff\1\5\2\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff"+
            "\1\3",
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

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "4563:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_0 = input.LA(1);

                         
                        int index74_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA74_0==RULE_ID) ) {s = 1;}

                        else if ( (LA74_0==19) ) {s = 2;}

                        else if ( (LA74_0==81) && (synpred19_InternalQIdl())) {s = 3;}

                        else if ( (LA74_0==27) && (synpred19_InternalQIdl())) {s = 4;}

                        else if ( ((LA74_0>=RULE_INT && LA74_0<=RULE_STRING)||LA74_0==13||LA74_0==43||(LA74_0>=46 && LA74_0<=47)||LA74_0==52||LA74_0==57||LA74_0==59||LA74_0==61||(LA74_0>=64 && LA74_0<=66)||LA74_0==69||(LA74_0>=71 && LA74_0<=78)) ) {s = 5;}

                        else if ( (LA74_0==31) ) {s = 27;}

                         
                        input.seek(index74_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalQIdl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA74_2 = input.LA(1);

                         
                        int index74_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalQIdl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index74_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA81_eotS =
        "\34\uffff";
    static final String DFA81_eofS =
        "\34\uffff";
    static final String DFA81_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA81_maxS =
        "\1\121\2\0\31\uffff";
    static final String DFA81_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA81_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA81_transitionS = {
            "\1\1\1\uffff\2\5\5\uffff\1\5\5\uffff\1\2\7\uffff\1\4\3\uffff"+
            "\1\33\13\uffff\1\5\2\uffff\2\5\4\uffff\1\5\4\uffff\1\5\1\uffff"+
            "\1\5\1\uffff\1\5\2\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff"+
            "\1\3",
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

    static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
    static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
    static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
    static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
    static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
    static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
    static final short[][] DFA81_transition;

    static {
        int numStates = DFA81_transitionS.length;
        DFA81_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = DFA81_eot;
            this.eof = DFA81_eof;
            this.min = DFA81_min;
            this.max = DFA81_max;
            this.accept = DFA81_accept;
            this.special = DFA81_special;
            this.transition = DFA81_transition;
        }
        public String getDescription() {
            return "4804:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_0 = input.LA(1);

                         
                        int index81_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA81_0==RULE_ID) ) {s = 1;}

                        else if ( (LA81_0==19) ) {s = 2;}

                        else if ( (LA81_0==81) && (synpred20_InternalQIdl())) {s = 3;}

                        else if ( (LA81_0==27) && (synpred20_InternalQIdl())) {s = 4;}

                        else if ( ((LA81_0>=RULE_INT && LA81_0<=RULE_STRING)||LA81_0==13||LA81_0==43||(LA81_0>=46 && LA81_0<=47)||LA81_0==52||LA81_0==57||LA81_0==59||LA81_0==61||(LA81_0>=64 && LA81_0<=66)||LA81_0==69||(LA81_0>=71 && LA81_0<=78)) ) {s = 5;}

                        else if ( (LA81_0==31) ) {s = 27;}

                         
                        input.seek(index81_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA81_1 = input.LA(1);

                         
                        int index81_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalQIdl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index81_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA81_2 = input.LA(1);

                         
                        int index81_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalQIdl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index81_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 81, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA83_eotS =
        "\74\uffff";
    static final String DFA83_eofS =
        "\1\31\73\uffff";
    static final String DFA83_minS =
        "\1\4\30\0\43\uffff";
    static final String DFA83_maxS =
        "\1\121\30\0\43\uffff";
    static final String DFA83_acceptS =
        "\31\uffff\1\2\41\uffff\1\1";
    static final String DFA83_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\43\uffff}>";
    static final String[] DFA83_transitionS = {
            "\1\1\1\uffff\1\15\1\17\5\uffff\1\6\1\31\2\uffff\1\31\1\uffff"+
            "\1\30\2\uffff\1\31\2\uffff\1\31\5\uffff\1\31\2\uffff\11\31\1"+
            "\10\2\31\1\4\1\3\4\31\1\2\4\31\1\12\1\31\1\21\1\31\1\7\2\31"+
            "\1\22\1\23\1\24\2\31\1\11\1\uffff\1\5\1\13\1\14\1\16\1\20\1"+
            "\25\1\26\1\27\3\31",
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
            return "5180:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA83_2 = input.LA(1);

                         
                        int index83_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA83_3 = input.LA(1);

                         
                        int index83_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA83_4 = input.LA(1);

                         
                        int index83_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA83_5 = input.LA(1);

                         
                        int index83_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA83_6 = input.LA(1);

                         
                        int index83_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA83_7 = input.LA(1);

                         
                        int index83_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA83_8 = input.LA(1);

                         
                        int index83_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA83_9 = input.LA(1);

                         
                        int index83_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA83_10 = input.LA(1);

                         
                        int index83_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA83_11 = input.LA(1);

                         
                        int index83_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA83_12 = input.LA(1);

                         
                        int index83_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA83_13 = input.LA(1);

                         
                        int index83_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA83_14 = input.LA(1);

                         
                        int index83_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA83_15 = input.LA(1);

                         
                        int index83_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA83_16 = input.LA(1);

                         
                        int index83_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA83_17 = input.LA(1);

                         
                        int index83_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA83_18 = input.LA(1);

                         
                        int index83_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA83_19 = input.LA(1);

                         
                        int index83_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA83_20 = input.LA(1);

                         
                        int index83_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA83_21 = input.LA(1);

                         
                        int index83_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA83_22 = input.LA(1);

                         
                        int index83_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA83_23 = input.LA(1);

                         
                        int index83_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA83_24 = input.LA(1);

                         
                        int index83_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index83_24);
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
    static final String DFA92_eotS =
        "\74\uffff";
    static final String DFA92_eofS =
        "\1\2\73\uffff";
    static final String DFA92_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA92_maxS =
        "\1\121\1\0\72\uffff";
    static final String DFA92_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA92_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA92_transitionS = {
            "\1\2\1\uffff\2\2\5\uffff\2\2\2\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\1\2\2\uffff\1\2\5\uffff\1\2\2\uffff\11\2\1\1\32\2\1\uffff\13"+
            "\2",
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

    static final short[] DFA92_eot = DFA.unpackEncodedString(DFA92_eotS);
    static final short[] DFA92_eof = DFA.unpackEncodedString(DFA92_eofS);
    static final char[] DFA92_min = DFA.unpackEncodedStringToUnsignedChars(DFA92_minS);
    static final char[] DFA92_max = DFA.unpackEncodedStringToUnsignedChars(DFA92_maxS);
    static final short[] DFA92_accept = DFA.unpackEncodedString(DFA92_acceptS);
    static final short[] DFA92_special = DFA.unpackEncodedString(DFA92_specialS);
    static final short[][] DFA92_transition;

    static {
        int numStates = DFA92_transitionS.length;
        DFA92_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA92_transition[i] = DFA.unpackEncodedString(DFA92_transitionS[i]);
        }
    }

    class DFA92 extends DFA {

        public DFA92(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 92;
            this.eot = DFA92_eot;
            this.eof = DFA92_eof;
            this.min = DFA92_min;
            this.max = DFA92_max;
            this.accept = DFA92_accept;
            this.special = DFA92_special;
            this.transition = DFA92_transition;
        }
        public String getDescription() {
            return "5596:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA92_1 = input.LA(1);

                         
                        int index92_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalQIdl()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index92_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 92, _s, input);
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
    public static final BitSet FOLLOW_12_in_ruleQtNamespace255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtNamespace272 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleQtNamespace289 = new BitSet(new long[]{0x000000030180D000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleQtNamespace_in_ruleQtNamespace311 = new BitSet(new long[]{0x000000030180D000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleQtEnum_in_ruleQtNamespace338 = new BitSet(new long[]{0x000000030180D000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleQtFlags_in_ruleQtNamespace365 = new BitSet(new long[]{0x000000030180D000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleQtClass_in_ruleQtNamespace392 = new BitSet(new long[]{0x000000030180D000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleQtOperation_in_ruleQtNamespace419 = new BitSet(new long[]{0x000000030180D000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_14_in_ruleQtNamespace433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtOperation_in_entryRuleQtOperation471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtOperation481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtFunction_in_ruleQtOperation528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtSignal_in_ruleQtOperation555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtSlot_in_ruleQtOperation582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtClass_in_entryRuleQtClass617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtClass627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleQtClass664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtClass681 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleQtClass699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtClass719 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_17_in_ruleQtClass732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtClass752 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleQtClass768 = new BitSet(new long[]{0x0000000301A4D000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleQtEnum_in_ruleQtClass790 = new BitSet(new long[]{0x0000000301A4D000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleQtFlags_in_ruleQtClass817 = new BitSet(new long[]{0x0000000301A4D000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleQtClass_in_ruleQtClass844 = new BitSet(new long[]{0x0000000301A4D000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleQtProperty_in_ruleQtClass871 = new BitSet(new long[]{0x0000000301A4D000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleQtConstructor_in_ruleQtClass898 = new BitSet(new long[]{0x0000000301A4D000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleQtOperation_in_ruleQtClass925 = new BitSet(new long[]{0x0000000301A4D000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_14_in_ruleQtClass939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtConstructor_in_entryRuleQtConstructor975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtConstructor985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleQtConstructor1022 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQtConstructor1043 = new BitSet(new long[]{0x0000000020100010L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleQtParameter_in_ruleQtConstructor1065 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_17_in_ruleQtConstructor1078 = new BitSet(new long[]{0x0000000020000010L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleQtParameter_in_ruleQtConstructor1099 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_20_in_ruleQtConstructor1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtProperty_in_entryRuleQtProperty1151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtProperty1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleQtProperty1198 = new BitSet(new long[]{0x0000000020000010L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleQtValue_in_ruleQtProperty1219 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleQtProperty1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtEnum_in_entryRuleQtEnum1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtEnum1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleQtEnum1314 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtEnum1331 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleQtEnum1348 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleQtEnumValue_in_ruleQtEnum1369 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleQtEnum1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtFlags_in_entryRuleQtFlags1418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtFlags1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleQtFlags1465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtFlags1482 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleQtFlags1499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtFlags1519 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleQtFlags1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtEnumValue_in_entryRuleQtEnumValue1567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtEnumValue1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtEnumValue1619 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleQtEnumValue1636 = new BitSet(new long[]{0x0000000020000030L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleQtEnumValueMask_in_ruleQtEnumValue1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtEnumValueMask_in_entryRuleQtEnumValueMask1693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtEnumValueMask1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQtEnumValueMask1752 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_RULE_LONG_in_ruleQtEnumValueMask1775 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleQtEnumValueMask1794 = new BitSet(new long[]{0x0000000020000030L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQtEnumValueMask1818 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_RULE_LONG_in_ruleQtEnumValueMask1841 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleQtBuitinType_in_entryRuleQtBuitinType1885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtBuitinType1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleQtBuitinType1932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtBuitinType1949 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleQtBuitinType1966 = new BitSet(new long[]{0x0000000020080010L,0x0000000006060000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleQtBuitinType1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtFunction_in_entryRuleQtFunction2023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtFunction2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleQtFunction2079 = new BitSet(new long[]{0x0000000020008000L,0x0000000001300000L});
    public static final BitSet FOLLOW_29_in_ruleQtFunction2097 = new BitSet(new long[]{0x0000000020008000L,0x0000000001300000L});
    public static final BitSet FOLLOW_ruleVirtuality_in_ruleQtFunction2132 = new BitSet(new long[]{0x0000000020008000L,0x0000000001300000L});
    public static final BitSet FOLLOW_ruleOwner_in_ruleQtFunction2154 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleQtFunction2166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtFunction2183 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQtFunction2200 = new BitSet(new long[]{0x00000000A0000010L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleQtParameter_in_ruleQtFunction2222 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_17_in_ruleQtFunction2235 = new BitSet(new long[]{0x0000000020000010L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleQtParameter_in_ruleQtFunction2256 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_31_in_ruleQtFunction2272 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleQtFunction2284 = new BitSet(new long[]{0x0000000020000010L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleQtReturnValue_in_ruleQtFunction2305 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleQtFunction2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtValue_in_entryRuleQtValue2353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtValue2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleQtValue2406 = new BitSet(new long[]{0x0000000020000010L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleQtValue2441 = new BitSet(new long[]{0x0000000020000010L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQtValue2465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtValue2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtParameter_in_entryRuleQtParameter2523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtParameter2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtValue_in_ruleQtParameter2579 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleQtParameter2592 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQtParameter2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtParameter2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtReturnValue_in_entryRuleQtReturnValue2680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtReturnValue2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleQtReturnValue2733 = new BitSet(new long[]{0x0000000020000010L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleQtReturnValue2768 = new BitSet(new long[]{0x0000000020000010L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQtReturnValue2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtSignal_in_entryRuleQtSignal2828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtSignal2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleQtSignal2875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtSignal2892 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQtSignal2909 = new BitSet(new long[]{0x00000000A0000010L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleQtParameter_in_ruleQtSignal2931 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_17_in_ruleQtSignal2944 = new BitSet(new long[]{0x0000000020000010L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleQtParameter_in_ruleQtSignal2965 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_31_in_ruleQtSignal2981 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleQtSignal2993 = new BitSet(new long[]{0x0000000020000010L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleQtReturnValue_in_ruleQtSignal3014 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleQtSignal3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQtSlot_in_entryRuleQtSlot3062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQtSlot3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleQtSlot3109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQtSlot3126 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQtSlot3143 = new BitSet(new long[]{0x00000000A0000010L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleQtParameter_in_ruleQtSlot3165 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_17_in_ruleQtSlot3178 = new BitSet(new long[]{0x0000000020000010L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleQtParameter_in_ruleQtSlot3199 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_31_in_ruleQtSlot3215 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleQtSlot3227 = new BitSet(new long[]{0x0000000020000010L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleQtReturnValue_in_ruleQtSlot3248 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleQtSlot3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression3296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment3386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXAssignment3451 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment3467 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment3517 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment3570 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign3633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpSingleAssign3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign3721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpMultiAssign3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression3808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression3865 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression3918 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression3941 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr3980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOr4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression4067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression4124 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression4177 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression4200 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd4239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpAnd4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression4326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression4383 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression4436 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression4459 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality4498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpEquality4547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpEquality4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression4606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4663 = new BitSet(new long[]{0x00000F8000000002L});
    public static final BitSet FOLLOW_39_in_ruleXRelationalExpression4699 = new BitSet(new long[]{0x0000000020000010L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression4724 = new BitSet(new long[]{0x00000F8000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression4785 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4808 = new BitSet(new long[]{0x00000F8000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare4848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpCompare4897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpCompare4916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpCompare4935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpCompare4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression4994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression5051 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression5104 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression5127 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther5166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpOther5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpOther5234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression5274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5331 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression5384 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5407 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd5446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd5457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpAdd5495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpAdd5514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression5554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5611 = new BitSet(new long[]{0x000F000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression5664 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5687 = new BitSet(new long[]{0x000F000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti5726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti5737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpMulti5775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOpMulti5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOpMulti5813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleOpMulti5832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation5872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation5940 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary6026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary6037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleOpUnary6075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpUnary6094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpUnary6113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression6153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression6163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression6210 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXCastedExpression6245 = new BitSet(new long[]{0x0000000020080010L,0x0000000006020000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression6268 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall6306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall6316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall6363 = new BitSet(new long[]{0x01C0000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXMemberFeatureCall6412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXMemberFeatureCall6432 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall6448 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall6470 = new BitSet(new long[]{0x01C0000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXMemberFeatureCall6556 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_55_in_ruleXMemberFeatureCall6580 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_56_in_ruleXMemberFeatureCall6617 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall6646 = new BitSet(new long[]{0x0000000020080010L,0x0000000006060000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6667 = new BitSet(new long[]{0x0000040000020000L});
    public static final BitSet FOLLOW_17_in_ruleXMemberFeatureCall6680 = new BitSet(new long[]{0x0000000020080010L,0x0000000006060000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6701 = new BitSet(new long[]{0x0000040000020000L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall6715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXMemberFeatureCall6737 = new BitSet(new long[]{0x01C0000000080002L});
    public static final BitSet FOLLOW_19_in_ruleXMemberFeatureCall6771 = new BitSet(new long[]{0x2A10C800A80820D0L,0x0000000006027FA7L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall6846 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6874 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_17_in_ruleXMemberFeatureCall6887 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6908 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_31_in_ruleXMemberFeatureCall6925 = new BitSet(new long[]{0x01C0000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression6966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression6976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression7050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression7077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression7131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression7158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression7185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression7212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression7266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression7293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression7320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression7347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral7382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral7392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral7439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral7466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral7493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral7520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral7547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral7574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure7609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure7619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXClosure7665 = new BitSet(new long[]{0x0000000028080010L,0x0000000006020000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7687 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_17_in_ruleXClosure7700 = new BitSet(new long[]{0x0000000020080010L,0x0000000006020000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7721 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_27_in_ruleXClosure7737 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure7758 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXClosure7770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure7806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure7816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7914 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_17_in_ruleXShortClosure7927 = new BitSet(new long[]{0x0000000020080010L,0x0000000006020000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7948 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_27_in_ruleXShortClosure7964 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure7987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression8023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression8033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleXParenthesizedExpression8070 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression8092 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXParenthesizedExpression8103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression8139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression8149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXIfExpression8195 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXIfExpression8207 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression8228 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXIfExpression8240 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression8261 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXIfExpression8282 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression8304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression8342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression8352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXSwitchExpression8398 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXSwitchExpression8416 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXSwitchExpression8433 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression8456 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXSwitchExpression8468 = new BitSet(new long[]{0x8000000022080010L,0x0000000006020000L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression8489 = new BitSet(new long[]{0xC000000022084010L,0x0000000006020000L});
    public static final BitSet FOLLOW_62_in_ruleXSwitchExpression8503 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXSwitchExpression8515 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression8536 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleXSwitchExpression8550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart8586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart8596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart8642 = new BitSet(new long[]{0x8000000002000000L});
    public static final BitSet FOLLOW_63_in_ruleXCasePart8656 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart8677 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXCasePart8691 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart8712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression8748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression8758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXForLoopExpression8804 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXForLoopExpression8816 = new BitSet(new long[]{0x0000000020080010L,0x0000000006020000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression8837 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXForLoopExpression8849 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression8870 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXForLoopExpression8882 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression8903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression8939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression8949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXWhileExpression8995 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXWhileExpression9007 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression9028 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXWhileExpression9040 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression9061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression9097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression9107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXDoWhileExpression9153 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression9174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXDoWhileExpression9186 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXDoWhileExpression9198 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression9219 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXDoWhileExpression9231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression9267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression9277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleXBlockExpression9323 = new BitSet(new long[]{0x2A10C800000860D0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression9345 = new BitSet(new long[]{0x2A10C800004860D0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_22_in_ruleXBlockExpression9358 = new BitSet(new long[]{0x2A10C800000860D0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_14_in_ruleXBlockExpression9374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock9410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock9420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock9467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock9494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration9529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration9539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXVariableDeclaration9592 = new BitSet(new long[]{0x0000000020080010L,0x0000000006020000L});
    public static final BitSet FOLLOW_68_in_ruleXVariableDeclaration9623 = new BitSet(new long[]{0x0000000020080010L,0x0000000006020000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration9672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXVariableDeclaration9689 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXVariableDeclaration9719 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleXVariableDeclaration9738 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration9759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter9797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter9807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter9853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJvmFormalParameter9871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall9912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall9922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall9979 = new BitSet(new long[]{0x0000080000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall9993 = new BitSet(new long[]{0x0000000020080010L,0x0000000006060000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall10014 = new BitSet(new long[]{0x0000040000020000L});
    public static final BitSet FOLLOW_17_in_ruleXFeatureCall10027 = new BitSet(new long[]{0x0000000020080010L,0x0000000006060000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall10048 = new BitSet(new long[]{0x0000040000020000L});
    public static final BitSet FOLLOW_42_in_ruleXFeatureCall10062 = new BitSet(new long[]{0x0000080000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall10087 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleXFeatureCall10121 = new BitSet(new long[]{0x2A10C800A80820D0L,0x0000000006027FA7L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall10196 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall10224 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_17_in_ruleXFeatureCall10237 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall10258 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_31_in_ruleXFeatureCall10275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper10314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper10325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdOrSuper10365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleIdOrSuper10389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier10430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier10441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStaticQualifier10481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleStaticQualifier10499 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall10540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall10550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXConstructorCall10596 = new BitSet(new long[]{0x0000000020000010L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall10619 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall10632 = new BitSet(new long[]{0x0000000020080010L,0x0000000006060000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10653 = new BitSet(new long[]{0x0000040000020000L});
    public static final BitSet FOLLOW_17_in_ruleXConstructorCall10666 = new BitSet(new long[]{0x0000000020080010L,0x0000000006060000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10687 = new BitSet(new long[]{0x0000040000020000L});
    public static final BitSet FOLLOW_42_in_ruleXConstructorCall10701 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXConstructorCall10715 = new BitSet(new long[]{0x2A10C800A80820D0L,0x0000000006027FA7L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall10777 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10805 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_17_in_ruleXConstructorCall10818 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10839 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_31_in_ruleXConstructorCall10856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral10902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXBooleanLiteral10949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXBooleanLiteral10973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral11023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral11033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXNullLiteral11079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral11115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral11125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral11176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral11217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral11227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral11278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral11319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral11329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXTypeLiteral11375 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXTypeLiteral11387 = new BitSet(new long[]{0x0000000020000010L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral11410 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXTypeLiteral11422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression11458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression11468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXThrowExpression11514 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression11535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression11571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression11581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXReturnExpression11627 = new BitSet(new long[]{0x2A10C800000820D2L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression11658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression11695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression11705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleXTryCatchFinallyExpression11751 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11802 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L});
    public static final BitSet FOLLOW_79_in_ruleXTryCatchFinallyExpression11824 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleXTryCatchFinallyExpression11868 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause11937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleXCatchClause11982 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXCatchClause11995 = new BitSet(new long[]{0x0000000020080010L,0x0000000006020000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause12016 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXCatchClause12028 = new BitSet(new long[]{0x2A10C800000820D0L,0x0000000000007FA7L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause12049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName12097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12137 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleQualifiedName12165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12181 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference12228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference12238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference12285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference12312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef12347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef12357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleXFunctionTypeRef12395 = new BitSet(new long[]{0x0000000020080010L,0x0000000006020000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12416 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_17_in_ruleXFunctionTypeRef12429 = new BitSet(new long[]{0x0000000020080010L,0x0000000006020000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12450 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_31_in_ruleXFunctionTypeRef12464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleXFunctionTypeRef12478 = new BitSet(new long[]{0x0000000020080010L,0x0000000006020000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef12499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference12535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12593 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleJvmParameterizedTypeReference12614 = new BitSet(new long[]{0x0000000020080010L,0x0000000006060000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12636 = new BitSet(new long[]{0x0000040000020000L});
    public static final BitSet FOLLOW_17_in_ruleJvmParameterizedTypeReference12649 = new BitSet(new long[]{0x0000000020080010L,0x0000000006060000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12670 = new BitSet(new long[]{0x0000040000020000L});
    public static final BitSet FOLLOW_42_in_ruleJvmParameterizedTypeReference12684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleJvmWildcardTypeReference12897 = new BitSet(new long[]{0x0000000000010002L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound12994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleJvmUpperBound13031 = new BitSet(new long[]{0x0000000020080010L,0x0000000006020000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound13052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded13088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded13098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleJvmUpperBoundAnded13135 = new BitSet(new long[]{0x0000000020080010L,0x0000000006020000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded13156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound13192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound13202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleJvmLowerBound13239 = new BitSet(new long[]{0x0000000020080010L,0x0000000006020000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound13260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleVirtuality13312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleVirtuality13329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleVisibility13374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleVisibility13391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleOwner13436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOwner13453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleType13498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleType13515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalQIdl3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalQIdl3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalQIdl4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalQIdl4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred5_InternalQIdl4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalQIdl4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalQIdl5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalQIdl5352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalQIdl5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred10_InternalQIdl6226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred11_InternalQIdl6380 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred11_InternalQIdl6388 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalQIdl6395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred12_InternalQIdl6495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred12_InternalQIdl6509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred12_InternalQIdl6529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred13_InternalQIdl6753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalQIdl6805 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_17_in_synpred14_InternalQIdl6812 = new BitSet(new long[]{0x0000000020080010L,0x0000000006020000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalQIdl6819 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_27_in_synpred14_InternalQIdl6829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_synpred16_InternalQIdl8274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred17_InternalQIdl9641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred17_InternalQIdl9650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred18_InternalQIdl10103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalQIdl10155 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_17_in_synpred19_InternalQIdl10162 = new BitSet(new long[]{0x0000000020080010L,0x0000000006020000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalQIdl10169 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_27_in_synpred19_InternalQIdl10179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalQIdl10736 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_17_in_synpred20_InternalQIdl10743 = new BitSet(new long[]{0x0000000020080010L,0x0000000006020000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalQIdl10750 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_27_in_synpred20_InternalQIdl10760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred21_InternalQIdl11641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_synpred22_InternalQIdl11786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_synpred23_InternalQIdl11816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred25_InternalQIdl12156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred26_InternalQIdl12606 = new BitSet(new long[]{0x0000000000000002L});

}