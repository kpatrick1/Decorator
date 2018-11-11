package us.kpatrick;
/**
 * Sword Class to add to Character
 *
 * @author kpatrick
 * @version 1.00
 */
public class Sword extends CharacterDecorator {
    /**
     * Class Constructor - Does some stuff
     * @param tempCharacter Character thing
     */
    public Sword(Character tempCharacter) {
        super(tempCharacter);
    }
    /**
     * get the name/action of the character
     * @return name and action as string
     */
    public String getName() {
        return tempCharacter.getName() + " The Sword Handler";
    }
    /**
     * get and increase health of character
     * @return health as double
     */
    public double getHealth() {
        return tempCharacter.getHealth() + 10;
    }
}
