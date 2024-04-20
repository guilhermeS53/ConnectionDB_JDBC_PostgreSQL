package com.example;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main( String[] args ) throws Exception
    {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://isabelle.db.elephantsql.com/iuiopnbm", "iuiopnbm", "4yejkBsCULoAUTTi-bkMCcemGj93rQPp");
            if (conn != null) {
                System.out.println("DataBase CONECTADO com SUCESSO!");
                Statement s = (Statement) conn.createStatement();
                //criaTabelaProdutos(s);
                //insereDados(s, "Pão", 2, 10, "2024-04-18");
                //consultaDados(s);
                atualizaPreco(s, 2, 50);
                atualizaNome(s, 2, "Frango");
            } else {
                System.out.println("Conexão FALHOU!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        /*static void consultaDados(Statement s) {
            String sql = "SELECT * FROM produtos";
            try {
                ResultSet result = ((java.sql.Statement) s).executeQuery(sql);
                while (result.next()) {
                    System.out.println("id: " + result.getInt("id") + "Nome: " + result.getString("nome"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }*/

    /*static void criaTabelaProdutos(Statement s) throws Exception {
        String sql = "CREATE TABLE IF NOT EXISTS produtos ("
               + "id SERIAL PRIMARY KEY,"
               + "nome VARCHAR(255) NOT NULL,"
               + "preco DECIMAL(10,2) NOT NULL,"
               + "quantidade_estoque INTEGER NOT NULL,"
               + "data_criacao DATE NOT NULL"
               + ")";
        s.execute(sql);
        System.out.println("Tabela 'produtos' criada com sucesso!");
      }*/

      static void insereDados(Statement s, String nome, double preco, int quantidade, String string) throws SQLException {
        //String precoFormatado = String.format("%.2f", preco);   
        
        String sql = "INSERT INTO produtos (nome, preco, quantidade_estoque, data_criacao) VALUES ('" 
                   + nome + "', " + preco + ", " + quantidade + ", '" + string + "')";
        s.execute(sql);
        System.out.println("Produto '" + nome + "' inserido com sucesso!");
      }

      static void atualizaPreco(Statement s, int idProduto, double novoPreco) throws SQLException {
        String sql = "UPDATE produtos SET preco = " + novoPreco + " WHERE id = " + idProduto;
        s.execute(sql);
        System.out.println("Preço do produto (ID: " + idProduto + ") atualizado com sucesso!");
      }
      static void atualizaNome(Statement s, int idProduto, String novoNome) throws SQLException {
        String sql = "UPDATE produtos SET nome = '" + novoNome + "' WHERE id = " + idProduto;
        s.execute(sql);
        System.out.println("Nome do produto (ID: " + idProduto + ") atualizado com sucesso!");
      }
}
