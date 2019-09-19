package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comodo implements Serializable {
    
    @Id
    @Column(unique=true)
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Integer comodoId;
    
    @ManyToOne
    @JoinColumn(name="casaId")
    private Casa casaId;
    
    private String nome;
    private Integer andar;
    
    
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
     * @return the quartoId
     */
    public Integer getComodoId() {
        return comodoId;
    }

    /**
     * @param quartoId the quartoId to set
     */
    public void setComodoId(Integer quartoId) {
        this.comodoId = quartoId;
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
     * @return the andar
     */
    public Integer getAndar() {
        return andar;
    }

    /**
     * @param andar the andar to set
     */
    public void setAndar(Integer andar) {
        this.andar = andar;
    }

    
        @Override
    public String toString() {
        return this.getComodoId() + " - " + this.getNome();
    }
    
    public boolean equals(Object obj) {
        boolean result = false;
            if (this.getComodoId().equals(((Comodo)obj).getComodoId())) {
                result = true;
            }
        return result;
    }

}
