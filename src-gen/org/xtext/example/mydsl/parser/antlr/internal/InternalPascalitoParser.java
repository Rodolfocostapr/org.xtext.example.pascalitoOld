package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.PascalitoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalitoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'programa'", "'{'", "'}'", "'var'", "','", "';'", "'procedimento'", "'Inicio'", "'Fim'", "'('", "')'", "'CallProcedimento'", "'definido'", "'parametro'", "'->'", "'Desvio'", "'se'", "'faca'", "'seNao'", "'Loop'", "'.'", "'CallVariavel'", "'Prioridade'", "'representa'", "'Comutativa'", "'ExpBinLogica'", "'Operador'", "'operandoEsq'", "'operandoDir'", "'ExpBin'", "'ExpNeg'", "'nega'", "'-'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPascalitoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPascalitoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPascalitoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPascalito.g"; }



     	private PascalitoGrammarAccess grammarAccess;

        public InternalPascalitoParser(TokenStream input, PascalitoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Programa";
       	}

       	@Override
       	protected PascalitoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePrograma"
    // InternalPascalito.g:64:1: entryRulePrograma returns [EObject current=null] : iv_rulePrograma= rulePrograma EOF ;
    public final EObject entryRulePrograma() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrograma = null;


        try {
            // InternalPascalito.g:64:49: (iv_rulePrograma= rulePrograma EOF )
            // InternalPascalito.g:65:2: iv_rulePrograma= rulePrograma EOF
            {
             newCompositeNode(grammarAccess.getProgramaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrograma=rulePrograma();

            state._fsp--;

             current =iv_rulePrograma; 
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
    // $ANTLR end "entryRulePrograma"


    // $ANTLR start "rulePrograma"
    // InternalPascalito.g:71:1: rulePrograma returns [EObject current=null] : (otherlv_0= 'programa' ( (lv_Ident_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_bloco_3_0= ruleBloco ) ) otherlv_4= '}' ) ;
    public final EObject rulePrograma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_Ident_1_0 = null;

        EObject lv_bloco_3_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:77:2: ( (otherlv_0= 'programa' ( (lv_Ident_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_bloco_3_0= ruleBloco ) ) otherlv_4= '}' ) )
            // InternalPascalito.g:78:2: (otherlv_0= 'programa' ( (lv_Ident_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_bloco_3_0= ruleBloco ) ) otherlv_4= '}' )
            {
            // InternalPascalito.g:78:2: (otherlv_0= 'programa' ( (lv_Ident_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_bloco_3_0= ruleBloco ) ) otherlv_4= '}' )
            // InternalPascalito.g:79:3: otherlv_0= 'programa' ( (lv_Ident_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_bloco_3_0= ruleBloco ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramaAccess().getProgramaKeyword_0());
            		
            // InternalPascalito.g:83:3: ( (lv_Ident_1_0= ruleEString ) )
            // InternalPascalito.g:84:4: (lv_Ident_1_0= ruleEString )
            {
            // InternalPascalito.g:84:4: (lv_Ident_1_0= ruleEString )
            // InternalPascalito.g:85:5: lv_Ident_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProgramaAccess().getIdentEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_Ident_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramaRule());
            					}
            					set(
            						current,
            						"Ident",
            						lv_Ident_1_0,
            						"org.xtext.example.mydsl.Pascalito.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPascalito.g:106:3: ( (lv_bloco_3_0= ruleBloco ) )
            // InternalPascalito.g:107:4: (lv_bloco_3_0= ruleBloco )
            {
            // InternalPascalito.g:107:4: (lv_bloco_3_0= ruleBloco )
            // InternalPascalito.g:108:5: lv_bloco_3_0= ruleBloco
            {

            					newCompositeNode(grammarAccess.getProgramaAccess().getBlocoBlocoParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_bloco_3_0=ruleBloco();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramaRule());
            					}
            					set(
            						current,
            						"bloco",
            						lv_bloco_3_0,
            						"org.xtext.example.mydsl.Pascalito.Bloco");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProgramaAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePrograma"


    // $ANTLR start "entryRuleComando"
    // InternalPascalito.g:133:1: entryRuleComando returns [EObject current=null] : iv_ruleComando= ruleComando EOF ;
    public final EObject entryRuleComando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComando = null;


        try {
            // InternalPascalito.g:133:48: (iv_ruleComando= ruleComando EOF )
            // InternalPascalito.g:134:2: iv_ruleComando= ruleComando EOF
            {
             newCompositeNode(grammarAccess.getComandoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComando=ruleComando();

            state._fsp--;

             current =iv_ruleComando; 
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
    // $ANTLR end "entryRuleComando"


    // $ANTLR start "ruleComando"
    // InternalPascalito.g:140:1: ruleComando returns [EObject current=null] : (this_CallProcedimento_0= ruleCallProcedimento | this_Atribuicao_1= ruleAtribuicao | this_Desvio_2= ruleDesvio | this_Loop_3= ruleLoop ) ;
    public final EObject ruleComando() throws RecognitionException {
        EObject current = null;

        EObject this_CallProcedimento_0 = null;

        EObject this_Atribuicao_1 = null;

        EObject this_Desvio_2 = null;

        EObject this_Loop_3 = null;



        	enterRule();

        try {
            // InternalPascalito.g:146:2: ( (this_CallProcedimento_0= ruleCallProcedimento | this_Atribuicao_1= ruleAtribuicao | this_Desvio_2= ruleDesvio | this_Loop_3= ruleLoop ) )
            // InternalPascalito.g:147:2: (this_CallProcedimento_0= ruleCallProcedimento | this_Atribuicao_1= ruleAtribuicao | this_Desvio_2= ruleDesvio | this_Loop_3= ruleLoop )
            {
            // InternalPascalito.g:147:2: (this_CallProcedimento_0= ruleCallProcedimento | this_Atribuicao_1= ruleAtribuicao | this_Desvio_2= ruleDesvio | this_Loop_3= ruleLoop )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
                {
                alt1=2;
                }
                break;
            case 26:
                {
                alt1=3;
                }
                break;
            case 30:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPascalito.g:148:3: this_CallProcedimento_0= ruleCallProcedimento
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getCallProcedimentoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallProcedimento_0=ruleCallProcedimento();

                    state._fsp--;


                    			current = this_CallProcedimento_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPascalito.g:157:3: this_Atribuicao_1= ruleAtribuicao
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getAtribuicaoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atribuicao_1=ruleAtribuicao();

                    state._fsp--;


                    			current = this_Atribuicao_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPascalito.g:166:3: this_Desvio_2= ruleDesvio
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getDesvioParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Desvio_2=ruleDesvio();

                    state._fsp--;


                    			current = this_Desvio_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPascalito.g:175:3: this_Loop_3= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getLoopParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_3=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_3;
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
    // $ANTLR end "ruleComando"


    // $ANTLR start "entryRuleExpressao"
    // InternalPascalito.g:187:1: entryRuleExpressao returns [EObject current=null] : iv_ruleExpressao= ruleExpressao EOF ;
    public final EObject entryRuleExpressao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressao = null;


        try {
            // InternalPascalito.g:187:50: (iv_ruleExpressao= ruleExpressao EOF )
            // InternalPascalito.g:188:2: iv_ruleExpressao= ruleExpressao EOF
            {
             newCompositeNode(grammarAccess.getExpressaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressao=ruleExpressao();

            state._fsp--;

             current =iv_ruleExpressao; 
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
    // $ANTLR end "entryRuleExpressao"


    // $ANTLR start "ruleExpressao"
    // InternalPascalito.g:194:1: ruleExpressao returns [EObject current=null] : (this_CallVariavel_0= ruleCallVariavel | this_Number_1= ruleNumber | this_ExpBinLogica_2= ruleExpBinLogica | this_ExpBin_3= ruleExpBin | this_ExpNeg_4= ruleExpNeg ) ;
    public final EObject ruleExpressao() throws RecognitionException {
        EObject current = null;

        EObject this_CallVariavel_0 = null;

        EObject this_Number_1 = null;

        EObject this_ExpBinLogica_2 = null;

        EObject this_ExpBin_3 = null;

        EObject this_ExpNeg_4 = null;



        	enterRule();

        try {
            // InternalPascalito.g:200:2: ( (this_CallVariavel_0= ruleCallVariavel | this_Number_1= ruleNumber | this_ExpBinLogica_2= ruleExpBinLogica | this_ExpBin_3= ruleExpBin | this_ExpNeg_4= ruleExpNeg ) )
            // InternalPascalito.g:201:2: (this_CallVariavel_0= ruleCallVariavel | this_Number_1= ruleNumber | this_ExpBinLogica_2= ruleExpBinLogica | this_ExpBin_3= ruleExpBin | this_ExpNeg_4= ruleExpNeg )
            {
            // InternalPascalito.g:201:2: (this_CallVariavel_0= ruleCallVariavel | this_Number_1= ruleNumber | this_ExpBinLogica_2= ruleExpBinLogica | this_ExpBin_3= ruleExpBin | this_ExpNeg_4= ruleExpNeg )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt2=1;
                }
                break;
            case RULE_INT:
            case 43:
                {
                alt2=2;
                }
                break;
            case 35:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==40) ) {
                    alt2=4;
                }
                else if ( (LA2_3==36) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                alt2=3;
                }
                break;
            case 40:
                {
                alt2=4;
                }
                break;
            case 41:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPascalito.g:202:3: this_CallVariavel_0= ruleCallVariavel
                    {

                    			newCompositeNode(grammarAccess.getExpressaoAccess().getCallVariavelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallVariavel_0=ruleCallVariavel();

                    state._fsp--;


                    			current = this_CallVariavel_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPascalito.g:211:3: this_Number_1= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getExpressaoAccess().getNumberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_1=ruleNumber();

                    state._fsp--;


                    			current = this_Number_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPascalito.g:220:3: this_ExpBinLogica_2= ruleExpBinLogica
                    {

                    			newCompositeNode(grammarAccess.getExpressaoAccess().getExpBinLogicaParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpBinLogica_2=ruleExpBinLogica();

                    state._fsp--;


                    			current = this_ExpBinLogica_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPascalito.g:229:3: this_ExpBin_3= ruleExpBin
                    {

                    			newCompositeNode(grammarAccess.getExpressaoAccess().getExpBinParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpBin_3=ruleExpBin();

                    state._fsp--;


                    			current = this_ExpBin_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPascalito.g:238:3: this_ExpNeg_4= ruleExpNeg
                    {

                    			newCompositeNode(grammarAccess.getExpressaoAccess().getExpNegParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpNeg_4=ruleExpNeg();

                    state._fsp--;


                    			current = this_ExpNeg_4;
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
    // $ANTLR end "ruleExpressao"


    // $ANTLR start "entryRuleEString"
    // InternalPascalito.g:250:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPascalito.g:250:47: (iv_ruleEString= ruleEString EOF )
            // InternalPascalito.g:251:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPascalito.g:257:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPascalito.g:263:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPascalito.g:264:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPascalito.g:264:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPascalito.g:265:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascalito.g:273:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleBloco"
    // InternalPascalito.g:284:1: entryRuleBloco returns [EObject current=null] : iv_ruleBloco= ruleBloco EOF ;
    public final EObject entryRuleBloco() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBloco = null;


        try {
            // InternalPascalito.g:284:46: (iv_ruleBloco= ruleBloco EOF )
            // InternalPascalito.g:285:2: iv_ruleBloco= ruleBloco EOF
            {
             newCompositeNode(grammarAccess.getBlocoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBloco=ruleBloco();

            state._fsp--;

             current =iv_ruleBloco; 
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
    // $ANTLR end "entryRuleBloco"


    // $ANTLR start "ruleBloco"
    // InternalPascalito.g:291:1: ruleBloco returns [EObject current=null] : ( () (otherlv_1= 'var' ( (lv_defvariavel_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_defvariavel_4_0= ruleVariavel ) ) )* otherlv_5= ';' )* (otherlv_6= 'procedimento' ( (lv_defprocedimento_7_0= ruleProcedimento ) ) )* otherlv_8= 'Inicio' ( (lv_executa_9_0= ruleComando ) )* otherlv_10= 'Fim' ) ;
    public final EObject ruleBloco() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_defvariavel_2_0 = null;

        EObject lv_defvariavel_4_0 = null;

        EObject lv_defprocedimento_7_0 = null;

        EObject lv_executa_9_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:297:2: ( ( () (otherlv_1= 'var' ( (lv_defvariavel_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_defvariavel_4_0= ruleVariavel ) ) )* otherlv_5= ';' )* (otherlv_6= 'procedimento' ( (lv_defprocedimento_7_0= ruleProcedimento ) ) )* otherlv_8= 'Inicio' ( (lv_executa_9_0= ruleComando ) )* otherlv_10= 'Fim' ) )
            // InternalPascalito.g:298:2: ( () (otherlv_1= 'var' ( (lv_defvariavel_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_defvariavel_4_0= ruleVariavel ) ) )* otherlv_5= ';' )* (otherlv_6= 'procedimento' ( (lv_defprocedimento_7_0= ruleProcedimento ) ) )* otherlv_8= 'Inicio' ( (lv_executa_9_0= ruleComando ) )* otherlv_10= 'Fim' )
            {
            // InternalPascalito.g:298:2: ( () (otherlv_1= 'var' ( (lv_defvariavel_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_defvariavel_4_0= ruleVariavel ) ) )* otherlv_5= ';' )* (otherlv_6= 'procedimento' ( (lv_defprocedimento_7_0= ruleProcedimento ) ) )* otherlv_8= 'Inicio' ( (lv_executa_9_0= ruleComando ) )* otherlv_10= 'Fim' )
            // InternalPascalito.g:299:3: () (otherlv_1= 'var' ( (lv_defvariavel_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_defvariavel_4_0= ruleVariavel ) ) )* otherlv_5= ';' )* (otherlv_6= 'procedimento' ( (lv_defprocedimento_7_0= ruleProcedimento ) ) )* otherlv_8= 'Inicio' ( (lv_executa_9_0= ruleComando ) )* otherlv_10= 'Fim'
            {
            // InternalPascalito.g:299:3: ()
            // InternalPascalito.g:300:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlocoAccess().getBlocoAction_0(),
            					current);
            			

            }

            // InternalPascalito.g:306:3: (otherlv_1= 'var' ( (lv_defvariavel_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_defvariavel_4_0= ruleVariavel ) ) )* otherlv_5= ';' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPascalito.g:307:4: otherlv_1= 'var' ( (lv_defvariavel_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_defvariavel_4_0= ruleVariavel ) ) )* otherlv_5= ';'
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getBlocoAccess().getVarKeyword_1_0());
            	    			
            	    // InternalPascalito.g:311:4: ( (lv_defvariavel_2_0= ruleVariavel ) )
            	    // InternalPascalito.g:312:5: (lv_defvariavel_2_0= ruleVariavel )
            	    {
            	    // InternalPascalito.g:312:5: (lv_defvariavel_2_0= ruleVariavel )
            	    // InternalPascalito.g:313:6: lv_defvariavel_2_0= ruleVariavel
            	    {

            	    						newCompositeNode(grammarAccess.getBlocoAccess().getDefvariavelVariavelParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_defvariavel_2_0=ruleVariavel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlocoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"defvariavel",
            	    							lv_defvariavel_2_0,
            	    							"org.xtext.example.mydsl.Pascalito.Variavel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalPascalito.g:330:4: (otherlv_3= ',' ( (lv_defvariavel_4_0= ruleVariavel ) ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==15) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalPascalito.g:331:5: otherlv_3= ',' ( (lv_defvariavel_4_0= ruleVariavel ) )
            	    	    {
            	    	    otherlv_3=(Token)match(input,15,FOLLOW_7); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getBlocoAccess().getCommaKeyword_1_2_0());
            	    	    				
            	    	    // InternalPascalito.g:335:5: ( (lv_defvariavel_4_0= ruleVariavel ) )
            	    	    // InternalPascalito.g:336:6: (lv_defvariavel_4_0= ruleVariavel )
            	    	    {
            	    	    // InternalPascalito.g:336:6: (lv_defvariavel_4_0= ruleVariavel )
            	    	    // InternalPascalito.g:337:7: lv_defvariavel_4_0= ruleVariavel
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getBlocoAccess().getDefvariavelVariavelParserRuleCall_1_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_defvariavel_4_0=ruleVariavel();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getBlocoRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"defvariavel",
            	    	    								lv_defvariavel_4_0,
            	    	    								"org.xtext.example.mydsl.Pascalito.Variavel");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    otherlv_5=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getBlocoAccess().getSemicolonKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalPascalito.g:360:3: (otherlv_6= 'procedimento' ( (lv_defprocedimento_7_0= ruleProcedimento ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPascalito.g:361:4: otherlv_6= 'procedimento' ( (lv_defprocedimento_7_0= ruleProcedimento ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getBlocoAccess().getProcedimentoKeyword_2_0());
            	    			
            	    // InternalPascalito.g:365:4: ( (lv_defprocedimento_7_0= ruleProcedimento ) )
            	    // InternalPascalito.g:366:5: (lv_defprocedimento_7_0= ruleProcedimento )
            	    {
            	    // InternalPascalito.g:366:5: (lv_defprocedimento_7_0= ruleProcedimento )
            	    // InternalPascalito.g:367:6: lv_defprocedimento_7_0= ruleProcedimento
            	    {

            	    						newCompositeNode(grammarAccess.getBlocoAccess().getDefprocedimentoProcedimentoParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_defprocedimento_7_0=ruleProcedimento();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlocoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"defprocedimento",
            	    							lv_defprocedimento_7_0,
            	    							"org.xtext.example.mydsl.Pascalito.Procedimento");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getBlocoAccess().getInicioKeyword_3());
            		
            // InternalPascalito.g:389:3: ( (lv_executa_9_0= ruleComando ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==22||LA7_0==26||LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPascalito.g:390:4: (lv_executa_9_0= ruleComando )
            	    {
            	    // InternalPascalito.g:390:4: (lv_executa_9_0= ruleComando )
            	    // InternalPascalito.g:391:5: lv_executa_9_0= ruleComando
            	    {

            	    					newCompositeNode(grammarAccess.getBlocoAccess().getExecutaComandoParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_executa_9_0=ruleComando();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBlocoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"executa",
            	    						lv_executa_9_0,
            	    						"org.xtext.example.mydsl.Pascalito.Comando");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getBlocoAccess().getFimKeyword_5());
            		

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
    // $ANTLR end "ruleBloco"


    // $ANTLR start "entryRuleVariavel"
    // InternalPascalito.g:416:1: entryRuleVariavel returns [EObject current=null] : iv_ruleVariavel= ruleVariavel EOF ;
    public final EObject entryRuleVariavel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariavel = null;


        try {
            // InternalPascalito.g:416:49: (iv_ruleVariavel= ruleVariavel EOF )
            // InternalPascalito.g:417:2: iv_ruleVariavel= ruleVariavel EOF
            {
             newCompositeNode(grammarAccess.getVariavelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariavel=ruleVariavel();

            state._fsp--;

             current =iv_ruleVariavel; 
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
    // $ANTLR end "entryRuleVariavel"


    // $ANTLR start "ruleVariavel"
    // InternalPascalito.g:423:1: ruleVariavel returns [EObject current=null] : ( () ( (lv_Nome_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariavel() throws RecognitionException {
        EObject current = null;

        Token lv_Nome_1_0=null;


        	enterRule();

        try {
            // InternalPascalito.g:429:2: ( ( () ( (lv_Nome_1_0= RULE_ID ) ) ) )
            // InternalPascalito.g:430:2: ( () ( (lv_Nome_1_0= RULE_ID ) ) )
            {
            // InternalPascalito.g:430:2: ( () ( (lv_Nome_1_0= RULE_ID ) ) )
            // InternalPascalito.g:431:3: () ( (lv_Nome_1_0= RULE_ID ) )
            {
            // InternalPascalito.g:431:3: ()
            // InternalPascalito.g:432:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariavelAccess().getVariavelAction_0(),
            					current);
            			

            }

            // InternalPascalito.g:438:3: ( (lv_Nome_1_0= RULE_ID ) )
            // InternalPascalito.g:439:4: (lv_Nome_1_0= RULE_ID )
            {
            // InternalPascalito.g:439:4: (lv_Nome_1_0= RULE_ID )
            // InternalPascalito.g:440:5: lv_Nome_1_0= RULE_ID
            {
            lv_Nome_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_Nome_1_0, grammarAccess.getVariavelAccess().getNomeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariavelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Nome",
            						lv_Nome_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleVariavel"


    // $ANTLR start "entryRuleProcedimento"
    // InternalPascalito.g:460:1: entryRuleProcedimento returns [EObject current=null] : iv_ruleProcedimento= ruleProcedimento EOF ;
    public final EObject entryRuleProcedimento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedimento = null;


        try {
            // InternalPascalito.g:460:53: (iv_ruleProcedimento= ruleProcedimento EOF )
            // InternalPascalito.g:461:2: iv_ruleProcedimento= ruleProcedimento EOF
            {
             newCompositeNode(grammarAccess.getProcedimentoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcedimento=ruleProcedimento();

            state._fsp--;

             current =iv_ruleProcedimento; 
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
    // $ANTLR end "entryRuleProcedimento"


    // $ANTLR start "ruleProcedimento"
    // InternalPascalito.g:467:1: ruleProcedimento returns [EObject current=null] : ( ( ( (lv_Identificador_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_listaparmetros_2_0= ruleListaParmetros ) ) otherlv_3= ')' ) otherlv_4= '{' ( (lv_bloco_5_0= ruleBloco ) ) otherlv_6= '}' ) ;
    public final EObject ruleProcedimento() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_Identificador_0_0 = null;

        EObject lv_listaparmetros_2_0 = null;

        EObject lv_bloco_5_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:473:2: ( ( ( ( (lv_Identificador_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_listaparmetros_2_0= ruleListaParmetros ) ) otherlv_3= ')' ) otherlv_4= '{' ( (lv_bloco_5_0= ruleBloco ) ) otherlv_6= '}' ) )
            // InternalPascalito.g:474:2: ( ( ( (lv_Identificador_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_listaparmetros_2_0= ruleListaParmetros ) ) otherlv_3= ')' ) otherlv_4= '{' ( (lv_bloco_5_0= ruleBloco ) ) otherlv_6= '}' )
            {
            // InternalPascalito.g:474:2: ( ( ( (lv_Identificador_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_listaparmetros_2_0= ruleListaParmetros ) ) otherlv_3= ')' ) otherlv_4= '{' ( (lv_bloco_5_0= ruleBloco ) ) otherlv_6= '}' )
            // InternalPascalito.g:475:3: ( ( (lv_Identificador_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_listaparmetros_2_0= ruleListaParmetros ) ) otherlv_3= ')' ) otherlv_4= '{' ( (lv_bloco_5_0= ruleBloco ) ) otherlv_6= '}'
            {
            // InternalPascalito.g:475:3: ( ( (lv_Identificador_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_listaparmetros_2_0= ruleListaParmetros ) ) otherlv_3= ')' )
            // InternalPascalito.g:476:4: ( (lv_Identificador_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_listaparmetros_2_0= ruleListaParmetros ) ) otherlv_3= ')'
            {
            // InternalPascalito.g:476:4: ( (lv_Identificador_0_0= ruleEString ) )
            // InternalPascalito.g:477:5: (lv_Identificador_0_0= ruleEString )
            {
            // InternalPascalito.g:477:5: (lv_Identificador_0_0= ruleEString )
            // InternalPascalito.g:478:6: lv_Identificador_0_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getProcedimentoAccess().getIdentificadorEStringParserRuleCall_0_0_0());
            					
            pushFollow(FOLLOW_11);
            lv_Identificador_0_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getProcedimentoRule());
            						}
            						set(
            							current,
            							"Identificador",
            							lv_Identificador_0_0,
            							"org.xtext.example.mydsl.Pascalito.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            				newLeafNode(otherlv_1, grammarAccess.getProcedimentoAccess().getLeftParenthesisKeyword_0_1());
            			
            // InternalPascalito.g:499:4: ( (lv_listaparmetros_2_0= ruleListaParmetros ) )
            // InternalPascalito.g:500:5: (lv_listaparmetros_2_0= ruleListaParmetros )
            {
            // InternalPascalito.g:500:5: (lv_listaparmetros_2_0= ruleListaParmetros )
            // InternalPascalito.g:501:6: lv_listaparmetros_2_0= ruleListaParmetros
            {

            						newCompositeNode(grammarAccess.getProcedimentoAccess().getListaparmetrosListaParmetrosParserRuleCall_0_2_0());
            					
            pushFollow(FOLLOW_13);
            lv_listaparmetros_2_0=ruleListaParmetros();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getProcedimentoRule());
            						}
            						set(
            							current,
            							"listaparmetros",
            							lv_listaparmetros_2_0,
            							"org.xtext.example.mydsl.Pascalito.ListaParmetros");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_4); 

            				newLeafNode(otherlv_3, grammarAccess.getProcedimentoAccess().getRightParenthesisKeyword_0_3());
            			

            }

            otherlv_4=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getProcedimentoAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPascalito.g:527:3: ( (lv_bloco_5_0= ruleBloco ) )
            // InternalPascalito.g:528:4: (lv_bloco_5_0= ruleBloco )
            {
            // InternalPascalito.g:528:4: (lv_bloco_5_0= ruleBloco )
            // InternalPascalito.g:529:5: lv_bloco_5_0= ruleBloco
            {

            					newCompositeNode(grammarAccess.getProcedimentoAccess().getBlocoBlocoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_bloco_5_0=ruleBloco();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedimentoRule());
            					}
            					set(
            						current,
            						"bloco",
            						lv_bloco_5_0,
            						"org.xtext.example.mydsl.Pascalito.Bloco");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProcedimentoAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleProcedimento"


    // $ANTLR start "entryRuleListaParmetros"
    // InternalPascalito.g:554:1: entryRuleListaParmetros returns [EObject current=null] : iv_ruleListaParmetros= ruleListaParmetros EOF ;
    public final EObject entryRuleListaParmetros() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListaParmetros = null;


        try {
            // InternalPascalito.g:554:55: (iv_ruleListaParmetros= ruleListaParmetros EOF )
            // InternalPascalito.g:555:2: iv_ruleListaParmetros= ruleListaParmetros EOF
            {
             newCompositeNode(grammarAccess.getListaParmetrosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListaParmetros=ruleListaParmetros();

            state._fsp--;

             current =iv_ruleListaParmetros; 
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
    // $ANTLR end "entryRuleListaParmetros"


    // $ANTLR start "ruleListaParmetros"
    // InternalPascalito.g:561:1: ruleListaParmetros returns [EObject current=null] : ( () ( ( (lv_variavel_1_0= ruleVariavel ) ) (otherlv_2= ',' ( (lv_variavel_3_0= ruleVariavel ) ) )* )? ) ;
    public final EObject ruleListaParmetros() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_variavel_1_0 = null;

        EObject lv_variavel_3_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:567:2: ( ( () ( ( (lv_variavel_1_0= ruleVariavel ) ) (otherlv_2= ',' ( (lv_variavel_3_0= ruleVariavel ) ) )* )? ) )
            // InternalPascalito.g:568:2: ( () ( ( (lv_variavel_1_0= ruleVariavel ) ) (otherlv_2= ',' ( (lv_variavel_3_0= ruleVariavel ) ) )* )? )
            {
            // InternalPascalito.g:568:2: ( () ( ( (lv_variavel_1_0= ruleVariavel ) ) (otherlv_2= ',' ( (lv_variavel_3_0= ruleVariavel ) ) )* )? )
            // InternalPascalito.g:569:3: () ( ( (lv_variavel_1_0= ruleVariavel ) ) (otherlv_2= ',' ( (lv_variavel_3_0= ruleVariavel ) ) )* )?
            {
            // InternalPascalito.g:569:3: ()
            // InternalPascalito.g:570:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListaParmetrosAccess().getListaParmetrosAction_0(),
            					current);
            			

            }

            // InternalPascalito.g:576:3: ( ( (lv_variavel_1_0= ruleVariavel ) ) (otherlv_2= ',' ( (lv_variavel_3_0= ruleVariavel ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascalito.g:577:4: ( (lv_variavel_1_0= ruleVariavel ) ) (otherlv_2= ',' ( (lv_variavel_3_0= ruleVariavel ) ) )*
                    {
                    // InternalPascalito.g:577:4: ( (lv_variavel_1_0= ruleVariavel ) )
                    // InternalPascalito.g:578:5: (lv_variavel_1_0= ruleVariavel )
                    {
                    // InternalPascalito.g:578:5: (lv_variavel_1_0= ruleVariavel )
                    // InternalPascalito.g:579:6: lv_variavel_1_0= ruleVariavel
                    {

                    						newCompositeNode(grammarAccess.getListaParmetrosAccess().getVariavelVariavelParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_variavel_1_0=ruleVariavel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getListaParmetrosRule());
                    						}
                    						add(
                    							current,
                    							"variavel",
                    							lv_variavel_1_0,
                    							"org.xtext.example.mydsl.Pascalito.Variavel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascalito.g:596:4: (otherlv_2= ',' ( (lv_variavel_3_0= ruleVariavel ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalPascalito.g:597:5: otherlv_2= ',' ( (lv_variavel_3_0= ruleVariavel ) )
                    	    {
                    	    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getListaParmetrosAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalPascalito.g:601:5: ( (lv_variavel_3_0= ruleVariavel ) )
                    	    // InternalPascalito.g:602:6: (lv_variavel_3_0= ruleVariavel )
                    	    {
                    	    // InternalPascalito.g:602:6: (lv_variavel_3_0= ruleVariavel )
                    	    // InternalPascalito.g:603:7: lv_variavel_3_0= ruleVariavel
                    	    {

                    	    							newCompositeNode(grammarAccess.getListaParmetrosAccess().getVariavelVariavelParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_variavel_3_0=ruleVariavel();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getListaParmetrosRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variavel",
                    	    								lv_variavel_3_0,
                    	    								"org.xtext.example.mydsl.Pascalito.Variavel");
                    	    							afterParserOrEnumRuleCall();
                    	    						

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
    // $ANTLR end "ruleListaParmetros"


    // $ANTLR start "entryRuleCallProcedimento"
    // InternalPascalito.g:626:1: entryRuleCallProcedimento returns [EObject current=null] : iv_ruleCallProcedimento= ruleCallProcedimento EOF ;
    public final EObject entryRuleCallProcedimento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallProcedimento = null;


        try {
            // InternalPascalito.g:626:57: (iv_ruleCallProcedimento= ruleCallProcedimento EOF )
            // InternalPascalito.g:627:2: iv_ruleCallProcedimento= ruleCallProcedimento EOF
            {
             newCompositeNode(grammarAccess.getCallProcedimentoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallProcedimento=ruleCallProcedimento();

            state._fsp--;

             current =iv_ruleCallProcedimento; 
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
    // $ANTLR end "entryRuleCallProcedimento"


    // $ANTLR start "ruleCallProcedimento"
    // InternalPascalito.g:633:1: ruleCallProcedimento returns [EObject current=null] : (otherlv_0= 'CallProcedimento' otherlv_1= '{' otherlv_2= 'definido' ( ( ruleEString ) ) (otherlv_4= 'parametro' otherlv_5= '{' ( (lv_parametro_6_0= ruleExpressao ) ) (otherlv_7= ',' ( (lv_parametro_8_0= ruleExpressao ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleCallProcedimento() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_parametro_6_0 = null;

        EObject lv_parametro_8_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:639:2: ( (otherlv_0= 'CallProcedimento' otherlv_1= '{' otherlv_2= 'definido' ( ( ruleEString ) ) (otherlv_4= 'parametro' otherlv_5= '{' ( (lv_parametro_6_0= ruleExpressao ) ) (otherlv_7= ',' ( (lv_parametro_8_0= ruleExpressao ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalPascalito.g:640:2: (otherlv_0= 'CallProcedimento' otherlv_1= '{' otherlv_2= 'definido' ( ( ruleEString ) ) (otherlv_4= 'parametro' otherlv_5= '{' ( (lv_parametro_6_0= ruleExpressao ) ) (otherlv_7= ',' ( (lv_parametro_8_0= ruleExpressao ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalPascalito.g:640:2: (otherlv_0= 'CallProcedimento' otherlv_1= '{' otherlv_2= 'definido' ( ( ruleEString ) ) (otherlv_4= 'parametro' otherlv_5= '{' ( (lv_parametro_6_0= ruleExpressao ) ) (otherlv_7= ',' ( (lv_parametro_8_0= ruleExpressao ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalPascalito.g:641:3: otherlv_0= 'CallProcedimento' otherlv_1= '{' otherlv_2= 'definido' ( ( ruleEString ) ) (otherlv_4= 'parametro' otherlv_5= '{' ( (lv_parametro_6_0= ruleExpressao ) ) (otherlv_7= ',' ( (lv_parametro_8_0= ruleExpressao ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCallProcedimentoAccess().getCallProcedimentoKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getCallProcedimentoAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCallProcedimentoAccess().getDefinidoKeyword_2());
            		
            // InternalPascalito.g:653:3: ( ( ruleEString ) )
            // InternalPascalito.g:654:4: ( ruleEString )
            {
            // InternalPascalito.g:654:4: ( ruleEString )
            // InternalPascalito.g:655:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallProcedimentoRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCallProcedimentoAccess().getDefinidoProcedimentoCrossReference_3_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascalito.g:669:3: (otherlv_4= 'parametro' otherlv_5= '{' ( (lv_parametro_6_0= ruleExpressao ) ) (otherlv_7= ',' ( (lv_parametro_8_0= ruleExpressao ) ) )* otherlv_9= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPascalito.g:670:4: otherlv_4= 'parametro' otherlv_5= '{' ( (lv_parametro_6_0= ruleExpressao ) ) (otherlv_7= ',' ( (lv_parametro_8_0= ruleExpressao ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getCallProcedimentoAccess().getParametroKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getCallProcedimentoAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalPascalito.g:678:4: ( (lv_parametro_6_0= ruleExpressao ) )
                    // InternalPascalito.g:679:5: (lv_parametro_6_0= ruleExpressao )
                    {
                    // InternalPascalito.g:679:5: (lv_parametro_6_0= ruleExpressao )
                    // InternalPascalito.g:680:6: lv_parametro_6_0= ruleExpressao
                    {

                    						newCompositeNode(grammarAccess.getCallProcedimentoAccess().getParametroExpressaoParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parametro_6_0=ruleExpressao();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCallProcedimentoRule());
                    						}
                    						add(
                    							current,
                    							"parametro",
                    							lv_parametro_6_0,
                    							"org.xtext.example.mydsl.Pascalito.Expressao");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascalito.g:697:4: (otherlv_7= ',' ( (lv_parametro_8_0= ruleExpressao ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalPascalito.g:698:5: otherlv_7= ',' ( (lv_parametro_8_0= ruleExpressao ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_17); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCallProcedimentoAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalPascalito.g:702:5: ( (lv_parametro_8_0= ruleExpressao ) )
                    	    // InternalPascalito.g:703:6: (lv_parametro_8_0= ruleExpressao )
                    	    {
                    	    // InternalPascalito.g:703:6: (lv_parametro_8_0= ruleExpressao )
                    	    // InternalPascalito.g:704:7: lv_parametro_8_0= ruleExpressao
                    	    {

                    	    							newCompositeNode(grammarAccess.getCallProcedimentoAccess().getParametroExpressaoParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parametro_8_0=ruleExpressao();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCallProcedimentoRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parametro",
                    	    								lv_parametro_8_0,
                    	    								"org.xtext.example.mydsl.Pascalito.Expressao");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getCallProcedimentoAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCallProcedimentoAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCallProcedimento"


    // $ANTLR start "entryRuleAtribuicao"
    // InternalPascalito.g:735:1: entryRuleAtribuicao returns [EObject current=null] : iv_ruleAtribuicao= ruleAtribuicao EOF ;
    public final EObject entryRuleAtribuicao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtribuicao = null;


        try {
            // InternalPascalito.g:735:51: (iv_ruleAtribuicao= ruleAtribuicao EOF )
            // InternalPascalito.g:736:2: iv_ruleAtribuicao= ruleAtribuicao EOF
            {
             newCompositeNode(grammarAccess.getAtribuicaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtribuicao=ruleAtribuicao();

            state._fsp--;

             current =iv_ruleAtribuicao; 
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
    // $ANTLR end "entryRuleAtribuicao"


    // $ANTLR start "ruleAtribuicao"
    // InternalPascalito.g:742:1: ruleAtribuicao returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_atribuiResultado_2_0= ruleExpressao ) ) ) ;
    public final EObject ruleAtribuicao() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_atribuiResultado_2_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:748:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_atribuiResultado_2_0= ruleExpressao ) ) ) )
            // InternalPascalito.g:749:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_atribuiResultado_2_0= ruleExpressao ) ) )
            {
            // InternalPascalito.g:749:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_atribuiResultado_2_0= ruleExpressao ) ) )
            // InternalPascalito.g:750:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_atribuiResultado_2_0= ruleExpressao ) )
            {
            // InternalPascalito.g:750:3: ( (otherlv_0= RULE_ID ) )
            // InternalPascalito.g:751:4: (otherlv_0= RULE_ID )
            {
            // InternalPascalito.g:751:4: (otherlv_0= RULE_ID )
            // InternalPascalito.g:752:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtribuicaoRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_0, grammarAccess.getAtribuicaoAccess().getAtribuiVariavelCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getAtribuicaoAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalPascalito.g:767:3: ( (lv_atribuiResultado_2_0= ruleExpressao ) )
            // InternalPascalito.g:768:4: (lv_atribuiResultado_2_0= ruleExpressao )
            {
            // InternalPascalito.g:768:4: (lv_atribuiResultado_2_0= ruleExpressao )
            // InternalPascalito.g:769:5: lv_atribuiResultado_2_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getAtribuicaoAccess().getAtribuiResultadoExpressaoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_atribuiResultado_2_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtribuicaoRule());
            					}
            					set(
            						current,
            						"atribuiResultado",
            						lv_atribuiResultado_2_0,
            						"org.xtext.example.mydsl.Pascalito.Expressao");
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
    // $ANTLR end "ruleAtribuicao"


    // $ANTLR start "entryRuleDesvio"
    // InternalPascalito.g:790:1: entryRuleDesvio returns [EObject current=null] : iv_ruleDesvio= ruleDesvio EOF ;
    public final EObject entryRuleDesvio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesvio = null;


        try {
            // InternalPascalito.g:790:47: (iv_ruleDesvio= ruleDesvio EOF )
            // InternalPascalito.g:791:2: iv_ruleDesvio= ruleDesvio EOF
            {
             newCompositeNode(grammarAccess.getDesvioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDesvio=ruleDesvio();

            state._fsp--;

             current =iv_ruleDesvio; 
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
    // $ANTLR end "entryRuleDesvio"


    // $ANTLR start "ruleDesvio"
    // InternalPascalito.g:797:1: ruleDesvio returns [EObject current=null] : (otherlv_0= 'Desvio' otherlv_1= '{' otherlv_2= 'se' ( (lv_se_3_0= ruleExpressao ) ) otherlv_4= 'faca' otherlv_5= '{' ( (lv_faca_6_0= ruleComando ) ) (otherlv_7= ',' ( (lv_faca_8_0= ruleComando ) ) )* otherlv_9= '}' (otherlv_10= 'seNao' otherlv_11= '{' ( (lv_seNao_12_0= ruleComando ) ) (otherlv_13= ',' ( (lv_seNao_14_0= ruleComando ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleDesvio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_se_3_0 = null;

        EObject lv_faca_6_0 = null;

        EObject lv_faca_8_0 = null;

        EObject lv_seNao_12_0 = null;

        EObject lv_seNao_14_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:803:2: ( (otherlv_0= 'Desvio' otherlv_1= '{' otherlv_2= 'se' ( (lv_se_3_0= ruleExpressao ) ) otherlv_4= 'faca' otherlv_5= '{' ( (lv_faca_6_0= ruleComando ) ) (otherlv_7= ',' ( (lv_faca_8_0= ruleComando ) ) )* otherlv_9= '}' (otherlv_10= 'seNao' otherlv_11= '{' ( (lv_seNao_12_0= ruleComando ) ) (otherlv_13= ',' ( (lv_seNao_14_0= ruleComando ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalPascalito.g:804:2: (otherlv_0= 'Desvio' otherlv_1= '{' otherlv_2= 'se' ( (lv_se_3_0= ruleExpressao ) ) otherlv_4= 'faca' otherlv_5= '{' ( (lv_faca_6_0= ruleComando ) ) (otherlv_7= ',' ( (lv_faca_8_0= ruleComando ) ) )* otherlv_9= '}' (otherlv_10= 'seNao' otherlv_11= '{' ( (lv_seNao_12_0= ruleComando ) ) (otherlv_13= ',' ( (lv_seNao_14_0= ruleComando ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalPascalito.g:804:2: (otherlv_0= 'Desvio' otherlv_1= '{' otherlv_2= 'se' ( (lv_se_3_0= ruleExpressao ) ) otherlv_4= 'faca' otherlv_5= '{' ( (lv_faca_6_0= ruleComando ) ) (otherlv_7= ',' ( (lv_faca_8_0= ruleComando ) ) )* otherlv_9= '}' (otherlv_10= 'seNao' otherlv_11= '{' ( (lv_seNao_12_0= ruleComando ) ) (otherlv_13= ',' ( (lv_seNao_14_0= ruleComando ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalPascalito.g:805:3: otherlv_0= 'Desvio' otherlv_1= '{' otherlv_2= 'se' ( (lv_se_3_0= ruleExpressao ) ) otherlv_4= 'faca' otherlv_5= '{' ( (lv_faca_6_0= ruleComando ) ) (otherlv_7= ',' ( (lv_faca_8_0= ruleComando ) ) )* otherlv_9= '}' (otherlv_10= 'seNao' otherlv_11= '{' ( (lv_seNao_12_0= ruleComando ) ) (otherlv_13= ',' ( (lv_seNao_14_0= ruleComando ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDesvioAccess().getDesvioKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getDesvioAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getDesvioAccess().getSeKeyword_2());
            		
            // InternalPascalito.g:817:3: ( (lv_se_3_0= ruleExpressao ) )
            // InternalPascalito.g:818:4: (lv_se_3_0= ruleExpressao )
            {
            // InternalPascalito.g:818:4: (lv_se_3_0= ruleExpressao )
            // InternalPascalito.g:819:5: lv_se_3_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getDesvioAccess().getSeExpressaoParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_se_3_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDesvioRule());
            					}
            					set(
            						current,
            						"se",
            						lv_se_3_0,
            						"org.xtext.example.mydsl.Pascalito.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getDesvioAccess().getFacaKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getDesvioAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalPascalito.g:844:3: ( (lv_faca_6_0= ruleComando ) )
            // InternalPascalito.g:845:4: (lv_faca_6_0= ruleComando )
            {
            // InternalPascalito.g:845:4: (lv_faca_6_0= ruleComando )
            // InternalPascalito.g:846:5: lv_faca_6_0= ruleComando
            {

            					newCompositeNode(grammarAccess.getDesvioAccess().getFacaComandoParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
            lv_faca_6_0=ruleComando();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDesvioRule());
            					}
            					add(
            						current,
            						"faca",
            						lv_faca_6_0,
            						"org.xtext.example.mydsl.Pascalito.Comando");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascalito.g:863:3: (otherlv_7= ',' ( (lv_faca_8_0= ruleComando ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPascalito.g:864:4: otherlv_7= ',' ( (lv_faca_8_0= ruleComando ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_22); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDesvioAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalPascalito.g:868:4: ( (lv_faca_8_0= ruleComando ) )
            	    // InternalPascalito.g:869:5: (lv_faca_8_0= ruleComando )
            	    {
            	    // InternalPascalito.g:869:5: (lv_faca_8_0= ruleComando )
            	    // InternalPascalito.g:870:6: lv_faca_8_0= ruleComando
            	    {

            	    						newCompositeNode(grammarAccess.getDesvioAccess().getFacaComandoParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_faca_8_0=ruleComando();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDesvioRule());
            	    						}
            	    						add(
            	    							current,
            	    							"faca",
            	    							lv_faca_8_0,
            	    							"org.xtext.example.mydsl.Pascalito.Comando");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_9, grammarAccess.getDesvioAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalPascalito.g:892:3: (otherlv_10= 'seNao' otherlv_11= '{' ( (lv_seNao_12_0= ruleComando ) ) (otherlv_13= ',' ( (lv_seNao_14_0= ruleComando ) ) )* otherlv_15= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPascalito.g:893:4: otherlv_10= 'seNao' otherlv_11= '{' ( (lv_seNao_12_0= ruleComando ) ) (otherlv_13= ',' ( (lv_seNao_14_0= ruleComando ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getDesvioAccess().getSeNaoKeyword_9_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getDesvioAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalPascalito.g:901:4: ( (lv_seNao_12_0= ruleComando ) )
                    // InternalPascalito.g:902:5: (lv_seNao_12_0= ruleComando )
                    {
                    // InternalPascalito.g:902:5: (lv_seNao_12_0= ruleComando )
                    // InternalPascalito.g:903:6: lv_seNao_12_0= ruleComando
                    {

                    						newCompositeNode(grammarAccess.getDesvioAccess().getSeNaoComandoParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_seNao_12_0=ruleComando();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDesvioRule());
                    						}
                    						add(
                    							current,
                    							"seNao",
                    							lv_seNao_12_0,
                    							"org.xtext.example.mydsl.Pascalito.Comando");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascalito.g:920:4: (otherlv_13= ',' ( (lv_seNao_14_0= ruleComando ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==15) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalPascalito.g:921:5: otherlv_13= ',' ( (lv_seNao_14_0= ruleComando ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_22); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getDesvioAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalPascalito.g:925:5: ( (lv_seNao_14_0= ruleComando ) )
                    	    // InternalPascalito.g:926:6: (lv_seNao_14_0= ruleComando )
                    	    {
                    	    // InternalPascalito.g:926:6: (lv_seNao_14_0= ruleComando )
                    	    // InternalPascalito.g:927:7: lv_seNao_14_0= ruleComando
                    	    {

                    	    							newCompositeNode(grammarAccess.getDesvioAccess().getSeNaoComandoParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_seNao_14_0=ruleComando();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDesvioRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"seNao",
                    	    								lv_seNao_14_0,
                    	    								"org.xtext.example.mydsl.Pascalito.Comando");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getDesvioAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getDesvioAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleDesvio"


    // $ANTLR start "entryRuleLoop"
    // InternalPascalito.g:958:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalPascalito.g:958:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalPascalito.g:959:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalPascalito.g:965:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'Loop' otherlv_1= '{' otherlv_2= 'se' ( (lv_se_3_0= ruleExpressao ) ) otherlv_4= 'faca' otherlv_5= '{' ( (lv_faca_6_0= ruleComando ) ) (otherlv_7= ',' ( (lv_faca_8_0= ruleComando ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_se_3_0 = null;

        EObject lv_faca_6_0 = null;

        EObject lv_faca_8_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:971:2: ( (otherlv_0= 'Loop' otherlv_1= '{' otherlv_2= 'se' ( (lv_se_3_0= ruleExpressao ) ) otherlv_4= 'faca' otherlv_5= '{' ( (lv_faca_6_0= ruleComando ) ) (otherlv_7= ',' ( (lv_faca_8_0= ruleComando ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // InternalPascalito.g:972:2: (otherlv_0= 'Loop' otherlv_1= '{' otherlv_2= 'se' ( (lv_se_3_0= ruleExpressao ) ) otherlv_4= 'faca' otherlv_5= '{' ( (lv_faca_6_0= ruleComando ) ) (otherlv_7= ',' ( (lv_faca_8_0= ruleComando ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // InternalPascalito.g:972:2: (otherlv_0= 'Loop' otherlv_1= '{' otherlv_2= 'se' ( (lv_se_3_0= ruleExpressao ) ) otherlv_4= 'faca' otherlv_5= '{' ( (lv_faca_6_0= ruleComando ) ) (otherlv_7= ',' ( (lv_faca_8_0= ruleComando ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // InternalPascalito.g:973:3: otherlv_0= 'Loop' otherlv_1= '{' otherlv_2= 'se' ( (lv_se_3_0= ruleExpressao ) ) otherlv_4= 'faca' otherlv_5= '{' ( (lv_faca_6_0= ruleComando ) ) (otherlv_7= ',' ( (lv_faca_8_0= ruleComando ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getSeKeyword_2());
            		
            // InternalPascalito.g:985:3: ( (lv_se_3_0= ruleExpressao ) )
            // InternalPascalito.g:986:4: (lv_se_3_0= ruleExpressao )
            {
            // InternalPascalito.g:986:4: (lv_se_3_0= ruleExpressao )
            // InternalPascalito.g:987:5: lv_se_3_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getSeExpressaoParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_se_3_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					set(
            						current,
            						"se",
            						lv_se_3_0,
            						"org.xtext.example.mydsl.Pascalito.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getFacaKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalPascalito.g:1012:3: ( (lv_faca_6_0= ruleComando ) )
            // InternalPascalito.g:1013:4: (lv_faca_6_0= ruleComando )
            {
            // InternalPascalito.g:1013:4: (lv_faca_6_0= ruleComando )
            // InternalPascalito.g:1014:5: lv_faca_6_0= ruleComando
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getFacaComandoParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
            lv_faca_6_0=ruleComando();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					add(
            						current,
            						"faca",
            						lv_faca_6_0,
            						"org.xtext.example.mydsl.Pascalito.Comando");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascalito.g:1031:3: (otherlv_7= ',' ( (lv_faca_8_0= ruleComando ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPascalito.g:1032:4: otherlv_7= ',' ( (lv_faca_8_0= ruleComando ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_22); 

            	    				newLeafNode(otherlv_7, grammarAccess.getLoopAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalPascalito.g:1036:4: ( (lv_faca_8_0= ruleComando ) )
            	    // InternalPascalito.g:1037:5: (lv_faca_8_0= ruleComando )
            	    {
            	    // InternalPascalito.g:1037:5: (lv_faca_8_0= ruleComando )
            	    // InternalPascalito.g:1038:6: lv_faca_8_0= ruleComando
            	    {

            	    						newCompositeNode(grammarAccess.getLoopAccess().getFacaComandoParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_faca_8_0=ruleComando();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLoopRule());
            	    						}
            	    						add(
            	    							current,
            	    							"faca",
            	    							lv_faca_8_0,
            	    							"org.xtext.example.mydsl.Pascalito.Comando");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleEBigDecimal"
    // InternalPascalito.g:1068:1: entryRuleEBigDecimal returns [String current=null] : iv_ruleEBigDecimal= ruleEBigDecimal EOF ;
    public final String entryRuleEBigDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigDecimal = null;


        try {
            // InternalPascalito.g:1068:51: (iv_ruleEBigDecimal= ruleEBigDecimal EOF )
            // InternalPascalito.g:1069:2: iv_ruleEBigDecimal= ruleEBigDecimal EOF
            {
             newCompositeNode(grammarAccess.getEBigDecimalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBigDecimal=ruleEBigDecimal();

            state._fsp--;

             current =iv_ruleEBigDecimal.getText(); 
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
    // $ANTLR end "entryRuleEBigDecimal"


    // $ANTLR start "ruleEBigDecimal"
    // InternalPascalito.g:1075:1: ruleEBigDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEBigDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalPascalito.g:1081:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalPascalito.g:1082:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalPascalito.g:1082:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalPascalito.g:1083:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalPascalito.g:1083:3: (this_INT_0= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPascalito.g:1084:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,31,FOLLOW_25); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEBigDecimalAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleEBigDecimal"


    // $ANTLR start "entryRuleCallVariavel"
    // InternalPascalito.g:1108:1: entryRuleCallVariavel returns [EObject current=null] : iv_ruleCallVariavel= ruleCallVariavel EOF ;
    public final EObject entryRuleCallVariavel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallVariavel = null;


        try {
            // InternalPascalito.g:1108:53: (iv_ruleCallVariavel= ruleCallVariavel EOF )
            // InternalPascalito.g:1109:2: iv_ruleCallVariavel= ruleCallVariavel EOF
            {
             newCompositeNode(grammarAccess.getCallVariavelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallVariavel=ruleCallVariavel();

            state._fsp--;

             current =iv_ruleCallVariavel; 
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
    // $ANTLR end "entryRuleCallVariavel"


    // $ANTLR start "ruleCallVariavel"
    // InternalPascalito.g:1115:1: ruleCallVariavel returns [EObject current=null] : (otherlv_0= 'CallVariavel' otherlv_1= '{' (otherlv_2= 'Prioridade' ( (lv_Prioridade_3_0= ruleEBigDecimal ) ) )? otherlv_4= 'representa' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleCallVariavel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_Prioridade_3_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:1121:2: ( (otherlv_0= 'CallVariavel' otherlv_1= '{' (otherlv_2= 'Prioridade' ( (lv_Prioridade_3_0= ruleEBigDecimal ) ) )? otherlv_4= 'representa' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalPascalito.g:1122:2: (otherlv_0= 'CallVariavel' otherlv_1= '{' (otherlv_2= 'Prioridade' ( (lv_Prioridade_3_0= ruleEBigDecimal ) ) )? otherlv_4= 'representa' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalPascalito.g:1122:2: (otherlv_0= 'CallVariavel' otherlv_1= '{' (otherlv_2= 'Prioridade' ( (lv_Prioridade_3_0= ruleEBigDecimal ) ) )? otherlv_4= 'representa' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalPascalito.g:1123:3: otherlv_0= 'CallVariavel' otherlv_1= '{' (otherlv_2= 'Prioridade' ( (lv_Prioridade_3_0= ruleEBigDecimal ) ) )? otherlv_4= 'representa' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCallVariavelAccess().getCallVariavelKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getCallVariavelAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPascalito.g:1131:3: (otherlv_2= 'Prioridade' ( (lv_Prioridade_3_0= ruleEBigDecimal ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPascalito.g:1132:4: otherlv_2= 'Prioridade' ( (lv_Prioridade_3_0= ruleEBigDecimal ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getCallVariavelAccess().getPrioridadeKeyword_2_0());
                    			
                    // InternalPascalito.g:1136:4: ( (lv_Prioridade_3_0= ruleEBigDecimal ) )
                    // InternalPascalito.g:1137:5: (lv_Prioridade_3_0= ruleEBigDecimal )
                    {
                    // InternalPascalito.g:1137:5: (lv_Prioridade_3_0= ruleEBigDecimal )
                    // InternalPascalito.g:1138:6: lv_Prioridade_3_0= ruleEBigDecimal
                    {

                    						newCompositeNode(grammarAccess.getCallVariavelAccess().getPrioridadeEBigDecimalParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_Prioridade_3_0=ruleEBigDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCallVariavelRule());
                    						}
                    						set(
                    							current,
                    							"Prioridade",
                    							lv_Prioridade_3_0,
                    							"org.xtext.example.mydsl.Pascalito.EBigDecimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getCallVariavelAccess().getRepresentaKeyword_3());
            		
            // InternalPascalito.g:1160:3: ( ( ruleEString ) )
            // InternalPascalito.g:1161:4: ( ruleEString )
            {
            // InternalPascalito.g:1161:4: ( ruleEString )
            // InternalPascalito.g:1162:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallVariavelRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCallVariavelAccess().getRepresentaVariavelCrossReference_4_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCallVariavelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCallVariavel"


    // $ANTLR start "entryRuleNumber"
    // InternalPascalito.g:1184:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalPascalito.g:1184:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalPascalito.g:1185:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalPascalito.g:1191:1: ruleNumber returns [EObject current=null] : ( () ( (lv_Valor_1_0= ruleEInt ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_Valor_1_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:1197:2: ( ( () ( (lv_Valor_1_0= ruleEInt ) ) ) )
            // InternalPascalito.g:1198:2: ( () ( (lv_Valor_1_0= ruleEInt ) ) )
            {
            // InternalPascalito.g:1198:2: ( () ( (lv_Valor_1_0= ruleEInt ) ) )
            // InternalPascalito.g:1199:3: () ( (lv_Valor_1_0= ruleEInt ) )
            {
            // InternalPascalito.g:1199:3: ()
            // InternalPascalito.g:1200:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getNumberAction_0(),
            					current);
            			

            }

            // InternalPascalito.g:1206:3: ( (lv_Valor_1_0= ruleEInt ) )
            // InternalPascalito.g:1207:4: (lv_Valor_1_0= ruleEInt )
            {
            // InternalPascalito.g:1207:4: (lv_Valor_1_0= ruleEInt )
            // InternalPascalito.g:1208:5: lv_Valor_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNumberAccess().getValorEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_Valor_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberRule());
            					}
            					set(
            						current,
            						"Valor",
            						lv_Valor_1_0,
            						"org.xtext.example.mydsl.Pascalito.EInt");
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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleExpBinLogica"
    // InternalPascalito.g:1229:1: entryRuleExpBinLogica returns [EObject current=null] : iv_ruleExpBinLogica= ruleExpBinLogica EOF ;
    public final EObject entryRuleExpBinLogica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpBinLogica = null;


        try {
            // InternalPascalito.g:1229:53: (iv_ruleExpBinLogica= ruleExpBinLogica EOF )
            // InternalPascalito.g:1230:2: iv_ruleExpBinLogica= ruleExpBinLogica EOF
            {
             newCompositeNode(grammarAccess.getExpBinLogicaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpBinLogica=ruleExpBinLogica();

            state._fsp--;

             current =iv_ruleExpBinLogica; 
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
    // $ANTLR end "entryRuleExpBinLogica"


    // $ANTLR start "ruleExpBinLogica"
    // InternalPascalito.g:1236:1: ruleExpBinLogica returns [EObject current=null] : ( ( (lv_Comutativa_0_0= 'Comutativa' ) )? otherlv_1= 'ExpBinLogica' otherlv_2= '{' (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )? otherlv_7= 'operandoEsq' ( (lv_operandoEsq_8_0= ruleExpressao ) ) otherlv_9= 'operandoDir' ( (lv_operandoDir_10_0= ruleExpressao ) ) otherlv_11= '}' ) ;
    public final EObject ruleExpBinLogica() throws RecognitionException {
        EObject current = null;

        Token lv_Comutativa_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_Prioridade_4_0 = null;

        AntlrDatatypeRuleToken lv_Operador_6_0 = null;

        EObject lv_operandoEsq_8_0 = null;

        EObject lv_operandoDir_10_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:1242:2: ( ( ( (lv_Comutativa_0_0= 'Comutativa' ) )? otherlv_1= 'ExpBinLogica' otherlv_2= '{' (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )? otherlv_7= 'operandoEsq' ( (lv_operandoEsq_8_0= ruleExpressao ) ) otherlv_9= 'operandoDir' ( (lv_operandoDir_10_0= ruleExpressao ) ) otherlv_11= '}' ) )
            // InternalPascalito.g:1243:2: ( ( (lv_Comutativa_0_0= 'Comutativa' ) )? otherlv_1= 'ExpBinLogica' otherlv_2= '{' (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )? otherlv_7= 'operandoEsq' ( (lv_operandoEsq_8_0= ruleExpressao ) ) otherlv_9= 'operandoDir' ( (lv_operandoDir_10_0= ruleExpressao ) ) otherlv_11= '}' )
            {
            // InternalPascalito.g:1243:2: ( ( (lv_Comutativa_0_0= 'Comutativa' ) )? otherlv_1= 'ExpBinLogica' otherlv_2= '{' (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )? otherlv_7= 'operandoEsq' ( (lv_operandoEsq_8_0= ruleExpressao ) ) otherlv_9= 'operandoDir' ( (lv_operandoDir_10_0= ruleExpressao ) ) otherlv_11= '}' )
            // InternalPascalito.g:1244:3: ( (lv_Comutativa_0_0= 'Comutativa' ) )? otherlv_1= 'ExpBinLogica' otherlv_2= '{' (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )? otherlv_7= 'operandoEsq' ( (lv_operandoEsq_8_0= ruleExpressao ) ) otherlv_9= 'operandoDir' ( (lv_operandoDir_10_0= ruleExpressao ) ) otherlv_11= '}'
            {
            // InternalPascalito.g:1244:3: ( (lv_Comutativa_0_0= 'Comutativa' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPascalito.g:1245:4: (lv_Comutativa_0_0= 'Comutativa' )
                    {
                    // InternalPascalito.g:1245:4: (lv_Comutativa_0_0= 'Comutativa' )
                    // InternalPascalito.g:1246:5: lv_Comutativa_0_0= 'Comutativa'
                    {
                    lv_Comutativa_0_0=(Token)match(input,35,FOLLOW_29); 

                    					newLeafNode(lv_Comutativa_0_0, grammarAccess.getExpBinLogicaAccess().getComutativaComutativaKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpBinLogicaRule());
                    					}
                    					setWithLastConsumed(current, "Comutativa", true, "Comutativa");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getExpBinLogicaAccess().getExpBinLogicaKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getExpBinLogicaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPascalito.g:1266:3: (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPascalito.g:1267:4: otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpBinLogicaAccess().getPrioridadeKeyword_3_0());
                    			
                    // InternalPascalito.g:1271:4: ( (lv_Prioridade_4_0= ruleEBigDecimal ) )
                    // InternalPascalito.g:1272:5: (lv_Prioridade_4_0= ruleEBigDecimal )
                    {
                    // InternalPascalito.g:1272:5: (lv_Prioridade_4_0= ruleEBigDecimal )
                    // InternalPascalito.g:1273:6: lv_Prioridade_4_0= ruleEBigDecimal
                    {

                    						newCompositeNode(grammarAccess.getExpBinLogicaAccess().getPrioridadeEBigDecimalParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_Prioridade_4_0=ruleEBigDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpBinLogicaRule());
                    						}
                    						set(
                    							current,
                    							"Prioridade",
                    							lv_Prioridade_4_0,
                    							"org.xtext.example.mydsl.Pascalito.EBigDecimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPascalito.g:1291:3: (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPascalito.g:1292:4: otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpBinLogicaAccess().getOperadorKeyword_4_0());
                    			
                    // InternalPascalito.g:1296:4: ( (lv_Operador_6_0= ruleEString ) )
                    // InternalPascalito.g:1297:5: (lv_Operador_6_0= ruleEString )
                    {
                    // InternalPascalito.g:1297:5: (lv_Operador_6_0= ruleEString )
                    // InternalPascalito.g:1298:6: lv_Operador_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExpBinLogicaAccess().getOperadorEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_Operador_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpBinLogicaRule());
                    						}
                    						set(
                    							current,
                    							"Operador",
                    							lv_Operador_6_0,
                    							"org.xtext.example.mydsl.Pascalito.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,38,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getExpBinLogicaAccess().getOperandoEsqKeyword_5());
            		
            // InternalPascalito.g:1320:3: ( (lv_operandoEsq_8_0= ruleExpressao ) )
            // InternalPascalito.g:1321:4: (lv_operandoEsq_8_0= ruleExpressao )
            {
            // InternalPascalito.g:1321:4: (lv_operandoEsq_8_0= ruleExpressao )
            // InternalPascalito.g:1322:5: lv_operandoEsq_8_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getExpBinLogicaAccess().getOperandoEsqExpressaoParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_33);
            lv_operandoEsq_8_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpBinLogicaRule());
            					}
            					set(
            						current,
            						"operandoEsq",
            						lv_operandoEsq_8_0,
            						"org.xtext.example.mydsl.Pascalito.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,39,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getExpBinLogicaAccess().getOperandoDirKeyword_7());
            		
            // InternalPascalito.g:1343:3: ( (lv_operandoDir_10_0= ruleExpressao ) )
            // InternalPascalito.g:1344:4: (lv_operandoDir_10_0= ruleExpressao )
            {
            // InternalPascalito.g:1344:4: (lv_operandoDir_10_0= ruleExpressao )
            // InternalPascalito.g:1345:5: lv_operandoDir_10_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getExpBinLogicaAccess().getOperandoDirExpressaoParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_operandoDir_10_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpBinLogicaRule());
            					}
            					set(
            						current,
            						"operandoDir",
            						lv_operandoDir_10_0,
            						"org.xtext.example.mydsl.Pascalito.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getExpBinLogicaAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleExpBinLogica"


    // $ANTLR start "entryRuleExpBin"
    // InternalPascalito.g:1370:1: entryRuleExpBin returns [EObject current=null] : iv_ruleExpBin= ruleExpBin EOF ;
    public final EObject entryRuleExpBin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpBin = null;


        try {
            // InternalPascalito.g:1370:47: (iv_ruleExpBin= ruleExpBin EOF )
            // InternalPascalito.g:1371:2: iv_ruleExpBin= ruleExpBin EOF
            {
             newCompositeNode(grammarAccess.getExpBinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpBin=ruleExpBin();

            state._fsp--;

             current =iv_ruleExpBin; 
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
    // $ANTLR end "entryRuleExpBin"


    // $ANTLR start "ruleExpBin"
    // InternalPascalito.g:1377:1: ruleExpBin returns [EObject current=null] : ( ( (lv_Comutativa_0_0= 'Comutativa' ) )? otherlv_1= 'ExpBin' otherlv_2= '{' (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )? otherlv_7= 'operandoDir' ( (lv_operandoDir_8_0= ruleExpressao ) ) otherlv_9= 'operandoEsq' ( (lv_operandoEsq_10_0= ruleExpressao ) ) otherlv_11= '}' ) ;
    public final EObject ruleExpBin() throws RecognitionException {
        EObject current = null;

        Token lv_Comutativa_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_Prioridade_4_0 = null;

        AntlrDatatypeRuleToken lv_Operador_6_0 = null;

        EObject lv_operandoDir_8_0 = null;

        EObject lv_operandoEsq_10_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:1383:2: ( ( ( (lv_Comutativa_0_0= 'Comutativa' ) )? otherlv_1= 'ExpBin' otherlv_2= '{' (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )? otherlv_7= 'operandoDir' ( (lv_operandoDir_8_0= ruleExpressao ) ) otherlv_9= 'operandoEsq' ( (lv_operandoEsq_10_0= ruleExpressao ) ) otherlv_11= '}' ) )
            // InternalPascalito.g:1384:2: ( ( (lv_Comutativa_0_0= 'Comutativa' ) )? otherlv_1= 'ExpBin' otherlv_2= '{' (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )? otherlv_7= 'operandoDir' ( (lv_operandoDir_8_0= ruleExpressao ) ) otherlv_9= 'operandoEsq' ( (lv_operandoEsq_10_0= ruleExpressao ) ) otherlv_11= '}' )
            {
            // InternalPascalito.g:1384:2: ( ( (lv_Comutativa_0_0= 'Comutativa' ) )? otherlv_1= 'ExpBin' otherlv_2= '{' (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )? otherlv_7= 'operandoDir' ( (lv_operandoDir_8_0= ruleExpressao ) ) otherlv_9= 'operandoEsq' ( (lv_operandoEsq_10_0= ruleExpressao ) ) otherlv_11= '}' )
            // InternalPascalito.g:1385:3: ( (lv_Comutativa_0_0= 'Comutativa' ) )? otherlv_1= 'ExpBin' otherlv_2= '{' (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )? otherlv_7= 'operandoDir' ( (lv_operandoDir_8_0= ruleExpressao ) ) otherlv_9= 'operandoEsq' ( (lv_operandoEsq_10_0= ruleExpressao ) ) otherlv_11= '}'
            {
            // InternalPascalito.g:1385:3: ( (lv_Comutativa_0_0= 'Comutativa' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPascalito.g:1386:4: (lv_Comutativa_0_0= 'Comutativa' )
                    {
                    // InternalPascalito.g:1386:4: (lv_Comutativa_0_0= 'Comutativa' )
                    // InternalPascalito.g:1387:5: lv_Comutativa_0_0= 'Comutativa'
                    {
                    lv_Comutativa_0_0=(Token)match(input,35,FOLLOW_34); 

                    					newLeafNode(lv_Comutativa_0_0, grammarAccess.getExpBinAccess().getComutativaComutativaKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpBinRule());
                    					}
                    					setWithLastConsumed(current, "Comutativa", true, "Comutativa");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getExpBinAccess().getExpBinKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getExpBinAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPascalito.g:1407:3: (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPascalito.g:1408:4: otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpBinAccess().getPrioridadeKeyword_3_0());
                    			
                    // InternalPascalito.g:1412:4: ( (lv_Prioridade_4_0= ruleEBigDecimal ) )
                    // InternalPascalito.g:1413:5: (lv_Prioridade_4_0= ruleEBigDecimal )
                    {
                    // InternalPascalito.g:1413:5: (lv_Prioridade_4_0= ruleEBigDecimal )
                    // InternalPascalito.g:1414:6: lv_Prioridade_4_0= ruleEBigDecimal
                    {

                    						newCompositeNode(grammarAccess.getExpBinAccess().getPrioridadeEBigDecimalParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_Prioridade_4_0=ruleEBigDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpBinRule());
                    						}
                    						set(
                    							current,
                    							"Prioridade",
                    							lv_Prioridade_4_0,
                    							"org.xtext.example.mydsl.Pascalito.EBigDecimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPascalito.g:1432:3: (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPascalito.g:1433:4: otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpBinAccess().getOperadorKeyword_4_0());
                    			
                    // InternalPascalito.g:1437:4: ( (lv_Operador_6_0= ruleEString ) )
                    // InternalPascalito.g:1438:5: (lv_Operador_6_0= ruleEString )
                    {
                    // InternalPascalito.g:1438:5: (lv_Operador_6_0= ruleEString )
                    // InternalPascalito.g:1439:6: lv_Operador_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExpBinAccess().getOperadorEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_Operador_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpBinRule());
                    						}
                    						set(
                    							current,
                    							"Operador",
                    							lv_Operador_6_0,
                    							"org.xtext.example.mydsl.Pascalito.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,39,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getExpBinAccess().getOperandoDirKeyword_5());
            		
            // InternalPascalito.g:1461:3: ( (lv_operandoDir_8_0= ruleExpressao ) )
            // InternalPascalito.g:1462:4: (lv_operandoDir_8_0= ruleExpressao )
            {
            // InternalPascalito.g:1462:4: (lv_operandoDir_8_0= ruleExpressao )
            // InternalPascalito.g:1463:5: lv_operandoDir_8_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getExpBinAccess().getOperandoDirExpressaoParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_32);
            lv_operandoDir_8_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpBinRule());
            					}
            					set(
            						current,
            						"operandoDir",
            						lv_operandoDir_8_0,
            						"org.xtext.example.mydsl.Pascalito.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,38,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getExpBinAccess().getOperandoEsqKeyword_7());
            		
            // InternalPascalito.g:1484:3: ( (lv_operandoEsq_10_0= ruleExpressao ) )
            // InternalPascalito.g:1485:4: (lv_operandoEsq_10_0= ruleExpressao )
            {
            // InternalPascalito.g:1485:4: (lv_operandoEsq_10_0= ruleExpressao )
            // InternalPascalito.g:1486:5: lv_operandoEsq_10_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getExpBinAccess().getOperandoEsqExpressaoParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_operandoEsq_10_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpBinRule());
            					}
            					set(
            						current,
            						"operandoEsq",
            						lv_operandoEsq_10_0,
            						"org.xtext.example.mydsl.Pascalito.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getExpBinAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleExpBin"


    // $ANTLR start "entryRuleExpNeg"
    // InternalPascalito.g:1511:1: entryRuleExpNeg returns [EObject current=null] : iv_ruleExpNeg= ruleExpNeg EOF ;
    public final EObject entryRuleExpNeg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpNeg = null;


        try {
            // InternalPascalito.g:1511:47: (iv_ruleExpNeg= ruleExpNeg EOF )
            // InternalPascalito.g:1512:2: iv_ruleExpNeg= ruleExpNeg EOF
            {
             newCompositeNode(grammarAccess.getExpNegRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpNeg=ruleExpNeg();

            state._fsp--;

             current =iv_ruleExpNeg; 
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
    // $ANTLR end "entryRuleExpNeg"


    // $ANTLR start "ruleExpNeg"
    // InternalPascalito.g:1518:1: ruleExpNeg returns [EObject current=null] : (otherlv_0= 'ExpNeg' otherlv_1= '{' (otherlv_2= 'Prioridade' ( (lv_Prioridade_3_0= ruleEBigDecimal ) ) )? (otherlv_4= 'Operador' ( (lv_Operador_5_0= ruleEString ) ) )? otherlv_6= 'nega' ( (lv_nega_7_0= ruleExpressao ) ) otherlv_8= '}' ) ;
    public final EObject ruleExpNeg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_Prioridade_3_0 = null;

        AntlrDatatypeRuleToken lv_Operador_5_0 = null;

        EObject lv_nega_7_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:1524:2: ( (otherlv_0= 'ExpNeg' otherlv_1= '{' (otherlv_2= 'Prioridade' ( (lv_Prioridade_3_0= ruleEBigDecimal ) ) )? (otherlv_4= 'Operador' ( (lv_Operador_5_0= ruleEString ) ) )? otherlv_6= 'nega' ( (lv_nega_7_0= ruleExpressao ) ) otherlv_8= '}' ) )
            // InternalPascalito.g:1525:2: (otherlv_0= 'ExpNeg' otherlv_1= '{' (otherlv_2= 'Prioridade' ( (lv_Prioridade_3_0= ruleEBigDecimal ) ) )? (otherlv_4= 'Operador' ( (lv_Operador_5_0= ruleEString ) ) )? otherlv_6= 'nega' ( (lv_nega_7_0= ruleExpressao ) ) otherlv_8= '}' )
            {
            // InternalPascalito.g:1525:2: (otherlv_0= 'ExpNeg' otherlv_1= '{' (otherlv_2= 'Prioridade' ( (lv_Prioridade_3_0= ruleEBigDecimal ) ) )? (otherlv_4= 'Operador' ( (lv_Operador_5_0= ruleEString ) ) )? otherlv_6= 'nega' ( (lv_nega_7_0= ruleExpressao ) ) otherlv_8= '}' )
            // InternalPascalito.g:1526:3: otherlv_0= 'ExpNeg' otherlv_1= '{' (otherlv_2= 'Prioridade' ( (lv_Prioridade_3_0= ruleEBigDecimal ) ) )? (otherlv_4= 'Operador' ( (lv_Operador_5_0= ruleEString ) ) )? otherlv_6= 'nega' ( (lv_nega_7_0= ruleExpressao ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExpNegAccess().getExpNegKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getExpNegAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPascalito.g:1534:3: (otherlv_2= 'Prioridade' ( (lv_Prioridade_3_0= ruleEBigDecimal ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPascalito.g:1535:4: otherlv_2= 'Prioridade' ( (lv_Prioridade_3_0= ruleEBigDecimal ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getExpNegAccess().getPrioridadeKeyword_2_0());
                    			
                    // InternalPascalito.g:1539:4: ( (lv_Prioridade_3_0= ruleEBigDecimal ) )
                    // InternalPascalito.g:1540:5: (lv_Prioridade_3_0= ruleEBigDecimal )
                    {
                    // InternalPascalito.g:1540:5: (lv_Prioridade_3_0= ruleEBigDecimal )
                    // InternalPascalito.g:1541:6: lv_Prioridade_3_0= ruleEBigDecimal
                    {

                    						newCompositeNode(grammarAccess.getExpNegAccess().getPrioridadeEBigDecimalParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_Prioridade_3_0=ruleEBigDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpNegRule());
                    						}
                    						set(
                    							current,
                    							"Prioridade",
                    							lv_Prioridade_3_0,
                    							"org.xtext.example.mydsl.Pascalito.EBigDecimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPascalito.g:1559:3: (otherlv_4= 'Operador' ( (lv_Operador_5_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPascalito.g:1560:4: otherlv_4= 'Operador' ( (lv_Operador_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getExpNegAccess().getOperadorKeyword_3_0());
                    			
                    // InternalPascalito.g:1564:4: ( (lv_Operador_5_0= ruleEString ) )
                    // InternalPascalito.g:1565:5: (lv_Operador_5_0= ruleEString )
                    {
                    // InternalPascalito.g:1565:5: (lv_Operador_5_0= ruleEString )
                    // InternalPascalito.g:1566:6: lv_Operador_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExpNegAccess().getOperadorEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_Operador_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpNegRule());
                    						}
                    						set(
                    							current,
                    							"Operador",
                    							lv_Operador_5_0,
                    							"org.xtext.example.mydsl.Pascalito.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,42,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getExpNegAccess().getNegaKeyword_4());
            		
            // InternalPascalito.g:1588:3: ( (lv_nega_7_0= ruleExpressao ) )
            // InternalPascalito.g:1589:4: (lv_nega_7_0= ruleExpressao )
            {
            // InternalPascalito.g:1589:4: (lv_nega_7_0= ruleExpressao )
            // InternalPascalito.g:1590:5: lv_nega_7_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getExpNegAccess().getNegaExpressaoParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_nega_7_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpNegRule());
            					}
            					set(
            						current,
            						"nega",
            						lv_nega_7_0,
            						"org.xtext.example.mydsl.Pascalito.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getExpNegAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleExpNeg"


    // $ANTLR start "entryRuleEInt"
    // InternalPascalito.g:1615:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalPascalito.g:1615:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalPascalito.g:1616:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalPascalito.g:1622:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalPascalito.g:1628:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalPascalito.g:1629:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalPascalito.g:1629:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalPascalito.g:1630:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalPascalito.g:1630:3: (kw= '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPascalito.g:1631:4: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_25); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000064000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000044480020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000B1900000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000044400020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000006200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000A200000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000042200000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});

}