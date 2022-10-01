package com.company.core.myNote.innerBean;

public class Person {
    private WorkingPlace workingPlace;

    public WorkingPlace getWorkingPlace() {
        return workingPlace;
    }

    public void setWorkingPlace(WorkingPlace workingPlace) {
        this.workingPlace = workingPlace;
    }

    @Override
    public String toString() {
        return "Person{" +
                "workingPlace=" + workingPlace +
                '}';
    }
}
