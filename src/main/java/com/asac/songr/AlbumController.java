
package com.asac.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public  class AlbumController {
    @Autowired
    AlbumRepository albumRepository;
    SongRepository songRepository;


    @GetMapping("/allalbums")
    public String addAlbum(Model model) {
        model.addAttribute("albums", albumRepository.findAll());

        return "album";
    }


    @PostMapping("/addalbum")
    public RedirectView getAllAlbums(@RequestParam(value = "title") String title, @RequestParam(value = "artist") String artist, @RequestParam(value = "songCount") int songCount, @RequestParam(value = "length") int length, @RequestParam(value = "imageUrl") String imageUrl) {
        Album album = new Album(title, artist, songCount, length, imageUrl);

        albumRepository.save(album);
        return new RedirectView("/allalbums");
    }

    @PostMapping( "/albums/{albumId}/songs")
    public RedirectView addDinosaur(@PathVariable Long albumId,
                                    @RequestParam String title,
                                    @RequestParam int length,
                                    @RequestParam int trackNumber) {
        Song newSong = new Song(title, length, trackNumber);
        newSong.album = albumRepository.findById(albumId).get();
        songRepository.save(newSong);
        return new RedirectView("/allalbums");
    }
}