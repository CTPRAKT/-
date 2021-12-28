package com.boots.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Reserv {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String target;

    private Date date;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Reserv() {
    }

    public Reserv(String target, Date date) {
        this.target = target;
        this.date = date;

    }

}

