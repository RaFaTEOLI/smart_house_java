package control;

import dao.DaoPessoa;
import java.util.List;
import model.Pessoas;
import org.hibernate.HibernateException;

public class CtrManterPessoa {
    DaoPessoa acessohibernatepessoa;
    
    public CtrManterPessoa() {
        acessohibernatepessoa = new DaoPessoa();
    }
    
    public int gravarPessoa(Pessoas pessoa) {
        try {
            acessohibernatepessoa.gravar(pessoa);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }
    
    public List carregarPessoas() {
        try {
            return acessohibernatepessoa.carregarTudoOrdenado(Pessoas.class,
"nome");
            } catch (HibernateException e) {
                return null;
            }
    }
    
    public boolean excluirPessoas(Pessoas pessoa) {
        try {
            acessohibernatepessoa.excluir(pessoa);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean alterarPessoa(Pessoas pessoa) {
        try {
            acessohibernatepessoa.alterar(pessoa);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
