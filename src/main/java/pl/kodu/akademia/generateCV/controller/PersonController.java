package pl.kodu.akademia.generateCV.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.kodu.akademia.generateCV.model.Person;

@Controller
public class PersonController {

    @GetMapping("/")
    public String showForm(ModelMap modelMap){

        modelMap.addAttribute("person", new Person());

        return "homePage";
    }
}
