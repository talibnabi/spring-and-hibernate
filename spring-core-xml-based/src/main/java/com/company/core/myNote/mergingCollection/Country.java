package com.company.core.myNote.mergingCollection;

import java.util.Properties;

public abstract class Country {
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Country{" +
                "properties=" + properties +
                '}';
    }
}
