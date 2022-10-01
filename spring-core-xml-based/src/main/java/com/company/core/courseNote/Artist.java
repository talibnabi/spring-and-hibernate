package com.company.core.courseNote;

public class Artist {
    private long artistId;
    private String artistFirstName;
    private String artistLastName;

    public long getArtistId() {
        return artistId;
    }

    public void setArtistId(long artistId) {
        this.artistId = artistId;
    }

    public String getArtistFirstName() {
        return artistFirstName;
    }

    public void setArtistFirstName(String artistFirstName) {
        this.artistFirstName = artistFirstName;
    }

    public String getArtistLastName() {
        return artistLastName;
    }

    public void setArtistLastName(String artistLastName) {
        this.artistLastName = artistLastName;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistId=" + artistId +
                ", artistFirstName='" + artistFirstName + '\'' +
                ", artistLastName='" + artistLastName + '\'' +
                '}';
    }
}
