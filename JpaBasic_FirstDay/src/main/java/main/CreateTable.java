/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Menja
 */
public class CreateTable {
    public static void main(String[] args) {
        schemaBuilder();
        runEntityFactoryManager();
    }
    
    public static void schemaBuilder() {
        Persistence.generateSchema("pu", null);
    }
    
    public static void runEntityFactoryManager(){
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    EntityManager em = emf.createEntityManager();
    }
}
