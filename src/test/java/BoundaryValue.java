import org.example.Task;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoundaryValue {
    private static final String YES = "DA";
    private static final String NO = "NU";
    private static final String ERROR = "Numar invalid";

    @Test
    void highestNumberBelowBoundary() {assertEquals(Task.minMaxDigitSubtraction(4999), ERROR);}

    @Test
    void firstNumberInsideBoundary() {assertEquals(Task.minMaxDigitSubtraction(5000), NO);}

    @Test
    void lastNumberInsideBoundary() {assertEquals(Task.minMaxDigitSubtraction(99999), NO);}

    @Test
    void lowestNumberAboveBoundary() {assertEquals(Task.minMaxDigitSubtraction(100000), ERROR);}

    @Test
    void validParticularValidCase() {assertEquals(Task.minMaxDigitSubtraction(5441), YES);}
}
