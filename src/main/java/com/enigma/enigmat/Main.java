package com.enigma.enigmat;

import com.enigma.enigmat.dao.CustomerDAO;
import com.enigma.enigmat.dao.ProductDAO;
import com.enigma.enigmat.dao.PurchaseDAO;
import com.enigma.enigmat.dao.PurchaseDetailDAO;
import com.enigma.enigmat.model.Customer;
import com.enigma.enigmat.model.Product;
import com.enigma.enigmat.model.Purchase;
import com.enigma.enigmat.model.PurchaseDetail;

import java.sql.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();
        Product product = productDAO.getProduct(101);
        System.out.println(product);
//        PurchaseDetailDAO purchaseDetail = new PurchaseDetailDAO();
//        PurchaseDetail purchaseDetail1 = new PurchaseDetail(21, 5, 12000, 1, product);
//        purchaseDetail.insert(purchaseDetail1);
//        Product product = new Product(101, "Minyak Kelapa", 12000, 5);
//        productDAO.updateProduct(product);
//        List<Product> products = productDAO.getAllProduct();
//        for (Product product: products) {
//            System.out.println(product);
//        }

//        CustomerDAO customerDAO = new CustomerDAO();
//        System.out.println(customerDAO.getCustomer(1));
//        Customer customer = new Customer("Papoy",
//                "Pasar Minggu", 1234,
//                Date.valueOf("1999-01-01"), "Pekerja");
//        customerDAO.insert(customer);

//        Customer customer = new Customer();
//        customer.setId(2);
//        PurchaseDAO purchaseDAO = new PurchaseDAO();
//        Purchase purchase = new Purchase(Date.valueOf("2021-01-01"), customer);
//        purchaseDAO.insert(purchase);
//        System.out.println(purchaseDAO.getPurchase(1));
    }
}
