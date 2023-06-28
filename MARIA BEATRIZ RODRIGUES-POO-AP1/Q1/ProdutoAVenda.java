public class ProdutoAVenda{
    private String Nome;
    private Integer Estoque;
    private Double Preco;

    public ProdutoAVenda(String nome, Integer estoque, Double preco){
        this.Nome = nome;
        this.Estoque = estoque;
        this.Preco = preco;
    }

    public Double getPreco(){
        return this.Preco;
    }

    public Integer getEstoque(){
        return this.Estoque;
    }

    public Double getValorDoEstoque(){
        Double opa = this.Preco;
        opa*= 1* Estoque;
        return opa;
    } 

    public Boolean removerEstoque(){
        if(this.Estoque > 0){
            this.Estoque--;
            return true;
        } 

        return false;
    }

    public void setPreco(Double preco_atual){
        this.Preco = preco_atual;
    }

    public void adicionarEstoque(Integer novo_estoque){
        this.Estoque+= novo_estoque;

    }

}