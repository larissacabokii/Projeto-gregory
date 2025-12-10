/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author MG&A
 */

import conexao.Conexao;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import bean.Usuarios;

public class UsuarioDAO {
    
    public void create(Usuarios u) {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;
        
        try {
            String query = "INSERT INTO usuarios(nome, email, senha) VALUES(?,?,?)";
            stmt = con.prepareStatement(query);
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getEmail());
            stmt.setString(3, u.getSenha());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuários cadastrado com sucesso!");
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Usuários: " + ex.getMessage());
        }
        finally {
            Conexao.fecharConexao(con, stmt);
        }
    }
    
    public ArrayList<Usuarios> read() {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Usuarios> lista = new ArrayList<>();
        
        try {
            String query = "SELECT * FROM usuarios";
            stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Usuarios u = new Usuarios();
                u.setId_usuario(rs.getInt("id_usuario"));
                u.setNome(rs.getString("nome"));
                u.setEmail(rs.getString("email"));
                u.setSenha(rs.getString("senha"));
                lista.add(u);
            }
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar Usuários: " + ex.getMessage());
        }
        finally {
            Conexao.fecharConexao(con, stmt, rs);
        }
        
        return lista;
    }
    
    public Usuarios read(int id) {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            String query = "SELECT * FROM usuarios WHERE id_usuario = ?";
            stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            if(rs.next()) {
                Usuarios u = new Usuarios();
                u.setId_usuario(rs.getInt("id_usuario"));
                u.setNome(rs.getString("nome"));
                u.setEmail(rs.getString("email"));
                u.setSenha(rs.getString("senha"));
                return u;
            }
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar Usuário: " + ex.getMessage());
        }
        finally {
            Conexao.fecharConexao(con, stmt, rs);
        }
        
        return null;
    }
    
    public void update(Usuarios u) {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;
        
        try {
            String query = "UPDATE usuarios SET nome = ?, email = ?, senha = ? WHERE id_usuario = ?";
            stmt = con.prepareStatement(query);
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getEmail());
            stmt.setString(3, u.getSenha());
            stmt.setInt(4, u.getId_usuario());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuários atualizado com sucesso!");
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar Usuário: " + ex.getMessage());
        }
        finally {
            Conexao.fecharConexao(con, stmt);
        }
    }
    
    public void destroy(Usuarios u) {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;
        
        try {
            String query = "DELETE FROM usuarios WHERE id_usuario = ?";
            stmt = con.prepareStatement(query);
            stmt.setInt(1, u.getId_usuario());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuários excluído com sucesso!");
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir Usuários: " + ex.getMessage());
        }
        finally {
            Conexao.fecharConexao(con, stmt);
        }
    }
}

