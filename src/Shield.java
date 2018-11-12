/**
 * Class model for a "shield" decorator
 * @author Jared Mallas
 * @version 1.0
 */
public class Shield extends CharacterDecorator
{

    public Shield(Character tempCharacter) { super(tempCharacter); }

    /**
     * Override of get name appending "The Shield Bearer" to name
     * @return String representation of the current name with title appended
     */
    public String getName()
    {
        String rString = tempCharacter.getName() + " The Shield Bearer";
        return rString;
    }
}
