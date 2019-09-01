package dao;

import model.Aparelho;
import model.Casa;
import model.Morador;
import model.Pessoa;
import model.Comodo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateConfiguracao {
    private static SessionFactory sessionFactory;
    
    public HibernateConfiguracao() { 
    }

    public Session openSession() {
        if (sessionFactory == null) {
            criaSessionFactory();
        }
        return sessionFactory.openSession();
    }

    public void criaSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Pessoa.class);
        configuration.addAnnotatedClass(Casa.class);
        configuration.addAnnotatedClass(Morador.class);
        configuration.addAnnotatedClass(Comodo.class);
        configuration.addAnnotatedClass(Aparelho.class);
        
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
 
    }
}

