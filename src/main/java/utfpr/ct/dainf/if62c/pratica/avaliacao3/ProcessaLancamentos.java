package utfpr.ct.dainf.if62c.pratica.avaliacao3;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * IF62C Fundamentos de Programação 2
 * Avaliação parcial 3
 * @José Reinaldo Lopes da Silva
 */
public class ProcessaLancamentos {
    private BufferedReader reader;
    

    public ProcessaLancamentos(File arquivo) throws FileNotFoundException {
       
        reader = new BufferedReader(new FileReader(arquivo));
        //inici
    }

    public ProcessaLancamentos(String path) throws FileNotFoundException {
        
        this(new File(path));
        //caminho
    }
    
    private String getNextLine() throws IOException {
        
        return (reader.readLine());
    }
    
    private Lancamento processaLinha(String linha) {
        Integer conta = Integer.valueOf(linha.substring(0,6));
        
        GregorianCalendar calenda = new GregorianCalendar(
                Integer.parseInt(linha.substring(6, 10)),
                Integer.parseInt(linha.substring(10, 12))-1,
                Integer.parseInt(linha.substring(12, 14)));
        Date dat = calenda.getTime();
        String descricao = linha.substring(14, 74).trim();
        Double valor = Long.valueOf(linha.substring(74, 86)) / 100.0;
        
    return (new Lancamento(conta,dat,descricao,valor));
    }
    
    private Lancamento getNextLancamento() throws IOException {
        
        String linha = getNextLine();
            return (linha == null ? null : processaLinha(linha));
    
    }
    
    public List<Lancamento> getLancamentos() throws IOException {
        //throw new UnsupportedOperationException("Não implementado");
        List <Lancamento> lancamentos = new ArrayList<>();
            Lancamento lan;
            try {
                while ((lan = getNextLancamento()) != null) {
                    lancamentos.add(lan);
                }
            } 
            finally {
                reader.close();
            }
            return (lancamentos);
    }
    
}
