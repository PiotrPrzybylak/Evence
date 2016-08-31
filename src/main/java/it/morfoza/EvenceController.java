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
                               @RequestParam(value = "date", required = false) String date,
                               @RequestParam(value = "price", required = false) String price, Model model) throws EmptyCityFormException {

            Event event = new Event("Sala Dance", "Warszawa", "22.09", 120.,"salsa");

        model.addAttribute("");



      /*  if (!eventRepository.cityFormIsEmpty(city)) {
            String error = encode("Wpisz nazwę miasta!");
            return "redirect:/admin?error= " + error;
        }



            return "result";
}
}
