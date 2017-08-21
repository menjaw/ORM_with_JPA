/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entity.Book;
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
    }

    //METHODS
    public static void schemaBuilder() {
        Persistence.generateSchema("pu", null);
    }

    public static void runEMF() {
        emf = Persistence.createEntityManagerFactory("pu");//Styrer det som skal ned i DB
    }

    public static void insertBooks() {
        EntityManager em = emf.createEntityManager();
        Book book1 = new Book(0, "Title of book", 123.87);
        Book book2 = new Book(0, "Title of Street", 987.87);
        Book book3 = new Book(0, "Title of book", 123.87);
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
}
