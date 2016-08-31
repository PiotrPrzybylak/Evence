import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EvenceController {
    private EventsRepository eventsRepository;

    @RequestMapping("/")

    public String findEvent(Model model) {
        model.addAttribute("events", eventsRepository.getAllEvents());
        return "formularz";
    }

    @RequestMapping("/wynikiWyszukiwania")
    public String dodajProdukt(@RequestParam(value = "dance", required = true) String dance,
                               @RequestParam(value = "city", required = true) String city,
                               @RequestParam(value = "price", required = true) String price, Model model) {

        return "wynikiWyszukiwania";
    }
}

