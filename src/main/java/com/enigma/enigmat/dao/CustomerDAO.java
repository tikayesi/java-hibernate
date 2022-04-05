package com.enigma.enigmat.dao;

import com.enigma.enigmat.config.HibernateConfig;
import com.enigma.enigmat.model.Customer;
import com.enigma.enigmat.model.Product;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class CustomerDAO {
    public Session session;

    public CustomerDAO() {
        this.session = HibernateConfig.getSessionFactory().openSession();
    }

    public void insert(Customer customer){
        try {
            session.beginTransaction();
            session.save(customer);
            session.getTransaction().commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
    }

    public Customer getCustomer(Integer productId){
        try {
            String getProduct = "FROM Customer WHERE id =" + productId;
            Query query = session.createQuery(getProduct);
            Customer customer = (Customer) query.getSingleResult();
            return customer;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
