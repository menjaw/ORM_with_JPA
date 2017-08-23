/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entity.Book;
import entity.Customer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Menja
 */
public class RunEntityManager {

   private static EntityManagerFactory emf;
    private static EntityManager em;

    public static void main(String[] args) {
       runEntityManager();
       insertBook();
       insertCustomer();               
    }

    //METHODS
    public static void runEntityManager() {
        emf = Persistence.createEntityManagerFactory("pu");
    }

    public static void insertBook() {
        em = emf.createEntityManager();
        //insert new book
        em.getTransaction().begin();
        Book book = new Book();
        book.setTitle("New book");
        em.persist(book);
        em.getTransaction().commit();
        em.close();
    }

    public static void insertCustomer() {
        em = emf.createEntityManager();
        //insert new customer
        em.getTransaction().begin();
        Customer customer = new Customer();
        customer.setUsername("New Customer");
        customer.setPassword("password");
        em.persist(customer);
        em.getTransaction().commit();
    }
}
