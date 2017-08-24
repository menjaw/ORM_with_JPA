/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import entity.Book;
import javax.persistence.Persistence;

/**
 *
 * @author Menja
 */
public class FacadeTest {
    public static void main(String[] args) {
        Facade facade = new Facade(Persistence.createEntityManagerFactory("pu"));
        
       System.out.println("Get book: " + facade.getBook(1));
//        
//        System.out.println("Get books: " + facade.getBooks());
//        
//        System.out.println("Add book: " + facade.addBook(new Book()));
//        
//        System.out.println("Delete book: " + facade.deleteBook(3));
    }
}
