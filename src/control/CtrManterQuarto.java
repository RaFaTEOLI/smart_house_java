package control;

import dao.DaoQuarto;
import java.util.List;
import model.Quarto;
import org.hibernate.HibernateException;

public class CtrManterQuarto {
    DaoQuarto acessoHibernateQuarto;
    
    public CtrManterQuarto() {
        acessoHibernateQuarto = new DaoQuarto();
    }
    
    public int gravarQuarto(Quarto quarto) {
        try {
            acessoHibernateQuarto.gravar(quarto);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }
    
    public List carregarQuartos() {
        try {
            return acessoHibernateQuarto.carregarTudoOrdenado(Quarto.class,
"nome");
        } catch (HibernateException e) {
                return null;
        }
    }
    
    public boolean excluirQuarto(Quarto quarto) {
        try {
            acessoHibernateQuarto.excluir(quarto);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean alterarQuarto(Quarto quarto) {
        try {
            acessoHibernateQuarto.alterar(quarto);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
