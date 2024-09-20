/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.analysis;

import java.util.*;
import compilador.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFatorExpr(AFatorExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASomaExpr(ASomaExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosExpr(AMenosExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComparaFator(AComparaFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiFator(AMultiFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivFator(ADivFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAModFator(AModFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALogicaExprComparacao(ALogicaExprComparacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComparacaoExprComparacao(AComparacaoExprComparacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermoExprLogica(ATermoExprLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALogicaExprLogica(ALogicaExprLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANeglogicaExprLogica(ANeglogicaExprLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACaractereTermo(ACaractereTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroTermo(ANumeroTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABooleanoTermo(ABooleanoTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarTermo(AVarTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaTermo(AChamadaTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParTermo(AParTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdVar(AIdVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVetorVar(AVetorVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFuncaoChamada(AFuncaoChamada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVazioListaExpr(AVazioListaExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressaoListaExpr(AExpressaoListaExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressaomaisListaExpr(AExpressaomaisListaExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorqueOpComp(AMenorqueOpComp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorqueOpComp(AMaiorqueOpComp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorigualOpComp(AMaiorigualOpComp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorigualOpComp(AMenorigualOpComp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualdadeOpComp(AIgualdadeOpComp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOuOpLogica(AOuOpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEOpLogica(AEOpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVacuo(TVacuo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentario(TComentario node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicioExecucao(TInicioExecucao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicio(TInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFim(TFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoCaractere(TTipoCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoNumero(TTipoNumero node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoBooleano(TTipoBooleano node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoVetor(TTipoVetor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoVazio(TTipoVazio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPara(TPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTParaCada(TParaCada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRetorne(TRetorne node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPonto(TPonto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoisPontos(TDoisPontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontoVirgula(TPontoVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBarraReta(TBarraReta node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreParentese(TAbreParentese node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaParentese(TFechaParentese node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreColchete(TAbreColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaColchete(TFechaColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSoma(TSoma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenos(TMenos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDivisao(TDivisao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMultiplicacao(TMultiplicacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaior(TMaior node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenor(TMenor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAtribuicao(TAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorIgual(TMaiorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorIgual(TMenorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLer(TLer node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTExibir(TExibir node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaractere(TCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTexto(TTexto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumero(TNumero node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBooleano(TBooleano node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
