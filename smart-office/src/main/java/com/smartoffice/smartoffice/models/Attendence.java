package com.smartoffice.smartoffice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Attendence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private static final User user=null;
    private Date date;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public User getUser() {
        return user;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Attendence{" +
                "Id=" + Id +
                ", user=" + user +
                ", date=" + date +
                '}';
    }
}
