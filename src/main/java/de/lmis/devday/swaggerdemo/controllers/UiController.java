package de.lmis.devday.swaggerdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UiController {

    @RequestMapping(value = "/ui")
    public String index() {
        return "redirect:swagger-ui.html";
    }
}
