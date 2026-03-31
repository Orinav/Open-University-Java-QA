package hw1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AllowedCharactersRuleTest
{
    @Test
    void validAllowedCharacters()
    {
        AllowedCharactersRule rule = new AllowedCharactersRule();
        assertTrue(rule.check("a3b56__"));
    }

    @Test
    void validAllowedCharactersByEmptyString()  //Vacuous truth
    {
        AllowedCharactersRule rule = new AllowedCharactersRule();
        assertTrue(rule.check(""));
    }

    @Test
    void invalidAllowedCharactersByNonLetterDigitUnderscore()
    {
        AllowedCharactersRule rule = new AllowedCharactersRule();
        assertFalse(rule.check("a3b56__-"));
    }

    @Test
    void invalidAllowedCharactersByNull()
    {
        AllowedCharactersRule rule = new AllowedCharactersRule();
        assertFalse(rule.check(null));
    }



}
