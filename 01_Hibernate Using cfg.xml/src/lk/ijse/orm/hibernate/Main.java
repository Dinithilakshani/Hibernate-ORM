package lk.ijse.orm.hibernate;

import lk.ijse.orm.hibernate.config.SessionFactoryConfig;
import lk.ijse.orm.hibernate.embedded.MobileNo;
import lk.ijse.orm.hibernate.embedded.NameIdentifier;
import lk.ijse.orm.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        // customer.setId(4)
        /* customer.setName("Kasun");
        NameIdentifier name = new NameIdentifier();
        name.setFirstName("Dinithi");
        name.setMidddleName("Lakshani");
        name.setLastName("palliayguru");
        customer.setNameIder(name);

        //customer.setNameIder();
        customer.setAddress("Galle");
        customer.setSalary(25000.00);
        customer.setAge(20);

        List<MobileNo > mobileNos = new ArrayList<>();
        MobileNo homeNo = new MobileNo();
        homeNo.setType("HOME");
        homeNo.setMobileNo("0912283008");

        MobileNo mobileNo = new MobileNo();
        mobileNo.setType("MOBILE");
        mobileNo.setMobileNo("0776419446");

        mobileNos.add(homeNo);
        mobileNos.add(mobileNo);

        customer.setPhoneNos(mobileNos);*/


        //save

        customer.setName("Dinu");
        customer.setAddress("Galle");

        Session session = SessionFactoryConfig.getInstance().getSession();

        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();

        //update

      /*  Session updatecustomerSession = SessionFactoryConfig
                .getInstance()
                .getSession();

        Transaction Updatecustransaction = updatecustomerSession
                .beginTransaction();

        customer.setAddress("Mathara");
        // customer.setName("Amashii");
       // customer.setSalary(50000);

        updatecustomerSession.update(customer);
        Updatecustransaction.commit();
        updatecustomerSession.close();

        //get existing customer

        Session getcustomer = SessionFactoryConfig
                .getInstance()
                .getSession();

        Customer existingcustomer = getcustomer
                .get(Customer.class, 2);
        System.out.println(existingcustomer);

        //Delete

        Session deletecustomer = SessionFactoryConfig
                .getInstance()
                .getSession();

        Transaction DeleteTrans = deletecustomer.beginTransaction();
        deletecustomer.delete(existingcustomer);
        DeleteTrans.commit();
        deletecustomer.close();


    }*/
    }
}
//