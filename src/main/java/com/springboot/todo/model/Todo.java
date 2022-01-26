package com.springboot.todo.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    private String userName;

    @Size(min = 10, message = "Enter description (at least 10 chars)...")
    private String description;

    private Date targetDate;

    public Todo() {
        super();
    }

    public Todo(String user, String desc, Date targetDate, boolean isDone) {
        super();
        this.userName = user;
        this.description = desc;
        this.targetDate = targetDate;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    @Id
    public Integer getId() {
        return Id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }
}
