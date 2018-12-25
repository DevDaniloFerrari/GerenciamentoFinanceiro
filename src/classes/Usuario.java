package classes;

public class Usuario{
    
    //Atributos
    
    private int id;
    private String nome,senha;
    private double dinheiro;
    
    //Métodos Especiais
    
    //Construtores ------------------------------------------------
        public Usuario(int id, String nome, String senha) {
            this.id = id;
            this.nome = nome;
            this.senha = senha;
        }
        
        public Usuario(){
            
        }
    //-----------------------------------------------------------
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    
    
}