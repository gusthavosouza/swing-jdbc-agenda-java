package gu.java.conexao;

/* Desenvolvido por Gustavo de Souza 28.01.2013
 * Projeto para criação de notas e eventos do dia-a-dia.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import gu.java.nota.*;


public class Conexao {

    /*
     *Coloque corretamente os valores para que , seja conectado com sucesso
     */
    private static final String url = "com.mysql.jdbc.Driver";
    private static final String DATABASE = "teste";
    private static final String IP = "127.0.0.1"; //"192.168.0.1";
    private static final String STR_CON = "jdbc:mysql://" + IP + ":3306/" + DATABASE;
    private static final String user = "username";
    private static final String password = "12345";

    public static void main(String[] args) throws GuException, InterruptedException {
    	Connection conn = null;
    	conn = Conexao.getConexao();
    	Thread.sleep(5000);
		
	}
    public static Connection getConexao() throws GuException {
    	Connection conn = null;
        try {
            Class.forName(STR_CON);
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("[ConnectionManager]: Obtendo conexao");
            return conn;
        } catch (ClassNotFoundException e) {
            String errorMsg = "Driver nao encontrado";
           throw new GuException(errorMsg);
        } catch (SQLException e) {
          
        }
		return conn;
       
    }

    public static void closeAll(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void closeAll(Connection conn, Statement stmt, ResultSet rs) {
        try {
            if (conn != null || stmt != null) {
                closeAll(conn, stmt);
            }
            if (rs != null) {
                rs.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void closeAll(Connection conn, Statement stmt) {
        try {
            if (conn != null) {
                closeAll(conn);
            }
            if (stmt != null) {
                stmt.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
