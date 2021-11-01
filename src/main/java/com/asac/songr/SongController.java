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
    public String allSong(Model m) {

        m.addAttribute("songs", songRepository.findAll());
        return "song.html";
    }

}
