package com.company.core.course;

public class Song {
    private String songName;
    private String song;

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", song='" + song + '\'' +
                '}';
    }
}
