package com.company.core.courseNote;

public class Instrument {
    private long id;
    private String instrumentName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }


    @Override
    public String toString() {
        return "Instrument{" +
                "id=" + id +
                ", name='" + instrumentName + '\'' +
                '}';
    }
}
