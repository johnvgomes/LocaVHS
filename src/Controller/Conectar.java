package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DeptoPessoal
 */
public class Conectar {
    //jdbc = java database conector
    private String servidor = "com.mysql.jdbc.Driver";
    //caminho do banco
    //jdbc:mysql://182.234.001.100
    private String urlBanco = "jdbc:mysql://localhost/ultrasoft";
    //usuario e senha
    private String usuario = "root";
    private String senha = "root";
    
    private Connection con = null;
    
    //construtor
    public Conectar(){
        try {
            Class.forName(this.servidor);
            this.con = DriverManager.getConnection(
                    this.urlBanco,this.usuario,this.senha);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e ){
            e.printStackTrace();
        }
    }
    
    public Connection getCon(){
        return this.con;
    }
    
    
}
