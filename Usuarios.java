/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Objects;

/**
 *
 * @author MG&A
 */
public class Usuarios {
    
    private int id_usuario;
    private String nome;
    private String email;
    private String senha;
    
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

 
    
     @Override
    public String toString() {
        return nome;
    }
    
    

     @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Usuarios tp = (Usuarios) obj;
        return this.id_usuario == tp.id_usuario; // visto que id é um identificador único para o TipoProduto
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_usuario); // Utiliza o mesmo campo de comparação
    }
    
}

