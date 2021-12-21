package br.com.site.gatinho.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Gato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String email;

    private String raca;

    private String cor;

    private String coisaFavorita;

    private String descricao;

    private String fotoUrl;

    public Gato(String nome, String email, String raca, String cor, String coisaFavorita, String descricao, String fotoUrl) {
        this.nome = nome;
        this.email = email;
        this.raca = raca;
        this.cor = cor;
        this.coisaFavorita = coisaFavorita;
        this.descricao = descricao;
        this.fotoUrl = fotoUrl;
    }

    @Deprecated
    public Gato() {
    }

}
