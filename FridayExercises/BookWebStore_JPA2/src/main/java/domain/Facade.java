/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import static entity.Book_.author;
import entity.Ebook;
import entity.PaperBook;
import interfaces.FacadeInterface;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Menja
 */
public class Facade implements FacadeInterface {

    private EntityManagerFactory emf;

    //CONSTRUCTORS
    public Facade() {
    }

    public Facade(EntityManagerFactory emf) {
        this.emf = emf;
    }

    //METHODS
    @Override
    public Ebook createEbook(Ebook ebook) {
        EntityManager em = emf.createEntityManager();

        Ebook ebook1 = new Ebook("Downloade url 1", 5, 0, "Title of the book 1", "The author 1", 125.95);
        Ebook ebook2 = new Ebook("Downloade url 2", 2, 0, "Title of the book 2", "The author 2", 254.95);
        Ebook ebook3 = new Ebook("Downloade url 3", 4, 0, "Title of the book 3", "The author 3", 652.95);
        Ebook ebook4 = new Ebook("Downloade url 4", 3, 0, "Title of the book 4", "The author 4", 823.95);
        Ebook ebook5 = new Ebook("Downloade url 5", 8, 0, "Title of the book 5", "The author 5", 211.95);
        try {
            em.getTransaction().begin();
            em.persist(ebook1);
            em.getTransaction().commit();
            em.getTransaction().begin();
            em.persist(ebook2);
            em.getTransaction().commit();
            em.getTransaction().begin();
            em.persist(ebook3);
            em.getTransaction().commit();
            em.getTransaction().begin();
            em.persist(ebook4);
            em.getTransaction().commit();
            em.getTransaction().begin();
            em.persist(ebook5);
            em.getTransaction().commit();
            return ebook1;
        } finally {
            em.close();
        }
    }

    @Override//getBook
    public Ebook readBook(int id) {
        EntityManager em = emf.createEntityManager();

        try {
            Ebook ebook = em.find(Ebook.class, id);
            System.out.println("Tester om det er her" + ebook);
            return ebook;

        } finally {
            em.close();
        }
    }

    @Override
    public Ebook updateBook(Ebook ebook) {
        EntityManager em = emf.createEntityManager();
        //Ebook upDateEbook = em.find(Ebook.class, ebook.getIsbn());

        try {
            em.getTransaction().begin();
            em.merge(ebook);
            em.getTransaction().commit();
            return ebook;
        } finally {
            em.close();
        }
    }

    @Override
    public Ebook deleteBook(int id) {
        EntityManager em = emf.createEntityManager();
        Ebook ebook = em.find(Ebook.class, id);

        try {
            em.getTransaction().begin();
            em.remove(ebook);
            em.getTransaction().commit();
            return ebook;

        } finally {
            em.close();
        }
    }

    @Override
    public List<Ebook> getEbooks() {
        EntityManager em = emf.createEntityManager();

        TypedQuery<Ebook> query = em.createQuery("SELECT b FROM Ebook b", Ebook.class);

        List<Ebook> result = query.getResultList();
        System.out.println(result);
        return result;
    }

    @Override
    public PaperBook createPaperbook(PaperBook paperBook) {
        EntityManager em = emf.createEntityManager();

        PaperBook paperBook1 = new PaperBook(23.6, 5, 0, "Title of the paperBook 1", "The author 1", 125.95);
        PaperBook paperBook2 = new PaperBook(23.6, 5, 0, "Title of the paperBook 2", "The author 2", 456.95);
        PaperBook paperBook3 = new PaperBook(23.6, 5, 0, "Title of the paperBook 3", "The author 3", 1724.95);
        PaperBook paperBook4 = new PaperBook(23.6, 5, 0, "Title of the paperBook 4", "The author 4", 32.95);
        PaperBook paperBook5 = new PaperBook(23.6, 5, 0, "Title of the paperBook 5", "The author 5", 77.95);

        try {
            em.getTransaction().begin();
            em.persist(paperBook1);
            em.getTransaction().commit();
            em.getTransaction().begin();
            em.persist(paperBook2);
            em.getTransaction().commit();
            em.getTransaction().begin();
            em.persist(paperBook3);
            em.getTransaction().commit();
            em.getTransaction().begin();
            em.persist(paperBook4);
            em.getTransaction().commit();
            em.getTransaction().begin();
            em.persist(paperBook5);
            em.getTransaction().commit();
            return paperBook1;
        } finally {
            em.close();
        }
    }

    @Override
    public PaperBook readPaperBook(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PaperBook updatePaperBook(PaperBook paperBook) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PaperBook deletePaperBook(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PaperBook> getPaperBook() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
