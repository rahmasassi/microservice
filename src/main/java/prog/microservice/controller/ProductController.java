package prog.microservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    @SpringBootApplication
    @RestController
    public class HelloWorldApplication {
        @GetMapping("/")
        public String hello() {
            return "Hello rahma";
        }
    }
    }



