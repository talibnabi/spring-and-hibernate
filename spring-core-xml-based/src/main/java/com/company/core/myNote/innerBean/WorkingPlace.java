package com.company.core.myNote.innerBean;

public class WorkingPlace {
    private String locationName;

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @Override
    public String toString() {
        return "WorkingPlace{" +
                "locationName='" + locationName + '\'' +
                '}';
    }
}
