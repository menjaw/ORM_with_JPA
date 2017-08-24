/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entity.Book;
import java.util.List;

/**
 *
 * @author Menja
 */
public interface FacadeInterface {

    public Book getBook(int id);

    public Book addBook(Book book);

    public Book deleteBook(int id);

    public Book editBook(Book book);

    public List<Book> getBooks();
}
