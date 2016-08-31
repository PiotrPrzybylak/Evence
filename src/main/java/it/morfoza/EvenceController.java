package it.morfoza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static jdk.internal.dynalink.support.NameCodec.encode;

@Controller
public class EvenceController {

    private EventRepository eventRepository;
    private HardcodedEvenceAdvisor hardcodedEvenceAdvisor;

    @Autowired
    public EvenceController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @RequestMapping("/")

    public String getAllEvents(Model model) {
        model.addAttribute("events", eventRepository.getAllEvents());
        return "formularz";
    }

    @RequestMapping("/wynikiWyszukiwania")
    public String getEvent(@RequestParam(value = "dance") String dance,
                           @RequestParam(value = "city", required = false) String city,
                           @RequestParam(value = "date", required = false) String date,
                           @RequestParam(value = "price", required = false) String price, Model model) throws EmptyCityFormException {

//Event event = new Event("Sala Dance", "Warszawa", "22.09", 120.,"salsa");
        model.addAttribute("event", hardcodedEvenceAdvisor.getEvent(dance));
        model.addAttribute("dance", dance);
        model.addAttribute("city", city);
        model.addAttribute("date", date);


        if (eventRepository.danceFormIsEmpty(dance)) {
            String error = encode("Wpisz styl tańca!");
            return "redirect:/admin?error= " + error;
        }
        return"wynikiWyszukiwania";
    }




}
