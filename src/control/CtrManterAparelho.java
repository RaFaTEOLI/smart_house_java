package control;

import dao.DaoAparelho;
import java.util.List;
import model.Aparelhos;
import org.hibernate.HibernateException;

public class CtrManterAparelho {
    DaoAparelho acessoHibernateAparelho;
    
    public CtrManterAparelho() {
        acessoHibernateAparelho = new DaoAparelho();
    }
    
    public int gravarAparelho(Aparelhos aparelho) {
        try {
            acessoHibernateAparelho.gravar(aparelho);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }
    
    public List carregarAparelho() {
        try {
            return acessoHibernateAparelho.carregarTudoOrdenado(Aparelhos.class,
"nome");
        } catch (HibernateException e) {
                return null;
        }
    }
    
    public boolean excluirAparelho(Aparelhos aparelho) {
        try {
            acessoHibernateAparelho.excluir(aparelho);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean alterarAparelho(Aparelhos aparelho) {
        try {
            acessoHibernateAparelho.alterar(aparelho);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
