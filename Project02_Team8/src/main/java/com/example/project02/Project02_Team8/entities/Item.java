package com.example.project02.Project02_Team8.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer item_id;
    private String name;
    private Double cost;
    private String description;
    private Integer stock;
    private String category;

    public Item(String name, Double cost, String description, Integer stock, String category) {
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.stock = stock;
        this.category = category;
    }

    public Item() {

    }

    public Integer getItem_id() {
        return item_id;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getCategory() { return category; }

    public void setCategory(String category) {
        this.category = category;
    }

}
