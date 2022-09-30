package com.company.core;


public class Artist {
    private Long artistId;
    private String name;
    private String surname;

    public Artist(Long artistId, String name, String surname) {
        this.artistId = artistId;
        this.name = name;
        this.surname = surname;
    }

    public Long getArtistId() {
        return artistId;
    }

    public void setArtistId(Long artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistId=" + artistId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
