/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

    public static void main(String[] args) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/colegio";
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, "root", "");
            JOptionPane.showMessageDialog(null, "Conexao realizada com sucesso");
            connection.close();
        } catch (ClassNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "Driver JDBC-ODBC não encontrado!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Problemas na conexao com a fonte de dados" + erro.toString());
        }
    }
}
