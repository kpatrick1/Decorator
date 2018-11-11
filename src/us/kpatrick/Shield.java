package us.kpatrick;
/**
 * Shield class to add to the character
 *
 * @author kpatrick
 * @version 1.00
 */
public class Shield extends CharacterDecorator {
    /**
     * Class Constructor - Does some stuff
     * @param tempCharacter
     */
    public Shield(Character tempCharacter) {
        super(tempCharacter);
    }

    /**
     * get the name/action of the character
     * @return name and action as string
     */
    public String getName() {
        return tempCharacter.getName() + " The Shield Blocked";
    }
    /**
     * get and increase health of character
     * @return health as double
     */
    public double getHealth() {
        return tempCharacter.getHealth() + 3;
    }

}
