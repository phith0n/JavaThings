package com.govuln.serialization.model;

import java.io.Serializable;

public class Card implements Serializable {
    public Integer value;

    public Card()
    {
        this.value = 100;
    }
}
