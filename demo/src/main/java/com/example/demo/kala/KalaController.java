package com.example.demo.kala;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class KalaController {

@Autowired
    KalaRepository kalaRepository;
    @GetMapping("/kala")
    public String listkala(Model model){
        model.addAttribute("kala",kalaRepository.findAll());
        return "kala";
    }
    @GetMapping("/kala/new")
    public String createKalaForm(Model model){
        Kala kala=new Kala();
        model.addAttribute("kala",kala);
        return "import_kala";

    }
    @PostMapping("/kala")
    public String saveStudent(@ModelAttribute ("kala") Kala kala){

       kalaRepository.save(kala);

        return "redirect:/kala";
    }
    @GetMapping("/kala/edit/{id}")
    public String editKalaForm(@PathVariable Long id , Model model){
        model.addAttribute("kala", kalaRepository.findById(id));
        return "edite_kala";
    }

    @GetMapping("/kala/{id}")
    public String deleteKala(@PathVariable long id){
        kalaRepository.deleteById(id);
        return "redirect:/kala";
    }
}
