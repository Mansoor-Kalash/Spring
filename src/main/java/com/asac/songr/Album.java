package com.asac.songr;

public class Album {
    private String title;
    private String artist;
    private String songCount;
    private int length;
    private String imageUrl;

    public Album(String title, String artist, String songCount, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }
}
