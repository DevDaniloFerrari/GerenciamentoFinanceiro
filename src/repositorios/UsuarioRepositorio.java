package repositorios;

import conexao.FabricaDeConexao;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioRepositorio{

    private FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();
    
    public void inserir(String nome, String senha) {
        fabricaDeConexao.executarQuery(String.format("INSERT INTO `usuarios` (`nome`,`senha`) VALUES ('%s','%s');",nome,senha));
    }

    public void excluir(int id) {
        fabricaDeConexao.executarQuery(String.format("DELETE FROM `usuarios` WHERE `id` = '%d';", id));
    }

    public void atualizar(String nome, int id) {
        fabricaDeConexao.executarQuery(String.format("UPDATE `usuarios` SET `nome` = '%s' WHERE `id` = '%d';",nome,id));
    }
    
    public void atualizar(int senha, int id){
        fabricaDeConexao.executarQuery(String.format("UPDATE `usuarios` SET `senha` = '%s' WHERE `id` = '%d';", senha,id));
    }

    public boolean validar(String nome, String senha) throws SQLException {
        ResultSet rs = fabricaDeConexao.obterResultSet(String.format("SELECT * FROM `usuarios` WHERE `nome` = '%s' AND `senha` = '%s';", nome,senha));
        boolean resultado = rs.next();
        fabricaDeConexao.fecharConexao();
        return resultado;
    }
    
    public Object obterValor(String nomeDaColuna, String tipoPrimitivo, String filtro, Object valorDoFiltro) throws SQLException{
        ResultSet retorno = fabricaDeConexao.obterResultSet("SELECT `"+ nomeDaColuna +"` FROM `usuarios` WHERE `"+ filtro +"` = '"+ valorDoFiltro.toString() +"';");
        retorno.next();
        switch(tipoPrimitivo){
            case "int":
                int objetoInt = retorno.getInt(nomeDaColuna);
                fabricaDeConexao.fecharConexao();
                return objetoInt;
            case "String":
                String objetoString = retorno.getString(nomeDaColuna);
                fabricaDeConexao.fecharConexao();
                return objetoString;
            case "Float":
                Float objetoFloat = retorno.getFloat(nomeDaColuna);
                fabricaDeConexao.fecharConexao();
                return objetoFloat;
            case "Double":
                Double objetoDouble = retorno.getDouble(nomeDaColuna);
                fabricaDeConexao.fecharConexao();
                return objetoDouble;
        }
        return null;
    }
    
    
    
}