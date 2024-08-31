package lk.ijse.orm.hibernate;

import lk.ijse.orm.hibernate.config.SessionFactoryConfig;
import lk.ijse.orm.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Kamal");
        customer.setAddress("Galle");
        customer.setSalary(25000.00);
        System.out.println("hii");
        Session session = SessionFactoryConfig.getInstance().getSession();
        System.out.println("hvhvhbjbj");
        System.out.println("bhghbj");

        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
    }
}
