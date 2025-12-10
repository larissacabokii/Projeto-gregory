/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;
import java.util.List;
import java.util.Objects;
/**
 *
 * @author MG&A
 */


public class Tarefas {
    private int idTarefa;
    private String titulo;
    private String descricao;
    private String status;     // Pendente, Em andamento, Concluída
  

    private Usuarios usuarios;           // relação com tabela usuarios
    private List<Categorias> categorias; // tarefa pode ter várias categorias

    // GETTERS E SETTERS
    public int getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public Usuarios getUsuario() {
        return usuarios;
    }

    public void setUsuario(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public List<Categorias> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categorias> categorias) {
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return titulo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Tarefas t = (Tarefas) obj;
        return this.idTarefa == t.idTarefa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTarefa);
    }

    public void setCategorias(Categorias c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


