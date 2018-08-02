package com.smartoffice.smartoffice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class NoticeBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private static final User user = null;
    private Date givenDate;
    private Date endDate;
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public User getUser() {
        return user;
    }
    public Date getGivenDate() {
        return givenDate;
    }

    public void setGivenDate(Date givenDate) {
        this.givenDate = givenDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "NoticeBoard{" +
                "Id=" + Id +
                ", user=" + user +
                ", givenDate=" + givenDate +
                ", endDate=" + endDate +
                '}';
    }
}
