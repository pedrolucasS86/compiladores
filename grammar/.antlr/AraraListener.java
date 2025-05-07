// Generated from c:/Users/8760659/compiladores/grammar/Arara.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AraraParser}.
 */
public interface AraraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AraraParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AraraParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AraraParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AraraParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AraraParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(AraraParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AraraParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(AraraParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AraraParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(AraraParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AraraParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(AraraParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AraraParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(AraraParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AraraParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(AraraParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AraraParser#cond_opc}.
	 * @param ctx the parse tree
	 */
	void enterCond_opc(AraraParser.Cond_opcContext ctx);
	/**
	 * Exit a parse tree produced by {@link AraraParser#cond_opc}.
	 * @param ctx the parse tree
	 */
	void exitCond_opc(AraraParser.Cond_opcContext ctx);
	/**
	 * Enter a parse tree produced by {@link AraraParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(AraraParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AraraParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(AraraParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AraraParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(AraraParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AraraParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(AraraParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AraraParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(AraraParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AraraParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(AraraParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AraraParser#logica}.
	 * @param ctx the parse tree
	 */
	void enterLogica(AraraParser.LogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AraraParser#logica}.
	 * @param ctx the parse tree
	 */
	void exitLogica(AraraParser.LogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AraraParser#logica_suf}.
	 * @param ctx the parse tree
	 */
	void enterLogica_suf(AraraParser.Logica_sufContext ctx);
	/**
	 * Exit a parse tree produced by {@link AraraParser#logica_suf}.
	 * @param ctx the parse tree
	 */
	void exitLogica_suf(AraraParser.Logica_sufContext ctx);
	/**
	 * Enter a parse tree produced by {@link AraraParser#comparacao}.
	 * @param ctx the parse tree
	 */
	void enterComparacao(AraraParser.ComparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AraraParser#comparacao}.
	 * @param ctx the parse tree
	 */
	void exitComparacao(AraraParser.ComparacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AraraParser#comparacao_suf}.
	 * @param ctx the parse tree
	 */
	void enterComparacao_suf(AraraParser.Comparacao_sufContext ctx);
	/**
	 * Exit a parse tree produced by {@link AraraParser#comparacao_suf}.
	 * @param ctx the parse tree
	 */
	void exitComparacao_suf(AraraParser.Comparacao_sufContext ctx);
	/**
	 * Enter a parse tree produced by {@link AraraParser#soma}.
	 * @param ctx the parse tree
	 */
	void enterSoma(AraraParser.SomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AraraParser#soma}.
	 * @param ctx the parse tree
	 */
	void exitSoma(AraraParser.SomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AraraParser#soma_suf}.
	 * @param ctx the parse tree
	 */
	void enterSoma_suf(AraraParser.Soma_sufContext ctx);
	/**
	 * Exit a parse tree produced by {@link AraraParser#soma_suf}.
	 * @param ctx the parse tree
	 */
	void exitSoma_suf(AraraParser.Soma_sufContext ctx);
	/**
	 * Enter a parse tree produced by {@link AraraParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(AraraParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AraraParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(AraraParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AraraParser#termo_suf}.
	 * @param ctx the parse tree
	 */
	void enterTermo_suf(AraraParser.Termo_sufContext ctx);
	/**
	 * Exit a parse tree produced by {@link AraraParser#termo_suf}.
	 * @param ctx the parse tree
	 */
	void exitTermo_suf(AraraParser.Termo_sufContext ctx);
	/**
	 * Enter a parse tree produced by {@link AraraParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(AraraParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AraraParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(AraraParser.FatorContext ctx);
}