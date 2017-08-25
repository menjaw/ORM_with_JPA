/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import entity.Customer;
import entity.Order;
import interfaces.FacadeInterface;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

/**
 *
 * @author Menja
 */
public class Facade implements FacadeInterface {

    private EntityManagerFactory emf;

    //CONSTRUCTOR   
    public Facade() {
    }

    public Facade(EntityManagerFactory emf) {
        this.emf = emf;
    }

    //METHODS
    @Override
    public Customer createCustomer(Customer customer) {
        EntityManager em = emf.createEntityManager();

        Customer customer1 = new Customer(0, "Bente Brasen", "Bente1234");
        Customer customer2 = new Customer(0, "Susan Sarsen", "Susan1234");
        Customer customer3 = new Customer(0, "William Wallamuh", "William1234");
        Customer customer4 = new Customer(0, "Per Paskiwati", "Per1234");
        Customer customer5 = new Customer(0, "Jan Jahnsen", "Jan1234");

        try {
            em.getTransaction().begin();
            em.persist(customer1);
            em.getTransaction().commit();
            em.getTransaction().begin();
            em.persist(customer2);
            em.getTransaction().commit();
            em.getTransaction().begin();
            em.persist(customer3);
            em.getTransaction().commit();
            em.getTransaction().begin();
            em.persist(customer4);
            em.getTransaction().commit();
            em.getTransaction().begin();
            em.persist(customer5);
            em.getTransaction().commit();
            System.out.println(customer1 + "\n" + customer2);
            return customer1;
        } finally {
            em.close();
        }
    }

    @Override
    public Customer getCustomer(int id) {
        EntityManager em = emf.createEntityManager();

        try {
            Customer customer = em.find(Customer.class, id);
            System.out.println(customer);
            return customer;
        } finally {
            em.close();
        }
    }

 

    @Override
    public Order createOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Order addOrderToCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Order getOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> getCustomers() {
    EntityManager em = emf.createEntityManager();
    
    TypedQuery<Customer> query = em.createQuery("SELECT c FROM Customer c", Customer.class);
    List<Customer> result = query.getResultList();
        System.out.println(result);
        return result;        
    }
}
