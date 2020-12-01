package JAVASpring.JAVASpring.calendar;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calendar implements Serializable {


    String nume;
    String descriere;
    int calendarId;
    private static int counter;

    public Calendar(String calendarInfo) {
        generateID();
        Pattern pattern = Pattern.compile("(.*?);(.*?)");
        Matcher matcher = pattern.matcher(calendarInfo);

        if (matcher.find()) {
            this.nume = matcher.group(1);
            this.descriere = matcher.group(2);

        }

    }


    public void generateID() {
        this.calendarId = counter;
        counter++;

    }

    public Calendar(String nume, String descriere, int calendarId) {
        this.nume = nume;
        this.descriere = descriere;
        this.calendarId = calendarId;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public int getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(int calendarId) {
        this.calendarId = calendarId;
    }

    public Calendar() {

    }


}
