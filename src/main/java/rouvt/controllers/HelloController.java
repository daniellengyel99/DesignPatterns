package rouvt.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hello", method = RequestMethod.GET)
public class HelloController {

    @PostMapping("")
    public String index() {

        return "Greetings from Spring Boot!";

    }

}
