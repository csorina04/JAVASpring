package JAVASpring.JAVASpring.service;

import JAVASpring.JAVASpring.Eveniment;
import JAVASpring.JAVASpring.model.CalendarNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

@Service
public class CalendarService implements CalendarServiceInterface {

    List<Eveniment> listaEvenimente = new ArrayList<>();
    private int counter;
    private int calendarId;


    @Autowired
    public CalendarRepository calendarRepository;
    HashMap<Calendar, Eveniment> mapCalendar = new HashMap<>();


    public void generateCalendarId() {
        this.calendarId = counter;
        counter++;
    }


    public void createCalendar(Calendar calendar) {
       calendarRepository.save(calendar);
    }


    @Override
    public HashMap<Calendar, Eveniment> getMapCalendar(Integer calendarId) throws CalendarNotFound {
        return null;
    }

    public List<Eveniment> getListaEvenimente(Integer evenimentId) throws CalendarNotFound {
        return calendarRepository.findAll();
    }
}

