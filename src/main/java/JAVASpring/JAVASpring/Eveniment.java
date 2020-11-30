package JAVASpring.JAVASpring;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.UUID;


@Entity(name = "evenimente")
public class Eveniment implements Serializable {

    public Integer Id;
    private String nume;
    private String descriere;
    private String calendarId;
    private String uuid;


    public Eveniment(String evenimentInfo) {
        generateUUID();

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
