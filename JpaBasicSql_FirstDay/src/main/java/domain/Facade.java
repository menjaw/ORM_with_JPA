/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import entity.Book;
import interfaces.FacadeInterface;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Menja
 */
public class Facade implements FacadeInterface {

    private EntityManagerFactory emf;

    /*--Constructor--*/
    public Facade(EntityManagerFactory emf) {
        this.emf = emf;
    }

    /*--Methods--*/
    @Override
    public Book getBook(int id) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Book book = em.find(Book.class, id);
            em.getTransaction().commit();
            System.out.println("Tester");
            return book;

        } finally {
            em.close();
        }
    }

    @Override
    public Book addBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Book deleteBook(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Book editBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Book> getBooks() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
