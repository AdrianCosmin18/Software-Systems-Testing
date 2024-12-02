import org.example.Task;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EquivalencePartitioning {
    private static final String YES = "DA";
    private static final String NO = "NU";
    private static final String ERROR = "Numar invalid";

    @Test
    void validInputAndValidRule() {assertEquals(Task.minMaxDigitSubtraction(67883), YES);}

    @Test
    void validInputAndInvalidRule() {assertEquals(Task.minMaxDigitSubtraction(67884), NO);}

    @Test
    void invalidLowerInput() {assertEquals(Task.minMaxDigitSubtraction(4999), ERROR);}

    @Test
    void invalidHigherInput() {assertEquals(Task.minMaxDigitSubtraction(100000), ERROR);}
}
