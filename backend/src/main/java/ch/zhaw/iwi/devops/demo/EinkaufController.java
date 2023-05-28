package ch.zhaw.iwi.devops.demo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EinkaufController {

    private Map<Integer, Einkauf> einkauf = new HashMap<Integer, Einkauf>();

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        this.einkauf.put(1,new Einkauf(1, "Lasagne", "Fertig-Lasagne von Findus"));
        this.einkauf.put(2,new Einkauf(2, "Aubergine", "Bio-Aubergine aus der Schweiz"));
        this.einkauf.put(3,new Einkauf(3, "Zahnpasta", "Candida supersoft im Aktionspaket"));
        System.out.println("Init Data");
    }

    @GetMapping("/einkaufen")
    public String test() {
        return "Einkaufen app is up and running!";
    }

    @GetMapping("/einkaufen/{id}")
    public Einkauf getEinkauf(@PathVariable Integer id) {
        return this.einkauf.get(id);
    }

    @PostMapping("/einkaufen")
    public void createEinkauf(@RequestBody Einkauf einkauf) {
        var newId = this.einkauf.keySet().stream().max(Comparator.naturalOrder()).orElse(0) + 1;
        einkauf.setId(newId);
        this.einkauf.put(newId, einkauf);
    }

    @PutMapping("/einkaufen/{id}")
    public void createEinkauf(@PathVariable Integer id, @RequestBody Einkauf einkauf) {
        einkauf.setId(id);
        this.einkauf.put(id, einkauf);
    }

    @DeleteMapping("/einkaufen/{key}")
    public Einkauf deleteEinkauf(@PathVariable Integer id) {
        return this.einkauf.remove(id);
    }
}
