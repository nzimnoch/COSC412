package com.eventzone.cosc412.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Record {

	@Id
    @GeneratedValue
    private long id;
    @NotEmpty
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data; 
    }

}
