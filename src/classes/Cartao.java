package classes;

public class Cartao{
    
    //Atributos
    
    private int id_usuario, id_cartao;
    private String nome, bandeira;
    private double limite, valor_atual;
    
    //Métodos Especiais

    public Cartao(int id_usuario, int id_cartao, String nome, String bandeira, double limite, double valor_atual) {
        this.id_usuario = id_usuario;
        this.id_cartao = id_cartao;
        this.nome = nome;
        this.bandeira = bandeira;
        this.limite = limite;
        this.valor_atual = valor_atual;
    }
    
    public Cartao(){
        
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_cartao() {
        return id_cartao;
    }

    public void setId_cartao(int id_cartao) {
        this.id_cartao = id_cartao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getValor_atual() {
        return valor_atual;
    }

    public void setValor_atual(double valor_atual) {
        this.valor_atual = valor_atual;
    }
    
    
    
}