package control;

import dao.DaoMorador;
import java.util.List;
import model.Morador;
import org.hibernate.HibernateException;

public class CtrManterMorador {
    DaoMorador acessoHibernateMorador;
    
    public CtrManterMorador() {
        acessoHibernateMorador = new DaoMorador();
    }
    
    public int gravarMorador(Morador morador) {
        try {
            acessoHibernateMorador.gravar(morador);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }
    
    public List carregarMorador() {
        try {
            return acessoHibernateMorador.carregarTudoOrdenado(Morador.class, "moradorId");
        } catch (HibernateException e) {
                return null;
        }
    }
    
    public boolean excluirMorador(Morador morador) {
        try {
            acessoHibernateMorador.excluir(morador);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean alterarMorador(Morador morador) {
        try {
            acessoHibernateMorador.alterar(morador);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
}
