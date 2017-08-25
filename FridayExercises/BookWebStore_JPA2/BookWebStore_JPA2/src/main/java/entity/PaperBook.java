/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


/**
 *
 * @author Menja
 */
@Entity
@DiscriminatorValue("PaperBook")
public class PaperBook extends Book implements Serializable {

    //Constructors
    public PaperBook() {
    }
    
    public PaperBook(double shippingWeight, int inStock) {
        this.shippingWeight = shippingWeight;
        this.inStock = inStock;
    }

    public PaperBook(double shippingWeight, int inStock, Integer isbn, String title, String author, double price) {
        super(isbn, title, author, price);
        this.shippingWeight = shippingWeight;
        this.inStock = inStock;
    }
    
    private double shippingWeight;

    public double getShippingBook() {
        return shippingWeight;
    }

    public void setShippingBook(double shippingWeight) {
        this.shippingWeight = shippingWeight;
    }

    private int inStock;

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "entity.PaperBook[ id=" +  " ]";
    }

}
