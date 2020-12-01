package JAVASpring.JAVASpring;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Entity(name = "evenimente")
public class Eveniment implements Serializable {

    public Integer Id;
    private String nume;
    private String descriere;
    private String calendarId;
    private String uuid;


    public Eveniment(String evenimentInfo) {

        Pattern pattern = Pattern.compile("(.*?);(.*?)");
        Matcher matcher = pattern.matcher(evenimentInfo);

        if (matcher.find()) {
            this.nume = matcher.group(1);
            this.descriere = matcher.group(2);

        }
    }


    public void generateUUID() {
        this.uuid = String.format("%040d", new BigInteger(UUID.randomUUID().toString().replace("-", ""), 4));
    }

    public String getNume() {
        return nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public String getCalendarId() {
        return calendarId;
    }

    public String getUuid() {
        return uuid;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }
}
