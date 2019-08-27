package control;

import dao.DaoPessoa;
import java.util.List;
import model.Pessoa;
import org.hibernate.HibernateException;

public class CtrManterPessoa {
    DaoPessoa acessohibernatepessoa;
    
    public CtrManterPessoa() {
        acessohibernatepessoa = new DaoPessoa();
    }
    
    public int gravarPessoa(Pessoa pessoa) {
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
            return acessohibernatepessoa.carregarTudoOrdenado(Pessoa.class,
"nome");
            } catch (HibernateException e) {
                return null;
            }
    }
    
    public boolean excluirPessoas(Pessoa pessoa) {
        try {
            acessohibernatepessoa.excluir(pessoa);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean alterarPessoa(Pessoa pessoa) {
        try {
            acessohibernatepessoa.alterar(pessoa);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
