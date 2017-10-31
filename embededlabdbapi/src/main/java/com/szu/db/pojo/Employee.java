package com.szu.db.pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kamyang on 2017/10/31.
 */
@Entity
@Table(name = "emp1000")
public class Employee implements Serializable {
    @Id
    @Column(name = "id")
    @GenericGenerator(name = "increment", strategy = "increment")
    @GeneratedValue(generator="increment")
    private int id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
