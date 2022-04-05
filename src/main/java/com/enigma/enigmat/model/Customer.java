package com.enigma.enigmat.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "mst_customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_generator")
    @SequenceGenerator(name = "customer_generator", sequenceName = "customer_id_seq", allocationSize = 1)
    private Integer id;
    private String name;
    private String address;
    private Integer phone;
    @Column(name = "birthdate")
    private Date birthDate;
    private String status;
    public Customer() {
    }

    public Customer(Integer id, String name, String address, Integer phone, Date birthDate, String status) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.birthDate = birthDate;
        this.status = status;
    }

    public Customer(String name, String address, Integer phone, Date birthDate, String status) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.birthDate = birthDate;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", birthDate=" + birthDate +
                ", status='" + status + '\'' +
                '}';
    }
}
