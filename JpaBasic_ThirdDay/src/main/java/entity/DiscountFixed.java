/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Menja
 */
@Entity(name = "DiscountFixed")
@DiscriminatorValue("DiscountFixed")
public class DiscountFixed extends DiscountType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    double discount = 0.1;
    @Override
    public double calcDiscount(double priceItem, int quantity){
    return priceItem * discount * quantity;
    }

    @Override
    public String toString() {
        return "entity.DiscountFixed[ id=" + id + " ]";
    }

}
