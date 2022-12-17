package com.example.newsapppractice.Models;

import java.io.Serializable;

public class Source implements Serializable {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String id = "";
    String name = "";
}
