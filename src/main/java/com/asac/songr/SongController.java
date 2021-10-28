package com.asac.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository;
    @GetMapping("/songs")
    public String index(Model m) {

        m.addAttribute("songs", songRepository.findAll());
        return "song";
    }
//    @PostMapping("/addsongs")
//    public RedirectView create(
//            @RequestParam String title,
//            @RequestParam int length,
//            @RequestParam int trackNumber) {
//        Song newDino = new Song(title, length, trackNumber);
//        songRepository.save(newDino);
//        return new RedirectView("/songs");
//    }
}
