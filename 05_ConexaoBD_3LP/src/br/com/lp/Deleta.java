/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Deleta {

    public static void main(String[] args) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/colegio";
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, "root", "");
            String sql = "DELETE FROM aluno WHERE al_idade='19'";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null, "Dados excluído com sucesso!!!");
        } catch (ClassNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "Driver JDBC-ODBC não encontrado!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Problemas na conexao com o banco de dados" + erro.toString());
        }
    }

}
