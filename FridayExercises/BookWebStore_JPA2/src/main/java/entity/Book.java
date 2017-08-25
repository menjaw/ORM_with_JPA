/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Author Menja
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "BookType")
public abstract class Book implements Serializable {

    //Constructors
    public Book() {
    }

    public Book(Integer isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "isbn", updatable = false, nullable = false)
    private Integer isbn;

    public Integer getIsbn() {
        return isbn;
    }

    public void getIsbn(Integer isbn) {
        this.isbn = isbn;
    }
    @Column
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book[ id: " + isbn + " ]" + "\n"
                + "Title: " + title + "\n"
                + "Author: " + author + "\n"
                + "Price: " + price;
    }

//This class can't be instantiated because it is an abstract class, but abstract entities are otherwise like concrete entities. 
//Abstract entities can be queried just like concrete entities. 
//If an abstract entity is the target of a query, the query operates on all the concrete subclasses of the abstract entity:
}
