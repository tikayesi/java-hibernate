package com.enigma.enigmat.dao;

import com.enigma.enigmat.config.HibernateConfig;
import com.enigma.enigmat.model.Product;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ProductDAO {
    public Session session;

    public ProductDAO() {
        //dibuat contsr untuk membuka sesion
        this.session = HibernateConfig.getSessionFactory().openSession();
    }

    public void insertProduct(Product product){
        try {
            session.beginTransaction();
            session.save(product);
            session.getTransaction().commit();
        } catch (Exception e){
            e.getMessage();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    public void updateProduct(Product product){
        try {
            session.beginTransaction();
            session.update(product);
            session.getTransaction().commit();
        } catch (Exception e){
            e.getMessage();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    public List<Product> getAllProduct(){
        try {
            Query query = session.createQuery("FROM Product");
            List<Product> products = query.getResultList();
            return products;
        } catch (Exception e){
            e.getMessage();
        }finally {
            session.close();
        }
        return null;
    }

    public Product getProduct(Integer productId){
        try {
            String getProduct = "FROM Product WHERE productId =" + productId;
            Query query = session.createQuery(getProduct);
            Product product = (Product) query.getSingleResult();
            return product;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;

    }
}
