package repositorios;

import conexao.FabricaDeConexao;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioRepositorio{

    FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();
    
    public void inserir(String nome, int senha) {
        fabricaDeConexao.executarQuery(String.format("INSERT INTO `usuarios` (`nome`,`senha`) VALUES ('%1s','%2d');",nome,senha));
    }

    public void excluir(int id) {
        fabricaDeConexao.executarQuery(String.format("DELETE FROM `usuarios` WHERE `id` = '%1d';", id));
    }

    public void atualizar(String nome, int id) {
        fabricaDeConexao.executarQuery(String.format("UPDATE `usuarios` SET `nome` = '%1s' WHERE `id` = '%2d';",nome,id));
    }
    
    public void atualizar(int senha, int id){
        fabricaDeConexao.executarQuery(String.format("UPDATE `usuarios` SET `senha` = '%1s' WHERE `id` = '%2d';", senha,id));
    }

    public boolean validar(String nome, int senha) throws SQLException {
        ResultSet rs = fabricaDeConexao.obterResultSet(String.format("SELECT * FROM `usuarios` WHERE `nome` = '%1s' AND `senha` = '%2d';", nome,senha));
        boolean resultado = rs.next();
        fabricaDeConexao.fecharConexao();
        return resultado;
    }
    
    public ResultSet obter(String nome, int senha) throws SQLException{
        ResultSet retorno = fabricaDeConexao.obterResultSet(String.format("SELECT * FROM `usuarios` WHERE `nome` = '%s' AND `senha` = '%d';",nome,senha));
        retorno.next();
        fabricaDeConexao.fecharConexao();
        return retorno;
    }
    
    
    
}