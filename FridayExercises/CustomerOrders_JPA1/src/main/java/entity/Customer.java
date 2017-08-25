/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Menja
 */
@Entity
public class Customer implements Serializable {

    //Constructors
    public Customer() {
    }

    public Customer(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Customer(List<Order> orderList, Integer id, String name, String password) {
        this.orderList = orderList;
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @OneToMany(mappedBy = "customer")//reference the mapping
    List<Order> orderList = new ArrayList();
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "entity.Customer[ id=" + id + " ]";
    }

    public void addOrder(Order order) {
        this.orderList.add(order);
    }

}
