package lk.ijse.orm.hibernate.config;

import lk.ijse.orm.hibernate.entity.Customer;
import lk.ijse.orm.hibernate.entity.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class SessionFactoryConfig {

    private static SessionFactoryConfig factoryConfig;

    private final SessionFactory sessionFactory;

    private SessionFactoryConfig(){

       /* sessionFactory = new MetadataSources(
                 new StandardServiceRegistryBuilder()
                         .configure()
                         .build())
                         .addAnnotatedClass(Customer.class)
                         .getMetadataBuilder()
                         .build()
                         .buildSessionFactory();
*/
     sessionFactory = new Configuration()
             .configure()
             .addAnnotatedClass(Customer.class)
             .addAnnotatedClass(Order.class)
             .buildSessionFactory();
    }



    public static SessionFactoryConfig getInstance() {
        return (factoryConfig == null) ? factoryConfig = new SessionFactoryConfig() : factoryConfig;
    }

    public Session getSession() {


return sessionFactory.openSession();

    }

}
