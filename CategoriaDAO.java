/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import bean.Categorias;

/**
 *
 * @author larissa
 */
public class CategoriaDAO {

    public void create(Categorias c) {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            String query = "INSERT INTO categorias(descricao, nome_categoria) VALUES(?, ?)";
            stmt = con.prepareStatement(query);
            stmt.setString(1, c.getDescricao());
            stmt.setString(2, c.getNome());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Categoria cadastrada com sucesso!");
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar Categoria. Erro: " + ex.getMessage());
        }
        finally {
            Conexao.fecharConexao(con, stmt);
        }
    }

    public ArrayList<Categorias> read() {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Categorias> listaCategorias = new ArrayList<>();

        try {
            String query = "SELECT * FROM categorias";
            stmt = con.prepareStatement(query);

            rs = stmt.executeQuery();

            while(rs.next()) {
                Categorias c = new Categorias();
                c.setId_categoria(rs.getInt("id_categoria"));
                c.setDescricao(rs.getString("descricao"));
                c.setNome(rs.getString("nome_categoria"));

                listaCategorias.add(c);
            }
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao consultar categorias. Erro: " + ex.getMessage());
        }
        finally {
            Conexao.fecharConexao(con, stmt, rs);
        }

        return listaCategorias;
    }

    public Categorias read(int id) {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM categorias WHERE id_categoria = ?";
            stmt = con.prepareStatement(query);
            stmt.setInt(1, id);

            rs = stmt.executeQuery();

            if(rs.next()) {
                Categorias c = new Categorias();
                c.setId_categoria(rs.getInt("id_categoria"));
                c.setDescricao(rs.getString("descricao"));
                c.setNome(rs.getString("nome_categoria"));

                return c;
            }
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar categoria. Erro: " + ex.getMessage());
        }
        finally {
            Conexao.fecharConexao(con, stmt, rs);
        }

        return null;
    }

    public void update(Categorias c) {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            String query = "UPDATE categorias SET descricao = ? WHERE id_categoria = ?";
            stmt = con.prepareStatement(query);
            stmt.setString(1, c.getDescricao());
            stmt.setString(2, c.getNome());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Categorias atualizada com sucesso!");
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao atualizar Categoria. Erro: " + ex.getMessage());
        }
        finally {
            Conexao.fecharConexao(con, stmt);
        }
    }

    public void destroy(Categorias c) {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            String query = "DELETE FROM categorias WHERE id_categoria = ?";
            stmt = con.prepareStatement(query);
            stmt.setInt(1, c.getId_categoria());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Categorias excluída com sucesso!");
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir Categorias. Erro: " + ex.getMessage());
        }
        finally {
            Conexao.fecharConexao(con, stmt);
        }
    }
}
