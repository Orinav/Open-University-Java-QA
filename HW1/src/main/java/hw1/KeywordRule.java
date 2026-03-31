package hw1;

import java.util.Set;

public class KeywordRule implements IdentifierRule
{
    private static final Set<String> KEYWORDS = Set.of(
            "class","public","static","void","int"
    );

    @Override
    public boolean check(String name)
    {
        if (name == null)
            return true;

        if (KEYWORDS.contains(name))
            return false;
        else
            return true;
    }
}