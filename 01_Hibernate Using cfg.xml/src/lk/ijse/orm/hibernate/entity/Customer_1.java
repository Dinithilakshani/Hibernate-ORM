/*package lk.ijse.orm.hibernate.entity;

import lk.ijse.orm.hibernate.embedded.MobileNo;
import lk.ijse.orm.hibernate.embedded.NameIdentifier;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "customer")

//@Table (name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int id;

    //@Column (name = "customer_name" ,nullable = false,length = 50)
    //  private String name;


    private NameIdentifier nameIdentifier;
    @Column(name = "customer_address")
    private String address;

    @Column(name = "customer_salary")
    private double salary;

    @Column(name = "customer_age", columnDefinition = "TINYINT")
    private int age;
  @ElementCollection
  @CollectionTable(name = "customer_mobileNo"
  ,joinColumns = @JoinColumn(name = "customer_id"))


    private List<MobileNo> phoneNos = new ArrayList<>();


    public List<MobileNo> getPhoneNos() {
        return phoneNos;
    }

    public void setPhoneNos(List<MobileNo> phoneNos) {
        this.phoneNos = phoneNos;
    }

    public Customer() {
    }


    @CreationTimestamp
    private Timestamp createDataTime;
    //@Transient
    @Column(name = "customer_dob")
    private String dob;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Customer(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", nameIder=" + nameIdentifier +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", createDataTime=" + createDataTime +
                ", dob='" + dob + '\'' +
                '}';
    }

    public Customer(int id, NameIdentifier nameIder, String address, double salary, int age, Timestamp createDataTime, String dob) {
        this.id = id;
        this.nameIdentifier = nameIder;
        this.address = address;
        this.salary = salary;
        this.age = age;
        this.createDataTime = createDataTime;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NameIdentifier getNameIder() {
        return nameIdentifier;
    }

    public void setNameIder(NameIdentifier nameIder) {
        this.nameIdentifier = nameIder;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
?*/