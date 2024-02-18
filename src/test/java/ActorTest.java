import models.Actor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ActorTest {
    @Test
    void shouldCalculateCorrectSalary(){
        Actor actor = new Actor("Brad", "Pitt");
        int expectedSalary = 30000;
        int actual = actor.calculateSalary(3, 10000);

        assertThat(expectedSalary).isEqualTo(actual);
        System.out.println("salary is perfect");
    }
}
