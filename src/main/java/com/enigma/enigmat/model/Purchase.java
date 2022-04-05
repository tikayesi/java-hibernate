package com.enigma.enigmat.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trx_purchase")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "purchase_generator")
    @SequenceGenerator(name = "purchase_generator", sequenceName = "transaction_id_seq", allocationSize = 1)
    private Integer id;
    @Column(name = "transaction_date")
    private Date transactionDate;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Purchase() {
    }

    public Purchase(Integer id, Date transactionDate, Customer customerId) {
        this.id = id;
        this.transactionDate = transactionDate;
        this.customer = customerId;
    }
    public Purchase(Date transactionDate, Customer customerId) {
        this.transactionDate = transactionDate;
        this.customer = customerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customerId) {
        this.customer = customerId;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", transactionDate=" + transactionDate +
                ", customer=" + customer +
                '}';
    }
}
