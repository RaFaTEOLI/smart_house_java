package dao;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class DaoLogin extends DaoGenerico {
    public DaoLogin() {
        
    }
    
    public List validaLoginOld(String usuario, String senha) throws HibernateException {
        List l;
        Session session = hibernateConfiguracao.openSession();
        Transaction transaction = session.beginTransaction();
        
        SQLQuery query = session.createSQLQuery("SELECT COUNT(*), usuario, senha FROM Pessoa WHERE usuario = '" + usuario + "' AND senha = '" + senha + "' GROUP BY usuario, senha");
        System.out.println("LOG STATUS | Selecionando se usuário existe no banco... ");
        System.out.println("LOG QUERY | " + query);
        
        List<Object[]> rows = query.list();
        
        for(Object[] row : rows){
            Long id = Long.parseLong(row[0].toString());
            String Susuario = row[1].toString();
            String Ssenha = row[2].toString();
            System.out.println("LOG STATUS | Valor recebido do objeto: " + id + ", " + Susuario + ", " + Ssenha);
        }
        //l = query.list();
        
        transaction.commit();
        session.close();
        System.out.println("LOG RETURN | " + rows);
        return rows;
    }
    
    public Long validaLogin(String usuario, String senha) throws HibernateException {
        List l;
        Session session = hibernateConfiguracao.openSession();
        Transaction transaction = session.beginTransaction();
        
        Query query = session.createQuery("SELECT COUNT(*) FROM Pessoa WHERE usuario = '" + usuario + "' AND senha = '" + senha + "'");
        System.out.println("LOG STATUS | Selecionando se usuário existe no banco... ");
        System.out.println("LOG QUERY | " + query);
        System.out.println("LOG RETURN | " + (Long) query.uniqueResult());
        return (Long) query.uniqueResult();
    }
}
