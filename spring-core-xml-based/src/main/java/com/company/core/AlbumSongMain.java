package com.company.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AlbumSongMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-album.xml","applicationContext-song.xml");
        Album album = context.getBean(Album.class);
        Song song = context.getBean(Song.class);
        System.out.println(album);
        System.out.println(song);
    }
}
