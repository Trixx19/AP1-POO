public class Lancamentos {
    private String Desc; 
    private Double Valor;
    private Boolean Tipo;

    public Lancamentos(String desc, Double valor, Boolean tipo){
        this.Desc = desc;
        this.Valor = valor;
        this.Tipo = tipo;
    }

    public Double getValor(){
        return this.Valor;
    }

    public String getDesc(){
        return this.Desc;
    }

    public Boolean getTipo(){
        return this.Tipo;
    }


}
