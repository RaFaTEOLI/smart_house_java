package control;

import dao.DaoCasa;
import java.util.List;
import model.Casa;
import org.hibernate.HibernateException;

public class CtrManterCasa {
    DaoCasa acessoHibernatecasa;
    
    public CtrManterCasa() {
        acessoHibernatecasa = new DaoCasa();
    }
    
    public int gravarCasa(Casa casa) {
        try {
            acessoHibernatecasa.gravar(casa);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }
    
    public List carregarCasas() {
        try {
            return acessoHibernatecasa.carregarTudoOrdenado(Casa.class,"nome");
        } catch (HibernateException e) {
                return null;
        }
    }
    
    public boolean excluirCasa(Casa casa) {
        try {
            acessoHibernatecasa.excluir(casa);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean alterarCasa(Casa casa) {
        try {
            acessoHibernatecasa.alterar(casa);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
