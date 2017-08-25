/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.Facade;
import entity.Customer;
import entity.Order;
import javax.persistence.Persistence;

/**
 *
 * @author Menja
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade(Persistence.createEntityManagerFactory("pu"));
        
        //facade.createCustomer(new Customer());
        //facade.getCustomer(2);
        //facade.getCustomers();
        facade.createOrder(new Order());
    }
}
