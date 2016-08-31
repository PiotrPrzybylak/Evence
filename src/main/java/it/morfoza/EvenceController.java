package it.morfoza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EvenceController {

    private EventRepository eventRepository;

@Autowired
    public EvenceController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @RequestMapping("/")

    public String findEvent(Model model) {
        model.addAttribute("events", eventRepository.getAllEvents());
        return "formularz";
    }

    @RequestMapping("/wynikiWyszukiwania")
    public String dodajProdukt(@RequestParam(value = "dance", required = true) String dance,
                               @RequestParam(value = "city", required = true) String city,
                               @RequestParam(value = "price", required = false) String price, Model model) {



        return "result";
    }
}

