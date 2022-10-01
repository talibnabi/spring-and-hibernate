package com.company.core.myNote.handlingJavaCollections;

import java.util.Properties;

public abstract class Person {
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person{" +
                "properties=" + properties +
                '}';
    }
}
