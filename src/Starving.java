/**
 * Class model for a Starving decorator
 * @author Jared Mallas
 * @version 1.0
 */
public class Starving extends CharacterDecorator
{
    public Starving(Character tempCharacter) { super(tempCharacter); }

    /**
     * Override of getHealth subtracting 5
     * @return current health -5
     */
    public double getHealth()
    {
        return tempCharacter.getHealth() - 5;
    }
}
