package dev.javaAPI01.Cadastro01;

import jakarta.persistence.*;

// Entity ele transforma uma classe em entidade do BD
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Isso é uma notcao
    Long id;
    String nome;
    String email;
    int idade;

    public PessoaModel() {
    }

    public PessoaModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
