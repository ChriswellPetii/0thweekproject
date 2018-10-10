package com.greenfoxacademy.weekproject.controllers;

import com.greenfoxacademy.weekproject.dtos.InputJSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String openMainPage() {
        return "main";
    }

    @PostMapping("/post")
    public String saveEntries(InputJSON inputJSON) {
        return "redirect:/";
    }

    @GetMapping("/list-entries")
    public String showEntries(Model model) {
        return "entrylist";
    }
}
