/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Menja
 */
@Entity
public class Book implements Serializable {

    //Constructors
    public Book() {
    }

    public Book(int Id, String title) {
        this.Id = Id;
        this.title = title;
    }

    public Book(int Id, String title, double price) {
        this.Id = Id;
        this.title = title;
        this.price = price;
    }

    //Variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
