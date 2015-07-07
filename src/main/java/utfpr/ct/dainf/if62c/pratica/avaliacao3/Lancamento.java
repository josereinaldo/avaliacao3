package utfpr.ct.dainf.if62c.pratica.avaliacao3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * IF62C Fundamentos de Programação 2
 * Avaliação parcial 3
 * @José Reinaldo Lopes da Silva
 */
public class Lancamento {
    private Integer conta;
    private Date data;
    private String descricao;
    private Double valor;
    
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Lancamento(Integer conta, Date data, String descricao, Double valor) {
        this.conta = conta;
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Lancamento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("%06d %s %-60s %20f", conta, dateFormat.format(data),
                descricao, valor);
    }    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.conta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass()
                && this.conta.equals(((Lancamento)obj).conta);
    }

    public void add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
