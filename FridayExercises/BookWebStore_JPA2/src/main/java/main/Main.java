/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.Facade;
import entity.Ebook;
import entity.PaperBook;
import javax.persistence.Persistence;

/**
 *
 * @author Menja
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade(Persistence.createEntityManagerFactory("pu"));
        
        /*EBOOKS*/
        //facade.createEbook(new Ebook());
        //facade.readBook(4);
        //facade.deleteBook(1);
//        Ebook ebook = facade.readBook(4);
//        ebook.setDownloadUrl("New URL");
//        ebook.setAuthor("New author");
//        facade.updateBook(ebook);
        
        facade.getEbooks();
        
        /*PAPERBOOKS*/
       //facade.createPaperbook(new PaperBook());
       
    }
}
