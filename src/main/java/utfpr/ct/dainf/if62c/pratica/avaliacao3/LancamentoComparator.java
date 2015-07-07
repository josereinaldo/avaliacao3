package utfpr.ct.dainf.if62c.pratica.avaliacao3;
import java.util.Comparator;
/**
 * IF62C Fundamentos de Programação 2 
 * Avaliação parcial 3
 * @José Reinaldo Lopes da Silva
 */
public class LancamentoComparator implements Comparator<Lancamento> {

    @Override
    public int compare(Lancamento l1, Lancamento l2) {
        int com = l1.getConta().compareTo(l2.getConta());
       
        if (com == 0) 
        {
            com = l1.getData().compareTo(l2.getData());
        }
        return (com);
    }

}

