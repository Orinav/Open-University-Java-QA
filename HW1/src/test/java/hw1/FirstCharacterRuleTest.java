package hw1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FirstCharacterRuleTest
{
    @Test
    void validFirstCharacterByLetter()
    {
        FirstCharacterRule rule = new FirstCharacterRule();
        assertTrue(rule.check("abc"));
    }

    @Test
    void validFirstCharacterByUnderscore()
    {
        FirstCharacterRule rule = new FirstCharacterRule();
        assertTrue(rule.check("_abc"));
    }

    @Test
    void invalidFirstCharacterByDigit()
    {
        FirstCharacterRule rule = new FirstCharacterRule();
        assertFalse(rule.check("3bc"));
    }

    @Test
    void invalidFirstCharacterByEmptyString()
    {
        FirstCharacterRule rule = new FirstCharacterRule();
        assertFalse(rule.check(""));
    }

    @Test
    void invalidFirstCharacterByNull()
    {
        FirstCharacterRule rule = new FirstCharacterRule();
        assertFalse(rule.check(null));
    }


}