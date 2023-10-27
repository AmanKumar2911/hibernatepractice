package com.example;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class emptable {

    @Id
    private int id;
    private String name;
    private String city;

    private Certificate certi;

    public emptable(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public emptable() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Certificate getcerti(){
        return certi;
    }

    public void setcerti(Certificate certi){
        this.certi = certi;
    }

    



}
