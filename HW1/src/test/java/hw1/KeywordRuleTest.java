package hw1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KeywordRuleTest
{
    @Test
    void invalidKeyword()
    {
        KeywordRule rule = new KeywordRule();
        assertFalse(rule.check("class"));
    }

    @Test
    void validKeyword()
    {
        KeywordRule rule = new KeywordRule();
        assertTrue(rule.check("abc"));
    }

    @Test
    void validKeywordByCapitalLetter()
    {
        KeywordRule rule = new KeywordRule();
        assertTrue(rule.check("Class"));
    }

    @Test
    void validKeywordByNull()
    {
        KeywordRule rule = new KeywordRule();
        assertTrue(rule.check(null));
    }
}
