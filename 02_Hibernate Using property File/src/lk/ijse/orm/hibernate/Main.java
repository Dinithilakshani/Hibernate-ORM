package lk.ijse.orm.hibernate;

import lk.ijse.orm.hibernate.config.SessionFactoryConfig;
import lk.ijse.orm.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Customer customer = new Customer();
        customer.setId(3);
        customer.setName("Kamal");
        customer.setAddress("Galle");
        customer.setSalary(25000.00);

        Session session = SessionFactoryConfig.getInstance().getSession();

        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
    }
}