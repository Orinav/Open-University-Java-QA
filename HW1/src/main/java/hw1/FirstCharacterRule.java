package hw1;

public class FirstCharacterRule implements IdentifierRule
{

    @Override
    public boolean check(String name)
    {
        if (name == null || name.isEmpty())
            return false;

        char firstCharacter = name.charAt(0);

        if (Character.isLetter(firstCharacter) || firstCharacter == '_')
            return true;
        else
            return false;
    }
}