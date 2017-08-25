/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Menja
 */
@Entity
@DiscriminatorValue("Ebook")
public class Ebook extends Book implements Serializable {
    //Construtors
    public Ebook() {
    }
    
    public Ebook(String downloadUrl, double sizeMB) {
        this.downloadUrl = downloadUrl;
        this.sizeMB = sizeMB;
    }

    public Ebook(String downloadUrl, double sizeMB, Integer isbn, String title, String author, double price) {
        super(isbn, title, author, price);
        this.downloadUrl = downloadUrl;
        this.sizeMB = sizeMB;
    }
    
    
    //Variables
    @Column
    private String downloadUrl;

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
    @Column
    private double sizeMB;

    public double getSizeMB() {
        return sizeMB;
    }

    public void setSizeMB(double sizeMB) {
        this.sizeMB = sizeMB;
    }

    @Override
    public String toString() {
        return "Ebook: downloadUrl: " + getDownloadUrl() + "\n"  + 
                "Title: " + getTitle() + "\n" + 
                "Author: " + getAuthor();
    }

}
