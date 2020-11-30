package JAVASpring.JAVASpring;


import JAVASpring.JAVASpring.model.EvenimentNotFound;
import JAVASpring.JAVASpring.service.EvenimentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/calendar")
public class EvenimentController {


    EvenimentService evenimentService;
    Eveniment eveniment;

    @GetMapping
    public List<Eveniment> getEvenimente(@RequestParam(required = false) Integer evenimentId) throws EvenimentNotFound {
        return evenimentService.getListaEvenimente(evenimentId);
    }


    @PostMapping
    public void createEveniment (@RequestBody Eveniment eveniment){
        evenimentService.createEveniment(eveniment);

    }
    public boolean checkIfEvenimentExists(){
        if (eveniment.getUuid().equals(this.eveniment.getUuid()))
        System.out.println("Evenimentul exista deja ! ");
        return false;

    }


}
