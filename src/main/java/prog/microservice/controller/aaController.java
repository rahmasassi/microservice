package prog.microservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/aa")
@RequiredArgsConstructor
public class aaController {
    
        @GetMapping("/")
        public String hello() {
            return "hi sassi";
        }

}



