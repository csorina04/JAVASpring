package JAVASpring.JAVASpring.service;

import JAVASpring.JAVASpring.Eveniment;
import JAVASpring.JAVASpring.model.CalendarNotFound;

import java.util.Calendar;
import java.util.HashMap;

public interface CalendarServiceInterface {
    void createCalendar(Calendar calendar);
    HashMap<Calendar, Eveniment> getMapCalendar(Integer calendarId) throws CalendarNotFound;
}
