package us.kpatrick;
/**
 * Spear class to add the character
 *
 * @author kpatrick
 * @version 1.00
 */
public class Spear extends CharacterDecorator {
    /**
     * Class Constructor - Does some stuff
     * @param tempCharacter Character thing
     */
    public Spear(Character tempCharacter) {
        super(tempCharacter);
    }

    /**
     * get the name/action of the character
     * @return name and action as string
     */
    public String getName() {
        return tempCharacter.getName() + " The Spear Thrower";
    }

    /**
     * get and increase health of character
     * @return health as double
     */
    public double getHealth() {
        return tempCharacter.getHealth() + 5;
    }
}
