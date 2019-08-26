package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Moradores implements Serializable {
    
    @Id
    @Column(unique=true)
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    
    private Integer moradorId;
    // Herda o Id da Pessoa para o mostrar quem é a pessoa
    // Herda o Id da Casa para o mostrar de qual casa a pessoa mora
    private String data_cadastro;
    
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
    public String getData_cadastro() {
        return data_cadastro;
    }

    /**
     * @param data_cadastro the data_cadastro to set
     */
    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
    
}
