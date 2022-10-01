package com.company.core.course;

import com.company.core.course.Album;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AlbumSongMain {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-album.xml","applicationContext-song.xml");
//        Album album = context.getBean(Album.class);
//        Song song = context.getBean(Song.class);
//        System.out.println(album);
//        System.out.println(song);
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Spring-Courses\\spring-and-hibernate-for-beginners\\spring-core-xml-based\\src\\main\\resources\\applicationContext-album.xml");
        Album album = context.getBean(Album.class);
        System.out.println(album);
    }
}
