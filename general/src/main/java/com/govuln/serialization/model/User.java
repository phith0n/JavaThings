package com.govuln.serialization.model;

import java.io.Serializable;

public class User implements Serializable {
    protected String name;
    protected User parent;

    public User(String name)
    {
        this.name = name;
    }

    public void setParent(User parent)
    {
        this.parent = parent;
    }
}
