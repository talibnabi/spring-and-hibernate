package com.company.core.multilocations;

public class Artist {
    private Instrument instrument;

    public Artist(Instrument instrument) {
        this.instrument = instrument;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "instrument=" + instrument +
                '}';
    }
}
