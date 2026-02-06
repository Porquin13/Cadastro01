package dev.javaAPI01.Cadastro01.Mangas;

import dev.javaAPI01.Cadastro01.Pessoas.PessoaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_maga")
public class MangasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeManga;

    private String generoManga;

    private PessoaModel pessoa;

    @OneToMany(mappedBy = mangas) // Um manga para muitos leitores
    private List<PessoaModel>leitor;

    public MangasModel() {
    }

    public MangasModel(String nomeManga, String generoManga) {
        this.nomeManga = nomeManga;
        this.generoManga = generoManga;
    }

    public String getnomeManga() {
        return nomeManga;
    }

    public void setnomeManga(String nomeManga) {
        nomeManga = nomeManga;
    }

    public String getgeneroManga() {
        return generoManga;
    }

    public void setgeneroManga(String generoManga) {
        generoManga = generoManga;
    }

}