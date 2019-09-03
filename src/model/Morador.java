package model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

@Entity
public class Morador implements Serializable {
    @Id
    @Column(unique=true)
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Integer moradorId;
    
    @ManyToOne
    @JoinColumn(name="pessoaId")
    private Pessoa pessoaId;
    
    @ManyToOne
    @JoinColumn(name="casaId")
    private Casa casaId;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data_cadastro;
    
    /**
     * @return the casaId
     */
    public Casa getCasaId() {
        return casaId;
    }

    /**
     * @param casaId the casaId to set
     */
    public void setCasaId(Casa casaId) {
        this.casaId = casaId;
    }
    
    /**
     * @return the pessoaId
     */
    public Pessoa getPessoaId() {
        return pessoaId;
    }

    /**
     * @param pessoaId the pessoaId to set
     */
    public void setPessoaId(Pessoa pessoaId) {
        this.pessoaId = pessoaId;
    }
    
    /**
     * @return the moradorId
     */
    public Integer getMoradorId() {
        return moradorId;
    }

    /**
     * @param moradorId the moradorId to set
     */
    public void setMoradorId(Integer moradorId) {
        this.moradorId = moradorId;
    }

    /**
     * @return the data_cadastro
     */
    public Date getDataCadastro() {
        return data_cadastro;
    }
    
    /**
     * @param dataCadastro the dataCadastro to set
     */
    public void setDataCadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    
    public String toStringOld() {
        return Arrays.toString(new Object[] {getPessoaId(), getCasaId()});
    }
    
    @Override
    public String toString() {
        return this.moradorId + " - " + getPessoaId() + " | Casa: " + getCasaId();
    }
    
    @Override
    public boolean equals(Object obj) {
        boolean result = false;
            if (this.getMoradorId().equals(((Morador)obj).getMoradorId())) {
                result = true;
            }
        return result;
    }
  
    
}
