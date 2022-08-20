package com.laioffer.onlineOrder.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "restaurants")
public class Restaurant implements Serializable {

    private static final long serialVersionUID = 2455760938054036111L;

    @Id
    private int id;

    private String address;

    private String name;

    private String phone;

    private String imageUrl;

    //create foreign key to link two tables  in Hibernate
    //Restaurant 1:N MenuItem
    @OneToMany(mappedBy = "restaurant",  cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    //@JsonIgnore is used to ignore the logical property used in serialization and deserialization.
    private List<MenuItem> menuItemList;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }
}

