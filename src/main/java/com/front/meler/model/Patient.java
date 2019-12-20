package com.front.meler.model;
import java.awt.*;
import java.util.List;

public class Patient {

    private Long id;

    private String name;

    private String surname;

    private String personalCode;

    private String telephone;

    private String address;

    private String description;
    private List<String> image;

    public Patient(Long id, String name, String surname, String personalCode, String telephone, String address, String description, List<String> image) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.personalCode = personalCode;
        this.telephone = telephone;
        this.address = address;
        this.description = description;
        this.image = image;
    }

    public Patient() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPersonalCode() {
        return this.personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getImage() {
        return this.image;
    }

    public void setImage(List<String> image) {
        this.image = image;
    }
}