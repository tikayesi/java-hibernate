package com.enigma.enigmat.dao;

import com.enigma.enigmat.config.HibernateConfig;
import com.enigma.enigmat.model.Customer;
import com.enigma.enigmat.model.Purchase;
import com.enigma.enigmat.model.PurchaseDetail;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class PurchaseDetailDAO {
    public Session session;

    public PurchaseDetailDAO() {
        this.session = HibernateConfig.getSessionFactory().openSession();
    }


    public void insert(PurchaseDetail purchaseDetail){
        try {
            session.beginTransaction();
            session.save(purchaseDetail);
            session.getTransaction().commit();
        }catch (Exception e){
            e.getMessage();
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
    }


}
