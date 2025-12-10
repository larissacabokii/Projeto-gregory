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
import bean.Tarefas;
import bean.Usuarios;


public class TarefaDAO {

    public void create(Tarefas t) {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            String sql = "INSERT INTO tarefas(titulo, descricao, id_tarefa) VALUES(?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, t.getTitulo());
            stmt.setString(2, t.getDescricao());
            stmt.setInt(3, t.getIdTarefa());


            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Tarefa cadastrada com sucesso!");
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Tarefa: " + ex.getMessage());
        } 
        finally {
            Conexao.fecharConexao(con, stmt);
        }
    }

    public ArrayList<Tarefas> read() {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Tarefas> lista = new ArrayList<>();

        try {
            String sql = "SELECT * FROM tarefas";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Tarefas t = new Tarefas();
                t.setIdTarefa(rs.getInt("id"));
                t.setTitulo(rs.getString("titulo"));
                t.setDescricao(rs.getString("descricao"));
                
                Usuarios u = new UsuarioDAO().read(rs.getInt("id_usuario"));
                t.setUsuario(u);
               

                lista.add(t);
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar Tarefas: " + ex.getMessage());
        } 
        finally {
            Conexao.fecharConexao(con, stmt, rs);
        }

        return lista;
    }

    public Tarefas read(int id) {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM tarefas WHERE id = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Tarefas t = new Tarefas();
                t.setIdTarefa(rs.getInt("id"));
                t.setTitulo(rs.getString("titulo"));
                t.setDescricao(rs.getString("descricao"));

                Usuarios u = new UsuarioDAO().read(rs.getInt("id_usuario"));
                t.setUsuario(u);


                return t;
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Tarefa: " + ex.getMessage());
        } 
        finally {
            Conexao.fecharConexao(con, stmt, rs);
        }

        return null;
    }

    public void update(Tarefas t) {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            String sql = "UPDATE tarefas SET titulo = ?, descricao = ?, id_usuario = ?,  WHERE id = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, t.getTitulo());
            stmt.setString(2, t.getDescricao());
            stmt.setInt(3, t.getUsuario().getId_usuario());
            stmt.setInt(5, t.getIdTarefa());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Tarefa atualizada com sucesso!");
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar Tarefa: " + ex.getMessage());
        } 
        finally {
            Conexao.fecharConexao(con, stmt);
        }
    }

    public void destroy(Tarefas t) {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            String sql = "DELETE FROM tarefas WHERE id = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, t.getIdTarefa());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Tarefa excluída com sucesso!");
        }  
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir Tarefa: " + ex.getMessage());
        }  
        finally {
            Conexao.fecharConexao(con, stmt);
        }
    }
}
