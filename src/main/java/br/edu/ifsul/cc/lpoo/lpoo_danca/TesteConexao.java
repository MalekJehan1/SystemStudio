package br.edu.ifsul.cc.lpoo.lpoo_danca;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/teste2";
        String user = "postgres";
        String password = "1234";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão estabelecida com sucesso!");
            connection.close();
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}