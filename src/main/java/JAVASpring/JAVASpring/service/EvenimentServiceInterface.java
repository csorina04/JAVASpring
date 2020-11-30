package JAVASpring.JAVASpring.service;

import JAVASpring.JAVASpring.Eveniment;
import JAVASpring.JAVASpring.model.EvenimentNotFound;

import java.util.List;

public interface EvenimentServiceInterface {
    void createEveniment(Eveniment eveniment);

    List<Eveniment> getListaEvenimente(Integer evenimentId) throws EvenimentNotFound;
}
