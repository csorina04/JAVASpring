package JAVASpring.JAVASpring.service;

import JAVASpring.JAVASpring.Eveniment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EvenimentService implements EvenimentServiceInterface {

    List<Eveniment> listaEvenimente = new ArrayList<>();

    @Autowired
    public EvenimenteRepository evenimenteRepository;

    @Override
    public void createEveniment(Eveniment eveniment) {
        eveniment.generateUUID();
        evenimenteRepository.save(eveniment);

    }


    public List<Eveniment> genericEvents() {
        List<Eveniment> calendar = new ArrayList<>();
        calendar.add(new Eveniment("Craciun;in familie;25/12/2020"));
        return calendar;

    }

    @Override
    public List<Eveniment> getListaEvenimente(Integer evenimentId) {
        if (listaEvenimente.isEmpty()) {
            listaEvenimente.addAll(genericEvents());
        }
        if (evenimentId == null) {
            return listaEvenimente;
        } else {
            return listaEvenimente.stream().filter(e ->
                    e.getId() == evenimentId
            ).collect(Collectors.toList());
        }


    }
}

