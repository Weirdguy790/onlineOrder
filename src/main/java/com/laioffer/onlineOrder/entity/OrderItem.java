package com.laioffer.onlineOrder.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "orderitem")
public class OrderItem implements Serializable {

    private static final long serialVersionUID = -2455760938054036364L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int quantity;

    private double price;

    //create foreign key to link two tables  in Hibernate
    //OrderItem N:1 MenuItem
    @ManyToOne
    private MenuItem menuItem;

    //create foreign key to link two tables  in Hibernate
    //OrderItem N:1 Cart
    @ManyToOne
    @JsonIgnore
    private Cart cart;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public Cart getCart() {
        return cart;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}

