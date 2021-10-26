package com.asac.songr;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/hello")
        @ResponseBody
    public String helloworld (){
return "helloworld";

    }
        @GetMapping("/capitalize/{word}")
        @ResponseBody
        public String capitalize (@PathVariable String word){


                return  word.toUpperCase();

        }

    @GetMapping("/albums")

    public String listAlbum(Model model) {
        Album album1 = new Album("Tammally Maak","Amr Diab",10,235,"https://upload.wikimedia.org/wikipedia/en/e/e0/Tamally-maak.jpg");
        Album album2 = new Album("Ahla W Ahla","Amr Diab",11,321,"https://nayformedia.com/wp-content/uploads/2019/02/Ahla-W-Ahla-2016.jpg");
        Album albums[] = {album1,album2};

        model.addAttribute("albums", albums);
        return "album";
    }
        @GetMapping("/")

    public String albums (){

return "home";


        }
        }

