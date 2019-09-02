package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Morador implements Serializable {
    
    @Id
    @Column(unique=true)
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    
    
    
    
    private Integer moradorId;
    // Herda o Id da Pessoa para o mostrar quem é a pessoa
    // Herda o Id da Casa para o mostrar de qual casa a pessoa mora
    private Date data_cadastro;
    
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
    public Date getData_cadastro() {
        return data_cadastro;
    }

    /**
     * @param data_cadastro the data_cadastro to set
     */
    public void setData_cadastro(Date data_cadastro) {
        this.setData_cadastro(data_cadastro);
    }

    /**
     * @return the pessoa
     */
  
    
}
