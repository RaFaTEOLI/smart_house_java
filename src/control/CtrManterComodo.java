package control;

import dao.DaoComodo;
import java.util.List;
import model.Comodo;
import org.hibernate.HibernateException;

public class CtrManterComodo {
    DaoComodo acessoHibernateQuarto;
    
    public CtrManterComodo() {
        acessoHibernateQuarto = new DaoComodo();
    }
    
    public int gravarComodo(Comodo quarto) {
        try {
            acessoHibernateQuarto.gravar(quarto);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }
    
    public List carregarComodos() {
        try {
            return acessoHibernateQuarto.carregarTudoOrdenado(Comodo.class,
"nome");
        } catch (HibernateException e) {
                return null;
        }
    }
    
    public boolean excluirComodo(Comodo quarto) {
        try {
            acessoHibernateQuarto.excluir(quarto);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean alterarComodo(Comodo quarto) {
        try {
            acessoHibernateQuarto.alterar(quarto);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
