package JAVASpring.JAVASpring.service;

import JAVASpring.JAVASpring.Eveniment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarRepository extends JpaRepository<Eveniment,Integer> {

}
