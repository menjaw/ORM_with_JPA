/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entity.Customer;
import entity.Order;
import java.util.List;

/**
 *
 * @author Menja
 */
public interface FacadeInterface {

    //Create a Customer
    public Customer createCustomer(Customer customer);

    //Find a Customer
    public Customer getCustomer(int id);

    //Get all Customers
    public List<Customer> getCustomers();

    //Create an Order 
    public Order createOrder(Order order);

    //Add an Order to a Customer
    public Order addOrderToCustomer();

    //Find an Order
    public Order getOrder();
    
    //Create an ItemType 
    //Create an OrderLine

}
