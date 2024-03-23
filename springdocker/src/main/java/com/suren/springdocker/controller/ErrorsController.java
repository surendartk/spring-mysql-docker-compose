package com.suren.springdocker.controller;

import com.suren.springdocker.entity.Errors;
import com.suren.springdocker.service.ErrorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ErrorsController {

    @Autowired
    private ErrorsService errorsService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("error", new Errors());
        return "home";
    }

    @PostMapping("/save")
    public String saveError(Errors error, Model model) {
        try {
            errorsService.saveError(error);
            return "redirect:/";
        } catch (Exception e) {
            model.addAttribute("errorMessage", "Description too long. Please shorten the description.");
            return "home";
        }
    }

    @GetMapping("/view")
    public String viewErrors(Model model) {
        List<Errors> errorsList = errorsService.getAllErrors();
        model.addAttribute("errors", errorsList);
        return "view";
    }

    @PostMapping("/delete/{id}")
    public String deleteError(@PathVariable Long id) {
        errorsService.deleteErrorById(id);
        return "redirect:/view";
    }
}
