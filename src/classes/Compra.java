package classes;

import java.util.Date;

public class Compra{
    
    //Atributos
    
    private int id_conta,id_usuario,vezes,form_pg;
    private String nome;
    private float valor;
    Date data;
    
    //Métodos Especiais

    public int getId_conta() {
        return id_conta;
    }

    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getVezes() {
        return vezes;
    }

    public void setVezes(int vezes) {
        this.vezes = vezes;
    }

    public int getForm_pg() {
        return form_pg;
    }

    public void setForm_pg(int form_pg) {
        this.form_pg = form_pg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}