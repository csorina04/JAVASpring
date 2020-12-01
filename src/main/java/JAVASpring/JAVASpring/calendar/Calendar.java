package JAVASpring.JAVASpring.calendar;

import JAVASpring.JAVASpring.Eveniment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Entity(name = "calendar")
public class Calendar {

    String nume;
    String descriere;


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int calendarId;

    private static int counter;

    @OneToMany(mappedBy = "Calendar")
    private Set<Eveniment> mapare= new HashSet<>();


    public Calendar(String calendarInfo) {
        //generateID();
        Pattern pattern = Pattern.compile("(.*?);(.*?)");
        Matcher matcher = pattern.matcher(calendarInfo);

        if (matcher.find()) {
            this.nume = matcher.group(1);
            this.descriere = matcher.group(2);

        }

    }

/*
    public void generateID() {
        this.calendarId = counter;
        counter++;

    }

 */

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calendar calendar = (Calendar) o;
        return calendarId == calendar.calendarId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(calendarId);
    }
}
