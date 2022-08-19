package com.laioffer.onlineorder.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "authorities")
public class Authorities implements Serializable {
    // When should I implement Serializable interface?
    // Implement the Serializable interface when you need to store a copy of the object, send them to another
    // process which runs on the same system or over the network.

    // why do we implement serializable?
    // Because you want to store or send an object.
    // Does it give any advantages or security?
    // It makes storing and sending objects easy. It has nothing to do with security.

    private static final long serialVersionUID = 8734140534986494039L;
    // SerialVersionUID is a unique identifier for each class, JVM uses it to compare the versions
    // of the class ensuring that the same class was used during Serialization is loaded during Deserialization.

    @Id
    private String email;

    private String authorities;

    public String getEmail() {
        return email;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }
}
