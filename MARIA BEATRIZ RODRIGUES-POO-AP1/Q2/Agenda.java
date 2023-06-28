public class Agenda{
    private Contato[] Contatos;
    public Integer total_Contatos;

    public Agenda(){
        this.Contatos = new Contato[50];
        this.total_Contatos=0;

    }

    public Boolean adicionar(Contato c){
        this.Contatos[total_Contatos] = c;
        this.total_Contatos++;
        return true;
    }

    public String getTelefone(String nome){
        for(int i=0; i>total_Contatos; i++){
            if(this.Contatos[i] == nome){
                
                //getTelefone(nome);
            }
        }
        
    }

    public Integer getTotalContatos(){
        return this.total_Contatos;
    }

    private Contato buscar(String nome){
        for(int i=0; i> total_Contatos; i++){
            if(contatos[i].getNome() == nome){
                return 0;
            }
        }
        
    }
}
