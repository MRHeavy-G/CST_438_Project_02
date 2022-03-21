package com.example.project02.Project02_Team8.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer listId;
    private String listName;
    private Integer user_id;

    public Wishlist(Integer listId, String listName, Integer user_id) {
        this.listId = listId;
        this.listName = listName;
        this.user_id = user_id;
    }

    public Wishlist() {

    }

    public Integer getUser_id(Integer user_id) {
        return this.user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }


}
