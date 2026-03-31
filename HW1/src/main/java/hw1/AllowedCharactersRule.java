package hw1;

public class AllowedCharactersRule implements IdentifierRule
{

    @Override
    public boolean check(String name)
    {
        if (name == null)
            return false;

        for (int i = 0; i < name.length(); i++)
        {
            char currentCharacter = name.charAt(i);
            if (!Character.isLetter(currentCharacter) && !Character.isDigit(currentCharacter) && currentCharacter != '_')
                return false;
        }

        return true;
    }
}