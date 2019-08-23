package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Casas implements Serializable {
    
    @Id
    @Column(unique=true)
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    
    private Integer casaId;
    // Herda o Id da Pessoa para o inserir o proprietario
    private String nome;
    private String endereco;
    private String cidade;
    private String cep;

    /**
     * @return the casaId
     */
    public Integer getCasaId() {
        return casaId;
    }

    /**
     * @param casaId the casaId to set
     */
    public void setCasaId(Integer casaId) {
        this.casaId = casaId;
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
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }
    
}
