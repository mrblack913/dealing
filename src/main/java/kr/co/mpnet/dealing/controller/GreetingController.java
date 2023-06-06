package kr.co.mpnet.dealing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(defaultValue = "World", required = false, name = "name") String name,
            Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
