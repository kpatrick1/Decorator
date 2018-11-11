package us.kpatrick;
/**
 * Character Decorator Class does some stuff
 *
 * @author kpatrick
 * @version 1.00
 */
public abstract class CharacterDecorator implements Character{
    protected Character tempCharacter;

    /**
     * Class Constructor - Does some stuff
     * @param tempCharacter
     */
    public CharacterDecorator(Character tempCharacter) {
        this.tempCharacter = tempCharacter;
    }

    /**
     * get the name of the character
     * @return name of character as string
     */
    public String getName() {
        return tempCharacter.getName();
    }

    /**
     * get the health of the Character
     * @return health of character as double
     */
    public double getHealth() {
        return tempCharacter.getHealth();
    }

}
