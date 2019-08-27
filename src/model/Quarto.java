package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quarto implements Serializable {
    
    @Id
    @Column(unique=true)
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    
    private Integer quartoId;
    // Herda o Id da Casa para o mostrar de onde o quarto é
    private String nome;
    private Integer andar;
    
    /**
     * @return the quartoId
     */
    public Integer getQuartoId() {
        return quartoId;
    }

    /**
     * @param quartoId the quartoId to set
     */
    public void setQuartoId(Integer quartoId) {
        this.quartoId = quartoId;
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
}
