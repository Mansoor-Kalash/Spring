package com.asac.songr;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Struct;
//import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/hello")
        @ResponseBody
    public String helloworld (){
return "hhhhhhh";

    }
        @GetMapping("/capitalize/{word}")
        @ResponseBody
        public String capitalize (@PathVariable String word){


                return  word.toUpperCase();

        }
        @GetMapping("/albums")
        @ResponseBody
    public String albums (){

Album album1 = new Album("Tammally Maak","Amr Diab",280,"")
    }
        }

