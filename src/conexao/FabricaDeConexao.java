package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FabricaDeConexao{
    
    
    private Connection con = null;
    
    private String hostName = null;
    private String userName = null;
    private String password = null;
    private String url = null;
    private String jdbcDriver = null;
    private String dataBaseName = null;
    private String dataBasePrefix =  null;
    private String dataBasePort = null;
    
    
    public FabricaDeConexao(){
        
            
        this.hostName = "sql10.freemysqlhosting.net";
        this.userName = "sql10271413";
        this.password = "GpyGZDiGj2";
        this.jdbcDriver = "com.mysql.cj.jdbc.Driver";
        this.dataBaseName = "sql10271413";
        this.dataBasePrefix = "jdbc:mysql://";
        this.dataBasePort = "3306";
        
        this.url = this.dataBasePrefix+this.hostName+":"+this.dataBasePort+"/"+this.dataBaseName+"?verifyServerCertificate=false&useSSL=true";
    }
    
    
    private Connection obterConexao(){
        try{
            if(con == null){
                Class.forName(jdbcDriver);
                con = DriverManager.getConnection(url, userName, password);
            } else if (con.isClosed()){
                con = null;
                return obterConexao();
            }
        } catch(ClassNotFoundException | SQLException e){
            
        }
        return con;
    }
    
    //Método para Fechar a Conexão
    
    public void fecharConexao(){
        if(con != null){
            try{
                con.close();
            } catch(SQLException e){
                
            }
        }
    }
    
    public ResultSet obterResultSet(String query){
        Connection con = this.obterConexao();
        Statement st = null;
        ResultSet rs = null;
        try{
            st = con.createStatement();
            rs = st.executeQuery(query);
        }catch(SQLException e){
            
        }
        return rs;
    }
    
    
    public void executarQuery(String query){
        Connection con = this.obterConexao();
        
        try{
            Statement st = null;
            st = con.createStatement();
            if(st.executeUpdate(query)==1){
                st.executeQuery(query);
            }
        }catch(SQLException e){

        }
    }

}