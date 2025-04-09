package com.govuln.beans;

import org.apache.commons.beanutils.PropertyUtils;

final public class Cat {
    private String name = "catalina";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String []args) throws Exception {
        Cat cat = new Cat();
        System.out.println(PropertyUtils.getProperty(cat, "name"));
    }
}
