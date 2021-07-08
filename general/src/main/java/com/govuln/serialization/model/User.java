package com.govuln.serialization.model;

import java.io.Serializable;

public class User implements Serializable {
    protected String name;
    protected Card card;

    public User()
    {
        this.name = "Bob";
        this.card = new Card();
    }

}
