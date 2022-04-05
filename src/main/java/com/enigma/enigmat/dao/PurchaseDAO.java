package com.enigma.enigmat.dao;

import com.enigma.enigmat.config.HibernateConfig;
import com.enigma.enigmat.model.Purchase;
import com.enigma.enigmat.model.PurchaseDetail;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class PurchaseDAO {
    public Session session;

    public PurchaseDAO() {
        this.session = HibernateConfig.getSessionFactory().openSession();
    }

    public void insert(Purchase purchase){
        try {
            session.beginTransaction();
            session.save(purchase);
            session.getTransaction().commit();
        }catch (Exception e){
            e.getMessage();
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
    }

    public Purchase getPurchase(Integer purchaseId){
        try {
            String getProduct = "FROM Purchase WHERE id =" + purchaseId;
            Query query = session.createQuery(getProduct);
            return (Purchase) query.getSingleResult();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;

    }
}
