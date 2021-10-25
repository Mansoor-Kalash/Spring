package com.asac.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public  class AlbumController {
    @Autowired
    AlbumRepository albumRepository;

    @PostMapping("/albumss")
//    @GetMapping("/albumss")
//@RequestMapping(value="/albumss", method= RequestMethod.POST)
    public RedirectView addAlbum(){
        Album newAlbum = new Album("ellela","amr",3,34,"https://upload.wikimedia.org/wikipedia/commons/6/66/Amr_Abdul_Baset_Diab.jpg");
        albumRepository.save(newAlbum);
        return new RedirectView("/allalbums");
    }
    @GetMapping("/allalbums")
    public String getAllAlbums(Model model){
        ArrayList<Album> albums = (ArrayList<Album>) albumRepository.findAll();
        model.addAttribute("albums", albums);
        return "album";
    }
}
