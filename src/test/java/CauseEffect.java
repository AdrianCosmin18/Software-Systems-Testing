import org.example.Task;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CauseEffect {
    private static final String YES = "DA";
    private static final String NO = "NU";
    private static final String ERROR = "Numar invalid";

    @Test
    void testInvalidLowerBoundary() {
        // C1 = 0; C2 = 0 -> E1
        assertEquals(Task.minMaxDigitSubtraction(4999), ERROR);
    }

    @Test
    void validNumberAndValidRule() {
        // C1 = 1; C2 = 1 -> E2
        assertEquals(Task.minMaxDigitSubtraction(67883), YES);
    }

    @Test
    void testValidNumberAndInValidRule() {
        // C1 = 1; C2 = 0 -> E3
        assertEquals(Task.minMaxDigitSubtraction(5442), NO);
    }
}
