package com.asac.songr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlbumTest {

    @Test
    void getTitle() {
        Album album = new Album();
        album.setTitle("t");
        assertEquals("t",album.getTitle());
    }



    @Test
    void getArtist() {
        Album album = new Album();
        album.setArtist("t");
        assertEquals("t",album.getArtist());
    }



    @Test
    void getSongCount() {
        Album album = new Album();
        album.setSongCount(1);
        assertEquals(1,album.getSongCount());
    }



    @Test
    void getLength() {
        Album album = new Album();
        album.setLength(1);
        assertEquals(1,album.getLength());
    }


    @Test
    void getImageUrl() {
        Album album = new Album();
        album.setImageUrl("t");
        assertEquals("t",album.getImageUrl());
    }


}