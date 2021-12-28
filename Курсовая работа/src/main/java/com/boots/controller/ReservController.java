package com.boots.controller;

import com.boots.entity.Reserv;
import com.boots.entity.User;
import com.boots.repository.ReservRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;

@Controller
public class ReservController {
    @Autowired
    private ReservRepository reservRepository;

    @GetMapping("/")
    public String indexR(Model model){

        Iterable<Reserv> reserves = reservRepository.findAll();
        model.addAttribute("reserves", reserves);
        return "index";
    }

    @PostMapping("/")
    public String indexAdd(@RequestParam String title, @RequestParam Date date, Model model){
        Reserv reserv = new Reserv(title, date);
        reservRepository.save(reserv);
        return "index";
    }


}