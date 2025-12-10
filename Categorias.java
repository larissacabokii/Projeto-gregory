/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Objects;

/**
 *
 * @author gregory
 */
public class Categorias {
    private int id_categoria;
    private String nome;
    private String descricao;
    
    // Métodos de encapsulamento


    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        Categorias tp = (Categorias) obj;
        return this.id_categoria == tp.id_categoria; // visto que id é um identificador único para o TipoProduto
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_categoria); // Utiliza o mesmo campo de comparação
    }
    
}