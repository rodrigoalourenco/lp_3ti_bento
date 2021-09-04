/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Consulta {

    public static void main(String[] args) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/colegio";
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, "root", "");
            String sql = "SELECT al_cod, al_nome, al_idade, al_curso FROM aluno";// where al_idade > '18' AND al_idade < '27'order by al_curso";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println("COD \tNOME \tIDADE \tCURSO");
            System.out.println("------ ------- ----- -------------");
            while (resultSet.next()) {
                String codigo = resultSet.getString("al_cod");
                String nome = resultSet.getString("al_nome");
                String idade = resultSet.getString("al_idade");
                String curso = resultSet.getString("al_curso");
                System.out.println(codigo + "\t" + nome + "\t" + idade + "\t" + curso);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "Driver JDBC-ODBC não encontrado!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Problemas na conexao com o banco de dados" + erro.toString());
        }
    }

}
