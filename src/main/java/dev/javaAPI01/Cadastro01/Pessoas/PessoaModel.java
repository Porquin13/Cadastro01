package dev.javaAPI01.Cadastro01.Pessoas;


import dev.javaAPI01.Cadastro01.Mangas.MangasModel;
import jakarta.persistence.*;

import java.util.List;

@Entity //Transforma em entidade banco de dados
@Table(name = "tb_cadastro01")
public class PessoaModel {

    @Id // gerar ids automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera valores em ordem crescente
    private Long id;

    private String nome;

    private String email;

    private int idade;

    // @ManyToOne muitos leitores para um manga
    @ManyToOne
    @JoinColumn(name = "mangas_id") //Chave estrangeria
    private MangasModel manga;


    public PessoaModel() {
    }

    public PessoaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
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
