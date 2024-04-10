import org.example.com.Animale.Animal;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestareVarsta {
    @Test
            void testareVirsta()
    {
        Animal animal = new Animal("ani",6, LocalDate.of(2021,10,4));
        assertEquals(animal.varsta(),3);
    }
    @Test
    void testareVirsta2()
    {
        Animal animal = new Animal("ani",9, LocalDate.of(2023,4,4));
        assertEquals(animal.varsta(),1);
    }
}
