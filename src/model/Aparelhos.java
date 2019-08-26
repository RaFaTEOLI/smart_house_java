package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aparelhos implements Serializable {
    
    @Id
    @Column(unique=true)
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    
    private Integer aparelhoId;
    // Herda o Id da Quarto para o mostrar de onde o aparelho é
    private String nome;
    private String descricao;
    
    
    /**
     * @return the aparelhoId
     */
    public Integer getAparelhoId() {
        return aparelhoId;
    }

    /**
     * @param aparelhoId the aparelhoId to set
     */
    public void setAparelhoId(Integer aparelhoId) {
        this.aparelhoId = aparelhoId;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
