
package com.asac.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public  class AlbumController {
    @Autowired
    AlbumRepository albumRepository;
    @Autowired
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
@GetMapping("/songsOfAlbum/{albumId}")
public String getSonsOfAlbum (@PathVariable Long albumId,Model model){
//    Album songsOfAlbum = new Album();
    Album songsOfAlbum=albumRepository.findById(albumId).orElseThrow();
//    System.out.println(songsOfAlbum.songList.get(1));
//    =(List<Song>) songRepository.findById(albumId).orElseThrow();
model.addAttribute("songsOfAlbum", songsOfAlbum.songList);
    return "song";
}

    @PostMapping( "/addsongs/{albumId}")
    public RedirectView addSongToAlbum(@PathVariable Long albumId,
                                    @RequestParam String title,
                                    @RequestParam int length,
                                    @RequestParam int trackNumber) {
        System.out.println("albumIdeeee"+albumId+"titleeeeee"+title+"length"+length+"trackNumber"+trackNumber);
        Song newSong = new Song(title, length, trackNumber);
        newSong.album = albumRepository.findById(albumId).orElseThrow();
        newSong.album.songList.add(newSong);
        songRepository.save(newSong);
        albumRepository.save(newSong.album);

        return new RedirectView("/songs");
    }
}