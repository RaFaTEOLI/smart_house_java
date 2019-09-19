package model;

import java.io.Serializable;
import java.util.Arrays;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Aparelho implements Serializable {
   
    @Id
    @Column(unique=true)
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Integer aparelhoId;
    
    @ManyToOne
    @JoinColumn(name="comodoId")
    private Comodo comodoId;
    
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

    /**
     * @return the comodoId
     */
    public Comodo getComodoId() {
        return comodoId;
    }

    /**
     * @param comodoId the comodoId to set
    */
    public void setComodoId(Comodo comodoId) {
        this.comodoId = comodoId;
    }
    
    @Override
    public String toString() {
        return this.getAparelhoId() + " - " + this.getNome();
    }
    
    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (this.getAparelhoId().equals(((Aparelho)obj).getAparelhoId())) {
            result = true;
        }
        return result;
    }
}
