import javax.swing.text.LayeredHighlighter;

public class MinhaFinancas {
    private Lancamentos[] Lancamento;
    private String Nome;


    public MinhaFinancas(String nome){
        this.Lancamento = new Lancamentos [10];
        this.Nome = nome;
    }

    public Boolean adicionarReceita(String desc, Double valor){
        if(desc == "" || (valor == 0 || valor<0)){
             return null;
        }
    }

    public Boolean adicionarDespesas(String desc, Double valor){
        
    }

    public Double getTotalReceitas(){

    }

    public Double getTotalDespesas(){

    }

    public Double getSaldoGeral(){
        
    }
}
