package lk.ijse.orm.hibernate.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="`order`")//meke order kiyla qurry thiyn nisa error nethi wenn
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ("order_id"))
    private int id;

   @Column(name = "order_description")
   private String description;

   @CreationTimestamp
    @Column(name = "order_date_time")
    private Timestamp orderDateTime;

   @ManyToOne
   @JoinColumn(name = "customer_id")//customer id ekata thmai mapping wenn ona
   private Customer customer ;//order ekakata innw customer kenek

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", orderDateTime=" + orderDateTime +
                ", customer=" + customer +
                '}';
    }

    public Order(int id, String description, Timestamp orderDateTime, Customer customer) {
        this.id = id;
        this.description = description;
        this.orderDateTime = orderDateTime;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(Timestamp orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    @ManyToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Item> items= new ArrayList<>();
}
