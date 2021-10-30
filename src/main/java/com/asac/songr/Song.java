package com.asac.songr;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer length;
    private Integer trackNumber;
//    private Long albumId;
    @ManyToOne
    @JoinColumn(name = "album_id")
     Album album;

    public Song(){
    }

    public Song( String title, Integer length, Integer trackNumber) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
//        this.albumId=albumId;
    }

    public Song(String title, Integer length, Integer trackNumber, Album album) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.album = album;
    }
//        public Long getAlbumId() {
//        return albumId;
//    }
//
//    public void setAlbumId(Long albumId) {
//        this.albumId = albumId;
//    }

    public Long getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Album getAlbum() {
        return album;
    }
//
    public void setAlbum(Album album) {
        this.album = album;
    }
//    public void addAlbumToSong (Album album){
//
//    }
    public void addAlbumToSong (Album album){
        this.album = album;
    }
}
