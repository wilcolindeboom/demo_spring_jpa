package nl.eshuis.demo_spring_jpa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public ResponseEntity sayHello() {
      //  return "order overzicht";
        return new ResponseEntity("Hello from wilco's application", HttpStatus.OK);
    }


}
