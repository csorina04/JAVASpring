package JAVASpring.JAVASpring.calendar;

import JAVASpring.JAVASpring.Eveniment;
import JAVASpring.JAVASpring.model.CalendarNotFound;
import JAVASpring.JAVASpring.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class CalendarController {

    @Autowired
    CalendarService calendarService;
        @GetMapping()
   // @ApiOperation(value = "get all events description") // folosit pentru a customiza documentatia
    public List<Eveniment> getEvenimente(@RequestParam(required = false) Integer calendarId) throws CalendarNotFound {
        return (List<Eveniment>) calendarService.getMapCalendar(calendarId);
    }


    @PostMapping
    public void createCalendar(@RequestBody Calendar calendar) {
        calendarService.createCalendar(calendar);
    }


}
