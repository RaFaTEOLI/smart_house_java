package control;

import dao.DaoCasa;
import java.util.List;
import model.Casas;
import org.hibernate.HibernateException;

public class CtrManterCasa {
    DaoCasa acessoHibernatecasa;
    
    public CtrManterCasa() {
        acessoHibernatecasa = new DaoCasa();
    }
    
    public int gravarCasa(Casas casa) {
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
            return acessoHibernatecasa.carregarTudoOrdenado(Casas.class,
"nome");
        } catch (HibernateException e) {
                return null;
        }
    }
    
    public boolean excluirCasa(Casas casa) {
        try {
            acessoHibernatecasa.excluir(casa);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean alterarCasa(Casas casa) {
        try {
            acessoHibernatecasa.alterar(casa);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
