package com.easytask.model;

import com.easytask.model.enumeracoes.CategoriaServico;
import com.easytask.model.enumeracoes.TipoServico;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "servicos")
public class Servico {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING) @NotNull
    private TipoServico tipo;

    @Enumerated(EnumType.STRING)
    private CategoriaServico categoria;

    @NotBlank
    private String atividade;

    @NotBlank
    private String descricao;

    @OneToOne @JoinColumn(name = "profissional_do_servico")
    private Usuario profissional;

    private String nome;

    // ___________ GETTERS AND SETTERS _____________ss

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoServico getTipo() {
        return tipo;
    }

    public void setTipo(TipoServico tipo) {
        this.tipo = tipo;
    }

    public CategoriaServico getCategoria() { return categoria; }

    public void setCategoria(CategoriaServico categoria) { this.categoria = categoria; }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario getProfissional() {
        return profissional;
    }

    public void setProfissional(Usuario profissional) {
        this.profissional = profissional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("Servico: \nTipo: %s \nCategoria: %s \nAtividade: %s \nDescricao: %s \n",
                 tipo.getNome(), categoria.getNome(), atividade, descricao);
    }
}
