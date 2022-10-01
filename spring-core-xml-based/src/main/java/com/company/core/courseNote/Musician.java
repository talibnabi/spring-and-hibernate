package com.company.core.courseNote;

public class Musician {
    private String musicianName;
    private Instrument instrument;

    public String getMusicianName() {
        return musicianName;
    }

    public void setMusicianName(String name) {
        this.musicianName = name;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Musician{" +
                "name='" + musicianName + '\'' +
                ", instrument=" + instrument +
                '}';
    }
}
