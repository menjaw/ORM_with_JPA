/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.HashMap;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Menja
 */
public class CreateTables {

   private static EntityManagerFactory emf;

    public static void main(String[] args) {
        generateSchema();
    }

    /*METHODS*/
    public static void generateSchema() {
        emf = Persistence.createEntityManagerFactory("pu");
        
        HashMap puProp = new HashMap();
       
        puProp.put("javax.persistence.sql-load-script-source", "DropAndCreateDB");
        Persistence.generateSchema("pu", puProp);//expect a map by default (so create on by yourself)
        
        puProp.remove("javax.persistence.sql-load-script-source");
        Persistence.generateSchema("pu", puProp);
    }
    
    public static void insertData(){
    
    }
}
