package com.LibraryMusicManagementSystem;

import java.util.*;

public class SongLibrary {
    List<Song> songList = new ArrayList<>();

    public void addSong(String title, String artist, String duration) {
        Song songs = new Song(title, artist, duration);
        songList.add(songs);
        System.out.println("The song " + title + " successfully added");
    }
}
