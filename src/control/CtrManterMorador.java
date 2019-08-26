package control;

import dao.DaoMorador;
import java.util.List;
import model.Moradores;
import org.hibernate.HibernateException;

public class CtrManterMorador {
    DaoMorador acessoHibernateMorador;
    
    public CtrManterMorador() {
        acessoHibernateMorador = new DaoMorador();
    }
    
    public int gravarMorador(Moradores morador) {
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
            return acessoHibernateMorador.carregarTudoOrdenado(Moradores.class,
"nome");
        } catch (HibernateException e) {
                return null;
        }
    }
    
    public boolean excluirMorador(Moradores morador) {
        try {
            acessoHibernateMorador.excluir(morador);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean alterarMorador(Moradores morador) {
        try {
            acessoHibernateMorador.alterar(morador);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
}
