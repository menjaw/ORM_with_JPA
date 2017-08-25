/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.HashMap;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Menja
 */
public class CreateTable {

    EntityManagerFactory emf;
    EntityManager em;

    public static void main(String[] args) {
        structure();
    }

    /*---METHODS---*/
    public static void structure() {

        HashMap puproperties = new HashMap();

        puproperties.put("javax.persistence.sql-load-script-source", "script/DropAndCreateDB.sql");
        Persistence.generateSchema("pu", puproperties);

        puproperties.remove("javax.persistence.sql-load-script-source");
        Persistence.generateSchema("pu", puproperties);
    }

}
