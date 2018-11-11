package us.kpatrick;
/**
 * Starving class to add the character
 *
 * @author kpatrick
 * @version 1.00
 */
public class Starving extends CharacterDecorator {
    /**
     * Class Constructor - Does some stuff
     * @param tempCharacter Character thing
     */
    public Starving(Character tempCharacter) {
        super(tempCharacter);
    }
    /**
     * get the name/action of the character
     * @return name and action as string
     */
    public String getName() {
        return tempCharacter.getName() + " The Character is Getting Hungry";
    }
    /**
     * get and increase health of character
     * @return health as double
     */
    public double getHealth() {
        return tempCharacter.getHealth() - 5;
    }
}
