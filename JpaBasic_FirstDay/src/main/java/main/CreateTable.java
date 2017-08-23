/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entity.Book;
import entity.Customer;
import enums.CustomerType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Menja
 */
public class CreateTable {

    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        schemaBuilder();
        runEMF();
        insertBooks();
        insertCustomerAndType();
    }

    
    
    /*-----METHODS-----*/
    public static void schemaBuilder() {
        Persistence.generateSchema("pu", null);
    }

    public static void runEMF() {
        emf = Persistence.createEntityManagerFactory("pu");//Styrer det som skal ned i DB
    }

    public static void insertBooks() {
        EntityManager em = emf.createEntityManager();
        Book book1 = new Book(0, 123.83, "Title of book");
        Book book2 = new Book(0, 987.81, "Title of Street");
        Book book3 = new Book(0, 183.04, "Title of book");
        em.getTransaction().begin();
        em.persist(book2);
        em.getTransaction().commit();
        em.getTransaction().begin();
        em.persist(book1);
        em.getTransaction().commit();
        em.getTransaction().begin();
        em.persist(book3);
        em.getTransaction().commit();
    }

    public static void insertCustomerAndType() {
        EntityManager em = emf.createEntityManager();

        Customer customer = new Customer(0L, "FirstName", "LastName");
        customer.setCustomerType(CustomerType.GOLD);
        
        em.getTransaction().begin();
        em.persist(customer);
        em.getTransaction().commit();
        em.close();
    }
    
    public static void addHobby(String s){
        Customer customer = new Customer();   
        
        
    }
    
    public static void getHobby(){
    
    }
}
