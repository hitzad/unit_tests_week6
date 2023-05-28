package ch.zhaw.iwi.devops.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EinkaufsController {

    @GetMapping("/einkaufen")
    public String einkaufen() {
        return "Einkaufs app is up and running!";
    }
}
