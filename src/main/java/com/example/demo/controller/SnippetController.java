package com.example.demo.controller;

import com.example.demo.model.Snippet;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SnippetController {

    public SnippetController(){
        System.out.println("asdasda");
    }
    @GetMapping(value = "/snippet", produces = "application/json")
    public @ResponseBody Long createSnippet(){
        return 0L;
    }

    public boolean deleteSnippet(Long snippetId){
        return false;
    }

}
